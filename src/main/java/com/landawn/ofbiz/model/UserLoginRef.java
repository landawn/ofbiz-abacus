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
 * Typed shape for the OFBiz {@code userLogin} nested object that every service can read out of its
 * input map (in the original OFBiz, this is a {@code GenericValue} of the {@code UserLogin}
 * entity). Only the fields callers actually use are modeled here; new fields can be added as
 * services that read them come online.
 */
@Data
@NoArgsConstructor
public class UserLoginRef {

    /** Primary key — the only field {@link com.landawn.ofbiz.service.SecurityService} consults. */
    private String userLoginId;

    /** FK to {@code Party.partyId}; used by audit-stamping in createXxx / updateXxx services. */
    private String partyId;

    /** Plain-text password, only present in login-flow request bodies. */
    private String currentPassword;

    /** {@code "Y" | "N"}; consumed by services that gate on the login being enabled. */
    private String enabled;
}
