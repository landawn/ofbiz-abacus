/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.query.condition.Condition;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.SecurityGroupPermissionDao;
import com.landawn.ofbiz.dao.UserLoginSecurityGroupDao;

/**
 * Ports OFBiz's {@code security.hasEntityPermission(...)} check used by
 * {@code workEffortGenericPermission} (and every other {@code <permission-service>} declaration).
 *
 * <p>Mirrors {@code framework/common/.../CommonPermissionServices.groovy#genericBasePermissionCheck}:
 * a user is granted {@code primary_action} (e.g. {@code WORKEFFORTMGR_CREATE}) if they belong to a
 * non-expired security group that holds either the exact permission or the {@code primary_ADMIN}
 * super-permission.
 *
 * <p>Dev convenience: when no {@code userLoginId} is supplied (HTTP body has no user context yet)
 * the call passes — until a real auth layer is wired. Pass {@code "system"} explicitly to mark a
 * trusted internal caller; it also passes without a DB hit.
 */
@Service
public class SecurityService {

    private final UserLoginSecurityGroupDao userLoginSecurityGroupDao;
    private final SecurityGroupPermissionDao securityGroupPermissionDao;

    public SecurityService(UserLoginSecurityGroupDao userLoginSecurityGroupDao,
                           SecurityGroupPermissionDao securityGroupPermissionDao) {
        this.userLoginSecurityGroupDao = userLoginSecurityGroupDao;
        this.securityGroupPermissionDao = securityGroupPermissionDao;
    }

    /**
     * Returns the active {@code userLoginId} encoded in {@code body}, looking at both
     * {@code body.userLoginId} (flat) and {@code body.userLogin.userLoginId} (OFBiz-style nested
     * map). Returns {@code null} when neither is supplied.
     */
    @SuppressWarnings("unchecked")
    public static String currentUserLoginId(Map<String, Object> body) {
        if (body == null) {
            return null;
        }
        Object direct = body.get("userLoginId");
        if (direct != null) {
            return direct.toString();
        }
        Object nested = body.get("userLogin");
        if (nested instanceof Map<?, ?> m) {
            Object id = ((Map<String, Object>) m).get("userLoginId");
            return id == null ? null : id.toString();
        }
        return null;
    }

    /**
     * Equivalent of {@code security.hasEntityPermission(primary, "_" + action, userLogin)}
     * combined with the {@code primary_ADMIN} alternative — returns true if the user holds either
     * permission via any non-expired SecurityGroup.
     */
    public boolean hasEntityPermission(String primaryPermission, String mainAction, String userLoginId)
            throws SQLException {
        if (Strings.isEmpty(userLoginId) || "system".equals(userLoginId)) {
            return true;  // dev convenience / trusted system caller
        }
        if (Strings.isEmpty(primaryPermission) || Strings.isEmpty(mainAction)) {
            return false;
        }
        Timestamp now = Timestamp.from(Instant.now());

        // 1) groups the user belongs to (filter-by-date on UserLoginSecurityGroup)
        Condition userGroupCond = Filters.and(
                Filters.eq("userLoginId", userLoginId),
                Filters.or(Filters.isNull("thruDate"), Filters.gt("thruDate", now)));
        List<String> groupIds = userLoginSecurityGroupDao.list("groupId", userGroupCond);
        if (groupIds.isEmpty()) {
            return false;
        }

        // 2) any non-expired permission row in those groups matching primary_<action> or primary_ADMIN
        String want = primaryPermission + "_" + mainAction;
        String wantAdmin = primaryPermission + "_ADMIN";
        Condition permCond = Filters.and(
                Filters.in("groupId", groupIds),
                Filters.in("permissionId", List.of(want, wantAdmin)),
                Filters.or(Filters.isNull("thruDate"), Filters.gt("thruDate", now)));
        return securityGroupPermissionDao.count(permCond) > 0;
    }
}
