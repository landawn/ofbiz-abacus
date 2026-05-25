/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Raised by {@link SecurityService}-gated service methods when the active user lacks the required
 * permission. Maps to HTTP 403 by default via Spring's {@code @ResponseStatus}.
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class PermissionDeniedException extends RuntimeException {

    public PermissionDeniedException(String permission, String mainAction, String userLoginId) {
        super("User '" + (userLoginId == null ? "(anonymous)" : userLoginId)
                + "' lacks permission " + permission + "_" + mainAction);
    }
}
