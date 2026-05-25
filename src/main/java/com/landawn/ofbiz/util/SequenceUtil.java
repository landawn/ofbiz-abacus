/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Generates short, sortable, application-supplied IDs that fit OFBiz's {@code VARCHAR(20)} primary
 * keys. Replaces OFBiz's {@code delegator.getNextSeqId(...)}.
 */
public final class SequenceUtil {

    private SequenceUtil() {}

    /**
     * Returns a 16-character ID: 13-digit epoch millis + 3-digit random suffix. Collisions are
     * vanishingly rare for normal HTTP-triggered workloads in a single JVM and acceptable for the
     * dev-only H2 datasource this project uses.
     */
    public static String next() {
        return Long.toString(System.currentTimeMillis())
                + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
    }
}
