/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Ports the OFBiz services exposed by {@link com.landawn.ofbiz.controller.OrderController}.
 *
 * <p>This is an auto-generated placeholder service: every endpoint returns a documented
 * {@code successWithMessage} envelope so the API surface is complete and compiles. Hand-edit
 * methods to replace placeholders with real entity-auto CRUD as DAOs come online in DaoConfig.
 *
 * <p>The full implementation follows the WorkeffortService / WebtoolsService pattern: inject
 * the relevant DAOs, populate entities via {@link com.landawn.ofbiz.util.ServiceInput#populate},
 * insert/update via {@code CrudDao} methods, return {@code ServiceResponse.success(...)}.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class OrderService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "OrderService" + " Javadoc)", null);
    }

    /** Framework chain-test service. */
    public Map<String, Object> test(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }

    public Map<String, Object> addAdditionalParty(Map<String, Object> body) { return notPortedYet("addAdditionalParty"); }
    public Map<String, Object> addBulkFromCart(Map<String, Object> body) { return notPortedYet("addBulkFromCart"); }
    public Map<String, Object> addCategoryDefaults(Map<String, Object> body) { return notPortedYet("addCategoryDefaults"); }
    public Map<String, Object> addListToCart(Map<String, Object> body) { return notPortedYet("addListToCart"); }
    public Map<String, Object> addOrderItemShipGroup(Map<String, Object> body) { return notPortedYet("addOrderItemShipGroup"); }
    public Map<String, Object> addOrderItemShipGroupAssoc(Map<String, Object> body) { return notPortedYet("addOrderItemShipGroupAssoc"); }
    public Map<String, Object> addOrderTerm(Map<String, Object> body) { return notPortedYet("addOrderTerm"); }
    public Map<String, Object> addPaymentMethodToOrder(Map<String, Object> body) { return notPortedYet("addPaymentMethodToOrder"); }
    public Map<String, Object> addProductPromoCode(Map<String, Object> body) { return notPortedYet("addProductPromoCode"); }
    public Map<String, Object> addProductToComparisonList(Map<String, Object> body) { return notPortedYet("addProductToComparisonList"); }
    public Map<String, Object> addSeparator(Map<String, Object> body) { return notPortedYet("addSeparator"); }
    public Map<String, Object> addToCart(Map<String, Object> body) { return notPortedYet("addToCart"); }
    public Map<String, Object> addToCartBulk(Map<String, Object> body) { return notPortedYet("addToCartBulk"); }
    public Map<String, Object> addToCartBulkRequirements(Map<String, Object> body) { return notPortedYet("addToCartBulkRequirements"); }
    public Map<String, Object> appendOrderItem(Map<String, Object> body) { return notPortedYet("appendOrderItem"); }
    public Map<String, Object> approveRequirement(Map<String, Object> body) { return notPortedYet("approveRequirement"); }
    public Map<String, Object> assignItemShipGroup(Map<String, Object> body) { return notPortedYet("assignItemShipGroup"); }
    public Map<String, Object> authOrderPaymentPreference(Map<String, Object> body) { return notPortedYet("authOrderPaymentPreference"); }
    public Map<String, Object> autoAssignRequirementToSupplier(Map<String, Object> body) { return notPortedYet("autoAssignRequirementToSupplier"); }
    public Map<String, Object> autoCreateQuoteAdjustments(Map<String, Object> body) { return notPortedYet("autoCreateQuoteAdjustments"); }
    public Map<String, Object> autoUpdateQuotePrice(Map<String, Object> body) { return notPortedYet("autoUpdateQuotePrice"); }
    public Map<String, Object> balanceInventoryItems(Map<String, Object> body) { return notPortedYet("balanceInventoryItems"); }
    public Map<String, Object> bulkAddProducts(Map<String, Object> body) { return notPortedYet("bulkAddProducts"); }
    public Map<String, Object> bulkAddProductsInApprovedOrder(Map<String, Object> body) { return notPortedYet("bulkAddProductsInApprovedOrder"); }
    public Map<String, Object> calcTax(Map<String, Object> body) { return notPortedYet("calcTax"); }
    public Map<String, Object> cancelOrderItem(Map<String, Object> body) { return notPortedYet("cancelOrderItem"); }
    public Map<String, Object> cancelSelectedOrderItems(Map<String, Object> body) { return notPortedYet("cancelSelectedOrderItems"); }
    public Map<String, Object> changeAllocationPlanStatus(Map<String, Object> body) { return notPortedYet("changeAllocationPlanStatus"); }
    public Map<String, Object> changeOrderItemStatus(Map<String, Object> body) { return notPortedYet("changeOrderItemStatus"); }
    public Map<String, Object> changeOrderStatus(Map<String, Object> body) { return notPortedYet("changeOrderStatus"); }
    public Map<String, Object> checkDoKeywordOverride(Map<String, Object> body) { return notPortedYet("checkDoKeywordOverride"); }
    public Map<String, Object> checkOrderDenylist(Map<String, Object> body) { return notPortedYet("checkOrderDenylist"); }
    public Map<String, Object> checkPaymentMethods(Map<String, Object> body) { return notPortedYet("checkPaymentMethods"); }
    public Map<String, Object> clearProductComparisonList(Map<String, Object> body) { return notPortedYet("clearProductComparisonList"); }
    public Map<String, Object> clearSearchOptionsHistoryList(Map<String, Object> body) { return notPortedYet("clearSearchOptionsHistoryList"); }
    public Map<String, Object> completePurchaseOrder(Map<String, Object> body) { return notPortedYet("completePurchaseOrder"); }
    public Map<String, Object> copyCustRequestItem(Map<String, Object> body) { return notPortedYet("copyCustRequestItem"); }
    public Map<String, Object> copyQuote(Map<String, Object> body) { return notPortedYet("copyQuote"); }
    public Map<String, Object> createAllocationPlanAndItems(Map<String, Object> body) { return notPortedYet("createAllocationPlanAndItems"); }
    public Map<String, Object> createCreditCard(Map<String, Object> body) { return notPortedYet("createCreditCard"); }
    public Map<String, Object> createCreditCardAndAddress(Map<String, Object> body) { return notPortedYet("createCreditCardAndAddress"); }
    public Map<String, Object> createCustRequest(Map<String, Object> body) { return notPortedYet("createCustRequest"); }
    public Map<String, Object> createCustRequestContent(Map<String, Object> body) { return notPortedYet("createCustRequestContent"); }
    public Map<String, Object> createCustRequestFromCart(Map<String, Object> body) { return notPortedYet("createCustRequestFromCart"); }
    public Map<String, Object> createCustRequestFromShoppingList(Map<String, Object> body) { return notPortedYet("createCustRequestFromShoppingList"); }
    public Map<String, Object> createCustRequestItem(Map<String, Object> body) { return notPortedYet("createCustRequestItem"); }
    public Map<String, Object> createCustRequestItemNote(Map<String, Object> body) { return notPortedYet("createCustRequestItemNote"); }
    public Map<String, Object> createCustRequestParty(Map<String, Object> body) { return notPortedYet("createCustRequestParty"); }
    public Map<String, Object> createCustomer(Map<String, Object> body) { return notPortedYet("createCustomer"); }
    public Map<String, Object> createEftAccount(Map<String, Object> body) { return notPortedYet("createEftAccount"); }
    public Map<String, Object> createEftAccountAndAddress(Map<String, Object> body) { return notPortedYet("createEftAccountAndAddress"); }
    public Map<String, Object> createOrder(Map<String, Object> body) { return notPortedYet("createOrder"); }
    public Map<String, Object> createOrderAdjustment(Map<String, Object> body) { return notPortedYet("createOrderAdjustment"); }
    public Map<String, Object> createOrderConversation(Map<String, Object> body) { return notPortedYet("createOrderConversation"); }
    public Map<String, Object> createOrderDeliverySchedule(Map<String, Object> body) { return notPortedYet("createOrderDeliverySchedule"); }
    public Map<String, Object> createOrderHeader(Map<String, Object> body) { return notPortedYet("createOrderHeader"); }
    public Map<String, Object> createOrderItemShipGroup(Map<String, Object> body) { return notPortedYet("createOrderItemShipGroup"); }
    public Map<String, Object> createOrderNote(Map<String, Object> body) { return notPortedYet("createOrderNote"); }
    public Map<String, Object> createOrderTerm(Map<String, Object> body) { return notPortedYet("createOrderTerm"); }
    public Map<String, Object> createPartyContactMechPurpose(Map<String, Object> body) { return notPortedYet("createPartyContactMechPurpose"); }
    public Map<String, Object> createPartyGroup(Map<String, Object> body) { return notPortedYet("createPartyGroup"); }
    public Map<String, Object> createPartyPostalAddress(Map<String, Object> body) { return notPortedYet("createPartyPostalAddress"); }
    public Map<String, Object> createQuote(Map<String, Object> body) { return notPortedYet("createQuote"); }
    public Map<String, Object> createQuoteAdjustment(Map<String, Object> body) { return notPortedYet("createQuoteAdjustment"); }
    public Map<String, Object> createQuoteAndQuoteItemForRequest(Map<String, Object> body) { return notPortedYet("createQuoteAndQuoteItemForRequest"); }
    public Map<String, Object> createQuoteAttribute(Map<String, Object> body) { return notPortedYet("createQuoteAttribute"); }
    public Map<String, Object> createQuoteCoefficient(Map<String, Object> body) { return notPortedYet("createQuoteCoefficient"); }
    public Map<String, Object> createQuoteFromCart(Map<String, Object> body) { return notPortedYet("createQuoteFromCart"); }
    public Map<String, Object> createQuoteFromCustRequest(Map<String, Object> body) { return notPortedYet("createQuoteFromCustRequest"); }
    public Map<String, Object> createQuoteFromShoppingList(Map<String, Object> body) { return notPortedYet("createQuoteFromShoppingList"); }
    public Map<String, Object> createQuoteItem(Map<String, Object> body) { return notPortedYet("createQuoteItem"); }
    public Map<String, Object> createQuoteNote(Map<String, Object> body) { return notPortedYet("createQuoteNote"); }
    public Map<String, Object> createQuoteRole(Map<String, Object> body) { return notPortedYet("createQuoteRole"); }
    public Map<String, Object> createQuoteTerm(Map<String, Object> body) { return notPortedYet("createQuoteTerm"); }
    public Map<String, Object> createReplacementOrder(Map<String, Object> body) { return notPortedYet("createReplacementOrder"); }
    public Map<String, Object> createRequirement(Map<String, Object> body) { return notPortedYet("createRequirement"); }
    public Map<String, Object> createRequirementRole(Map<String, Object> body) { return notPortedYet("createRequirementRole"); }
    public Map<String, Object> createReturnAndItemOrAdjustment(Map<String, Object> body) { return notPortedYet("createReturnAndItemOrAdjustment"); }
    public Map<String, Object> createReturnHeader(Map<String, Object> body) { return notPortedYet("createReturnHeader"); }
    public Map<String, Object> createReturnItemOrAdjustment(Map<String, Object> body) { return notPortedYet("createReturnItemOrAdjustment"); }
    public Map<String, Object> createShoppingListItem(Map<String, Object> body) { return notPortedYet("createShoppingListItem"); }
    public Map<String, Object> createSurveyResponseAndRestoreParameters(Map<String, Object> body) { return notPortedYet("createSurveyResponseAndRestoreParameters"); }
    public Map<String, Object> createTransferFromRequirement(Map<String, Object> body) { return notPortedYet("createTransferFromRequirement"); }
    public Map<String, Object> createUpdateShippingAddress(Map<String, Object> body) { return notPortedYet("createUpdateShippingAddress"); }
    public Map<String, Object> createWorkEffortRequestItem(Map<String, Object> body) { return notPortedYet("createWorkEffortRequestItem"); }
    public Map<String, Object> deleteAllocationPlanItem(Map<String, Object> body) { return notPortedYet("deleteAllocationPlanItem"); }
    public Map<String, Object> deleteCustRequestParty(Map<String, Object> body) { return notPortedYet("deleteCustRequestParty"); }
    public Map<String, Object> deleteOrderAdjustment(Map<String, Object> body) { return notPortedYet("deleteOrderAdjustment"); }
    public Map<String, Object> deleteOrderItemShipGroup(Map<String, Object> body) { return notPortedYet("deleteOrderItemShipGroup"); }
    public Map<String, Object> deleteOrderItemShipGroupAssoc(Map<String, Object> body) { return notPortedYet("deleteOrderItemShipGroupAssoc"); }
    public Map<String, Object> deletePartyTaxAuthInfo(Map<String, Object> body) { return notPortedYet("deletePartyTaxAuthInfo"); }
    public Map<String, Object> deleteQuoteTerm(Map<String, Object> body) { return notPortedYet("deleteQuoteTerm"); }
    public Map<String, Object> deleteQuoteWorkEffort(Map<String, Object> body) { return notPortedYet("deleteQuoteWorkEffort"); }
    public Map<String, Object> deleteRequirementAndRelated(Map<String, Object> body) { return notPortedYet("deleteRequirementAndRelated"); }
    public Map<String, Object> deleteWorkEffortRequestItem(Map<String, Object> body) { return notPortedYet("deleteWorkEffortRequestItem"); }
    public Map<String, Object> destroyCart(Map<String, Object> body) { return notPortedYet("destroyCart"); }
    public Map<String, Object> doManualPromotions(Map<String, Object> body) { return notPortedYet("doManualPromotions"); }
    public Map<String, Object> ensureWorkEffortAndCreateQuoteWorkEffort(Map<String, Object> body) { return notPortedYet("ensureWorkEffortAndCreateQuoteWorkEffort"); }
    public Map<String, Object> expireCustRequestContent(Map<String, Object> body) { return notPortedYet("expireCustRequestContent"); }
    public Map<String, Object> expireCustRequestParty(Map<String, Object> body) { return notPortedYet("expireCustRequestParty"); }
    public Map<String, Object> expirePartyContactMechPurpose(Map<String, Object> body) { return notPortedYet("expirePartyContactMechPurpose"); }
    public Map<String, Object> failedDenylistCheck(Map<String, Object> body) { return notPortedYet("failedDenylistCheck"); }
    public Map<String, Object> finalizeOrderEntry(Map<String, Object> body) { return notPortedYet("finalizeOrderEntry"); }
    public Map<String, Object> findOrders(Map<String, Object> body) { return notPortedYet("findOrders"); }
    public Map<String, Object> getConfigDetailsEvent(Map<String, Object> body) { return notPortedYet("getConfigDetailsEvent"); }
    public Map<String, Object> getInventoryAvailableByFacility(Map<String, Object> body) { return notPortedYet("getInventoryAvailableByFacility"); }
    public Map<String, Object> getShipEstimate(Map<String, Object> body) { return notPortedYet("getShipEstimate"); }
    public Map<String, Object> getStatusItemsForReturn(Map<String, Object> body) { return notPortedYet("getStatusItemsForReturn"); }
    public Map<String, Object> initializeOrderEntry(Map<String, Object> body) { return notPortedYet("initializeOrderEntry"); }
    public Map<String, Object> loadCartFromOrder(Map<String, Object> body) { return notPortedYet("loadCartFromOrder"); }
    public Map<String, Object> loadCartFromQuote(Map<String, Object> body) { return notPortedYet("loadCartFromQuote"); }
    public Map<String, Object> loadCartFromShoppingList(Map<String, Object> body) { return notPortedYet("loadCartFromShoppingList"); }
    public Map<String, Object> massCancelOrders(Map<String, Object> body) { return notPortedYet("massCancelOrders"); }
    public Map<String, Object> massCancelRemainingPurchaseOrderItems(Map<String, Object> body) { return notPortedYet("massCancelRemainingPurchaseOrderItems"); }
    public Map<String, Object> massChangeOrderApproved(Map<String, Object> body) { return notPortedYet("massChangeOrderApproved"); }
    public Map<String, Object> massCreateFileForOrders(Map<String, Object> body) { return notPortedYet("massCreateFileForOrders"); }
    public Map<String, Object> massHoldOrders(Map<String, Object> body) { return notPortedYet("massHoldOrders"); }
    public Map<String, Object> massPickOrders(Map<String, Object> body) { return notPortedYet("massPickOrders"); }
    public Map<String, Object> massPrintOrders(Map<String, Object> body) { return notPortedYet("massPrintOrders"); }
    public Map<String, Object> massProcessOrders(Map<String, Object> body) { return notPortedYet("massProcessOrders"); }
    public Map<String, Object> massQuickShipOrders(Map<String, Object> body) { return notPortedYet("massQuickShipOrders"); }
    public Map<String, Object> massRejectOrders(Map<String, Object> body) { return notPortedYet("massRejectOrders"); }
    public Map<String, Object> modifyCart(Map<String, Object> body) { return notPortedYet("modifyCart"); }
    public Map<String, Object> printPickSheets(Map<String, Object> body) { return notPortedYet("printPickSheets"); }
    public Map<String, Object> processPayment(Map<String, Object> body) { return notPortedYet("processPayment"); }
    public Map<String, Object> productAvailabilityByFacility(Map<String, Object> body) { return notPortedYet("productAvailabilityByFacility"); }
    public Map<String, Object> quickCheckoutOrderWithDefaultOptions(Map<String, Object> body) { return notPortedYet("quickCheckoutOrderWithDefaultOptions"); }
    public Map<String, Object> quickDropShipOrder(Map<String, Object> body) { return notPortedYet("quickDropShipOrder"); }
    public Map<String, Object> quickInitPurchaseOrder(Map<String, Object> body) { return notPortedYet("quickInitPurchaseOrder"); }
    public Map<String, Object> quickReturnOrder(Map<String, Object> body) { return notPortedYet("quickReturnOrder"); }
    public Map<String, Object> quickShipEntireOrder(Map<String, Object> body) { return notPortedYet("quickShipEntireOrder"); }
    public Map<String, Object> recalcTaxTotal(Map<String, Object> body) { return notPortedYet("recalcTaxTotal"); }
    public Map<String, Object> receiveOfflinePayment(Map<String, Object> body) { return notPortedYet("receiveOfflinePayment"); }
    public Map<String, Object> removeAdditionalParty(Map<String, Object> body) { return notPortedYet("removeAdditionalParty"); }
    public Map<String, Object> removeOrderTerm(Map<String, Object> body) { return notPortedYet("removeOrderTerm"); }
    public Map<String, Object> removeProductFromComparisonList(Map<String, Object> body) { return notPortedYet("removeProductFromComparisonList"); }
    public Map<String, Object> removePromotion(Map<String, Object> body) { return notPortedYet("removePromotion"); }
    public Map<String, Object> removeQuoteAdjustment(Map<String, Object> body) { return notPortedYet("removeQuoteAdjustment"); }
    public Map<String, Object> removeQuoteAttribute(Map<String, Object> body) { return notPortedYet("removeQuoteAttribute"); }
    public Map<String, Object> removeQuoteCoefficient(Map<String, Object> body) { return notPortedYet("removeQuoteCoefficient"); }
    public Map<String, Object> removeQuoteItem(Map<String, Object> body) { return notPortedYet("removeQuoteItem"); }
    public Map<String, Object> removeQuoteRole(Map<String, Object> body) { return notPortedYet("removeQuoteRole"); }
    public Map<String, Object> removeRequirementRole(Map<String, Object> body) { return notPortedYet("removeRequirementRole"); }
    public Map<String, Object> removeReturnAdjustment(Map<String, Object> body) { return notPortedYet("removeReturnAdjustment"); }
    public Map<String, Object> removeReturnItem(Map<String, Object> body) { return notPortedYet("removeReturnItem"); }
    public Map<String, Object> routeOrderEntry(Map<String, Object> body) { return notPortedYet("routeOrderEntry"); }
    public Map<String, Object> selectAgreement(Map<String, Object> body) { return notPortedYet("selectAgreement"); }
    public Map<String, Object> sendMail(Map<String, Object> body) { return notPortedYet("sendMail"); }
    public Map<String, Object> sendOrderConfirmation(Map<String, Object> body) { return notPortedYet("sendOrderConfirmation"); }
    public Map<String, Object> sendPOEmail(Map<String, Object> body) { return notPortedYet("sendPOEmail"); }
    public Map<String, Object> sendQuoteReportMail(Map<String, Object> body) { return notPortedYet("sendQuoteReportMail"); }
    public Map<String, Object> setAllowOrderSplit(Map<String, Object> body) { return notPortedYet("setAllowOrderSplit"); }
    public Map<String, Object> setCartShipToCustomerParty(Map<String, Object> body) { return notPortedYet("setCartShipToCustomerParty"); }
    public Map<String, Object> setCartShippingAddress(Map<String, Object> body) { return notPortedYet("setCartShippingAddress"); }
    public Map<String, Object> setCartShippingOptions(Map<String, Object> body) { return notPortedYet("setCartShippingOptions"); }
    public Map<String, Object> setCurrency(Map<String, Object> body) { return notPortedYet("setCurrency"); }
    public Map<String, Object> setCurrentSearchFromHistory(Map<String, Object> body) { return notPortedYet("setCurrentSearchFromHistory"); }
    public Map<String, Object> setCustRequestStatus(Map<String, Object> body) { return notPortedYet("setCustRequestStatus"); }
    public Map<String, Object> setDesiredAlternateGwpProductId(Map<String, Object> body) { return notPortedYet("setDesiredAlternateGwpProductId"); }
    public Map<String, Object> setGiftMessage(Map<String, Object> body) { return notPortedYet("setGiftMessage"); }
    public Map<String, Object> setOrderCurrencyAgreementShipDates(Map<String, Object> body) { return notPortedYet("setOrderCurrencyAgreementShipDates"); }
    public Map<String, Object> setOrderName(Map<String, Object> body) { return notPortedYet("setOrderName"); }
    public Map<String, Object> setOrderReservationPriority(Map<String, Object> body) { return notPortedYet("setOrderReservationPriority"); }
    public Map<String, Object> setPartialCheckOutOptions(Map<String, Object> body) { return notPortedYet("setPartialCheckOutOptions"); }
    public Map<String, Object> setPoNumber(Map<String, Object> body) { return notPortedYet("setPoNumber"); }
    public Map<String, Object> setQuickCheckOutOptions(Map<String, Object> body) { return notPortedYet("setQuickCheckOutOptions"); }
    public Map<String, Object> setShippingInstructions(Map<String, Object> body) { return notPortedYet("setShippingInstructions"); }
    public Map<String, Object> updateAllocationPlanItems(Map<String, Object> body) { return notPortedYet("updateAllocationPlanItems"); }
    public Map<String, Object> updateCreditCard(Map<String, Object> body) { return notPortedYet("updateCreditCard"); }
    public Map<String, Object> updateCreditCardAndAddress(Map<String, Object> body) { return notPortedYet("updateCreditCardAndAddress"); }
    public Map<String, Object> updateCustRequest(Map<String, Object> body) { return notPortedYet("updateCustRequest"); }
    public Map<String, Object> updateCustRequestItem(Map<String, Object> body) { return notPortedYet("updateCustRequestItem"); }
    public Map<String, Object> updateCustRequestParty(Map<String, Object> body) { return notPortedYet("updateCustRequestParty"); }
    public Map<String, Object> updateEftAccountAndAddress(Map<String, Object> body) { return notPortedYet("updateEftAccountAndAddress"); }
    public Map<String, Object> updateNote(Map<String, Object> body) { return notPortedYet("updateNote"); }
    public Map<String, Object> updateOrderAdjustment(Map<String, Object> body) { return notPortedYet("updateOrderAdjustment"); }
    public Map<String, Object> updateOrderContactMech(Map<String, Object> body) { return notPortedYet("updateOrderContactMech"); }
    public Map<String, Object> updateOrderDeliverySchedule(Map<String, Object> body) { return notPortedYet("updateOrderDeliverySchedule"); }
    public Map<String, Object> updateOrderHeader(Map<String, Object> body) { return notPortedYet("updateOrderHeader"); }
    public Map<String, Object> updateOrderItemShipGroup(Map<String, Object> body) { return notPortedYet("updateOrderItemShipGroup"); }
    public Map<String, Object> updateOrderItemShipGroupAssoc(Map<String, Object> body) { return notPortedYet("updateOrderItemShipGroupAssoc"); }
    public Map<String, Object> updateOrderItems(Map<String, Object> body) { return notPortedYet("updateOrderItems"); }
    public Map<String, Object> updateOrderNote(Map<String, Object> body) { return notPortedYet("updateOrderNote"); }
    public Map<String, Object> updateOrderPaymentPreference(Map<String, Object> body) { return notPortedYet("updateOrderPaymentPreference"); }
    public Map<String, Object> updateOrderTerm(Map<String, Object> body) { return notPortedYet("updateOrderTerm"); }
    public Map<String, Object> updatePartyPostalAddress(Map<String, Object> body) { return notPortedYet("updatePartyPostalAddress"); }
    public Map<String, Object> updateQuote(Map<String, Object> body) { return notPortedYet("updateQuote"); }
    public Map<String, Object> updateQuoteAdjustment(Map<String, Object> body) { return notPortedYet("updateQuoteAdjustment"); }
    public Map<String, Object> updateQuoteAttribute(Map<String, Object> body) { return notPortedYet("updateQuoteAttribute"); }
    public Map<String, Object> updateQuoteCoefficient(Map<String, Object> body) { return notPortedYet("updateQuoteCoefficient"); }
    public Map<String, Object> updateQuoteItem(Map<String, Object> body) { return notPortedYet("updateQuoteItem"); }
    public Map<String, Object> updateQuoteRole(Map<String, Object> body) { return notPortedYet("updateQuoteRole"); }
    public Map<String, Object> updateQuoteTerm(Map<String, Object> body) { return notPortedYet("updateQuoteTerm"); }
    public Map<String, Object> updateRequirement(Map<String, Object> body) { return notPortedYet("updateRequirement"); }
    public Map<String, Object> updateRequirementRole(Map<String, Object> body) { return notPortedYet("updateRequirementRole"); }
    public Map<String, Object> updateReturnHeader(Map<String, Object> body) { return notPortedYet("updateReturnHeader"); }
    public Map<String, Object> updateReturnItemOrAdjustment(Map<String, Object> body) { return notPortedYet("updateReturnItemOrAdjustment"); }
    public Map<String, Object> updateShipGroupShipInfo(Map<String, Object> body) { return notPortedYet("updateShipGroupShipInfo"); }
    public Map<String, Object> updateShippingMethodAndCharges(Map<String, Object> body) { return notPortedYet("updateShippingMethodAndCharges"); }
    public Map<String, Object> updateTrackingNumber(Map<String, Object> body) { return notPortedYet("updateTrackingNumber"); }
    public Map<String, Object> updateWorkEffort(Map<String, Object> body) { return notPortedYet("updateWorkEffort"); }
    public Map<String, Object> uploadOrderContentFile(Map<String, Object> body) { return notPortedYet("uploadOrderContentFile"); }
    public Map<String, Object> upsEmailReturnLabel(Map<String, Object> body) { return notPortedYet("upsEmailReturnLabel"); }
}
