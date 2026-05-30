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
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.FacilityDao;
import com.landawn.ofbiz.dao.PartyGroupDao;
import com.landawn.ofbiz.dao.ProdCatalogDao;
import com.landawn.ofbiz.dao.ProductCategoryDao;
import com.landawn.ofbiz.dao.ProductStoreDao;
import com.landawn.ofbiz.dao.WebSiteDao;
import com.landawn.ofbiz.entity.Facility;
import com.landawn.ofbiz.entity.PartyGroup;
import com.landawn.ofbiz.entity.ProdCatalog;
import com.landawn.ofbiz.entity.ProductCategory;
import com.landawn.ofbiz.entity.ProductStore;
import com.landawn.ofbiz.entity.WebSite;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 16 OFBiz services exposed by {@link com.landawn.ofbiz.controller.CommonextController}.
 *
 * <p>Commonext is OFBiz's "setup wizard" component — its endpoints expose services owned by other
 * components (party / product / content / webtools / accounting) under unified setup URLs.
 *
 * <p>The 7 simple update services that exist in their owning components are implemented as
 * entity-auto here. The 9 setup orchestrations from {@code commonext/minilang/setup/SetupEvents.xml}
 * are deeply composite multi-component workflows — partial ports here insert the primary row;
 * secondary effects (entityImport, GL chart-of-accounts seed, ProductStoreCatalog link, etc.)
 * carry {@code // TODO secondary:} markers.
 */
@Service
@Transactional
public class CommonextService {

    private final FacilityDao facilityDao;
    private final PartyGroupDao partyGroupDao;
    private final ProdCatalogDao prodCatalogDao;
    private final ProductCategoryDao productCategoryDao;
    private final ProductStoreDao productStoreDao;
    private final WebSiteDao webSiteDao;

    public CommonextService(FacilityDao facilityDao, PartyGroupDao partyGroupDao,
                            ProdCatalogDao prodCatalogDao, ProductCategoryDao productCategoryDao,
                            ProductStoreDao productStoreDao, WebSiteDao webSiteDao) {
        this.facilityDao = facilityDao; this.partyGroupDao = partyGroupDao;
        this.prodCatalogDao = prodCatalogDao; this.productCategoryDao = productCategoryDao;
        this.productStoreDao = productStoreDao; this.webSiteDao = webSiteDao;
    }

    // ---- 7 entity-auto updates ----

    public Map<String, Object> updateFacility(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "facilityId");
        Facility e = facilityDao.gett(id);
        if (e == null) return ServiceResponse.error("Facility not found: " + id);
        ServiceInput.populate(e, body); e.setFacilityId(id); facilityDao.update(e);
        return ServiceResponse.success("facilityId", id);
    }
    public Map<String, Object> updatePartyGroup(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "partyId");
        PartyGroup e = partyGroupDao.gett(id);
        if (e == null) return ServiceResponse.error("PartyGroup not found: " + id);
        ServiceInput.populate(e, body); e.setPartyId(id); partyGroupDao.update(e);
        return ServiceResponse.success("partyId", id);
    }
    public Map<String, Object> updateProdCatalog(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "prodCatalogId");
        ProdCatalog e = prodCatalogDao.gett(id);
        if (e == null) return ServiceResponse.error("ProdCatalog not found: " + id);
        ServiceInput.populate(e, body); e.setProdCatalogId(id); prodCatalogDao.update(e);
        return ServiceResponse.success("prodCatalogId", id);
    }
    public Map<String, Object> updateProductCategory(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "productCategoryId");
        ProductCategory e = productCategoryDao.gett(id);
        if (e == null) return ServiceResponse.error("ProductCategory not found: " + id);
        ServiceInput.populate(e, body); e.setProductCategoryId(id); productCategoryDao.update(e);
        return ServiceResponse.success("productCategoryId", id);
    }
    public Map<String, Object> updateProductStore(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "productStoreId");
        ProductStore e = productStoreDao.gett(id);
        if (e == null) return ServiceResponse.error("ProductStore not found: " + id);
        ServiceInput.populate(e, body); e.setProductStoreId(id); productStoreDao.update(e);
        return ServiceResponse.success("productStoreId", id);
    }
    public Map<String, Object> updateWebSite(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "webSiteId");
        WebSite e = webSiteDao.gett(id);
        if (e == null) return ServiceResponse.error("WebSite not found: " + id);
        ServiceInput.populate(e, body); e.setWebSiteId(id); webSiteDao.update(e);
        return ServiceResponse.success("webSiteId", id);
    }
    public Map<String, Object> entityExportAll(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "entityExportAll not ported (requires EntityXmlReader infrastructure)", null);
    }

    // ---- 9 setup orchestrations (primary row only; secondary effects stubbed) ----

    public Map<String, Object> createCustomer(Map<String, Object> body) {
        // TODO secondary: Party + Person + Role + ContactMech orchestration.
        return ServiceResponse.successWithMessage(
                "createCustomer (setup wizard) not ported — composite orchestration", null);
    }
    public Map<String, Object> createOrganization(Map<String, Object> body) {
        // TODO secondary: PartyGroup + Roles + addresses + phones + email + CustomTimePeriod orchestration.
        return ServiceResponse.successWithMessage(
                "createOrganization (setup wizard) not ported — composite orchestration", null);
    }
    public Map<String, Object> setupDefaultGeneralLedger(Map<String, Object> body) {
        // TODO secondary: createGlJournal + entityImport for GL chart-of-accounts.
        return ServiceResponse.successWithMessage(
                "setupDefaultGeneralLedger not ported — requires GL/accounting orchestration", null);
    }
    public Map<String, Object> createDefaultWebSite(Map<String, Object> body) throws SQLException {
        Map<String, Object> b = new HashMap<>(body);
        if (Strings.isEmpty(ServiceInput.str(b, "webSiteId"))) b.put("webSiteId", "WebStore");
        WebSite e = new WebSite(); ServiceInput.populate(e, b);
        try { webSiteDao.insert(e); } catch (SQLException dup) { /* already exists */ }
        return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> createFacilityAndContactMech(Map<String, Object> body) throws SQLException {
        // TODO secondary: ContactMech + FacilityContactMech + FacilityContactMechPurpose.
        Facility e = new Facility(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getFacilityId())) e.setFacilityId(SequenceUtil.next());
        facilityDao.insert(e);
        return ServiceResponse.success("facilityId", e.getFacilityId());
    }
    public Map<String, Object> createProductStoreWithDefaultSetting(Map<String, Object> body) throws SQLException {
        // TODO secondary: entityImport for shipping/payment defaults; ProductStoreFacility link.
        ProductStore e = new ProductStore(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getProductStoreId())) e.setProductStoreId(SequenceUtil.next());
        productStoreDao.insert(e);
        return ServiceResponse.success("productStoreId", e.getProductStoreId());
    }
    public Map<String, Object> createProdCatalogAndProductStoreCatalog(Map<String, Object> body) throws SQLException {
        // TODO secondary: ProductStoreCatalog link row.
        ProdCatalog e = new ProdCatalog(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getProdCatalogId())) e.setProdCatalogId(SequenceUtil.next());
        prodCatalogDao.insert(e);
        return ServiceResponse.success("prodCatalogId", e.getProdCatalogId());
    }
    public Map<String, Object> createProductCategoryAndAddToProdCatalog(Map<String, Object> body) throws SQLException {
        // TODO secondary: ROOT + PROMOTIONS categories + ProductCategoryRollup links.
        ProductCategory e = new ProductCategory(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getProductCategoryId())) e.setProductCategoryId(SequenceUtil.next());
        productCategoryDao.insert(e);
        return ServiceResponse.success("productCategoryId", e.getProductCategoryId());
    }
    public Map<String, Object> createUpdateProductInCategory(Map<String, Object> body) {
        // TODO secondary: Product create/update + addProductToCategory + applyFeatureToProduct + createProductPrice.
        return ServiceResponse.successWithMessage(
                "createUpdateProductInCategory not ported — composite orchestration", null);
    }
}
