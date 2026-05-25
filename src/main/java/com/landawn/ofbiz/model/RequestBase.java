/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Shared fields carried on every request DTO that flows into a {@code WorkeffortController}
 * endpoint. Subclasses add per-service IN attributes.
 *
 * <p>The four fields here are <b>universal</b> across every OFBiz workeffort service we exposed:
 * <ul>
 *   <li>{@code userLoginId} — flat form, read by {@link com.landawn.ofbiz.service.SecurityService}.</li>
 *   <li>{@code userLogin} — OFBiz-style nested object; see {@link UserLoginRef}.</li>
 *   <li>{@code locale} / {@code timeZone} — OFBiz services occasionally consume these.</li>
 * </ul>
 */
@Data
@NoArgsConstructor
public abstract class RequestBase {

    /** Flat {@code userLoginId} form — preferred for new callers. */
    private String userLoginId;

    /** OFBiz-style nested user-login object, kept for backward compatibility. */
    private UserLoginRef userLogin;

    /** Optional BCP-47 locale tag (e.g. {@code "en_US"}). */
    private String locale;

    /** Optional zone id (e.g. {@code "America/Los_Angeles"}). */
    private String timeZone;
}
