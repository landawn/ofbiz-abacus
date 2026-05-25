/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.landawn.abacus.jdbc.JdbcUtil;
import com.landawn.ofbiz.dao.ContactMechDao;
import com.landawn.ofbiz.dao.PartyContactMechDao;
import com.landawn.ofbiz.dao.PartyRoleDao;
import com.landawn.ofbiz.dao.StatusItemDao;
import com.landawn.ofbiz.dao.TimeEntryDao;
import com.landawn.ofbiz.dao.TimesheetDao;
import com.landawn.ofbiz.dao.TimesheetRoleDao;
import com.landawn.ofbiz.dao.WorkEffortAssocDao;
import com.landawn.ofbiz.dao.WorkEffortContactMechDao;
import com.landawn.ofbiz.dao.WorkEffortDao;
import com.landawn.ofbiz.dao.WorkEffortKeywordDao;
import com.landawn.ofbiz.dao.WorkEffortPartyAssignmentDao;
import com.landawn.ofbiz.dao.WorkEffortStatusDao;

/**
 * Wires the abacus-jdbc DAO interfaces used by {@code com.landawn.ofbiz.service} into the Spring
 * application context. Each bean is created via {@link JdbcUtil#createDao(Class, DataSource)} which
 * produces a dynamic proxy backed by the configured H2 DataSource.
 *
 * <p>Only the DAOs that current service implementations consume are registered here. Add new beans
 * as additional services come online.
 */
@Configuration
public class DaoConfig {

    @Bean
    public WorkEffortDao workEffortDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortDao.class, ds);
    }

    @Bean
    public WorkEffortAssocDao workEffortAssocDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortAssocDao.class, ds);
    }

    @Bean
    public WorkEffortContactMechDao workEffortContactMechDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortContactMechDao.class, ds);
    }

    @Bean
    public WorkEffortKeywordDao workEffortKeywordDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortKeywordDao.class, ds);
    }

    @Bean
    public WorkEffortStatusDao workEffortStatusDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortStatusDao.class, ds);
    }

    @Bean
    public WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortPartyAssignmentDao.class, ds);
    }

    @Bean
    public TimesheetDao timesheetDao(DataSource ds) {
        return JdbcUtil.createDao(TimesheetDao.class, ds);
    }

    @Bean
    public TimesheetRoleDao timesheetRoleDao(DataSource ds) {
        return JdbcUtil.createDao(TimesheetRoleDao.class, ds);
    }

    @Bean
    public TimeEntryDao timeEntryDao(DataSource ds) {
        return JdbcUtil.createDao(TimeEntryDao.class, ds);
    }

    @Bean
    public StatusItemDao statusItemDao(DataSource ds) {
        return JdbcUtil.createDao(StatusItemDao.class, ds);
    }

    @Bean
    public PartyRoleDao partyRoleDao(DataSource ds) {
        return JdbcUtil.createDao(PartyRoleDao.class, ds);
    }

    @Bean
    public ContactMechDao contactMechDao(DataSource ds) {
        return JdbcUtil.createDao(ContactMechDao.class, ds);
    }

    @Bean
    public PartyContactMechDao partyContactMechDao(DataSource ds) {
        return JdbcUtil.createDao(PartyContactMechDao.class, ds);
    }
}
