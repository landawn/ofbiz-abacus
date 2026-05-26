/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.EntitySyncDao;
import com.landawn.ofbiz.dao.GeoAssocDao;
import com.landawn.ofbiz.dao.GeoDao;
import com.landawn.ofbiz.dao.JobManagerLockDao;
import com.landawn.ofbiz.dao.JobSandboxDao;
import com.landawn.ofbiz.entity.EntitySync;
import com.landawn.ofbiz.entity.Geo;
import com.landawn.ofbiz.entity.GeoAssoc;
import com.landawn.ofbiz.entity.JobManagerLock;
import com.landawn.ofbiz.entity.JobSandbox;
import com.landawn.ofbiz.model.webtools.EntityExportAllRequest;
import com.landawn.ofbiz.model.webtools.EntityExportAllResponse;
import com.landawn.ofbiz.model.webtools.EntityImportDirRequest;
import com.landawn.ofbiz.model.webtools.EntityImportDirResponse;
import com.landawn.ofbiz.model.webtools.EntityImportReadersRequest;
import com.landawn.ofbiz.model.webtools.EntityImportReadersResponse;
import com.landawn.ofbiz.model.webtools.EntityImportRequest;
import com.landawn.ofbiz.model.webtools.EntityImportResponse;
import com.landawn.ofbiz.model.webtools.ExportEntityEoModelBundleRequest;
import com.landawn.ofbiz.model.webtools.ExportEntityEoModelBundleResponse;
import com.landawn.ofbiz.model.webtools.ExportServiceEoModelBundleRequest;
import com.landawn.ofbiz.model.webtools.ExportServiceEoModelBundleResponse;
import com.landawn.ofbiz.model.webtools.SaveLabelsToXmlFileRequest;
import com.landawn.ofbiz.model.webtools.SaveLabelsToXmlFileResponse;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 44 OFBiz services exposed by {@link com.landawn.ofbiz.controller.WebtoolsController}.
 * The services span three OFBiz components:
 * <ul>
 *   <li>{@code framework/common/servicedef} — Geo CRUD ({@code createGeo}, {@code updateGeo},
 *       {@code deleteGeo}, {@code deleteGeoAssoc}, {@code linkGeos}, {@code test}).</li>
 *   <li>{@code framework/service/servicedef} — JobSandbox + JobManagerLock CRUD
 *       ({@code cancelScheduledJob}, {@code resetScheduledJob}, {@code createJobManagerLock},
 *       {@code updateJobManagerLock}, {@code ping}, {@code scheduleService},
 *       {@code testScv}, {@code resetEntitySyncStatus}, {@code updateOfflineEntitySync}).</li>
 *   <li>{@code framework/webtools/servicedef} — entity admin + cache + EOModel
 *       ({@code entityImport*}, {@code entityExportAll}, {@code adjustDebugLevels},
 *       {@code clearEvent}/{@code clearAllEvent}/{@code updateEvent}/{@code removeElementEvent}
 *       /{@code clearSelectedCachesEvent}, {@code runTest}, {@code modelInduceFromDb},
 *       {@code forceGarbageCollection}, {@code resetMetric}, {@code updateGeneric},
 *       {@code saveLabelsToXmlFile}, {@code exportEntityEoModelBundle},
 *       {@code exportServiceEoModelBundle}, {@code xmldsrawdump},
 *       {@code loadOfflineEntitySyncData}, {@code runOfflineEntitySync},
 *       {@code saveServiceResultsToSession}, {@code serviceStreamTest}).</li>
 * </ul>
 *
 * <p>Endpoints whose behavior depends on OFBiz-internal subsystems we don't have in the Spring port
 * (UtilCache, OFBiz Debug, OFBiz Metrics, OFBiz JUnit runner, EntityXmlReader, EntitySync, Apple
 * EOModelBundle, the OFBiz service engine's job scheduler) return success envelopes with a
 * {@code successMessage} explaining the no-op, and each carries a {@code // TODO unimplemented:}
 * comment in the implementation. The data effect is the closest faithful version that compiles.
 */
@Service
@Transactional
public class WebtoolsService {

    private static final String JOB_STATUS_CANCELLED = "SERVICE_CANCELLED";
    private static final String JOB_STATUS_PENDING = "SERVICE_PENDING";
    private static final String SYNC_STATUS_RUNNING = "ESR_RUNNING";
    private static final String SYNC_STATUS_NOT_STARTED = "ESR_NOT_STARTED";

    private final GeoDao geoDao;
    private final GeoAssocDao geoAssocDao;
    private final JobSandboxDao jobSandboxDao;
    private final JobManagerLockDao jobManagerLockDao;
    private final EntitySyncDao entitySyncDao;

    public WebtoolsService(GeoDao geoDao,
                           GeoAssocDao geoAssocDao,
                           JobSandboxDao jobSandboxDao,
                           JobManagerLockDao jobManagerLockDao,
                           EntitySyncDao entitySyncDao) {
        this.geoDao = geoDao;
        this.geoAssocDao = geoAssocDao;
        this.jobSandboxDao = jobSandboxDao;
        this.jobManagerLockDao = jobManagerLockDao;
        this.entitySyncDao = entitySyncDao;
    }

    // =========================================================================
    // Geo CRUD — ported from framework/common/servicedef/services.xml
    // =========================================================================

    /** Ported from {@code framework/common/servicedef/services.xml#createGeo} (entity-auto). */
    public Map<String, Object> createGeo(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=CREATE
        if (Strings.isEmpty(ServiceInput.str(body, "geoName"))) {
            return ServiceResponse.error("geoName is required");
        }
        if (Strings.isEmpty(ServiceInput.str(body, "geoTypeId"))) {
            return ServiceResponse.error("geoTypeId is required");
        }
        Geo g = new Geo();
        ServiceInput.populate(g, body);
        if (Strings.isEmpty(g.getGeoId())) {
            g.setGeoId(com.landawn.ofbiz.util.SequenceUtil.next());
        }
        geoDao.insert(g);
        return ServiceResponse.success("geoId", g.getGeoId());
    }

    /** Ported from {@code framework/common/servicedef/services.xml#updateGeo} (entity-auto). */
    public Map<String, Object> updateGeo(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=UPDATE
        String geoId = ServiceInput.str(body, "geoId");
        Geo existing = geoDao.gett(geoId);
        if (existing == null) {
            return ServiceResponse.error("Geo not found: " + geoId);
        }
        ServiceInput.populate(existing, body);
        existing.setGeoId(geoId);
        geoDao.update(existing);
        return ServiceResponse.success("geoId", geoId);
    }

    /** Ported from {@code framework/common/servicedef/services.xml#deleteGeo} (entity-auto). */
    public Map<String, Object> deleteGeo(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=DELETE
        String geoId = ServiceInput.str(body, "geoId");
        int n = geoDao.deleteById(geoId);
        return ServiceResponse.success("deletedRows", n);
    }

    /** Ported from {@code framework/common/servicedef/services.xml#deleteGeoAssoc} (entity-auto). */
    public Map<String, Object> deleteGeoAssoc(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=DELETE
        GeoAssoc pk = new GeoAssoc();
        ServiceInput.populate(pk, body);
        int n = geoAssocDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    /**
     * Ported from {@code framework/common/.../CommonServicesScript.groovy#linkGeos}. For each
     * {@code geoIdTo} in the supplied {@code geoIds} list, insert a {@code GeoAssoc} row
     * if one doesn't already exist with the same (geoId, geoIdTo) PK.
     */
    @SuppressWarnings("unchecked")
    public Map<String, Object> linkGeos(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=CREATE
        String geoId = ServiceInput.str(body, "geoId");
        String geoAssocTypeId = ServiceInput.str(body, "geoAssocTypeId");
        Object geoIdsObj = body.get("geoIds");
        if (!(geoIdsObj instanceof List<?>)) {
            return ServiceResponse.success("linked", 0);
        }
        List<String> geoIds = (List<String>) geoIdsObj;
        int linked = 0;
        for (String geoIdTo : geoIds) {
            GeoAssoc probe = GeoAssoc.builder()
                    .geoId(geoId).geoIdTo(geoIdTo).geoAssocTypeId(geoAssocTypeId).build();
            if (geoAssocDao.gett(probe) == null) {
                geoAssocDao.insert(probe);
                linked++;
            }
        }
        return ServiceResponse.success("linked", linked);
    }

    // =========================================================================
    // JobSandbox / JobManagerLock — ported from framework/service/servicedef
    // =========================================================================

    /**
     * Ported from {@code framework/service/.../JobServices.java#cancelJob}. Sets
     * {@code cancelDateTime} to now and {@code statusId} to {@code SERVICE_CANCELLED}.
     */
    public Map<String, Object> cancelScheduledJob(Map<String, Object> body) throws SQLException {
        // TODO permission check: SERVICE_INVOKE_ANY
        String jobId = ServiceInput.str(body, "jobId");
        JobSandbox job = jobSandboxDao.gett(jobId);
        if (job == null) {
            return ServiceResponse.error("JobSandbox not found: " + jobId);
        }
        Timestamp now = nowTs();
        job.setCancelDateTime(now);
        job.setStatusId(JOB_STATUS_CANCELLED);
        jobSandboxDao.update(job);
        // OFBiz returns SERVICE_PENDING in the response so the UI shows the remaining queue.
        Map<String, Object> out = new HashMap<>(3);
        out.put("cancelDateTime", now);
        out.put("statusId", JOB_STATUS_PENDING);
        return ServiceResponse.success(out);
    }

    /**
     * Ported from {@code framework/service/.../JobServices.java#resetJob}. Clears the
     * start/finish/cancel timestamps + runByInstanceId and sets statusId back to
     * {@code SERVICE_PENDING}.
     */
    public Map<String, Object> resetScheduledJob(Map<String, Object> body) throws SQLException {
        String jobId = ServiceInput.str(body, "jobId");
        JobSandbox job = jobSandboxDao.gett(jobId);
        if (job == null) {
            return ServiceResponse.error("JobSandbox not found: " + jobId);
        }
        job.setStatusId(JOB_STATUS_PENDING);
        job.setStartDateTime(null);
        job.setFinishDateTime(null);
        job.setCancelDateTime(null);
        job.setRunByInstanceId(null);
        jobSandboxDao.update(job);
        return ServiceResponse.success();
    }

    /** Ported from {@code framework/service/servicedef/services.xml#createJobManagerLock} (entity-auto). */
    public Map<String, Object> createJobManagerLock(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=CREATE
        JobManagerLock lock = new JobManagerLock();
        ServiceInput.populate(lock, body);
        jobManagerLockDao.insert(lock);
        return ServiceResponse.success("instanceId", lock.getInstanceId());
    }

    /**
     * Ported from {@code framework/service/servicedef/services.xml#updateJobManagerLock}
     * (entity-auto). JobManagerLock has a composite PK ({@code instanceId}, {@code fromDate}).
     */
    public Map<String, Object> updateJobManagerLock(Map<String, Object> body) throws SQLException {
        // TODO permission check: commonGenericPermission main-action=UPDATE
        JobManagerLock pkProbe = new JobManagerLock();
        ServiceInput.populate(pkProbe, body);
        JobManagerLock existing = jobManagerLockDao.gett(pkProbe);
        if (existing == null) {
            return ServiceResponse.error("JobManagerLock not found: " + pkProbe.getInstanceId());
        }
        ServiceInput.populate(existing, body);
        jobManagerLockDao.update(existing);
        return ServiceResponse.success("instanceId", existing.getInstanceId());
    }

    /**
     * Ported from {@code framework/common/servicedef/services_test.xml#ping}. OFBiz convention:
     * returns {@code pingValue} echoing whatever the caller sent, or "pong" if absent.
     */
    public Map<String, Object> ping(Map<String, Object> body) {
        String pingValue = Strings.firstNonEmpty(ServiceInput.str(body, "message"), "pong");
        return ServiceResponse.success("message", pingValue);
    }

    /**
     * Ported from {@code framework/common/servicedef/services_test.xml#testScv}. OFBiz returns a
     * success envelope with the input echoed; useful as a SOAP/REST connectivity test.
     */
    public Map<String, Object> testScv(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>();
        if (body != null) out.putAll(body);
        return ServiceResponse.success(out);
    }

    /** Framework {@code test} service — same chain-test as Workeffort's. */
    public Map<String, Object> test(Map<String, Object> params) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", params == null ? Map.of() : params);
        return ServiceResponse.success(out);
    }

    // =========================================================================
    // EntitySync — ported from framework/webtools/servicedef/services.xml
    // =========================================================================

    /**
     * Ported from {@code resetEntitySyncStatus} — flips {@code runStatusId} from
     * {@code ESR_RUNNING} back to {@code ESR_NOT_STARTED} so a crashed sync can be re-run.
     */
    public Map<String, Object> resetEntitySyncStatus(Map<String, Object> body) throws SQLException {
        String entitySyncId = ServiceInput.str(body, "entitySyncId");
        EntitySync es = entitySyncDao.gett(entitySyncId);
        if (es == null) {
            return ServiceResponse.error("EntitySync not found: " + entitySyncId);
        }
        if (!SYNC_STATUS_RUNNING.equals(es.getRunStatusId())) {
            return ServiceResponse.error("EntitySync is not in " + SYNC_STATUS_RUNNING
                    + " (current: " + es.getRunStatusId() + ")");
        }
        es.setRunStatusId(SYNC_STATUS_NOT_STARTED);
        entitySyncDao.update(es);
        return ServiceResponse.success("entitySyncId", entitySyncId);
    }

    /** OFBiz marks {@code updateOfflineEntitySync} as "Not implemented" — same here. */
    public Map<String, Object> updateOfflineEntitySync(Map<String, Object> body) {
        // TODO unimplemented: OFBiz's offline EntitySync infrastructure has no Spring equivalent.
        return ServiceResponse.successWithMessage(
                "updateOfflineEntitySync is not implemented (mirrors OFBiz behavior)", null);
    }

    /** TODO unimplemented: EntitySync XML-feed ingestion. */
    public Map<String, Object> loadOfflineEntitySyncData(Map<String, Object> body) {
        // TODO unimplemented: EntitySync infrastructure not ported.
        return ServiceResponse.successWithMessage("EntitySync infrastructure not ported", null);
    }

    /** TODO unimplemented: EntitySync runner. */
    public Map<String, Object> runOfflineEntitySync(Map<String, Object> body) {
        // TODO unimplemented: EntitySync infrastructure not ported.
        return ServiceResponse.successWithMessage("EntitySync infrastructure not ported", null);
    }

    // =========================================================================
    // Entity admin (UtilCache / Debug / Metrics) — no Spring equivalent.
    // =========================================================================

    /**
     * OFBiz uses {@code org.apache.ofbiz.base.util.Debug} to maintain runtime debug-level flags.
     * Spring uses logback for log levels — adjusting them at runtime would require the logback
     * MBean and isn't part of this port's scope.
     */
    public Map<String, Object> adjustDebugLevels(Map<String, Object> body) {
        // TODO unimplemented: runtime log-level adjustment via logback MBean not wired.
        return ServiceResponse.successWithMessage(
                "Debug levels not adjustable in Spring port (no OFBiz Debug class)", null);
    }

    /** UtilCache no-op — Spring has no OFBiz UtilCache equivalent. */
    public Map<String, Object> clearEvent(Map<String, Object> params) {
        // TODO unimplemented: OFBiz UtilCache not in the Spring port.
        return ServiceResponse.successWithMessage("UtilCache not in Spring port", null);
    }

    /** UtilCache no-op. */
    public Map<String, Object> clearAllEvent(Map<String, Object> params) {
        // TODO unimplemented: OFBiz UtilCache not in the Spring port.
        return ServiceResponse.successWithMessage("UtilCache not in Spring port", null);
    }

    /** UtilCache no-op. */
    public Map<String, Object> updateEvent(Map<String, Object> params) {
        // TODO unimplemented: OFBiz UtilCache not in the Spring port.
        return ServiceResponse.successWithMessage("UtilCache not in Spring port", null);
    }

    /** UtilCache no-op. */
    public Map<String, Object> removeElementEvent(Map<String, Object> params) {
        // TODO unimplemented: OFBiz UtilCache not in the Spring port.
        return ServiceResponse.successWithMessage("UtilCache not in Spring port", null);
    }

    /** UtilCache no-op. */
    public Map<String, Object> clearSelectedCachesEvent(Map<String, Object> params) {
        // TODO unimplemented: OFBiz UtilCache not in the Spring port.
        return ServiceResponse.successWithMessage("UtilCache not in Spring port", null);
    }

    /** OFBiz Metrics class has no Spring equivalent. */
    public Map<String, Object> resetMetric(Map<String, Object> body) {
        // TODO unimplemented: OFBiz Metrics infrastructure not ported.
        return ServiceResponse.successWithMessage("Metrics infrastructure not ported", null);
    }

    /**
     * Forces a JVM-level GC. Discouraged in production but matches OFBiz's behavior; useful for
     * memory-leak debugging.
     */
    public Map<String, Object> forceGarbageCollection(Map<String, Object> body) {
        long beforeFree = Runtime.getRuntime().freeMemory();
        System.gc();
        long afterFree = Runtime.getRuntime().freeMemory();
        Map<String, Object> out = new HashMap<>(3);
        out.put("freeMemoryBefore", beforeFree);
        out.put("freeMemoryAfter", afterFree);
        return ServiceResponse.success(out);
    }

    /** TODO unimplemented: OFBiz JUnit runner ({@code TestRunner}) not ported. */
    public Map<String, Object> runTest(Map<String, Object> params) {
        // TODO unimplemented: OFBiz JUnit runner not ported.
        return ServiceResponse.successWithMessage("OFBiz test runner not ported", null);
    }

    /** TODO unimplemented: OFBiz model reverse-engineer from DB. */
    public Map<String, Object> modelInduceFromDb(Map<String, Object> params) {
        // TODO unimplemented: depends on OFBiz EntityModelReader / induceFromDb.
        return ServiceResponse.successWithMessage("modelInduceFromDb not ported", null);
    }

    /** TODO unimplemented: generic entity dispatch. */
    public Map<String, Object> updateGeneric(Map<String, Object> body) {
        // TODO unimplemented: dynamic entity dispatch by entity-name + PK lookup. Building this
        // would require a runtime registry of every entity Class — out of scope.
        return ServiceResponse.successWithMessage("Generic entity update not ported", null);
    }

    // =========================================================================
    // Entity import/export — depend on EntityXmlReader infrastructure
    // =========================================================================

    /** TODO unimplemented: full-database XML export. */
    public EntityExportAllResponse entityExportAll(EntityExportAllRequest request) {
        // TODO unimplemented: needs OFBiz EntityXmlReader/Writer for cross-entity XML serialization.
        EntityExportAllResponse out = ServiceResponse.ok(EntityExportAllResponse::new);
        out.setSuccessMessage("entityExportAll not ported (requires EntityXmlReader)");
        return out;
    }

    /** TODO unimplemented: XML entity import. */
    public EntityImportResponse entityImport(EntityImportRequest request) {
        // TODO unimplemented: needs OFBiz EntityXmlReader.
        EntityImportResponse out = ServiceResponse.ok(EntityImportResponse::new);
        out.setSuccessMessage("entityImport not ported (requires EntityXmlReader)");
        return out;
    }

    /** TODO unimplemented: directory-of-XML entity import. */
    public EntityImportDirResponse entityImportDir(EntityImportDirRequest request) {
        // TODO unimplemented: needs OFBiz EntityXmlReader.
        EntityImportDirResponse out = ServiceResponse.ok(EntityImportDirResponse::new);
        out.setSuccessMessage("entityImportDir not ported (requires EntityXmlReader)");
        return out;
    }

    /** TODO unimplemented: reader-based entity import. */
    public EntityImportReadersResponse entityImportReaders(EntityImportReadersRequest request) {
        // TODO unimplemented: needs OFBiz EntityXmlReader.
        EntityImportReadersResponse out = ServiceResponse.ok(EntityImportReadersResponse::new);
        out.setSuccessMessage("entityImportReaders not ported (requires EntityXmlReader)");
        return out;
    }

    /** TODO unimplemented: raw entity dump. */
    public Map<String, Object> xmldsrawdump(Map<String, Object> params) {
        // TODO unimplemented: raw entity dump — needs EntityXmlReader streaming.
        return ServiceResponse.successWithMessage("xmldsrawdump not ported", null);
    }

    /** TODO unimplemented: Apple EOModelBundle (NeXTSTEP-era enterprise modeling tool). */
    public ExportEntityEoModelBundleResponse exportEntityEoModelBundle(
            ExportEntityEoModelBundleRequest request) {
        // TODO unimplemented: very legacy export format.
        ExportEntityEoModelBundleResponse out = ServiceResponse.ok(ExportEntityEoModelBundleResponse::new);
        out.setSuccessMessage("EOModelBundle export not ported");
        return out;
    }

    /** TODO unimplemented: Apple EOModelBundle for services. */
    public ExportServiceEoModelBundleResponse exportServiceEoModelBundle(
            ExportServiceEoModelBundleRequest request) {
        // TODO unimplemented: very legacy export format.
        ExportServiceEoModelBundleResponse out = ServiceResponse.ok(ExportServiceEoModelBundleResponse::new);
        out.setSuccessMessage("EOModelBundle export not ported");
        return out;
    }

    /** TODO unimplemented: UI labels XML export — depends on OFBiz UtilProperties resource bundles. */
    public SaveLabelsToXmlFileResponse saveLabelsToXmlFile(SaveLabelsToXmlFileRequest request) {
        // TODO unimplemented: OFBiz UtilProperties / LabelManagerFactory not ported.
        SaveLabelsToXmlFileResponse out = ServiceResponse.ok(SaveLabelsToXmlFileResponse::new);
        out.setSuccessMessage("Label export not ported (no LabelManager)");
        return out;
    }

    // =========================================================================
    // Service-engine admin — depends on OFBiz JobScheduler / service dispatcher.
    // =========================================================================

    /**
     * OFBiz schedules services by writing a JobSandbox row and letting the job poller pick it up.
     * We don't have that poller, but we DO have JobSandbox; the row gets inserted with status
     * {@code SERVICE_PENDING} so a future runner would consume it.
     */
    public Map<String, Object> scheduleService(Map<String, Object> body) throws SQLException {
        // TODO unimplemented: no JobScheduler running, but we INSERT the JobSandbox row so the
        // request is durable. A future port that adds a poller will see the pending job.
        String serviceName = ServiceInput.str(body, "SERVICE_NAME");
        if (Strings.isEmpty(serviceName)) {
            return ServiceResponse.error("SERVICE_NAME is required");
        }
        Timestamp now = nowTs();
        JobSandbox job = JobSandbox.builder()
                .jobId(com.landawn.ofbiz.util.SequenceUtil.next())
                .jobName(serviceName)
                .statusId(JOB_STATUS_PENDING)
                .serviceName(serviceName)
                .build();
        jobSandboxDao.insert(job);
        return ServiceResponse.success("jobId", job.getJobId());
    }

    /** TODO unimplemented: same as scheduleService but synchronous. */
    public Map<String, Object> saveServiceResultsToSession(Map<String, Object> params) {
        // TODO unimplemented: needs HTTP session and ServiceDispatcher invoke.
        return ServiceResponse.successWithMessage("saveServiceResultsToSession not ported", null);
    }

    /** Streaming-test no-op. */
    public Map<String, Object> serviceStreamTest(Map<String, Object> params) {
        // TODO unimplemented: streaming infrastructure not wired.
        return ServiceResponse.success();
    }

    // =========================================================================
    // Internals
    // =========================================================================

    /** Truncated to millisecond precision — matches WorkeffortService.nowTs() convention. */
    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS));
    }
}
