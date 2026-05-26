package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.order.AddOrderItemShipGroupAssocRequest;
import com.landawn.ofbiz.model.order.AddOrderItemShipGroupAssocResponse;
import com.landawn.ofbiz.model.order.AddOrderItemShipGroupRequest;
import com.landawn.ofbiz.model.order.AddOrderItemShipGroupResponse;
import com.landawn.ofbiz.model.order.AddPaymentMethodToOrderRequest;
import com.landawn.ofbiz.model.order.AddPaymentMethodToOrderResponse;
import com.landawn.ofbiz.model.order.AppendOrderItemRequest;
import com.landawn.ofbiz.model.order.AppendOrderItemResponse;
import com.landawn.ofbiz.model.order.ApproveRequirementResponse;
import com.landawn.ofbiz.model.order.AssignItemShipGroupRequest;
import com.landawn.ofbiz.model.order.AssignItemShipGroupResponse;
import com.landawn.ofbiz.model.order.AutoAssignRequirementToSupplierRequest;
import com.landawn.ofbiz.model.order.AutoAssignRequirementToSupplierResponse;
import com.landawn.ofbiz.model.order.AutoCreateQuoteAdjustmentsRequest;
import com.landawn.ofbiz.model.order.AutoCreateQuoteAdjustmentsResponse;
import com.landawn.ofbiz.model.order.AutoUpdateQuotePriceResponse;
import com.landawn.ofbiz.model.order.CancelOrderItemRequest;
import com.landawn.ofbiz.model.order.CancelOrderItemResponse;
import com.landawn.ofbiz.model.order.ChangeAllocationPlanStatusRequest;
import com.landawn.ofbiz.model.order.ChangeAllocationPlanStatusResponse;
import com.landawn.ofbiz.model.order.ChangeOrderItemStatusRequest;
import com.landawn.ofbiz.model.order.ChangeOrderItemStatusResponse;
import com.landawn.ofbiz.model.order.ChangeOrderStatusRequest;
import com.landawn.ofbiz.model.order.ChangeOrderStatusResponse;
import com.landawn.ofbiz.model.order.CompletePurchaseOrderRequest;
import com.landawn.ofbiz.model.order.CompletePurchaseOrderResponse;
import com.landawn.ofbiz.model.order.CopyCustRequestItemRequest;
import com.landawn.ofbiz.model.order.CopyCustRequestItemResponse;
import com.landawn.ofbiz.model.order.CopyQuoteRequest;
import com.landawn.ofbiz.model.order.CopyQuoteResponse;
import com.landawn.ofbiz.model.order.CreateAllocationPlanAndItemsRequest;
import com.landawn.ofbiz.model.order.CreateAllocationPlanAndItemsResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestContentResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestFromCartResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestFromShoppingListRequest;
import com.landawn.ofbiz.model.order.CreateCustRequestFromShoppingListResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestItemNoteRequest;
import com.landawn.ofbiz.model.order.CreateCustRequestItemNoteResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestItemRequest;
import com.landawn.ofbiz.model.order.CreateCustRequestItemResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestPartyRequest;
import com.landawn.ofbiz.model.order.CreateCustRequestPartyResponse;
import com.landawn.ofbiz.model.order.CreateCustRequestRequest;
import com.landawn.ofbiz.model.order.CreateCustRequestResponse;
import com.landawn.ofbiz.model.order.CreateOrderAdjustmentRequest;
import com.landawn.ofbiz.model.order.CreateOrderAdjustmentResponse;
import com.landawn.ofbiz.model.order.CreateOrderConversationRequest;
import com.landawn.ofbiz.model.order.CreateOrderConversationResponse;
import com.landawn.ofbiz.model.order.CreateOrderDeliveryScheduleRequest;
import com.landawn.ofbiz.model.order.CreateOrderDeliveryScheduleResponse;
import com.landawn.ofbiz.model.order.CreateOrderHeaderRequest;
import com.landawn.ofbiz.model.order.CreateOrderHeaderResponse;
import com.landawn.ofbiz.model.order.CreateOrderItemShipGroupRequest;
import com.landawn.ofbiz.model.order.CreateOrderItemShipGroupResponse;
import com.landawn.ofbiz.model.order.CreateOrderNoteRequest;
import com.landawn.ofbiz.model.order.CreateOrderNoteResponse;
import com.landawn.ofbiz.model.order.CreateOrderTermRequest;
import com.landawn.ofbiz.model.order.CreateOrderTermResponse;
import com.landawn.ofbiz.model.order.CreateQuoteAdjustmentRequest;
import com.landawn.ofbiz.model.order.CreateQuoteAdjustmentResponse;
import com.landawn.ofbiz.model.order.CreateQuoteAndQuoteItemForRequestRequest;
import com.landawn.ofbiz.model.order.CreateQuoteAndQuoteItemForRequestResponse;
import com.landawn.ofbiz.model.order.CreateQuoteAttributeRequest;
import com.landawn.ofbiz.model.order.CreateQuoteAttributeResponse;
import com.landawn.ofbiz.model.order.CreateQuoteCoefficientRequest;
import com.landawn.ofbiz.model.order.CreateQuoteCoefficientResponse;
import com.landawn.ofbiz.model.order.CreateQuoteFromCartResponse;
import com.landawn.ofbiz.model.order.CreateQuoteFromCustRequestRequest;
import com.landawn.ofbiz.model.order.CreateQuoteFromCustRequestResponse;
import com.landawn.ofbiz.model.order.CreateQuoteFromShoppingListRequest;
import com.landawn.ofbiz.model.order.CreateQuoteFromShoppingListResponse;
import com.landawn.ofbiz.model.order.CreateQuoteItemRequest;
import com.landawn.ofbiz.model.order.CreateQuoteItemResponse;
import com.landawn.ofbiz.model.order.CreateQuoteNoteRequest;
import com.landawn.ofbiz.model.order.CreateQuoteNoteResponse;
import com.landawn.ofbiz.model.order.CreateQuoteRequest;
import com.landawn.ofbiz.model.order.CreateQuoteResponse;
import com.landawn.ofbiz.model.order.CreateQuoteRoleRequest;
import com.landawn.ofbiz.model.order.CreateQuoteRoleResponse;
import com.landawn.ofbiz.model.order.CreateQuoteTermRequest;
import com.landawn.ofbiz.model.order.CreateQuoteTermResponse;
import com.landawn.ofbiz.model.order.CreateRequirementRequest;
import com.landawn.ofbiz.model.order.CreateRequirementResponse;
import com.landawn.ofbiz.model.order.CreateRequirementRoleRequest;
import com.landawn.ofbiz.model.order.CreateRequirementRoleResponse;
import com.landawn.ofbiz.model.order.CreateReturnAndItemOrAdjustmentResponse;
import com.landawn.ofbiz.model.order.CreateReturnHeaderRequest;
import com.landawn.ofbiz.model.order.CreateReturnHeaderResponse;
import com.landawn.ofbiz.model.order.CreateReturnItemOrAdjustmentResponse;
import com.landawn.ofbiz.model.order.CreateShoppingListItemRequest;
import com.landawn.ofbiz.model.order.CreateShoppingListItemResponse;
import com.landawn.ofbiz.model.order.CreateTransferFromRequirementResponse;
import com.landawn.ofbiz.model.order.CreateUpdateShippingAddressRequest;
import com.landawn.ofbiz.model.order.CreateUpdateShippingAddressResponse;
import com.landawn.ofbiz.model.order.DeleteAllocationPlanItemRequest;
import com.landawn.ofbiz.model.order.DeleteAllocationPlanItemResponse;
import com.landawn.ofbiz.model.order.DeleteCustRequestPartyRequest;
import com.landawn.ofbiz.model.order.DeleteCustRequestPartyResponse;
import com.landawn.ofbiz.model.order.DeleteOrderAdjustmentRequest;
import com.landawn.ofbiz.model.order.DeleteOrderAdjustmentResponse;
import com.landawn.ofbiz.model.order.DeleteOrderItemShipGroupAssocRequest;
import com.landawn.ofbiz.model.order.DeleteOrderItemShipGroupAssocResponse;
import com.landawn.ofbiz.model.order.DeleteOrderItemShipGroupRequest;
import com.landawn.ofbiz.model.order.DeleteOrderItemShipGroupResponse;
import com.landawn.ofbiz.model.order.DeleteQuoteTermRequest;
import com.landawn.ofbiz.model.order.DeleteQuoteTermResponse;
import com.landawn.ofbiz.model.order.DeleteQuoteWorkEffortRequest;
import com.landawn.ofbiz.model.order.DeleteQuoteWorkEffortResponse;
import com.landawn.ofbiz.model.order.DeleteRequirementAndRelatedRequest;
import com.landawn.ofbiz.model.order.DeleteRequirementAndRelatedResponse;
import com.landawn.ofbiz.model.order.EnsureWorkEffortAndCreateQuoteWorkEffortRequest;
import com.landawn.ofbiz.model.order.EnsureWorkEffortAndCreateQuoteWorkEffortResponse;
import com.landawn.ofbiz.model.order.ExpireCustRequestContentRequest;
import com.landawn.ofbiz.model.order.ExpireCustRequestContentResponse;
import com.landawn.ofbiz.model.order.ExpireCustRequestPartyRequest;
import com.landawn.ofbiz.model.order.ExpireCustRequestPartyResponse;
import com.landawn.ofbiz.model.order.FindOrdersRequest;
import com.landawn.ofbiz.model.order.FindOrdersResponse;
import com.landawn.ofbiz.model.order.GetStatusItemsForReturnRequest;
import com.landawn.ofbiz.model.order.GetStatusItemsForReturnResponse;
import com.landawn.ofbiz.model.order.LoadCartFromOrderResponse;
import com.landawn.ofbiz.model.order.LoadCartFromQuoteResponse;
import com.landawn.ofbiz.model.order.LoadCartFromShoppingListResponse;
import com.landawn.ofbiz.model.order.MassCancelOrdersRequest;
import com.landawn.ofbiz.model.order.MassCancelOrdersResponse;
import com.landawn.ofbiz.model.order.MassCancelRemainingPurchaseOrderItemsRequest;
import com.landawn.ofbiz.model.order.MassCancelRemainingPurchaseOrderItemsResponse;
import com.landawn.ofbiz.model.order.MassChangeOrderApprovedRequest;
import com.landawn.ofbiz.model.order.MassChangeOrderApprovedResponse;
import com.landawn.ofbiz.model.order.MassCreateFileForOrdersRequest;
import com.landawn.ofbiz.model.order.MassCreateFileForOrdersResponse;
import com.landawn.ofbiz.model.order.MassHoldOrdersRequest;
import com.landawn.ofbiz.model.order.MassHoldOrdersResponse;
import com.landawn.ofbiz.model.order.MassPickOrdersRequest;
import com.landawn.ofbiz.model.order.MassPickOrdersResponse;
import com.landawn.ofbiz.model.order.MassPrintOrdersRequest;
import com.landawn.ofbiz.model.order.MassPrintOrdersResponse;
import com.landawn.ofbiz.model.order.MassProcessOrdersRequest;
import com.landawn.ofbiz.model.order.MassProcessOrdersResponse;
import com.landawn.ofbiz.model.order.MassQuickShipOrdersRequest;
import com.landawn.ofbiz.model.order.MassQuickShipOrdersResponse;
import com.landawn.ofbiz.model.order.MassRejectOrdersRequest;
import com.landawn.ofbiz.model.order.MassRejectOrdersResponse;
import com.landawn.ofbiz.model.order.ProductAvailabilityByFacilityRequest;
import com.landawn.ofbiz.model.order.ProductAvailabilityByFacilityResponse;
import com.landawn.ofbiz.model.order.QuickReturnOrderRequest;
import com.landawn.ofbiz.model.order.QuickReturnOrderResponse;
import com.landawn.ofbiz.model.order.RecalcTaxTotalRequest;
import com.landawn.ofbiz.model.order.RecalcTaxTotalResponse;
import com.landawn.ofbiz.model.order.RemoveOrderTermRequest;
import com.landawn.ofbiz.model.order.RemoveOrderTermResponse;
import com.landawn.ofbiz.model.order.RemoveQuoteAdjustmentRequest;
import com.landawn.ofbiz.model.order.RemoveQuoteAdjustmentResponse;
import com.landawn.ofbiz.model.order.RemoveQuoteAttributeRequest;
import com.landawn.ofbiz.model.order.RemoveQuoteAttributeResponse;
import com.landawn.ofbiz.model.order.RemoveQuoteCoefficientRequest;
import com.landawn.ofbiz.model.order.RemoveQuoteCoefficientResponse;
import com.landawn.ofbiz.model.order.RemoveQuoteItemRequest;
import com.landawn.ofbiz.model.order.RemoveQuoteItemResponse;
import com.landawn.ofbiz.model.order.RemoveQuoteRoleRequest;
import com.landawn.ofbiz.model.order.RemoveQuoteRoleResponse;
import com.landawn.ofbiz.model.order.RemoveRequirementRoleRequest;
import com.landawn.ofbiz.model.order.RemoveRequirementRoleResponse;
import com.landawn.ofbiz.model.order.RemoveReturnAdjustmentRequest;
import com.landawn.ofbiz.model.order.RemoveReturnAdjustmentResponse;
import com.landawn.ofbiz.model.order.RemoveReturnItemRequest;
import com.landawn.ofbiz.model.order.RemoveReturnItemResponse;
import com.landawn.ofbiz.model.order.SendOrderConfirmationRequest;
import com.landawn.ofbiz.model.order.SendOrderConfirmationResponse;
import com.landawn.ofbiz.model.order.SendPOEmailRequest;
import com.landawn.ofbiz.model.order.SendPOEmailResponse;
import com.landawn.ofbiz.model.order.SendQuoteReportMailRequest;
import com.landawn.ofbiz.model.order.SendQuoteReportMailResponse;
import com.landawn.ofbiz.model.order.SetAllowOrderSplitRequest;
import com.landawn.ofbiz.model.order.SetAllowOrderSplitResponse;
import com.landawn.ofbiz.model.order.SetCartShippingAddressRequest;
import com.landawn.ofbiz.model.order.SetCartShippingAddressResponse;
import com.landawn.ofbiz.model.order.SetCartShippingOptionsRequest;
import com.landawn.ofbiz.model.order.SetCartShippingOptionsResponse;
import com.landawn.ofbiz.model.order.SetCustRequestStatusRequest;
import com.landawn.ofbiz.model.order.SetCustRequestStatusResponse;
import com.landawn.ofbiz.model.order.SetGiftMessageRequest;
import com.landawn.ofbiz.model.order.SetGiftMessageResponse;
import com.landawn.ofbiz.model.order.SetShippingInstructionsRequest;
import com.landawn.ofbiz.model.order.SetShippingInstructionsResponse;
import com.landawn.ofbiz.model.order.UpdateAllocationPlanItemsRequest;
import com.landawn.ofbiz.model.order.UpdateAllocationPlanItemsResponse;
import com.landawn.ofbiz.model.order.UpdateCustRequestItemRequest;
import com.landawn.ofbiz.model.order.UpdateCustRequestItemResponse;
import com.landawn.ofbiz.model.order.UpdateCustRequestPartyRequest;
import com.landawn.ofbiz.model.order.UpdateCustRequestPartyResponse;
import com.landawn.ofbiz.model.order.UpdateCustRequestRequest;
import com.landawn.ofbiz.model.order.UpdateCustRequestResponse;
import com.landawn.ofbiz.model.order.UpdateOrderAdjustmentRequest;
import com.landawn.ofbiz.model.order.UpdateOrderAdjustmentResponse;
import com.landawn.ofbiz.model.order.UpdateOrderContactMechRequest;
import com.landawn.ofbiz.model.order.UpdateOrderContactMechResponse;
import com.landawn.ofbiz.model.order.UpdateOrderDeliveryScheduleRequest;
import com.landawn.ofbiz.model.order.UpdateOrderDeliveryScheduleResponse;
import com.landawn.ofbiz.model.order.UpdateOrderHeaderRequest;
import com.landawn.ofbiz.model.order.UpdateOrderHeaderResponse;
import com.landawn.ofbiz.model.order.UpdateOrderItemShipGroupAssocResponse;
import com.landawn.ofbiz.model.order.UpdateOrderItemShipGroupRequest;
import com.landawn.ofbiz.model.order.UpdateOrderItemShipGroupResponse;
import com.landawn.ofbiz.model.order.UpdateOrderItemsRequest;
import com.landawn.ofbiz.model.order.UpdateOrderItemsResponse;
import com.landawn.ofbiz.model.order.UpdateOrderNoteRequest;
import com.landawn.ofbiz.model.order.UpdateOrderNoteResponse;
import com.landawn.ofbiz.model.order.UpdateOrderPaymentPreferenceRequest;
import com.landawn.ofbiz.model.order.UpdateOrderPaymentPreferenceResponse;
import com.landawn.ofbiz.model.order.UpdateOrderTermRequest;
import com.landawn.ofbiz.model.order.UpdateOrderTermResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteAdjustmentRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteAdjustmentResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteAttributeRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteAttributeResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteCoefficientRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteCoefficientResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteItemRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteItemResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteRoleRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteRoleResponse;
import com.landawn.ofbiz.model.order.UpdateQuoteTermRequest;
import com.landawn.ofbiz.model.order.UpdateQuoteTermResponse;
import com.landawn.ofbiz.model.order.UpdateRequirementRequest;
import com.landawn.ofbiz.model.order.UpdateRequirementResponse;
import com.landawn.ofbiz.model.order.UpdateRequirementRoleRequest;
import com.landawn.ofbiz.model.order.UpdateRequirementRoleResponse;
import com.landawn.ofbiz.model.order.UpdateReturnHeaderRequest;
import com.landawn.ofbiz.model.order.UpdateReturnHeaderResponse;
import com.landawn.ofbiz.model.order.UpdateReturnItemOrAdjustmentResponse;
import com.landawn.ofbiz.model.order.UpdateShipGroupShipInfoRequest;
import com.landawn.ofbiz.model.order.UpdateShipGroupShipInfoResponse;
import com.landawn.ofbiz.model.order.UpdateShippingMethodAndChargesRequest;
import com.landawn.ofbiz.model.order.UpdateShippingMethodAndChargesResponse;
import com.landawn.ofbiz.model.order.UpdateTrackingNumberRequest;
import com.landawn.ofbiz.model.order.UpdateTrackingNumberResponse;
import com.landawn.ofbiz.model.order.UploadOrderContentFileRequest;
import com.landawn.ofbiz.model.order.UploadOrderContentFileResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Creates a new OrderItemShipGroup with maySplit and isGift filled.
     * <p>service: addOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroup")
    public ResponseEntity<AddOrderItemShipGroupResponse> addOrderItemShipGroup(@RequestBody AddOrderItemShipGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add Order Item Ship Group Assoc and if order item ship group not exit, create it before
     * <p>service: addOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroupAssoc")
    public ResponseEntity<AddOrderItemShipGroupAssocResponse> addOrderItemShipGroupAssoc(@RequestBody AddOrderItemShipGroupAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: bulkAddProducts  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/BulkAddProducts")
    public ResponseEntity<Map<String, Object>> bulkAddProducts(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete Order Item Ship Group
     * <p>service: deleteOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/DeleteOrderItemShipGroup")
    public ResponseEntity<DeleteOrderItemShipGroupResponse> deleteOrderItemShipGroup(@RequestBody DeleteOrderItemShipGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete Order Item Ship Group Assoc
     * <p>service: deleteOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/DeleteOrderItemShipGroupAssoc")
    public ResponseEntity<DeleteOrderItemShipGroupAssocResponse> deleteOrderItemShipGroupAssoc(@RequestBody DeleteOrderItemShipGroupAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateOrderItemShipGroupAssoc  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/UpdateOrderItemShipGroupAssoc")
    public ResponseEntity<UpdateOrderItemShipGroupAssocResponse> updateOrderItemShipGroupAssoc(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addAdditionalParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addAdditionalParty")
    public ResponseEntity<Map<String, Object>> addAdditionalParty(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addListToCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addAllFromShoppingList")
    public ResponseEntity<Map<String, Object>> addListToCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addBulkFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addBulkToShoppingList")
    public ResponseEntity<Map<String, Object>> addBulkFromCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addCategoryDefaults  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/addCategoryDefaults")
    public ResponseEntity<Map<String, Object>> addCategoryDefaults(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSurveyResponseAndRestoreParameters  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addGiftCertificateSurvey")
    public ResponseEntity<Map<String, Object>> createSurveyResponseAndRestoreParameters(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a shopping list item
     * <p>service: createShoppingListItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addItemToShoppingList")
    public ResponseEntity<CreateShoppingListItemResponse> createShoppingListItem(@RequestBody CreateShoppingListItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Upload and attach a file to an order
     * <p>service: uploadOrderContentFile  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addOrderAttachments")
    public ResponseEntity<UploadOrderContentFileResponse> uploadOrderContentFile(@RequestBody UploadOrderContentFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addOrderTerm  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addOrderTerm")
    public ResponseEntity<Map<String, Object>> addOrderTerm(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Payment Method to Order.From this servicewe will call the createOrderPaymentPreference service to create OrderPaymentPreference
     * <p>service: addPaymentMethodToOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addPaymentMethodToOrder")
    public ResponseEntity<AddPaymentMethodToOrderResponse> addPaymentMethodToOrder(@RequestBody AddPaymentMethodToOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addToCartBulkRequirements  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addRequirementsToCart")
    public ResponseEntity<Map<String, Object>> addToCartBulkRequirements(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates new shipping address and update existing address
     * <p>service: createUpdateShippingAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addShippingAddress")
    public ResponseEntity<CreateUpdateShippingAddressResponse> createUpdateShippingAddress(@RequestBody CreateUpdateShippingAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductToComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addToCompare")
    public ResponseEntity<Map<String, Object>> addProductToComparisonList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addToCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/additem")
    public ResponseEntity<Map<String, Object>> addToCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSurveyResponseAndRestoreParameters  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/additemsurvey")
    public ResponseEntity<Map<String, Object>> createSurveyResponseAndRestoreParametersAdditemsurvey(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductPromoCode  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addpromocode")
    public ResponseEntity<Map<String, Object>> addProductPromoCode(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addSeparator  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addseperator")
    public ResponseEntity<Map<String, Object>> addSeparator(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addToCartBulk  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addtocartbulk")
    public ResponseEntity<Map<String, Object>> addToCartBulk(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Allow Split Flag To 'Y' (true)
     * <p>service: setAllowOrderSplit  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/allowordersplit")
    public ResponseEntity<SetAllowOrderSplitResponse> setAllowOrderSplit(@RequestBody SetAllowOrderSplitRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Append an item to an existing order
     * <p>service: appendOrderItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/appendItemToOrder")
    public ResponseEntity<AppendOrderItemResponse> appendOrderItem(@RequestBody AppendOrderItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: approveRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/approveRequirements")
    public ResponseEntity<ApproveRequirementResponse> approveRequirement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/assignItemToShipGroups")
    public ResponseEntity<AssignItemShipGroupResponse> assignItemShipGroup(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Process (authorizes/re-authorizes) a single payment for an order with an optional overrideAmount
     * <p>service: authOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/authOrderPayment")
    public ResponseEntity<Map<String, Object>> authOrderPaymentPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * If the requirement is a product requirement (purchasing) try to assign it to the primary supplier
     * <p>service: autoAssignRequirementToSupplier  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/autoAssignRequirementToSupplier")
    public ResponseEntity<AutoAssignRequirementToSupplierResponse> autoAssignRequirementToSupplier(@RequestBody AutoAssignRequirementToSupplierRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove all existing quote adjustments, recalc them and persist in QuoteAdjustment.
     * <p>service: autoCreateQuoteAdjustments  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/autoCreateQuoteAdjustments")
    public ResponseEntity<AutoCreateQuoteAdjustmentsResponse> autoCreateQuoteAdjustments(@RequestBody AutoCreateQuoteAdjustmentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: autoUpdateQuotePrice  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/autoUpdateQuotePrices")
    public ResponseEntity<AutoUpdateQuotePriceResponse> autoUpdateQuotePrice(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Balance inventory items based on the new item specified which will have available inventory that back-order (negative ATP) reservations can be reassigned to.
     * <p>service: balanceInventoryItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/balanceInventoryItems")
    public ResponseEntity<Map<String, Object>> balanceInventoryItems(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: bulkAddProductsInApprovedOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/bulkAddProductsInApprovedOrder")
    public ResponseEntity<Map<String, Object>> bulkAddProductsInApprovedOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getShipEstimate  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcShipping")
    public ResponseEntity<Map<String, Object>> getShipEstimate(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getShipEstimate  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcShippingBeforePayment")
    public ResponseEntity<Map<String, Object>> getShipEstimateCalcShippingBeforePayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: calcTax  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcTax")
    public ResponseEntity<Map<String, Object>> calcTax(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: calcTax  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcTaxBeforePayment")
    public ResponseEntity<Map<String, Object>> calcTaxCalcTaxBeforePayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel an Order Item Quantity
     * <p>service: cancelOrderItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/cancelOrderItem")
    public ResponseEntity<CancelOrderItemResponse> cancelOrderItem(@RequestBody CancelOrderItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: cancelSelectedOrderItems  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/cancelSelectedOrderItems")
    public ResponseEntity<Map<String, Object>> cancelSelectedOrderItems(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setCartShipToCustomerParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/cartUpdateShipToCustomerParty")
    public ResponseEntity<Map<String, Object>> setCartShipToCustomerParty(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change Allocation Plan Status
     * <p>service: changeAllocationPlanStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeAllocationPlanStatus")
    public ResponseEntity<ChangeAllocationPlanStatusResponse> changeAllocationPlanStatus(@RequestBody ChangeAllocationPlanStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of an existing order item. If no orderItemSeqId is specified, the status of all order items will be changed.
     * <p>service: changeOrderItemStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderItemStatus")
    public ResponseEntity<ChangeOrderItemStatusResponse> changeOrderItemStatus(@RequestBody ChangeOrderItemStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of an existing order
     * <p>service: changeOrderStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderStatus")
    public ResponseEntity<ChangeOrderStatusResponse> changeOrderStatus(@RequestBody ChangeOrderStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: checkOrderDenylist  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/checkDenyList")
    public ResponseEntity<Map<String, Object>> checkOrderDenylist(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setQuickCheckOutOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/checkout")
    public ResponseEntity<Map<String, Object>> setQuickCheckOutOptions(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearCartForReplacementOrder")
    public ResponseEntity<Map<String, Object>> destroyCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: clearProductComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearCompareList")
    public ResponseEntity<Map<String, Object>> clearProductComparisonList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: clearSearchOptionsHistoryList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearSearchOptionsHistoryList")
    public ResponseEntity<Map<String, Object>> clearSearchOptionsHistoryList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearcart")
    public ResponseEntity<Map<String, Object>> destroyCartClearcart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/clearpocart")
    public ResponseEntity<Map<String, Object>> destroyCartClearpocart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Completes a purchase order by cancelling remaining (unreceived) item quantities and generating new product requirements from those quantities
     * <p>service: completePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/completePurchaseOrder")
    public ResponseEntity<CompletePurchaseOrderResponse> completePurchaseOrder(@RequestBody CompletePurchaseOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy a CustRequest
     * <p>service: copyCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/copyCustRequestItem")
    public ResponseEntity<CopyCustRequestItemResponse> copyCustRequestItem(@RequestBody CopyCustRequestItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy a Quote
     * <p>service: copyQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/copyQuote")
    public ResponseEntity<CopyQuoteResponse> copyQuote(@RequestBody CopyQuoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Allocation Plan And Items
     * <p>service: createAllocationPlanAndItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createAllocationPlanAndItems")
    public ResponseEntity<CreateAllocationPlanAndItemsResponse> createAllocationPlanAndItems(@RequestBody CreateAllocationPlanAndItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCreditCard")
    public ResponseEntity<Map<String, Object>> createCreditCard(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a CreditCard and PostalAddress
     * <p>service: createCreditCardAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createCreditCardAndPostalAddress")
    public ResponseEntity<Map<String, Object>> createCreditCardAndAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create CreditCard
     * <p>service: createCreditCard  entities: CreditCard  auth: true
     */
    @PostMapping("/ordermgr/control/createCreditCardOrderEntry")
    public ResponseEntity<Map<String, Object>> createCreditCardCreateCreditCardOrderEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCustRequestContent  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustRequestContent")
    public ResponseEntity<CreateCustRequestContentResponse> createCustRequestContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCustRequestFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustRequestFromCart")
    public ResponseEntity<CreateCustRequestFromCartResponse> createCustRequestFromCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createCustRequestFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestFromShoppingList")
    public ResponseEntity<CreateCustRequestFromShoppingListResponse> createCustRequestFromShoppingList(@RequestBody CreateCustRequestFromShoppingListRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a CustRequestItemWorkEffort
     * <p>service: createWorkEffortRequestItem  entities: CustRequestItem, CustRequestItemWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestItemWorkEffort")
    public ResponseEntity<Map<String, Object>> createWorkEffortRequestItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CustRequestParty record
     * <p>service: createCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestParty")
    public ResponseEntity<CreateCustRequestPartyResponse> createCustRequestParty(@RequestBody CreateCustRequestPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCustomer  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustomer")
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create EftAccount
     * <p>service: createEftAccount  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createEftAccount")
    public ResponseEntity<Map<String, Object>> createEftAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an EftAccount and PostalAddress
     * <p>service: createEftAccountAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createEftAndPostalAddress")
    public ResponseEntity<Map<String, Object>> createEftAccountAndAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new order adjustment record
     * <p>service: createOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderAdjustment")
    public ResponseEntity<CreateOrderAdjustmentResponse> createOrderAdjustment(@RequestBody CreateOrderAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a order conversation
     * <p>service: createOrderConversation  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderConversation")
    public ResponseEntity<CreateOrderConversationResponse> createOrderConversation(@RequestBody CreateOrderConversationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a delivery schedule for the specified order
     * <p>service: createOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderDeliverySchedule")
    public ResponseEntity<CreateOrderDeliveryScheduleResponse> createOrderDeliverySchedule(@RequestBody CreateOrderDeliveryScheduleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create OrderHeader
     * <p>service: createOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderHeader")
    public ResponseEntity<CreateOrderHeaderResponse> createOrderHeader(@RequestBody CreateOrderHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new OrderItemShipGroup.
     * <p>service: createOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderItemShipGroup")
    public ResponseEntity<CreateOrderItemShipGroupResponse> createOrderItemShipGroup(@RequestBody CreateOrderItemShipGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Order Term
     * <p>service: createOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderTerm")
    public ResponseEntity<CreateOrderTermResponse> createOrderTerm(@RequestBody CreateOrderTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party ContactMech Purpose
     * <p>service: createPartyContactMechPurpose  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createPartyContactMechPurpose")
    public ResponseEntity<Map<String, Object>> createPartyContactMechPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a PartyGroup
     * <p>service: createPartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/ordermgr/control/createPartyGroup")
    public ResponseEntity<Map<String, Object>> createPartyGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/createPostalAddress")
    public ResponseEntity<Map<String, Object>> createPartyPostalAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/createPostalAddressAndPurpose")
    public ResponseEntity<Map<String, Object>> createPartyPostalAddressCreatePostalAddressAndPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Quote
     * <p>service: createQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/createQuote")
    public ResponseEntity<CreateQuoteResponse> createQuote(@RequestBody CreateQuoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote adjustment record
     * <p>service: createQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAdjustment")
    public ResponseEntity<CreateQuoteAdjustmentResponse> createQuoteAdjustment(@RequestBody CreateQuoteAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quote and Quote Item for a CustRequest
     * <p>service: createQuoteAndQuoteItemForRequest  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAndQuoteItemForRequest")
    public ResponseEntity<CreateQuoteAndQuoteItemForRequestResponse> createQuoteAndQuoteItemForRequest(@RequestBody CreateQuoteAndQuoteItemForRequestRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteAttribute
     * <p>service: createQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAttribute")
    public ResponseEntity<CreateQuoteAttributeResponse> createQuoteAttribute(@RequestBody CreateQuoteAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteCoefficient
     * <p>service: createQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteCoefficient")
    public ResponseEntity<CreateQuoteCoefficientResponse> createQuoteCoefficient(@RequestBody CreateQuoteCoefficientRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createQuoteFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createQuoteFromCart")
    public ResponseEntity<CreateQuoteFromCartResponse> createQuoteFromCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a customer request
     * <p>service: createQuoteFromCustRequest  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromCustRequest")
    public ResponseEntity<CreateQuoteFromCustRequestResponse> createQuoteFromCustRequest(@RequestBody CreateQuoteFromCustRequestRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createQuoteFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromShoppingList")
    public ResponseEntity<CreateQuoteFromShoppingListResponse> createQuoteFromShoppingList(@RequestBody CreateQuoteFromShoppingListRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItem")
    public ResponseEntity<CreateQuoteItemResponse> createQuoteItem(@RequestBody CreateQuoteItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItemForRequest")
    public ResponseEntity<CreateQuoteItemResponse> createQuoteItemCreateQuoteItemForRequest(@RequestBody CreateQuoteItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteRole
     * <p>service: createQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteRole")
    public ResponseEntity<CreateQuoteRoleResponse> createQuoteRole(@RequestBody CreateQuoteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTerm")
    public ResponseEntity<CreateQuoteTermResponse> createQuoteTerm(@RequestBody CreateQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTermFromItem")
    public ResponseEntity<CreateQuoteTermResponse> createQuoteTermCreateQuoteTermFromItem(@RequestBody CreateQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReplacementOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createReplacementOrder")
    public ResponseEntity<Map<String, Object>> createReplacementOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new requirement
     * <p>service: createRequirement  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createRequirement")
    public ResponseEntity<CreateRequirementResponse> createRequirement(@RequestBody CreateRequirementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new party role for the requirement
     * <p>service: createRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/createRequirementRole")
    public ResponseEntity<CreateRequirementRoleResponse> createRequirementRole(@RequestBody CreateRequirementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new ReturnHeader
     * <p>service: createReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createReturn")
    public ResponseEntity<CreateReturnHeaderResponse> createReturnHeader(@RequestBody CreateReturnHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createReturnItems")
    public ResponseEntity<CreateReturnItemOrAdjustmentResponse> createReturnItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createTransferFromRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createTransfersFromRequirements")
    public ResponseEntity<CreateTransferFromRequirementResponse> createTransferFromRequirement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note item and associate with a order header
     * <p>service: createOrderNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createordernote")
    public ResponseEntity<CreateOrderNoteResponse> createOrderNote(@RequestBody CreateOrderNoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note item and associate with a quote
     * <p>service: createQuoteNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createquotenote")
    public ResponseEntity<CreateQuoteNoteResponse> createQuoteNote(@RequestBody CreateQuoteNoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a custRequest record and optionally create a custRequest item.
     * <p>service: createCustRequest  entities: CustRequest, CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequest")
    public ResponseEntity<CreateCustRequestResponse> createCustRequest(@RequestBody CreateCustRequestRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CustRequestItem record
     * <p>service: createCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitem")
    public ResponseEntity<CreateCustRequestItemResponse> createCustRequestItem(@RequestBody CreateCustRequestItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note for a CustRequestItem
     * <p>service: createCustRequestItemNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitemnote")
    public ResponseEntity<CreateCustRequestItemNoteResponse> createCustRequestItemNote(@RequestBody CreateCustRequestItemNoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Allocation Plan Item
     * <p>service: deleteAllocationPlanItem  entities: AllocationPlanItem  auth: true
     */
    @PostMapping("/ordermgr/control/deleteAllocationPlanItem")
    public ResponseEntity<DeleteAllocationPlanItemResponse> deleteAllocationPlanItem(@RequestBody DeleteAllocationPlanItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deletes a CustRequestItemWorkEffort
     * <p>service: deleteWorkEffortRequestItem  entities: CustRequestItemWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustRequestItemWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortRequestItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a CustRequestParty record
     * <p>service: deleteCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustRequestParty")
    public ResponseEntity<DeleteCustRequestPartyResponse> deleteCustRequestParty(@RequestBody DeleteCustRequestPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PartyTaxAuthInfo
     * <p>service: deletePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustomerTaxAuthInfo")
    public ResponseEntity<Map<String, Object>> deletePartyTaxAuthInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an order adjustment record
     * <p>service: deleteOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/deleteOrderAdjustment")
    public ResponseEntity<DeleteOrderAdjustmentResponse> deleteOrderAdjustment(@RequestBody DeleteOrderAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTerm")
    public ResponseEntity<DeleteQuoteTermResponse> deleteQuoteTerm(@RequestBody DeleteQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTermFromItem")
    public ResponseEntity<DeleteQuoteTermResponse> deleteQuoteTermDeleteQuoteTermFromItem(@RequestBody DeleteQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a new QuoteWorkEffort
     * <p>service: deleteQuoteWorkEffort  entities: QuoteWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteWorkEffort")
    public ResponseEntity<DeleteQuoteWorkEffortResponse> deleteQuoteWorkEffort(@RequestBody DeleteQuoteWorkEffortRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a requirement after deleting related entity records.
     * <p>service: deleteRequirementAndRelated  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/deleteRequirement")
    public ResponseEntity<DeleteRequirementAndRelatedResponse> deleteRequirementAndRelated(@RequestBody DeleteRequirementAndRelatedRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: doManualPromotions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/doManualPromotions")
    public ResponseEntity<Map<String, Object>> doManualPromotions(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send a order confirmation
     * <p>service: sendOrderConfirmation  entities: unknown  auth: false
     */
    @PostMapping("/ordermgr/control/emailorder")
    public ResponseEntity<SendOrderConfirmationResponse> sendOrderConfirmation(@RequestBody SendOrderConfirmationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/emptycart")
    public ResponseEntity<Map<String, Object>> destroyCartEmptycart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new QuoteWorkEffort record and WorkEffort if needed
     * <p>service: ensureWorkEffortAndCreateQuoteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/ensureWorkEffortAndCreateQuoteWorkEffort")
    public ResponseEntity<EnsureWorkEffortAndCreateQuoteWorkEffortResponse> ensureWorkEffortAndCreateQuoteWorkEffort(@RequestBody EnsureWorkEffortAndCreateQuoteWorkEffortRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a Customer Request Content
     * <p>service: expireCustRequestContent  entities: CustRequestContent  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestContent")
    public ResponseEntity<ExpireCustRequestContentResponse> expireCustRequestContent(@RequestBody ExpireCustRequestContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expires a CustRequestParty record
     * <p>service: expireCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestParty")
    public ResponseEntity<ExpireCustRequestPartyResponse> expireCustRequestParty(@RequestBody ExpireCustRequestPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expires a Party Contact Mech Purpose
     * <p>service: expirePartyContactMechPurpose  entities: PartyContactMechPurpose  auth: true
     */
    @PostMapping("/ordermgr/control/expirePartyContactMechPurpose")
    public ResponseEntity<Map<String, Object>> expirePartyContactMechPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: failedDenylistCheck  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/failedDenylist")
    public ResponseEntity<Map<String, Object>> failedDenylistCheck(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: finalizeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/finalizeOrder")
    public ResponseEntity<Map<String, Object>> finalizeOrderEntry(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getConfigDetailsEvent  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/getConfigDetailsEvent")
    public ResponseEntity<Map<String, Object>> getConfigDetailsEvent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Get Inventory Availability for a Product constrained by a facilityId
     * <p>service: getInventoryAvailableByFacility  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/getProductInventoryAvailable")
    public ResponseEntity<Map<String, Object>> getInventoryAvailableByFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Get the return status associated with customer/vendor return
     * <p>service: getStatusItemsForReturn  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/getStatusItemsForReturn")
    public ResponseEntity<GetStatusItemsForReturnResponse> getStatusItemsForReturn(@RequestBody GetStatusItemsForReturnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: initializeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/initorderentry")
    public ResponseEntity<Map<String, Object>> initializeOrderEntry(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: checkDoKeywordOverride  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/keywordsearch")
    public ResponseEntity<Map<String, Object>> checkDoKeywordOverride(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartForReplacementOrder")
    public ResponseEntity<LoadCartFromOrderResponse> loadCartFromOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromOrder")
    public ResponseEntity<LoadCartFromOrderResponse> loadCartFromOrderLoadCartFromOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromQuote  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromQuote")
    public ResponseEntity<LoadCartFromQuoteResponse> loadCartFromQuote(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromShoppingList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromShoppingList")
    public ResponseEntity<LoadCartFromShoppingListResponse> loadCartFromShoppingList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReturnAndItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/makeQuickReturn")
    public ResponseEntity<CreateReturnAndItemOrAdjustmentResponse> createReturnAndItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/markOrderViewed")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeader(@RequestBody UpdateOrderHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massChangeOrderApproved  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massApproveOrders")
    public ResponseEntity<MassChangeOrderApprovedResponse> massChangeOrderApproved(@RequestBody MassChangeOrderApprovedRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCancelOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelOrders")
    public ResponseEntity<MassCancelOrdersResponse> massCancelOrders(@RequestBody MassCancelOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCancelRemainingPurchaseOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelRemainingPurchaseOrderItems")
    public ResponseEntity<MassCancelRemainingPurchaseOrderItemsResponse> massCancelRemainingPurchaseOrderItems(@RequestBody MassCancelRemainingPurchaseOrderItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCreateFileForOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCreateFileForOrders")
    public ResponseEntity<MassCreateFileForOrdersResponse> massCreateFileForOrders(@RequestBody MassCreateFileForOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massHoldOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massHoldOrders")
    public ResponseEntity<MassHoldOrdersResponse> massHoldOrders(@RequestBody MassHoldOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massPickOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPickOrders")
    public ResponseEntity<MassPickOrdersResponse> massPickOrders(@RequestBody MassPickOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massPrintOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPrintOrders")
    public ResponseEntity<MassPrintOrdersResponse> massPrintOrders(@RequestBody MassPrintOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massProcessOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massProcessOrders")
    public ResponseEntity<MassProcessOrdersResponse> massProcessOrders(@RequestBody MassProcessOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massQuickShipOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massQuickShipOrders")
    public ResponseEntity<MassQuickShipOrdersResponse> massQuickShipOrders(@RequestBody MassQuickShipOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massRejectOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massRejectOrders")
    public ResponseEntity<MassRejectOrdersResponse> massRejectOrders(@RequestBody MassRejectOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: modifyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/modifycart")
    public ResponseEntity<Map<String, Object>> modifyCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Print pick sheets for orders
     * <p>service: printPickSheets  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/orderPickSheet.pdf")
    public ResponseEntity<Map<String, Object>> printPickSheets(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: routeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/orderentry")
    public ResponseEntity<Map<String, Object>> routeOrderEntry(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/processorder")
    public ResponseEntity<Map<String, Object>> createOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: processPayment  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/processpayment")
    public ResponseEntity<Map<String, Object>> processPayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate ATP and QOH According For each facility
     * <p>service: productAvailabilityByFacility  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/productAvailabilityByFacility")
    public ResponseEntity<ProductAvailabilityByFacilityResponse> productAvailabilityByFacility(@RequestBody ProductAvailabilityByFacilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addToCartBulkRequirements  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickAddRequirementsToCart")
    public ResponseEntity<Map<String, Object>> addToCartBulkRequirementsQuickAddRequirementsToCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickCheckoutOrderWithDefaultOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickCheckoutOrderWithDefaultOptions")
    public ResponseEntity<Map<String, Object>> quickCheckoutOrderWithDefaultOptions(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a drop shipment for a ship group and calls updateShipment twice in succession to set shipment status to PURCH_SHIP_SHIPPED and then to PURCH_SHIP_RECEIVED
     * <p>service: quickDropShipOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickDropShipOrder")
    public ResponseEntity<Map<String, Object>> quickDropShipOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickInitPurchaseOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickPurchaseOrderEntry")
    public ResponseEntity<Map<String, Object>> quickInitPurchaseOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick Return Order
     * <p>service: quickReturnOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickRefundOrder")
    public ResponseEntity<QuickReturnOrderResponse> quickReturnOrder(@RequestBody QuickReturnOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick Ships An Entire Order Creating One Shipment Per Facility and Ship Group. All approved order items are automatically issued in full and put into one package. The shipment is created in the INPUT status and then updated to PACKED and SHIPPED.
     * <p>service: quickShipEntireOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickShipOrder")
    public ResponseEntity<Map<String, Object>> quickShipEntireOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Adjust the order tax amount
     * <p>service: recalcTaxTotal  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/recalcTax")
    public ResponseEntity<RecalcTaxTotalResponse> recalcTaxTotal(@RequestBody RecalcTaxTotalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveOfflinePayment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/receiveOfflinePayments")
    public ResponseEntity<Map<String, Object>> receiveOfflinePayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeAdditionalParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeAdditionalParty")
    public ResponseEntity<Map<String, Object>> removeAdditionalParty(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeOrderTerm  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeCartOrderTerm")
    public ResponseEntity<RemoveOrderTermResponse> removeOrderTerm(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeProductFromComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeFromCompare")
    public ResponseEntity<Map<String, Object>> removeProductFromComparisonList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an Order Term
     * <p>service: removeOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/removeOrderTerm")
    public ResponseEntity<RemoveOrderTermResponse> removeOrderTermRemoveOrderTerm(@RequestBody RemoveOrderTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removePromotion  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removePromotion")
    public ResponseEntity<Map<String, Object>> removePromotion(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteAdjustment
     * <p>service: removeQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteAdjustment")
    public ResponseEntity<RemoveQuoteAdjustmentResponse> removeQuoteAdjustment(@RequestBody RemoveQuoteAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteAttribute
     * <p>service: removeQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteAttribute")
    public ResponseEntity<RemoveQuoteAttributeResponse> removeQuoteAttribute(@RequestBody RemoveQuoteAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteCoefficient
     * <p>service: removeQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteCoefficient")
    public ResponseEntity<RemoveQuoteCoefficientResponse> removeQuoteCoefficient(@RequestBody RemoveQuoteCoefficientRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteItem
     * <p>service: removeQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteItem")
    public ResponseEntity<RemoveQuoteItemResponse> removeQuoteItem(@RequestBody RemoveQuoteItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteRole
     * <p>service: removeQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteRole")
    public ResponseEntity<RemoveQuoteRoleResponse> removeQuoteRole(@RequestBody RemoveQuoteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a RequirementRole
     * <p>service: removeRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeRequirementRole")
    public ResponseEntity<RemoveRequirementRoleResponse> removeRequirementRole(@RequestBody RemoveRequirementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Simple remove service
     * <p>service: removeReturnAdjustment  entities: ReturnAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnAdjustment")
    public ResponseEntity<RemoveReturnAdjustmentResponse> removeReturnAdjustment(@RequestBody RemoveReturnAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ReturnItem and related adjustments
     * <p>service: removeReturnItem  entities: ReturnItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnItem")
    public ResponseEntity<RemoveReturnItemResponse> removeReturnItem(@RequestBody RemoveReturnItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Uses dynamic view entity to find orders; returns a list of Order (OrderHeader) objects
     * <p>service: findOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/searchorders")
    public ResponseEntity<FindOrdersResponse> findOrders(@RequestBody FindOrdersRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send Purchase Order Email
     * <p>service: sendPOEmail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendPOEmail")
    public ResponseEntity<SendPOEmailResponse> sendPOEmail(@RequestBody SendPOEmailRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send a quote report mail
     * <p>service: sendQuoteReportMail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendQuoteReportMail")
    public ResponseEntity<SendQuoteReportMailResponse> sendQuoteReportMail(@RequestBody SendQuoteReportMailRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send E-Mail Service. partyId and communicationEventId aren't used by sendMail but are passed down to storeEmailAsCommunication during the SECA chain. See sendMailInterface for more comments.
     * <p>service: sendMail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendconfirmationmail")
    public ResponseEntity<Map<String, Object>> sendMail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setCurrentSearchFromHistory  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setCurrentSearchFromHistory")
    public ResponseEntity<Map<String, Object>> setCurrentSearchFromHistory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setCurrentSearchFromHistory  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setCurrentSearchFromHistoryAndSearch")
    public ResponseEntity<Map<String, Object>> setCurrentSearchFromHistorySetCurrentSearchFromHistoryAndSearch(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Customer Request Status
     * <p>service: setCustRequestStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setCustRequestStatus")
    public ResponseEntity<SetCustRequestStatusResponse> setCustRequestStatus(@RequestBody SetCustRequestStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setDesiredAlternateGwpProductId  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/setDesiredAlternateGwpProductId")
    public ResponseEntity<Map<String, Object>> setDesiredAlternateGwpProductId(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Gift message for an order
     * <p>service: setGiftMessage  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setGiftMessage")
    public ResponseEntity<SetGiftMessageResponse> setGiftMessage(@RequestBody SetGiftMessageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/setInvoicePerShipment")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeaderSetInvoicePerShipment(@RequestBody UpdateOrderHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: selectAgreement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderAgreement")
    public ResponseEntity<Map<String, Object>> selectAgreement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setCurrency  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderCurrency")
    public ResponseEntity<Map<String, Object>> setCurrency(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setOrderCurrencyAgreementShipDates  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderCurrencyAgreementShipDates")
    public ResponseEntity<Map<String, Object>> setOrderCurrencyAgreementShipDates(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setOrderName  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderName")
    public ResponseEntity<Map<String, Object>> setOrderName(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * set order priority
     * <p>service: setOrderReservationPriority  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setOrderReservationPriority")
    public ResponseEntity<Map<String, Object>> setOrderReservationPriority(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setPoNumber  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setPoNumber")
    public ResponseEntity<Map<String, Object>> setPoNumber(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the shipping instructions for an order
     * <p>service: setShippingInstructions  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setShippingInstructions")
    public ResponseEntity<SetShippingInstructionsResponse> setShippingInstructions(@RequestBody SetShippingInstructionsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Allocation Plan Items
     * <p>service: updateAllocationPlanItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateAllocationPlanItems")
    public ResponseEntity<UpdateAllocationPlanItemsResponse> updateAllocationPlanItems(@RequestBody UpdateAllocationPlanItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setPartialCheckOutOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateCheckoutOptions")
    public ResponseEntity<Map<String, Object>> setPartialCheckOutOptions(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateCreditCard")
    public ResponseEntity<Map<String, Object>> updateCreditCard(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a CreditCard and PostalAddress
     * <p>service: updateCreditCardAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateCreditCardAndPostalAddress")
    public ResponseEntity<Map<String, Object>> updateCreditCardAndAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update CustRequestParty record
     * <p>service: updateCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/updateCustRequestParty")
    public ResponseEntity<UpdateCustRequestPartyResponse> updateCustRequestParty(@RequestBody UpdateCustRequestPartyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates an EftAccount and PostalAddress
     * <p>service: updateEftAccountAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateEftAndPostalAddress")
    public ResponseEntity<Map<String, Object>> updateEftAccountAndAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an order adjustment record
     * <p>service: updateOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderAdjustment")
    public ResponseEntity<UpdateOrderAdjustmentResponse> updateOrderAdjustment(@RequestBody UpdateOrderAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Order Contact Mech
     * <p>service: updateOrderContactMech  entities: OrderContactMech  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderContactMech")
    public ResponseEntity<UpdateOrderContactMechResponse> updateOrderContactMech(@RequestBody UpdateOrderContactMechRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing delivery schedule for a specified purchase order
     * <p>service: updateOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderDeliverySchedule")
    public ResponseEntity<UpdateOrderDeliveryScheduleResponse> updateOrderDeliverySchedule(@RequestBody UpdateOrderDeliveryScheduleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderHeader")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeaderUpdateOrderHeader(@RequestBody UpdateOrderHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates OrderItemShipGroup. The shipmentMethod field is of the format ${shipmentMethodTypeId}@${carrierPartyId}
     * <p>service: updateOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItemShipGroup")
    public ResponseEntity<UpdateOrderItemShipGroupResponse> updateOrderItemShipGroup(@RequestBody UpdateOrderItemShipGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the quantities/prices for an existing order
     * <p>service: updateOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItems")
    public ResponseEntity<UpdateOrderItemsResponse> updateOrderItems(@RequestBody UpdateOrderItemsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderNote  entities: OrderHeaderNote  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderNote")
    public ResponseEntity<UpdateOrderNoteResponse> updateOrderNote(@RequestBody UpdateOrderNoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateOrderPaymentPreference  entities: OrderPaymentPreference  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderPaymentPreference")
    public ResponseEntity<UpdateOrderPaymentPreferenceResponse> updateOrderPaymentPreference(@RequestBody UpdateOrderPaymentPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Order Term
     * <p>service: updateOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderTerm")
    public ResponseEntity<UpdateOrderTermResponse> updateOrderTerm(@RequestBody UpdateOrderTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Postal Address
     * <p>service: updatePartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/updatePostalAddress")
    public ResponseEntity<Map<String, Object>> updatePartyPostalAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Postal Address
     * <p>service: updatePartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/updatePostalAddressOrderEntry")
    public ResponseEntity<Map<String, Object>> updatePartyPostalAddressUpdatePostalAddressOrderEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Quote
     * <p>service: updateQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuote")
    public ResponseEntity<UpdateQuoteResponse> updateQuote(@RequestBody UpdateQuoteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteAdjustment
     * <p>service: updateQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAdjustment")
    public ResponseEntity<UpdateQuoteAdjustmentResponse> updateQuoteAdjustment(@RequestBody UpdateQuoteAdjustmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteAttribute
     * <p>service: updateQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAttribute")
    public ResponseEntity<UpdateQuoteAttributeResponse> updateQuoteAttribute(@RequestBody UpdateQuoteAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteCoefficient
     * <p>service: updateQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteCoefficient")
    public ResponseEntity<UpdateQuoteCoefficientResponse> updateQuoteCoefficient(@RequestBody UpdateQuoteCoefficientRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItem")
    public ResponseEntity<UpdateQuoteItemResponse> updateQuoteItem(@RequestBody UpdateQuoteItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItemForRequest")
    public ResponseEntity<UpdateQuoteItemResponse> updateQuoteItemUpdateQuoteItemForRequest(@RequestBody UpdateQuoteItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a note record
     * <p>service: updateNote  entities: NoteData  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteNote")
    public ResponseEntity<Map<String, Object>> updateNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteRole
     * <p>service: updateQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteRole")
    public ResponseEntity<UpdateQuoteRoleResponse> updateQuoteRole(@RequestBody UpdateQuoteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTerm")
    public ResponseEntity<UpdateQuoteTermResponse> updateQuoteTerm(@RequestBody UpdateQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTermFromItem")
    public ResponseEntity<UpdateQuoteTermResponse> updateQuoteTermUpdateQuoteTermFromItem(@RequestBody UpdateQuoteTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteWorkEffort")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing requirement
     * <p>service: updateRequirement  entities: Requirement  auth: true
     */
    @PostMapping("/ordermgr/control/updateRequirement")
    public ResponseEntity<UpdateRequirementResponse> updateRequirement(@RequestBody UpdateRequirementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a RequirementRole
     * <p>service: updateRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/updateRequirementRole")
    public ResponseEntity<UpdateRequirementRoleResponse> updateRequirementRole(@RequestBody UpdateRequirementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ReturnHeader
     * <p>service: updateReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateReturn")
    public ResponseEntity<UpdateReturnHeaderResponse> updateReturnHeader(@RequestBody UpdateReturnHeaderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateReturnItems")
    public ResponseEntity<UpdateReturnItemOrAdjustmentResponse> updateReturnItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Shipping Information on Order View
     * <p>service: updateShipGroupShipInfo  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShipGroupShipInfo")
    public ResponseEntity<UpdateShipGroupShipInfoResponse> updateShipGroupShipInfo(@RequestBody UpdateShipGroupShipInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingAddress")
    public ResponseEntity<SetCartShippingAddressResponse> setCartShippingAddress(@RequestBody SetCartShippingAddressRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Compare order's shipping amount and new shipping amount(based on weight and dimension of packages).If new shipping amount is more then or less than default percentage (defined in shipment.properties) of Order's shipping amount, then shipping method and shipping charges are updated. And if new shipping amount is not more then or less than default percentage (defined in shipment.properties)% of Order's shipping amount then only shipping method is updated.Also updates record in ShipmentRouteSegment entity
     * <p>service: updateShippingMethodAndCharges  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingMethodAndCharges")
    public ResponseEntity<UpdateShippingMethodAndChargesResponse> updateShippingMethodAndCharges(@RequestBody UpdateShippingMethodAndChargesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingOptions  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingOptions")
    public ResponseEntity<SetCartShippingOptionsResponse> setCartShippingOptions(@RequestBody SetCartShippingOptionsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the tracking number on a shipment preference
     * <p>service: updateTrackingNumber  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateTrackingNumber")
    public ResponseEntity<UpdateTrackingNumberResponse> updateTrackingNumber(@RequestBody UpdateTrackingNumberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a custRequest record
     * <p>service: updateCustRequest  entities: CustRequest  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequest")
    public ResponseEntity<UpdateCustRequestResponse> updateCustRequest(@RequestBody UpdateCustRequestRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CustRequestItem record
     * <p>service: updateCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequestitem")
    public ResponseEntity<UpdateCustRequestItemResponse> updateCustRequestItem(@RequestBody UpdateCustRequestItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Assign a ShoppingCartItem -> Quantity to a ship group
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updatesplit")
    public ResponseEntity<AssignItemShipGroupResponse> assignItemShipGroupUpdatesplit(@RequestBody AssignItemShipGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Email UPS Retrun Label
     * <p>service: upsEmailReturnLabel  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/ordermgr/control/upsEmailReturnLabelOrder")
    public ResponseEntity<Map<String, Object>> upsEmailReturnLabel(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Email UPS Retrun Label
     * <p>service: upsEmailReturnLabel  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/ordermgr/control/upsEmailReturnLabelReturn")
    public ResponseEntity<Map<String, Object>> upsEmailReturnLabelUpsEmailReturnLabelReturn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: checkPaymentMethods  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/validatePaymentMethodsBeforePayment")
    public ResponseEntity<Map<String, Object>> checkPaymentMethods(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
