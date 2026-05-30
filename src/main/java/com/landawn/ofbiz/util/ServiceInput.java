/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.util;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.landawn.abacus.util.Beans;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.model.RequestBase;

/**
 * Helpers for mapping the loosely-typed {@code Map<String, Object>} bodies that arrive from the
 * REST layer onto generated entity beans, and for pulling typed values out of those maps without
 * NPE-on-missing-key noise.
 *
 * <p>Per project policy we trust the inbound map — no explicit "required field" validation here.
 * DAO failures bubble up.
 */
public final class ServiceInput {

    private ServiceInput() {}

    /**
     * Typed convenience overload: project a {@link RequestBase} DTO onto an entity bean. Equivalent
     * to {@code populate(bean, toMap(request))}, so the same type coercion and unknown-key tolerance
     * apply. Null request properties are dropped (via {@link #toMap}), giving correct
     * merge-without-clobber semantics when {@code bean} is a pre-loaded entity being updated.
     */
    public static <T> T populate(T bean, RequestBase request) {
        return populate(bean, toMap(request));
    }

    /**
     * Copies every entry in {@code body} into the matching JavaBean property of {@code bean}, using
     * abacus's {@link Beans} for reflection-driven setters with built-in type coercion (so a
     * {@code String} ISO date in the map is converted to a {@link Timestamp} field, etc.). Unknown
     * keys are silently ignored.
     */
    public static <T> T populate(T bean, Map<String, Object> body) {
        if (body == null || body.isEmpty()) {
            return bean;
        }
        for (Map.Entry<String, Object> e : body.entrySet()) {
            Object value = e.getValue();
            if (value == null) {
                continue;
            }
            // Pre-coerce ISO-8601 / JDBC-style timestamp strings: abacus's Beans.setPropValue does
            // type conversion but doesn't accept the ISO-8601 "...Z" shape Jackson emits for
            // java.sql.Timestamp. Detect a string that looks like a date-time and convert before
            // handing off.
            if (value instanceof String s && looksLikeTimestamp(s)) {
                Timestamp ts = tryParseTimestamp(s);
                if (ts != null) {
                    value = ts;
                }
            }
            try {
                Beans.setPropValue(bean, e.getKey(), value, true);
            } catch (RuntimeException ignored) {
                // unknown property or type-coercion failure — skip and let downstream validation surface it
            }
        }
        return bean;
    }

    /** Heuristic: a date-time string starts with YYYY-MM-DD and has either a 'T' or a space at pos 10. */
    private static boolean looksLikeTimestamp(String s) {
        return s.length() >= 10
                && s.charAt(4) == '-' && s.charAt(7) == '-'
                && (s.length() == 10 || s.charAt(10) == 'T' || s.charAt(10) == ' ');
    }

    private static Timestamp tryParseTimestamp(String s) {
        try {
            return Timestamp.valueOf(s);  // "yyyy-MM-dd HH:mm:ss[.fffffffff]"
        } catch (IllegalArgumentException e) {
            try {
                return Timestamp.from(java.time.Instant.parse(s));  // ISO-8601 with Z
            } catch (RuntimeException e2) {
                return null;
            }
        }
    }

    /**
     * Boundary converter: project a typed {@link RequestBase} DTO into the loose
     * {@code Map<String, Object>} shape that the service internals still operate on. Null property
     * values are dropped so default-value handling on entity builders stays correct. The OFBiz-style
     * nested {@code userLogin} object is flattened into a {@code userLoginId} key so the existing
     * map-based {@link com.landawn.ofbiz.service.SecurityService#currentUserLoginId} logic still works.
     */
    public static Map<String, Object> toMap(RequestBase request) {
        if (request == null) {
            return new HashMap<>();
        }
        Map<String, Object> out = Beans.beanToMap(request, true);
        // Flatten userLogin.userLoginId so map-based extraction in services keeps working.
        if (Strings.isEmpty(str(out, "userLoginId")) && request.getUserLogin() != null
                && Strings.isNotEmpty(request.getUserLogin().getUserLoginId())) {
            out.put("userLoginId", request.getUserLogin().getUserLoginId());
        }
        return out;
    }

    /**
     * Project a source request DTO onto a different request DTO type — used by service-to-service
     * composition (e.g. {@code createWorkEffortAndPartyAssign} delegating to {@code createWorkEffort}).
     * Copies every overlapping property by name; properties absent on the target are silently skipped.
     */
    public static <T extends RequestBase> T narrow(RequestBase source, Supplier<T> factory) {
        T dst = factory.get();
        if (source == null) {
            return dst;
        }
        for (Map.Entry<String, Object> e : Beans.beanToMap(source, true).entrySet()) {
            try {
                Beans.setPropValue(dst, e.getKey(), e.getValue(), true);
            } catch (RuntimeException ignored) {
                // target lacks this property — drop silently (intentional narrowing).
            }
        }
        return dst;
    }

    /** Returns the value at {@code key} as a String, or {@code null}. */
    public static String str(Map<String, Object> body, String key) {
        if (body == null) {
            return null;
        }
        Object v = body.get(key);
        return v == null ? null : v.toString();
    }

    /** Returns the value at {@code key} as a {@link Timestamp}, parsing common shapes. */
    public static Timestamp ts(Map<String, Object> body, String key) {
        if (body == null) {
            return null;
        }
        Object v = body.get(key);
        if (v == null) {
            return null;
        }
        if (v instanceof Timestamp ts) {
            return ts;
        }
        if (v instanceof Number n) {
            return new Timestamp(n.longValue());
        }
        String s = v.toString();
        if (s.isEmpty()) {
            return null;
        }
        try {
            // JDBC-style "yyyy-MM-dd HH:mm:ss[.fffffffff]"
            return Timestamp.valueOf(s);
        } catch (IllegalArgumentException e) {
            // ISO-8601: 2026-05-25T12:34:56[.789][Z]
            return Timestamp.from(java.time.Instant.parse(s));
        }
    }
}
