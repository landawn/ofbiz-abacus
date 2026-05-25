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
import java.util.function.Supplier;

import com.landawn.abacus.util.Beans;
import com.landawn.ofbiz.model.ResponseBase;

/**
 * Builds OFBiz-style service result envelopes. Internally services still pass {@code Map<String, Object>}
 * around for the OFBiz interop seams (SECA chains, putAll merges, etc.); the public service methods
 * convert those maps into typed {@link ResponseBase} subclasses at the boundary via {@link #toDto}.
 *
 * <p>Conventional envelope keys:
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

    /** True when an envelope is an error envelope. Used by service-to-service short-circuits. */
    public static boolean isError(Map<String, Object> result) {
        return result != null && ERROR.equals(result.get(RESPONSE_MESSAGE));
    }

    /**
     * True when a typed response is an error envelope. Used by the controller's {@code wrap()}
     * to route to HTTP 400.
     */
    public static boolean isError(ResponseBase result) {
        if (result == null) {
            return false;
        }
        return ERROR.equals(result.getResponseMessage())
                || FAIL.equals(result.getResponseMessage())
                || result.getErrorMessage() != null
                || (result.getErrorMessageList() != null && !result.getErrorMessageList().isEmpty());
    }

    /** Build a typed success envelope. Caller populates OUT fields on the returned DTO. */
    public static <T extends ResponseBase> T ok(Supplier<T> factory) {
        T r = factory.get();
        r.setResponseMessage(SUCCESS);
        return r;
    }

    /** Build a typed error envelope (responseMessage=error, errorMessage + errorMessageList set). */
    public static <T extends ResponseBase> T error(String message, Supplier<T> factory) {
        T r = factory.get();
        r.setResponseMessage(ERROR);
        r.setErrorMessage(message);
        r.setErrorMessageList(List.of(message));
        return r;
    }

    /**
     * Boundary converter: copy every entry of {@code envelope} (a {@link ServiceResponse}-shaped map)
     * onto a freshly-instantiated {@code T}. Unknown map keys are silently ignored. Used by service
     * methods to convert their internal map-shaped result into the per-endpoint typed DTO.
     */
    public static <T extends ResponseBase> T toDto(Map<String, Object> envelope, Supplier<T> factory) {
        T dto = factory.get();
        if (envelope == null) {
            return dto;
        }
        for (Map.Entry<String, Object> e : envelope.entrySet()) {
            try {
                Beans.setPropValue(dto, e.getKey(), e.getValue(), true);
            } catch (RuntimeException ignored) {
                // unknown property or type-coercion failure — skip
            }
        }
        return dto;
    }

    /**
     * Project an error envelope from one typed response onto another — used by service-to-service
     * composition to propagate a sub-service's error to its caller's response type.
     */
    public static <T extends ResponseBase> T errorOf(ResponseBase source, Supplier<T> factory) {
        T dst = factory.get();
        if (source == null) {
            return dst;
        }
        dst.setResponseMessage(source.getResponseMessage());
        dst.setErrorMessage(source.getErrorMessage());
        dst.setErrorMessageList(source.getErrorMessageList());
        return dst;
    }
}
