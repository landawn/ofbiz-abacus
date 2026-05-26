package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.util.ServiceInput;
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

    private final com.landawn.ofbiz.service.OrderService service;

    public OrderController(com.landawn.ofbiz.service.OrderService service) {
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
     * Creates a new OrderItemShipGroup with maySplit and isGift filled.
     * <p>service: addOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroup")
    public ResponseEntity<AddOrderItemShipGroupResponse> addOrderItemShipGroup(@RequestBody AddOrderItemShipGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.addOrderItemShipGroup(ServiceInput.toMap(request));
        return wrap(result, AddOrderItemShipGroupResponse::new);
    }

    /**
     * add Order Item Ship Group Assoc and if order item ship group not exit, create it before
     * <p>service: addOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroupAssoc")
    public ResponseEntity<AddOrderItemShipGroupAssocResponse> addOrderItemShipGroupAssoc(@RequestBody AddOrderItemShipGroupAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.addOrderItemShipGroupAssoc(ServiceInput.toMap(request));
        return wrap(result, AddOrderItemShipGroupAssocResponse::new);
    }

    /**
     * No description.
     * <p>service: bulkAddProducts  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/BulkAddProducts")
    public ResponseEntity<Map<String, Object>> bulkAddProducts(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.bulkAddProducts(java.util.Map.copyOf(params)));
    }

    /**
     * delete Order Item Ship Group
     * <p>service: deleteOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/DeleteOrderItemShipGroup")
    public ResponseEntity<DeleteOrderItemShipGroupResponse> deleteOrderItemShipGroup(@RequestBody DeleteOrderItemShipGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteOrderItemShipGroup(ServiceInput.toMap(request));
        return wrap(result, DeleteOrderItemShipGroupResponse::new);
    }

    /**
     * delete Order Item Ship Group Assoc
     * <p>service: deleteOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/DeleteOrderItemShipGroupAssoc")
    public ResponseEntity<DeleteOrderItemShipGroupAssocResponse> deleteOrderItemShipGroupAssoc(@RequestBody DeleteOrderItemShipGroupAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteOrderItemShipGroupAssoc(ServiceInput.toMap(request));
        return wrap(result, DeleteOrderItemShipGroupAssocResponse::new);
    }

    /**
     * No description.
     * <p>service: updateOrderItemShipGroupAssoc  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/UpdateOrderItemShipGroupAssoc")
    public ResponseEntity<UpdateOrderItemShipGroupAssocResponse> updateOrderItemShipGroupAssoc(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderItemShipGroupAssoc(java.util.Map.copyOf(params));
        return wrap(result, UpdateOrderItemShipGroupAssocResponse::new);
    }

    /**
     * No description.
     * <p>service: addAdditionalParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addAdditionalParty")
    public ResponseEntity<Map<String, Object>> addAdditionalParty(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addAdditionalParty(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addListToCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addAllFromShoppingList")
    public ResponseEntity<Map<String, Object>> addListToCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addListToCart(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addBulkFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addBulkToShoppingList")
    public ResponseEntity<Map<String, Object>> addBulkFromCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addBulkFromCart(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addCategoryDefaults  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/addCategoryDefaults")
    public ResponseEntity<Map<String, Object>> addCategoryDefaults(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addCategoryDefaults(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createSurveyResponseAndRestoreParameters  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addGiftCertificateSurvey")
    public ResponseEntity<Map<String, Object>> createSurveyResponseAndRestoreParameters(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createSurveyResponseAndRestoreParameters(java.util.Map.copyOf(params)));
    }

    /**
     * Create a shopping list item
     * <p>service: createShoppingListItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addItemToShoppingList")
    public ResponseEntity<CreateShoppingListItemResponse> createShoppingListItem(@RequestBody CreateShoppingListItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createShoppingListItem(ServiceInput.toMap(request));
        return wrap(result, CreateShoppingListItemResponse::new);
    }

    /**
     * Upload and attach a file to an order
     * <p>service: uploadOrderContentFile  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addOrderAttachments")
    public ResponseEntity<UploadOrderContentFileResponse> uploadOrderContentFile(@RequestBody UploadOrderContentFileRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.uploadOrderContentFile(ServiceInput.toMap(request));
        return wrap(result, UploadOrderContentFileResponse::new);
    }

    /**
     * No description.
     * <p>service: addOrderTerm  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addOrderTerm")
    public ResponseEntity<Map<String, Object>> addOrderTerm(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addOrderTerm(java.util.Map.copyOf(params)));
    }

    /**
     * Add Payment Method to Order.From this servicewe will call the createOrderPaymentPreference service to create OrderPaymentPreference
     * <p>service: addPaymentMethodToOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addPaymentMethodToOrder")
    public ResponseEntity<AddPaymentMethodToOrderResponse> addPaymentMethodToOrder(@RequestBody AddPaymentMethodToOrderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.addPaymentMethodToOrder(ServiceInput.toMap(request));
        return wrap(result, AddPaymentMethodToOrderResponse::new);
    }

    /**
     * No description.
     * <p>service: addToCartBulkRequirements  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addRequirementsToCart")
    public ResponseEntity<Map<String, Object>> addToCartBulkRequirements(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addToCartBulkRequirements(java.util.Map.copyOf(params)));
    }

    /**
     * Creates new shipping address and update existing address
     * <p>service: createUpdateShippingAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addShippingAddress")
    public ResponseEntity<CreateUpdateShippingAddressResponse> createUpdateShippingAddress(@RequestBody CreateUpdateShippingAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createUpdateShippingAddress(ServiceInput.toMap(request));
        return wrap(result, CreateUpdateShippingAddressResponse::new);
    }

    /**
     * No description.
     * <p>service: addProductToComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addToCompare")
    public ResponseEntity<Map<String, Object>> addProductToComparisonList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addProductToComparisonList(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addToCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/additem")
    public ResponseEntity<Map<String, Object>> addToCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addToCart(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createSurveyResponseAndRestoreParameters  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/additemsurvey")
    public ResponseEntity<Map<String, Object>> createSurveyResponseAndRestoreParametersAdditemsurvey(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createSurveyResponseAndRestoreParameters(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addProductPromoCode  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addpromocode")
    public ResponseEntity<Map<String, Object>> addProductPromoCode(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addProductPromoCode(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addSeparator  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addseperator")
    public ResponseEntity<Map<String, Object>> addSeparator(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addSeparator(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: addToCartBulk  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/addtocartbulk")
    public ResponseEntity<Map<String, Object>> addToCartBulk(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addToCartBulk(java.util.Map.copyOf(params)));
    }

    /**
     * Set the Allow Split Flag To 'Y' (true)
     * <p>service: setAllowOrderSplit  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/allowordersplit")
    public ResponseEntity<SetAllowOrderSplitResponse> setAllowOrderSplit(@RequestBody SetAllowOrderSplitRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setAllowOrderSplit(ServiceInput.toMap(request));
        return wrap(result, SetAllowOrderSplitResponse::new);
    }

    /**
     * Append an item to an existing order
     * <p>service: appendOrderItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/appendItemToOrder")
    public ResponseEntity<AppendOrderItemResponse> appendOrderItem(@RequestBody AppendOrderItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.appendOrderItem(ServiceInput.toMap(request));
        return wrap(result, AppendOrderItemResponse::new);
    }

    /**
     * No description.
     * <p>service: approveRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/approveRequirements")
    public ResponseEntity<ApproveRequirementResponse> approveRequirement(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.approveRequirement(java.util.Map.copyOf(params));
        return wrap(result, ApproveRequirementResponse::new);
    }

    /**
     * No description.
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/assignItemToShipGroups")
    public ResponseEntity<AssignItemShipGroupResponse> assignItemShipGroup(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.assignItemShipGroup(java.util.Map.copyOf(params));
        return wrap(result, AssignItemShipGroupResponse::new);
    }

    /**
     * Process (authorizes/re-authorizes) a single payment for an order with an optional overrideAmount
     * <p>service: authOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/authOrderPayment")
    public ResponseEntity<Map<String, Object>> authOrderPaymentPreference(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.authOrderPaymentPreference(body));
    }

    /**
     * If the requirement is a product requirement (purchasing) try to assign it to the primary supplier
     * <p>service: autoAssignRequirementToSupplier  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/autoAssignRequirementToSupplier")
    public ResponseEntity<AutoAssignRequirementToSupplierResponse> autoAssignRequirementToSupplier(@RequestBody AutoAssignRequirementToSupplierRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.autoAssignRequirementToSupplier(ServiceInput.toMap(request));
        return wrap(result, AutoAssignRequirementToSupplierResponse::new);
    }

    /**
     * Remove all existing quote adjustments, recalc them and persist in QuoteAdjustment.
     * <p>service: autoCreateQuoteAdjustments  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/autoCreateQuoteAdjustments")
    public ResponseEntity<AutoCreateQuoteAdjustmentsResponse> autoCreateQuoteAdjustments(@RequestBody AutoCreateQuoteAdjustmentsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.autoCreateQuoteAdjustments(ServiceInput.toMap(request));
        return wrap(result, AutoCreateQuoteAdjustmentsResponse::new);
    }

    /**
     * No description.
     * <p>service: autoUpdateQuotePrice  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/autoUpdateQuotePrices")
    public ResponseEntity<AutoUpdateQuotePriceResponse> autoUpdateQuotePrice(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.autoUpdateQuotePrice(java.util.Map.copyOf(params));
        return wrap(result, AutoUpdateQuotePriceResponse::new);
    }

    /**
     * Balance inventory items based on the new item specified which will have available inventory that back-order (negative ATP) reservations can be reassigned to.
     * <p>service: balanceInventoryItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/balanceInventoryItems")
    public ResponseEntity<Map<String, Object>> balanceInventoryItems(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.balanceInventoryItems(body));
    }

    /**
     * No description.
     * <p>service: bulkAddProductsInApprovedOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/bulkAddProductsInApprovedOrder")
    public ResponseEntity<Map<String, Object>> bulkAddProductsInApprovedOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.bulkAddProductsInApprovedOrder(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: getShipEstimate  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcShipping")
    public ResponseEntity<Map<String, Object>> getShipEstimate(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.getShipEstimate(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: getShipEstimate  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcShippingBeforePayment")
    public ResponseEntity<Map<String, Object>> getShipEstimateCalcShippingBeforePayment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.getShipEstimate(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: calcTax  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcTax")
    public ResponseEntity<Map<String, Object>> calcTax(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.calcTax(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: calcTax  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/calcTaxBeforePayment")
    public ResponseEntity<Map<String, Object>> calcTaxCalcTaxBeforePayment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.calcTax(java.util.Map.copyOf(params)));
    }

    /**
     * Cancel an Order Item Quantity
     * <p>service: cancelOrderItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/cancelOrderItem")
    public ResponseEntity<CancelOrderItemResponse> cancelOrderItem(@RequestBody CancelOrderItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.cancelOrderItem(ServiceInput.toMap(request));
        return wrap(result, CancelOrderItemResponse::new);
    }

    /**
     * No description.
     * <p>service: cancelSelectedOrderItems  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/cancelSelectedOrderItems")
    public ResponseEntity<Map<String, Object>> cancelSelectedOrderItems(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.cancelSelectedOrderItems(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setCartShipToCustomerParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/cartUpdateShipToCustomerParty")
    public ResponseEntity<Map<String, Object>> setCartShipToCustomerParty(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setCartShipToCustomerParty(java.util.Map.copyOf(params)));
    }

    /**
     * Change Allocation Plan Status
     * <p>service: changeAllocationPlanStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeAllocationPlanStatus")
    public ResponseEntity<ChangeAllocationPlanStatusResponse> changeAllocationPlanStatus(@RequestBody ChangeAllocationPlanStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeAllocationPlanStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeAllocationPlanStatusResponse::new);
    }

    /**
     * Change the status of an existing order item. If no orderItemSeqId is specified, the status of all order items will be changed.
     * <p>service: changeOrderItemStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderItemStatus")
    public ResponseEntity<ChangeOrderItemStatusResponse> changeOrderItemStatus(@RequestBody ChangeOrderItemStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeOrderItemStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeOrderItemStatusResponse::new);
    }

    /**
     * Change the status of an existing order
     * <p>service: changeOrderStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderStatus")
    public ResponseEntity<ChangeOrderStatusResponse> changeOrderStatus(@RequestBody ChangeOrderStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeOrderStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeOrderStatusResponse::new);
    }

    /**
     * No description.
     * <p>service: checkOrderDenylist  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/checkDenyList")
    public ResponseEntity<Map<String, Object>> checkOrderDenylist(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.checkOrderDenylist(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setQuickCheckOutOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/checkout")
    public ResponseEntity<Map<String, Object>> setQuickCheckOutOptions(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setQuickCheckOutOptions(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearCartForReplacementOrder")
    public ResponseEntity<Map<String, Object>> destroyCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.destroyCart(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: clearProductComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearCompareList")
    public ResponseEntity<Map<String, Object>> clearProductComparisonList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.clearProductComparisonList(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: clearSearchOptionsHistoryList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearSearchOptionsHistoryList")
    public ResponseEntity<Map<String, Object>> clearSearchOptionsHistoryList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.clearSearchOptionsHistoryList(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/clearcart")
    public ResponseEntity<Map<String, Object>> destroyCartClearcart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.destroyCart(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/clearpocart")
    public ResponseEntity<Map<String, Object>> destroyCartClearpocart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.destroyCart(java.util.Map.copyOf(params)));
    }

    /**
     * Completes a purchase order by cancelling remaining (unreceived) item quantities and generating new product requirements from those quantities
     * <p>service: completePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/completePurchaseOrder")
    public ResponseEntity<CompletePurchaseOrderResponse> completePurchaseOrder(@RequestBody CompletePurchaseOrderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.completePurchaseOrder(ServiceInput.toMap(request));
        return wrap(result, CompletePurchaseOrderResponse::new);
    }

    /**
     * Copy a CustRequest
     * <p>service: copyCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/copyCustRequestItem")
    public ResponseEntity<CopyCustRequestItemResponse> copyCustRequestItem(@RequestBody CopyCustRequestItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.copyCustRequestItem(ServiceInput.toMap(request));
        return wrap(result, CopyCustRequestItemResponse::new);
    }

    /**
     * Copy a Quote
     * <p>service: copyQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/copyQuote")
    public ResponseEntity<CopyQuoteResponse> copyQuote(@RequestBody CopyQuoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.copyQuote(ServiceInput.toMap(request));
        return wrap(result, CopyQuoteResponse::new);
    }

    /**
     * Create Allocation Plan And Items
     * <p>service: createAllocationPlanAndItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createAllocationPlanAndItems")
    public ResponseEntity<CreateAllocationPlanAndItemsResponse> createAllocationPlanAndItems(@RequestBody CreateAllocationPlanAndItemsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createAllocationPlanAndItems(ServiceInput.toMap(request));
        return wrap(result, CreateAllocationPlanAndItemsResponse::new);
    }

    /**
     * No description.
     * <p>service: createCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCreditCard")
    public ResponseEntity<Map<String, Object>> createCreditCard(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCreditCard(java.util.Map.copyOf(params)));
    }

    /**
     * Creates a CreditCard and PostalAddress
     * <p>service: createCreditCardAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createCreditCardAndPostalAddress")
    public ResponseEntity<Map<String, Object>> createCreditCardAndAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCreditCardAndAddress(body));
    }

    /**
     * Create CreditCard
     * <p>service: createCreditCard  entities: CreditCard  auth: true
     */
    @PostMapping("/ordermgr/control/createCreditCardOrderEntry")
    public ResponseEntity<Map<String, Object>> createCreditCardCreateCreditCardOrderEntry(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCreditCard(body));
    }

    /**
     * No description.
     * <p>service: createCustRequestContent  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustRequestContent")
    public ResponseEntity<CreateCustRequestContentResponse> createCustRequestContent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestContent(java.util.Map.copyOf(params));
        return wrap(result, CreateCustRequestContentResponse::new);
    }

    /**
     * No description.
     * <p>service: createCustRequestFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustRequestFromCart")
    public ResponseEntity<CreateCustRequestFromCartResponse> createCustRequestFromCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestFromCart(java.util.Map.copyOf(params));
        return wrap(result, CreateCustRequestFromCartResponse::new);
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createCustRequestFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestFromShoppingList")
    public ResponseEntity<CreateCustRequestFromShoppingListResponse> createCustRequestFromShoppingList(@RequestBody CreateCustRequestFromShoppingListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestFromShoppingList(ServiceInput.toMap(request));
        return wrap(result, CreateCustRequestFromShoppingListResponse::new);
    }

    /**
     * Creates a CustRequestItemWorkEffort
     * <p>service: createWorkEffortRequestItem  entities: CustRequestItem, CustRequestItemWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestItemWorkEffort")
    public ResponseEntity<Map<String, Object>> createWorkEffortRequestItem(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortRequestItem(body));
    }

    /**
     * Create a CustRequestParty record
     * <p>service: createCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestParty")
    public ResponseEntity<CreateCustRequestPartyResponse> createCustRequestParty(@RequestBody CreateCustRequestPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestParty(ServiceInput.toMap(request));
        return wrap(result, CreateCustRequestPartyResponse::new);
    }

    /**
     * No description.
     * <p>service: createCustomer  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustomer")
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCustomer(java.util.Map.copyOf(params)));
    }

    /**
     * Create EftAccount
     * <p>service: createEftAccount  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createEftAccount")
    public ResponseEntity<Map<String, Object>> createEftAccount(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createEftAccount(body));
    }

    /**
     * Creates an EftAccount and PostalAddress
     * <p>service: createEftAccountAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createEftAndPostalAddress")
    public ResponseEntity<Map<String, Object>> createEftAccountAndAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createEftAccountAndAddress(body));
    }

    /**
     * Creates a new order adjustment record
     * <p>service: createOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderAdjustment")
    public ResponseEntity<CreateOrderAdjustmentResponse> createOrderAdjustment(@RequestBody CreateOrderAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderAdjustment(ServiceInput.toMap(request));
        return wrap(result, CreateOrderAdjustmentResponse::new);
    }

    /**
     * Create a order conversation
     * <p>service: createOrderConversation  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderConversation")
    public ResponseEntity<CreateOrderConversationResponse> createOrderConversation(@RequestBody CreateOrderConversationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderConversation(ServiceInput.toMap(request));
        return wrap(result, CreateOrderConversationResponse::new);
    }

    /**
     * Creates a delivery schedule for the specified order
     * <p>service: createOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderDeliverySchedule")
    public ResponseEntity<CreateOrderDeliveryScheduleResponse> createOrderDeliverySchedule(@RequestBody CreateOrderDeliveryScheduleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderDeliverySchedule(ServiceInput.toMap(request));
        return wrap(result, CreateOrderDeliveryScheduleResponse::new);
    }

    /**
     * Create OrderHeader
     * <p>service: createOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderHeader")
    public ResponseEntity<CreateOrderHeaderResponse> createOrderHeader(@RequestBody CreateOrderHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderHeader(ServiceInput.toMap(request));
        return wrap(result, CreateOrderHeaderResponse::new);
    }

    /**
     * Creates a new OrderItemShipGroup.
     * <p>service: createOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderItemShipGroup")
    public ResponseEntity<CreateOrderItemShipGroupResponse> createOrderItemShipGroup(@RequestBody CreateOrderItemShipGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderItemShipGroup(ServiceInput.toMap(request));
        return wrap(result, CreateOrderItemShipGroupResponse::new);
    }

    /**
     * Create an Order Term
     * <p>service: createOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderTerm")
    public ResponseEntity<CreateOrderTermResponse> createOrderTerm(@RequestBody CreateOrderTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderTerm(ServiceInput.toMap(request));
        return wrap(result, CreateOrderTermResponse::new);
    }

    /**
     * Create a Party ContactMech Purpose
     * <p>service: createPartyContactMechPurpose  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createPartyContactMechPurpose")
    public ResponseEntity<Map<String, Object>> createPartyContactMechPurpose(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyContactMechPurpose(body));
    }

    /**
     * Create a PartyGroup
     * <p>service: createPartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/ordermgr/control/createPartyGroup")
    public ResponseEntity<Map<String, Object>> createPartyGroup(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyGroup(body));
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/createPostalAddress")
    public ResponseEntity<Map<String, Object>> createPartyPostalAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyPostalAddress(body));
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/createPostalAddressAndPurpose")
    public ResponseEntity<Map<String, Object>> createPartyPostalAddressCreatePostalAddressAndPurpose(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyPostalAddress(body));
    }

    /**
     * Create an Quote
     * <p>service: createQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/createQuote")
    public ResponseEntity<CreateQuoteResponse> createQuote(@RequestBody CreateQuoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuote(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteResponse::new);
    }

    /**
     * Creates a new quote adjustment record
     * <p>service: createQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAdjustment")
    public ResponseEntity<CreateQuoteAdjustmentResponse> createQuoteAdjustment(@RequestBody CreateQuoteAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteAdjustment(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteAdjustmentResponse::new);
    }

    /**
     * Create a new Quote and Quote Item for a CustRequest
     * <p>service: createQuoteAndQuoteItemForRequest  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAndQuoteItemForRequest")
    public ResponseEntity<CreateQuoteAndQuoteItemForRequestResponse> createQuoteAndQuoteItemForRequest(@RequestBody CreateQuoteAndQuoteItemForRequestRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteAndQuoteItemForRequest(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteAndQuoteItemForRequestResponse::new);
    }

    /**
     * Create a QuoteAttribute
     * <p>service: createQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAttribute")
    public ResponseEntity<CreateQuoteAttributeResponse> createQuoteAttribute(@RequestBody CreateQuoteAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteAttribute(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteAttributeResponse::new);
    }

    /**
     * Create a QuoteCoefficient
     * <p>service: createQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteCoefficient")
    public ResponseEntity<CreateQuoteCoefficientResponse> createQuoteCoefficient(@RequestBody CreateQuoteCoefficientRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteCoefficient(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteCoefficientResponse::new);
    }

    /**
     * No description.
     * <p>service: createQuoteFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createQuoteFromCart")
    public ResponseEntity<CreateQuoteFromCartResponse> createQuoteFromCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteFromCart(java.util.Map.copyOf(params));
        return wrap(result, CreateQuoteFromCartResponse::new);
    }

    /**
     * Creates a new quote from a customer request
     * <p>service: createQuoteFromCustRequest  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromCustRequest")
    public ResponseEntity<CreateQuoteFromCustRequestResponse> createQuoteFromCustRequest(@RequestBody CreateQuoteFromCustRequestRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteFromCustRequest(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteFromCustRequestResponse::new);
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createQuoteFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromShoppingList")
    public ResponseEntity<CreateQuoteFromShoppingListResponse> createQuoteFromShoppingList(@RequestBody CreateQuoteFromShoppingListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteFromShoppingList(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteFromShoppingListResponse::new);
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItem")
    public ResponseEntity<CreateQuoteItemResponse> createQuoteItem(@RequestBody CreateQuoteItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteItem(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteItemResponse::new);
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItemForRequest")
    public ResponseEntity<CreateQuoteItemResponse> createQuoteItemCreateQuoteItemForRequest(@RequestBody CreateQuoteItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteItem(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteItemResponse::new);
    }

    /**
     * Create a QuoteRole
     * <p>service: createQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteRole")
    public ResponseEntity<CreateQuoteRoleResponse> createQuoteRole(@RequestBody CreateQuoteRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteRole(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteRoleResponse::new);
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTerm")
    public ResponseEntity<CreateQuoteTermResponse> createQuoteTerm(@RequestBody CreateQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteTermResponse::new);
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTermFromItem")
    public ResponseEntity<CreateQuoteTermResponse> createQuoteTermCreateQuoteTermFromItem(@RequestBody CreateQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteTermResponse::new);
    }

    /**
     * No description.
     * <p>service: createReplacementOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createReplacementOrder")
    public ResponseEntity<Map<String, Object>> createReplacementOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createReplacementOrder(java.util.Map.copyOf(params)));
    }

    /**
     * Create a new requirement
     * <p>service: createRequirement  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createRequirement")
    public ResponseEntity<CreateRequirementResponse> createRequirement(@RequestBody CreateRequirementRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createRequirement(ServiceInput.toMap(request));
        return wrap(result, CreateRequirementResponse::new);
    }

    /**
     * Creates a new party role for the requirement
     * <p>service: createRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/createRequirementRole")
    public ResponseEntity<CreateRequirementRoleResponse> createRequirementRole(@RequestBody CreateRequirementRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createRequirementRole(ServiceInput.toMap(request));
        return wrap(result, CreateRequirementRoleResponse::new);
    }

    /**
     * Create a new ReturnHeader
     * <p>service: createReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createReturn")
    public ResponseEntity<CreateReturnHeaderResponse> createReturnHeader(@RequestBody CreateReturnHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createReturnHeader(ServiceInput.toMap(request));
        return wrap(result, CreateReturnHeaderResponse::new);
    }

    /**
     * No description.
     * <p>service: createReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createReturnItems")
    public ResponseEntity<CreateReturnItemOrAdjustmentResponse> createReturnItemOrAdjustment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createReturnItemOrAdjustment(java.util.Map.copyOf(params));
        return wrap(result, CreateReturnItemOrAdjustmentResponse::new);
    }

    /**
     * No description.
     * <p>service: createTransferFromRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createTransfersFromRequirements")
    public ResponseEntity<CreateTransferFromRequirementResponse> createTransferFromRequirement(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createTransferFromRequirement(java.util.Map.copyOf(params));
        return wrap(result, CreateTransferFromRequirementResponse::new);
    }

    /**
     * Create a note item and associate with a order header
     * <p>service: createOrderNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createordernote")
    public ResponseEntity<CreateOrderNoteResponse> createOrderNote(@RequestBody CreateOrderNoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createOrderNote(ServiceInput.toMap(request));
        return wrap(result, CreateOrderNoteResponse::new);
    }

    /**
     * Create a note item and associate with a quote
     * <p>service: createQuoteNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createquotenote")
    public ResponseEntity<CreateQuoteNoteResponse> createQuoteNote(@RequestBody CreateQuoteNoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createQuoteNote(ServiceInput.toMap(request));
        return wrap(result, CreateQuoteNoteResponse::new);
    }

    /**
     * Create a custRequest record and optionally create a custRequest item.
     * <p>service: createCustRequest  entities: CustRequest, CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequest")
    public ResponseEntity<CreateCustRequestResponse> createCustRequest(@RequestBody CreateCustRequestRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequest(ServiceInput.toMap(request));
        return wrap(result, CreateCustRequestResponse::new);
    }

    /**
     * Create a CustRequestItem record
     * <p>service: createCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitem")
    public ResponseEntity<CreateCustRequestItemResponse> createCustRequestItem(@RequestBody CreateCustRequestItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestItem(ServiceInput.toMap(request));
        return wrap(result, CreateCustRequestItemResponse::new);
    }

    /**
     * Create a note for a CustRequestItem
     * <p>service: createCustRequestItemNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitemnote")
    public ResponseEntity<CreateCustRequestItemNoteResponse> createCustRequestItemNote(@RequestBody CreateCustRequestItemNoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCustRequestItemNote(ServiceInput.toMap(request));
        return wrap(result, CreateCustRequestItemNoteResponse::new);
    }

    /**
     * Delete Allocation Plan Item
     * <p>service: deleteAllocationPlanItem  entities: AllocationPlanItem  auth: true
     */
    @PostMapping("/ordermgr/control/deleteAllocationPlanItem")
    public ResponseEntity<DeleteAllocationPlanItemResponse> deleteAllocationPlanItem(@RequestBody DeleteAllocationPlanItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteAllocationPlanItem(ServiceInput.toMap(request));
        return wrap(result, DeleteAllocationPlanItemResponse::new);
    }

    /**
     * Deletes a CustRequestItemWorkEffort
     * <p>service: deleteWorkEffortRequestItem  entities: CustRequestItemWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustRequestItemWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortRequestItem(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteWorkEffortRequestItem(body));
    }

    /**
     * Delete a CustRequestParty record
     * <p>service: deleteCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustRequestParty")
    public ResponseEntity<DeleteCustRequestPartyResponse> deleteCustRequestParty(@RequestBody DeleteCustRequestPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteCustRequestParty(ServiceInput.toMap(request));
        return wrap(result, DeleteCustRequestPartyResponse::new);
    }

    /**
     * Delete PartyTaxAuthInfo
     * <p>service: deletePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/ordermgr/control/deleteCustomerTaxAuthInfo")
    public ResponseEntity<Map<String, Object>> deletePartyTaxAuthInfo(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deletePartyTaxAuthInfo(body));
    }

    /**
     * Delete an order adjustment record
     * <p>service: deleteOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/deleteOrderAdjustment")
    public ResponseEntity<DeleteOrderAdjustmentResponse> deleteOrderAdjustment(@RequestBody DeleteOrderAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteOrderAdjustment(ServiceInput.toMap(request));
        return wrap(result, DeleteOrderAdjustmentResponse::new);
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTerm")
    public ResponseEntity<DeleteQuoteTermResponse> deleteQuoteTerm(@RequestBody DeleteQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, DeleteQuoteTermResponse::new);
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTermFromItem")
    public ResponseEntity<DeleteQuoteTermResponse> deleteQuoteTermDeleteQuoteTermFromItem(@RequestBody DeleteQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, DeleteQuoteTermResponse::new);
    }

    /**
     * Delete a new QuoteWorkEffort
     * <p>service: deleteQuoteWorkEffort  entities: QuoteWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteWorkEffort")
    public ResponseEntity<DeleteQuoteWorkEffortResponse> deleteQuoteWorkEffort(@RequestBody DeleteQuoteWorkEffortRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteQuoteWorkEffort(ServiceInput.toMap(request));
        return wrap(result, DeleteQuoteWorkEffortResponse::new);
    }

    /**
     * Delete a requirement after deleting related entity records.
     * <p>service: deleteRequirementAndRelated  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/deleteRequirement")
    public ResponseEntity<DeleteRequirementAndRelatedResponse> deleteRequirementAndRelated(@RequestBody DeleteRequirementAndRelatedRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteRequirementAndRelated(ServiceInput.toMap(request));
        return wrap(result, DeleteRequirementAndRelatedResponse::new);
    }

    /**
     * No description.
     * <p>service: doManualPromotions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/doManualPromotions")
    public ResponseEntity<Map<String, Object>> doManualPromotions(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.doManualPromotions(java.util.Map.copyOf(params)));
    }

    /**
     * Send a order confirmation
     * <p>service: sendOrderConfirmation  entities: unknown  auth: false
     */
    @PostMapping("/ordermgr/control/emailorder")
    public ResponseEntity<SendOrderConfirmationResponse> sendOrderConfirmation(@RequestBody SendOrderConfirmationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.sendOrderConfirmation(ServiceInput.toMap(request));
        return wrap(result, SendOrderConfirmationResponse::new);
    }

    /**
     * No description.
     * <p>service: destroyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/emptycart")
    public ResponseEntity<Map<String, Object>> destroyCartEmptycart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.destroyCart(java.util.Map.copyOf(params)));
    }

    /**
     * Creates a new QuoteWorkEffort record and WorkEffort if needed
     * <p>service: ensureWorkEffortAndCreateQuoteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/ensureWorkEffortAndCreateQuoteWorkEffort")
    public ResponseEntity<EnsureWorkEffortAndCreateQuoteWorkEffortResponse> ensureWorkEffortAndCreateQuoteWorkEffort(@RequestBody EnsureWorkEffortAndCreateQuoteWorkEffortRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.ensureWorkEffortAndCreateQuoteWorkEffort(ServiceInput.toMap(request));
        return wrap(result, EnsureWorkEffortAndCreateQuoteWorkEffortResponse::new);
    }

    /**
     * Expire a Customer Request Content
     * <p>service: expireCustRequestContent  entities: CustRequestContent  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestContent")
    public ResponseEntity<ExpireCustRequestContentResponse> expireCustRequestContent(@RequestBody ExpireCustRequestContentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.expireCustRequestContent(ServiceInput.toMap(request));
        return wrap(result, ExpireCustRequestContentResponse::new);
    }

    /**
     * Expires a CustRequestParty record
     * <p>service: expireCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestParty")
    public ResponseEntity<ExpireCustRequestPartyResponse> expireCustRequestParty(@RequestBody ExpireCustRequestPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.expireCustRequestParty(ServiceInput.toMap(request));
        return wrap(result, ExpireCustRequestPartyResponse::new);
    }

    /**
     * Expires a Party Contact Mech Purpose
     * <p>service: expirePartyContactMechPurpose  entities: PartyContactMechPurpose  auth: true
     */
    @PostMapping("/ordermgr/control/expirePartyContactMechPurpose")
    public ResponseEntity<Map<String, Object>> expirePartyContactMechPurpose(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.expirePartyContactMechPurpose(body));
    }

    /**
     * No description.
     * <p>service: failedDenylistCheck  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/failedDenylist")
    public ResponseEntity<Map<String, Object>> failedDenylistCheck(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.failedDenylistCheck(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: finalizeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/finalizeOrder")
    public ResponseEntity<Map<String, Object>> finalizeOrderEntry(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.finalizeOrderEntry(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: getConfigDetailsEvent  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/getConfigDetailsEvent")
    public ResponseEntity<Map<String, Object>> getConfigDetailsEvent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.getConfigDetailsEvent(java.util.Map.copyOf(params)));
    }

    /**
     * Get Inventory Availability for a Product constrained by a facilityId
     * <p>service: getInventoryAvailableByFacility  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/getProductInventoryAvailable")
    public ResponseEntity<Map<String, Object>> getInventoryAvailableByFacility(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.getInventoryAvailableByFacility(body));
    }

    /**
     * Get the return status associated with customer/vendor return
     * <p>service: getStatusItemsForReturn  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/getStatusItemsForReturn")
    public ResponseEntity<GetStatusItemsForReturnResponse> getStatusItemsForReturn(@RequestBody GetStatusItemsForReturnRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.getStatusItemsForReturn(ServiceInput.toMap(request));
        return wrap(result, GetStatusItemsForReturnResponse::new);
    }

    /**
     * No description.
     * <p>service: initializeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/initorderentry")
    public ResponseEntity<Map<String, Object>> initializeOrderEntry(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.initializeOrderEntry(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: checkDoKeywordOverride  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/keywordsearch")
    public ResponseEntity<Map<String, Object>> checkDoKeywordOverride(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.checkDoKeywordOverride(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: loadCartFromOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartForReplacementOrder")
    public ResponseEntity<LoadCartFromOrderResponse> loadCartFromOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.loadCartFromOrder(java.util.Map.copyOf(params));
        return wrap(result, LoadCartFromOrderResponse::new);
    }

    /**
     * No description.
     * <p>service: loadCartFromOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromOrder")
    public ResponseEntity<LoadCartFromOrderResponse> loadCartFromOrderLoadCartFromOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.loadCartFromOrder(java.util.Map.copyOf(params));
        return wrap(result, LoadCartFromOrderResponse::new);
    }

    /**
     * No description.
     * <p>service: loadCartFromQuote  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromQuote")
    public ResponseEntity<LoadCartFromQuoteResponse> loadCartFromQuote(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.loadCartFromQuote(java.util.Map.copyOf(params));
        return wrap(result, LoadCartFromQuoteResponse::new);
    }

    /**
     * No description.
     * <p>service: loadCartFromShoppingList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromShoppingList")
    public ResponseEntity<LoadCartFromShoppingListResponse> loadCartFromShoppingList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.loadCartFromShoppingList(java.util.Map.copyOf(params));
        return wrap(result, LoadCartFromShoppingListResponse::new);
    }

    /**
     * No description.
     * <p>service: createReturnAndItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/makeQuickReturn")
    public ResponseEntity<CreateReturnAndItemOrAdjustmentResponse> createReturnAndItemOrAdjustment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createReturnAndItemOrAdjustment(java.util.Map.copyOf(params));
        return wrap(result, CreateReturnAndItemOrAdjustmentResponse::new);
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/markOrderViewed")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeader(@RequestBody UpdateOrderHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderHeader(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderHeaderResponse::new);
    }

    /**
     * No description.
     * <p>service: massChangeOrderApproved  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massApproveOrders")
    public ResponseEntity<MassChangeOrderApprovedResponse> massChangeOrderApproved(@RequestBody MassChangeOrderApprovedRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massChangeOrderApproved(ServiceInput.toMap(request));
        return wrap(result, MassChangeOrderApprovedResponse::new);
    }

    /**
     * No description.
     * <p>service: massCancelOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelOrders")
    public ResponseEntity<MassCancelOrdersResponse> massCancelOrders(@RequestBody MassCancelOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massCancelOrders(ServiceInput.toMap(request));
        return wrap(result, MassCancelOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massCancelRemainingPurchaseOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelRemainingPurchaseOrderItems")
    public ResponseEntity<MassCancelRemainingPurchaseOrderItemsResponse> massCancelRemainingPurchaseOrderItems(@RequestBody MassCancelRemainingPurchaseOrderItemsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massCancelRemainingPurchaseOrderItems(ServiceInput.toMap(request));
        return wrap(result, MassCancelRemainingPurchaseOrderItemsResponse::new);
    }

    /**
     * No description.
     * <p>service: massCreateFileForOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCreateFileForOrders")
    public ResponseEntity<MassCreateFileForOrdersResponse> massCreateFileForOrders(@RequestBody MassCreateFileForOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massCreateFileForOrders(ServiceInput.toMap(request));
        return wrap(result, MassCreateFileForOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massHoldOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massHoldOrders")
    public ResponseEntity<MassHoldOrdersResponse> massHoldOrders(@RequestBody MassHoldOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massHoldOrders(ServiceInput.toMap(request));
        return wrap(result, MassHoldOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massPickOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPickOrders")
    public ResponseEntity<MassPickOrdersResponse> massPickOrders(@RequestBody MassPickOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massPickOrders(ServiceInput.toMap(request));
        return wrap(result, MassPickOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massPrintOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPrintOrders")
    public ResponseEntity<MassPrintOrdersResponse> massPrintOrders(@RequestBody MassPrintOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massPrintOrders(ServiceInput.toMap(request));
        return wrap(result, MassPrintOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massProcessOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massProcessOrders")
    public ResponseEntity<MassProcessOrdersResponse> massProcessOrders(@RequestBody MassProcessOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massProcessOrders(ServiceInput.toMap(request));
        return wrap(result, MassProcessOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massQuickShipOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massQuickShipOrders")
    public ResponseEntity<MassQuickShipOrdersResponse> massQuickShipOrders(@RequestBody MassQuickShipOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massQuickShipOrders(ServiceInput.toMap(request));
        return wrap(result, MassQuickShipOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: massRejectOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massRejectOrders")
    public ResponseEntity<MassRejectOrdersResponse> massRejectOrders(@RequestBody MassRejectOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.massRejectOrders(ServiceInput.toMap(request));
        return wrap(result, MassRejectOrdersResponse::new);
    }

    /**
     * No description.
     * <p>service: modifyCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/modifycart")
    public ResponseEntity<Map<String, Object>> modifyCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.modifyCart(java.util.Map.copyOf(params)));
    }

    /**
     * Print pick sheets for orders
     * <p>service: printPickSheets  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/orderPickSheet.pdf")
    public ResponseEntity<Map<String, Object>> printPickSheets(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.printPickSheets(body));
    }

    /**
     * No description.
     * <p>service: routeOrderEntry  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/orderentry")
    public ResponseEntity<Map<String, Object>> routeOrderEntry(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.routeOrderEntry(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/processorder")
    public ResponseEntity<Map<String, Object>> createOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createOrder(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: processPayment  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/processpayment")
    public ResponseEntity<Map<String, Object>> processPayment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.processPayment(java.util.Map.copyOf(params)));
    }

    /**
     * Calculate ATP and QOH According For each facility
     * <p>service: productAvailabilityByFacility  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/productAvailabilityByFacility")
    public ResponseEntity<ProductAvailabilityByFacilityResponse> productAvailabilityByFacility(@RequestBody ProductAvailabilityByFacilityRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.productAvailabilityByFacility(ServiceInput.toMap(request));
        return wrap(result, ProductAvailabilityByFacilityResponse::new);
    }

    /**
     * No description.
     * <p>service: addToCartBulkRequirements  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickAddRequirementsToCart")
    public ResponseEntity<Map<String, Object>> addToCartBulkRequirementsQuickAddRequirementsToCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addToCartBulkRequirements(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: quickCheckoutOrderWithDefaultOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickCheckoutOrderWithDefaultOptions")
    public ResponseEntity<Map<String, Object>> quickCheckoutOrderWithDefaultOptions(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.quickCheckoutOrderWithDefaultOptions(java.util.Map.copyOf(params)));
    }

    /**
     * Creates a drop shipment for a ship group and calls updateShipment twice in succession to set shipment status to PURCH_SHIP_SHIPPED and then to PURCH_SHIP_RECEIVED
     * <p>service: quickDropShipOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickDropShipOrder")
    public ResponseEntity<Map<String, Object>> quickDropShipOrder(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.quickDropShipOrder(body));
    }

    /**
     * No description.
     * <p>service: quickInitPurchaseOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/quickPurchaseOrderEntry")
    public ResponseEntity<Map<String, Object>> quickInitPurchaseOrder(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.quickInitPurchaseOrder(java.util.Map.copyOf(params)));
    }

    /**
     * Quick Return Order
     * <p>service: quickReturnOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickRefundOrder")
    public ResponseEntity<QuickReturnOrderResponse> quickReturnOrder(@RequestBody QuickReturnOrderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickReturnOrder(ServiceInput.toMap(request));
        return wrap(result, QuickReturnOrderResponse::new);
    }

    /**
     * Quick Ships An Entire Order Creating One Shipment Per Facility and Ship Group. All approved order items are automatically issued in full and put into one package. The shipment is created in the INPUT status and then updated to PACKED and SHIPPED.
     * <p>service: quickShipEntireOrder  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/quickShipOrder")
    public ResponseEntity<Map<String, Object>> quickShipEntireOrder(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.quickShipEntireOrder(body));
    }

    /**
     * Adjust the order tax amount
     * <p>service: recalcTaxTotal  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/recalcTax")
    public ResponseEntity<RecalcTaxTotalResponse> recalcTaxTotal(@RequestBody RecalcTaxTotalRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.recalcTaxTotal(ServiceInput.toMap(request));
        return wrap(result, RecalcTaxTotalResponse::new);
    }

    /**
     * No description.
     * <p>service: receiveOfflinePayment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/receiveOfflinePayments")
    public ResponseEntity<Map<String, Object>> receiveOfflinePayment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.receiveOfflinePayment(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: removeAdditionalParty  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeAdditionalParty")
    public ResponseEntity<Map<String, Object>> removeAdditionalParty(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.removeAdditionalParty(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: removeOrderTerm  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeCartOrderTerm")
    public ResponseEntity<RemoveOrderTermResponse> removeOrderTerm(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.removeOrderTerm(java.util.Map.copyOf(params));
        return wrap(result, RemoveOrderTermResponse::new);
    }

    /**
     * No description.
     * <p>service: removeProductFromComparisonList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removeFromCompare")
    public ResponseEntity<Map<String, Object>> removeProductFromComparisonList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.removeProductFromComparisonList(java.util.Map.copyOf(params)));
    }

    /**
     * Remove an Order Term
     * <p>service: removeOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/removeOrderTerm")
    public ResponseEntity<RemoveOrderTermResponse> removeOrderTermRemoveOrderTerm(@RequestBody RemoveOrderTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeOrderTerm(ServiceInput.toMap(request));
        return wrap(result, RemoveOrderTermResponse::new);
    }

    /**
     * No description.
     * <p>service: removePromotion  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/removePromotion")
    public ResponseEntity<Map<String, Object>> removePromotion(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.removePromotion(java.util.Map.copyOf(params)));
    }

    /**
     * Remove a QuoteAdjustment
     * <p>service: removeQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteAdjustment")
    public ResponseEntity<RemoveQuoteAdjustmentResponse> removeQuoteAdjustment(@RequestBody RemoveQuoteAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeQuoteAdjustment(ServiceInput.toMap(request));
        return wrap(result, RemoveQuoteAdjustmentResponse::new);
    }

    /**
     * Remove a QuoteAttribute
     * <p>service: removeQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteAttribute")
    public ResponseEntity<RemoveQuoteAttributeResponse> removeQuoteAttribute(@RequestBody RemoveQuoteAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeQuoteAttribute(ServiceInput.toMap(request));
        return wrap(result, RemoveQuoteAttributeResponse::new);
    }

    /**
     * Remove a QuoteCoefficient
     * <p>service: removeQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteCoefficient")
    public ResponseEntity<RemoveQuoteCoefficientResponse> removeQuoteCoefficient(@RequestBody RemoveQuoteCoefficientRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeQuoteCoefficient(ServiceInput.toMap(request));
        return wrap(result, RemoveQuoteCoefficientResponse::new);
    }

    /**
     * Remove a QuoteItem
     * <p>service: removeQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteItem")
    public ResponseEntity<RemoveQuoteItemResponse> removeQuoteItem(@RequestBody RemoveQuoteItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeQuoteItem(ServiceInput.toMap(request));
        return wrap(result, RemoveQuoteItemResponse::new);
    }

    /**
     * Remove a QuoteRole
     * <p>service: removeQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteRole")
    public ResponseEntity<RemoveQuoteRoleResponse> removeQuoteRole(@RequestBody RemoveQuoteRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeQuoteRole(ServiceInput.toMap(request));
        return wrap(result, RemoveQuoteRoleResponse::new);
    }

    /**
     * Remove a RequirementRole
     * <p>service: removeRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeRequirementRole")
    public ResponseEntity<RemoveRequirementRoleResponse> removeRequirementRole(@RequestBody RemoveRequirementRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeRequirementRole(ServiceInput.toMap(request));
        return wrap(result, RemoveRequirementRoleResponse::new);
    }

    /**
     * Simple remove service
     * <p>service: removeReturnAdjustment  entities: ReturnAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnAdjustment")
    public ResponseEntity<RemoveReturnAdjustmentResponse> removeReturnAdjustment(@RequestBody RemoveReturnAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeReturnAdjustment(ServiceInput.toMap(request));
        return wrap(result, RemoveReturnAdjustmentResponse::new);
    }

    /**
     * Remove a ReturnItem and related adjustments
     * <p>service: removeReturnItem  entities: ReturnItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnItem")
    public ResponseEntity<RemoveReturnItemResponse> removeReturnItem(@RequestBody RemoveReturnItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeReturnItem(ServiceInput.toMap(request));
        return wrap(result, RemoveReturnItemResponse::new);
    }

    /**
     * Uses dynamic view entity to find orders; returns a list of Order (OrderHeader) objects
     * <p>service: findOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/searchorders")
    public ResponseEntity<FindOrdersResponse> findOrders(@RequestBody FindOrdersRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.findOrders(ServiceInput.toMap(request));
        return wrap(result, FindOrdersResponse::new);
    }

    /**
     * Send Purchase Order Email
     * <p>service: sendPOEmail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendPOEmail")
    public ResponseEntity<SendPOEmailResponse> sendPOEmail(@RequestBody SendPOEmailRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.sendPOEmail(ServiceInput.toMap(request));
        return wrap(result, SendPOEmailResponse::new);
    }

    /**
     * Send a quote report mail
     * <p>service: sendQuoteReportMail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendQuoteReportMail")
    public ResponseEntity<SendQuoteReportMailResponse> sendQuoteReportMail(@RequestBody SendQuoteReportMailRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.sendQuoteReportMail(ServiceInput.toMap(request));
        return wrap(result, SendQuoteReportMailResponse::new);
    }

    /**
     * Send E-Mail Service. partyId and communicationEventId aren't used by sendMail but are passed down to storeEmailAsCommunication during the SECA chain. See sendMailInterface for more comments.
     * <p>service: sendMail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendconfirmationmail")
    public ResponseEntity<Map<String, Object>> sendMail(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.sendMail(body));
    }

    /**
     * No description.
     * <p>service: setCurrentSearchFromHistory  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setCurrentSearchFromHistory")
    public ResponseEntity<Map<String, Object>> setCurrentSearchFromHistory(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setCurrentSearchFromHistory(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setCurrentSearchFromHistory  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setCurrentSearchFromHistoryAndSearch")
    public ResponseEntity<Map<String, Object>> setCurrentSearchFromHistorySetCurrentSearchFromHistoryAndSearch(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setCurrentSearchFromHistory(java.util.Map.copyOf(params)));
    }

    /**
     * Set the Customer Request Status
     * <p>service: setCustRequestStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setCustRequestStatus")
    public ResponseEntity<SetCustRequestStatusResponse> setCustRequestStatus(@RequestBody SetCustRequestStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setCustRequestStatus(ServiceInput.toMap(request));
        return wrap(result, SetCustRequestStatusResponse::new);
    }

    /**
     * No description.
     * <p>service: setDesiredAlternateGwpProductId  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/setDesiredAlternateGwpProductId")
    public ResponseEntity<Map<String, Object>> setDesiredAlternateGwpProductId(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setDesiredAlternateGwpProductId(java.util.Map.copyOf(params)));
    }

    /**
     * Set Gift message for an order
     * <p>service: setGiftMessage  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setGiftMessage")
    public ResponseEntity<SetGiftMessageResponse> setGiftMessage(@RequestBody SetGiftMessageRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setGiftMessage(ServiceInput.toMap(request));
        return wrap(result, SetGiftMessageResponse::new);
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/setInvoicePerShipment")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeaderSetInvoicePerShipment(@RequestBody UpdateOrderHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderHeader(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderHeaderResponse::new);
    }

    /**
     * No description.
     * <p>service: selectAgreement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderAgreement")
    public ResponseEntity<Map<String, Object>> selectAgreement(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.selectAgreement(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setCurrency  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderCurrency")
    public ResponseEntity<Map<String, Object>> setCurrency(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setCurrency(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setOrderCurrencyAgreementShipDates  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderCurrencyAgreementShipDates")
    public ResponseEntity<Map<String, Object>> setOrderCurrencyAgreementShipDates(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setOrderCurrencyAgreementShipDates(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: setOrderName  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setOrderName")
    public ResponseEntity<Map<String, Object>> setOrderName(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setOrderName(java.util.Map.copyOf(params)));
    }

    /**
     * set order priority
     * <p>service: setOrderReservationPriority  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setOrderReservationPriority")
    public ResponseEntity<Map<String, Object>> setOrderReservationPriority(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.setOrderReservationPriority(body));
    }

    /**
     * No description.
     * <p>service: setPoNumber  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/setPoNumber")
    public ResponseEntity<Map<String, Object>> setPoNumber(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setPoNumber(java.util.Map.copyOf(params)));
    }

    /**
     * Set the shipping instructions for an order
     * <p>service: setShippingInstructions  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/setShippingInstructions")
    public ResponseEntity<SetShippingInstructionsResponse> setShippingInstructions(@RequestBody SetShippingInstructionsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setShippingInstructions(ServiceInput.toMap(request));
        return wrap(result, SetShippingInstructionsResponse::new);
    }

    /**
     * Update Allocation Plan Items
     * <p>service: updateAllocationPlanItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateAllocationPlanItems")
    public ResponseEntity<UpdateAllocationPlanItemsResponse> updateAllocationPlanItems(@RequestBody UpdateAllocationPlanItemsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateAllocationPlanItems(ServiceInput.toMap(request));
        return wrap(result, UpdateAllocationPlanItemsResponse::new);
    }

    /**
     * No description.
     * <p>service: setPartialCheckOutOptions  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateCheckoutOptions")
    public ResponseEntity<Map<String, Object>> setPartialCheckOutOptions(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.setPartialCheckOutOptions(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: updateCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateCreditCard")
    public ResponseEntity<Map<String, Object>> updateCreditCard(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateCreditCard(java.util.Map.copyOf(params)));
    }

    /**
     * Updates a CreditCard and PostalAddress
     * <p>service: updateCreditCardAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateCreditCardAndPostalAddress")
    public ResponseEntity<Map<String, Object>> updateCreditCardAndAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateCreditCardAndAddress(body));
    }

    /**
     * Update CustRequestParty record
     * <p>service: updateCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/updateCustRequestParty")
    public ResponseEntity<UpdateCustRequestPartyResponse> updateCustRequestParty(@RequestBody UpdateCustRequestPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCustRequestParty(ServiceInput.toMap(request));
        return wrap(result, UpdateCustRequestPartyResponse::new);
    }

    /**
     * Updates an EftAccount and PostalAddress
     * <p>service: updateEftAccountAndAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateEftAndPostalAddress")
    public ResponseEntity<Map<String, Object>> updateEftAccountAndAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateEftAccountAndAddress(body));
    }

    /**
     * Update an order adjustment record
     * <p>service: updateOrderAdjustment  entities: OrderAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderAdjustment")
    public ResponseEntity<UpdateOrderAdjustmentResponse> updateOrderAdjustment(@RequestBody UpdateOrderAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderAdjustment(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderAdjustmentResponse::new);
    }

    /**
     * Update Order Contact Mech
     * <p>service: updateOrderContactMech  entities: OrderContactMech  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderContactMech")
    public ResponseEntity<UpdateOrderContactMechResponse> updateOrderContactMech(@RequestBody UpdateOrderContactMechRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderContactMech(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderContactMechResponse::new);
    }

    /**
     * Update an existing delivery schedule for a specified purchase order
     * <p>service: updateOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderDeliverySchedule")
    public ResponseEntity<UpdateOrderDeliveryScheduleResponse> updateOrderDeliverySchedule(@RequestBody UpdateOrderDeliveryScheduleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderDeliverySchedule(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderDeliveryScheduleResponse::new);
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderHeader")
    public ResponseEntity<UpdateOrderHeaderResponse> updateOrderHeaderUpdateOrderHeader(@RequestBody UpdateOrderHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderHeader(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderHeaderResponse::new);
    }

    /**
     * Updates OrderItemShipGroup. The shipmentMethod field is of the format ${shipmentMethodTypeId}@${carrierPartyId}
     * <p>service: updateOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItemShipGroup")
    public ResponseEntity<UpdateOrderItemShipGroupResponse> updateOrderItemShipGroup(@RequestBody UpdateOrderItemShipGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderItemShipGroup(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderItemShipGroupResponse::new);
    }

    /**
     * Update the quantities/prices for an existing order
     * <p>service: updateOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItems")
    public ResponseEntity<UpdateOrderItemsResponse> updateOrderItems(@RequestBody UpdateOrderItemsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderItems(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderItemsResponse::new);
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderNote  entities: OrderHeaderNote  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderNote")
    public ResponseEntity<UpdateOrderNoteResponse> updateOrderNote(@RequestBody UpdateOrderNoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderNote(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderNoteResponse::new);
    }

    /**
     * No description.
     * <p>service: updateOrderPaymentPreference  entities: OrderPaymentPreference  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderPaymentPreference")
    public ResponseEntity<UpdateOrderPaymentPreferenceResponse> updateOrderPaymentPreference(@RequestBody UpdateOrderPaymentPreferenceRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderPaymentPreference(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderPaymentPreferenceResponse::new);
    }

    /**
     * Update an Order Term
     * <p>service: updateOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderTerm")
    public ResponseEntity<UpdateOrderTermResponse> updateOrderTerm(@RequestBody UpdateOrderTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateOrderTerm(ServiceInput.toMap(request));
        return wrap(result, UpdateOrderTermResponse::new);
    }

    /**
     * Update a Postal Address
     * <p>service: updatePartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/updatePostalAddress")
    public ResponseEntity<Map<String, Object>> updatePartyPostalAddress(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyPostalAddress(body));
    }

    /**
     * Update a Postal Address
     * <p>service: updatePartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/ordermgr/control/updatePostalAddressOrderEntry")
    public ResponseEntity<Map<String, Object>> updatePartyPostalAddressUpdatePostalAddressOrderEntry(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyPostalAddress(body));
    }

    /**
     * Update a Quote
     * <p>service: updateQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuote")
    public ResponseEntity<UpdateQuoteResponse> updateQuote(@RequestBody UpdateQuoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuote(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteResponse::new);
    }

    /**
     * Update a QuoteAdjustment
     * <p>service: updateQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAdjustment")
    public ResponseEntity<UpdateQuoteAdjustmentResponse> updateQuoteAdjustment(@RequestBody UpdateQuoteAdjustmentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteAdjustment(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteAdjustmentResponse::new);
    }

    /**
     * Update a QuoteAttribute
     * <p>service: updateQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAttribute")
    public ResponseEntity<UpdateQuoteAttributeResponse> updateQuoteAttribute(@RequestBody UpdateQuoteAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteAttribute(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteAttributeResponse::new);
    }

    /**
     * Update a QuoteCoefficient
     * <p>service: updateQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteCoefficient")
    public ResponseEntity<UpdateQuoteCoefficientResponse> updateQuoteCoefficient(@RequestBody UpdateQuoteCoefficientRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteCoefficient(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteCoefficientResponse::new);
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItem")
    public ResponseEntity<UpdateQuoteItemResponse> updateQuoteItem(@RequestBody UpdateQuoteItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteItem(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteItemResponse::new);
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItemForRequest")
    public ResponseEntity<UpdateQuoteItemResponse> updateQuoteItemUpdateQuoteItemForRequest(@RequestBody UpdateQuoteItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteItem(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteItemResponse::new);
    }

    /**
     * Update a note record
     * <p>service: updateNote  entities: NoteData  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteNote")
    public ResponseEntity<Map<String, Object>> updateNote(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateNote(body));
    }

    /**
     * Update a QuoteRole
     * <p>service: updateQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteRole")
    public ResponseEntity<UpdateQuoteRoleResponse> updateQuoteRole(@RequestBody UpdateQuoteRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteRole(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteRoleResponse::new);
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTerm")
    public ResponseEntity<UpdateQuoteTermResponse> updateQuoteTerm(@RequestBody UpdateQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteTermResponse::new);
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTermFromItem")
    public ResponseEntity<UpdateQuoteTermResponse> updateQuoteTermUpdateQuoteTermFromItem(@RequestBody UpdateQuoteTermRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateQuoteTerm(ServiceInput.toMap(request));
        return wrap(result, UpdateQuoteTermResponse::new);
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteWorkEffort")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffort(body));
    }

    /**
     * Update an existing requirement
     * <p>service: updateRequirement  entities: Requirement  auth: true
     */
    @PostMapping("/ordermgr/control/updateRequirement")
    public ResponseEntity<UpdateRequirementResponse> updateRequirement(@RequestBody UpdateRequirementRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateRequirement(ServiceInput.toMap(request));
        return wrap(result, UpdateRequirementResponse::new);
    }

    /**
     * Update a RequirementRole
     * <p>service: updateRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/updateRequirementRole")
    public ResponseEntity<UpdateRequirementRoleResponse> updateRequirementRole(@RequestBody UpdateRequirementRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateRequirementRole(ServiceInput.toMap(request));
        return wrap(result, UpdateRequirementRoleResponse::new);
    }

    /**
     * Update a ReturnHeader
     * <p>service: updateReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateReturn")
    public ResponseEntity<UpdateReturnHeaderResponse> updateReturnHeader(@RequestBody UpdateReturnHeaderRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateReturnHeader(ServiceInput.toMap(request));
        return wrap(result, UpdateReturnHeaderResponse::new);
    }

    /**
     * No description.
     * <p>service: updateReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateReturnItems")
    public ResponseEntity<UpdateReturnItemOrAdjustmentResponse> updateReturnItemOrAdjustment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.updateReturnItemOrAdjustment(java.util.Map.copyOf(params));
        return wrap(result, UpdateReturnItemOrAdjustmentResponse::new);
    }

    /**
     * Update Shipping Information on Order View
     * <p>service: updateShipGroupShipInfo  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShipGroupShipInfo")
    public ResponseEntity<UpdateShipGroupShipInfoResponse> updateShipGroupShipInfo(@RequestBody UpdateShipGroupShipInfoRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateShipGroupShipInfo(ServiceInput.toMap(request));
        return wrap(result, UpdateShipGroupShipInfoResponse::new);
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingAddress")
    public ResponseEntity<SetCartShippingAddressResponse> setCartShippingAddress(@RequestBody SetCartShippingAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setCartShippingAddress(ServiceInput.toMap(request));
        return wrap(result, SetCartShippingAddressResponse::new);
    }

    /**
     * Compare order's shipping amount and new shipping amount(based on weight and dimension of packages).If new shipping amount is more then or less than default percentage (defined in shipment.properties) of Order's shipping amount, then shipping method and shipping charges are updated. And if new shipping amount is not more then or less than default percentage (defined in shipment.properties)% of Order's shipping amount then only shipping method is updated.Also updates record in ShipmentRouteSegment entity
     * <p>service: updateShippingMethodAndCharges  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingMethodAndCharges")
    public ResponseEntity<UpdateShippingMethodAndChargesResponse> updateShippingMethodAndCharges(@RequestBody UpdateShippingMethodAndChargesRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateShippingMethodAndCharges(ServiceInput.toMap(request));
        return wrap(result, UpdateShippingMethodAndChargesResponse::new);
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingOptions  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingOptions")
    public ResponseEntity<SetCartShippingOptionsResponse> setCartShippingOptions(@RequestBody SetCartShippingOptionsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setCartShippingOptions(ServiceInput.toMap(request));
        return wrap(result, SetCartShippingOptionsResponse::new);
    }

    /**
     * Sets the tracking number on a shipment preference
     * <p>service: updateTrackingNumber  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateTrackingNumber")
    public ResponseEntity<UpdateTrackingNumberResponse> updateTrackingNumber(@RequestBody UpdateTrackingNumberRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateTrackingNumber(ServiceInput.toMap(request));
        return wrap(result, UpdateTrackingNumberResponse::new);
    }

    /**
     * Update a custRequest record
     * <p>service: updateCustRequest  entities: CustRequest  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequest")
    public ResponseEntity<UpdateCustRequestResponse> updateCustRequest(@RequestBody UpdateCustRequestRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCustRequest(ServiceInput.toMap(request));
        return wrap(result, UpdateCustRequestResponse::new);
    }

    /**
     * Update a CustRequestItem record
     * <p>service: updateCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequestitem")
    public ResponseEntity<UpdateCustRequestItemResponse> updateCustRequestItem(@RequestBody UpdateCustRequestItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCustRequestItem(ServiceInput.toMap(request));
        return wrap(result, UpdateCustRequestItemResponse::new);
    }

    /**
     * Assign a ShoppingCartItem -> Quantity to a ship group
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updatesplit")
    public ResponseEntity<AssignItemShipGroupResponse> assignItemShipGroupUpdatesplit(@RequestBody AssignItemShipGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.assignItemShipGroup(ServiceInput.toMap(request));
        return wrap(result, AssignItemShipGroupResponse::new);
    }

    /**
     * Email UPS Retrun Label
     * <p>service: upsEmailReturnLabel  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/ordermgr/control/upsEmailReturnLabelOrder")
    public ResponseEntity<Map<String, Object>> upsEmailReturnLabel(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.upsEmailReturnLabel(body));
    }

    /**
     * Email UPS Retrun Label
     * <p>service: upsEmailReturnLabel  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/ordermgr/control/upsEmailReturnLabelReturn")
    public ResponseEntity<Map<String, Object>> upsEmailReturnLabelUpsEmailReturnLabelReturn(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.upsEmailReturnLabel(body));
    }

    /**
     * No description.
     * <p>service: checkPaymentMethods  entities: unknown  auth: false
     */
    @GetMapping("/ordermgr/control/validatePaymentMethodsBeforePayment")
    public ResponseEntity<Map<String, Object>> checkPaymentMethods(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.checkPaymentMethods(java.util.Map.copyOf(params)));
    }
}
