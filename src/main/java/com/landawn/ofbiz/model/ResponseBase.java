/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The OFBiz service-result envelope keys that every response DTO carries. Subclasses add the
 * per-service OUT attributes.
 *
 * <p>{@link com.landawn.ofbiz.service.ServiceResponse} builds responses with these exact keys, so
 * Jackson serializes them at the top level alongside whatever the subclass adds.
 */
@Data
@NoArgsConstructor
public abstract class ResponseBase {

    /** Always set: {@code "success" | "error" | "fail"}. */
    private String responseMessage;

    /** Optional human-readable note on success. */
    private String successMessage;

    /** Single-line error message; set when {@code responseMessage = "error"} or {@code "fail"}. */
    private String errorMessage;

    /** Per-message list of errors; set when {@code responseMessage = "error"} or {@code "fail"}. */
    private List<String> errorMessageList;
}
