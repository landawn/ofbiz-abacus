package com.landawn.ofbiz.controller;

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

    /**
     * Creates a new OrderItemShipGroup with maySplit and isGift filled.
     * <p>service: addOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroup")
    public ResponseEntity<Map<String, Object>> addOrderItemShipGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add Order Item Ship Group Assoc and if order item ship group not exit, create it before
     * <p>service: addOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/AddOrderItemShipGroupAssoc")
    public ResponseEntity<Map<String, Object>> addOrderItemShipGroupAssoc(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> deleteOrderItemShipGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete Order Item Ship Group Assoc
     * <p>service: deleteOrderItemShipGroupAssoc  entities: OrderItemShipGroupAssoc  auth: true
     */
    @PostMapping("/ordermgr/control/DeleteOrderItemShipGroupAssoc")
    public ResponseEntity<Map<String, Object>> deleteOrderItemShipGroupAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateOrderItemShipGroupAssoc  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/UpdateOrderItemShipGroupAssoc")
    public ResponseEntity<Map<String, Object>> updateOrderItemShipGroupAssoc(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> createShoppingListItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Upload and attach a file to an order
     * <p>service: uploadOrderContentFile  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/addOrderAttachments")
    public ResponseEntity<Map<String, Object>> uploadOrderContentFile(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> addPaymentMethodToOrder(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createUpdateShippingAddress(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> setAllowOrderSplit(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Append an item to an existing order
     * <p>service: appendOrderItem  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/appendItemToOrder")
    public ResponseEntity<Map<String, Object>> appendOrderItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: approveRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/approveRequirements")
    public ResponseEntity<Map<String, Object>> approveRequirement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/assignItemToShipGroups")
    public ResponseEntity<Map<String, Object>> assignItemShipGroup(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> autoAssignRequirementToSupplier(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove all existing quote adjustments, recalc them and persist in QuoteAdjustment.
     * <p>service: autoCreateQuoteAdjustments  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/autoCreateQuoteAdjustments")
    public ResponseEntity<Map<String, Object>> autoCreateQuoteAdjustments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: autoUpdateQuotePrice  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/autoUpdateQuotePrices")
    public ResponseEntity<Map<String, Object>> autoUpdateQuotePrice(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> cancelOrderItem(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> changeAllocationPlanStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of an existing order item. If no orderItemSeqId is specified, the status of all order items will be changed.
     * <p>service: changeOrderItemStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderItemStatus")
    public ResponseEntity<Map<String, Object>> changeOrderItemStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of an existing order
     * <p>service: changeOrderStatus  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/changeOrderStatus")
    public ResponseEntity<Map<String, Object>> changeOrderStatus(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> completePurchaseOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy a CustRequest
     * <p>service: copyCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/copyCustRequestItem")
    public ResponseEntity<Map<String, Object>> copyCustRequestItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy a Quote
     * <p>service: copyQuote  entities: Quote  auth: true
     */
    @PostMapping("/ordermgr/control/copyQuote")
    public ResponseEntity<Map<String, Object>> copyQuote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Allocation Plan And Items
     * <p>service: createAllocationPlanAndItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createAllocationPlanAndItems")
    public ResponseEntity<Map<String, Object>> createAllocationPlanAndItems(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createCustRequestContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCustRequestFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createCustRequestFromCart")
    public ResponseEntity<Map<String, Object>> createCustRequestFromCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createCustRequestFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createCustRequestFromShoppingList")
    public ResponseEntity<Map<String, Object>> createCustRequestFromShoppingList(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createCustRequestParty(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createOrderAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a order conversation
     * <p>service: createOrderConversation  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderConversation")
    public ResponseEntity<Map<String, Object>> createOrderConversation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a delivery schedule for the specified order
     * <p>service: createOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderDeliverySchedule")
    public ResponseEntity<Map<String, Object>> createOrderDeliverySchedule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create OrderHeader
     * <p>service: createOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderHeader")
    public ResponseEntity<Map<String, Object>> createOrderHeader(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new OrderItemShipGroup.
     * <p>service: createOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderItemShipGroup")
    public ResponseEntity<Map<String, Object>> createOrderItemShipGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Order Term
     * <p>service: createOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createOrderTerm")
    public ResponseEntity<Map<String, Object>> createOrderTerm(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createQuote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote adjustment record
     * <p>service: createQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAdjustment")
    public ResponseEntity<Map<String, Object>> createQuoteAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quote and Quote Item for a CustRequest
     * <p>service: createQuoteAndQuoteItemForRequest  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAndQuoteItemForRequest")
    public ResponseEntity<Map<String, Object>> createQuoteAndQuoteItemForRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteAttribute
     * <p>service: createQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteAttribute")
    public ResponseEntity<Map<String, Object>> createQuoteAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteCoefficient
     * <p>service: createQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteCoefficient")
    public ResponseEntity<Map<String, Object>> createQuoteCoefficient(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createQuoteFromCart  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createQuoteFromCart")
    public ResponseEntity<Map<String, Object>> createQuoteFromCart(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a customer request
     * <p>service: createQuoteFromCustRequest  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromCustRequest")
    public ResponseEntity<Map<String, Object>> createQuoteFromCustRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new quote from a shopping list
     * <p>service: createQuoteFromShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteFromShoppingList")
    public ResponseEntity<Map<String, Object>> createQuoteFromShoppingList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItem")
    public ResponseEntity<Map<String, Object>> createQuoteItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteItem
     * <p>service: createQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteItemForRequest")
    public ResponseEntity<Map<String, Object>> createQuoteItemCreateQuoteItemForRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuoteRole
     * <p>service: createQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteRole")
    public ResponseEntity<Map<String, Object>> createQuoteRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTerm")
    public ResponseEntity<Map<String, Object>> createQuoteTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Quate term.
     * <p>service: createQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/createQuoteTermFromItem")
    public ResponseEntity<Map<String, Object>> createQuoteTermCreateQuoteTermFromItem(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createRequirement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new party role for the requirement
     * <p>service: createRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/createRequirementRole")
    public ResponseEntity<Map<String, Object>> createRequirementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new ReturnHeader
     * <p>service: createReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/createReturn")
    public ResponseEntity<Map<String, Object>> createReturnHeader(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createReturnItems")
    public ResponseEntity<Map<String, Object>> createReturnItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createTransferFromRequirement  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/createTransfersFromRequirements")
    public ResponseEntity<Map<String, Object>> createTransferFromRequirement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note item and associate with a order header
     * <p>service: createOrderNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createordernote")
    public ResponseEntity<Map<String, Object>> createOrderNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note item and associate with a quote
     * <p>service: createQuoteNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createquotenote")
    public ResponseEntity<Map<String, Object>> createQuoteNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a custRequest record and optionally create a custRequest item.
     * <p>service: createCustRequest  entities: CustRequest, CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequest")
    public ResponseEntity<Map<String, Object>> createCustRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CustRequestItem record
     * <p>service: createCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitem")
    public ResponseEntity<Map<String, Object>> createCustRequestItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a note for a CustRequestItem
     * <p>service: createCustRequestItemNote  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/createrequestitemnote")
    public ResponseEntity<Map<String, Object>> createCustRequestItemNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Allocation Plan Item
     * <p>service: deleteAllocationPlanItem  entities: AllocationPlanItem  auth: true
     */
    @PostMapping("/ordermgr/control/deleteAllocationPlanItem")
    public ResponseEntity<Map<String, Object>> deleteAllocationPlanItem(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> deleteCustRequestParty(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> deleteOrderAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTerm")
    public ResponseEntity<Map<String, Object>> deleteQuoteTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete the Quate term.
     * <p>service: deleteQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteTermFromItem")
    public ResponseEntity<Map<String, Object>> deleteQuoteTermDeleteQuoteTermFromItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a new QuoteWorkEffort
     * <p>service: deleteQuoteWorkEffort  entities: QuoteWorkEffort  auth: true
     */
    @PostMapping("/ordermgr/control/deleteQuoteWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteQuoteWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a requirement after deleting related entity records.
     * <p>service: deleteRequirementAndRelated  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/deleteRequirement")
    public ResponseEntity<Map<String, Object>> deleteRequirementAndRelated(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> sendOrderConfirmation(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> ensureWorkEffortAndCreateQuoteWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a Customer Request Content
     * <p>service: expireCustRequestContent  entities: CustRequestContent  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestContent")
    public ResponseEntity<Map<String, Object>> expireCustRequestContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expires a CustRequestParty record
     * <p>service: expireCustRequestParty  entities: CustRequestParty  auth: true
     */
    @PostMapping("/ordermgr/control/expireCustRequestParty")
    public ResponseEntity<Map<String, Object>> expireCustRequestParty(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> getStatusItemsForReturn(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> loadCartFromOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromOrder  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromOrder")
    public ResponseEntity<Map<String, Object>> loadCartFromOrderLoadCartFromOrder(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromQuote  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromQuote")
    public ResponseEntity<Map<String, Object>> loadCartFromQuote(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: loadCartFromShoppingList  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/loadCartFromShoppingList")
    public ResponseEntity<Map<String, Object>> loadCartFromShoppingList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReturnAndItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/makeQuickReturn")
    public ResponseEntity<Map<String, Object>> createReturnAndItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/markOrderViewed")
    public ResponseEntity<Map<String, Object>> updateOrderHeader(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massChangeOrderApproved  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massApproveOrders")
    public ResponseEntity<Map<String, Object>> massChangeOrderApproved(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCancelOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelOrders")
    public ResponseEntity<Map<String, Object>> massCancelOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCancelRemainingPurchaseOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCancelRemainingPurchaseOrderItems")
    public ResponseEntity<Map<String, Object>> massCancelRemainingPurchaseOrderItems(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massCreateFileForOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massCreateFileForOrders")
    public ResponseEntity<Map<String, Object>> massCreateFileForOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massHoldOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massHoldOrders")
    public ResponseEntity<Map<String, Object>> massHoldOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massPickOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPickOrders")
    public ResponseEntity<Map<String, Object>> massPickOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massPrintOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massPrintOrders")
    public ResponseEntity<Map<String, Object>> massPrintOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massProcessOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massProcessOrders")
    public ResponseEntity<Map<String, Object>> massProcessOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massQuickShipOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massQuickShipOrders")
    public ResponseEntity<Map<String, Object>> massQuickShipOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: massRejectOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/massRejectOrders")
    public ResponseEntity<Map<String, Object>> massRejectOrders(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> productAvailabilityByFacility(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> quickReturnOrder(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> recalcTaxTotal(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> removeOrderTerm(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> removeOrderTermRemoveOrderTerm(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> removeQuoteAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteAttribute
     * <p>service: removeQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteAttribute")
    public ResponseEntity<Map<String, Object>> removeQuoteAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteCoefficient
     * <p>service: removeQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteCoefficient")
    public ResponseEntity<Map<String, Object>> removeQuoteCoefficient(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteItem
     * <p>service: removeQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteItem")
    public ResponseEntity<Map<String, Object>> removeQuoteItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a QuoteRole
     * <p>service: removeQuoteRole  entities: QuoteRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeQuoteRole")
    public ResponseEntity<Map<String, Object>> removeQuoteRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a RequirementRole
     * <p>service: removeRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/removeRequirementRole")
    public ResponseEntity<Map<String, Object>> removeRequirementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Simple remove service
     * <p>service: removeReturnAdjustment  entities: ReturnAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnAdjustment")
    public ResponseEntity<Map<String, Object>> removeReturnAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ReturnItem and related adjustments
     * <p>service: removeReturnItem  entities: ReturnItem  auth: true
     */
    @PostMapping("/ordermgr/control/removeReturnItem")
    public ResponseEntity<Map<String, Object>> removeReturnItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Uses dynamic view entity to find orders; returns a list of Order (OrderHeader) objects
     * <p>service: findOrders  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/searchorders")
    public ResponseEntity<Map<String, Object>> findOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send Purchase Order Email
     * <p>service: sendPOEmail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendPOEmail")
    public ResponseEntity<Map<String, Object>> sendPOEmail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send a quote report mail
     * <p>service: sendQuoteReportMail  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/sendQuoteReportMail")
    public ResponseEntity<Map<String, Object>> sendQuoteReportMail(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> setCustRequestStatus(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> setGiftMessage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/setInvoicePerShipment")
    public ResponseEntity<Map<String, Object>> updateOrderHeaderSetInvoicePerShipment(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> setShippingInstructions(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Allocation Plan Items
     * <p>service: updateAllocationPlanItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateAllocationPlanItems")
    public ResponseEntity<Map<String, Object>> updateAllocationPlanItems(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateCustRequestParty(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateOrderAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Order Contact Mech
     * <p>service: updateOrderContactMech  entities: OrderContactMech  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderContactMech")
    public ResponseEntity<Map<String, Object>> updateOrderContactMech(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing delivery schedule for a specified purchase order
     * <p>service: updateOrderDeliverySchedule  entities: OrderDeliverySchedule  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderDeliverySchedule")
    public ResponseEntity<Map<String, Object>> updateOrderDeliverySchedule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderHeader  entities: OrderHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderHeader")
    public ResponseEntity<Map<String, Object>> updateOrderHeaderUpdateOrderHeader(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates OrderItemShipGroup. The shipmentMethod field is of the format ${shipmentMethodTypeId}@${carrierPartyId}
     * <p>service: updateOrderItemShipGroup  entities: OrderItemShipGroup  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItemShipGroup")
    public ResponseEntity<Map<String, Object>> updateOrderItemShipGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the quantities/prices for an existing order
     * <p>service: updateOrderItems  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderItems")
    public ResponseEntity<Map<String, Object>> updateOrderItems(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update OrderHeader
     * <p>service: updateOrderNote  entities: OrderHeaderNote  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderNote")
    public ResponseEntity<Map<String, Object>> updateOrderNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateOrderPaymentPreference  entities: OrderPaymentPreference  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderPaymentPreference")
    public ResponseEntity<Map<String, Object>> updateOrderPaymentPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Order Term
     * <p>service: updateOrderTerm  entities: OrderTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateOrderTerm")
    public ResponseEntity<Map<String, Object>> updateOrderTerm(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateQuote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteAdjustment
     * <p>service: updateQuoteAdjustment  entities: QuoteAdjustment  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAdjustment")
    public ResponseEntity<Map<String, Object>> updateQuoteAdjustment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteAttribute
     * <p>service: updateQuoteAttribute  entities: QuoteAttribute  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteAttribute")
    public ResponseEntity<Map<String, Object>> updateQuoteAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteCoefficient
     * <p>service: updateQuoteCoefficient  entities: QuoteCoefficient  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteCoefficient")
    public ResponseEntity<Map<String, Object>> updateQuoteCoefficient(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItem")
    public ResponseEntity<Map<String, Object>> updateQuoteItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuoteItem
     * <p>service: updateQuoteItem  entities: QuoteItem  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteItemForRequest")
    public ResponseEntity<Map<String, Object>> updateQuoteItemUpdateQuoteItemForRequest(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateQuoteRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTerm")
    public ResponseEntity<Map<String, Object>> updateQuoteTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit the Quate term.
     * <p>service: updateQuoteTerm  entities: QuoteTerm  auth: true
     */
    @PostMapping("/ordermgr/control/updateQuoteTermFromItem")
    public ResponseEntity<Map<String, Object>> updateQuoteTermUpdateQuoteTermFromItem(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateRequirement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a RequirementRole
     * <p>service: updateRequirementRole  entities: RequirementRole  auth: true
     */
    @PostMapping("/ordermgr/control/updateRequirementRole")
    public ResponseEntity<Map<String, Object>> updateRequirementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ReturnHeader
     * <p>service: updateReturnHeader  entities: ReturnHeader  auth: true
     */
    @PostMapping("/ordermgr/control/updateReturn")
    public ResponseEntity<Map<String, Object>> updateReturnHeader(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateReturnItemOrAdjustment  entities: unknown  auth: true
     */
    @GetMapping("/ordermgr/control/updateReturnItems")
    public ResponseEntity<Map<String, Object>> updateReturnItemOrAdjustment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Shipping Information on Order View
     * <p>service: updateShipGroupShipInfo  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShipGroupShipInfo")
    public ResponseEntity<Map<String, Object>> updateShipGroupShipInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingAddress  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingAddress")
    public ResponseEntity<Map<String, Object>> setCartShippingAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Compare order's shipping amount and new shipping amount(based on weight and dimension of packages).If new shipping amount is more then or less than default percentage (defined in shipment.properties) of Order's shipping amount, then shipping method and shipping charges are updated. And if new shipping amount is not more then or less than default percentage (defined in shipment.properties)% of Order's shipping amount then only shipping method is updated.Also updates record in ShipmentRouteSegment entity
     * <p>service: updateShippingMethodAndCharges  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingMethodAndCharges")
    public ResponseEntity<Map<String, Object>> updateShippingMethodAndCharges(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets The ShoppingCart Shipping Options
     * <p>service: setCartShippingOptions  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateShippingOptions")
    public ResponseEntity<Map<String, Object>> setCartShippingOptions(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the tracking number on a shipment preference
     * <p>service: updateTrackingNumber  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updateTrackingNumber")
    public ResponseEntity<Map<String, Object>> updateTrackingNumber(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a custRequest record
     * <p>service: updateCustRequest  entities: CustRequest  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequest")
    public ResponseEntity<Map<String, Object>> updateCustRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CustRequestItem record
     * <p>service: updateCustRequestItem  entities: CustRequestItem  auth: true
     */
    @PostMapping("/ordermgr/control/updaterequestitem")
    public ResponseEntity<Map<String, Object>> updateCustRequestItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Assign a ShoppingCartItem -> Quantity to a ship group
     * <p>service: assignItemShipGroup  entities: unknown  auth: true
     */
    @PostMapping("/ordermgr/control/updatesplit")
    public ResponseEntity<Map<String, Object>> assignItemShipGroupUpdatesplit(@RequestBody Map<String, Object> body) {
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
