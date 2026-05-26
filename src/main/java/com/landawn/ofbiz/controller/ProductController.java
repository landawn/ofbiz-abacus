package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.product.AddAdditionalViewForProductRequest;
import com.landawn.ofbiz.model.product.AddAdditionalViewForProductResponse;
import com.landawn.ofbiz.model.product.AddFacilityGroupToGroupRequest;
import com.landawn.ofbiz.model.product.AddFacilityGroupToGroupResponse;
import com.landawn.ofbiz.model.product.AddFacilityToGroupRequest;
import com.landawn.ofbiz.model.product.AddFacilityToGroupResponse;
import com.landawn.ofbiz.model.product.AddImageForProductPromoRequest;
import com.landawn.ofbiz.model.product.AddImageForProductPromoResponse;
import com.landawn.ofbiz.model.product.AddImageFrameRequest;
import com.landawn.ofbiz.model.product.AddImageFrameResponse;
import com.landawn.ofbiz.model.product.AddOrderShipmentToShipmentResponse;
import com.landawn.ofbiz.model.product.AddPartyToCategoryRequest;
import com.landawn.ofbiz.model.product.AddPartyToCategoryResponse;
import com.landawn.ofbiz.model.product.AddPartyToFacilityGroupRequest;
import com.landawn.ofbiz.model.product.AddPartyToFacilityGroupResponse;
import com.landawn.ofbiz.model.product.AddPartyToFacilityRequest;
import com.landawn.ofbiz.model.product.AddPartyToFacilityResponse;
import com.landawn.ofbiz.model.product.AddPartyToProductRequest;
import com.landawn.ofbiz.model.product.AddPartyToProductResponse;
import com.landawn.ofbiz.model.product.AddProdCatalogToPartyRequest;
import com.landawn.ofbiz.model.product.AddProdCatalogToPartyResponse;
import com.landawn.ofbiz.model.product.AddProductCategoryToProdCatalogRequest;
import com.landawn.ofbiz.model.product.AddProductCategoryToProdCatalogResponse;
import com.landawn.ofbiz.model.product.AddProductToCategoriesResponse;
import com.landawn.ofbiz.model.product.AddRejectedReasonImageManagementResponse;
import com.landawn.ofbiz.model.product.ApplyFeatureToProductFromTypeAndCodeRequest;
import com.landawn.ofbiz.model.product.ApplyFeatureToProductFromTypeAndCodeResponse;
import com.landawn.ofbiz.model.product.ApplyFeatureToProductRequest;
import com.landawn.ofbiz.model.product.ApplyFeatureToProductResponse;
import com.landawn.ofbiz.model.product.AttachProductFeaturesToCategoryRequest;
import com.landawn.ofbiz.model.product.AttachProductFeaturesToCategoryResponse;
import com.landawn.ofbiz.model.product.CalcPackSessionAdditionalShippingChargeRequest;
import com.landawn.ofbiz.model.product.CalcPackSessionAdditionalShippingChargeResponse;
import com.landawn.ofbiz.model.product.CalculateProductCostsRequest;
import com.landawn.ofbiz.model.product.CalculateProductCostsResponse;
import com.landawn.ofbiz.model.product.CancelAllRowsRequest;
import com.landawn.ofbiz.model.product.CancelAllRowsResponse;
import com.landawn.ofbiz.model.product.CancelReceivedItemsRequest;
import com.landawn.ofbiz.model.product.CancelReceivedItemsResponse;
import com.landawn.ofbiz.model.product.ClearPackAllRequest;
import com.landawn.ofbiz.model.product.ClearPackAllResponse;
import com.landawn.ofbiz.model.product.ClearPackLineRequest;
import com.landawn.ofbiz.model.product.ClearPackLineResponse;
import com.landawn.ofbiz.model.product.CompletePackRequest;
import com.landawn.ofbiz.model.product.CompletePackResponse;
import com.landawn.ofbiz.model.product.CompletePackageRequest;
import com.landawn.ofbiz.model.product.CompletePackageResponse;
import com.landawn.ofbiz.model.product.CompleteShipmentRequest;
import com.landawn.ofbiz.model.product.CompleteShipmentResponse;
import com.landawn.ofbiz.model.product.CompleteVerifiedPickRequest;
import com.landawn.ofbiz.model.product.CompleteVerifiedPickResponse;
import com.landawn.ofbiz.model.product.CopyCategoryProductMembersRequest;
import com.landawn.ofbiz.model.product.CopyCategoryProductMembersResponse;
import com.landawn.ofbiz.model.product.CopyToProductVariantsRequest;
import com.landawn.ofbiz.model.product.CopyToProductVariantsResponse;
import com.landawn.ofbiz.model.product.CreateBulkProductPromoCodeEmailRequest;
import com.landawn.ofbiz.model.product.CreateBulkProductPromoCodeEmailResponse;
import com.landawn.ofbiz.model.product.CreateBulkProductPromoCodeRequest;
import com.landawn.ofbiz.model.product.CreateBulkProductPromoCodeResponse;
import com.landawn.ofbiz.model.product.CreateCarrierShipmentMethodRequest;
import com.landawn.ofbiz.model.product.CreateCarrierShipmentMethodResponse;
import com.landawn.ofbiz.model.product.CreateCategoryContentRequest;
import com.landawn.ofbiz.model.product.CreateCategoryContentResponse;
import com.landawn.ofbiz.model.product.CreateCostComponentRequest;
import com.landawn.ofbiz.model.product.CreateCostComponentResponse;
import com.landawn.ofbiz.model.product.CreateDownloadContentForCategoryRequest;
import com.landawn.ofbiz.model.product.CreateDownloadContentForCategoryResponse;
import com.landawn.ofbiz.model.product.CreateDownloadContentForProductRequest;
import com.landawn.ofbiz.model.product.CreateDownloadContentForProductResponse;
import com.landawn.ofbiz.model.product.CreateEmailContentForProductRequest;
import com.landawn.ofbiz.model.product.CreateEmailContentForProductResponse;
import com.landawn.ofbiz.model.product.CreateFacilityContactMechPurposeRequest;
import com.landawn.ofbiz.model.product.CreateFacilityContactMechPurposeResponse;
import com.landawn.ofbiz.model.product.CreateFacilityContactMechRequest;
import com.landawn.ofbiz.model.product.CreateFacilityContactMechResponse;
import com.landawn.ofbiz.model.product.CreateFacilityContentResponse;
import com.landawn.ofbiz.model.product.CreateFacilityEmailAddressRequest;
import com.landawn.ofbiz.model.product.CreateFacilityEmailAddressResponse;
import com.landawn.ofbiz.model.product.CreateFacilityGroupRequest;
import com.landawn.ofbiz.model.product.CreateFacilityGroupResponse;
import com.landawn.ofbiz.model.product.CreateFacilityLocationRequest;
import com.landawn.ofbiz.model.product.CreateFacilityLocationResponse;
import com.landawn.ofbiz.model.product.CreateFacilityPostalAddressRequest;
import com.landawn.ofbiz.model.product.CreateFacilityPostalAddressResponse;
import com.landawn.ofbiz.model.product.CreateFacilityRequest;
import com.landawn.ofbiz.model.product.CreateFacilityResponse;
import com.landawn.ofbiz.model.product.CreateFacilityTelecomNumberRequest;
import com.landawn.ofbiz.model.product.CreateFacilityTelecomNumberResponse;
import com.landawn.ofbiz.model.product.CreateFeaturePriceRequest;
import com.landawn.ofbiz.model.product.CreateFeaturePriceResponse;
import com.landawn.ofbiz.model.product.CreateGoodIdentificationRequest;
import com.landawn.ofbiz.model.product.CreateGoodIdentificationResponse;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelApplRequest;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelApplResponse;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelRequest;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelResponse;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelTypeRequest;
import com.landawn.ofbiz.model.product.CreateInventoryItemLabelTypeResponse;
import com.landawn.ofbiz.model.product.CreateInventoryItemRequest;
import com.landawn.ofbiz.model.product.CreateInventoryItemResponse;
import com.landawn.ofbiz.model.product.CreateInventoryTransferRequest;
import com.landawn.ofbiz.model.product.CreateInventoryTransferResponse;
import com.landawn.ofbiz.model.product.CreateInventoryTransfersForProductRequest;
import com.landawn.ofbiz.model.product.CreateInventoryTransfersForProductResponse;
import com.landawn.ofbiz.model.product.CreateMissingCategoryAndProductAltUrlsRequest;
import com.landawn.ofbiz.model.product.CreateMissingCategoryAndProductAltUrlsResponse;
import com.landawn.ofbiz.model.product.CreatePhysicalInventoryAndVarianceRequest;
import com.landawn.ofbiz.model.product.CreatePhysicalInventoryAndVarianceResponse;
import com.landawn.ofbiz.model.product.CreatePicklistFromOrdersRequest;
import com.landawn.ofbiz.model.product.CreatePicklistFromOrdersResponse;
import com.landawn.ofbiz.model.product.CreatePicklistRoleRequest;
import com.landawn.ofbiz.model.product.CreatePicklistRoleResponse;
import com.landawn.ofbiz.model.product.CreateProdCatalogRequest;
import com.landawn.ofbiz.model.product.CreateProdCatalogResponse;
import com.landawn.ofbiz.model.product.CreateProductAssocRequest;
import com.landawn.ofbiz.model.product.CreateProductAssocResponse;
import com.landawn.ofbiz.model.product.CreateProductAttributeRequest;
import com.landawn.ofbiz.model.product.CreateProductAttributeResponse;
import com.landawn.ofbiz.model.product.CreateProductCategoryAttributeRequest;
import com.landawn.ofbiz.model.product.CreateProductCategoryAttributeResponse;
import com.landawn.ofbiz.model.product.CreateProductCategoryLinkRequest;
import com.landawn.ofbiz.model.product.CreateProductCategoryLinkResponse;
import com.landawn.ofbiz.model.product.CreateProductCategoryRequest;
import com.landawn.ofbiz.model.product.CreateProductCategoryResponse;
import com.landawn.ofbiz.model.product.CreateProductConfigItemContentRequest;
import com.landawn.ofbiz.model.product.CreateProductConfigItemContentResponse;
import com.landawn.ofbiz.model.product.CreateProductConfigItemRequest;
import com.landawn.ofbiz.model.product.CreateProductConfigItemResponse;
import com.landawn.ofbiz.model.product.CreateProductConfigOptionRequest;
import com.landawn.ofbiz.model.product.CreateProductConfigOptionResponse;
import com.landawn.ofbiz.model.product.CreateProductConfigProductRequest;
import com.landawn.ofbiz.model.product.CreateProductConfigProductResponse;
import com.landawn.ofbiz.model.product.CreateProductConfigRequest;
import com.landawn.ofbiz.model.product.CreateProductConfigResponse;
import com.landawn.ofbiz.model.product.CreateProductContentRequest;
import com.landawn.ofbiz.model.product.CreateProductContentResponse;
import com.landawn.ofbiz.model.product.CreateProductCostComponentCalcRequest;
import com.landawn.ofbiz.model.product.CreateProductCostComponentCalcResponse;
import com.landawn.ofbiz.model.product.CreateProductFacilityLocationRequest;
import com.landawn.ofbiz.model.product.CreateProductFacilityLocationResponse;
import com.landawn.ofbiz.model.product.CreateProductFacilityRequest;
import com.landawn.ofbiz.model.product.CreateProductFacilityResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureApplAttrRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureApplAttrResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureCatGrpApplRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureCatGrpApplResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureCategoryApplRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureCategoryApplResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureCategoryRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureCategoryResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureGroupApplRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureGroupApplResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureGroupRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureGroupResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureIactnRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureIactnResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureResponse;
import com.landawn.ofbiz.model.product.CreateProductFeatureTypeRequest;
import com.landawn.ofbiz.model.product.CreateProductFeatureTypeResponse;
import com.landawn.ofbiz.model.product.CreateProductGeoRequest;
import com.landawn.ofbiz.model.product.CreateProductGeoResponse;
import com.landawn.ofbiz.model.product.CreateProductGlAccountRequest;
import com.landawn.ofbiz.model.product.CreateProductGlAccountResponse;
import com.landawn.ofbiz.model.product.CreateProductGroupOrderRequest;
import com.landawn.ofbiz.model.product.CreateProductGroupOrderResponse;
import com.landawn.ofbiz.model.product.CreateProductInCategoryRequest;
import com.landawn.ofbiz.model.product.CreateProductInCategoryResponse;
import com.landawn.ofbiz.model.product.CreateProductKeywordRequest;
import com.landawn.ofbiz.model.product.CreateProductKeywordResponse;
import com.landawn.ofbiz.model.product.CreateProductMaintRequest;
import com.landawn.ofbiz.model.product.CreateProductMaintResponse;
import com.landawn.ofbiz.model.product.CreateProductMeterRequest;
import com.landawn.ofbiz.model.product.CreateProductMeterResponse;
import com.landawn.ofbiz.model.product.CreateProductPaymentMethodTypeRequest;
import com.landawn.ofbiz.model.product.CreateProductPaymentMethodTypeResponse;
import com.landawn.ofbiz.model.product.CreateProductPriceActionRequest;
import com.landawn.ofbiz.model.product.CreateProductPriceActionResponse;
import com.landawn.ofbiz.model.product.CreateProductPriceCondRequest;
import com.landawn.ofbiz.model.product.CreateProductPriceCondResponse;
import com.landawn.ofbiz.model.product.CreateProductPriceRequest;
import com.landawn.ofbiz.model.product.CreateProductPriceResponse;
import com.landawn.ofbiz.model.product.CreateProductPriceRuleRequest;
import com.landawn.ofbiz.model.product.CreateProductPriceRuleResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoActionRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoActionResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoCategoryRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoCategoryResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoCodePartyRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoCodePartyResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoCodeRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoCodeResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoCodeSetRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoCodeSetResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoCondRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoCondResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoProductRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoProductResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoResponse;
import com.landawn.ofbiz.model.product.CreateProductPromoRuleRequest;
import com.landawn.ofbiz.model.product.CreateProductPromoRuleResponse;
import com.landawn.ofbiz.model.product.CreateProductRequest;
import com.landawn.ofbiz.model.product.CreateProductResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreCatalogRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreCatalogResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreEmailSettingRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreEmailSettingResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreFacilityRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreFacilityResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreFinActSettingRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreFinActSettingResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreGroupMemberRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreGroupMemberResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreGroupRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreGroupResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreKeywordOvrdRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreKeywordOvrdResponse;
import com.landawn.ofbiz.model.product.CreateProductStorePaymentSettingRequest;
import com.landawn.ofbiz.model.product.CreateProductStorePaymentSettingResponse;
import com.landawn.ofbiz.model.product.CreateProductStorePromoApplRequest;
import com.landawn.ofbiz.model.product.CreateProductStorePromoApplResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreRoleRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreRoleResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreShipMethRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreShipMethResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreSurveyApplRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreSurveyApplResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreVendorPaymentRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreVendorPaymentResponse;
import com.landawn.ofbiz.model.product.CreateProductStoreVendorShipmentRequest;
import com.landawn.ofbiz.model.product.CreateProductStoreVendorShipmentResponse;
import com.landawn.ofbiz.model.product.CreateProductSubscriptionResourceRequest;
import com.landawn.ofbiz.model.product.CreateProductSubscriptionResourceResponse;
import com.landawn.ofbiz.model.product.CreateQuantityBreakRequest;
import com.landawn.ofbiz.model.product.CreateQuantityBreakResponse;
import com.landawn.ofbiz.model.product.CreateRelatedUrlContentForCategoryRequest;
import com.landawn.ofbiz.model.product.CreateRelatedUrlContentForCategoryResponse;
import com.landawn.ofbiz.model.product.CreateSalesAgreementRequest;
import com.landawn.ofbiz.model.product.CreateSalesAgreementResponse;
import com.landawn.ofbiz.model.product.CreateShipmentAndItemsForVendorReturnRequest;
import com.landawn.ofbiz.model.product.CreateShipmentAndItemsForVendorReturnResponse;
import com.landawn.ofbiz.model.product.CreateShipmentEstimateRequest;
import com.landawn.ofbiz.model.product.CreateShipmentEstimateResponse;
import com.landawn.ofbiz.model.product.CreateShipmentItemRequest;
import com.landawn.ofbiz.model.product.CreateShipmentItemResponse;
import com.landawn.ofbiz.model.product.CreateShipmentMethodTypeRequest;
import com.landawn.ofbiz.model.product.CreateShipmentMethodTypeResponse;
import com.landawn.ofbiz.model.product.CreateShipmentPackageContentRequest;
import com.landawn.ofbiz.model.product.CreateShipmentPackageContentResponse;
import com.landawn.ofbiz.model.product.CreateShipmentPackageRequest;
import com.landawn.ofbiz.model.product.CreateShipmentPackageResponse;
import com.landawn.ofbiz.model.product.CreateShipmentPackageRouteSegRequest;
import com.landawn.ofbiz.model.product.CreateShipmentPackageRouteSegResponse;
import com.landawn.ofbiz.model.product.CreateShipmentRequest;
import com.landawn.ofbiz.model.product.CreateShipmentResponse;
import com.landawn.ofbiz.model.product.CreateShipmentRouteSegmentRequest;
import com.landawn.ofbiz.model.product.CreateShipmentRouteSegmentResponse;
import com.landawn.ofbiz.model.product.CreateShipmentTimeEstimateRequest;
import com.landawn.ofbiz.model.product.CreateShipmentTimeEstimateResponse;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForAlternateLocaleRequest;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForAlternateLocaleResponse;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForCategoryRequest;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForCategoryResponse;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForProductConfigItemRequest;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForProductConfigItemResponse;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForProductRequest;
import com.landawn.ofbiz.model.product.CreateSimpleTextContentForProductResponse;
import com.landawn.ofbiz.model.product.CreateSubscriptionCommEventRequest;
import com.landawn.ofbiz.model.product.CreateSubscriptionCommEventResponse;
import com.landawn.ofbiz.model.product.CreateSubscriptionRequest;
import com.landawn.ofbiz.model.product.CreateSubscriptionResourceRequest;
import com.landawn.ofbiz.model.product.CreateSubscriptionResourceResponse;
import com.landawn.ofbiz.model.product.CreateSubscriptionResponse;
import com.landawn.ofbiz.model.product.CreateSupplierProductFeatureRequest;
import com.landawn.ofbiz.model.product.CreateSupplierProductFeatureResponse;
import com.landawn.ofbiz.model.product.CreateSupplierProductRequest;
import com.landawn.ofbiz.model.product.CreateSupplierProductResponse;
import com.landawn.ofbiz.model.product.CreateUpdateFacilityGeoPointRequest;
import com.landawn.ofbiz.model.product.CreateUpdateFacilityGeoPointResponse;
import com.landawn.ofbiz.model.product.CreateVendorProductRequest;
import com.landawn.ofbiz.model.product.CreateVendorProductResponse;
import com.landawn.ofbiz.model.product.DeleteCarrierShipmentMethodRequest;
import com.landawn.ofbiz.model.product.DeleteCarrierShipmentMethodResponse;
import com.landawn.ofbiz.model.product.DeleteCostComponentRequest;
import com.landawn.ofbiz.model.product.DeleteCostComponentResponse;
import com.landawn.ofbiz.model.product.DeleteFacilityContactMechPurposeRequest;
import com.landawn.ofbiz.model.product.DeleteFacilityContactMechPurposeResponse;
import com.landawn.ofbiz.model.product.DeleteFacilityContactMechRequest;
import com.landawn.ofbiz.model.product.DeleteFacilityContactMechResponse;
import com.landawn.ofbiz.model.product.DeleteFacilityContentRequest;
import com.landawn.ofbiz.model.product.DeleteFacilityContentResponse;
import com.landawn.ofbiz.model.product.DeleteFeaturePriceRequest;
import com.landawn.ofbiz.model.product.DeleteFeaturePriceResponse;
import com.landawn.ofbiz.model.product.DeleteGoodIdentificationRequest;
import com.landawn.ofbiz.model.product.DeleteGoodIdentificationResponse;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelApplRequest;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelApplResponse;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelRequest;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelResponse;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelTypeRequest;
import com.landawn.ofbiz.model.product.DeleteInventoryItemLabelTypeResponse;
import com.landawn.ofbiz.model.product.DeleteItemIssuanceRequest;
import com.landawn.ofbiz.model.product.DeleteItemIssuanceResponse;
import com.landawn.ofbiz.model.product.DeletePackedLineRequest;
import com.landawn.ofbiz.model.product.DeletePackedLineResponse;
import com.landawn.ofbiz.model.product.DeletePicklistBinRequest;
import com.landawn.ofbiz.model.product.DeletePicklistBinResponse;
import com.landawn.ofbiz.model.product.DeletePicklistItemRequest;
import com.landawn.ofbiz.model.product.DeletePicklistItemResponse;
import com.landawn.ofbiz.model.product.DeleteProductAssocRequest;
import com.landawn.ofbiz.model.product.DeleteProductAssocResponse;
import com.landawn.ofbiz.model.product.DeleteProductAttributeRequest;
import com.landawn.ofbiz.model.product.DeleteProductAttributeResponse;
import com.landawn.ofbiz.model.product.DeleteProductCategoryAttributeRequest;
import com.landawn.ofbiz.model.product.DeleteProductCategoryAttributeResponse;
import com.landawn.ofbiz.model.product.DeleteProductCategoryLinkRequest;
import com.landawn.ofbiz.model.product.DeleteProductCategoryLinkResponse;
import com.landawn.ofbiz.model.product.DeleteProductConfigItemRequest;
import com.landawn.ofbiz.model.product.DeleteProductConfigItemResponse;
import com.landawn.ofbiz.model.product.DeleteProductConfigOptionRequest;
import com.landawn.ofbiz.model.product.DeleteProductConfigOptionResponse;
import com.landawn.ofbiz.model.product.DeleteProductConfigProductRequest;
import com.landawn.ofbiz.model.product.DeleteProductConfigProductResponse;
import com.landawn.ofbiz.model.product.DeleteProductConfigRequest;
import com.landawn.ofbiz.model.product.DeleteProductConfigResponse;
import com.landawn.ofbiz.model.product.DeleteProductCostComponentCalcRequest;
import com.landawn.ofbiz.model.product.DeleteProductCostComponentCalcResponse;
import com.landawn.ofbiz.model.product.DeleteProductFacilityLocationRequest;
import com.landawn.ofbiz.model.product.DeleteProductFacilityLocationResponse;
import com.landawn.ofbiz.model.product.DeleteProductFacilityRequest;
import com.landawn.ofbiz.model.product.DeleteProductFacilityResponse;
import com.landawn.ofbiz.model.product.DeleteProductGeoRequest;
import com.landawn.ofbiz.model.product.DeleteProductGeoResponse;
import com.landawn.ofbiz.model.product.DeleteProductGlAccountRequest;
import com.landawn.ofbiz.model.product.DeleteProductGlAccountResponse;
import com.landawn.ofbiz.model.product.DeleteProductGroupOrderRequest;
import com.landawn.ofbiz.model.product.DeleteProductGroupOrderResponse;
import com.landawn.ofbiz.model.product.DeleteProductKeywordRequest;
import com.landawn.ofbiz.model.product.DeleteProductKeywordResponse;
import com.landawn.ofbiz.model.product.DeleteProductKeywordsRequest;
import com.landawn.ofbiz.model.product.DeleteProductKeywordsResponse;
import com.landawn.ofbiz.model.product.DeleteProductMaintRequest;
import com.landawn.ofbiz.model.product.DeleteProductMaintResponse;
import com.landawn.ofbiz.model.product.DeleteProductMeterRequest;
import com.landawn.ofbiz.model.product.DeleteProductMeterResponse;
import com.landawn.ofbiz.model.product.DeleteProductPaymentMethodTypeRequest;
import com.landawn.ofbiz.model.product.DeleteProductPaymentMethodTypeResponse;
import com.landawn.ofbiz.model.product.DeleteProductPriceActionRequest;
import com.landawn.ofbiz.model.product.DeleteProductPriceActionResponse;
import com.landawn.ofbiz.model.product.DeleteProductPriceCondRequest;
import com.landawn.ofbiz.model.product.DeleteProductPriceCondResponse;
import com.landawn.ofbiz.model.product.DeleteProductPriceRequest;
import com.landawn.ofbiz.model.product.DeleteProductPriceResponse;
import com.landawn.ofbiz.model.product.DeleteProductPriceRuleRequest;
import com.landawn.ofbiz.model.product.DeleteProductPriceRuleResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoActionRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoActionResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoCategoryRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoCategoryResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodeContactMechRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodeContactMechResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodePartyRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodePartyResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodeRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoCodeResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoCondRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoCondResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoProductRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoProductResponse;
import com.landawn.ofbiz.model.product.DeleteProductPromoRuleRequest;
import com.landawn.ofbiz.model.product.DeleteProductPromoRuleResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreCatalogRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreCatalogResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreFacilityRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreFacilityResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreKeywordOvrdRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreKeywordOvrdResponse;
import com.landawn.ofbiz.model.product.DeleteProductStorePaymentSettingRequest;
import com.landawn.ofbiz.model.product.DeleteProductStorePaymentSettingResponse;
import com.landawn.ofbiz.model.product.DeleteProductStorePromoApplRequest;
import com.landawn.ofbiz.model.product.DeleteProductStorePromoApplResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreSurveyApplRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreSurveyApplResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreVendorPaymentRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreVendorPaymentResponse;
import com.landawn.ofbiz.model.product.DeleteProductStoreVendorShipmentRequest;
import com.landawn.ofbiz.model.product.DeleteProductStoreVendorShipmentResponse;
import com.landawn.ofbiz.model.product.DeleteProductSubscriptionResourceRequest;
import com.landawn.ofbiz.model.product.DeleteProductSubscriptionResourceResponse;
import com.landawn.ofbiz.model.product.DeleteQuantityBreakRequest;
import com.landawn.ofbiz.model.product.DeleteQuantityBreakResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentItemRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentItemResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentMethodTypeRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentMethodTypeResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageContentRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageContentResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageRouteSegRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentPackageRouteSegResponse;
import com.landawn.ofbiz.model.product.DeleteShipmentRouteSegmentRequest;
import com.landawn.ofbiz.model.product.DeleteShipmentRouteSegmentResponse;
import com.landawn.ofbiz.model.product.DeleteVendorProductRequest;
import com.landawn.ofbiz.model.product.DeleteVendorProductResponse;
import com.landawn.ofbiz.model.product.DhlShipmentConfirmRequest;
import com.landawn.ofbiz.model.product.DhlShipmentConfirmResponse;
import com.landawn.ofbiz.model.product.DuplicateProductCategoryRequest;
import com.landawn.ofbiz.model.product.DuplicateProductCategoryResponse;
import com.landawn.ofbiz.model.product.DuplicateProductRequest;
import com.landawn.ofbiz.model.product.DuplicateProductResponse;
import com.landawn.ofbiz.model.product.DuplicateShipmentRouteSegmentRequest;
import com.landawn.ofbiz.model.product.DuplicateShipmentRouteSegmentResponse;
import com.landawn.ofbiz.model.product.EditPicklistItemRequest;
import com.landawn.ofbiz.model.product.EditPicklistItemResponse;
import com.landawn.ofbiz.model.product.ExpireAllCategoryProductMembersRequest;
import com.landawn.ofbiz.model.product.ExpireAllCategoryProductMembersResponse;
import com.landawn.ofbiz.model.product.ExpireShipmentTimeEstimateRequest;
import com.landawn.ofbiz.model.product.ExpireShipmentTimeEstimateResponse;
import com.landawn.ofbiz.model.product.FedexShipRequestRequest;
import com.landawn.ofbiz.model.product.FedexShipRequestResponse;
import com.landawn.ofbiz.model.product.ForceIndexProductKeywordsRequest;
import com.landawn.ofbiz.model.product.ForceIndexProductKeywordsResponse;
import com.landawn.ofbiz.model.product.GetAssociatedPriceRulesCondsRequest;
import com.landawn.ofbiz.model.product.GetAssociatedPriceRulesCondsResponse;
import com.landawn.ofbiz.model.product.ImageCropRequest;
import com.landawn.ofbiz.model.product.ImageCropResponse;
import com.landawn.ofbiz.model.product.ImageRotateRequest;
import com.landawn.ofbiz.model.product.ImageRotateResponse;
import com.landawn.ofbiz.model.product.IssueInventoryItemToShipmentRequest;
import com.landawn.ofbiz.model.product.IssueInventoryItemToShipmentResponse;
import com.landawn.ofbiz.model.product.IssueOrderItemShipGrpInvResToShipmentResponse;
import com.landawn.ofbiz.model.product.IssueOrderItemToShipmentResponse;
import com.landawn.ofbiz.model.product.MultipleUploadProductImagesRequest;
import com.landawn.ofbiz.model.product.MultipleUploadProductImagesResponse;
import com.landawn.ofbiz.model.product.PackBulkItemsRequest;
import com.landawn.ofbiz.model.product.PackBulkItemsResponse;
import com.landawn.ofbiz.model.product.PackSingleItemRequest;
import com.landawn.ofbiz.model.product.PackSingleItemResponse;
import com.landawn.ofbiz.model.product.PrintPickSheetsRequest;
import com.landawn.ofbiz.model.product.PrintPickSheetsResponse;
import com.landawn.ofbiz.model.product.ProcessPhysicalStockMoveRequest;
import com.landawn.ofbiz.model.product.ProcessPhysicalStockMoveResponse;
import com.landawn.ofbiz.model.product.QuickAddVariantResponse;
import com.landawn.ofbiz.model.product.QuickCreateVirtualWithVariantsRequest;
import com.landawn.ofbiz.model.product.QuickCreateVirtualWithVariantsResponse;
import com.landawn.ofbiz.model.product.QuickReceivePurchaseOrderRequest;
import com.landawn.ofbiz.model.product.QuickReceivePurchaseOrderResponse;
import com.landawn.ofbiz.model.product.QuickScheduleShipmentRouteSegmentResponse;
import com.landawn.ofbiz.model.product.QuickShipEntireOrderRequest;
import com.landawn.ofbiz.model.product.QuickShipEntireOrderResponse;
import com.landawn.ofbiz.model.product.ReceiveInventoryProductRequest;
import com.landawn.ofbiz.model.product.ReceiveInventoryProductResponse;
import com.landawn.ofbiz.model.product.RemoveCategoryContentRequest;
import com.landawn.ofbiz.model.product.RemoveCategoryContentResponse;
import com.landawn.ofbiz.model.product.RemoveExpiredCategoryProductMembersRequest;
import com.landawn.ofbiz.model.product.RemoveExpiredCategoryProductMembersResponse;
import com.landawn.ofbiz.model.product.RemoveFacilityFromGroupRequest;
import com.landawn.ofbiz.model.product.RemoveFacilityFromGroupResponse;
import com.landawn.ofbiz.model.product.RemoveFacilityGroupFromGroupRequest;
import com.landawn.ofbiz.model.product.RemoveFacilityGroupFromGroupResponse;
import com.landawn.ofbiz.model.product.RemoveFeatureFromProductRequest;
import com.landawn.ofbiz.model.product.RemoveFeatureFromProductResponse;
import com.landawn.ofbiz.model.product.RemoveImageBySizeRequest;
import com.landawn.ofbiz.model.product.RemoveImageBySizeResponse;
import com.landawn.ofbiz.model.product.RemoveOrderShipmentFromShipmentRequest;
import com.landawn.ofbiz.model.product.RemoveOrderShipmentFromShipmentResponse;
import com.landawn.ofbiz.model.product.RemovePartyFromCategoryRequest;
import com.landawn.ofbiz.model.product.RemovePartyFromCategoryResponse;
import com.landawn.ofbiz.model.product.RemovePartyFromFacilityGroupRequest;
import com.landawn.ofbiz.model.product.RemovePartyFromFacilityGroupResponse;
import com.landawn.ofbiz.model.product.RemovePartyFromFacilityRequest;
import com.landawn.ofbiz.model.product.RemovePartyFromFacilityResponse;
import com.landawn.ofbiz.model.product.RemovePartyFromProductRequest;
import com.landawn.ofbiz.model.product.RemovePartyFromProductResponse;
import com.landawn.ofbiz.model.product.RemoveProdCatalogFromPartyRequest;
import com.landawn.ofbiz.model.product.RemoveProdCatalogFromPartyResponse;
import com.landawn.ofbiz.model.product.RemoveProductCategoryFromCategoryRequest;
import com.landawn.ofbiz.model.product.RemoveProductCategoryFromCategoryResponse;
import com.landawn.ofbiz.model.product.RemoveProductCategoryFromProdCatalogRequest;
import com.landawn.ofbiz.model.product.RemoveProductCategoryFromProdCatalogResponse;
import com.landawn.ofbiz.model.product.RemoveProductConfigItemContentRequest;
import com.landawn.ofbiz.model.product.RemoveProductConfigItemContentResponse;
import com.landawn.ofbiz.model.product.RemoveProductContentAndImageFileRequest;
import com.landawn.ofbiz.model.product.RemoveProductContentAndImageFileResponse;
import com.landawn.ofbiz.model.product.RemoveProductContentRequest;
import com.landawn.ofbiz.model.product.RemoveProductContentResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureApplAttrRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureApplAttrResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureCatGrpApplRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureCatGrpApplResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureCategoryApplRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureCategoryApplResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureGroupApplRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureGroupApplResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureIactnRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureIactnResponse;
import com.landawn.ofbiz.model.product.RemoveProductFeatureTypeRequest;
import com.landawn.ofbiz.model.product.RemoveProductFeatureTypeResponse;
import com.landawn.ofbiz.model.product.RemoveProductFromCategoryRequest;
import com.landawn.ofbiz.model.product.RemoveProductFromCategoryResponse;
import com.landawn.ofbiz.model.product.RemoveProductPromoContentRequest;
import com.landawn.ofbiz.model.product.RemoveProductPromoContentResponse;
import com.landawn.ofbiz.model.product.RemoveProductStoreEmailSettingRequest;
import com.landawn.ofbiz.model.product.RemoveProductStoreEmailSettingResponse;
import com.landawn.ofbiz.model.product.RemoveProductStoreFinActSettingRequest;
import com.landawn.ofbiz.model.product.RemoveProductStoreFinActSettingResponse;
import com.landawn.ofbiz.model.product.RemoveProductStoreRoleRequest;
import com.landawn.ofbiz.model.product.RemoveProductStoreRoleResponse;
import com.landawn.ofbiz.model.product.RemoveProductStoreShipMethRequest;
import com.landawn.ofbiz.model.product.RemoveProductStoreShipMethResponse;
import com.landawn.ofbiz.model.product.RemoveShipmentEstimateRequest;
import com.landawn.ofbiz.model.product.RemoveShipmentEstimateResponse;
import com.landawn.ofbiz.model.product.RemoveSubscriptionCommEventRequest;
import com.landawn.ofbiz.model.product.RemoveSubscriptionCommEventResponse;
import com.landawn.ofbiz.model.product.RemoveSupplierProductFeatureRequest;
import com.landawn.ofbiz.model.product.RemoveSupplierProductFeatureResponse;
import com.landawn.ofbiz.model.product.RemoveSupplierProductRequest;
import com.landawn.ofbiz.model.product.RemoveSupplierProductResponse;
import com.landawn.ofbiz.model.product.RenameImageRequest;
import com.landawn.ofbiz.model.product.RenameImageResponse;
import com.landawn.ofbiz.model.product.ReplaceImageToExistImageRequest;
import com.landawn.ofbiz.model.product.ReplaceImageToExistImageResponse;
import com.landawn.ofbiz.model.product.ResizeImagesRequest;
import com.landawn.ofbiz.model.product.ResizeImagesResponse;
import com.landawn.ofbiz.model.product.SafeAddProductCategoryToCategoryRequest;
import com.landawn.ofbiz.model.product.SafeAddProductCategoryToCategoryResponse;
import com.landawn.ofbiz.model.product.SafeAddProductToCategoryRequest;
import com.landawn.ofbiz.model.product.SafeAddProductToCategoryResponse;
import com.landawn.ofbiz.model.product.SavePackagesInfoRequest;
import com.landawn.ofbiz.model.product.SavePackagesInfoResponse;
import com.landawn.ofbiz.model.product.SetImageDetailResponse;
import com.landawn.ofbiz.model.product.SetNextPackageSeqRequest;
import com.landawn.ofbiz.model.product.SetNextPackageSeqResponse;
import com.landawn.ofbiz.model.product.SetPackageInfoRequest;
import com.landawn.ofbiz.model.product.SetPackageInfoResponse;
import com.landawn.ofbiz.model.product.SetProductReviewStatusRequest;
import com.landawn.ofbiz.model.product.SetProductReviewStatusResponse;
import com.landawn.ofbiz.model.product.SetShipmentSettingsFromPrimaryOrderRequest;
import com.landawn.ofbiz.model.product.SetShipmentSettingsFromPrimaryOrderResponse;
import com.landawn.ofbiz.model.product.UpdateCarrierShipmentMethodRequest;
import com.landawn.ofbiz.model.product.UpdateCarrierShipmentMethodResponse;
import com.landawn.ofbiz.model.product.UpdateCategoryContentRequest;
import com.landawn.ofbiz.model.product.UpdateCategoryContentResponse;
import com.landawn.ofbiz.model.product.UpdateContentSEOForCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateContentSEOForCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateContentSEOForProductRequest;
import com.landawn.ofbiz.model.product.UpdateContentSEOForProductResponse;
import com.landawn.ofbiz.model.product.UpdateCostComponentRequest;
import com.landawn.ofbiz.model.product.UpdateCostComponentResponse;
import com.landawn.ofbiz.model.product.UpdateDownloadContentForCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateDownloadContentForCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateDownloadContentForProductRequest;
import com.landawn.ofbiz.model.product.UpdateDownloadContentForProductResponse;
import com.landawn.ofbiz.model.product.UpdateEmailContentForProductRequest;
import com.landawn.ofbiz.model.product.UpdateEmailContentForProductResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityContactMechRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityContactMechResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityEmailAddressRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityEmailAddressResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityGroupRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityGroupResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityGroupToGroupRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityGroupToGroupResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityLocationRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityLocationResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityPartyRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityPartyResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityPostalAddressRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityPostalAddressResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityTelecomNumberRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityTelecomNumberResponse;
import com.landawn.ofbiz.model.product.UpdateFacilityToGroupRequest;
import com.landawn.ofbiz.model.product.UpdateFacilityToGroupResponse;
import com.landawn.ofbiz.model.product.UpdateFeaturePriceRequest;
import com.landawn.ofbiz.model.product.UpdateFeaturePriceResponse;
import com.landawn.ofbiz.model.product.UpdateFeatureToProductApplicationResponse;
import com.landawn.ofbiz.model.product.UpdateGoodIdentificationRequest;
import com.landawn.ofbiz.model.product.UpdateGoodIdentificationResponse;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelApplRequest;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelApplResponse;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelRequest;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelResponse;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelTypeRequest;
import com.landawn.ofbiz.model.product.UpdateInventoryItemLabelTypeResponse;
import com.landawn.ofbiz.model.product.UpdateInventoryItemRequest;
import com.landawn.ofbiz.model.product.UpdateInventoryItemResponse;
import com.landawn.ofbiz.model.product.UpdateInventoryTransferRequest;
import com.landawn.ofbiz.model.product.UpdateInventoryTransferResponse;
import com.landawn.ofbiz.model.product.UpdatePackedLineRequest;
import com.landawn.ofbiz.model.product.UpdatePackedLineResponse;
import com.landawn.ofbiz.model.product.UpdatePartyToCategoryRequest;
import com.landawn.ofbiz.model.product.UpdatePartyToCategoryResponse;
import com.landawn.ofbiz.model.product.UpdatePartyToProductRequest;
import com.landawn.ofbiz.model.product.UpdatePartyToProductResponse;
import com.landawn.ofbiz.model.product.UpdatePicklistBinRequest;
import com.landawn.ofbiz.model.product.UpdatePicklistBinResponse;
import com.landawn.ofbiz.model.product.UpdatePicklistRequest;
import com.landawn.ofbiz.model.product.UpdatePicklistResponse;
import com.landawn.ofbiz.model.product.UpdateProdCatalogRequest;
import com.landawn.ofbiz.model.product.UpdateProdCatalogResponse;
import com.landawn.ofbiz.model.product.UpdateProdCatalogToPartyRequest;
import com.landawn.ofbiz.model.product.UpdateProdCatalogToPartyResponse;
import com.landawn.ofbiz.model.product.UpdateProductAssocRequest;
import com.landawn.ofbiz.model.product.UpdateProductAssocResponse;
import com.landawn.ofbiz.model.product.UpdateProductAttributeRequest;
import com.landawn.ofbiz.model.product.UpdateProductAttributeResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryAttributeRequest;
import com.landawn.ofbiz.model.product.UpdateProductCategoryAttributeResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryLinkRequest;
import com.landawn.ofbiz.model.product.UpdateProductCategoryLinkResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateProductCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryToCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateProductCategoryToProdCatalogRequest;
import com.landawn.ofbiz.model.product.UpdateProductCategoryToProdCatalogResponse;
import com.landawn.ofbiz.model.product.UpdateProductConfigItemContentRequest;
import com.landawn.ofbiz.model.product.UpdateProductConfigItemContentResponse;
import com.landawn.ofbiz.model.product.UpdateProductConfigItemRequest;
import com.landawn.ofbiz.model.product.UpdateProductConfigItemResponse;
import com.landawn.ofbiz.model.product.UpdateProductConfigOptionRequest;
import com.landawn.ofbiz.model.product.UpdateProductConfigOptionResponse;
import com.landawn.ofbiz.model.product.UpdateProductConfigProductRequest;
import com.landawn.ofbiz.model.product.UpdateProductConfigProductResponse;
import com.landawn.ofbiz.model.product.UpdateProductConfigRequest;
import com.landawn.ofbiz.model.product.UpdateProductConfigResponse;
import com.landawn.ofbiz.model.product.UpdateProductContentRequest;
import com.landawn.ofbiz.model.product.UpdateProductContentResponse;
import com.landawn.ofbiz.model.product.UpdateProductCostComponentCalcRequest;
import com.landawn.ofbiz.model.product.UpdateProductCostComponentCalcResponse;
import com.landawn.ofbiz.model.product.UpdateProductFacilityLocationRequest;
import com.landawn.ofbiz.model.product.UpdateProductFacilityLocationResponse;
import com.landawn.ofbiz.model.product.UpdateProductFacilityRequest;
import com.landawn.ofbiz.model.product.UpdateProductFacilityResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCatGrpApplRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCatGrpApplResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCategoryApplRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCategoryApplResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureGroupApplResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureGroupRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureGroupResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureResponse;
import com.landawn.ofbiz.model.product.UpdateProductFeatureTypeRequest;
import com.landawn.ofbiz.model.product.UpdateProductFeatureTypeResponse;
import com.landawn.ofbiz.model.product.UpdateProductGeoRequest;
import com.landawn.ofbiz.model.product.UpdateProductGeoResponse;
import com.landawn.ofbiz.model.product.UpdateProductGlAccountRequest;
import com.landawn.ofbiz.model.product.UpdateProductGlAccountResponse;
import com.landawn.ofbiz.model.product.UpdateProductGroupOrderRequest;
import com.landawn.ofbiz.model.product.UpdateProductGroupOrderResponse;
import com.landawn.ofbiz.model.product.UpdateProductKeywordRequest;
import com.landawn.ofbiz.model.product.UpdateProductKeywordResponse;
import com.landawn.ofbiz.model.product.UpdateProductMaintRequest;
import com.landawn.ofbiz.model.product.UpdateProductMaintResponse;
import com.landawn.ofbiz.model.product.UpdateProductMeterRequest;
import com.landawn.ofbiz.model.product.UpdateProductMeterResponse;
import com.landawn.ofbiz.model.product.UpdateProductPaymentMethodTypeRequest;
import com.landawn.ofbiz.model.product.UpdateProductPaymentMethodTypeResponse;
import com.landawn.ofbiz.model.product.UpdateProductPriceActionRequest;
import com.landawn.ofbiz.model.product.UpdateProductPriceActionResponse;
import com.landawn.ofbiz.model.product.UpdateProductPriceCondRequest;
import com.landawn.ofbiz.model.product.UpdateProductPriceCondResponse;
import com.landawn.ofbiz.model.product.UpdateProductPriceRequest;
import com.landawn.ofbiz.model.product.UpdateProductPriceResponse;
import com.landawn.ofbiz.model.product.UpdateProductPriceRuleRequest;
import com.landawn.ofbiz.model.product.UpdateProductPriceRuleResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoActionRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoActionResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoCodeRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoCodeResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoCondRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoCondResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoProductRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoProductResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoResponse;
import com.landawn.ofbiz.model.product.UpdateProductPromoRuleRequest;
import com.landawn.ofbiz.model.product.UpdateProductPromoRuleResponse;
import com.landawn.ofbiz.model.product.UpdateProductQuickAdminNameRequest;
import com.landawn.ofbiz.model.product.UpdateProductQuickAdminNameResponse;
import com.landawn.ofbiz.model.product.UpdateProductQuickAdminShippingResponse;
import com.landawn.ofbiz.model.product.UpdateProductRequest;
import com.landawn.ofbiz.model.product.UpdateProductResponse;
import com.landawn.ofbiz.model.product.UpdateProductReviewRequest;
import com.landawn.ofbiz.model.product.UpdateProductReviewResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreCatalogRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreCatalogResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreEmailSettingRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreEmailSettingResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreFacilityRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreFacilityResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreFinActSettingRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreFinActSettingResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreGroupRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreGroupResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreGroupRollupRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreGroupRollupResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreKeywordOvrdRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreKeywordOvrdResponse;
import com.landawn.ofbiz.model.product.UpdateProductStorePaymentSettingRequest;
import com.landawn.ofbiz.model.product.UpdateProductStorePaymentSettingResponse;
import com.landawn.ofbiz.model.product.UpdateProductStorePromoApplRequest;
import com.landawn.ofbiz.model.product.UpdateProductStorePromoApplResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreRoleRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreRoleResponse;
import com.landawn.ofbiz.model.product.UpdateProductStoreShipMethRequest;
import com.landawn.ofbiz.model.product.UpdateProductStoreShipMethResponse;
import com.landawn.ofbiz.model.product.UpdateProductSubscriptionResourceRequest;
import com.landawn.ofbiz.model.product.UpdateProductSubscriptionResourceResponse;
import com.landawn.ofbiz.model.product.UpdateProductToCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateProductToCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateQuantityBreakRequest;
import com.landawn.ofbiz.model.product.UpdateQuantityBreakResponse;
import com.landawn.ofbiz.model.product.UpdateRelatedUrlContentForCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateRelatedUrlContentForCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayConfigRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayConfigResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayConfigTypeRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayConfigTypeResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayDhlRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayDhlResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayFedexRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayFedexResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayUpsRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayUpsResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayUspsRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentGatewayUspsResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentMethodTypeRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentMethodTypeResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentPackageRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentPackageResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentPackageRouteSegRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentPackageRouteSegResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentRouteSegmentRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentRouteSegmentResponse;
import com.landawn.ofbiz.model.product.UpdateShipmentTimeEstimateRequest;
import com.landawn.ofbiz.model.product.UpdateShipmentTimeEstimateResponse;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForCategoryRequest;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForCategoryResponse;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForProductConfigItemRequest;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForProductConfigItemResponse;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForProductRequest;
import com.landawn.ofbiz.model.product.UpdateSimpleTextContentForProductResponse;
import com.landawn.ofbiz.model.product.UpdateStatusImageManagementResponse;
import com.landawn.ofbiz.model.product.UpdateSubscriptionAttributeRequest;
import com.landawn.ofbiz.model.product.UpdateSubscriptionAttributeResponse;
import com.landawn.ofbiz.model.product.UpdateSubscriptionRequest;
import com.landawn.ofbiz.model.product.UpdateSubscriptionResourceRequest;
import com.landawn.ofbiz.model.product.UpdateSubscriptionResourceResponse;
import com.landawn.ofbiz.model.product.UpdateSubscriptionResponse;
import com.landawn.ofbiz.model.product.UpdateSupplierProductFeatureRequest;
import com.landawn.ofbiz.model.product.UpdateSupplierProductFeatureResponse;
import com.landawn.ofbiz.model.product.UpdateSupplierProductRequest;
import com.landawn.ofbiz.model.product.UpdateSupplierProductResponse;
import com.landawn.ofbiz.model.product.UploadFrameResponse;
import com.landawn.ofbiz.model.product.UploadProductAdditionalViewImagesRequest;
import com.landawn.ofbiz.model.product.UploadProductAdditionalViewImagesResponse;
import com.landawn.ofbiz.model.product.UpsShipmentAcceptRequest;
import com.landawn.ofbiz.model.product.UpsShipmentAcceptResponse;
import com.landawn.ofbiz.model.product.UpsShipmentConfirmRequest;
import com.landawn.ofbiz.model.product.UpsShipmentConfirmResponse;
import com.landawn.ofbiz.model.product.UpsTrackShipmentRequest;
import com.landawn.ofbiz.model.product.UpsTrackShipmentResponse;
import com.landawn.ofbiz.model.product.UpsVoidShipmentRequest;
import com.landawn.ofbiz.model.product.UpsVoidShipmentResponse;
import com.landawn.ofbiz.model.product.VerifyBulkItemRequest;
import com.landawn.ofbiz.model.product.VerifyBulkItemResponse;
import com.landawn.ofbiz.model.product.VerifySingleItemRequest;
import com.landawn.ofbiz.model.product.VerifySingleItemResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Create a ProductFeatureIactn
     * <p>service: createProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/AddProductFeatureIactn")
    public ResponseEntity<CreateProductFeatureIactnResponse> createProductFeatureIactn(@RequestBody CreateProductFeatureIactnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreGroupMember
     * <p>service: createProductStoreGroupMember  entities: ProductStoreGroupMember  auth: true
     */
    @PostMapping("/catalog/control/AddProductStoreToGroup")
    public ResponseEntity<CreateProductStoreGroupMemberResponse> createProductStoreGroupMember(@RequestBody CreateProductStoreGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a ProductFeature to a Product; a fromDate can be used to specify when the feature will be applied, if no fromDate is specified, it will be applied now.
     * <p>service: applyFeatureToProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/ApplyFeatureToProduct")
    public ResponseEntity<ApplyFeatureToProductResponse> applyFeatureToProduct(@RequestBody ApplyFeatureToProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a ProductFeature to a Product
     * <p>service: applyFeatureToProductFromTypeAndCode  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/ApplyFeatureToProductFromTypeAndCode")
    public ResponseEntity<ApplyFeatureToProductFromTypeAndCodeResponse> applyFeatureToProductFromTypeAndCode(@RequestBody ApplyFeatureToProductFromTypeAndCodeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductFeatureGroupAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/ApplyFeaturesFromCategoryToGroup")
    public ResponseEntity<CreateProductFeatureGroupApplResponse> createProductFeatureGroupAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: applyFeatureToProduct  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/ApplyFeaturesToProduct")
    public ResponseEntity<ApplyFeatureToProductResponse> applyFeatureToProductApplyFeaturesToProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/BulkAddProductFeatures")
    public ResponseEntity<CreateProductFeatureResponse> createProductFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureCategory record
     * <p>service: createProductFeatureCategory  entities: ProductFeatureCategory  auth: true
     */
    @PostMapping("/catalog/control/CreateFeatureCategory")
    public ResponseEntity<CreateProductFeatureCategoryResponse> createProductFeatureCategory(@RequestBody CreateProductFeatureCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup
     * <p>service: createProductFeatureGroup  entities: ProductFeatureGroup  auth: true
     */
    @PostMapping("/catalog/control/CreateProductFeatureGroup")
    public ResponseEntity<CreateProductFeatureGroupResponse> createProductFeatureGroup(@RequestBody CreateProductFeatureGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup to ProductFeature Application
     * <p>service: createProductFeatureGroupAppl  entities: ProductFeatureGroupAppl  auth: true
     */
    @PostMapping("/catalog/control/CreateProductFeatureGroupAppl")
    public ResponseEntity<CreateProductFeatureGroupApplResponse> createProductFeatureGroupApplCreateProductFeatureGroupAppl(@RequestBody CreateProductFeatureGroupApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreFinActSetting
     * <p>service: createProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/CreateProductStoreFinAccountSettings")
    public ResponseEntity<CreateProductStoreFinActSettingResponse> createProductStoreFinActSetting(@RequestBody CreateProductStoreFinActSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create missing Category and Product Alternative URLs
     * <p>service: createMissingCategoryAndProductAltUrls  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/CreateSeoProdCatalog")
    public ResponseEntity<CreateMissingCategoryAndProductAltUrlsResponse> createMissingCategoryAndProductAltUrls(@RequestBody CreateMissingCategoryAndProductAltUrlsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Crop Image
     * <p>service: imageCrop  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/CropImage")
    public ResponseEntity<ImageCropResponse> imageCrop(@RequestBody ImageCropRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicate a Product using a new productId
     * <p>service: duplicateProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/DuplicateProduct")
    public ResponseEntity<DuplicateProductResponse> duplicateProduct(@RequestBody DuplicateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicate a Product Category using from oldProductCategoryId to a new productCategoryId
     * <p>service: duplicateProductCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/DuplicateProductCategory")
    public ResponseEntity<DuplicateProductCategoryResponse> duplicateProductCategory(@RequestBody DuplicateProductCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickAddChosenVariant  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/QuickAddChosenVariant")
    public ResponseEntity<Map<String, Object>> quickAddChosenVariant(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickAddVariant  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/QuickAddChosenVariants")
    public ResponseEntity<QuickAddVariantResponse> quickAddVariant(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeature from a Product
     * <p>service: removeFeatureFromProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/RemoveFeatureFromProduct")
    public ResponseEntity<RemoveFeatureFromProductResponse> removeFeatureFromProduct(@RequestBody RemoveFeatureFromProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureGroup to ProductFeature Application
     * <p>service: removeProductFeatureGroupAppl  entities: ProductFeatureGroupAppl  auth: true
     */
    @PostMapping("/catalog/control/RemoveProductFeatureGroupAppl")
    public ResponseEntity<RemoveProductFeatureGroupApplResponse> removeProductFeatureGroupAppl(@RequestBody RemoveProductFeatureGroupApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductStoreFinActSetting
     * <p>service: removeProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/RemoveProductStoreFinAccountSettings")
    public ResponseEntity<RemoveProductStoreFinActSettingResponse> removeProductStoreFinActSetting(@RequestBody RemoveProductStoreFinActSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Rotate Image
     * <p>service: imageRotate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/RotateImage")
    public ResponseEntity<ImageRotateResponse> imageRotate(@RequestBody ImageRotateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateAllKeywords  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateAllKeywords")
    public ResponseEntity<Map<String, Object>> updateAllKeywords(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureCategory record
     * <p>service: updateProductFeatureCategory  entities: ProductFeatureCategory  auth: true
     */
    @PostMapping("/catalog/control/UpdateFeatureCategory")
    public ResponseEntity<UpdateProductFeatureCategoryResponse> updateProductFeatureCategory(@RequestBody UpdateProductFeatureCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateFeatureToProductApplication  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateFeatureToProductApplication")
    public ResponseEntity<UpdateFeatureToProductApplicationResponse> updateFeatureToProductApplication(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup
     * <p>service: updateProductFeatureGroup  entities: ProductFeatureGroup  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductFeatureGroup")
    public ResponseEntity<UpdateProductFeatureGroupResponse> updateProductFeatureGroup(@RequestBody UpdateProductFeatureGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductFeatureGroupAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateProductFeatureGroupAppl")
    public ResponseEntity<UpdateProductFeatureGroupApplResponse> updateProductFeatureGroupAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateProductFeatureInCategory")
    public ResponseEntity<UpdateProductFeatureResponse> updateProductFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreFinActSetting
     * <p>service: updateProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductStoreFinAccountSettings")
    public ResponseEntity<UpdateProductStoreFinActSettingResponse> updateProductStoreFinActSetting(@RequestBody UpdateProductStoreFinActSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy Virtual Product's data to the Variant Products
     * <p>service: copyToProductVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductVariants")
    public ResponseEntity<CopyToProductVariantsResponse> copyToProductVariants(@RequestBody CopyToProductVariantsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create (when not exist) or update (when exist) a Subscription attribute
     * <p>service: updateSubscriptionAttribute  entities: SubscriptionAttribute  auth: true
     */
    @PostMapping("/catalog/control/UpdateSubscriptionAttribute")
    public ResponseEntity<UpdateSubscriptionAttributeResponse> updateSubscriptionAttribute(@RequestBody UpdateSubscriptionAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addAdditionalViewForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/addAdditionalImageContentForProduct")
    public ResponseEntity<AddAdditionalViewForProductResponse> addAdditionalViewForProduct(@RequestBody AddAdditionalViewForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Upload Additional View Images For Product
     * <p>service: uploadProductAdditionalViewImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addAdditionalImagesForProduct")
    public ResponseEntity<UploadProductAdditionalViewImagesResponse> uploadProductAdditionalViewImages(@RequestBody UploadProductAdditionalViewImagesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Category
     * <p>service: safeAddProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/addCategoryProductMember")
    public ResponseEntity<SafeAddProductToCategoryResponse> safeAddProductToCategory(@RequestBody SafeAddProductToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Category
     * <p>service: createCategoryContent  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToCategory")
    public ResponseEntity<CreateCategoryContentResponse> createCategoryContent(@RequestBody CreateCategoryContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Product
     * <p>service: createProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToProduct")
    public ResponseEntity<CreateProductContentResponse> createProductContent(@RequestBody CreateProductContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To ProductConfigItem
     * <p>service: createProductConfigItemContent  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToProductConfigItem")
    public ResponseEntity<CreateProductConfigItemContentResponse> createProductConfigItemContent(@RequestBody CreateProductConfigItemContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Fixed Asset
     * <p>service: addFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/addFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> addFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addImageForProductPromo  entities: ProductPromoContent  auth: true
     */
    @PostMapping("/catalog/control/addImageContentForProductPromo")
    public ResponseEntity<AddImageForProductPromoResponse> addImageForProductPromo(@RequestBody AddImageForProductPromoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Multiple upload Images For Product
     * <p>service: multipleUploadProductImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addImageForProduct")
    public ResponseEntity<MultipleUploadProductImagesResponse> multipleUploadProductImages(@RequestBody MultipleUploadProductImagesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To Category
     * <p>service: addPartyToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addPartyToCategory")
    public ResponseEntity<AddPartyToCategoryResponse> addPartyToCategory(@RequestBody AddPartyToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To Product
     * <p>service: addPartyToProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addPartyToProduct")
    public ResponseEntity<AddPartyToProductResponse> addPartyToProduct(@RequestBody AddPartyToProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProdCatalog To Party
     * <p>service: addProdCatalogToParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/addProdCatalogToParty")
    public ResponseEntity<AddProdCatalogToPartyResponse> addProdCatalogToParty(@RequestBody AddProdCatalogToPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Safe Add ProductCategory To Category (requires fromDate)
     * <p>service: safeAddProductCategoryToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addProductCategoryToCategory")
    public ResponseEntity<SafeAddProductCategoryToCategoryResponse> safeAddProductCategoryToCategory(@RequestBody SafeAddProductCategoryToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: addProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/addProductCategoryToProdCatalog")
    public ResponseEntity<AddProductCategoryToProdCatalogResponse> addProductCategoryToProdCatalog(@RequestBody AddProductCategoryToProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreFacility
     * <p>service: createProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/addProductStoreFacility")
    public ResponseEntity<CreateProductStoreFacilityResponse> createProductStoreFacility(@RequestBody CreateProductStoreFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Category
     * <p>service: safeAddProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/addProductToCategory")
    public ResponseEntity<SafeAddProductToCategoryResponse> safeAddProductToCategoryAddProductToCategory(@RequestBody SafeAddProductToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addRejectedReasonImageManagement  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/addRejectedReasonImageManagement")
    public ResponseEntity<AddRejectedReasonImageManagementResponse> addRejectedReasonImageManagement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * This will create a virtual product and return its ID, and associate all of the variants with it. It will not put the selectable features on the virtual or standard features on the variant.
     * <p>service: quickCreateVirtualWithVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addVariantsToVirtual")
    public ResponseEntity<QuickCreateVirtualWithVariantsResponse> quickCreateVirtualWithVariants(@RequestBody QuickCreateVirtualWithVariantsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Attach Product Features To Category Through Groups
     * <p>service: attachProductFeaturesToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/attachProductFeaturesToCategory")
    public ResponseEntity<AttachProductFeaturesToCategoryResponse> attachProductFeaturesToCategory(@RequestBody AttachProductFeaturesToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Calculates the product's costs. If the product does not have cost component defined, will use the BOM to calculate the cost.
     * <p>service: calculateProductCosts  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/calculateProductCosts")
    public ResponseEntity<CalculateProductCostsResponse> calculateProductCosts(@RequestBody CalculateProductCostsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: addProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_addProductCategoryToProdCatalog")
    public ResponseEntity<AddProductCategoryToProdCatalogResponse> addProductCategoryToProdCatalogCategoryAddProductCategoryToProdCatalog(@RequestBody AddProductCategoryToProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From ProdCatalog
     * <p>service: removeProductCategoryFromProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_removeProductCategoryFromProdCatalog")
    public ResponseEntity<RemoveProductCategoryFromProdCatalogResponse> removeProductCategoryFromProdCatalog(@RequestBody RemoveProductCategoryFromProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: updateProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_updateProductCategoryToProdCatalog")
    public ResponseEntity<UpdateProductCategoryToProdCatalogResponse> updateProductCategoryToProdCatalog(@RequestBody UpdateProductCategoryToProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: test  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/checkAction")
    public ResponseEntity<CreateProductFeatureIactnResponse> checkAction(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/checkRejected")
    public ResponseEntity<Map<String, Object>> checkRejected(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: chooseFrameImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/chooseFrameImage")
    public ResponseEntity<Map<String, Object>> chooseFrameImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy Product Members from one Category to Another, optionally filtering by the given valid date (otherwise no date filtering done), and optionally recursing (if recurse=Y) down the from category
     * <p>service: copyCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/copyCategoryProductMembers")
    public ResponseEntity<CopyCategoryProductMembersResponse> copyCategoryProductMembers(@RequestBody CopyCategoryProductMembersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates several ProductPromoCode from an uploaded list of promo codes (one code per line)
     * <p>service: createBulkProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createBulkProductPromoCode")
    public ResponseEntity<CreateBulkProductPromoCodeResponse> createBulkProductPromoCode(@RequestBody CreateBulkProductPromoCodeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create several ProductPromoCodeEmail from an uploaded list of emails (one address per line)
     * <p>service: createBulkProductPromoCodeEmail  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createBulkProductPromoCodeEmail")
    public ResponseEntity<CreateBulkProductPromoCodeEmailResponse> createBulkProductPromoCodeEmail(@RequestBody CreateBulkProductPromoCodeEmailRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates A CarrierShipmentMethod
     * <p>service: createCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/createCarrierShipmentMethod")
    public ResponseEntity<CreateCarrierShipmentMethodResponse> createCarrierShipmentMethod(@RequestBody CreateCarrierShipmentMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createCommunicationEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CostComponent
     * <p>service: createCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/createCostComponent")
    public ResponseEntity<CreateCostComponentResponse> createCostComponent(@RequestBody CreateCostComponentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDownloadContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createDownloadContentForCategory")
    public ResponseEntity<CreateDownloadContentForCategoryResponse> createDownloadContentForCategory(@RequestBody CreateDownloadContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDownloadContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createDownloadContentForProduct")
    public ResponseEntity<CreateDownloadContentForProductResponse> createDownloadContentForProduct(@RequestBody CreateDownloadContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createEmailContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createEmailContentForProduct")
    public ResponseEntity<CreateEmailContentForProductResponse> createEmailContentForProduct(@RequestBody CreateEmailContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Product
     * <p>service: createProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createExternalContentForProduct")
    public ResponseEntity<CreateProductContentResponse> createProductContentCreateExternalContentForProduct(@RequestBody CreateProductContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Feature Price
     * <p>service: createFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/createFeaturePrice")
    public ResponseEntity<CreateFeaturePriceResponse> createFeaturePrice(@RequestBody CreateFeaturePriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GoodIdentification
     * <p>service: createGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/createGoodIdentification")
    public ResponseEntity<CreateGoodIdentificationResponse> createGoodIdentification(@RequestBody CreateGoodIdentificationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Image Frame For Product.
     * <p>service: addImageFrame  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createImageFrame")
    public ResponseEntity<AddImageFrameResponse> addImageFrame(@RequestBody AddImageFrameRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Keyword Thesaurus
     * <p>service: createKeywordThesaurus  entities: KeywordThesaurus  auth: true
     */
    @PostMapping("/catalog/control/createKeywordThesaurus")
    public ResponseEntity<Map<String, Object>> createKeywordThesaurus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProdCatalog
     * <p>service: createProdCatalog  entities: ProdCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProdCatalog")
    public ResponseEntity<CreateProdCatalogResponse> createProdCatalog(@RequestBody CreateProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreCatalog
     * <p>service: createProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProdCatalogStore")
    public ResponseEntity<CreateProductStoreCatalogResponse> createProductStoreCatalog(@RequestBody CreateProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product
     * <p>service: createProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/createProduct")
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/createProductAssoc")
    public ResponseEntity<CreateProductAssocResponse> createProductAssoc(@RequestBody CreateProductAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductAttribute
     * <p>service: createProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/createProductAttribute")
    public ResponseEntity<CreateProductAttributeResponse> createProductAttribute(@RequestBody CreateProductAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductCategory
     * <p>service: createProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductCategory")
    public ResponseEntity<CreateProductCategoryResponse> createProductCategory(@RequestBody CreateProductCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/createProductCategoryAttribute")
    public ResponseEntity<CreateProductCategoryAttributeResponse> createProductCategoryAttribute(@RequestBody CreateProductCategoryAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductCategoryLink
     * <p>service: createProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/createProductCategoryLink")
    public ResponseEntity<CreateProductCategoryLinkResponse> createProductCategoryLink(@RequestBody CreateProductCategoryLinkRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfig
     * <p>service: createProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/createProductConfig")
    public ResponseEntity<CreateProductConfigResponse> createProductConfig(@RequestBody CreateProductConfigRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfigItem
     * <p>service: createProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigItem")
    public ResponseEntity<CreateProductConfigItemResponse> createProductConfigItem(@RequestBody CreateProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Config Option
     * <p>service: createProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigOption")
    public ResponseEntity<CreateProductConfigOptionResponse> createProductConfigOption(@RequestBody CreateProductConfigOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfigProduct
     * <p>service: createProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigProduct")
    public ResponseEntity<CreateProductConfigProductResponse> createProductConfigProduct(@RequestBody CreateProductConfigProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductCostComponentCalc
     * <p>service: createProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/createProductCostComponentCalc")
    public ResponseEntity<CreateProductCostComponentCalcResponse> createProductCostComponentCalc(@RequestBody CreateProductCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacility
     * <p>service: createProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/createProductFacility")
    public ResponseEntity<CreateProductFacilityResponse> createProductFacility(@RequestBody CreateProductFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacilityLocation
     * <p>service: createProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/createProductFacilityLocation")
    public ResponseEntity<CreateProductFacilityLocationResponse> createProductFacilityLocation(@RequestBody CreateProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeature record
     * <p>service: createProductFeature  entities: ProductFeature  auth: true
     */
    @PostMapping("/catalog/control/createProductFeature")
    public ResponseEntity<CreateProductFeatureResponse> createProductFeatureCreateProductFeature(@RequestBody CreateProductFeatureRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureApplAttr
     * <p>service: createProductFeatureApplAttr  entities: ProductFeatureApplAttr  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureApplAttr")
    public ResponseEntity<CreateProductFeatureApplAttrResponse> createProductFeatureApplAttr(@RequestBody CreateProductFeatureApplAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup to ProductCategory Application
     * <p>service: createProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureCatGrpAppl")
    public ResponseEntity<CreateProductFeatureCatGrpApplResponse> createProductFeatureCatGrpAppl(@RequestBody CreateProductFeatureCatGrpApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureCategory to ProductCategory Application
     * <p>service: createProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureCategoryAppl")
    public ResponseEntity<CreateProductFeatureCategoryApplResponse> createProductFeatureCategoryAppl(@RequestBody CreateProductFeatureCategoryApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureIactn
     * <p>service: createProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureIactn")
    public ResponseEntity<CreateProductFeatureIactnResponse> createProductFeatureIactnCreateProductFeatureIactn(@RequestBody CreateProductFeatureIactnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureType
     * <p>service: createProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureType")
    public ResponseEntity<CreateProductFeatureTypeResponse> createProductFeatureType(@RequestBody CreateProductFeatureTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductGeo
     * <p>service: createProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/createProductGeo")
    public ResponseEntity<CreateProductGeoResponse> createProductGeo(@RequestBody CreateProductGeoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductGlAccount
     * <p>service: createProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/createProductGlAccount")
    public ResponseEntity<CreateProductGlAccountResponse> createProductGlAccount(@RequestBody CreateProductGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductGroupOrder
     * <p>service: createProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/createProductGroupOrder")
    public ResponseEntity<CreateProductGroupOrderResponse> createProductGroupOrder(@RequestBody CreateProductGroupOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductInCategory  entities: Product, ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductInCategory")
    public ResponseEntity<CreateProductInCategoryResponse> createProductInCategory(@RequestBody CreateProductInCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductKeyword
     * <p>service: createProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/createProductKeyword")
    public ResponseEntity<CreateProductKeywordResponse> createProductKeyword(@RequestBody CreateProductKeywordRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductMaint
     * <p>service: createProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/createProductMaint")
    public ResponseEntity<CreateProductMaintResponse> createProductMaint(@RequestBody CreateProductMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductMeter
     * <p>service: createProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/createProductMeter")
    public ResponseEntity<CreateProductMeterResponse> createProductMeter(@RequestBody CreateProductMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductPaymentMethodType
     * <p>service: createProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/createProductPaymentMethodType")
    public ResponseEntity<CreateProductPaymentMethodTypeResponse> createProductPaymentMethodType(@RequestBody CreateProductPaymentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Price. If taxAuthGeoId and taxAuthPartyId are passed in then the price will be considered a price with tax included (the priceWithoutTax, priceWithTax, taxAmount, and taxPercentage fields will also be populated). If the taxInPrice field is 'Y' then the price field will be left with the tax included (price will be equal to priceWithTax), otherwise tax will be removed from the passed in price and the price field will be equal to the priceWithoutTax field. If taxAuthGeoId or taxAuthPartyId empty then the taxInPrice field will be ignored.
     * <p>service: createProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/createProductPrice")
    public ResponseEntity<CreateProductPriceResponse> createProductPrice(@RequestBody CreateProductPriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceAction
     * <p>service: createProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceAction")
    public ResponseEntity<CreateProductPriceActionResponse> createProductPriceAction(@RequestBody CreateProductPriceActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceCond
     * <p>service: createProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceCond")
    public ResponseEntity<CreateProductPriceCondResponse> createProductPriceCond(@RequestBody CreateProductPriceCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceRule
     * <p>service: createProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceRule")
    public ResponseEntity<CreateProductPriceRuleResponse> createProductPriceRule(@RequestBody CreateProductPriceRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromo  entities: ProductPromo  auth: true
     */
    @PostMapping("/catalog/control/createProductPromo")
    public ResponseEntity<CreateProductPromoResponse> createProductPromo(@RequestBody CreateProductPromoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoAction")
    public ResponseEntity<CreateProductPromoActionResponse> createProductPromoAction(@RequestBody CreateProductPromoActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCategory
     * <p>service: createProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCategory")
    public ResponseEntity<CreateProductPromoCategoryResponse> createProductPromoCategory(@RequestBody CreateProductPromoCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCode
     * <p>service: createProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCode")
    public ResponseEntity<CreateProductPromoCodeResponse> createProductPromoCode(@RequestBody CreateProductPromoCodeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductPromoCodeEmail  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeEmail")
    public ResponseEntity<Map<String, Object>> createProductPromoCodeEmail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCodeParty
     * <p>service: createProductPromoCodeParty  entities: ProductPromoCodeParty  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeParty")
    public ResponseEntity<CreateProductPromoCodePartyResponse> createProductPromoCodeParty(@RequestBody CreateProductPromoCodePartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Promo Code Set
     * <p>service: createProductPromoCodeSet  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeSet")
    public ResponseEntity<CreateProductPromoCodeSetResponse> createProductPromoCodeSet(@RequestBody CreateProductPromoCodeSetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCond")
    public ResponseEntity<CreateProductPromoCondResponse> createProductPromoCond(@RequestBody CreateProductPromoCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoProduct
     * <p>service: createProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoProduct")
    public ResponseEntity<CreateProductPromoProductResponse> createProductPromoProduct(@RequestBody CreateProductPromoProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoRule")
    public ResponseEntity<CreateProductPromoRuleResponse> createProductPromoRule(@RequestBody CreateProductPromoRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store
     * <p>service: createProductStore  entities: ProductStore  auth: true
     */
    @PostMapping("/catalog/control/createProductStore")
    public ResponseEntity<CreateProductStoreResponse> createProductStore(@RequestBody CreateProductStoreRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreCatalog
     * <p>service: createProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreCatalog")
    public ResponseEntity<CreateProductStoreCatalogResponse> createProductStoreCatalogCreateProductStoreCatalog(@RequestBody CreateProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Email Setting
     * <p>service: createProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreEmail")
    public ResponseEntity<CreateProductStoreEmailSettingResponse> createProductStoreEmailSetting(@RequestBody CreateProductStoreEmailSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreGroup
     * <p>service: createProductStoreGroup  entities: ProductStoreGroup  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreGroup")
    public ResponseEntity<CreateProductStoreGroupResponse> createProductStoreGroup(@RequestBody CreateProductStoreGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Keyword Override
     * <p>service: createProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreKeywordOvrd")
    public ResponseEntity<CreateProductStoreKeywordOvrdResponse> createProductStoreKeywordOvrd(@RequestBody CreateProductStoreKeywordOvrdRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePromoAppl
     * <p>service: createProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductStorePromoAppl")
    public ResponseEntity<CreateProductStorePromoApplResponse> createProductStorePromoAppl(@RequestBody CreateProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Survey Appl
     * <p>service: createProductStoreSurveyAppl  entities: ProductStoreSurveyAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreSurveyAppl")
    public ResponseEntity<CreateProductStoreSurveyApplResponse> createProductStoreSurveyAppl(@RequestBody CreateProductStoreSurveyApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductStoreVendorPayment  entities: ProductStoreVendorPayment  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreVendorPayment")
    public ResponseEntity<CreateProductStoreVendorPaymentResponse> createProductStoreVendorPayment(@RequestBody CreateProductStoreVendorPaymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductStoreVendorShipment  entities: ProductStoreVendorShipment  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreVendorShipment")
    public ResponseEntity<CreateProductStoreVendorShipmentResponse> createProductStoreVendorShipment(@RequestBody CreateProductStoreVendorShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductSubscriptionResource Record
     * <p>service: createProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createProductSubscriptionResource")
    public ResponseEntity<CreateProductSubscriptionResourceResponse> createProductSubscriptionResource(@RequestBody CreateProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductSubscriptionResource Record
     * <p>service: createProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createProductSubscriptionResourceSr")
    public ResponseEntity<CreateProductSubscriptionResourceResponse> createProductSubscriptionResourceCreateProductSubscriptionResourceSr(@RequestBody CreateProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuantityBreak
     * <p>service: createQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/createQuantityBreak")
    public ResponseEntity<CreateQuantityBreakResponse> createQuantityBreak(@RequestBody CreateQuantityBreakRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Related URL Content For Product Category
     * <p>service: createRelatedUrlContentForCategory  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createRelatedUrlContentForCategory")
    public ResponseEntity<CreateRelatedUrlContentForCategoryResponse> createRelatedUrlContentForCategory(@RequestBody CreateRelatedUrlContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new sales agreement with customer for the product
     * <p>service: createSalesAgreement  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createSalesAgreement")
    public ResponseEntity<CreateSalesAgreementResponse> createSalesAgreement(@RequestBody CreateSalesAgreementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates A ShipmentMethodType
     * <p>service: createShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/createShipmentMethodType")
    public ResponseEntity<CreateShipmentMethodTypeResponse> createShipmentMethodType(@RequestBody CreateShipmentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ShipmentTimeEstimate
     * <p>service: createShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/createShipmentTimeEstimate")
    public ResponseEntity<CreateShipmentTimeEstimateResponse> createShipmentTimeEstimate(@RequestBody CreateShipmentTimeEstimateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForAlternateLocale  entities: Content  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForAlternateLocale")
    public ResponseEntity<CreateSimpleTextContentForAlternateLocaleResponse> createSimpleTextContentForAlternateLocale(@RequestBody CreateSimpleTextContentForAlternateLocaleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForAlternateLocale  entities: Content  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForAlternateLocaleInCategory")
    public ResponseEntity<CreateSimpleTextContentForAlternateLocaleResponse> createSimpleTextContentForAlternateLocaleCreateSimpleTextContentForAlternateLocaleInCategory(@RequestBody CreateSimpleTextContentForAlternateLocaleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForCategory")
    public ResponseEntity<CreateSimpleTextContentForCategoryResponse> createSimpleTextContentForCategory(@RequestBody CreateSimpleTextContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForProduct")
    public ResponseEntity<CreateSimpleTextContentForProductResponse> createSimpleTextContentForProduct(@RequestBody CreateSimpleTextContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForProductConfigItem  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForProductConfigItem")
    public ResponseEntity<CreateSimpleTextContentForProductConfigItemResponse> createSimpleTextContentForProductConfigItem(@RequestBody CreateSimpleTextContentForProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Subscription Record
     * <p>service: createSubscription  entities: Subscription  auth: true
     */
    @PostMapping("/catalog/control/createSubscription")
    public ResponseEntity<CreateSubscriptionResponse> createSubscription(@RequestBody CreateSubscriptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Subscription Communication Event
     * <p>service: createSubscriptionCommEvent  entities: SubscriptionCommEvent  auth: true
     */
    @PostMapping("/catalog/control/createSubscriptionCommEvent")
    public ResponseEntity<CreateSubscriptionCommEventResponse> createSubscriptionCommEvent(@RequestBody CreateSubscriptionCommEventRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SubscriptionResource Record
     * <p>service: createSubscriptionResource  entities: SubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createSubscriptionResource")
    public ResponseEntity<CreateSubscriptionResourceResponse> createSubscriptionResource(@RequestBody CreateSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new SupplierProduct record
     * <p>service: createSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/createSupplierProduct")
    public ResponseEntity<CreateSupplierProductResponse> createSupplierProduct(@RequestBody CreateSupplierProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new SupplierProductFeature record
     * <p>service: createSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/createSupplierProductFeature")
    public ResponseEntity<CreateSupplierProductFeatureResponse> createSupplierProductFeature(@RequestBody CreateSupplierProductFeatureRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createVendorProduct  entities: VendorProduct  auth: true
     */
    @PostMapping("/catalog/control/createVendorProduct")
    public ResponseEntity<CreateVendorProductResponse> createVendorProduct(@RequestBody CreateVendorProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/createWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deletes A CarrierShipmentMethod
     * <p>service: deleteCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/deleteCarrierShipmentMethod")
    public ResponseEntity<DeleteCarrierShipmentMethodResponse> deleteCarrierShipmentMethod(@RequestBody DeleteCarrierShipmentMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a CostComponent
     * <p>service: deleteCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/deleteCostComponent")
    public ResponseEntity<DeleteCostComponentResponse> deleteCostComponent(@RequestBody DeleteCostComponentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Feature Price
     * <p>service: deleteFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/deleteFeaturePrice")
    public ResponseEntity<DeleteFeaturePriceResponse> deleteFeaturePrice(@RequestBody DeleteFeaturePriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a GoodIdentification
     * <p>service: deleteGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/deleteGoodIdentification")
    public ResponseEntity<DeleteGoodIdentificationResponse> deleteGoodIdentification(@RequestBody DeleteGoodIdentificationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Keyword Thesaurus
     * <p>service: deleteKeywordThesaurus  entities: KeywordThesaurus  auth: true
     */
    @PostMapping("/catalog/control/deleteKeywordThesaurus")
    public ResponseEntity<Map<String, Object>> deleteKeywordThesaurus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStoreCatalog
     * <p>service: deleteProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/deleteProdCatalogStore")
    public ResponseEntity<DeleteProductStoreCatalogResponse> deleteProductStoreCatalog(@RequestBody DeleteProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/deleteProductAssoc")
    public ResponseEntity<DeleteProductAssocResponse> deleteProductAssoc(@RequestBody DeleteProductAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductAttribute
     * <p>service: deleteProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/deleteProductAttribute")
    public ResponseEntity<DeleteProductAttributeResponse> deleteProductAttribute(@RequestBody DeleteProductAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCategoryAttribute")
    public ResponseEntity<DeleteProductCategoryAttributeResponse> deleteProductCategoryAttribute(@RequestBody DeleteProductCategoryAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductCategoryLink
     * <p>service: deleteProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCategoryLink")
    public ResponseEntity<DeleteProductCategoryLinkResponse> deleteProductCategoryLink(@RequestBody DeleteProductCategoryLinkRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfig
     * <p>service: deleteProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfig")
    public ResponseEntity<DeleteProductConfigResponse> deleteProductConfig(@RequestBody DeleteProductConfigRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfigItem
     * <p>service: deleteProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigItem")
    public ResponseEntity<DeleteProductConfigItemResponse> deleteProductConfigItem(@RequestBody DeleteProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Config Option
     * <p>service: deleteProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigOption")
    public ResponseEntity<DeleteProductConfigOptionResponse> deleteProductConfigOption(@RequestBody DeleteProductConfigOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfigProduct
     * <p>service: deleteProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigProduct")
    public ResponseEntity<DeleteProductConfigProductResponse> deleteProductConfigProduct(@RequestBody DeleteProductConfigProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Example
     * <p>service: deleteProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCostComponentCalc")
    public ResponseEntity<DeleteProductCostComponentCalcResponse> deleteProductCostComponentCalc(@RequestBody DeleteProductCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacility
     * <p>service: deleteProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFacility")
    public ResponseEntity<DeleteProductFacilityResponse> deleteProductFacility(@RequestBody DeleteProductFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacilityLocation
     * <p>service: deleteProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFacilityLocation")
    public ResponseEntity<DeleteProductFacilityLocationResponse> deleteProductFacilityLocation(@RequestBody DeleteProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureApplAttr
     * <p>service: removeProductFeatureApplAttr  entities: ProductFeatureApplAttr  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFeatureApplAttr")
    public ResponseEntity<RemoveProductFeatureApplAttrResponse> removeProductFeatureApplAttr(@RequestBody RemoveProductFeatureApplAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductGeo
     * <p>service: deleteProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGeo")
    public ResponseEntity<DeleteProductGeoResponse> deleteProductGeo(@RequestBody DeleteProductGeoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductGlAccount
     * <p>service: deleteProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGlAccount")
    public ResponseEntity<DeleteProductGlAccountResponse> deleteProductGlAccount(@RequestBody DeleteProductGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductGroupOrder
     * <p>service: deleteProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGroupOrder")
    public ResponseEntity<DeleteProductGroupOrderResponse> deleteProductGroupOrder(@RequestBody DeleteProductGroupOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductKeyword
     * <p>service: deleteProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/deleteProductKeyword")
    public ResponseEntity<DeleteProductKeywordResponse> deleteProductKeyword(@RequestBody DeleteProductKeywordRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete all the keywords of a product
     * <p>service: deleteProductKeywords  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/deleteProductKeywords")
    public ResponseEntity<DeleteProductKeywordsResponse> deleteProductKeywords(@RequestBody DeleteProductKeywordsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductMaint
     * <p>service: deleteProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/deleteProductMaint")
    public ResponseEntity<DeleteProductMaintResponse> deleteProductMaint(@RequestBody DeleteProductMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductMeter
     * <p>service: deleteProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/deleteProductMeter")
    public ResponseEntity<DeleteProductMeterResponse> deleteProductMeter(@RequestBody DeleteProductMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductPaymentMethodType
     * <p>service: deleteProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPaymentMethodType")
    public ResponseEntity<DeleteProductPaymentMethodTypeResponse> deleteProductPaymentMethodType(@RequestBody DeleteProductPaymentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductPrice
     * <p>service: deleteProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPrice")
    public ResponseEntity<DeleteProductPriceResponse> deleteProductPrice(@RequestBody DeleteProductPriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceAction
     * <p>service: deleteProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceAction")
    public ResponseEntity<DeleteProductPriceActionResponse> deleteProductPriceAction(@RequestBody DeleteProductPriceActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceCond
     * <p>service: deleteProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceCond")
    public ResponseEntity<DeleteProductPriceCondResponse> deleteProductPriceCond(@RequestBody DeleteProductPriceCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceRule
     * <p>service: deleteProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceRule")
    public ResponseEntity<DeleteProductPriceRuleResponse> deleteProductPriceRule(@RequestBody DeleteProductPriceRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoAction")
    public ResponseEntity<DeleteProductPromoActionResponse> deleteProductPromoAction(@RequestBody DeleteProductPromoActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCategory
     * <p>service: deleteProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCategory")
    public ResponseEntity<DeleteProductPromoCategoryResponse> deleteProductPromoCategory(@RequestBody DeleteProductPromoCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCode
     * <p>service: deleteProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCode")
    public ResponseEntity<DeleteProductPromoCodeResponse> deleteProductPromoCode(@RequestBody DeleteProductPromoCodeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProdPromoCodeContactMech
     * <p>service: deleteProductPromoCodeContactMech  entities: ProdPromoCodeContactMech  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCodeEmail")
    public ResponseEntity<DeleteProductPromoCodeContactMechResponse> deleteProductPromoCodeContactMech(@RequestBody DeleteProductPromoCodeContactMechRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCodeParty
     * <p>service: deleteProductPromoCodeParty  entities: ProductPromoCodeParty  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCodeParty")
    public ResponseEntity<DeleteProductPromoCodePartyResponse> deleteProductPromoCodeParty(@RequestBody DeleteProductPromoCodePartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCond")
    public ResponseEntity<DeleteProductPromoCondResponse> deleteProductPromoCond(@RequestBody DeleteProductPromoCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoProduct
     * <p>service: deleteProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoProduct")
    public ResponseEntity<DeleteProductPromoProductResponse> deleteProductPromoProduct(@RequestBody DeleteProductPromoProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoRule")
    public ResponseEntity<DeleteProductPromoRuleResponse> deleteProductPromoRule(@RequestBody DeleteProductPromoRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStoreCatalog
     * <p>service: deleteProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreCatalog")
    public ResponseEntity<DeleteProductStoreCatalogResponse> deleteProductStoreCatalogDeleteProductStoreCatalog(@RequestBody DeleteProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductStoreFacility
     * <p>service: deleteProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreFacility")
    public ResponseEntity<DeleteProductStoreFacilityResponse> deleteProductStoreFacility(@RequestBody DeleteProductStoreFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Product Store Keyword Override
     * <p>service: deleteProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreKeywordOvrd")
    public ResponseEntity<DeleteProductStoreKeywordOvrdResponse> deleteProductStoreKeywordOvrd(@RequestBody DeleteProductStoreKeywordOvrdRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePromoAppl
     * <p>service: deleteProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStorePromoAppl")
    public ResponseEntity<DeleteProductStorePromoApplResponse> deleteProductStorePromoAppl(@RequestBody DeleteProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Product Store Survey Appl
     * <p>service: deleteProductStoreSurveyAppl  entities: ProductStoreSurveyAppl  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreSurveyAppl")
    public ResponseEntity<DeleteProductStoreSurveyApplResponse> deleteProductStoreSurveyAppl(@RequestBody DeleteProductStoreSurveyApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductStoreVendorPayment  entities: ProductStoreVendorPayment  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreVendorPayment")
    public ResponseEntity<DeleteProductStoreVendorPaymentResponse> deleteProductStoreVendorPayment(@RequestBody DeleteProductStoreVendorPaymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductStoreVendorShipment  entities: ProductStoreVendorShipment  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreVendorShipment")
    public ResponseEntity<DeleteProductStoreVendorShipmentResponse> deleteProductStoreVendorShipment(@RequestBody DeleteProductStoreVendorShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductSubscriptionResource Record
     * <p>service: deleteProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/deleteProductSubscriptionResource")
    public ResponseEntity<DeleteProductSubscriptionResourceResponse> deleteProductSubscriptionResource(@RequestBody DeleteProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductSubscriptionResource Record
     * <p>service: deleteProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/deleteProductSubscriptionResourceSr")
    public ResponseEntity<DeleteProductSubscriptionResourceResponse> deleteProductSubscriptionResourceDeleteProductSubscriptionResourceSr(@RequestBody DeleteProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a QuantityBreak
     * <p>service: deleteQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/deleteQuantityBreak")
    public ResponseEntity<DeleteQuantityBreakResponse> deleteQuantityBreak(@RequestBody DeleteQuantityBreakRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deletes A ShipmentMethodType
     * <p>service: deleteShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/deleteShipmentMethodType")
    public ResponseEntity<DeleteShipmentMethodTypeResponse> deleteShipmentMethodType(@RequestBody DeleteShipmentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteVendorProduct  entities: VendorProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteVendorProduct")
    public ResponseEntity<DeleteVendorProductResponse> deleteVendorProduct(@RequestBody DeleteVendorProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire All Product Members in a Category optionally using the thruDate specified as the expire date (now timestamp used by default)
     * <p>service: expireAllCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/expireAllCategoryProductMembers")
    public ResponseEntity<ExpireAllCategoryProductMembersResponse> expireAllCategoryProductMembers(@RequestBody ExpireAllCategoryProductMembersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a ShipmentTimeEstimate
     * <p>service: expireShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/expireShipmentTimeEstimate")
    public ResponseEntity<ExpireShipmentTimeEstimateResponse> expireShipmentTimeEstimate(@RequestBody ExpireShipmentTimeEstimateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Induce all the keywords of a product, ignoring the flag in the Product.autoCreateKeywords flag
     * <p>service: forceIndexProductKeywords  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/forceIndexProductKeywords")
    public ResponseEntity<ForceIndexProductKeywordsResponse> forceIndexProductKeywords(@RequestBody ForceIndexProductKeywordsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Value options for selected Price Rule Condition Input
     * <p>service: getAssociatedPriceRulesConds  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/getAssociatedPriceRulesConds")
    public ResponseEntity<GetAssociatedPriceRulesCondsResponse> getAssociatedPriceRulesConds(@RequestBody GetAssociatedPriceRulesCondsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getChildCategoryTree  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/getChild")
    public ResponseEntity<Map<String, Object>> getChildCategoryTree(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getChildProductStoreGroupTree  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/getProductStoreGroupRollupHierarchy")
    public ResponseEntity<Map<String, Object>> getChildProductStoreGroupTree(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/prepareCreateShipMeth")
    public ResponseEntity<Map<String, Object>> prepareCreateShipMeth(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/prepareCreateShipmentTimeEstimate")
    public ResponseEntity<Map<String, Object>> prepareCreateShipmentTimeEstimate(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: previewFrameImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/previewFrameImage")
    public ResponseEntity<Map<String, Object>> previewFrameImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePromoAppl
     * <p>service: createProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_createProductStorePromoAppl")
    public ResponseEntity<CreateProductStorePromoApplResponse> createProductStorePromoApplPromoCreateProductStorePromoAppl(@RequestBody CreateProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePromoAppl
     * <p>service: deleteProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_deleteProductStorePromoAppl")
    public ResponseEntity<DeleteProductStorePromoApplResponse> deleteProductStorePromoApplPromoDeleteProductStorePromoAppl(@RequestBody DeleteProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePromoAppl
     * <p>service: updateProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_updateProductStorePromoAppl")
    public ResponseEntity<UpdateProductStorePromoApplResponse> updateProductStorePromoAppl(@RequestBody UpdateProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductToCategories  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminAddCategories")
    public ResponseEntity<AddProductToCategoriesResponse> addProductToCategories(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductFeatures  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminApplyFeatureToProduct")
    public ResponseEntity<Map<String, Object>> addProductFeatures(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeature from a Product
     * <p>service: removeFeatureFromProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/quickAdminRemoveFeatureFromProduct")
    public ResponseEntity<RemoveFeatureFromProductResponse> removeFeatureFromProductQuickAdminRemoveFeatureFromProduct(@RequestBody RemoveFeatureFromProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeProductFeatureAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminRemoveProductFeature")
    public ResponseEntity<Map<String, Object>> removeProductFeatureAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/quickAdminRemoveProductFromCategory")
    public ResponseEntity<RemoveProductFromCategoryResponse> removeProductFromCategory(@RequestBody RemoveProductFromCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryMember  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminUnPublish")
    public ResponseEntity<Map<String, Object>> updateProductCategoryMember(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductAssoc  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminUpdateProductAssoc")
    public ResponseEntity<UpdateProductAssocResponse> updateProductAssoc(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * This will create a virtual product and return its ID, and associate all of the variants with it. It will not put the selectable features on the virtual or standard features on the variant.
     * <p>service: quickCreateVirtualWithVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/quickCreateVirtualWithVariants")
    public ResponseEntity<QuickCreateVirtualWithVariantsResponse> quickCreateVirtualWithVariantsQuickCreateVirtualWithVariants(@RequestBody QuickCreateVirtualWithVariantsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/removeCategoryProductMember")
    public ResponseEntity<RemoveProductFromCategoryResponse> removeProductFromCategoryRemoveCategoryProductMember(@RequestBody RemoveProductFromCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Category
     * <p>service: removeCategoryContent  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromCategory")
    public ResponseEntity<RemoveCategoryContentResponse> removeCategoryContent(@RequestBody RemoveCategoryContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product
     * <p>service: removeProductContent  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProduct")
    public ResponseEntity<RemoveProductContentResponse> removeProductContent(@RequestBody RemoveProductContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From ProductConfigItem
     * <p>service: removeProductConfigItemContent  entities: ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProductConfigItem")
    public ResponseEntity<RemoveProductConfigItemContentResponse> removeProductConfigItemContent(@RequestBody RemoveProductConfigItemContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel by the thru date a Product Promo Content
     * <p>service: removeProductPromoContent  entities: ProductPromoContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProductPromo")
    public ResponseEntity<RemoveProductPromoContentResponse> removeProductPromoContent(@RequestBody RemoveProductPromoContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove All Expired Product Members in a Category, optionally uses the valid date instead of now to determine if the member has expired
     * <p>service: removeExpiredCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeExpiredCategoryProductMembers")
    public ResponseEntity<RemoveExpiredCategoryProductMembersResponse> removeExpiredCategoryProductMembers(@RequestBody RemoveExpiredCategoryProductMembersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureIactn
     * <p>service: removeProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/removeFeatureIactn")
    public ResponseEntity<RemoveProductFeatureIactnResponse> removeProductFeatureIactn(@RequestBody RemoveProductFeatureIactnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Fixed Asset
     * <p>service: removeFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/removeFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> removeFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product and File Image
     * <p>service: removeProductContentAndImageFile  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeImage")
    public ResponseEntity<RemoveProductContentAndImageFileResponse> removeProductContentAndImageFile(@RequestBody RemoveProductContentAndImageFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Image By Size.
     * <p>service: removeImageBySize  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeImageBySize")
    public ResponseEntity<RemoveImageBySizeResponse> removeImageBySize(@RequestBody RemoveImageBySizeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product and File Image
     * <p>service: removeProductContentAndImageFile  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeImageUpload")
    public ResponseEntity<RemoveProductContentAndImageFileResponse> removeProductContentAndImageFileRemoveImageUpload(@RequestBody RemoveProductContentAndImageFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Category
     * <p>service: removePartyFromCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removePartyFromCategory")
    public ResponseEntity<RemovePartyFromCategoryResponse> removePartyFromCategory(@RequestBody RemovePartyFromCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Product
     * <p>service: removePartyFromProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removePartyFromProduct")
    public ResponseEntity<RemovePartyFromProductResponse> removePartyFromProduct(@RequestBody RemovePartyFromProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProdCatalog From Party
     * <p>service: removeProdCatalogFromParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/removeProdCatalogFromParty")
    public ResponseEntity<RemoveProdCatalogFromPartyResponse> removeProdCatalogFromParty(@RequestBody RemoveProdCatalogFromPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From Category
     * <p>service: removeProductCategoryFromCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeProductCategoryFromCategory")
    public ResponseEntity<RemoveProductCategoryFromCategoryResponse> removeProductCategoryFromCategory(@RequestBody RemoveProductCategoryFromCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From ProdCatalog
     * <p>service: removeProductCategoryFromProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/removeProductCategoryFromProdCatalog")
    public ResponseEntity<RemoveProductCategoryFromProdCatalogResponse> removeProductCategoryFromProdCatalogRemoveProductCategoryFromProdCatalog(@RequestBody RemoveProductCategoryFromProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureGroup to ProductCategory Application
     * <p>service: removeProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureCatGrpAppl")
    public ResponseEntity<RemoveProductFeatureCatGrpApplResponse> removeProductFeatureCatGrpAppl(@RequestBody RemoveProductFeatureCatGrpApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureCategory to ProductCategory Application
     * <p>service: removeProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureCategoryAppl")
    public ResponseEntity<RemoveProductFeatureCategoryApplResponse> removeProductFeatureCategoryAppl(@RequestBody RemoveProductFeatureCategoryApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureIactn
     * <p>service: removeProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureIactn")
    public ResponseEntity<RemoveProductFeatureIactnResponse> removeProductFeatureIactnRemoveProductFeatureIactn(@RequestBody RemoveProductFeatureIactnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureType
     * <p>service: removeProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureType")
    public ResponseEntity<RemoveProductFeatureTypeResponse> removeProductFeatureType(@RequestBody RemoveProductFeatureTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/removeProductFromCategory")
    public ResponseEntity<RemoveProductFromCategoryResponse> removeProductFromCategoryRemoveProductFromCategory(@RequestBody RemoveProductFromCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Product Store Email Setting
     * <p>service: removeProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/removeProductStoreEmail")
    public ResponseEntity<RemoveProductStoreEmailSettingResponse> removeProductStoreEmailSetting(@RequestBody RemoveProductStoreEmailSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Subscription Communication Event
     * <p>service: removeSubscriptionCommEvent  entities: SubscriptionCommEvent  auth: true
     */
    @PostMapping("/catalog/control/removeSubscriptionCommEvent")
    public ResponseEntity<RemoveSubscriptionCommEventResponse> removeSubscriptionCommEvent(@RequestBody RemoveSubscriptionCommEventRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a SupplierProduct record
     * <p>service: removeSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/removeSupplierProduct")
    public ResponseEntity<RemoveSupplierProductResponse> removeSupplierProduct(@RequestBody RemoveSupplierProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a SupplierProduct record
     * <p>service: removeSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/removeSupplierProductFeature")
    public ResponseEntity<RemoveSupplierProductFeatureResponse> removeSupplierProductFeature(@RequestBody RemoveSupplierProductFeatureRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/removeWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Rename Image.
     * <p>service: renameImage  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/renameImage")
    public ResponseEntity<RenameImageResponse> renameImage(@RequestBody RenameImageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Resize Image Of Product.
     * <p>service: replaceImageToExistImage  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/replaceImageToExistImage")
    public ResponseEntity<ReplaceImageToExistImageResponse> replaceImageToExistImage(@RequestBody ReplaceImageToExistImageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Resize Images.
     * <p>service: resizeImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/resizeImages")
    public ResponseEntity<ResizeImagesResponse> resizeImages(@RequestBody ResizeImagesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchAddFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchAddFeature")
    public ResponseEntity<Map<String, Object>> searchAddFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchAddToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchAddToCategory")
    public ResponseEntity<Map<String, Object>> searchAddToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchExpireFromCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchExpireFromCategory")
    public ResponseEntity<Map<String, Object>> searchExpireFromCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchExportProductList  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchExportProductList")
    public ResponseEntity<Map<String, Object>> searchExportProductList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchRemoveFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchRemoveFeature")
    public ResponseEntity<Map<String, Object>> searchRemoveFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchRemoveFromCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchRemoveFromCategory")
    public ResponseEntity<Map<String, Object>> searchRemoveFromCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setDefaultImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/setDefaultImage")
    public ResponseEntity<Map<String, Object>> setDefaultImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setImageDetail  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/setImageDetail")
    public ResponseEntity<SetImageDetailResponse> setImageDetail(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePaymentSetting
     * <p>service: createProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeCreatePaySetting")
    public ResponseEntity<CreateProductStorePaymentSettingResponse> createProductStorePaymentSetting(@RequestBody CreateProductStorePaymentSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreRole
     * <p>service: createProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeCreateRole")
    public ResponseEntity<CreateProductStoreRoleResponse> createProductStoreRole(@RequestBody CreateProductStoreRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Shipment Method
     * <p>service: createProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeCreateShipMeth")
    public ResponseEntity<CreateProductStoreShipMethResponse> createProductStoreShipMeth(@RequestBody CreateProductStoreShipMethRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Shipment Estimate
     * <p>service: createShipmentEstimate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/storeCreateShipRate")
    public ResponseEntity<CreateShipmentEstimateResponse> createShipmentEstimate(@RequestBody CreateShipmentEstimateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePaymentSetting
     * <p>service: deleteProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeRemovePaySetting")
    public ResponseEntity<DeleteProductStorePaymentSettingResponse> deleteProductStorePaymentSetting(@RequestBody DeleteProductStorePaymentSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductStoreRole
     * <p>service: removeProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveRole")
    public ResponseEntity<RemoveProductStoreRoleResponse> removeProductStoreRole(@RequestBody RemoveProductStoreRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Product Store Shipment Method
     * <p>service: removeProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveShipMeth")
    public ResponseEntity<RemoveProductStoreShipMethResponse> removeProductStoreShipMeth(@RequestBody RemoveProductStoreShipMethRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Shipment Estimate
     * <p>service: removeShipmentEstimate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveShipRate")
    public ResponseEntity<RemoveShipmentEstimateResponse> removeShipmentEstimate(@RequestBody RemoveShipmentEstimateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePaymentSetting
     * <p>service: updateProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeUpdatePaySetting")
    public ResponseEntity<UpdateProductStorePaymentSettingResponse> updateProductStorePaymentSetting(@RequestBody UpdateProductStorePaymentSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Role
     * <p>service: updateProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateRole")
    public ResponseEntity<UpdateProductStoreRoleResponse> updateProductStoreRole(@RequestBody UpdateProductStoreRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Shipment Method
     * <p>service: updateProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateShipMeth")
    public ResponseEntity<UpdateProductStoreShipMethResponse> updateProductStoreShipMeth(@RequestBody UpdateProductStoreShipMethRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite
     * <p>service: updateWebSite  entities: WebSite  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateWebSite")
    public ResponseEntity<Map<String, Object>> updateWebSite(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the Product to Fixed Asset information
     * <p>service: updateFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/updFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> updateFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates A CarrierShipmentMethod
     * <p>service: updateCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/updateCarrierShipmentMethod")
    public ResponseEntity<UpdateCarrierShipmentMethodResponse> updateCarrierShipmentMethod(@RequestBody UpdateCarrierShipmentMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductCategory
     * <p>service: updateProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/updateCategoryContent")
    public ResponseEntity<UpdateProductCategoryResponse> updateProductCategory(@RequestBody UpdateProductCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateCategoryProductMember")
    public ResponseEntity<UpdateProductToCategoryResponse> updateProductToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update SEO Content For Product Category
     * <p>service: updateContentSEOForCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateContentSEOForCategory")
    public ResponseEntity<UpdateContentSEOForCategoryResponse> updateContentSEOForCategory(@RequestBody UpdateContentSEOForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Product SEO
     * <p>service: updateContentSEOForProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateContentSEOForProduct")
    public ResponseEntity<UpdateContentSEOForProductResponse> updateContentSEOForProduct(@RequestBody UpdateContentSEOForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Category
     * <p>service: updateCategoryContent  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToCategory")
    public ResponseEntity<UpdateCategoryContentResponse> updateCategoryContent(@RequestBody UpdateCategoryContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Product
     * <p>service: updateProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToProduct")
    public ResponseEntity<UpdateProductContentResponse> updateProductContent(@RequestBody UpdateProductContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To ProductConfigItem
     * <p>service: updateProductConfigItemContent  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToProductConfigItem")
    public ResponseEntity<UpdateProductConfigItemContentResponse> updateProductConfigItemContent(@RequestBody UpdateProductConfigItemContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CostComponent
     * <p>service: updateCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/updateCostComponent")
    public ResponseEntity<UpdateCostComponentResponse> updateCostComponent(@RequestBody UpdateCostComponentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateDownloadContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateDownloadContentForCategory")
    public ResponseEntity<UpdateDownloadContentForCategoryResponse> updateDownloadContentForCategory(@RequestBody UpdateDownloadContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Download Content For Product
     * <p>service: updateDownloadContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateDownloadContentForProduct")
    public ResponseEntity<UpdateDownloadContentForProductResponse> updateDownloadContentForProduct(@RequestBody UpdateDownloadContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Email Content For Product
     * <p>service: updateEmailContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateEmailContentForProduct")
    public ResponseEntity<UpdateEmailContentForProductResponse> updateEmailContentForProduct(@RequestBody UpdateEmailContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Product
     * <p>service: updateProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateExternalContentForProduct")
    public ResponseEntity<UpdateProductContentResponse> updateProductContentUpdateExternalContentForProduct(@RequestBody UpdateProductContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Feature Price
     * <p>service: updateFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/updateFeaturePrice")
    public ResponseEntity<UpdateFeaturePriceResponse> updateFeaturePrice(@RequestBody UpdateFeaturePriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GoodIdentification
     * <p>service: updateGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/updateGoodIdentification")
    public ResponseEntity<UpdateGoodIdentificationResponse> updateGoodIdentification(@RequestBody UpdateGoodIdentificationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party To Category
     * <p>service: updatePartyToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updatePartyToCategory")
    public ResponseEntity<UpdatePartyToCategoryResponse> updatePartyToCategory(@RequestBody UpdatePartyToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party To Product
     * <p>service: updatePartyToProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updatePartyToProduct")
    public ResponseEntity<UpdatePartyToProductResponse> updatePartyToProduct(@RequestBody UpdatePartyToProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProdCatalog
     * <p>service: updateProdCatalog  entities: ProdCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalog")
    public ResponseEntity<UpdateProdCatalogResponse> updateProdCatalog(@RequestBody UpdateProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreCatalog
     * <p>service: updateProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalogStore")
    public ResponseEntity<UpdateProductStoreCatalogResponse> updateProductStoreCatalog(@RequestBody UpdateProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProdCatalog To Party
     * <p>service: updateProdCatalogToParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalogToParty")
    public ResponseEntity<UpdateProdCatalogToPartyResponse> updateProdCatalogToParty(@RequestBody UpdateProdCatalogToPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProduct")
    public ResponseEntity<UpdateProductResponse> updateProduct(@RequestBody UpdateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductAssetUsage")
    public ResponseEntity<UpdateProductResponse> updateProductUpdateProductAssetUsage(@RequestBody UpdateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/updateProductAssoc")
    public ResponseEntity<UpdateProductAssocResponse> updateProductAssocUpdateProductAssoc(@RequestBody UpdateProductAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductAttribute
     * <p>service: updateProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/updateProductAttribute")
    public ResponseEntity<UpdateProductAttributeResponse> updateProductAttribute(@RequestBody UpdateProductAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductCategory
     * <p>service: updateProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategory")
    public ResponseEntity<UpdateProductCategoryResponse> updateProductCategoryUpdateProductCategory(@RequestBody UpdateProductCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryAttribute")
    public ResponseEntity<UpdateProductCategoryAttributeResponse> updateProductCategoryAttribute(@RequestBody UpdateProductCategoryAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCategoryLink
     * <p>service: updateProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryLink")
    public ResponseEntity<UpdateProductCategoryLinkResponse> updateProductCategoryLink(@RequestBody UpdateProductCategoryLinkRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductCategoryToCategory")
    public ResponseEntity<UpdateProductCategoryToCategoryResponse> updateProductCategoryToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: updateProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryToProdCatalog")
    public ResponseEntity<UpdateProductCategoryToProdCatalogResponse> updateProductCategoryToProdCatalogUpdateProductCategoryToProdCatalog(@RequestBody UpdateProductCategoryToProdCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfig
     * <p>service: updateProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfig")
    public ResponseEntity<UpdateProductConfigResponse> updateProductConfig(@RequestBody UpdateProductConfigRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigItem
     * <p>service: updateProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigItem")
    public ResponseEntity<UpdateProductConfigItemResponse> updateProductConfigItem(@RequestBody UpdateProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigItem
     * <p>service: updateProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigItemContent")
    public ResponseEntity<UpdateProductConfigItemResponse> updateProductConfigItemUpdateProductConfigItemContent(@RequestBody UpdateProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Config Option
     * <p>service: updateProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigOption")
    public ResponseEntity<UpdateProductConfigOptionResponse> updateProductConfigOption(@RequestBody UpdateProductConfigOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigProduct
     * <p>service: updateProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigProduct")
    public ResponseEntity<UpdateProductConfigProductResponse> updateProductConfigProduct(@RequestBody UpdateProductConfigProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductContent")
    public ResponseEntity<UpdateProductResponse> updateProductUpdateProductContent(@RequestBody UpdateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCostComponentCalc
     * <p>service: updateProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/updateProductCostComponentCalc")
    public ResponseEntity<UpdateProductCostComponentCalcResponse> updateProductCostComponentCalc(@RequestBody UpdateProductCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacility
     * <p>service: updateProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/updateProductFacility")
    public ResponseEntity<UpdateProductFacilityResponse> updateProductFacility(@RequestBody UpdateProductFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacilityLocation
     * <p>service: updateProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/updateProductFacilityLocation")
    public ResponseEntity<UpdateProductFacilityLocationResponse> updateProductFacilityLocation(@RequestBody UpdateProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeature record
     * <p>service: updateProductFeature  entities: ProductFeature  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeature")
    public ResponseEntity<UpdateProductFeatureResponse> updateProductFeatureUpdateProductFeature(@RequestBody UpdateProductFeatureRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureGroup to ProductCategory Application
     * <p>service: updateProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureCatGrpAppl")
    public ResponseEntity<UpdateProductFeatureCatGrpApplResponse> updateProductFeatureCatGrpAppl(@RequestBody UpdateProductFeatureCatGrpApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureCategory to ProductCategory Application
     * <p>service: updateProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureCategoryAppl")
    public ResponseEntity<UpdateProductFeatureCategoryApplResponse> updateProductFeatureCategoryAppl(@RequestBody UpdateProductFeatureCategoryApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureType
     * <p>service: updateProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureType")
    public ResponseEntity<UpdateProductFeatureTypeResponse> updateProductFeatureType(@RequestBody UpdateProductFeatureTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductGeo
     * <p>service: updateProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/updateProductGeo")
    public ResponseEntity<UpdateProductGeoResponse> updateProductGeo(@RequestBody UpdateProductGeoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductGlAccount
     * <p>service: updateProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/updateProductGlAccount")
    public ResponseEntity<UpdateProductGlAccountResponse> updateProductGlAccount(@RequestBody UpdateProductGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductGroupOrder
     * <p>service: updateProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/updateProductGroupOrder")
    public ResponseEntity<UpdateProductGroupOrderResponse> updateProductGroupOrder(@RequestBody UpdateProductGroupOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductKeyword
     * <p>service: updateProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/updateProductKeyword")
    public ResponseEntity<UpdateProductKeywordResponse> updateProductKeyword(@RequestBody UpdateProductKeywordRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductMaint
     * <p>service: updateProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/updateProductMaint")
    public ResponseEntity<UpdateProductMaintResponse> updateProductMaint(@RequestBody UpdateProductMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductMeter
     * <p>service: updateProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/updateProductMeter")
    public ResponseEntity<UpdateProductMeterResponse> updateProductMeter(@RequestBody UpdateProductMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductPaymentMethodType
     * <p>service: updateProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/updateProductPaymentMethodType")
    public ResponseEntity<UpdateProductPaymentMethodTypeResponse> updateProductPaymentMethodType(@RequestBody UpdateProductPaymentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductPrice
     * <p>service: updateProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/updateProductPrice")
    public ResponseEntity<UpdateProductPriceResponse> updateProductPrice(@RequestBody UpdateProductPriceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceAction
     * <p>service: updateProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceAction")
    public ResponseEntity<UpdateProductPriceActionResponse> updateProductPriceAction(@RequestBody UpdateProductPriceActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceCond
     * <p>service: updateProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceCond")
    public ResponseEntity<UpdateProductPriceCondResponse> updateProductPriceCond(@RequestBody UpdateProductPriceCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceRule
     * <p>service: updateProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceRule")
    public ResponseEntity<UpdateProductPriceRuleResponse> updateProductPriceRule(@RequestBody UpdateProductPriceRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromo  entities: ProductPromo  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromo")
    public ResponseEntity<UpdateProductPromoResponse> updateProductPromo(@RequestBody UpdateProductPromoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoAction")
    public ResponseEntity<UpdateProductPromoActionResponse> updateProductPromoAction(@RequestBody UpdateProductPromoActionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoCategory
     * <p>service: updateProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCategory")
    public ResponseEntity<UpdateProductPromoCategoryResponse> updateProductPromoCategory(@RequestBody UpdateProductPromoCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoCode
     * <p>service: updateProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCode")
    public ResponseEntity<UpdateProductPromoCodeResponse> updateProductPromoCode(@RequestBody UpdateProductPromoCodeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCond")
    public ResponseEntity<UpdateProductPromoCondResponse> updateProductPromoCond(@RequestBody UpdateProductPromoCondRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoProduct
     * <p>service: updateProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoProduct")
    public ResponseEntity<UpdateProductPromoProductResponse> updateProductPromoProduct(@RequestBody UpdateProductPromoProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoRule")
    public ResponseEntity<UpdateProductPromoRuleResponse> updateProductPromoRule(@RequestBody UpdateProductPromoRuleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeFeatureApplsByFeatureTypeId  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminDelFeatureTypes")
    public ResponseEntity<Map<String, Object>> removeFeatureApplsByFeatureTypeId(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product from Quick Admin
     * <p>service: updateProductQuickAdminName  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductQuickAdminName")
    public ResponseEntity<UpdateProductQuickAdminNameResponse> updateProductQuickAdminName(@RequestBody UpdateProductQuickAdminNameRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductQuickAdminSelFeat  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminSelFeat")
    public ResponseEntity<Map<String, Object>> updateProductQuickAdminSelFeat(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductQuickAdminShipping  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminShipping")
    public ResponseEntity<UpdateProductQuickAdminShippingResponse> updateProductQuickAdminShipping(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a product review record
     * <p>service: updateProductReview  entities: ProductReview  auth: true
     */
    @PostMapping("/catalog/control/updateProductReview")
    public ResponseEntity<UpdateProductReviewResponse> updateProductReview(@RequestBody UpdateProductReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a product review record
     * <p>service: setProductReviewStatus  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateProductReviewStatus")
    public ResponseEntity<SetProductReviewStatusResponse> setProductReviewStatus(@RequestBody SetProductReviewStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store
     * <p>service: updateProductStore  entities: ProductStore  auth: true
     */
    @PostMapping("/catalog/control/updateProductStore")
    public ResponseEntity<UpdateProductStoreResponse> updateProductStore(@RequestBody UpdateProductStoreRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreCatalog
     * <p>service: updateProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreCatalog")
    public ResponseEntity<UpdateProductStoreCatalogResponse> updateProductStoreCatalogUpdateProductStoreCatalog(@RequestBody UpdateProductStoreCatalogRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Email Setting
     * <p>service: updateProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreEmail")
    public ResponseEntity<UpdateProductStoreEmailSettingResponse> updateProductStoreEmailSetting(@RequestBody UpdateProductStoreEmailSettingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreFacility
     * <p>service: updateProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreFacility")
    public ResponseEntity<UpdateProductStoreFacilityResponse> updateProductStoreFacility(@RequestBody UpdateProductStoreFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreGroup
     * <p>service: updateProductStoreGroup  entities: ProductStoreGroup  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreGroup")
    public ResponseEntity<UpdateProductStoreGroupResponse> updateProductStoreGroup(@RequestBody UpdateProductStoreGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreGroupRollup
     * <p>service: updateProductStoreGroupRollup  entities: ProductStoreGroupRollup  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreGroupRollup")
    public ResponseEntity<UpdateProductStoreGroupRollupResponse> updateProductStoreGroupRollup(@RequestBody UpdateProductStoreGroupRollupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Keyword Override
     * <p>service: updateProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreKeywordOvrd")
    public ResponseEntity<UpdateProductStoreKeywordOvrdResponse> updateProductStoreKeywordOvrd(@RequestBody UpdateProductStoreKeywordOvrdRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePromoAppl
     * <p>service: updateProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductStorePromoAppl")
    public ResponseEntity<UpdateProductStorePromoApplResponse> updateProductStorePromoApplUpdateProductStorePromoAppl(@RequestBody UpdateProductStorePromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductSubscriptionResource Record
     * <p>service: updateProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateProductSubscriptionResource")
    public ResponseEntity<UpdateProductSubscriptionResourceResponse> updateProductSubscriptionResource(@RequestBody UpdateProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductSubscriptionResource Record
     * <p>service: updateProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateProductSubscriptionResourceSr")
    public ResponseEntity<UpdateProductSubscriptionResourceResponse> updateProductSubscriptionResourceUpdateProductSubscriptionResourceSr(@RequestBody UpdateProductSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductKeyword  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductTag")
    public ResponseEntity<UpdateProductKeywordResponse> updateProductKeywordUpdateProductTag(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCategoryMember
     * <p>service: updateProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/updateProductToCategory")
    public ResponseEntity<UpdateProductToCategoryResponse> updateProductToCategoryUpdateProductToCategory(@RequestBody UpdateProductToCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuantityBreak
     * <p>service: updateQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/updateQuantityBreak")
    public ResponseEntity<UpdateQuantityBreakResponse> updateQuantityBreak(@RequestBody UpdateQuantityBreakRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Related URL Content For Product Category
     * <p>service: updateRelatedUrlContentForCategory  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateRelatedUrlContentForCategory")
    public ResponseEntity<UpdateRelatedUrlContentForCategoryResponse> updateRelatedUrlContentForCategory(@RequestBody UpdateRelatedUrlContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates A ShipmentMethodType
     * <p>service: updateShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/updateShipmentMethodType")
    public ResponseEntity<UpdateShipmentMethodTypeResponse> updateShipmentMethodType(@RequestBody UpdateShipmentMethodTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentTimeEstimate
     * <p>service: updateShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/updateShipmentTimeEstimate")
    public ResponseEntity<UpdateShipmentTimeEstimateResponse> updateShipmentTimeEstimate(@RequestBody UpdateShipmentTimeEstimateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product Category
     * <p>service: updateSimpleTextContentForCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForCategory")
    public ResponseEntity<UpdateSimpleTextContentForCategoryResponse> updateSimpleTextContentForCategory(@RequestBody UpdateSimpleTextContentForCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product
     * <p>service: updateSimpleTextContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForProduct")
    public ResponseEntity<UpdateSimpleTextContentForProductResponse> updateSimpleTextContentForProduct(@RequestBody UpdateSimpleTextContentForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product
     * <p>service: updateSimpleTextContentForProductConfigItem  entities: ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForProductConfigItem")
    public ResponseEntity<UpdateSimpleTextContentForProductConfigItemResponse> updateSimpleTextContentForProductConfigItem(@RequestBody UpdateSimpleTextContentForProductConfigItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateStatusImageManagement  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateStatusImageManagement")
    public ResponseEntity<UpdateStatusImageManagementResponse> updateStatusImageManagement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Subscription Record
     * <p>service: updateSubscription  entities: Subscription  auth: true
     */
    @PostMapping("/catalog/control/updateSubscription")
    public ResponseEntity<UpdateSubscriptionResponse> updateSubscription(@RequestBody UpdateSubscriptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SubscriptionResource Record
     * <p>service: updateSubscriptionResource  entities: SubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateSubscriptionResource")
    public ResponseEntity<UpdateSubscriptionResourceResponse> updateSubscriptionResource(@RequestBody UpdateSubscriptionResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SupplierProduct record
     * <p>service: updateSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/updateSupplierProduct")
    public ResponseEntity<UpdateSupplierProductResponse> updateSupplierProduct(@RequestBody UpdateSupplierProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SupplierProduct record
     * <p>service: updateSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/updateSupplierProductFeature")
    public ResponseEntity<UpdateSupplierProductFeatureResponse> updateSupplierProductFeature(@RequestBody UpdateSupplierProductFeatureRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/updateWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: uploadFrame  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/uploadFrame")
    public ResponseEntity<UploadFrameResponse> uploadFrame(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Uses dynamic view entity to find orders; returns a list of Order (OrderHeader) objects
     * <p>service: findOrders  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/viewProductOrder")
    public ResponseEntity<Map<String, Object>> findOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/BatchScheduleShipmentRouteSegments")
    public ResponseEntity<UpdateShipmentRouteSegmentResponse> updateShipmentRouteSegment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/BatchUpdateShipmentRouteSegments")
    public ResponseEntity<UpdateShipmentRouteSegmentResponse> updateShipmentRouteSegmentBatchUpdateShipmentRouteSegments(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear the current packing session
     * <p>service: clearPackAll  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ClearPackAll")
    public ResponseEntity<ClearPackAllResponse> clearPackAll(@RequestBody ClearPackAllRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear a single line from the current packing session
     * <p>service: clearPackLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ClearPackLine")
    public ResponseEntity<ClearPackLineResponse> clearPackLine(@RequestBody ClearPackLineRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packaging set the shipment to PACKED
     * <p>service: completePack  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/CompletePack")
    public ResponseEntity<CompletePackResponse> completePack(@RequestBody CompletePackRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateInventoryTransfer  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/CompleteRequestedTransfers")
    public ResponseEntity<UpdateInventoryTransferResponse> updateInventoryTransfer(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility
     * <p>service: createFacility  entities: Facility  auth: true
     */
    @PostMapping("/facility/control/CreateFacility")
    public ResponseEntity<CreateFacilityResponse> createFacility(@RequestBody CreateFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility Location
     * <p>service: createFacilityLocation  entities: FacilityLocation  auth: true
     */
    @PostMapping("/facility/control/CreateFacilityLocation")
    public ResponseEntity<CreateFacilityLocationResponse> createFacilityLocation(@RequestBody CreateFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItem
     * <p>service: createInventoryItem  entities: InventoryItem  auth: true
     */
    @PostMapping("/facility/control/CreateInventoryItem")
    public ResponseEntity<CreateInventoryItemResponse> createInventoryItem(@RequestBody CreateInventoryItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an inventory transfer. Uses the prepareInventoryTransfer service; see comments there about transfer quantities and inventory items.
     * <p>service: createInventoryTransfer  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/CreateInventoryTransfer")
    public ResponseEntity<CreateInventoryTransferResponse> createInventoryTransfer(@RequestBody CreateInventoryTransferRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Pack Multiple Items
     * <p>service: packBulkItems  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ProcessBulkPackOrder")
    public ResponseEntity<PackBulkItemsResponse> packBulkItems(@RequestBody PackBulkItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Pack Single Item
     * <p>service: packSingleItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ProcessPackOrder")
    public ResponseEntity<PackSingleItemResponse> packSingleItem(@RequestBody PackSingleItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickScheduleShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/ScheduleShipmentsWithCarriers")
    public ResponseEntity<QuickScheduleShipmentRouteSegmentResponse> quickScheduleShipmentRouteSegment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Increments the next package sequence
     * <p>service: setNextPackageSeq  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/SetNextPackageSeq")
    public ResponseEntity<SetNextPackageSeqResponse> setNextPackageSeq(@RequestBody SetNextPackageSeqRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility
     * <p>service: updateFacility  entities: Facility  auth: true
     */
    @PostMapping("/facility/control/UpdateFacility")
    public ResponseEntity<UpdateFacilityResponse> updateFacility(@RequestBody UpdateFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility Location
     * <p>service: updateFacilityLocation  entities: FacilityLocation  auth: true
     */
    @PostMapping("/facility/control/UpdateFacilityLocation")
    public ResponseEntity<UpdateFacilityLocationResponse> updateFacilityLocation(@RequestBody UpdateFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItem
     * <p>service: updateInventoryItem  entities: InventoryItem  auth: true
     */
    @PostMapping("/facility/control/UpdateInventoryItem")
    public ResponseEntity<UpdateInventoryItemResponse> updateInventoryItem(@RequestBody UpdateInventoryItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an inventory transfer record
     * <p>service: updateInventoryTransfer  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/UpdateInventoryTransfer")
    public ResponseEntity<UpdateInventoryTransferResponse> updateInventoryTransferUpdateInventoryTransfer(@RequestBody UpdateInventoryTransferRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayConfig
     * <p>service: updateShipmentGatewayConfig  entities: ShipmentGatewayConfig  auth: true
     */
    @PostMapping("/facility/control/UpdateShipmentGatewayConfig")
    public ResponseEntity<UpdateShipmentGatewayConfigResponse> updateShipmentGatewayConfig(@RequestBody UpdateShipmentGatewayConfigRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayConfigType
     * <p>service: updateShipmentGatewayConfigType  entities: ShipmentGatewayConfigType  auth: true
     */
    @PostMapping("/facility/control/UpdateShipmentGatewayConfigType")
    public ResponseEntity<UpdateShipmentGatewayConfigTypeResponse> updateShipmentGatewayConfigType(@RequestBody UpdateShipmentGatewayConfigTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add FacilityGroup To FacilityGroup
     * <p>service: addFacilityGroupToGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/addFacilityGroupToGroup")
    public ResponseEntity<AddFacilityGroupToGroupResponse> addFacilityGroupToGroup(@RequestBody AddFacilityGroupToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Facility To FacilityGroup
     * <p>service: addFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/addFacilityToGroup")
    public ResponseEntity<AddFacilityToGroupResponse> addFacilityToGroup(@RequestBody AddFacilityToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Facility To FacilityGroup
     * <p>service: addFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/addGroupToFacility")
    public ResponseEntity<AddFacilityToGroupResponse> addFacilityToGroupAddGroupToFacility(@RequestBody AddFacilityToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FacilityParty record
     * <p>service: addPartyToFacility  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/addPartyToFacility")
    public ResponseEntity<AddPartyToFacilityResponse> addPartyToFacility(@RequestBody AddPartyToFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To FacilityGroup
     * <p>service: addPartyToFacilityGroup  entities: FacilityGroupRole  auth: true
     */
    @PostMapping("/facility/control/addPartyToFacilityGroup")
    public ResponseEntity<AddPartyToFacilityGroupResponse> addPartyToFacilityGroup(@RequestBody AddPartyToFacilityGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addOrderShipmentToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/addToShipmentPlan")
    public ResponseEntity<AddOrderShipmentToShipmentResponse> addOrderShipmentToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Totals package weights and calls the calcShipmentCostEstimate via the PackingSession
     * <p>service: calcPackSessionAdditionalShippingCharge  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/calcPackSessionAdditionalShippingCharge")
    public ResponseEntity<CalcPackSessionAdditionalShippingChargeResponse> calcPackSessionAdditionalShippingCharge(@RequestBody CalcPackSessionAdditionalShippingChargeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear the current picking session
     * <p>service: cancelAllRows  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/cancelAllRows")
    public ResponseEntity<CancelAllRowsResponse> cancelAllRows(@RequestBody CancelAllRowsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel Received Items against a purchase order if received something incorrectly
     * <p>service: cancelReceivedItems  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/cancelReceivedItems")
    public ResponseEntity<CancelReceivedItemsResponse> cancelReceivedItems(@RequestBody CancelReceivedItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: checkForceShipmentReceived  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/checkForceShipmentReceived")
    public ResponseEntity<Map<String, Object>> checkForceShipmentReceived(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packging and set the shipment to packed
     * <p>service: completePackage  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completePackage")
    public ResponseEntity<CompletePackageResponse> completePackage(@RequestBody CompletePackageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Completes a purchase order by cancelling remaining (unreceived) item quantities and generating new product requirements from those quantities
     * <p>service: completePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completePurchaseOrder")
    public ResponseEntity<Map<String, Object>> completePurchaseOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the picking and set the shipment to PICKED
     * <p>service: completeVerifiedPick  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completeVerifiedPick")
    public ResponseEntity<CompleteVerifiedPickResponse> completeVerifiedPick(@RequestBody CompleteVerifiedPickRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FacilityContactMech
     * <p>service: createFacilityContactMech  entities: ContactMech, FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/createContactMech")
    public ResponseEntity<CreateFacilityContactMechResponse> createFacilityContactMech(@RequestBody CreateFacilityContactMechRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Email Address
     * <p>service: createFacilityEmailAddress  entities: ContactMech, FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/createEmailAddress")
    public ResponseEntity<CreateFacilityEmailAddressResponse> createFacilityEmailAddress(@RequestBody CreateFacilityEmailAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a purpose for facility contact mech
     * <p>service: createFacilityContactMechPurpose  entities: FacilityContactMechPurpose  auth: true
     */
    @PostMapping("/facility/control/createFacilityContactMechPurpose")
    public ResponseEntity<CreateFacilityContactMechPurposeResponse> createFacilityContactMechPurpose(@RequestBody CreateFacilityContactMechPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createFacilityContent  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/createFacilityContent")
    public ResponseEntity<CreateFacilityContentResponse> createFacilityContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility Group
     * <p>service: createFacilityGroup  entities: FacilityGroup  auth: true
     */
    @PostMapping("/facility/control/createFacilityGroup")
    public ResponseEntity<CreateFacilityGroupResponse> createFacilityGroup(@RequestBody CreateFacilityGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabel
     * <p>service: createInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabel")
    public ResponseEntity<CreateInventoryItemLabelResponse> createInventoryItemLabel(@RequestBody CreateInventoryItemLabelRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelAppl
     * <p>service: createInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelAppl")
    public ResponseEntity<CreateInventoryItemLabelApplResponse> createInventoryItemLabelAppl(@RequestBody CreateInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelAppl
     * <p>service: createInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelApplFromItem")
    public ResponseEntity<CreateInventoryItemLabelApplResponse> createInventoryItemLabelApplCreateInventoryItemLabelApplFromItem(@RequestBody CreateInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelType
     * <p>service: createInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelType")
    public ResponseEntity<CreateInventoryItemLabelTypeResponse> createInventoryItemLabelType(@RequestBody CreateInventoryItemLabelTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create inventory transfers for the given product and quantity. Return the units not available for transfers.
     * <p>service: createInventoryTransfersForProduct  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createInventoryTransfersForProduct")
    public ResponseEntity<CreateInventoryTransfersForProductResponse> createInventoryTransfersForProduct(@RequestBody CreateInventoryTransfersForProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a PhysicalInventory and an InventoryItemVariance
     * <p>service: createPhysicalInventoryAndVariance  entities: InventoryItemVariance, PhysicalInventory  auth: true
     */
    @PostMapping("/facility/control/createPhysicalInventoryAndVariance")
    public ResponseEntity<CreatePhysicalInventoryAndVarianceResponse> createPhysicalInventoryAndVariance(@RequestBody CreatePhysicalInventoryAndVarianceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createPhysicalInventoryAndVariance  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/createPhysicalVariances")
    public ResponseEntity<CreatePhysicalInventoryAndVarianceResponse> createPhysicalInventoryAndVarianceCreatePhysicalVariances(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Picklist From Orders
     * <p>service: createPicklistFromOrders  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createPicklistFromOrders")
    public ResponseEntity<CreatePicklistFromOrdersResponse> createPicklistFromOrders(@RequestBody CreatePicklistFromOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create PicklistRole
     * <p>service: createPicklistRole  entities: PicklistRole  auth: true
     */
    @PostMapping("/facility/control/createPicklistRole")
    public ResponseEntity<CreatePicklistRoleResponse> createPicklistRole(@RequestBody CreatePicklistRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/createPostalAddress")
    public ResponseEntity<CreateFacilityPostalAddressResponse> createFacilityPostalAddress(@RequestBody CreateFacilityPostalAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/createPostalAddressAndPurpose")
    public ResponseEntity<CreateFacilityPostalAddressResponse> createFacilityPostalAddressCreatePostalAddressAndPurpose(@RequestBody CreateFacilityPostalAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacilityLocation
     * <p>service: createProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/createProductFacilityLocation")
    public ResponseEntity<CreateProductFacilityLocationResponse> createProductFacilityLocationCreateProductFacilityLocation(@RequestBody CreateProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick Ships An Entire Order Creating One Shipment Per Facility and Ship Group. All approved order items are automatically issued in full and put into one package. The shipment is created in the INPUT status and then updated to PACKED and SHIPPED.
     * <p>service: quickShipEntireOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createQuickShipment")
    public ResponseEntity<QuickShipEntireOrderResponse> quickShipEntireOrder(@RequestBody QuickShipEntireOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageRouteSeg
     * <p>service: createShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/createRouteSegmentShipmentPackage")
    public ResponseEntity<CreateShipmentPackageRouteSegResponse> createShipmentPackageRouteSeg(@RequestBody CreateShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Shipment
     * <p>service: createShipment  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/createShipment")
    public ResponseEntity<CreateShipmentResponse> createShipment(@RequestBody CreateShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Return Shipment and ShipmentItems with primaryReturnId
     * <p>service: createShipmentAndItemsForVendorReturn  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/createShipmentAndItemsForVendorReturn")
    public ResponseEntity<CreateShipmentAndItemsForVendorReturnResponse> createShipmentAndItemsForVendorReturn(@RequestBody CreateShipmentAndItemsForVendorReturnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentItem
     * <p>service: createShipmentItem  entities: ShipmentItem  auth: true
     */
    @PostMapping("/facility/control/createShipmentItem")
    public ResponseEntity<CreateShipmentItemResponse> createShipmentItem(@RequestBody CreateShipmentItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageContent
     * <p>service: createShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/createShipmentItemPackageContent")
    public ResponseEntity<CreateShipmentPackageContentResponse> createShipmentPackageContent(@RequestBody CreateShipmentPackageContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackage
     * <p>service: createShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackage")
    public ResponseEntity<CreateShipmentPackageResponse> createShipmentPackage(@RequestBody CreateShipmentPackageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageContent
     * <p>service: createShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackageContent")
    public ResponseEntity<CreateShipmentPackageContentResponse> createShipmentPackageContentCreateShipmentPackageContent(@RequestBody CreateShipmentPackageContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageRouteSeg
     * <p>service: createShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackageRouteSeg")
    public ResponseEntity<CreateShipmentPackageRouteSegResponse> createShipmentPackageRouteSegCreateShipmentPackageRouteSeg(@RequestBody CreateShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentRouteSegment
     * <p>service: createShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/createShipmentRouteSegment")
    public ResponseEntity<CreateShipmentRouteSegmentResponse> createShipmentRouteSegment(@RequestBody CreateShipmentRouteSegmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Telecommunications Number
     * <p>service: createFacilityTelecomNumber  entities: FacilityContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/facility/control/createTelecomNumber")
    public ResponseEntity<CreateFacilityTelecomNumberResponse> createFacilityTelecomNumber(@RequestBody CreateFacilityTelecomNumberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create or update GeoPoint assigned to facility
     * <p>service: createUpdateFacilityGeoPoint  entities: GeoPoint  auth: true
     */
    @PostMapping("/facility/control/createUpdateFacilityGeoPoint")
    public ResponseEntity<CreateUpdateFacilityGeoPointResponse> createUpdateFacilityGeoPoint(@RequestBody CreateUpdateFacilityGeoPointRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FacilityContactMech
     * <p>service: deleteFacilityContactMech  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/deleteContactMech")
    public ResponseEntity<DeleteFacilityContactMechResponse> deleteFacilityContactMech(@RequestBody DeleteFacilityContactMechRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a purpose for facility contact mech
     * <p>service: deleteFacilityContactMechPurpose  entities: FacilityContactMechPurpose  auth: true
     */
    @PostMapping("/facility/control/deleteFacilityContactMechPurpose")
    public ResponseEntity<DeleteFacilityContactMechPurposeResponse> deleteFacilityContactMechPurpose(@RequestBody DeleteFacilityContactMechPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Content From Facility
     * <p>service: deleteFacilityContent  entities: FacilityContent  auth: true
     */
    @PostMapping("/facility/control/deleteFacilityContent")
    public ResponseEntity<DeleteFacilityContentResponse> deleteFacilityContent(@RequestBody DeleteFacilityContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabel
     * <p>service: deleteInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabel")
    public ResponseEntity<DeleteInventoryItemLabelResponse> deleteInventoryItemLabel(@RequestBody DeleteInventoryItemLabelRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelAppl
     * <p>service: deleteInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelAppl")
    public ResponseEntity<DeleteInventoryItemLabelApplResponse> deleteInventoryItemLabelAppl(@RequestBody DeleteInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelAppl
     * <p>service: deleteInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelApplFromItem")
    public ResponseEntity<DeleteInventoryItemLabelApplResponse> deleteInventoryItemLabelApplDeleteInventoryItemLabelApplFromItem(@RequestBody DeleteInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelType
     * <p>service: deleteInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelType")
    public ResponseEntity<DeleteInventoryItemLabelTypeResponse> deleteInventoryItemLabelType(@RequestBody DeleteInventoryItemLabelTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete the weight, dimensions/shipmentBoxType of package
     * <p>service: deletePackedLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/deletePackedLine")
    public ResponseEntity<DeletePackedLineResponse> deletePackedLine(@RequestBody DeletePackedLineRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PicklistBin
     * <p>service: deletePicklistBin  entities: PicklistBin  auth: true
     */
    @PostMapping("/facility/control/deletePicklistBin")
    public ResponseEntity<DeletePicklistBinResponse> deletePicklistBin(@RequestBody DeletePicklistBinRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PicklistItem
     * <p>service: deletePicklistItem  entities: PicklistItem  auth: true
     */
    @PostMapping("/facility/control/deletePicklistItem")
    public ResponseEntity<DeletePicklistItemResponse> deletePicklistItem(@RequestBody DeletePicklistItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacilityLocation
     * <p>service: deleteProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/deleteProductFacilityLocation")
    public ResponseEntity<DeleteProductFacilityLocationResponse> deleteProductFacilityLocationDeleteProductFacilityLocation(@RequestBody DeleteProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageRouteSeg
     * <p>service: deleteShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/deleteRouteSegmentShipmentPackage")
    public ResponseEntity<DeleteShipmentPackageRouteSegResponse> deleteShipmentPackageRouteSeg(@RequestBody DeleteShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentItem
     * <p>service: deleteShipmentItem  entities: ShipmentItem  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItem")
    public ResponseEntity<DeleteShipmentItemResponse> deleteShipmentItem(@RequestBody DeleteShipmentItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ItemIssuance
     * <p>service: deleteItemIssuance  entities: ItemIssuance  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItemIssuance")
    public ResponseEntity<DeleteItemIssuanceResponse> deleteItemIssuance(@RequestBody DeleteItemIssuanceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageContent
     * <p>service: deleteShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItemPackageContent")
    public ResponseEntity<DeleteShipmentPackageContentResponse> deleteShipmentPackageContent(@RequestBody DeleteShipmentPackageContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackage
     * <p>service: deleteShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackage")
    public ResponseEntity<DeleteShipmentPackageResponse> deleteShipmentPackage(@RequestBody DeleteShipmentPackageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageContent
     * <p>service: deleteShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackageContent")
    public ResponseEntity<DeleteShipmentPackageContentResponse> deleteShipmentPackageContentDeleteShipmentPackageContent(@RequestBody DeleteShipmentPackageContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageRouteSeg
     * <p>service: deleteShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackageRouteSeg")
    public ResponseEntity<DeleteShipmentPackageRouteSegResponse> deleteShipmentPackageRouteSegDeleteShipmentPackageRouteSeg(@RequestBody DeleteShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentRouteSegment
     * <p>service: deleteShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentRouteSegment")
    public ResponseEntity<DeleteShipmentRouteSegmentResponse> deleteShipmentRouteSegment(@RequestBody DeleteShipmentRouteSegmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * DHL Shipment Confirm
     * <p>service: dhlShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/dhlShipmentConfirm")
    public ResponseEntity<DhlShipmentConfirmResponse> dhlShipmentConfirm(@RequestBody DhlShipmentConfirmRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicates a shipment route segment and creates the new route segment in the NOT_STARTED status
     * <p>service: duplicateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/duplicateShipmentRouteSegment")
    public ResponseEntity<DuplicateShipmentRouteSegmentResponse> duplicateShipmentRouteSegment(@RequestBody DuplicateShipmentRouteSegmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit PicklistItem
     * <p>service: editPicklistItem  entities: PicklistItem  auth: true
     */
    @PostMapping("/facility/control/editPicklistItem")
    public ResponseEntity<EditPicklistItemResponse> editPicklistItem(@RequestBody EditPicklistItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Schedule a shipment route segment with FedEx. You will get back a label image and tracking number which are stored for you in the same ShipmentRouteSegment.
     * <p>service: fedexShipRequest  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/fedexShipmentConfirm")
    public ResponseEntity<FedexShipRequestResponse> fedexShipRequest(@RequestBody FedexShipRequestRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Make a unit of measure conversion, first using UomConversionDated, then with UomConversion
     * <p>service: convertUom  entities: UomConversion  auth: true
     */
    @PostMapping("/facility/control/getConvertedPrice")
    public ResponseEntity<Map<String, Object>> convertUom(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Issue an InventoryItem to a Shipment
     * <p>service: issueInventoryItemToShipment  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/issueInventoryItemToShipment")
    public ResponseEntity<IssueInventoryItemToShipmentResponse> issueInventoryItemToShipment(@RequestBody IssueInventoryItemToShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemShipGrpInvResToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemShipGrpInvResToShipment")
    public ResponseEntity<IssueOrderItemShipGrpInvResToShipmentResponse> issueOrderItemShipGrpInvResToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemToShipment")
    public ResponseEntity<IssueOrderItemToShipmentResponse> issueOrderItemToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemToShipmentAndReceiveAgainstPO")
    public ResponseEntity<IssueOrderItemToShipmentResponse> issueOrderItemToShipmentIssueOrderItemToShipmentAndReceiveAgainstPO(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Print pick sheets for orders
     * <p>service: printPickSheets  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/printPickSheets")
    public ResponseEntity<PrintPickSheetsResponse> printPickSheets(@RequestBody PrintPickSheetsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Verify Multiple Items
     * <p>service: verifyBulkItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processBulkVerifyPick")
    public ResponseEntity<VerifyBulkItemResponse> verifyBulkItem(@RequestBody VerifyBulkItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: processPhysicalStockMove  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/processPhysicalStockMove")
    public ResponseEntity<ProcessPhysicalStockMoveResponse> processPhysicalStockMove(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Process a Physical Stock Move from one FacilityLocation to another, in the same Facility. This service will not only move quantities from one InventoryItem to another but it will also reassign any existing OrderItemShipGrpInvRes records to the new InventoryItem.
     * <p>service: processPhysicalStockMove  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processQuickStockMove")
    public ResponseEntity<ProcessPhysicalStockMoveResponse> processPhysicalStockMoveProcessQuickStockMove(@RequestBody ProcessPhysicalStockMoveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Verify Single Item
     * <p>service: verifySingleItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processVerifyPick")
    public ResponseEntity<VerifySingleItemResponse> verifySingleItem(@RequestBody VerifySingleItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * DHL Shipment Confirm
     * <p>service: dhlShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickDhlConfirm")
    public ResponseEntity<DhlShipmentConfirmResponse> dhlShipmentConfirmQuickDhlConfirm(@RequestBody DhlShipmentConfirmRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * The mirror of quickShipEntireOrder, this service automatically creates shipments for an entire purchase order. All order items on each ship group is created as a Shipment. All items on a Shipment are automatically issued to a Package. The shipment's status is first set to CREATED and then set as SHIPPED. The facilityId is used to set the destinationFacilityId of the Shipment.
     * <p>service: quickReceivePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/quickReceivePurchaseOrder")
    public ResponseEntity<QuickReceivePurchaseOrderResponse> quickReceivePurchaseOrder(@RequestBody QuickReceivePurchaseOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Accept
     * <p>service: upsShipmentAccept  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickUpsAccept")
    public ResponseEntity<UpsShipmentAcceptResponse> upsShipmentAccept(@RequestBody UpsShipmentAcceptRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Confirm
     * <p>service: upsShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickUpsConfirm")
    public ResponseEntity<UpsShipmentConfirmResponse> upsShipmentConfirm(@RequestBody UpsShipmentConfirmRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveInventoryProduct")
    public ResponseEntity<ReceiveInventoryProductResponse> receiveInventoryProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveInventoryProductsFromShipment")
    public ResponseEntity<ReceiveInventoryProductResponse> receiveInventoryProductReceiveInventoryProductsFromShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveReturnedProduct")
    public ResponseEntity<ReceiveInventoryProductResponse> receiveInventoryProductReceiveReturnedProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Receive Inventory In Warehouse
     * <p>service: receiveInventoryProduct  entities: InventoryItem, InventoryItemDetail, ShipmentReceipt  auth: true
     */
    @PostMapping("/facility/control/receiveSingleInventoryProduct")
    public ResponseEntity<ReceiveInventoryProductResponse> receiveInventoryProductReceiveSingleInventoryProduct(@RequestBody ReceiveInventoryProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Facility From FacilityGroup
     * <p>service: removeFacilityFromGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/removeFacilityFromGroup")
    public ResponseEntity<RemoveFacilityFromGroupResponse> removeFacilityFromGroup(@RequestBody RemoveFacilityFromGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove FacilityGroup From FacilityGroup
     * <p>service: removeFacilityGroupFromGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/removeFacilityGroupFromGroup")
    public ResponseEntity<RemoveFacilityGroupFromGroupResponse> removeFacilityGroupFromGroup(@RequestBody RemoveFacilityGroupFromGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Facility From FacilityGroup
     * <p>service: removeFacilityFromGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/removeGroupFromFacility")
    public ResponseEntity<RemoveFacilityFromGroupResponse> removeFacilityFromGroupRemoveGroupFromFacility(@RequestBody RemoveFacilityFromGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an OrderShipment and updates the ShipmentItem
     * <p>service: removeOrderShipmentFromShipment  entities: OrderShipment  auth: true
     */
    @PostMapping("/facility/control/removeOrderShipmentFromShipment")
    public ResponseEntity<RemoveOrderShipmentFromShipmentResponse> removeOrderShipmentFromShipment(@RequestBody RemoveOrderShipmentFromShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Facility
     * <p>service: removePartyFromFacility  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/removePartyFromFacility")
    public ResponseEntity<RemovePartyFromFacilityResponse> removePartyFromFacility(@RequestBody RemovePartyFromFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From FacilityGroup
     * <p>service: removePartyFromFacilityGroup  entities: FacilityGroupRole  auth: true
     */
    @PostMapping("/facility/control/removePartyFromFacilityGroup")
    public ResponseEntity<RemovePartyFromFacilityGroupResponse> removePartyFromFacilityGroup(@RequestBody RemovePartyFromFacilityGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Save the package(s) information in ShipmentPackage entity from session
     * <p>service: savePackagesInfo  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/savePackagesInfo")
    public ResponseEntity<SavePackagesInfoResponse> savePackagesInfo(@RequestBody SavePackagesInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the weight, dimensions/shipmentBoxType of package in SESSION
     * <p>service: setPackageInfo  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/setPackageInfo")
    public ResponseEntity<SetPackageInfoResponse> setPackageInfo(@RequestBody SetPackageInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackage
     * <p>service: updateShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/setQuickPackageWeight")
    public ResponseEntity<UpdateShipmentPackageResponse> updateShipmentPackage(@RequestBody UpdateShipmentPackageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentRouteSegment
     * <p>service: updateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/setQuickRouteInfo")
    public ResponseEntity<UpdateShipmentRouteSegmentResponse> updateShipmentRouteSegmentSetQuickRouteInfo(@RequestBody UpdateShipmentRouteSegmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Shipment Settings From Primary Order
     * <p>service: setShipmentSettingsFromPrimaryOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/setShipmentSettingsFromPrimaryOrder")
    public ResponseEntity<SetShipmentSettingsFromPrimaryOrderResponse> setShipmentSettingsFromPrimaryOrder(@RequestBody SetShipmentSettingsFromPrimaryOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packaging set the shipment to packed
     * <p>service: completeShipment  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/shipNow")
    public ResponseEntity<CompleteShipmentResponse> completeShipment(@RequestBody CompleteShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FacilityContactMech
     * <p>service: updateFacilityContactMech  entities: FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/updateContactMech")
    public ResponseEntity<UpdateFacilityContactMechResponse> updateFacilityContactMech(@RequestBody UpdateFacilityContactMechRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Email Address
     * <p>service: updateFacilityEmailAddress  entities: FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/updateEmailAddress")
    public ResponseEntity<UpdateFacilityEmailAddressResponse> updateFacilityEmailAddress(@RequestBody UpdateFacilityEmailAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility Group
     * <p>service: updateFacilityGroup  entities: FacilityGroup  auth: true
     */
    @PostMapping("/facility/control/updateFacilityGroup")
    public ResponseEntity<UpdateFacilityGroupResponse> updateFacilityGroup(@RequestBody UpdateFacilityGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update FacilityGroup To FacilityGroup Rollup
     * <p>service: updateFacilityGroupToGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/updateFacilityGroupToGroup")
    public ResponseEntity<UpdateFacilityGroupToGroupResponse> updateFacilityGroupToGroup(@RequestBody UpdateFacilityGroupToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party From Facility
     * <p>service: updateFacilityParty  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/updateFacilityParty")
    public ResponseEntity<UpdateFacilityPartyResponse> updateFacilityParty(@RequestBody UpdateFacilityPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Facility -> Group Member
     * <p>service: updateFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/updateFacilityToGroup")
    public ResponseEntity<UpdateFacilityToGroupResponse> updateFacilityToGroup(@RequestBody UpdateFacilityToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Facility -> Group Member
     * <p>service: updateFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/updateGroupToFacility")
    public ResponseEntity<UpdateFacilityToGroupResponse> updateFacilityToGroupUpdateGroupToFacility(@RequestBody UpdateFacilityToGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabel
     * <p>service: updateInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabel")
    public ResponseEntity<UpdateInventoryItemLabelResponse> updateInventoryItemLabel(@RequestBody UpdateInventoryItemLabelRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelAppl
     * <p>service: updateInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelAppl")
    public ResponseEntity<UpdateInventoryItemLabelApplResponse> updateInventoryItemLabelAppl(@RequestBody UpdateInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelAppl
     * <p>service: updateInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelApplFromItem")
    public ResponseEntity<UpdateInventoryItemLabelApplResponse> updateInventoryItemLabelApplUpdateInventoryItemLabelApplFromItem(@RequestBody UpdateInventoryItemLabelApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelType
     * <p>service: updateInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelType")
    public ResponseEntity<UpdateInventoryItemLabelTypeResponse> updateInventoryItemLabelType(@RequestBody UpdateInventoryItemLabelTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the weight, dimensions/shipmentBoxType of package
     * <p>service: updatePackedLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/updatePackedLine")
    public ResponseEntity<UpdatePackedLineResponse> updatePackedLine(@RequestBody UpdatePackedLineRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Picklist
     * <p>service: updatePicklist  entities: Picklist  auth: true
     */
    @PostMapping("/facility/control/updatePicklist")
    public ResponseEntity<UpdatePicklistResponse> updatePicklist(@RequestBody UpdatePicklistRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update PicklistBin
     * <p>service: updatePicklistBin  entities: PicklistBin  auth: true
     */
    @PostMapping("/facility/control/updatePicklistBin")
    public ResponseEntity<UpdatePicklistBinResponse> updatePicklistBin(@RequestBody UpdatePicklistBinRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Postal Address
     * <p>service: updateFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/updatePostalAddress")
    public ResponseEntity<UpdateFacilityPostalAddressResponse> updateFacilityPostalAddress(@RequestBody UpdateFacilityPostalAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacilityLocation
     * <p>service: updateProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/updateProductFacilityLocation")
    public ResponseEntity<UpdateProductFacilityLocationResponse> updateProductFacilityLocationUpdateProductFacilityLocation(@RequestBody UpdateProductFacilityLocationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackageRouteSeg
     * <p>service: updateShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/updateRouteSegmentShipmentPackage")
    public ResponseEntity<UpdateShipmentPackageRouteSegResponse> updateShipmentPackageRouteSeg(@RequestBody UpdateShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Shipment
     * <p>service: updateShipment  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/updateShipment")
    public ResponseEntity<UpdateShipmentResponse> updateShipment(@RequestBody UpdateShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayDhl record
     * <p>service: updateShipmentGatewayDhl  entities: ShipmentGatewayDhl  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayDhl")
    public ResponseEntity<UpdateShipmentGatewayDhlResponse> updateShipmentGatewayDhl(@RequestBody UpdateShipmentGatewayDhlRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayFedex record
     * <p>service: updateShipmentGatewayFedex  entities: ShipmentGatewayFedex  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayFedex")
    public ResponseEntity<UpdateShipmentGatewayFedexResponse> updateShipmentGatewayFedex(@RequestBody UpdateShipmentGatewayFedexRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayUps
     * <p>service: updateShipmentGatewayUps  entities: ShipmentGatewayUps  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayUps")
    public ResponseEntity<UpdateShipmentGatewayUpsResponse> updateShipmentGatewayUps(@RequestBody UpdateShipmentGatewayUpsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayUsps
     * <p>service: updateShipmentGatewayUsps  entities: ShipmentGatewayUsps  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayUsps")
    public ResponseEntity<UpdateShipmentGatewayUspsResponse> updateShipmentGatewayUsps(@RequestBody UpdateShipmentGatewayUspsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackage
     * <p>service: updateShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/updateShipmentPackage")
    public ResponseEntity<UpdateShipmentPackageResponse> updateShipmentPackageUpdateShipmentPackage(@RequestBody UpdateShipmentPackageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackageRouteSeg
     * <p>service: updateShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/updateShipmentPackageRouteSeg")
    public ResponseEntity<UpdateShipmentPackageRouteSegResponse> updateShipmentPackageRouteSegUpdateShipmentPackageRouteSeg(@RequestBody UpdateShipmentPackageRouteSegRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentRouteSegment
     * <p>service: updateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/updateShipmentRouteSegment")
    public ResponseEntity<UpdateShipmentRouteSegmentResponse> updateShipmentRouteSegmentUpdateShipmentRouteSegment(@RequestBody UpdateShipmentRouteSegmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Telecommunications Number
     * <p>service: updateFacilityTelecomNumber  entities: FacilityContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/facility/control/updateTelecomNumber")
    public ResponseEntity<UpdateFacilityTelecomNumberResponse> updateFacilityTelecomNumber(@RequestBody UpdateFacilityTelecomNumberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Accept
     * <p>service: upsShipmentAccept  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsShipmentAccept")
    public ResponseEntity<UpsShipmentAcceptResponse> upsShipmentAcceptUpsShipmentAccept(@RequestBody UpsShipmentAcceptRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Confirm
     * <p>service: upsShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsShipmentConfirm")
    public ResponseEntity<UpsShipmentConfirmResponse> upsShipmentConfirmUpsShipmentConfirm(@RequestBody UpsShipmentConfirmRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Track Shipment
     * <p>service: upsTrackShipment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsTrackShipment")
    public ResponseEntity<UpsTrackShipmentResponse> upsTrackShipment(@RequestBody UpsTrackShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Void Shipment
     * <p>service: upsVoidShipment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsVoidShipment")
    public ResponseEntity<UpsVoidShipmentResponse> upsVoidShipment(@RequestBody UpsVoidShipmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: viewShipmentPackageRouteSegLabelImage  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/viewShipmentLabel")
    public ResponseEntity<Map<String, Object>> viewShipmentPackageRouteSegLabelImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: viewShipmentPackageRouteSegLabelImage  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/viewShipmentPackageRouteSegLabelImage")
    public ResponseEntity<Map<String, Object>> viewShipmentPackageRouteSegLabelImageViewShipmentPackageRouteSegLabelImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
