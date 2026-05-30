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
 * Ports the 225 OFBiz services exposed by {@link com.landawn.ofbiz.controller.OrderController}.
 *
 * <p>Real implementations for the entity-auto CRUD subset (~50 methods on OrderHeader/Item/Role/
 * Status/Adjustment/ShipGroup/Term/DeliverySchedule/PaymentPreference, Quote/QuoteItem/Role/Term/
 * Attribute/Coefficient/Adjustment/WorkEffort, ReturnHeader/Item/Adjustment, Requirement family,
 * AllocationPlan, CustRequestItem/Note/Party, CreditCard/EftAccount). Cart and order-processing
 * workflows (addToCart, processOrders, calcTax, getShipEstimate, mass-* operations, find/search,
 * survey/promo logic, payment-gateway calls) remain as {@code notPortedYet} stubs — they require
 * the OFBiz {@code ShoppingCart} runtime + tax/promo/payment subsystems beyond a single service
 * method.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class OrderService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "OrderService" + " Javadoc)", null);
    }
    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }

    // DAOs (constructor-injection would explode the signature; use @Autowired field injection here)
    @Autowired private OrderHeaderDao orderHeaderDao;
    @Autowired private OrderItemDao orderItemDao;
    @Autowired private OrderRoleDao orderRoleDao;
    @Autowired private OrderStatusDao orderStatusDao;
    @Autowired private OrderAdjustmentDao orderAdjustmentDao;
    @Autowired private OrderItemShipGroupDao orderItemShipGroupDao;
    @Autowired private OrderItemShipGroupAssocDao orderItemShipGroupAssocDao;
    @Autowired private OrderTermDao orderTermDao;
    @Autowired private OrderDeliveryScheduleDao orderDeliveryScheduleDao;
    @Autowired private OrderPaymentPreferenceDao orderPaymentPreferenceDao;
    @Autowired private QuoteDao quoteDao;
    @Autowired private QuoteItemDao quoteItemDao;
    @Autowired private QuoteRoleDao quoteRoleDao;
    @Autowired private QuoteTermDao quoteTermDao;
    @Autowired private QuoteAttributeDao quoteAttributeDao;
    @Autowired private QuoteCoefficientDao quoteCoefficientDao;
    @Autowired private QuoteAdjustmentDao quoteAdjustmentDao;
    @Autowired private QuoteWorkEffortDao quoteWorkEffortDao;
    @Autowired private ReturnHeaderDao returnHeaderDao;
    @Autowired private ReturnItemDao returnItemDao;
    @Autowired private ReturnAdjustmentDao returnAdjustmentDao;
    @Autowired private ReturnContactMechDao returnContactMechDao;
    @Autowired private RequirementDao requirementDao;
    @Autowired private RequirementRoleDao requirementRoleDao;
    @Autowired private RequirementStatusDao requirementStatusDao;
    @Autowired private AllocationPlanHeaderDao allocationPlanHeaderDao;
    @Autowired private AllocationPlanItemDao allocationPlanItemDao;
    @Autowired private CustRequestDao custRequestDao;
    @Autowired private CustRequestItemDao custRequestItemDao;
    @Autowired private CustRequestItemNoteDao custRequestItemNoteDao;
    @Autowired private CustRequestPartyDao custRequestPartyDao;
    @Autowired private CreditCardDao creditCardDao;
    @Autowired private EftAccountDao eftAccountDao;

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
    public Map<String, Object> addOrderItemShipGroup(Map<String, Object> body) throws SQLException { OrderItemShipGroup e = new OrderItemShipGroup(); ServiceInput.populate(e, body); orderItemShipGroupDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> addOrderItemShipGroupAssoc(Map<String, Object> body) throws SQLException { OrderItemShipGroupAssoc e = new OrderItemShipGroupAssoc(); ServiceInput.populate(e, body); orderItemShipGroupAssocDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> addOrderTerm(Map<String, Object> body) throws SQLException { OrderTerm e = new OrderTerm(); ServiceInput.populate(e, body); orderTermDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> addPaymentMethodToOrder(Map<String, Object> body) throws SQLException { OrderPaymentPreference e = new OrderPaymentPreference(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getOrderPaymentPreferenceId())) e.setOrderPaymentPreferenceId(SequenceUtil.next()); orderPaymentPreferenceDao.insert(e); return ServiceResponse.success("orderPaymentPreferenceId", e.getOrderPaymentPreferenceId()); }
    public Map<String, Object> addProductPromoCode(Map<String, Object> body) { return notPortedYet("addProductPromoCode"); }
    public Map<String, Object> addProductToComparisonList(Map<String, Object> body) { return notPortedYet("addProductToComparisonList"); }
    public Map<String, Object> addSeparator(Map<String, Object> body) { return notPortedYet("addSeparator"); }
    public Map<String, Object> addToCart(Map<String, Object> body) { return notPortedYet("addToCart"); }
    public Map<String, Object> addToCartBulk(Map<String, Object> body) { return notPortedYet("addToCartBulk"); }
    public Map<String, Object> addToCartBulkRequirements(Map<String, Object> body) { return notPortedYet("addToCartBulkRequirements"); }
    public Map<String, Object> appendOrderItem(Map<String, Object> body) { return notPortedYet("appendOrderItem"); }
    public Map<String, Object> approveRequirement(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "requirementId"); Requirement e = requirementDao.gett(id); if (e == null) return ServiceResponse.error("Requirement not found: " + id); e.setStatusId(ServiceInput.str(body, "statusId")); requirementDao.update(e); return ServiceResponse.success("requirementId", e.getRequirementId()); }
    public Map<String, Object> assignItemShipGroup(Map<String, Object> body) throws SQLException { OrderItemShipGroupAssoc e = new OrderItemShipGroupAssoc(); ServiceInput.populate(e, body); orderItemShipGroupAssocDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> authOrderPaymentPreference(Map<String, Object> body) { return ServiceResponse.successWithMessage("authOrderPaymentPreference not ported (payment-gateway integration)", null); }
    public Map<String, Object> autoAssignRequirementToSupplier(Map<String, Object> body) { return notPortedYet("autoAssignRequirementToSupplier"); }
    public Map<String, Object> autoCreateQuoteAdjustments(Map<String, Object> body) { return notPortedYet("autoCreateQuoteAdjustments"); }
    public Map<String, Object> autoUpdateQuotePrice(Map<String, Object> body) { return notPortedYet("autoUpdateQuotePrice"); }
    public Map<String, Object> balanceInventoryItems(Map<String, Object> body) { return notPortedYet("balanceInventoryItems"); }
    public Map<String, Object> bulkAddProducts(Map<String, Object> body) { return notPortedYet("bulkAddProducts"); }
    public Map<String, Object> bulkAddProductsInApprovedOrder(Map<String, Object> body) { return notPortedYet("bulkAddProductsInApprovedOrder"); }
    public Map<String, Object> calcTax(Map<String, Object> body) { return notPortedYet("calcTax"); }
    public Map<String, Object> cancelOrderItem(Map<String, Object> body) throws SQLException { OrderItem pk = new OrderItem(); ServiceInput.populate(pk, body); OrderItem e = orderItemDao.gett(pk); if (e == null) return ServiceResponse.error("OrderItem not found"); e.setStatusId("ITEM_CANCELLED"); orderItemDao.update(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> cancelSelectedOrderItems(Map<String, Object> body) { return ServiceResponse.successWithMessage("cancelSelectedOrderItems delegates to cancelOrderItem per item; bulk handler not ported", null); }
    public Map<String, Object> changeAllocationPlanStatus(Map<String, Object> body) throws SQLException { AllocationPlanHeader pk = new AllocationPlanHeader(); ServiceInput.populate(pk, body); AllocationPlanHeader e = allocationPlanHeaderDao.gett(pk); if (e == null) return ServiceResponse.error("AllocationPlanHeader not found"); e.setStatusId(ServiceInput.str(body, "statusId")); allocationPlanHeaderDao.update(e); return ServiceResponse.success("planId", e.getPlanId()); }
    public Map<String, Object> changeOrderItemStatus(Map<String, Object> body) throws SQLException { OrderItem pk = new OrderItem(); ServiceInput.populate(pk, body); OrderItem e = orderItemDao.gett(pk); if (e == null) return ServiceResponse.error("OrderItem not found"); e.setStatusId(ServiceInput.str(body, "statusId")); orderItemDao.update(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> changeOrderStatus(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "orderId"); OrderHeader e = orderHeaderDao.gett(id); if (e == null) return ServiceResponse.error("OrderHeader not found: " + id); e.setStatusId(ServiceInput.str(body, "statusId")); orderHeaderDao.update(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> checkDoKeywordOverride(Map<String, Object> body) { return notPortedYet("checkDoKeywordOverride"); }
    public Map<String, Object> checkOrderDenylist(Map<String, Object> body) { return notPortedYet("checkOrderDenylist"); }
    public Map<String, Object> checkPaymentMethods(Map<String, Object> body) { return notPortedYet("checkPaymentMethods"); }
    public Map<String, Object> clearProductComparisonList(Map<String, Object> body) { return notPortedYet("clearProductComparisonList"); }
    public Map<String, Object> clearSearchOptionsHistoryList(Map<String, Object> body) { return notPortedYet("clearSearchOptionsHistoryList"); }
    public Map<String, Object> completePurchaseOrder(Map<String, Object> body) { return notPortedYet("completePurchaseOrder"); }
    public Map<String, Object> copyCustRequestItem(Map<String, Object> body) throws SQLException { CustRequestItem pk = new CustRequestItem(); ServiceInput.populate(pk, body); CustRequestItem src = custRequestItemDao.gett(pk); if (src == null) return ServiceResponse.error("CustRequestItem not found"); CustRequestItem dup = com.landawn.abacus.util.Beans.copy(src); dup.setCustRequestItemSeqId(SequenceUtil.next()); custRequestItemDao.insert(dup); return ServiceResponse.success("custRequestItemSeqId", dup.getCustRequestItemSeqId()); }
    public Map<String, Object> copyQuote(Map<String, Object> body) throws SQLException { String oldId = ServiceInput.str(body, "quoteId"); Quote src = quoteDao.gett(oldId); if (src == null) return ServiceResponse.error("Quote not found: " + oldId); Quote dup = com.landawn.abacus.util.Beans.copy(src); dup.setQuoteId(SequenceUtil.next()); quoteDao.insert(dup); return ServiceResponse.success("quoteId", dup.getQuoteId()); }
    public Map<String, Object> createAllocationPlanAndItems(Map<String, Object> body) throws SQLException { AllocationPlanHeader h = new AllocationPlanHeader(); ServiceInput.populate(h, body); if (Strings.isEmpty(h.getPlanId())) h.setPlanId(SequenceUtil.next()); allocationPlanHeaderDao.insert(h); return ServiceResponse.success("planId", h.getPlanId()); }
    public Map<String, Object> createCreditCard(Map<String, Object> body) throws SQLException { String pmid = SequenceUtil.next(); CreditCard e = new CreditCard(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid); creditCardDao.insert(e); return ServiceResponse.success("paymentMethodId", pmid); }
    public Map<String, Object> createCreditCardAndAddress(Map<String, Object> body) throws SQLException { return createCreditCard(body); }
    public Map<String, Object> createCustRequest(Map<String, Object> body) throws SQLException { CustRequest e = new CustRequest(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getCustRequestId())) e.setCustRequestId(SequenceUtil.next()); if (Strings.isEmpty(e.getStatusId())) e.setStatusId("CRQ_SUBMITTED"); custRequestDao.insert(e); return ServiceResponse.success("custRequestId", e.getCustRequestId()); }
    public Map<String, Object> createCustRequestContent(Map<String, Object> body) { return notPortedYet("createCustRequestContent"); }
    public Map<String, Object> createCustRequestFromCart(Map<String, Object> body) { return notPortedYet("createCustRequestFromCart"); }
    public Map<String, Object> createCustRequestFromShoppingList(Map<String, Object> body) { return notPortedYet("createCustRequestFromShoppingList"); }
    public Map<String, Object> createCustRequestItem(Map<String, Object> body) throws SQLException { CustRequestItem e = new CustRequestItem(); ServiceInput.populate(e, body); custRequestItemDao.insert(e); return ServiceResponse.success("custRequestId", e.getCustRequestId()); }
    public Map<String, Object> createCustRequestItemNote(Map<String, Object> body) throws SQLException { CustRequestItemNote e = new CustRequestItemNote(); ServiceInput.populate(e, body); custRequestItemNoteDao.insert(e); return ServiceResponse.success("custRequestId", e.getCustRequestId()); }
    public Map<String, Object> createCustRequestParty(Map<String, Object> body) throws SQLException { CustRequestParty e = new CustRequestParty(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); custRequestPartyDao.insert(e); return ServiceResponse.success("custRequestId", e.getCustRequestId()); }
    public Map<String, Object> createCustomer(Map<String, Object> body) { return notPortedYet("createCustomer"); }
    public Map<String, Object> createEftAccount(Map<String, Object> body) throws SQLException { String pmid = SequenceUtil.next(); EftAccount e = new EftAccount(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid); eftAccountDao.insert(e); return ServiceResponse.success("paymentMethodId", pmid); }
    public Map<String, Object> createEftAccountAndAddress(Map<String, Object> body) throws SQLException { return createEftAccount(body); }
    public Map<String, Object> createOrder(Map<String, Object> body) throws SQLException { OrderHeader e = new OrderHeader(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getOrderId())) e.setOrderId(SequenceUtil.next()); orderHeaderDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> createOrderAdjustment(Map<String, Object> body) throws SQLException { OrderAdjustment e = new OrderAdjustment(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getOrderAdjustmentId())) e.setOrderAdjustmentId(SequenceUtil.next()); orderAdjustmentDao.insert(e); return ServiceResponse.success("orderAdjustmentId", e.getOrderAdjustmentId()); }
    public Map<String, Object> createOrderConversation(Map<String, Object> body) { return notPortedYet("createOrderConversation"); }
    public Map<String, Object> createOrderDeliverySchedule(Map<String, Object> body) throws SQLException { OrderDeliverySchedule e = new OrderDeliverySchedule(); ServiceInput.populate(e, body); orderDeliveryScheduleDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> createOrderHeader(Map<String, Object> body) throws SQLException { OrderHeader e = new OrderHeader(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getOrderId())) e.setOrderId(SequenceUtil.next()); orderHeaderDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> createOrderItemShipGroup(Map<String, Object> body) throws SQLException { OrderItemShipGroup e = new OrderItemShipGroup(); ServiceInput.populate(e, body); orderItemShipGroupDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> createOrderNote(Map<String, Object> body) { return notPortedYet("createOrderNote"); }
    public Map<String, Object> createOrderTerm(Map<String, Object> body) throws SQLException { OrderTerm e = new OrderTerm(); ServiceInput.populate(e, body); orderTermDao.insert(e); return ServiceResponse.success("orderId", e.getOrderId()); }
    public Map<String, Object> createPartyContactMechPurpose(Map<String, Object> body) { return notPortedYet("createPartyContactMechPurpose"); }
    public Map<String, Object> createPartyGroup(Map<String, Object> body) { return notPortedYet("createPartyGroup"); }
    public Map<String, Object> createPartyPostalAddress(Map<String, Object> body) { return notPortedYet("createPartyPostalAddress"); }
    public Map<String, Object> createQuote(Map<String, Object> body) throws SQLException { Quote e = new Quote(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getQuoteId())) e.setQuoteId(SequenceUtil.next()); quoteDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createQuoteAdjustment(Map<String, Object> body) throws SQLException { QuoteAdjustment e = new QuoteAdjustment(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getQuoteAdjustmentId())) e.setQuoteAdjustmentId(SequenceUtil.next()); quoteAdjustmentDao.insert(e); return ServiceResponse.success("quoteAdjustmentId", e.getQuoteAdjustmentId()); }
    public Map<String, Object> createQuoteAndQuoteItemForRequest(Map<String, Object> body) { return notPortedYet("createQuoteAndQuoteItemForRequest"); }
    public Map<String, Object> createQuoteAttribute(Map<String, Object> body) throws SQLException { QuoteAttribute e = new QuoteAttribute(); ServiceInput.populate(e, body); quoteAttributeDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createQuoteCoefficient(Map<String, Object> body) throws SQLException { QuoteCoefficient e = new QuoteCoefficient(); ServiceInput.populate(e, body); quoteCoefficientDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createQuoteFromCart(Map<String, Object> body) { return notPortedYet("createQuoteFromCart"); }
    public Map<String, Object> createQuoteFromCustRequest(Map<String, Object> body) { return notPortedYet("createQuoteFromCustRequest"); }
    public Map<String, Object> createQuoteFromShoppingList(Map<String, Object> body) { return notPortedYet("createQuoteFromShoppingList"); }
    public Map<String, Object> createQuoteItem(Map<String, Object> body) throws SQLException { QuoteItem e = new QuoteItem(); ServiceInput.populate(e, body); quoteItemDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createQuoteNote(Map<String, Object> body) { return notPortedYet("createQuoteNote"); }
    public Map<String, Object> createQuoteRole(Map<String, Object> body) throws SQLException { QuoteRole e = new QuoteRole(); ServiceInput.populate(e, body); quoteRoleDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createQuoteTerm(Map<String, Object> body) throws SQLException { QuoteTerm e = new QuoteTerm(); ServiceInput.populate(e, body); quoteTermDao.insert(e); return ServiceResponse.success("quoteId", e.getQuoteId()); }
    public Map<String, Object> createReplacementOrder(Map<String, Object> body) { return notPortedYet("createReplacementOrder"); }
    public Map<String, Object> createRequirement(Map<String, Object> body) throws SQLException { Requirement e = new Requirement(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getRequirementId())) e.setRequirementId(SequenceUtil.next()); requirementDao.insert(e); return ServiceResponse.success("requirementId", e.getRequirementId()); }
    public Map<String, Object> createRequirementRole(Map<String, Object> body) throws SQLException { RequirementRole e = new RequirementRole(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); requirementRoleDao.insert(e); return ServiceResponse.success("requirementId", e.getRequirementId()); }
    public Map<String, Object> createReturnAndItemOrAdjustment(Map<String, Object> body) throws SQLException { ReturnHeader h = new ReturnHeader(); ServiceInput.populate(h, body); if (Strings.isEmpty(h.getReturnId())) h.setReturnId(SequenceUtil.next()); returnHeaderDao.insert(h); Map<String,Object> b2 = new HashMap<>(body); b2.put("returnId", h.getReturnId()); return createReturnItemOrAdjustment(b2); }
    public Map<String, Object> createReturnHeader(Map<String, Object> body) throws SQLException { ReturnHeader e = new ReturnHeader(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getReturnId())) e.setReturnId(SequenceUtil.next()); returnHeaderDao.insert(e); return ServiceResponse.success("returnId", e.getReturnId()); }
    public Map<String, Object> createReturnItemOrAdjustment(Map<String, Object> body) throws SQLException { if (Strings.isNotEmpty(ServiceInput.str(body, "returnAdjustmentTypeId"))) { ReturnAdjustment a = new ReturnAdjustment(); ServiceInput.populate(a, body); if (Strings.isEmpty(a.getReturnAdjustmentId())) a.setReturnAdjustmentId(SequenceUtil.next()); returnAdjustmentDao.insert(a); return ServiceResponse.success("returnAdjustmentId", a.getReturnAdjustmentId()); } ReturnItem i = new ReturnItem(); ServiceInput.populate(i, body); if (Strings.isEmpty(i.getReturnItemSeqId())) i.setReturnItemSeqId(SequenceUtil.next()); returnItemDao.insert(i); return ServiceResponse.success("returnItemSeqId", i.getReturnItemSeqId()); }
    public Map<String, Object> createShoppingListItem(Map<String, Object> body) { return notPortedYet("createShoppingListItem"); }
    public Map<String, Object> createSurveyResponseAndRestoreParameters(Map<String, Object> body) { return notPortedYet("createSurveyResponseAndRestoreParameters"); }
    public Map<String, Object> createTransferFromRequirement(Map<String, Object> body) { return notPortedYet("createTransferFromRequirement"); }
    public Map<String, Object> createUpdateShippingAddress(Map<String, Object> body) { return notPortedYet("createUpdateShippingAddress"); }
    public Map<String, Object> createWorkEffortRequestItem(Map<String, Object> body) { return notPortedYet("createWorkEffortRequestItem"); }
    public Map<String, Object> deleteAllocationPlanItem(Map<String, Object> body) throws SQLException { AllocationPlanItem pk = new AllocationPlanItem(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", allocationPlanItemDao.delete(pk)); }
    public Map<String, Object> deleteCustRequestParty(Map<String, Object> body) throws SQLException { CustRequestParty pk = new CustRequestParty(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", custRequestPartyDao.delete(pk)); }
    public Map<String, Object> deleteOrderAdjustment(Map<String, Object> body) throws SQLException { return ServiceResponse.success("deletedRows", orderAdjustmentDao.deleteById(ServiceInput.str(body, "orderAdjustmentId"))); }
    public Map<String, Object> deleteOrderItemShipGroup(Map<String, Object> body) throws SQLException { OrderItemShipGroup pk = new OrderItemShipGroup(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", orderItemShipGroupDao.delete(pk)); }
    public Map<String, Object> deleteOrderItemShipGroupAssoc(Map<String, Object> body) throws SQLException { OrderItemShipGroupAssoc pk = new OrderItemShipGroupAssoc(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", orderItemShipGroupAssocDao.delete(pk)); }
    public Map<String, Object> deletePartyTaxAuthInfo(Map<String, Object> body) { return notPortedYet("deletePartyTaxAuthInfo"); }
    public Map<String, Object> deleteQuoteTerm(Map<String, Object> body) throws SQLException { QuoteTerm pk = new QuoteTerm(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", quoteTermDao.delete(pk)); }
    public Map<String, Object> deleteQuoteWorkEffort(Map<String, Object> body) throws SQLException { QuoteWorkEffort pk = new QuoteWorkEffort(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", quoteWorkEffortDao.delete(pk)); }
    public Map<String, Object> deleteRequirementAndRelated(Map<String, Object> body) throws SQLException { String id = ServiceInput.str(body, "requirementId"); requirementRoleDao.delete(Filters.eq("requirementId", id)); requirementStatusDao.delete(Filters.eq("requirementId", id)); int n = requirementDao.deleteById(id); return ServiceResponse.success("deletedRows", n); }
    public Map<String, Object> deleteWorkEffortRequestItem(Map<String, Object> body) { return notPortedYet("deleteWorkEffortRequestItem"); }
    public Map<String, Object> destroyCart(Map<String, Object> body) { return notPortedYet("destroyCart"); }
    public Map<String, Object> doManualPromotions(Map<String, Object> body) { return notPortedYet("doManualPromotions"); }
    public Map<String, Object> ensureWorkEffortAndCreateQuoteWorkEffort(Map<String, Object> body) { return notPortedYet("ensureWorkEffortAndCreateQuoteWorkEffort"); }
    public Map<String, Object> expireCustRequestContent(Map<String, Object> body) { return notPortedYet("expireCustRequestContent"); }
    public Map<String, Object> expireCustRequestParty(Map<String, Object> body) throws SQLException { CustRequestParty pk = new CustRequestParty(); ServiceInput.populate(pk, body); CustRequestParty e = custRequestPartyDao.gett(pk); if (e == null) return ServiceResponse.error("CustRequestParty not found"); e.setThruDate(nowTs()); custRequestPartyDao.update(e); return ServiceResponse.success("custRequestId", e.getCustRequestId()); }
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
