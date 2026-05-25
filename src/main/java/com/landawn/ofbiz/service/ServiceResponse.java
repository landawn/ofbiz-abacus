/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Builds OFBiz-style service result envelopes. Every WorkeffortService method returns a
 * {@code Map<String, Object>} shaped like the OFBiz {@code Map result} convention, so the
 * controller can serialize it as-is.
 *
 * <p>Conventional keys:
 * <ul>
 *   <li>{@code responseMessage} — {@code "success"} | {@code "error"} | {@code "fail"}</li>
 *   <li>{@code successMessage} — single-line success message (optional)</li>
 *   <li>{@code errorMessage} — single-line error message (only on error/fail)</li>
 *   <li>{@code errorMessageList} — list of individual error messages (only on error/fail)</li>
 * </ul>
 * OUT attributes from the underlying service are merged into the same map.
 */
public final class ServiceResponse {

    public static final String RESPONSE_MESSAGE = "responseMessage";
    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String FAIL = "fail";
    public static final String SUCCESS_MESSAGE = "successMessage";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String ERROR_MESSAGE_LIST = "errorMessageList";

    private ServiceResponse() {}

    /** Empty success — just {@code {"responseMessage":"success"}}. */
    public static Map<String, Object> success() {
        Map<String, Object> out = new HashMap<>(1);
        out.put(RESPONSE_MESSAGE, SUCCESS);
        return out;
    }

    /** Success with OUT attributes merged in. */
    public static Map<String, Object> success(Map<String, Object> outAttrs) {
        Map<String, Object> out = new HashMap<>(outAttrs == null ? 1 : outAttrs.size() + 1);
        if (outAttrs != null) {
            out.putAll(outAttrs);
        }
        out.put(RESPONSE_MESSAGE, SUCCESS);
        return out;
    }

    /** Success with a single OUT attribute (the common "just-the-id" case). */
    public static Map<String, Object> success(String key, Object value) {
        Map<String, Object> out = new HashMap<>(2);
        out.put(key, value);
        out.put(RESPONSE_MESSAGE, SUCCESS);
        return out;
    }

    /** Success with a human-readable note. */
    public static Map<String, Object> successWithMessage(String message, Map<String, Object> outAttrs) {
        Map<String, Object> out = success(outAttrs);
        if (message != null) {
            out.put(SUCCESS_MESSAGE, message);
        }
        return out;
    }

    /** Single-message error envelope. */
    public static Map<String, Object> error(String message) {
        Map<String, Object> out = new HashMap<>(3);
        out.put(RESPONSE_MESSAGE, ERROR);
        out.put(ERROR_MESSAGE, message);
        out.put(ERROR_MESSAGE_LIST, List.of(message));
        return out;
    }

    /** Marks a result map as an error (used by controllers to decide HTTP status). */
    public static boolean isError(Map<String, Object> result) {
        return result != null && ERROR.equals(result.get(RESPONSE_MESSAGE));
    }
}
