/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Single Spring filter that emits three lines per HTTP request (request JSON, response JSON,
 * reproducible curl line) sharing one {@code reqId} MDC key. Output routes to the
 * {@code com.landawn.ofbiz.web.AccessLog} logger which writes both to
 * {@code logs/ofbiz-abacus/api_<date>.log} and to stdout — see {@code logback-spring.xml}.
 *
 * <p>Headers are <b>not</b> redacted &mdash; including {@code Authorization}, {@code Cookie} and
 * friends &mdash; because these logs exist for local API debug/replay and the generated curl line
 * must be runnable as-is. Do not enable this logger in production.
 */
@Component
public final class AccessLogFilter extends OncePerRequestFilter {

    private static final Logger LOG = LoggerFactory.getLogger("com.landawn.ofbiz.web.AccessLog");
    private static final ObjectMapper JSON = new ObjectMapper();
    private static final AtomicLong REQ_SEQ = new AtomicLong(System.nanoTime() & 0xFFFFFFFFL);

    /** Hard cap so a stray multi-MB upload doesn't bloat the log file. */
    private static final int MAX_BODY_BYTES = 64 * 1024;

    /** Skip these URL suffixes (static assets). */
    private static final Set<String> SKIP_SUFFIXES = Set.of(
            ".ico", ".css", ".js", ".png", ".jpg", ".jpeg", ".gif", ".svg",
            ".woff", ".woff2", ".ttf", ".eot", ".map");

    /** Skip these URL prefixes (Spring infrastructure). */
    private static final String[] SKIP_PREFIXES = {
            "/h2-console", "/actuator"
    };

    /**
     * Headers Tomcat/Spring synthesize that the client would recompute, so we omit them from the
     * generated curl line. They're still logged in the request JSON for completeness.
     */
    private static final Set<String> CURL_STRIP_HEADERS = Set.of(
            "host", "content-length", "connection", "transfer-encoding");

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        String uri = request.getRequestURI();
        if (uri == null) {
            return false;
        }
        for (String prefix : SKIP_PREFIXES) {
            if (uri.startsWith(prefix)) {
                return true;
            }
        }
        int lastSlash = uri.lastIndexOf('/');
        int lastDot = uri.lastIndexOf('.');
        if (lastDot > lastSlash) {
            String suffix = uri.substring(lastDot).toLowerCase(Locale.ROOT);
            if (SKIP_SUFFIXES.contains(suffix)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {

        // Spring 7's ContentCachingRequestWrapper requires an explicit cache limit. We cap at
        // MAX_BODY_BYTES + 1 so we can detect truncation (cached buffer == MAX_BODY_BYTES + 1
        // means the wire body was larger) and emit the "<elided:>" placeholder.
        ContentCachingRequestWrapper wReq = (request instanceof ContentCachingRequestWrapper r)
                ? r : new ContentCachingRequestWrapper(request, MAX_BODY_BYTES + 1);
        ContentCachingResponseWrapper wResp = (response instanceof ContentCachingResponseWrapper r)
                ? r : new ContentCachingResponseWrapper(response);

        String reqId = Long.toString(REQ_SEQ.incrementAndGet(), 36);
        MDC.put("reqId", reqId);

        try {
            // Log request BEFORE the chain — Spring's ContentCachingRequestWrapper has the body
            // available once the wrapped request's input stream is read by the controller. We log
            // request body AFTER the chain so it's actually populated.
            chain.doFilter(wReq, wResp);
        } finally {
            try {
                logRequest(wReq);
                logResponse(wReq, wResp);
                logCurl(wReq);
            } catch (RuntimeException loggingFailure) {
                LOG.warn("AccessLogFilter post-processing failed: {}", loggingFailure.toString());
            } finally {
                MDC.remove("reqId");
                // ContentCachingResponseWrapper buffers all writes; copy them back to the real
                // response before the container completes the request.
                wResp.copyBodyToResponse();
            }
        }
    }

    // ------------------------------------------------------------------------
    // log emitters
    // ------------------------------------------------------------------------

    private void logRequest(ContentCachingRequestWrapper req) {
        ObjectNode node = JSON.createObjectNode();
        node.put("httpMethod", req.getMethod());
        node.put("requestPath", buildRequestPath(req));
        node.set("requestHttpHeaders", requestHeaders(req));
        node.put("requestBody", requestBodyForLog(req));
        emit(node);
    }

    private void logResponse(ContentCachingRequestWrapper req, ContentCachingResponseWrapper resp) {
        ObjectNode node = JSON.createObjectNode();
        node.put("httpStatus", resp.getStatus());
        node.put("requestPath", buildRequestPath(req));
        node.set("responseHttpHeaders", responseHeaders(resp));
        node.put("responseBody", bodyAsLogValue(resp.getContentAsByteArray(),
                resp.getContentType(), resp.getCharacterEncoding()));
        emit(node);
    }

    private void logCurl(ContentCachingRequestWrapper req) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("curl -X ").append(req.getMethod()).append(" '").append(req.getRequestURL());
        String qs = req.getQueryString();
        if (qs != null && !qs.isEmpty()) {
            sb.append('?').append(qs);
        }
        sb.append("'");

        Enumeration<String> names = req.getHeaderNames();
        if (names != null) {
            while (names.hasMoreElements()) {
                String name = names.nextElement();
                if (name == null || CURL_STRIP_HEADERS.contains(name.toLowerCase(Locale.ROOT))) {
                    continue;
                }
                Enumeration<String> values = req.getHeaders(name);
                while (values != null && values.hasMoreElements()) {
                    String value = values.nextElement();
                    sb.append(" \\\n     -H '").append(name).append(": ")
                            .append(escapeForSingleQuotes(value)).append("'");
                }
            }
        }

        if (!"GET".equalsIgnoreCase(req.getMethod()) && !"HEAD".equalsIgnoreCase(req.getMethod())) {
            String ct = req.getContentType();
            if (isMultipart(ct)) {
                sb.append(" \\\n     # multipart body omitted from curl line");
            } else if (isFormUrlEncoded(ct)) {
                String formBody = formBodyFromParameterMap(req);
                if (!formBody.isEmpty()) {
                    sb.append(" \\\n     --data '").append(escapeForSingleQuotes(formBody)).append("'");
                }
            } else {
                byte[] body = req.getContentAsByteArray();
                if (body != null && body.length > 0
                        && isTextual(ct) && body.length <= MAX_BODY_BYTES) {
                    String bodyStr = decode(body, req.getCharacterEncoding());
                    sb.append(" \\\n     --data-raw '").append(escapeForSingleQuotes(bodyStr)).append("'");
                }
            }
        }
        LOG.info(sb.toString());
    }

    private void emit(ObjectNode node) {
        try {
            LOG.info(JSON.writeValueAsString(node));
        } catch (Exception e) {
            LOG.warn("AccessLogFilter could not serialize log node: {}", e.toString());
        }
    }

    // ------------------------------------------------------------------------
    // helpers
    // ------------------------------------------------------------------------

    private static String buildRequestPath(HttpServletRequest req) {
        StringBuilder sb = new StringBuilder();
        if (req.getContextPath() != null) sb.append(req.getContextPath());
        if (req.getServletPath() != null) sb.append(req.getServletPath());
        if (req.getPathInfo() != null) sb.append(req.getPathInfo());
        return sb.length() == 0 ? req.getRequestURI() : sb.toString();
    }

    private static ObjectNode requestHeaders(HttpServletRequest req) {
        ObjectNode out = JSON.createObjectNode();
        Enumeration<String> names = req.getHeaderNames();
        if (names == null) return out;
        Map<String, String> collected = new LinkedHashMap<>();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            if (name == null) continue;
            String key = name.toLowerCase(Locale.ROOT);
            StringBuilder joined = new StringBuilder();
            Enumeration<String> values = req.getHeaders(name);
            while (values != null && values.hasMoreElements()) {
                if (joined.length() > 0) joined.append(", ");
                joined.append(values.nextElement());
            }
            collected.merge(key, joined.toString(),
                    (a, b) -> a.isEmpty() ? b : (b.isEmpty() ? a : a + ", " + b));
        }
        collected.forEach(out::put);
        return out;
    }

    private static ObjectNode responseHeaders(HttpServletResponse resp) {
        ObjectNode out = JSON.createObjectNode();
        Collection<String> names = resp.getHeaderNames();
        if (names == null) return out;
        for (String name : names) {
            if (name == null) continue;
            String key = name.toLowerCase(Locale.ROOT);
            StringBuilder joined = new StringBuilder();
            for (String value : resp.getHeaders(name)) {
                if (joined.length() > 0) joined.append(", ");
                joined.append(value);
            }
            out.put(key, joined.toString());
        }
        return out;
    }

    /**
     * Build the {@code requestBody} value to log. For form-urlencoded and multipart we cannot use
     * the raw cached body without risking Tomcat's lazy parameter parsing, so we reconstruct from
     * {@link HttpServletRequest#getParameterMap()}.
     */
    private static String requestBodyForLog(ContentCachingRequestWrapper req) {
        String ct = req.getContentType();
        if (isMultipart(ct)) {
            int n = req.getContentLength();
            return "<multipart: " + (ct == null ? "unknown" : ct)
                    + (n >= 0 ? ", " + n + " bytes>" : ">");
        }
        if (isFormUrlEncoded(ct)) {
            return formBodyFromParameterMap(req);
        }
        return bodyAsLogValue(req.getContentAsByteArray(), ct, req.getCharacterEncoding());
    }

    /** Render the form parameters as the wire body shape (URL-encoded k=v&k=v). */
    private static String formBodyFromParameterMap(HttpServletRequest req) {
        Map<String, String[]> params = req.getParameterMap();
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry<String, String[]> e : params.entrySet()) {
            String key = URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8);
            String[] values = e.getValue() == null ? new String[]{""} : e.getValue();
            for (String v : values) {
                if (sb.length() > 0) sb.append('&');
                sb.append(key).append('=')
                        .append(URLEncoder.encode(v == null ? "" : v, StandardCharsets.UTF_8));
            }
        }
        return sb.toString();
    }

    /** Render a body to its log-friendly string (text / elided / binary placeholder). */
    private static String bodyAsLogValue(byte[] bytes, String contentType, String charset) {
        if (bytes == null || bytes.length == 0) {
            return "";
        }
        if (!isTextual(contentType)) {
            return "<binary: " + (contentType == null ? "unknown" : contentType)
                    + ", " + bytes.length + " bytes>";
        }
        if (bytes.length > MAX_BODY_BYTES) {
            return "<elided: " + bytes.length + " bytes>";
        }
        return decode(bytes, charset);
    }

    private static boolean isFormUrlEncoded(String contentType) {
        return contentType != null && contentType.toLowerCase(Locale.ROOT)
                .startsWith("application/x-www-form-urlencoded");
    }

    private static boolean isMultipart(String contentType) {
        return contentType != null && contentType.toLowerCase(Locale.ROOT)
                .startsWith("multipart/");
    }

    /** Heuristic: treat JSON, XML, form, plain text and HTML as textual. */
    private static boolean isTextual(String contentType) {
        if (contentType == null) {
            return true;  // empty / no-body request
        }
        String ct = contentType.toLowerCase(Locale.ROOT);
        return ct.startsWith("text/")
                || ct.startsWith("application/json")
                || ct.startsWith("application/xml")
                || ct.startsWith("application/x-www-form-urlencoded")
                || ct.startsWith("application/javascript")
                || ct.startsWith("application/xhtml")
                || ct.contains("+json")
                || ct.contains("+xml");
    }

    private static String decode(byte[] bytes, String charsetName) {
        if (charsetName != null) {
            try {
                return new String(bytes, charsetName);
            } catch (UnsupportedEncodingException ignored) {
                // fall through to UTF-8
            }
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    /** Escape a string so it can be embedded in a bash single-quoted literal. */
    private static String escapeForSingleQuotes(String s) {
        if (s == null) return "";
        return s.replace("'", "'\\''");
    }
}
