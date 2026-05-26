package com.landawn.ofbiz.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.landawn.ofbiz.model.ResponseBase;
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
import com.landawn.ofbiz.service.ServiceResponse;
import com.landawn.ofbiz.service.WebtoolsService;

/**
 * REST surface for the 44 OFBiz Webtools endpoints. Each method delegates to one
 * {@link WebtoolsService} method. See WebtoolsService's class-level Javadoc for which OFBiz
 * services are fully ported and which return a no-op success envelope because they depend on
 * OFBiz-internal subsystems (UtilCache, Debug, Metrics, EntityXmlReader, JobScheduler, etc.).
 */
@RestController
@RequestMapping("/webtools")
public class WebtoolsController {

    private final WebtoolsService service;

    public WebtoolsController(WebtoolsService service) {
        this.service = service;
    }

    /** 200/400 routing based on the typed response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return ServiceResponse.isError(result)
                ? ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /** 200/400 routing for the loosely-typed (Map) responses. */
    private static ResponseEntity<Map<String, Object>> wrapMap(Map<String, Object> result) {
        return ServiceResponse.isError(result)
                ? ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    // ---- Debug / Cache admin (UtilCache no-ops) ----

    /**
     * Sets/Updates cached debugging levels. No Spring equivalent for the OFBiz Debug class.
     * <p>service: adjustDebugLevels  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/AdjustDebugLevels")
    public ResponseEntity<Map<String, Object>> adjustDebugLevels(@RequestBody Map<String, Object> body) {
        return wrapMap(service.adjustDebugLevels(body));
    }

    /**
     * <p>service: clearSelectedCachesEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/ClearSelectedCaches")
    public ResponseEntity<Map<String, Object>> clearSelectedCachesEvent(@RequestParam Map<String, String> params) {
        return wrapMap(service.clearSelectedCachesEvent(Map.copyOf(params)));
    }

    /**
     * <p>service: modelInduceFromDb  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/CreateModelInduceFromDb")
    public ResponseEntity<Map<String, Object>> modelInduceFromDb(@RequestParam Map<String, String> params) {
        return wrapMap(service.modelInduceFromDb(Map.copyOf(params)));
    }

    /**
     * <p>service: clearEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/EditUtilCacheClear")
    public ResponseEntity<Map<String, Object>> clearEvent(@RequestParam Map<String, String> params) {
        return wrapMap(service.clearEvent(Map.copyOf(params)));
    }

    /**
     * <p>service: updateEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/EditUtilCacheUpdate")
    public ResponseEntity<Map<String, Object>> updateEvent(@RequestParam Map<String, String> params) {
        return wrapMap(service.updateEvent(Map.copyOf(params)));
    }

    /**
     * <p>service: clearEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/FindUtilCacheClear")
    public ResponseEntity<Map<String, Object>> clearEventFindUtilCacheClear(@RequestParam Map<String, String> params) {
        return wrapMap(service.clearEvent(Map.copyOf(params)));
    }

    /**
     * <p>service: clearAllEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/FindUtilCacheClearAll")
    public ResponseEntity<Map<String, Object>> clearAllEvent(@RequestParam Map<String, String> params) {
        return wrapMap(service.clearAllEvent(Map.copyOf(params)));
    }

    /**
     * <p>service: removeElementEvent  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/FindUtilCacheElementsRemoveElement")
    public ResponseEntity<Map<String, Object>> removeElementEvent(@RequestParam Map<String, String> params) {
        return wrapMap(service.removeElementEvent(Map.copyOf(params)));
    }

    /**
     * Force the JVM to run the GC. Discouraged but matches OFBiz behavior.
     * <p>service: forceGarbageCollection  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/ForceGarbageCollection")
    public ResponseEntity<Map<String, Object>> forceGarbageCollection(@RequestBody Map<String, Object> body) {
        return wrapMap(service.forceGarbageCollection(body));
    }

    /**
     * Resets a metric. No Spring equivalent for org.apache.ofbiz.base.metrics.Metrics.
     * <p>service: resetMetric  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/ResetMetric")
    public ResponseEntity<Map<String, Object>> resetMetric(@RequestBody Map<String, Object> body) {
        return wrapMap(service.resetMetric(body));
    }

    // ---- Tests ----

    /**
     * <p>service: runTest  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/RunTest/{compName}/{suiteName}")
    public ResponseEntity<Map<String, Object>> runTest(@RequestParam Map<String, String> params) {
        return wrapMap(service.runTest(Map.copyOf(params)));
    }

    /**
     * <p>service: runTest  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/RunTest/{compName}/{suiteName}/{caseName}")
    public ResponseEntity<Map<String, Object>> runTestCaseName(@RequestParam Map<String, String> params) {
        return wrapMap(service.runTest(Map.copyOf(params)));
    }

    /**
     * Save labels to xml file.
     * <p>service: saveLabelsToXmlFile  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/SaveLabelsToXmlFile")
    public ResponseEntity<SaveLabelsToXmlFileResponse> saveLabelsToXmlFile(@RequestBody SaveLabelsToXmlFileRequest request) {
        return wrap(service.saveLabelsToXmlFile(request));
    }

    /**
     * Test service.
     * <p>service: testScv  entities: unknown  auth: false
     */
    @PostMapping("/webtools/control/TestService")
    public ResponseEntity<Map<String, Object>> testScv(@RequestBody Map<String, Object> body) {
        return wrapMap(service.testScv(body));
    }

    /**
     * <p>service: updateGeneric  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/UpdateGeneric")
    public ResponseEntity<Map<String, Object>> updateGeneric(@RequestParam Map<String, String> params) {
        return wrapMap(service.updateGeneric(Map.copyOf(params)));
    }

    /**
     * Cancels a scheduled job.
     * <p>service: cancelScheduledJob  entities: JobSandbox  auth: true
     */
    @PostMapping("/webtools/control/cancelJob")
    public ResponseEntity<Map<String, Object>> cancelScheduledJob(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.cancelScheduledJob(body));
    }

    /**
     * Framework chain-test service.
     * <p>service: test  entities: unknown  auth: false
     */
    @GetMapping("/webtools/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        return wrapMap(service.test(Map.copyOf(params)));
    }

    // ---- Geo CRUD ----

    /**
     * Create a Geo.
     * <p>service: createGeo  entities: Geo  auth: true
     */
    @PostMapping("/webtools/control/createGeo")
    public ResponseEntity<Map<String, Object>> createGeo(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.createGeo(body));
    }

    /**
     * Create a Job Manager Lock.
     * <p>service: createJobManagerLock  entities: JobManagerLock  auth: true
     */
    @PostMapping("/webtools/control/createJobManagerLock")
    public ResponseEntity<Map<String, Object>> createJobManagerLock(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.createJobManagerLock(body));
    }

    /**
     * Delete a Geo.
     * <p>service: deleteGeo  entities: Geo  auth: true
     */
    @PostMapping("/webtools/control/deleteGeo")
    public ResponseEntity<Map<String, Object>> deleteGeo(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.deleteGeo(body));
    }

    /**
     * Delete a GeoAssoc.
     * <p>service: deleteGeoAssoc  entities: GeoAssoc  auth: true
     */
    @PostMapping("/webtools/control/deleteGeoAssoc")
    public ResponseEntity<Map<String, Object>> deleteGeoAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.deleteGeoAssoc(body));
    }

    /**
     * Generic-entity update by entity-name (TODO unimplemented).
     * <p>service: updateGeneric  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/entity/change/{entityName}")
    public ResponseEntity<Map<String, Object>> updateGenericEntityName(@RequestBody Map<String, Object> body) {
        return wrapMap(service.updateGeneric(body));
    }

    /**
     * Generic-entity delete by PK (TODO unimplemented).
     * <p>service: updateGeneric  entities: unknown  auth: true
     */
    @DeleteMapping("/webtools/control/entity/change/{entityName}/{pkValues: .*}")
    public ResponseEntity<Map<String, Object>> updateGenericPkValues(@RequestParam Map<String, String> params) {
        return wrapMap(service.updateGeneric(Map.copyOf(params)));
    }

    /**
     * Generic-entity update by PK (TODO unimplemented).
     * <p>service: updateGeneric  entities: unknown  auth: true
     */
    @PutMapping("/webtools/control/entity/change/{entityName}/{pkValues: .*}")
    public ResponseEntity<Map<String, Object>> updateGenericPkValues2(@RequestBody Map<String, Object> body) {
        return wrapMap(service.updateGeneric(body));
    }

    // ---- Entity import/export ----

    /**
     * Exports all entities into xml files (TODO unimplemented).
     * <p>service: entityExportAll  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/entityExportAll")
    public ResponseEntity<EntityExportAllResponse> entityExportAll(@RequestBody EntityExportAllRequest request) {
        return wrap(service.entityExportAll(request));
    }

    /**
     * Imports an entity xml file or text string (TODO unimplemented).
     * <p>service: entityImport  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/entityImport")
    public ResponseEntity<EntityImportResponse> entityImport(@RequestBody EntityImportRequest request) {
        return wrap(service.entityImport(request));
    }

    /**
     * Imports all entity xml files in a directory (TODO unimplemented).
     * <p>service: entityImportDir  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/entityImportDir")
    public ResponseEntity<EntityImportDirResponse> entityImportDir(@RequestBody EntityImportDirRequest request) {
        return wrap(service.entityImportDir(request));
    }

    /**
     * Imports an entity xml file or text string by reader (TODO unimplemented).
     * <p>service: entityImportReaders  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/entityImportReaders")
    public ResponseEntity<EntityImportReadersResponse> entityImportReaders(@RequestBody EntityImportReadersRequest request) {
        return wrap(service.entityImportReaders(request));
    }

    /**
     * Apple EOModelBundle export (TODO unimplemented).
     * <p>service: exportEntityEoModelBundle  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/exportEntityEoModelBundle")
    public ResponseEntity<ExportEntityEoModelBundleResponse> exportEntityEoModelBundle(@RequestBody ExportEntityEoModelBundleRequest request) {
        return wrap(service.exportEntityEoModelBundle(request));
    }

    /**
     * Apple EOModelBundle service export (TODO unimplemented).
     * <p>service: exportServiceEoModelBundle  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/exportServiceEoModelBundle")
    public ResponseEntity<ExportServiceEoModelBundleResponse> exportServiceEoModelBundle(@RequestBody ExportServiceEoModelBundleRequest request) {
        return wrap(service.exportServiceEoModelBundle(request));
    }

    /**
     * Link Geos to another Geo.
     * <p>service: linkGeos  entities: GeoAssoc  auth: true
     */
    @PostMapping("/webtools/control/linkGeos")
    public ResponseEntity<Map<String, Object>> linkGeos(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.linkGeos(body));
    }

    /**
     * Load offline EntitySync data (TODO unimplemented).
     * <p>service: loadOfflineEntitySyncData  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/loadOfflineEntitySyncData")
    public ResponseEntity<Map<String, Object>> loadOfflineEntitySyncData(@RequestBody Map<String, Object> body) {
        return wrapMap(service.loadOfflineEntitySyncData(body));
    }

    /**
     * Test ping service.
     * <p>service: ping  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/ping")
    public ResponseEntity<Map<String, Object>> ping(@RequestBody Map<String, Object> body) {
        return wrapMap(service.ping(body));
    }

    /**
     * Reset a crashed EntitySync row from ESR_RUNNING to ESR_NOT_STARTED.
     * <p>service: resetEntitySyncStatus  entities: EntitySync  auth: true
     */
    @PostMapping("/webtools/control/resetEntitySyncStatus")
    public ResponseEntity<Map<String, Object>> resetEntitySyncStatus(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.resetEntitySyncStatus(body));
    }

    /**
     * Resets a stale job so it can be re-run.
     * <p>service: resetScheduledJob  entities: JobSandbox  auth: true
     */
    @PostMapping("/webtools/control/resetJob")
    public ResponseEntity<Map<String, Object>> resetScheduledJob(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.resetScheduledJob(body));
    }

    /**
     * <p>service: runOfflineEntitySync  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/runOfflineEntitySync")
    public ResponseEntity<Map<String, Object>> runOfflineEntitySync(@RequestBody Map<String, Object> body) {
        return wrapMap(service.runOfflineEntitySync(body));
    }

    /**
     * <p>service: saveServiceResultsToSession  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/saveServiceResultsToSession")
    public ResponseEntity<Map<String, Object>> saveServiceResultsToSession(@RequestParam Map<String, String> params) {
        return wrapMap(service.saveServiceResultsToSession(Map.copyOf(params)));
    }

    /**
     * Schedule a service for async execution. Inserts a JobSandbox row in SERVICE_PENDING status
     * (no live JobScheduler in this port — see WebtoolsService Javadoc).
     * <p>service: scheduleService  entities: JobSandbox  auth: true
     */
    @GetMapping("/webtools/control/scheduleService")
    public ResponseEntity<Map<String, Object>> scheduleService(@RequestParam Map<String, String> params) throws SQLException {
        return wrapMap(service.scheduleService(Map.copyOf(params)));
    }

    /**
     * Sync alias of scheduleService.
     * <p>service: scheduleService  entities: JobSandbox  auth: true
     */
    @GetMapping("/webtools/control/scheduleServiceSync")
    public ResponseEntity<Map<String, Object>> scheduleServiceScheduleServiceSync(@RequestParam Map<String, String> params) throws SQLException {
        return wrapMap(service.scheduleService(Map.copyOf(params)));
    }

    /**
     * <p>service: serviceStreamTest  entities: unknown  auth: false
     */
    @GetMapping("/webtools/control/streamTest")
    public ResponseEntity<Map<String, Object>> serviceStreamTest(@RequestParam Map<String, String> params) {
        return wrapMap(service.serviceStreamTest(Map.copyOf(params)));
    }

    /**
     * Update a Geo.
     * <p>service: updateGeo  entities: Geo  auth: true
     */
    @PostMapping("/webtools/control/updateGeo")
    public ResponseEntity<Map<String, Object>> updateGeo(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.updateGeo(body));
    }

    /**
     * Cancel a Job Manager Lock (entity-auto update of JobManagerLock).
     * <p>service: updateJobManagerLock  entities: JobManagerLock  auth: true
     */
    @PostMapping("/webtools/control/updateJobManagerLock")
    public ResponseEntity<Map<String, Object>> updateJobManagerLock(@RequestBody Map<String, Object> body) throws SQLException {
        return wrapMap(service.updateJobManagerLock(body));
    }

    /**
     * Not implemented in OFBiz either.
     * <p>service: updateOfflineEntitySync  entities: unknown  auth: true
     */
    @PostMapping("/webtools/control/updateOfflineEntitySync")
    public ResponseEntity<Map<String, Object>> updateOfflineEntitySync(@RequestBody Map<String, Object> body) {
        return wrapMap(service.updateOfflineEntitySync(body));
    }

    /**
     * Raw XML data-source dump.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/webtools/control/xmldsrawdump")
    public ResponseEntity<Map<String, Object>> xmldsrawdump(@RequestParam Map<String, String> params) {
        return wrapMap(service.xmldsrawdump(Map.copyOf(params)));
    }
}
