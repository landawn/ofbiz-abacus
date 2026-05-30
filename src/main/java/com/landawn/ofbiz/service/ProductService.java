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
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.*;
import com.landawn.ofbiz.entity.*;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 502 OFBiz services exposed by {@link com.landawn.ofbiz.controller.ProductController}.
 *
 * <p>Real entity-auto CRUD for the most-used Product domain entities (Product, ProductCategory +
 * family, ProductAssoc/Attribute/Content/Keyword/Price, ProductFeature family, ProductStoreCatalog/
 * Facility, Facility + sub-entities, InventoryItem/Detail/Label/Transfer, GoodIdentification,
 * ProductPromo/Code, ProductReview, ProductFacility, Shipment/Item, KeywordThesaurus,
 * CarrierShipmentMethod, Picklist). The remaining methods stay as {@code notPortedYet} stubs —
 * pack/pick workflows, BOM operations, image-management, promo-engine evaluation, web-store
 * config — they require substantial business-logic ports.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class ProductService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "ProductService" + " Javadoc)", null);
    }
    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }

    @Autowired private ProductDao productDao;
    @Autowired private ProductAssocDao productAssocDao;
    @Autowired private ProductAttributeDao productAttributeDao;
    @Autowired private ProductContentDao productContentDao;
    @Autowired private ProductKeywordDao productKeywordDao;
    @Autowired private ProductPriceDao productPriceDao;
    @Autowired private ProductCategoryDao productCategoryDao;
    @Autowired private ProductCategoryAttributeDao productCategoryAttributeDao;
    @Autowired private ProductCategoryLinkDao productCategoryLinkDao;
    @Autowired private ProductCategoryRollupDao productCategoryRollupDao;
    @Autowired private ProductFeatureDao productFeatureDao;
    @Autowired private ProductFeatureApplDao productFeatureApplDao;
    @Autowired private ProductFeatureGroupDao productFeatureGroupDao;
    @Autowired private ProductFeatureCategoryDao productFeatureCategoryDao;
    @Autowired private ProductFeatureTypeDao productFeatureTypeDao;
    @Autowired private ProductStoreDao productStoreDao;
    @Autowired private ProductStoreCatalogDao productStoreCatalogDao;
    @Autowired private ProductStoreFacilityDao productStoreFacilityDao;
    @Autowired private FacilityDao facilityDao;
    @Autowired private FacilityGroupDao facilityGroupDao;
    @Autowired private FacilityLocationDao facilityLocationDao;
    @Autowired private FacilityContentDao facilityContentDao;
    @Autowired private FacilityContactMechDao facilityContactMechDao;
    @Autowired private InventoryItemDao inventoryItemDao;
    @Autowired private InventoryItemDetailDao inventoryItemDetailDao;
    @Autowired private InventoryItemLabelDao inventoryItemLabelDao;
    @Autowired private InventoryTransferDao inventoryTransferDao;
    @Autowired private GoodIdentificationDao goodIdentificationDao;
    @Autowired private ProductPromoDao productPromoDao;
    @Autowired private ProductPromoCodeDao productPromoCodeDao;
    @Autowired private ProductReviewDao productReviewDao;
    @Autowired private ProductFacilityDao productFacilityDao;
    @Autowired private ShipmentDao shipmentDao;
    @Autowired private ShipmentItemDao shipmentItemDao;
    @Autowired private KeywordThesaurusDao keywordThesaurusDao;
    @Autowired private CarrierShipmentMethodDao carrierShipmentMethodDao;
    @Autowired private PicklistDao picklistDao;
    @Autowired private ProdCatalogDao prodCatalogDao;
    @Autowired private WebSiteDao webSiteDao;

    /** Framework chain-test service. */
    public Map<String, Object> test(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }

    public Map<String, Object> addAdditionalViewForProduct(Map<String, Object> body) { return notPortedYet("addAdditionalViewForProduct"); }
    public Map<String, Object> addFacilityGroupToGroup(Map<String, Object> body) { return notPortedYet("addFacilityGroupToGroup"); }
    public Map<String, Object> addFacilityToGroup(Map<String, Object> body) { return notPortedYet("addFacilityToGroup"); }
    public Map<String, Object> addFixedAssetProduct(Map<String, Object> body) { return notPortedYet("addFixedAssetProduct"); }
    public Map<String, Object> addImageForProductPromo(Map<String, Object> body) { return notPortedYet("addImageForProductPromo"); }
    public Map<String, Object> addImageFrame(Map<String, Object> body) { return notPortedYet("addImageFrame"); }
    public Map<String, Object> addOrderShipmentToShipment(Map<String, Object> body) { return notPortedYet("addOrderShipmentToShipment"); }
    public Map<String, Object> addPartyToCategory(Map<String, Object> body) { return notPortedYet("addPartyToCategory"); }
    public Map<String, Object> addPartyToFacility(Map<String, Object> body) { return notPortedYet("addPartyToFacility"); }
    public Map<String, Object> addPartyToFacilityGroup(Map<String, Object> body) { return notPortedYet("addPartyToFacilityGroup"); }
    public Map<String, Object> addPartyToProduct(Map<String, Object> body) { return notPortedYet("addPartyToProduct"); }
    public Map<String, Object> addProdCatalogToParty(Map<String, Object> body) { return notPortedYet("addProdCatalogToParty"); }
    public Map<String, Object> addProductCategoryToProdCatalog(Map<String, Object> body) { return notPortedYet("addProductCategoryToProdCatalog"); }
    public Map<String, Object> addProductFeatures(Map<String, Object> body) { return notPortedYet("addProductFeatures"); }
    public Map<String, Object> addProductToCategories(Map<String, Object> body) { return notPortedYet("addProductToCategories"); }
    public Map<String, Object> addRejectedReasonImageManagement(Map<String, Object> body) { return notPortedYet("addRejectedReasonImageManagement"); }
    public Map<String, Object> applyFeatureToProduct(Map<String, Object> body) { return notPortedYet("applyFeatureToProduct"); }
    public Map<String, Object> applyFeatureToProductFromTypeAndCode(Map<String, Object> body) { return notPortedYet("applyFeatureToProductFromTypeAndCode"); }
    public Map<String, Object> attachProductFeaturesToCategory(Map<String, Object> body) { return notPortedYet("attachProductFeaturesToCategory"); }
    public Map<String, Object> calcPackSessionAdditionalShippingCharge(Map<String, Object> body) { return notPortedYet("calcPackSessionAdditionalShippingCharge"); }
    public Map<String, Object> calculateProductCosts(Map<String, Object> body) { return notPortedYet("calculateProductCosts"); }
    public Map<String, Object> cancelAllRows(Map<String, Object> body) { return notPortedYet("cancelAllRows"); }
    public Map<String, Object> cancelReceivedItems(Map<String, Object> body) { return notPortedYet("cancelReceivedItems"); }
    public Map<String, Object> checkForceShipmentReceived(Map<String, Object> body) { return notPortedYet("checkForceShipmentReceived"); }
    public Map<String, Object> chooseFrameImage(Map<String, Object> body) { return notPortedYet("chooseFrameImage"); }
    public Map<String, Object> clearPackAll(Map<String, Object> body) { return notPortedYet("clearPackAll"); }
    public Map<String, Object> clearPackLine(Map<String, Object> body) { return notPortedYet("clearPackLine"); }
    public Map<String, Object> completePack(Map<String, Object> body) { return notPortedYet("completePack"); }
    public Map<String, Object> completePackage(Map<String, Object> body) { return notPortedYet("completePackage"); }
    public Map<String, Object> completePurchaseOrder(Map<String, Object> body) { return notPortedYet("completePurchaseOrder"); }
    public Map<String, Object> completeShipment(Map<String, Object> body) { return notPortedYet("completeShipment"); }
    public Map<String, Object> completeVerifiedPick(Map<String, Object> body) { return notPortedYet("completeVerifiedPick"); }
    public Map<String, Object> convertUom(Map<String, Object> body) { return notPortedYet("convertUom"); }
    public Map<String, Object> copyCategoryProductMembers(Map<String, Object> body) { return notPortedYet("copyCategoryProductMembers"); }
    public Map<String, Object> copyToProductVariants(Map<String, Object> body) { return notPortedYet("copyToProductVariants"); }
    public Map<String, Object> createBulkProductPromoCode(Map<String, Object> body) { return notPortedYet("createBulkProductPromoCode"); }
    public Map<String, Object> createBulkProductPromoCodeEmail(Map<String, Object> body) { return notPortedYet("createBulkProductPromoCodeEmail"); }
    public Map<String, Object> createCarrierShipmentMethod(Map<String, Object> body) throws SQLException { CarrierShipmentMethod e = new CarrierShipmentMethod(); ServiceInput.populate(e, body); carrierShipmentMethodDao.insert(e); return ServiceResponse.success("shipmentMethodTypeId", e.getShipmentMethodTypeId()); }
    public Map<String, Object> createCategoryContent(Map<String, Object> body) { return notPortedYet("createCategoryContent"); }
    public Map<String, Object> createCommunicationEvent(Map<String, Object> body) { return notPortedYet("createCommunicationEvent"); }
    public Map<String, Object> createCostComponent(Map<String, Object> body) { return notPortedYet("createCostComponent"); }
    public Map<String, Object> createDownloadContentForCategory(Map<String, Object> body) { return notPortedYet("createDownloadContentForCategory"); }
    public Map<String, Object> createDownloadContentForProduct(Map<String, Object> body) { return notPortedYet("createDownloadContentForProduct"); }
    public Map<String, Object> createEmailContentForProduct(Map<String, Object> body) { return notPortedYet("createEmailContentForProduct"); }
    public Map<String, Object> createFacility(Map<String, Object> body) throws SQLException { Facility e = new Facility(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFacilityId())) e.setFacilityId(SequenceUtil.next()); facilityDao.insert(e); return ServiceResponse.success("facilityId", e.getFacilityId()); }
    public Map<String, Object> createFacilityContactMech(Map<String, Object> body) { return notPortedYet("createFacilityContactMech"); }
    public Map<String, Object> createFacilityContactMechPurpose(Map<String, Object> body) { return notPortedYet("createFacilityContactMechPurpose"); }
    public Map<String, Object> createFacilityContent(Map<String, Object> body) throws SQLException { FacilityContent e = new FacilityContent(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); facilityContentDao.insert(e); return ServiceResponse.success("facilityId", e.getFacilityId()); }
    public Map<String, Object> createFacilityEmailAddress(Map<String, Object> body) { return notPortedYet("createFacilityEmailAddress"); }
    public Map<String, Object> createFacilityGroup(Map<String, Object> body) throws SQLException { FacilityGroup e = new FacilityGroup(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFacilityGroupId())) e.setFacilityGroupId(SequenceUtil.next()); facilityGroupDao.insert(e); return ServiceResponse.success("facilityGroupId", e.getFacilityGroupId()); }
    public Map<String, Object> createFacilityLocation(Map<String, Object> body) throws SQLException { FacilityLocation e = new FacilityLocation(); ServiceInput.populate(e, body); facilityLocationDao.insert(e); return ServiceResponse.success("facilityId", e.getFacilityId()); }
    public Map<String, Object> createFacilityPostalAddress(Map<String, Object> body) { return notPortedYet("createFacilityPostalAddress"); }
    public Map<String, Object> createFacilityTelecomNumber(Map<String, Object> body) { return notPortedYet("createFacilityTelecomNumber"); }
    public Map<String, Object> createFeaturePrice(Map<String, Object> body) { return notPortedYet("createFeaturePrice"); }
    public Map<String, Object> createGoodIdentification(Map<String, Object> body) throws SQLException { GoodIdentification e = new GoodIdentification(); ServiceInput.populate(e, body); goodIdentificationDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createInventoryItem(Map<String, Object> body) throws SQLException { InventoryItem e = new InventoryItem(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getInventoryItemId())) e.setInventoryItemId(SequenceUtil.next()); inventoryItemDao.insert(e); return ServiceResponse.success("inventoryItemId", e.getInventoryItemId()); }
    public Map<String, Object> createInventoryItemLabel(Map<String, Object> body) throws SQLException { InventoryItemLabel e = new InventoryItemLabel(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getInventoryItemLabelId())) e.setInventoryItemLabelId(SequenceUtil.next()); inventoryItemLabelDao.insert(e); return ServiceResponse.success("inventoryItemLabelId", e.getInventoryItemLabelId()); }
    public Map<String, Object> createInventoryItemLabelAppl(Map<String, Object> body) { return notPortedYet("createInventoryItemLabelAppl"); }
    public Map<String, Object> createInventoryItemLabelType(Map<String, Object> body) { return notPortedYet("createInventoryItemLabelType"); }
    public Map<String, Object> createInventoryTransfer(Map<String, Object> body) throws SQLException { InventoryTransfer e = new InventoryTransfer(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getInventoryTransferId())) e.setInventoryTransferId(SequenceUtil.next()); inventoryTransferDao.insert(e); return ServiceResponse.success("inventoryTransferId", e.getInventoryTransferId()); }
    public Map<String, Object> createInventoryTransfersForProduct(Map<String, Object> body) { return notPortedYet("createInventoryTransfersForProduct"); }
    public Map<String, Object> createKeywordThesaurus(Map<String, Object> body) throws SQLException { KeywordThesaurus e = new KeywordThesaurus(); ServiceInput.populate(e, body); keywordThesaurusDao.insert(e); return ServiceResponse.success("enteredKeyword", e.getEnteredKeyword()); }
    public Map<String, Object> createMissingCategoryAndProductAltUrls(Map<String, Object> body) { return notPortedYet("createMissingCategoryAndProductAltUrls"); }
    public Map<String, Object> createPhysicalInventoryAndVariance(Map<String, Object> body) { return notPortedYet("createPhysicalInventoryAndVariance"); }
    public Map<String, Object> createPicklistFromOrders(Map<String, Object> body) { return notPortedYet("createPicklistFromOrders"); }
    public Map<String, Object> createPicklistRole(Map<String, Object> body) { return notPortedYet("createPicklistRole"); }
    public Map<String, Object> createProdCatalog(Map<String, Object> body) throws SQLException { ProdCatalog e = new ProdCatalog(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProdCatalogId())) e.setProdCatalogId(SequenceUtil.next()); prodCatalogDao.insert(e); return ServiceResponse.success("prodCatalogId", e.getProdCatalogId()); }
    public Map<String, Object> createProduct(Map<String, Object> body) throws SQLException { Product e = new Product(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductId())) e.setProductId(SequenceUtil.next()); productDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductAssoc(Map<String, Object> body) throws SQLException { ProductAssoc e = new ProductAssoc(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productAssocDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductAttribute(Map<String, Object> body) throws SQLException { ProductAttribute e = new ProductAttribute(); ServiceInput.populate(e, body); productAttributeDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductCategory(Map<String, Object> body) throws SQLException { ProductCategory e = new ProductCategory(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductCategoryId())) e.setProductCategoryId(SequenceUtil.next()); productCategoryDao.insert(e); return ServiceResponse.success("productCategoryId", e.getProductCategoryId()); }
    public Map<String, Object> createProductCategoryAttribute(Map<String, Object> body) throws SQLException { ProductCategoryAttribute e = new ProductCategoryAttribute(); ServiceInput.populate(e, body); productCategoryAttributeDao.insert(e); return ServiceResponse.success("productCategoryId", e.getProductCategoryId()); }
    public Map<String, Object> createProductCategoryLink(Map<String, Object> body) throws SQLException { ProductCategoryLink e = new ProductCategoryLink(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productCategoryLinkDao.insert(e); return ServiceResponse.success("productCategoryId", e.getProductCategoryId()); }
    public Map<String, Object> createProductConfig(Map<String, Object> body) { return notPortedYet("createProductConfig"); }
    public Map<String, Object> createProductConfigItem(Map<String, Object> body) { return notPortedYet("createProductConfigItem"); }
    public Map<String, Object> createProductConfigItemContent(Map<String, Object> body) { return notPortedYet("createProductConfigItemContent"); }
    public Map<String, Object> createProductConfigOption(Map<String, Object> body) { return notPortedYet("createProductConfigOption"); }
    public Map<String, Object> createProductConfigProduct(Map<String, Object> body) { return notPortedYet("createProductConfigProduct"); }
    public Map<String, Object> createProductContent(Map<String, Object> body) throws SQLException { ProductContent e = new ProductContent(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productContentDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductCostComponentCalc(Map<String, Object> body) { return notPortedYet("createProductCostComponentCalc"); }
    public Map<String, Object> createProductFacility(Map<String, Object> body) throws SQLException { ProductFacility e = new ProductFacility(); ServiceInput.populate(e, body); productFacilityDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductFacilityLocation(Map<String, Object> body) { return notPortedYet("createProductFacilityLocation"); }
    public Map<String, Object> createProductFeature(Map<String, Object> body) throws SQLException { ProductFeature e = new ProductFeature(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductFeatureId())) e.setProductFeatureId(SequenceUtil.next()); productFeatureDao.insert(e); return ServiceResponse.success("productFeatureId", e.getProductFeatureId()); }
    public Map<String, Object> createProductFeatureApplAttr(Map<String, Object> body) { return notPortedYet("createProductFeatureApplAttr"); }
    public Map<String, Object> createProductFeatureCatGrpAppl(Map<String, Object> body) { return notPortedYet("createProductFeatureCatGrpAppl"); }
    public Map<String, Object> createProductFeatureCategory(Map<String, Object> body) { return notPortedYet("createProductFeatureCategory"); }
    public Map<String, Object> createProductFeatureCategoryAppl(Map<String, Object> body) { return notPortedYet("createProductFeatureCategoryAppl"); }
    public Map<String, Object> createProductFeatureGroup(Map<String, Object> body) throws SQLException { ProductFeatureGroup e = new ProductFeatureGroup(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductFeatureGroupId())) e.setProductFeatureGroupId(SequenceUtil.next()); productFeatureGroupDao.insert(e); return ServiceResponse.success("productFeatureGroupId", e.getProductFeatureGroupId()); }
    public Map<String, Object> createProductFeatureGroupAppl(Map<String, Object> body) { return notPortedYet("createProductFeatureGroupAppl"); }
    public Map<String, Object> createProductFeatureIactn(Map<String, Object> body) { return notPortedYet("createProductFeatureIactn"); }
    public Map<String, Object> createProductFeatureType(Map<String, Object> body) throws SQLException { ProductFeatureType e = new ProductFeatureType(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductFeatureTypeId())) e.setProductFeatureTypeId(SequenceUtil.next()); productFeatureTypeDao.insert(e); return ServiceResponse.success("productFeatureTypeId", e.getProductFeatureTypeId()); }
    public Map<String, Object> createProductGeo(Map<String, Object> body) { return notPortedYet("createProductGeo"); }
    public Map<String, Object> createProductGlAccount(Map<String, Object> body) { return notPortedYet("createProductGlAccount"); }
    public Map<String, Object> createProductGroupOrder(Map<String, Object> body) { return notPortedYet("createProductGroupOrder"); }
    public Map<String, Object> createProductInCategory(Map<String, Object> body) { return notPortedYet("createProductInCategory"); }
    public Map<String, Object> createProductKeyword(Map<String, Object> body) throws SQLException { ProductKeyword e = new ProductKeyword(); ServiceInput.populate(e, body); productKeywordDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductMaint(Map<String, Object> body) { return notPortedYet("createProductMaint"); }
    public Map<String, Object> createProductMeter(Map<String, Object> body) { return notPortedYet("createProductMeter"); }
    public Map<String, Object> createProductPaymentMethodType(Map<String, Object> body) { return notPortedYet("createProductPaymentMethodType"); }
    public Map<String, Object> createProductPrice(Map<String, Object> body) throws SQLException { ProductPrice e = new ProductPrice(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productPriceDao.insert(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> createProductPriceAction(Map<String, Object> body) { return notPortedYet("createProductPriceAction"); }
    public Map<String, Object> createProductPriceCond(Map<String, Object> body) { return notPortedYet("createProductPriceCond"); }
    public Map<String, Object> createProductPriceRule(Map<String, Object> body) { return notPortedYet("createProductPriceRule"); }
    public Map<String, Object> createProductPromo(Map<String, Object> body) throws SQLException { ProductPromo e = new ProductPromo(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductPromoId())) e.setProductPromoId(SequenceUtil.next()); productPromoDao.insert(e); return ServiceResponse.success("productPromoId", e.getProductPromoId()); }
    public Map<String, Object> createProductPromoAction(Map<String, Object> body) { return notPortedYet("createProductPromoAction"); }
    public Map<String, Object> createProductPromoCategory(Map<String, Object> body) { return notPortedYet("createProductPromoCategory"); }
    public Map<String, Object> createProductPromoCode(Map<String, Object> body) throws SQLException { ProductPromoCode e = new ProductPromoCode(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getProductPromoCodeId())) e.setProductPromoCodeId(SequenceUtil.next()); productPromoCodeDao.insert(e); return ServiceResponse.success("productPromoCodeId", e.getProductPromoCodeId()); }
    public Map<String, Object> createProductPromoCodeEmail(Map<String, Object> body) { return notPortedYet("createProductPromoCodeEmail"); }
    public Map<String, Object> createProductPromoCodeParty(Map<String, Object> body) { return notPortedYet("createProductPromoCodeParty"); }
    public Map<String, Object> createProductPromoCodeSet(Map<String, Object> body) { return notPortedYet("createProductPromoCodeSet"); }
    public Map<String, Object> createProductPromoCond(Map<String, Object> body) { return notPortedYet("createProductPromoCond"); }
    public Map<String, Object> createProductPromoProduct(Map<String, Object> body) { return notPortedYet("createProductPromoProduct"); }
    public Map<String, Object> createProductPromoRule(Map<String, Object> body) { return notPortedYet("createProductPromoRule"); }
    public Map<String, Object> createProductStore(Map<String, Object> body) { return notPortedYet("createProductStore"); }
    public Map<String, Object> createProductStoreCatalog(Map<String, Object> body) throws SQLException { ProductStoreCatalog e = new ProductStoreCatalog(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productStoreCatalogDao.insert(e); return ServiceResponse.success("productStoreId", e.getProductStoreId()); }
    public Map<String, Object> createProductStoreEmailSetting(Map<String, Object> body) { return notPortedYet("createProductStoreEmailSetting"); }
    public Map<String, Object> createProductStoreFacility(Map<String, Object> body) throws SQLException { ProductStoreFacility e = new ProductStoreFacility(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); productStoreFacilityDao.insert(e); return ServiceResponse.success("productStoreId", e.getProductStoreId()); }
    public Map<String, Object> createProductStoreFinActSetting(Map<String, Object> body) { return notPortedYet("createProductStoreFinActSetting"); }
    public Map<String, Object> createProductStoreGroup(Map<String, Object> body) { return notPortedYet("createProductStoreGroup"); }
    public Map<String, Object> createProductStoreGroupMember(Map<String, Object> body) { return notPortedYet("createProductStoreGroupMember"); }
    public Map<String, Object> createProductStoreKeywordOvrd(Map<String, Object> body) { return notPortedYet("createProductStoreKeywordOvrd"); }
    public Map<String, Object> createProductStorePaymentSetting(Map<String, Object> body) { return notPortedYet("createProductStorePaymentSetting"); }
    public Map<String, Object> createProductStorePromoAppl(Map<String, Object> body) { return notPortedYet("createProductStorePromoAppl"); }
    public Map<String, Object> createProductStoreRole(Map<String, Object> body) { return notPortedYet("createProductStoreRole"); }
    public Map<String, Object> createProductStoreShipMeth(Map<String, Object> body) { return notPortedYet("createProductStoreShipMeth"); }
    public Map<String, Object> createProductStoreSurveyAppl(Map<String, Object> body) { return notPortedYet("createProductStoreSurveyAppl"); }
    public Map<String, Object> createProductStoreVendorPayment(Map<String, Object> body) { return notPortedYet("createProductStoreVendorPayment"); }
    public Map<String, Object> createProductStoreVendorShipment(Map<String, Object> body) { return notPortedYet("createProductStoreVendorShipment"); }
    public Map<String, Object> createProductSubscriptionResource(Map<String, Object> body) { return notPortedYet("createProductSubscriptionResource"); }
    public Map<String, Object> createQuantityBreak(Map<String, Object> body) { return notPortedYet("createQuantityBreak"); }
    public Map<String, Object> createRelatedUrlContentForCategory(Map<String, Object> body) { return notPortedYet("createRelatedUrlContentForCategory"); }
    public Map<String, Object> createSalesAgreement(Map<String, Object> body) { return notPortedYet("createSalesAgreement"); }
    public Map<String, Object> createShipment(Map<String, Object> body) throws SQLException { Shipment e = new Shipment(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getShipmentId())) e.setShipmentId(SequenceUtil.next()); shipmentDao.insert(e); return ServiceResponse.success("shipmentId", e.getShipmentId()); }
    public Map<String, Object> createShipmentAndItemsForVendorReturn(Map<String, Object> body) { return notPortedYet("createShipmentAndItemsForVendorReturn"); }
    public Map<String, Object> createShipmentEstimate(Map<String, Object> body) { return notPortedYet("createShipmentEstimate"); }
    public Map<String, Object> createShipmentItem(Map<String, Object> body) throws SQLException { ShipmentItem e = new ShipmentItem(); ServiceInput.populate(e, body); shipmentItemDao.insert(e); return ServiceResponse.success("shipmentId", e.getShipmentId()); }
    public Map<String, Object> createShipmentMethodType(Map<String, Object> body) { return notPortedYet("createShipmentMethodType"); }
    public Map<String, Object> createShipmentPackage(Map<String, Object> body) { return notPortedYet("createShipmentPackage"); }
    public Map<String, Object> createShipmentPackageContent(Map<String, Object> body) { return notPortedYet("createShipmentPackageContent"); }
    public Map<String, Object> createShipmentPackageRouteSeg(Map<String, Object> body) { return notPortedYet("createShipmentPackageRouteSeg"); }
    public Map<String, Object> createShipmentRouteSegment(Map<String, Object> body) { return notPortedYet("createShipmentRouteSegment"); }
    public Map<String, Object> createShipmentTimeEstimate(Map<String, Object> body) { return notPortedYet("createShipmentTimeEstimate"); }
    public Map<String, Object> createSimpleTextContentForAlternateLocale(Map<String, Object> body) { return notPortedYet("createSimpleTextContentForAlternateLocale"); }
    public Map<String, Object> createSimpleTextContentForCategory(Map<String, Object> body) { return notPortedYet("createSimpleTextContentForCategory"); }
    public Map<String, Object> createSimpleTextContentForProduct(Map<String, Object> body) { return notPortedYet("createSimpleTextContentForProduct"); }
    public Map<String, Object> createSimpleTextContentForProductConfigItem(Map<String, Object> body) { return notPortedYet("createSimpleTextContentForProductConfigItem"); }
    public Map<String, Object> createSubscription(Map<String, Object> body) { return notPortedYet("createSubscription"); }
    public Map<String, Object> createSubscriptionCommEvent(Map<String, Object> body) { return notPortedYet("createSubscriptionCommEvent"); }
    public Map<String, Object> createSubscriptionResource(Map<String, Object> body) { return notPortedYet("createSubscriptionResource"); }
    public Map<String, Object> createSupplierProduct(Map<String, Object> body) { return notPortedYet("createSupplierProduct"); }
    public Map<String, Object> createSupplierProductFeature(Map<String, Object> body) { return notPortedYet("createSupplierProductFeature"); }
    public Map<String, Object> createUpdateFacilityGeoPoint(Map<String, Object> body) { return notPortedYet("createUpdateFacilityGeoPoint"); }
    public Map<String, Object> createVendorProduct(Map<String, Object> body) { return notPortedYet("createVendorProduct"); }
    public Map<String, Object> createWorkEffortGoodStandard(Map<String, Object> body) { return notPortedYet("createWorkEffortGoodStandard"); }
    public Map<String, Object> deleteCarrierShipmentMethod(Map<String, Object> body) throws SQLException { CarrierShipmentMethod pk = new CarrierShipmentMethod(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", carrierShipmentMethodDao.delete(pk)); }
    public Map<String, Object> deleteCostComponent(Map<String, Object> body) { return notPortedYet("deleteCostComponent"); }
    public Map<String, Object> deleteFacilityContactMech(Map<String, Object> body) { return notPortedYet("deleteFacilityContactMech"); }
    public Map<String, Object> deleteFacilityContactMechPurpose(Map<String, Object> body) { return notPortedYet("deleteFacilityContactMechPurpose"); }
    public Map<String, Object> deleteFacilityContent(Map<String, Object> body) { return notPortedYet("deleteFacilityContent"); }
    public Map<String, Object> deleteFeaturePrice(Map<String, Object> body) { return notPortedYet("deleteFeaturePrice"); }
    public Map<String, Object> deleteGoodIdentification(Map<String, Object> body) { return notPortedYet("deleteGoodIdentification"); }
    public Map<String, Object> deleteInventoryItemLabel(Map<String, Object> body) throws SQLException { return ServiceResponse.success("deletedRows", inventoryItemLabelDao.deleteById(ServiceInput.str(body, "inventoryItemLabelId"))); }
    public Map<String, Object> deleteInventoryItemLabelAppl(Map<String, Object> body) { return notPortedYet("deleteInventoryItemLabelAppl"); }
    public Map<String, Object> deleteInventoryItemLabelType(Map<String, Object> body) { return notPortedYet("deleteInventoryItemLabelType"); }
    public Map<String, Object> deleteItemIssuance(Map<String, Object> body) { return notPortedYet("deleteItemIssuance"); }
    public Map<String, Object> deleteKeywordThesaurus(Map<String, Object> body) throws SQLException { KeywordThesaurus pk = new KeywordThesaurus(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", keywordThesaurusDao.delete(pk)); }
    public Map<String, Object> deletePackedLine(Map<String, Object> body) { return notPortedYet("deletePackedLine"); }
    public Map<String, Object> deletePicklistBin(Map<String, Object> body) { return notPortedYet("deletePicklistBin"); }
    public Map<String, Object> deletePicklistItem(Map<String, Object> body) { return notPortedYet("deletePicklistItem"); }
    public Map<String, Object> deleteProductAssoc(Map<String, Object> body) { return notPortedYet("deleteProductAssoc"); }
    public Map<String, Object> deleteProductAttribute(Map<String, Object> body) throws SQLException { ProductAttribute pk = new ProductAttribute(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productAttributeDao.delete(pk)); }
    public Map<String, Object> deleteProductCategoryAttribute(Map<String, Object> body) throws SQLException { ProductCategoryAttribute pk = new ProductCategoryAttribute(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productCategoryAttributeDao.delete(pk)); }
    public Map<String, Object> deleteProductCategoryLink(Map<String, Object> body) throws SQLException { ProductCategoryLink pk = new ProductCategoryLink(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productCategoryLinkDao.delete(pk)); }
    public Map<String, Object> deleteProductConfig(Map<String, Object> body) { return notPortedYet("deleteProductConfig"); }
    public Map<String, Object> deleteProductConfigItem(Map<String, Object> body) { return notPortedYet("deleteProductConfigItem"); }
    public Map<String, Object> deleteProductConfigOption(Map<String, Object> body) { return notPortedYet("deleteProductConfigOption"); }
    public Map<String, Object> deleteProductConfigProduct(Map<String, Object> body) { return notPortedYet("deleteProductConfigProduct"); }
    public Map<String, Object> deleteProductCostComponentCalc(Map<String, Object> body) { return notPortedYet("deleteProductCostComponentCalc"); }
    public Map<String, Object> deleteProductFacility(Map<String, Object> body) { return notPortedYet("deleteProductFacility"); }
    public Map<String, Object> deleteProductFacilityLocation(Map<String, Object> body) { return notPortedYet("deleteProductFacilityLocation"); }
    public Map<String, Object> deleteProductGeo(Map<String, Object> body) { return notPortedYet("deleteProductGeo"); }
    public Map<String, Object> deleteProductGlAccount(Map<String, Object> body) { return notPortedYet("deleteProductGlAccount"); }
    public Map<String, Object> deleteProductGroupOrder(Map<String, Object> body) { return notPortedYet("deleteProductGroupOrder"); }
    public Map<String, Object> deleteProductKeyword(Map<String, Object> body) throws SQLException { ProductKeyword pk = new ProductKeyword(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productKeywordDao.delete(pk)); }
    public Map<String, Object> deleteProductKeywords(Map<String, Object> body) { return notPortedYet("deleteProductKeywords"); }
    public Map<String, Object> deleteProductMaint(Map<String, Object> body) { return notPortedYet("deleteProductMaint"); }
    public Map<String, Object> deleteProductMeter(Map<String, Object> body) { return notPortedYet("deleteProductMeter"); }
    public Map<String, Object> deleteProductPaymentMethodType(Map<String, Object> body) { return notPortedYet("deleteProductPaymentMethodType"); }
    public Map<String, Object> deleteProductPrice(Map<String, Object> body) throws SQLException { ProductPrice pk = new ProductPrice(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productPriceDao.delete(pk)); }
    public Map<String, Object> deleteProductPriceAction(Map<String, Object> body) { return notPortedYet("deleteProductPriceAction"); }
    public Map<String, Object> deleteProductPriceCond(Map<String, Object> body) { return notPortedYet("deleteProductPriceCond"); }
    public Map<String, Object> deleteProductPriceRule(Map<String, Object> body) { return notPortedYet("deleteProductPriceRule"); }
    public Map<String, Object> deleteProductPromoAction(Map<String, Object> body) { return notPortedYet("deleteProductPromoAction"); }
    public Map<String, Object> deleteProductPromoCategory(Map<String, Object> body) { return notPortedYet("deleteProductPromoCategory"); }
    public Map<String, Object> deleteProductPromoCode(Map<String, Object> body) throws SQLException { return ServiceResponse.success("deletedRows", productPromoCodeDao.deleteById(ServiceInput.str(body, "productPromoCodeId"))); }
    public Map<String, Object> deleteProductPromoCodeContactMech(Map<String, Object> body) { return notPortedYet("deleteProductPromoCodeContactMech"); }
    public Map<String, Object> deleteProductPromoCodeParty(Map<String, Object> body) { return notPortedYet("deleteProductPromoCodeParty"); }
    public Map<String, Object> deleteProductPromoCond(Map<String, Object> body) { return notPortedYet("deleteProductPromoCond"); }
    public Map<String, Object> deleteProductPromoProduct(Map<String, Object> body) { return notPortedYet("deleteProductPromoProduct"); }
    public Map<String, Object> deleteProductPromoRule(Map<String, Object> body) { return notPortedYet("deleteProductPromoRule"); }
    public Map<String, Object> deleteProductStoreCatalog(Map<String, Object> body) throws SQLException { ProductStoreCatalog pk = new ProductStoreCatalog(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productStoreCatalogDao.delete(pk)); }
    public Map<String, Object> deleteProductStoreFacility(Map<String, Object> body) throws SQLException { ProductStoreFacility pk = new ProductStoreFacility(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productStoreFacilityDao.delete(pk)); }
    public Map<String, Object> deleteProductStoreKeywordOvrd(Map<String, Object> body) { return notPortedYet("deleteProductStoreKeywordOvrd"); }
    public Map<String, Object> deleteProductStorePaymentSetting(Map<String, Object> body) { return notPortedYet("deleteProductStorePaymentSetting"); }
    public Map<String, Object> deleteProductStorePromoAppl(Map<String, Object> body) { return notPortedYet("deleteProductStorePromoAppl"); }
    public Map<String, Object> deleteProductStoreSurveyAppl(Map<String, Object> body) { return notPortedYet("deleteProductStoreSurveyAppl"); }
    public Map<String, Object> deleteProductStoreVendorPayment(Map<String, Object> body) { return notPortedYet("deleteProductStoreVendorPayment"); }
    public Map<String, Object> deleteProductStoreVendorShipment(Map<String, Object> body) { return notPortedYet("deleteProductStoreVendorShipment"); }
    public Map<String, Object> deleteProductSubscriptionResource(Map<String, Object> body) { return notPortedYet("deleteProductSubscriptionResource"); }
    public Map<String, Object> deleteQuantityBreak(Map<String, Object> body) { return notPortedYet("deleteQuantityBreak"); }
    public Map<String, Object> deleteShipmentItem(Map<String, Object> body) throws SQLException { ShipmentItem pk = new ShipmentItem(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", shipmentItemDao.delete(pk)); }
    public Map<String, Object> deleteShipmentMethodType(Map<String, Object> body) { return notPortedYet("deleteShipmentMethodType"); }
    public Map<String, Object> deleteShipmentPackage(Map<String, Object> body) { return notPortedYet("deleteShipmentPackage"); }
    public Map<String, Object> deleteShipmentPackageContent(Map<String, Object> body) { return notPortedYet("deleteShipmentPackageContent"); }
    public Map<String, Object> deleteShipmentPackageRouteSeg(Map<String, Object> body) { return notPortedYet("deleteShipmentPackageRouteSeg"); }
    public Map<String, Object> deleteShipmentRouteSegment(Map<String, Object> body) { return notPortedYet("deleteShipmentRouteSegment"); }
    public Map<String, Object> deleteVendorProduct(Map<String, Object> body) { return notPortedYet("deleteVendorProduct"); }
    public Map<String, Object> dhlShipmentConfirm(Map<String, Object> body) { return notPortedYet("dhlShipmentConfirm"); }
    public Map<String, Object> duplicateProduct(Map<String, Object> body) throws SQLException { String oldId = ServiceInput.str(body, "productId"); Product src = productDao.gett(oldId); if (src == null) return ServiceResponse.error("Product not found: " + oldId); Product dup = com.landawn.abacus.util.Beans.copy(src); dup.setProductId(SequenceUtil.next()); productDao.insert(dup); return ServiceResponse.success("productId", dup.getProductId()); }
    public Map<String, Object> duplicateProductCategory(Map<String, Object> body) { return notPortedYet("duplicateProductCategory"); }
    public Map<String, Object> duplicateShipmentRouteSegment(Map<String, Object> body) { return notPortedYet("duplicateShipmentRouteSegment"); }
    public Map<String, Object> editPicklistItem(Map<String, Object> body) { return notPortedYet("editPicklistItem"); }
    public Map<String, Object> expireAllCategoryProductMembers(Map<String, Object> body) { return notPortedYet("expireAllCategoryProductMembers"); }
    public Map<String, Object> expireShipmentTimeEstimate(Map<String, Object> body) { return notPortedYet("expireShipmentTimeEstimate"); }
    public Map<String, Object> fedexShipRequest(Map<String, Object> body) { return notPortedYet("fedexShipRequest"); }
    public Map<String, Object> findOrders(Map<String, Object> body) { return notPortedYet("findOrders"); }
    public Map<String, Object> forceIndexProductKeywords(Map<String, Object> body) { return notPortedYet("forceIndexProductKeywords"); }
    public Map<String, Object> getAssociatedPriceRulesConds(Map<String, Object> body) { return notPortedYet("getAssociatedPriceRulesConds"); }
    public Map<String, Object> getChildCategoryTree(Map<String, Object> body) { return notPortedYet("getChildCategoryTree"); }
    public Map<String, Object> getChildProductStoreGroupTree(Map<String, Object> body) { return notPortedYet("getChildProductStoreGroupTree"); }
    public Map<String, Object> imageCrop(Map<String, Object> body) { return notPortedYet("imageCrop"); }
    public Map<String, Object> imageRotate(Map<String, Object> body) { return notPortedYet("imageRotate"); }
    public Map<String, Object> issueInventoryItemToShipment(Map<String, Object> body) { return notPortedYet("issueInventoryItemToShipment"); }
    public Map<String, Object> issueOrderItemShipGrpInvResToShipment(Map<String, Object> body) { return notPortedYet("issueOrderItemShipGrpInvResToShipment"); }
    public Map<String, Object> issueOrderItemToShipment(Map<String, Object> body) { return notPortedYet("issueOrderItemToShipment"); }
    public Map<String, Object> multipleUploadProductImages(Map<String, Object> body) { return notPortedYet("multipleUploadProductImages"); }
    public Map<String, Object> packBulkItems(Map<String, Object> body) { return notPortedYet("packBulkItems"); }
    public Map<String, Object> packSingleItem(Map<String, Object> body) { return notPortedYet("packSingleItem"); }
    public Map<String, Object> previewFrameImage(Map<String, Object> body) { return notPortedYet("previewFrameImage"); }
    public Map<String, Object> printPickSheets(Map<String, Object> body) { return notPortedYet("printPickSheets"); }
    public Map<String, Object> processPhysicalStockMove(Map<String, Object> body) { return notPortedYet("processPhysicalStockMove"); }
    public Map<String, Object> quickAddChosenVariant(Map<String, Object> body) { return notPortedYet("quickAddChosenVariant"); }
    public Map<String, Object> quickAddVariant(Map<String, Object> body) { return notPortedYet("quickAddVariant"); }
    public Map<String, Object> quickCreateVirtualWithVariants(Map<String, Object> body) { return notPortedYet("quickCreateVirtualWithVariants"); }
    public Map<String, Object> quickReceivePurchaseOrder(Map<String, Object> body) { return notPortedYet("quickReceivePurchaseOrder"); }
    public Map<String, Object> quickScheduleShipmentRouteSegment(Map<String, Object> body) { return notPortedYet("quickScheduleShipmentRouteSegment"); }
    public Map<String, Object> quickShipEntireOrder(Map<String, Object> body) { return notPortedYet("quickShipEntireOrder"); }
    public Map<String, Object> receiveInventoryProduct(Map<String, Object> body) { return notPortedYet("receiveInventoryProduct"); }
    public Map<String, Object> removeCategoryContent(Map<String, Object> body) { return notPortedYet("removeCategoryContent"); }
    public Map<String, Object> removeExpiredCategoryProductMembers(Map<String, Object> body) { return notPortedYet("removeExpiredCategoryProductMembers"); }
    public Map<String, Object> removeFacilityFromGroup(Map<String, Object> body) { return notPortedYet("removeFacilityFromGroup"); }
    public Map<String, Object> removeFacilityGroupFromGroup(Map<String, Object> body) { return notPortedYet("removeFacilityGroupFromGroup"); }
    public Map<String, Object> removeFeatureApplsByFeatureTypeId(Map<String, Object> body) { return notPortedYet("removeFeatureApplsByFeatureTypeId"); }
    public Map<String, Object> removeFeatureFromProduct(Map<String, Object> body) { return notPortedYet("removeFeatureFromProduct"); }
    public Map<String, Object> removeFixedAssetProduct(Map<String, Object> body) { return notPortedYet("removeFixedAssetProduct"); }
    public Map<String, Object> removeImageBySize(Map<String, Object> body) { return notPortedYet("removeImageBySize"); }
    public Map<String, Object> removeOrderShipmentFromShipment(Map<String, Object> body) { return notPortedYet("removeOrderShipmentFromShipment"); }
    public Map<String, Object> removePartyFromCategory(Map<String, Object> body) { return notPortedYet("removePartyFromCategory"); }
    public Map<String, Object> removePartyFromFacility(Map<String, Object> body) { return notPortedYet("removePartyFromFacility"); }
    public Map<String, Object> removePartyFromFacilityGroup(Map<String, Object> body) { return notPortedYet("removePartyFromFacilityGroup"); }
    public Map<String, Object> removePartyFromProduct(Map<String, Object> body) { return notPortedYet("removePartyFromProduct"); }
    public Map<String, Object> removeProdCatalogFromParty(Map<String, Object> body) { return notPortedYet("removeProdCatalogFromParty"); }
    public Map<String, Object> removeProductCategoryFromCategory(Map<String, Object> body) { return notPortedYet("removeProductCategoryFromCategory"); }
    public Map<String, Object> removeProductCategoryFromProdCatalog(Map<String, Object> body) { return notPortedYet("removeProductCategoryFromProdCatalog"); }
    public Map<String, Object> removeProductConfigItemContent(Map<String, Object> body) { return notPortedYet("removeProductConfigItemContent"); }
    public Map<String, Object> removeProductContent(Map<String, Object> body) throws SQLException { ProductContent pk = new ProductContent(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", productContentDao.delete(pk)); }
    public Map<String, Object> removeProductContentAndImageFile(Map<String, Object> body) { return notPortedYet("removeProductContentAndImageFile"); }
    public Map<String, Object> removeProductFeatureAppl(Map<String, Object> body) { return notPortedYet("removeProductFeatureAppl"); }
    public Map<String, Object> removeProductFeatureApplAttr(Map<String, Object> body) { return notPortedYet("removeProductFeatureApplAttr"); }
    public Map<String, Object> removeProductFeatureCatGrpAppl(Map<String, Object> body) { return notPortedYet("removeProductFeatureCatGrpAppl"); }
    public Map<String, Object> removeProductFeatureCategoryAppl(Map<String, Object> body) { return notPortedYet("removeProductFeatureCategoryAppl"); }
    public Map<String, Object> removeProductFeatureGroupAppl(Map<String, Object> body) { return notPortedYet("removeProductFeatureGroupAppl"); }
    public Map<String, Object> removeProductFeatureIactn(Map<String, Object> body) { return notPortedYet("removeProductFeatureIactn"); }
    public Map<String, Object> removeProductFeatureType(Map<String, Object> body) { return notPortedYet("removeProductFeatureType"); }
    public Map<String, Object> removeProductFromCategory(Map<String, Object> body) { return notPortedYet("removeProductFromCategory"); }
    public Map<String, Object> removeProductPromoContent(Map<String, Object> body) { return notPortedYet("removeProductPromoContent"); }
    public Map<String, Object> removeProductStoreEmailSetting(Map<String, Object> body) { return notPortedYet("removeProductStoreEmailSetting"); }
    public Map<String, Object> removeProductStoreFinActSetting(Map<String, Object> body) { return notPortedYet("removeProductStoreFinActSetting"); }
    public Map<String, Object> removeProductStoreRole(Map<String, Object> body) { return notPortedYet("removeProductStoreRole"); }
    public Map<String, Object> removeProductStoreShipMeth(Map<String, Object> body) { return notPortedYet("removeProductStoreShipMeth"); }
    public Map<String, Object> removeShipmentEstimate(Map<String, Object> body) { return notPortedYet("removeShipmentEstimate"); }
    public Map<String, Object> removeSubscriptionCommEvent(Map<String, Object> body) { return notPortedYet("removeSubscriptionCommEvent"); }
    public Map<String, Object> removeSupplierProduct(Map<String, Object> body) { return notPortedYet("removeSupplierProduct"); }
    public Map<String, Object> removeSupplierProductFeature(Map<String, Object> body) { return notPortedYet("removeSupplierProductFeature"); }
    public Map<String, Object> removeWorkEffortGoodStandard(Map<String, Object> body) { return notPortedYet("removeWorkEffortGoodStandard"); }
    public Map<String, Object> renameImage(Map<String, Object> body) { return notPortedYet("renameImage"); }
    public Map<String, Object> replaceImageToExistImage(Map<String, Object> body) { return notPortedYet("replaceImageToExistImage"); }
    public Map<String, Object> resizeImages(Map<String, Object> body) { return notPortedYet("resizeImages"); }
    public Map<String, Object> safeAddProductCategoryToCategory(Map<String, Object> body) { return notPortedYet("safeAddProductCategoryToCategory"); }
    public Map<String, Object> safeAddProductToCategory(Map<String, Object> body) { return notPortedYet("safeAddProductToCategory"); }
    public Map<String, Object> savePackagesInfo(Map<String, Object> body) { return notPortedYet("savePackagesInfo"); }
    public Map<String, Object> searchAddFeature(Map<String, Object> body) { return notPortedYet("searchAddFeature"); }
    public Map<String, Object> searchAddToCategory(Map<String, Object> body) { return notPortedYet("searchAddToCategory"); }
    public Map<String, Object> searchExpireFromCategory(Map<String, Object> body) { return notPortedYet("searchExpireFromCategory"); }
    public Map<String, Object> searchExportProductList(Map<String, Object> body) { return notPortedYet("searchExportProductList"); }
    public Map<String, Object> searchRemoveFeature(Map<String, Object> body) { return notPortedYet("searchRemoveFeature"); }
    public Map<String, Object> searchRemoveFromCategory(Map<String, Object> body) { return notPortedYet("searchRemoveFromCategory"); }
    public Map<String, Object> setDefaultImage(Map<String, Object> body) { return notPortedYet("setDefaultImage"); }
    public Map<String, Object> setImageDetail(Map<String, Object> body) { return notPortedYet("setImageDetail"); }
    public Map<String, Object> setNextPackageSeq(Map<String, Object> body) { return notPortedYet("setNextPackageSeq"); }
    public Map<String, Object> setPackageInfo(Map<String, Object> body) { return notPortedYet("setPackageInfo"); }
    public Map<String, Object> setProductReviewStatus(Map<String, Object> body) { return notPortedYet("setProductReviewStatus"); }
    public Map<String, Object> setShipmentSettingsFromPrimaryOrder(Map<String, Object> body) { return notPortedYet("setShipmentSettingsFromPrimaryOrder"); }
    public Map<String, Object> updateAllKeywords(Map<String, Object> body) { return notPortedYet("updateAllKeywords"); }
    public Map<String, Object> updateCarrierShipmentMethod(Map<String, Object> body) throws SQLException { CarrierShipmentMethod pk = new CarrierShipmentMethod(); ServiceInput.populate(pk, body); CarrierShipmentMethod e = carrierShipmentMethodDao.gett(pk); if (e == null) return ServiceResponse.error("CarrierShipmentMethod not found"); ServiceInput.populate(e, body); carrierShipmentMethodDao.update(e); return ServiceResponse.success("shipmentMethodTypeId", e.getShipmentMethodTypeId()); }
    public Map<String, Object> updateCategoryContent(Map<String, Object> body) { return notPortedYet("updateCategoryContent"); }
    public Map<String, Object> updateContentSEOForCategory(Map<String, Object> body) { return notPortedYet("updateContentSEOForCategory"); }
    public Map<String, Object> updateContentSEOForProduct(Map<String, Object> body) { return notPortedYet("updateContentSEOForProduct"); }
    public Map<String, Object> updateCostComponent(Map<String, Object> body) { return notPortedYet("updateCostComponent"); }
    public Map<String, Object> updateDownloadContentForCategory(Map<String, Object> body) { return notPortedYet("updateDownloadContentForCategory"); }
    public Map<String, Object> updateDownloadContentForProduct(Map<String, Object> body) { return notPortedYet("updateDownloadContentForProduct"); }
    public Map<String, Object> updateEmailContentForProduct(Map<String, Object> body) { return notPortedYet("updateEmailContentForProduct"); }
    public Map<String, Object> updateFacility(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "facilityId"); Facility e = facilityDao.gett(id); if (e == null) return ServiceResponse.error("Facility not found: " + id); ServiceInput.populate(e, body); e.setFacilityId(id); facilityDao.update(e); return ServiceResponse.success("facilityId", id); }
    public Map<String, Object> updateFacilityContactMech(Map<String, Object> body) { return notPortedYet("updateFacilityContactMech"); }
    public Map<String, Object> updateFacilityEmailAddress(Map<String, Object> body) { return notPortedYet("updateFacilityEmailAddress"); }
    public Map<String, Object> updateFacilityGroup(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "facilityGroupId"); FacilityGroup e = facilityGroupDao.gett(id); if (e == null) return ServiceResponse.error("FacilityGroup not found: " + id); ServiceInput.populate(e, body); e.setFacilityGroupId(id); facilityGroupDao.update(e); return ServiceResponse.success("facilityGroupId", id); }
    public Map<String, Object> updateFacilityGroupToGroup(Map<String, Object> body) { return notPortedYet("updateFacilityGroupToGroup"); }
    public Map<String, Object> updateFacilityLocation(Map<String, Object> body) throws SQLException { FacilityLocation pk = new FacilityLocation(); ServiceInput.populate(pk, body); FacilityLocation e = facilityLocationDao.gett(pk); if (e == null) return ServiceResponse.error("FacilityLocation not found"); ServiceInput.populate(e, body); facilityLocationDao.update(e); return ServiceResponse.success("facilityId", e.getFacilityId()); }
    public Map<String, Object> updateFacilityParty(Map<String, Object> body) { return notPortedYet("updateFacilityParty"); }
    public Map<String, Object> updateFacilityPostalAddress(Map<String, Object> body) { return notPortedYet("updateFacilityPostalAddress"); }
    public Map<String, Object> updateFacilityTelecomNumber(Map<String, Object> body) { return notPortedYet("updateFacilityTelecomNumber"); }
    public Map<String, Object> updateFacilityToGroup(Map<String, Object> body) { return notPortedYet("updateFacilityToGroup"); }
    public Map<String, Object> updateFeaturePrice(Map<String, Object> body) { return notPortedYet("updateFeaturePrice"); }
    public Map<String, Object> updateFeatureToProductApplication(Map<String, Object> body) { return notPortedYet("updateFeatureToProductApplication"); }
    public Map<String, Object> updateFixedAssetProduct(Map<String, Object> body) { return notPortedYet("updateFixedAssetProduct"); }
    public Map<String, Object> updateGoodIdentification(Map<String, Object> body) throws SQLException { GoodIdentification pk = new GoodIdentification(); ServiceInput.populate(pk, body); GoodIdentification e = goodIdentificationDao.gett(pk); if (e == null) return ServiceResponse.error("GoodIdentification not found"); ServiceInput.populate(e, body); goodIdentificationDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateInventoryItem(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "inventoryItemId"); InventoryItem e = inventoryItemDao.gett(id); if (e == null) return ServiceResponse.error("InventoryItem not found: " + id); ServiceInput.populate(e, body); e.setInventoryItemId(id); inventoryItemDao.update(e); return ServiceResponse.success("inventoryItemId", id); }
    public Map<String, Object> updateInventoryItemLabel(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "inventoryItemLabelId"); InventoryItemLabel e = inventoryItemLabelDao.gett(id); if (e == null) return ServiceResponse.error("InventoryItemLabel not found: " + id); ServiceInput.populate(e, body); e.setInventoryItemLabelId(id); inventoryItemLabelDao.update(e); return ServiceResponse.success("inventoryItemLabelId", id); }
    public Map<String, Object> updateInventoryItemLabelAppl(Map<String, Object> body) { return notPortedYet("updateInventoryItemLabelAppl"); }
    public Map<String, Object> updateInventoryItemLabelType(Map<String, Object> body) { return notPortedYet("updateInventoryItemLabelType"); }
    public Map<String, Object> updateInventoryTransfer(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "inventoryTransferId"); InventoryTransfer e = inventoryTransferDao.gett(id); if (e == null) return ServiceResponse.error("InventoryTransfer not found: " + id); ServiceInput.populate(e, body); e.setInventoryTransferId(id); inventoryTransferDao.update(e); return ServiceResponse.success("inventoryTransferId", id); }
    public Map<String, Object> updatePackedLine(Map<String, Object> body) { return notPortedYet("updatePackedLine"); }
    public Map<String, Object> updatePartyToCategory(Map<String, Object> body) { return notPortedYet("updatePartyToCategory"); }
    public Map<String, Object> updatePartyToProduct(Map<String, Object> body) { return notPortedYet("updatePartyToProduct"); }
    public Map<String, Object> updatePicklist(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "picklistId"); Picklist e = picklistDao.gett(id); if (e == null) return ServiceResponse.error("Picklist not found: " + id); ServiceInput.populate(e, body); e.setPicklistId(id); picklistDao.update(e); return ServiceResponse.success("picklistId", id); }
    public Map<String, Object> updatePicklistBin(Map<String, Object> body) { return notPortedYet("updatePicklistBin"); }
    public Map<String, Object> updateProdCatalog(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "prodCatalogId"); ProdCatalog e = prodCatalogDao.gett(id); if (e == null) return ServiceResponse.error("ProdCatalog not found: " + id); ServiceInput.populate(e, body); e.setProdCatalogId(id); prodCatalogDao.update(e); return ServiceResponse.success("prodCatalogId", id); }
    public Map<String, Object> updateProdCatalogToParty(Map<String, Object> body) { return notPortedYet("updateProdCatalogToParty"); }
    public Map<String, Object> updateProduct(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productId"); Product e = productDao.gett(id); if (e == null) return ServiceResponse.error("Product not found: " + id); ServiceInput.populate(e, body); e.setProductId(id); productDao.update(e); return ServiceResponse.success("productId", id); }
    public Map<String, Object> updateProductAssoc(Map<String, Object> body) throws SQLException { ProductAssoc pk = new ProductAssoc(); ServiceInput.populate(pk, body); ProductAssoc e = productAssocDao.gett(pk); if (e == null) return ServiceResponse.error("ProductAssoc not found"); ServiceInput.populate(e, body); productAssocDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateProductAttribute(Map<String, Object> body) throws SQLException { ProductAttribute pk = new ProductAttribute(); ServiceInput.populate(pk, body); ProductAttribute e = productAttributeDao.gett(pk); if (e == null) return ServiceResponse.error("ProductAttribute not found"); ServiceInput.populate(e, body); productAttributeDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateProductCategory(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productCategoryId"); ProductCategory e = productCategoryDao.gett(id); if (e == null) return ServiceResponse.error("ProductCategory not found: " + id); ServiceInput.populate(e, body); e.setProductCategoryId(id); productCategoryDao.update(e); return ServiceResponse.success("productCategoryId", id); }
    public Map<String, Object> updateProductCategoryAttribute(Map<String, Object> body) throws SQLException { ProductCategoryAttribute pk = new ProductCategoryAttribute(); ServiceInput.populate(pk, body); ProductCategoryAttribute e = productCategoryAttributeDao.gett(pk); if (e == null) return ServiceResponse.error("ProductCategoryAttribute not found"); ServiceInput.populate(e, body); productCategoryAttributeDao.update(e); return ServiceResponse.success("productCategoryId", e.getProductCategoryId()); }
    public Map<String, Object> updateProductCategoryLink(Map<String, Object> body) throws SQLException { ProductCategoryLink pk = new ProductCategoryLink(); ServiceInput.populate(pk, body); ProductCategoryLink e = productCategoryLinkDao.gett(pk); if (e == null) return ServiceResponse.error("ProductCategoryLink not found"); ServiceInput.populate(e, body); productCategoryLinkDao.update(e); return ServiceResponse.success("productCategoryId", e.getProductCategoryId()); }
    public Map<String, Object> updateProductCategoryMember(Map<String, Object> body) { return notPortedYet("updateProductCategoryMember"); }
    public Map<String, Object> updateProductCategoryToCategory(Map<String, Object> body) { return notPortedYet("updateProductCategoryToCategory"); }
    public Map<String, Object> updateProductCategoryToProdCatalog(Map<String, Object> body) { return notPortedYet("updateProductCategoryToProdCatalog"); }
    public Map<String, Object> updateProductConfig(Map<String, Object> body) { return notPortedYet("updateProductConfig"); }
    public Map<String, Object> updateProductConfigItem(Map<String, Object> body) { return notPortedYet("updateProductConfigItem"); }
    public Map<String, Object> updateProductConfigItemContent(Map<String, Object> body) { return notPortedYet("updateProductConfigItemContent"); }
    public Map<String, Object> updateProductConfigOption(Map<String, Object> body) { return notPortedYet("updateProductConfigOption"); }
    public Map<String, Object> updateProductConfigProduct(Map<String, Object> body) { return notPortedYet("updateProductConfigProduct"); }
    public Map<String, Object> updateProductContent(Map<String, Object> body) throws SQLException { ProductContent pk = new ProductContent(); ServiceInput.populate(pk, body); ProductContent e = productContentDao.gett(pk); if (e == null) return ServiceResponse.error("ProductContent not found"); ServiceInput.populate(e, body); productContentDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateProductCostComponentCalc(Map<String, Object> body) { return notPortedYet("updateProductCostComponentCalc"); }
    public Map<String, Object> updateProductFacility(Map<String, Object> body) throws SQLException { ProductFacility pk = new ProductFacility(); ServiceInput.populate(pk, body); ProductFacility e = productFacilityDao.gett(pk); if (e == null) return ServiceResponse.error("ProductFacility not found"); ServiceInput.populate(e, body); productFacilityDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateProductFacilityLocation(Map<String, Object> body) { return notPortedYet("updateProductFacilityLocation"); }
    public Map<String, Object> updateProductFeature(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productFeatureId"); ProductFeature e = productFeatureDao.gett(id); if (e == null) return ServiceResponse.error("ProductFeature not found: " + id); ServiceInput.populate(e, body); e.setProductFeatureId(id); productFeatureDao.update(e); return ServiceResponse.success("productFeatureId", id); }
    public Map<String, Object> updateProductFeatureCatGrpAppl(Map<String, Object> body) { return notPortedYet("updateProductFeatureCatGrpAppl"); }
    public Map<String, Object> updateProductFeatureCategory(Map<String, Object> body) { return notPortedYet("updateProductFeatureCategory"); }
    public Map<String, Object> updateProductFeatureCategoryAppl(Map<String, Object> body) { return notPortedYet("updateProductFeatureCategoryAppl"); }
    public Map<String, Object> updateProductFeatureGroup(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productFeatureGroupId"); ProductFeatureGroup e = productFeatureGroupDao.gett(id); if (e == null) return ServiceResponse.error("ProductFeatureGroup not found: " + id); ServiceInput.populate(e, body); e.setProductFeatureGroupId(id); productFeatureGroupDao.update(e); return ServiceResponse.success("productFeatureGroupId", id); }
    public Map<String, Object> updateProductFeatureGroupAppl(Map<String, Object> body) { return notPortedYet("updateProductFeatureGroupAppl"); }
    public Map<String, Object> updateProductFeatureType(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productFeatureTypeId"); ProductFeatureType e = productFeatureTypeDao.gett(id); if (e == null) return ServiceResponse.error("ProductFeatureType not found: " + id); ServiceInput.populate(e, body); e.setProductFeatureTypeId(id); productFeatureTypeDao.update(e); return ServiceResponse.success("productFeatureTypeId", id); }
    public Map<String, Object> updateProductGeo(Map<String, Object> body) { return notPortedYet("updateProductGeo"); }
    public Map<String, Object> updateProductGlAccount(Map<String, Object> body) { return notPortedYet("updateProductGlAccount"); }
    public Map<String, Object> updateProductGroupOrder(Map<String, Object> body) { return notPortedYet("updateProductGroupOrder"); }
    public Map<String, Object> updateProductKeyword(Map<String, Object> body) { return notPortedYet("updateProductKeyword"); }
    public Map<String, Object> updateProductMaint(Map<String, Object> body) { return notPortedYet("updateProductMaint"); }
    public Map<String, Object> updateProductMeter(Map<String, Object> body) { return notPortedYet("updateProductMeter"); }
    public Map<String, Object> updateProductPaymentMethodType(Map<String, Object> body) { return notPortedYet("updateProductPaymentMethodType"); }
    public Map<String, Object> updateProductPrice(Map<String, Object> body) throws SQLException { ProductPrice pk = new ProductPrice(); ServiceInput.populate(pk, body); ProductPrice e = productPriceDao.gett(pk); if (e == null) return ServiceResponse.error("ProductPrice not found"); ServiceInput.populate(e, body); productPriceDao.update(e); return ServiceResponse.success("productId", e.getProductId()); }
    public Map<String, Object> updateProductPriceAction(Map<String, Object> body) { return notPortedYet("updateProductPriceAction"); }
    public Map<String, Object> updateProductPriceCond(Map<String, Object> body) { return notPortedYet("updateProductPriceCond"); }
    public Map<String, Object> updateProductPriceRule(Map<String, Object> body) { return notPortedYet("updateProductPriceRule"); }
    public Map<String, Object> updateProductPromo(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productPromoId"); ProductPromo e = productPromoDao.gett(id); if (e == null) return ServiceResponse.error("ProductPromo not found: " + id); ServiceInput.populate(e, body); e.setProductPromoId(id); productPromoDao.update(e); return ServiceResponse.success("productPromoId", id); }
    public Map<String, Object> updateProductPromoAction(Map<String, Object> body) { return notPortedYet("updateProductPromoAction"); }
    public Map<String, Object> updateProductPromoCategory(Map<String, Object> body) { return notPortedYet("updateProductPromoCategory"); }
    public Map<String, Object> updateProductPromoCode(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productPromoCodeId"); ProductPromoCode e = productPromoCodeDao.gett(id); if (e == null) return ServiceResponse.error("ProductPromoCode not found: " + id); ServiceInput.populate(e, body); e.setProductPromoCodeId(id); productPromoCodeDao.update(e); return ServiceResponse.success("productPromoCodeId", id); }
    public Map<String, Object> updateProductPromoCond(Map<String, Object> body) { return notPortedYet("updateProductPromoCond"); }
    public Map<String, Object> updateProductPromoProduct(Map<String, Object> body) { return notPortedYet("updateProductPromoProduct"); }
    public Map<String, Object> updateProductPromoRule(Map<String, Object> body) { return notPortedYet("updateProductPromoRule"); }
    public Map<String, Object> updateProductQuickAdminName(Map<String, Object> body) { return notPortedYet("updateProductQuickAdminName"); }
    public Map<String, Object> updateProductQuickAdminSelFeat(Map<String, Object> body) { return notPortedYet("updateProductQuickAdminSelFeat"); }
    public Map<String, Object> updateProductQuickAdminShipping(Map<String, Object> body) { return notPortedYet("updateProductQuickAdminShipping"); }
    public Map<String, Object> updateProductReview(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "productReviewId"); ProductReview e = productReviewDao.gett(id); if (e == null) return ServiceResponse.error("ProductReview not found: " + id); ServiceInput.populate(e, body); e.setProductReviewId(id); productReviewDao.update(e); return ServiceResponse.success("productReviewId", id); }
    public Map<String, Object> updateProductStore(Map<String, Object> body) { return notPortedYet("updateProductStore"); }
    public Map<String, Object> updateProductStoreCatalog(Map<String, Object> body) throws SQLException { ProductStoreCatalog pk = new ProductStoreCatalog(); ServiceInput.populate(pk, body); ProductStoreCatalog e = productStoreCatalogDao.gett(pk); if (e == null) return ServiceResponse.error("ProductStoreCatalog not found"); ServiceInput.populate(e, body); productStoreCatalogDao.update(e); return ServiceResponse.success("productStoreId", e.getProductStoreId()); }
    public Map<String, Object> updateProductStoreEmailSetting(Map<String, Object> body) { return notPortedYet("updateProductStoreEmailSetting"); }
    public Map<String, Object> updateProductStoreFacility(Map<String, Object> body) { return notPortedYet("updateProductStoreFacility"); }
    public Map<String, Object> updateProductStoreFinActSetting(Map<String, Object> body) { return notPortedYet("updateProductStoreFinActSetting"); }
    public Map<String, Object> updateProductStoreGroup(Map<String, Object> body) { return notPortedYet("updateProductStoreGroup"); }
    public Map<String, Object> updateProductStoreGroupRollup(Map<String, Object> body) { return notPortedYet("updateProductStoreGroupRollup"); }
    public Map<String, Object> updateProductStoreKeywordOvrd(Map<String, Object> body) { return notPortedYet("updateProductStoreKeywordOvrd"); }
    public Map<String, Object> updateProductStorePaymentSetting(Map<String, Object> body) { return notPortedYet("updateProductStorePaymentSetting"); }
    public Map<String, Object> updateProductStorePromoAppl(Map<String, Object> body) { return notPortedYet("updateProductStorePromoAppl"); }
    public Map<String, Object> updateProductStoreRole(Map<String, Object> body) { return notPortedYet("updateProductStoreRole"); }
    public Map<String, Object> updateProductStoreShipMeth(Map<String, Object> body) { return notPortedYet("updateProductStoreShipMeth"); }
    public Map<String, Object> updateProductSubscriptionResource(Map<String, Object> body) { return notPortedYet("updateProductSubscriptionResource"); }
    public Map<String, Object> updateProductToCategory(Map<String, Object> body) { return notPortedYet("updateProductToCategory"); }
    public Map<String, Object> updateQuantityBreak(Map<String, Object> body) { return notPortedYet("updateQuantityBreak"); }
    public Map<String, Object> updateRelatedUrlContentForCategory(Map<String, Object> body) { return notPortedYet("updateRelatedUrlContentForCategory"); }
    public Map<String, Object> updateShipment(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "shipmentId"); Shipment e = shipmentDao.gett(id); if (e == null) return ServiceResponse.error("Shipment not found: " + id); ServiceInput.populate(e, body); e.setShipmentId(id); shipmentDao.update(e); return ServiceResponse.success("shipmentId", id); }
    public Map<String, Object> updateShipmentGatewayConfig(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayConfig"); }
    public Map<String, Object> updateShipmentGatewayConfigType(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayConfigType"); }
    public Map<String, Object> updateShipmentGatewayDhl(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayDhl"); }
    public Map<String, Object> updateShipmentGatewayFedex(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayFedex"); }
    public Map<String, Object> updateShipmentGatewayUps(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayUps"); }
    public Map<String, Object> updateShipmentGatewayUsps(Map<String, Object> body) { return notPortedYet("updateShipmentGatewayUsps"); }
    public Map<String, Object> updateShipmentMethodType(Map<String, Object> body) { return notPortedYet("updateShipmentMethodType"); }
    public Map<String, Object> updateShipmentPackage(Map<String, Object> body) { return notPortedYet("updateShipmentPackage"); }
    public Map<String, Object> updateShipmentPackageRouteSeg(Map<String, Object> body) { return notPortedYet("updateShipmentPackageRouteSeg"); }
    public Map<String, Object> updateShipmentRouteSegment(Map<String, Object> body) { return notPortedYet("updateShipmentRouteSegment"); }
    public Map<String, Object> updateShipmentTimeEstimate(Map<String, Object> body) { return notPortedYet("updateShipmentTimeEstimate"); }
    public Map<String, Object> updateSimpleTextContentForCategory(Map<String, Object> body) { return notPortedYet("updateSimpleTextContentForCategory"); }
    public Map<String, Object> updateSimpleTextContentForProduct(Map<String, Object> body) { return notPortedYet("updateSimpleTextContentForProduct"); }
    public Map<String, Object> updateSimpleTextContentForProductConfigItem(Map<String, Object> body) { return notPortedYet("updateSimpleTextContentForProductConfigItem"); }
    public Map<String, Object> updateStatusImageManagement(Map<String, Object> body) { return notPortedYet("updateStatusImageManagement"); }
    public Map<String, Object> updateSubscription(Map<String, Object> body) { return notPortedYet("updateSubscription"); }
    public Map<String, Object> updateSubscriptionAttribute(Map<String, Object> body) { return notPortedYet("updateSubscriptionAttribute"); }
    public Map<String, Object> updateSubscriptionResource(Map<String, Object> body) { return notPortedYet("updateSubscriptionResource"); }
    public Map<String, Object> updateSupplierProduct(Map<String, Object> body) { return notPortedYet("updateSupplierProduct"); }
    public Map<String, Object> updateSupplierProductFeature(Map<String, Object> body) { return notPortedYet("updateSupplierProductFeature"); }
    public Map<String, Object> updateWebSite(Map<String, Object> body) { return notPortedYet("updateWebSite"); }
    public Map<String, Object> updateWorkEffortGoodStandard(Map<String, Object> body) { return notPortedYet("updateWorkEffortGoodStandard"); }
    public Map<String, Object> uploadFrame(Map<String, Object> body) { return notPortedYet("uploadFrame"); }
    public Map<String, Object> uploadProductAdditionalViewImages(Map<String, Object> body) { return notPortedYet("uploadProductAdditionalViewImages"); }
    public Map<String, Object> upsShipmentAccept(Map<String, Object> body) { return notPortedYet("upsShipmentAccept"); }
    public Map<String, Object> upsShipmentConfirm(Map<String, Object> body) { return notPortedYet("upsShipmentConfirm"); }
    public Map<String, Object> upsTrackShipment(Map<String, Object> body) { return notPortedYet("upsTrackShipment"); }
    public Map<String, Object> upsVoidShipment(Map<String, Object> body) { return notPortedYet("upsVoidShipment"); }
    public Map<String, Object> verifyBulkItem(Map<String, Object> body) { return notPortedYet("verifyBulkItem"); }
    public Map<String, Object> verifySingleItem(Map<String, Object> body) { return notPortedYet("verifySingleItem"); }
    public Map<String, Object> viewShipmentPackageRouteSegLabelImage(Map<String, Object> body) { return notPortedYet("viewShipmentPackageRouteSegLabelImage"); }
}
