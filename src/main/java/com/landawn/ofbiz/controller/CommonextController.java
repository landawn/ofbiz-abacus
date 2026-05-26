package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.util.ServiceInput;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.content.UpdateWebSiteRequest;
import com.landawn.ofbiz.model.content.UpdateWebSiteResponse;
import com.landawn.ofbiz.model.party.UpdatePartyGroupRequest;
import com.landawn.ofbiz.model.party.UpdatePartyGroupResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityResponse;
import com.landawn.ofbiz.model.product.UpdateProdCatalogRequest;
import com.landawn.ofbiz.model.product.UpdateProdCatalogResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateProductCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreResponse;
import com.landawn.ofbiz.model.webtools.EntityExportAllRequest;
import com.landawn.ofbiz.model.webtools.EntityExportAllResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/commonext")
public class CommonextController {

    private final com.landawn.ofbiz.service.CommonextService service;

    public CommonextController(com.landawn.ofbiz.service.CommonextService service) {
        this.service = service;
    }

    /** 200/400 routing for typed responses. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /** Convert a service-result map into a typed response and wrap. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(
            Map<String, Object> result, java.util.function.Supplier<T> factory) {
        return wrap(com.landawn.ofbiz.service.ServiceResponse.toDto(result, factory));
    }

    /** 200/400 routing for loosely-typed Map responses. */
    private static ResponseEntity<Map<String, Object>> wrapMap(Map<String, Object> result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * No description.
     * <p>service: createFacilityAndContactMech  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/CreateFacility")
    public ResponseEntity<Map<String, Object>> createFacilityAndContactMech(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createFacilityAndContactMech(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setupDefaultGeneralLedger  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/OrganizationToComplete")
    public ResponseEntity<Map<String, Object>> setupDefaultGeneralLedger(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setupDefaultGeneralLedger(java.util.Map.copyOf(params)));
    }

    /**
     * Update a Facility
     * <p>service: updateFacility  entities: Facility  auth: true
     */
    @PostMapping("/ofbizsetup/control/UpdateFacility")
    public ResponseEntity<UpdateFacilityResponse> updateFacility(@RequestBody UpdateFacilityRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateFacility(ServiceInput.toMap(request));
        return wrap(result, UpdateFacilityResponse::new);
    }

    /**
     * No description.
     * <p>service: createCustomer  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createCustomer")
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCustomer(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createOrganization  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createOrganization")
    public ResponseEntity<Map<String, Object>> createOrganization(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createOrganization(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createProdCatalogAndProductStoreCatalog  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createProdCatalog")
    public ResponseEntity<Map<String, Object>> createProdCatalogAndProductStoreCatalog(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createProdCatalogAndProductStoreCatalog(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createProductCategoryAndAddToProdCatalog  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createProductCategory")
    public ResponseEntity<Map<String, Object>> createProductCategoryAndAddToProdCatalog(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createProductCategoryAndAddToProdCatalog(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createProductStoreWithDefaultSetting  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createProductStore")
    public ResponseEntity<Map<String, Object>> createProductStoreWithDefaultSetting(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createProductStoreWithDefaultSetting(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createUpdateProductInCategory  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createUpdateProduct")
    public ResponseEntity<Map<String, Object>> createUpdateProductInCategory(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createUpdateProductInCategory(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createDefaultWebSite  entities: unknown  auth: true
     */
    @GetMapping("/ofbizsetup/control/createWebSite")
    public ResponseEntity<Map<String, Object>> createDefaultWebSite(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createDefaultWebSite(java.util.Map.copyOf(params)));
    }

    /**
     * Exports all entities into xml files
     * <p>service: entityExportAll  entities: unknown  auth: true
     */
    @PostMapping("/ofbizsetup/control/entityExportAll")
    public ResponseEntity<EntityExportAllResponse> entityExportAll(@RequestBody EntityExportAllRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.entityExportAll(ServiceInput.toMap(request));
        return wrap(result, EntityExportAllResponse::new);
    }

    /**
     * Update a PartyGroup
     * <p>service: updatePartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/ofbizsetup/control/updatePartyGroup")
    public ResponseEntity<UpdatePartyGroupResponse> updatePartyGroup(@RequestBody UpdatePartyGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyGroup(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyGroupResponse::new);
    }

    /**
     * Update an ProdCatalog
     * <p>service: updateProdCatalog  entities: ProdCatalog  auth: true
     */
    @PostMapping("/ofbizsetup/control/updateProdCatalog")
    public ResponseEntity<UpdateProdCatalogResponse> updateProdCatalog(@RequestBody UpdateProdCatalogRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProdCatalog(ServiceInput.toMap(request));
        return wrap(result, UpdateProdCatalogResponse::new);
    }

    /**
     * Update an ProductCategory
     * <p>service: updateProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/ofbizsetup/control/updateProductCategory")
    public ResponseEntity<UpdateProductCategoryResponse> updateProductCategory(@RequestBody UpdateProductCategoryRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductCategory(ServiceInput.toMap(request));
        return wrap(result, UpdateProductCategoryResponse::new);
    }

    /**
     * Update a Product Store
     * <p>service: updateProductStore  entities: ProductStore  auth: true
     */
    @PostMapping("/ofbizsetup/control/updateProductStore")
    public ResponseEntity<UpdateProductStoreResponse> updateProductStore(@RequestBody UpdateProductStoreRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductStore(ServiceInput.toMap(request));
        return wrap(result, UpdateProductStoreResponse::new);
    }

    /**
     * Update a WebSite
     * <p>service: updateWebSite  entities: WebSite  auth: true
     */
    @PostMapping("/ofbizsetup/control/updateWebSite")
    public ResponseEntity<UpdateWebSiteResponse> updateWebSite(@RequestBody UpdateWebSiteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateWebSite(ServiceInput.toMap(request));
        return wrap(result, UpdateWebSiteResponse::new);
    }
}
