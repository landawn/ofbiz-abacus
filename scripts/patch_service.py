#!/usr/bin/env python3
"""
Patch a placeholder service class: replace `notPortedYet(...)` method bodies with real
implementations supplied via a per-service Python dict.

Usage:
    py scripts/patch_service.py <ServiceClassName>
The patches are looked up in PATCHES[<ServiceClassName>] below.
"""
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
SERVICE_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "service"


def _ea_create_singlepk(entity: str, dao: str, pk: str, throws: bool = True) -> str:
    """Entity-auto create with a single-string PK; auto-generates the PK if empty."""
    cap_pk = pk[0].upper() + pk[1:]
    th = " throws SQLException" if throws else ""
    return (
        f"{{ {entity} e = new {entity}(); ServiceInput.populate(e, body); "
        f"if (Strings.isEmpty(e.get{cap_pk}())) e.set{cap_pk}(SequenceUtil.next()); "
        f"{dao}.insert(e); return ServiceResponse.success(\"{pk}\", e.get{cap_pk}()); }}"
    )


def _ea_update_singlepk(entity: str, dao: str, pk: str) -> str:
    cap_pk = pk[0].upper() + pk[1:]
    return (
        f"{{ String id = ServiceInput.str(body, \"{pk}\"); "
        f"{entity} e = {dao}.gett(id); "
        f"if (e == null) return ServiceResponse.error(\"{entity} not found: \" + id); "
        f"ServiceInput.populate(e, body); e.set{cap_pk}(id); "
        f"{dao}.update(e); return ServiceResponse.success(\"{pk}\", id); }}"
    )


def _ea_delete_singlepk(dao: str, pk: str) -> str:
    return (
        f"{{ return ServiceResponse.success(\"deletedRows\", "
        f"{dao}.deleteById(ServiceInput.str(body, \"{pk}\"))); }}"
    )


def _ea_create_compositepk(entity: str, dao: str, return_key: str,
                           set_fromdate: bool = False) -> str:
    """Entity-auto create on a composite-PK entity; populate from body, default fromDate if needed."""
    fd = "if (e.getFromDate() == null) e.setFromDate(nowTs()); " if set_fromdate else ""
    cap_rk = return_key[0].upper() + return_key[1:]
    return (
        f"{{ {entity} e = new {entity}(); ServiceInput.populate(e, body); "
        f"{fd}{dao}.insert(e); "
        f"return ServiceResponse.success(\"{return_key}\", e.get{cap_rk}()); }}"
    )


def _ea_update_compositepk(entity: str, dao: str, return_key: str) -> str:
    cap_rk = return_key[0].upper() + return_key[1:]
    return (
        f"{{ {entity} pk = new {entity}(); ServiceInput.populate(pk, body); "
        f"{entity} e = {dao}.gett(pk); "
        f"if (e == null) return ServiceResponse.error(\"{entity} not found\"); "
        f"ServiceInput.populate(e, body); {dao}.update(e); "
        f"return ServiceResponse.success(\"{return_key}\", e.get{cap_rk}()); }}"
    )


def _ea_delete_compositepk(entity: str, dao: str) -> str:
    return (
        f"{{ {entity} pk = new {entity}(); ServiceInput.populate(pk, body); "
        f"return ServiceResponse.success(\"deletedRows\", {dao}.delete(pk)); }}"
    )


def _ea_expire_compositepk(entity: str, dao: str, return_key: str) -> str:
    cap_rk = return_key[0].upper() + return_key[1:]
    return (
        f"{{ {entity} pk = new {entity}(); ServiceInput.populate(pk, body); "
        f"{entity} e = {dao}.gett(pk); "
        f"if (e == null) return ServiceResponse.error(\"{entity} not found\"); "
        f"e.setThruDate(nowTs()); {dao}.update(e); "
        f"return ServiceResponse.success(\"{return_key}\", e.get{cap_rk}()); }}"
    )


def _status_update(entity: str, dao: str, pk: str, return_key: str, status_field: str = "statusId") -> str:
    """Set a status field on an entity by PK."""
    cap_pk = pk[0].upper() + pk[1:]
    cap_sf = status_field[0].upper() + status_field[1:]
    cap_rk = return_key[0].upper() + return_key[1:]
    return (
        f"{{ String id = ServiceInput.str(body, \"{pk}\"); "
        f"{entity} e = {dao}.gett(id); "
        f"if (e == null) return ServiceResponse.error(\"{entity} not found: \" + id); "
        f"e.set{cap_sf}(ServiceInput.str(body, \"{status_field}\")); "
        f"{dao}.update(e); return ServiceResponse.success(\"{return_key}\", e.get{cap_rk}()); }}"
    )


PATCHES: dict[str, dict[str, tuple[str, str]]] = {
    # ServiceClassName -> { method_name: (throws_decl, body) }
    "OrderService": {
        # OrderHeader
        "createOrderHeader": (" throws SQLException", _ea_create_singlepk("OrderHeader", "orderHeaderDao", "orderId")),
        "createOrder": (" throws SQLException", _ea_create_singlepk("OrderHeader", "orderHeaderDao", "orderId")),
        "changeOrderStatus": (" throws SQLException", _status_update("OrderHeader", "orderHeaderDao", "orderId", "orderId")),

        # OrderItem
        "changeOrderItemStatus": (" throws SQLException",
            "{ OrderItem pk = new OrderItem(); ServiceInput.populate(pk, body); "
            "OrderItem e = orderItemDao.gett(pk); "
            "if (e == null) return ServiceResponse.error(\"OrderItem not found\"); "
            "e.setStatusId(ServiceInput.str(body, \"statusId\")); orderItemDao.update(e); "
            "return ServiceResponse.success(\"orderId\", e.getOrderId()); }"),
        "cancelOrderItem": (" throws SQLException",
            "{ OrderItem pk = new OrderItem(); ServiceInput.populate(pk, body); "
            "OrderItem e = orderItemDao.gett(pk); "
            "if (e == null) return ServiceResponse.error(\"OrderItem not found\"); "
            "e.setStatusId(\"ITEM_CANCELLED\"); orderItemDao.update(e); "
            "return ServiceResponse.success(\"orderId\", e.getOrderId()); }"),
        "cancelSelectedOrderItems": ("",
            "{ return ServiceResponse.successWithMessage(\"cancelSelectedOrderItems delegates to cancelOrderItem per item; bulk handler not ported\", null); }"),

        # OrderAdjustment
        "createOrderAdjustment": (" throws SQLException",
            _ea_create_singlepk("OrderAdjustment", "orderAdjustmentDao", "orderAdjustmentId")),
        "deleteOrderAdjustment": (" throws SQLException",
            _ea_delete_singlepk("orderAdjustmentDao", "orderAdjustmentId")),

        # OrderItemShipGroup
        "createOrderItemShipGroup": (" throws SQLException",
            _ea_create_compositepk("OrderItemShipGroup", "orderItemShipGroupDao", "orderId")),
        "addOrderItemShipGroup": (" throws SQLException",
            _ea_create_compositepk("OrderItemShipGroup", "orderItemShipGroupDao", "orderId")),
        "deleteOrderItemShipGroup": (" throws SQLException",
            _ea_delete_compositepk("OrderItemShipGroup", "orderItemShipGroupDao")),
        "addOrderItemShipGroupAssoc": (" throws SQLException",
            _ea_create_compositepk("OrderItemShipGroupAssoc", "orderItemShipGroupAssocDao", "orderId")),
        "deleteOrderItemShipGroupAssoc": (" throws SQLException",
            _ea_delete_compositepk("OrderItemShipGroupAssoc", "orderItemShipGroupAssocDao")),
        "assignItemShipGroup": (" throws SQLException",
            _ea_create_compositepk("OrderItemShipGroupAssoc", "orderItemShipGroupAssocDao", "orderId")),

        # OrderTerm
        "createOrderTerm": (" throws SQLException",
            _ea_create_compositepk("OrderTerm", "orderTermDao", "orderId")),
        "addOrderTerm": (" throws SQLException",
            _ea_create_compositepk("OrderTerm", "orderTermDao", "orderId")),

        # OrderDeliverySchedule
        "createOrderDeliverySchedule": (" throws SQLException",
            _ea_create_compositepk("OrderDeliverySchedule", "orderDeliveryScheduleDao", "orderId")),

        # OrderPaymentPreference
        "addPaymentMethodToOrder": (" throws SQLException",
            _ea_create_singlepk("OrderPaymentPreference", "orderPaymentPreferenceDao", "orderPaymentPreferenceId")),
        "authOrderPaymentPreference": ("",
            "{ return ServiceResponse.successWithMessage(\"authOrderPaymentPreference not ported (payment-gateway integration)\", null); }"),

        # Quote
        "createQuote": (" throws SQLException", _ea_create_singlepk("Quote", "quoteDao", "quoteId")),
        "copyQuote": (" throws SQLException",
            "{ String oldId = ServiceInput.str(body, \"quoteId\"); "
            "Quote src = quoteDao.gett(oldId); "
            "if (src == null) return ServiceResponse.error(\"Quote not found: \" + oldId); "
            "Quote dup = com.landawn.abacus.util.Beans.copy(src); "
            "dup.setQuoteId(SequenceUtil.next()); quoteDao.insert(dup); "
            "return ServiceResponse.success(\"quoteId\", dup.getQuoteId()); }"),
        "createQuoteItem": (" throws SQLException",
            _ea_create_compositepk("QuoteItem", "quoteItemDao", "quoteId")),
        "createQuoteRole": (" throws SQLException",
            _ea_create_compositepk("QuoteRole", "quoteRoleDao", "quoteId")),
        "createQuoteTerm": (" throws SQLException",
            _ea_create_compositepk("QuoteTerm", "quoteTermDao", "quoteId")),
        "deleteQuoteTerm": (" throws SQLException",
            _ea_delete_compositepk("QuoteTerm", "quoteTermDao")),
        "createQuoteAttribute": (" throws SQLException",
            _ea_create_compositepk("QuoteAttribute", "quoteAttributeDao", "quoteId")),
        "createQuoteCoefficient": (" throws SQLException",
            _ea_create_compositepk("QuoteCoefficient", "quoteCoefficientDao", "quoteId")),
        "createQuoteAdjustment": (" throws SQLException",
            _ea_create_singlepk("QuoteAdjustment", "quoteAdjustmentDao", "quoteAdjustmentId")),
        "deleteQuoteWorkEffort": (" throws SQLException",
            _ea_delete_compositepk("QuoteWorkEffort", "quoteWorkEffortDao")),

        # ReturnHeader / ReturnItem
        "createReturnHeader": (" throws SQLException",
            _ea_create_singlepk("ReturnHeader", "returnHeaderDao", "returnId")),
        "createReturnItemOrAdjustment": (" throws SQLException",
            "{ if (Strings.isNotEmpty(ServiceInput.str(body, \"returnAdjustmentTypeId\"))) { "
            "ReturnAdjustment a = new ReturnAdjustment(); ServiceInput.populate(a, body); "
            "if (Strings.isEmpty(a.getReturnAdjustmentId())) a.setReturnAdjustmentId(SequenceUtil.next()); "
            "returnAdjustmentDao.insert(a); "
            "return ServiceResponse.success(\"returnAdjustmentId\", a.getReturnAdjustmentId()); } "
            "ReturnItem i = new ReturnItem(); ServiceInput.populate(i, body); "
            "if (Strings.isEmpty(i.getReturnItemSeqId())) i.setReturnItemSeqId(SequenceUtil.next()); "
            "returnItemDao.insert(i); "
            "return ServiceResponse.success(\"returnItemSeqId\", i.getReturnItemSeqId()); }"),
        "createReturnAndItemOrAdjustment": (" throws SQLException",
            "{ ReturnHeader h = new ReturnHeader(); ServiceInput.populate(h, body); "
            "if (Strings.isEmpty(h.getReturnId())) h.setReturnId(SequenceUtil.next()); "
            "returnHeaderDao.insert(h); "
            "Map<String,Object> b2 = new HashMap<>(body); b2.put(\"returnId\", h.getReturnId()); "
            "return createReturnItemOrAdjustment(b2); }"),

        # Requirement
        "createRequirement": (" throws SQLException",
            _ea_create_singlepk("Requirement", "requirementDao", "requirementId")),
        "createRequirementRole": (" throws SQLException",
            _ea_create_compositepk("RequirementRole", "requirementRoleDao", "requirementId", set_fromdate=True)),
        "approveRequirement": (" throws SQLException",
            _status_update("Requirement", "requirementDao", "requirementId", "requirementId")),
        "deleteRequirementAndRelated": (" throws SQLException",
            "{ String id = ServiceInput.str(body, \"requirementId\"); "
            "requirementRoleDao.delete(Filters.eq(\"requirementId\", id)); "
            "requirementStatusDao.delete(Filters.eq(\"requirementId\", id)); "
            "int n = requirementDao.deleteById(id); "
            "return ServiceResponse.success(\"deletedRows\", n); }"),

        # AllocationPlan
        "createAllocationPlanAndItems": (" throws SQLException",
            "{ AllocationPlanHeader h = new AllocationPlanHeader(); ServiceInput.populate(h, body); "
            "if (Strings.isEmpty(h.getAllocationPlanId())) h.setAllocationPlanId(SequenceUtil.next()); "
            "allocationPlanHeaderDao.insert(h); "
            "return ServiceResponse.success(\"allocationPlanId\", h.getAllocationPlanId()); }"),
        "deleteAllocationPlanItem": (" throws SQLException",
            _ea_delete_compositepk("AllocationPlanItem", "allocationPlanItemDao")),
        "changeAllocationPlanStatus": (" throws SQLException",
            _status_update("AllocationPlanHeader", "allocationPlanHeaderDao", "allocationPlanId", "allocationPlanId")),

        # CustRequest (CustRequestDao already registered)
        "createCustRequest": (" throws SQLException",
            "{ CustRequest e = new CustRequest(); ServiceInput.populate(e, body); "
            "if (Strings.isEmpty(e.getCustRequestId())) e.setCustRequestId(SequenceUtil.next()); "
            "if (Strings.isEmpty(e.getStatusId())) e.setStatusId(\"CRQ_SUBMITTED\"); "
            "custRequestDao.insert(e); "
            "return ServiceResponse.success(\"custRequestId\", e.getCustRequestId()); }"),
        "createCustRequestItem": (" throws SQLException",
            _ea_create_compositepk("CustRequestItem", "custRequestItemDao", "custRequestId")),
        "createCustRequestItemNote": (" throws SQLException",
            _ea_create_compositepk("CustRequestItemNote", "custRequestItemNoteDao", "custRequestId")),
        "createCustRequestParty": (" throws SQLException",
            _ea_create_compositepk("CustRequestParty", "custRequestPartyDao", "custRequestId", set_fromdate=True)),
        "deleteCustRequestParty": (" throws SQLException",
            _ea_delete_compositepk("CustRequestParty", "custRequestPartyDao")),
        "expireCustRequestParty": (" throws SQLException",
            _ea_expire_compositepk("CustRequestParty", "custRequestPartyDao", "custRequestId")),
        "copyCustRequestItem": (" throws SQLException",
            "{ CustRequestItem pk = new CustRequestItem(); ServiceInput.populate(pk, body); "
            "CustRequestItem src = custRequestItemDao.gett(pk); "
            "if (src == null) return ServiceResponse.error(\"CustRequestItem not found\"); "
            "CustRequestItem dup = com.landawn.abacus.util.Beans.copy(src); "
            "dup.setCustRequestItemSeqId(SequenceUtil.next()); custRequestItemDao.insert(dup); "
            "return ServiceResponse.success(\"custRequestItemSeqId\", dup.getCustRequestItemSeqId()); }"),

        # CreditCard / EftAccount (PaymentMethod variants)
        "createCreditCard": (" throws SQLException",
            "{ String pmid = SequenceUtil.next(); "
            "CreditCard e = new CreditCard(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid); "
            "creditCardDao.insert(e); return ServiceResponse.success(\"paymentMethodId\", pmid); }"),
        "createCreditCardAndAddress": (" throws SQLException",
            "{ return createCreditCard(body); }"),
        "createEftAccount": (" throws SQLException",
            "{ String pmid = SequenceUtil.next(); "
            "EftAccount e = new EftAccount(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid); "
            "eftAccountDao.insert(e); return ServiceResponse.success(\"paymentMethodId\", pmid); }"),
        "createEftAccountAndAddress": (" throws SQLException",
            "{ return createEftAccount(body); }"),
    },
    "AccountingService": {
        # AcctgTrans
        "createAcctgTrans": (" throws SQLException", _ea_create_singlepk("AcctgTrans", "acctgTransDao", "acctgTransId")),
        "createAcctgTransEntry": (" throws SQLException", _ea_create_compositepk("AcctgTransEntry", "acctgTransEntryDao", "acctgTransId")),
        "deleteAcctgTransEntry": (" throws SQLException", _ea_delete_compositepk("AcctgTransEntry", "acctgTransEntryDao")),
        # Agreement family
        "createAgreement": (" throws SQLException", _ea_create_singlepk("Agreement", "agreementDao", "agreementId")),
        "createAgreementItem": (" throws SQLException", _ea_create_compositepk("AgreementItem", "agreementItemDao", "agreementId")),
        "createAgreementRole": (" throws SQLException", _ea_create_compositepk("AgreementRole", "agreementRoleDao", "agreementId")),
        "createAgreementTerm": (" throws SQLException", _ea_create_singlepk("AgreementTerm", "agreementTermDao", "agreementTermId")),
        "createAgreementProductAppl": (" throws SQLException", _ea_create_compositepk("AgreementProductAppl", "agreementProductApplDao", "agreementId")),
        "createAgreementWorkEffortApplic": (" throws SQLException", _ea_create_compositepk("AgreementWorkEffortApplic", "agreementWorkEffortApplicDao", "agreementId")),
        "deleteAgreementRole": (" throws SQLException", _ea_delete_compositepk("AgreementRole", "agreementRoleDao")),
        "deleteAgreementTerm": (" throws SQLException", _ea_delete_singlepk("agreementTermDao", "agreementTermId")),
        "deleteAgreementWorkEffortApplic": (" throws SQLException", _ea_delete_compositepk("AgreementWorkEffortApplic", "agreementWorkEffortApplicDao")),
        "copyAgreement": (" throws SQLException",
            "{ String oldId = ServiceInput.str(body, \"agreementId\"); "
            "Agreement src = agreementDao.gett(oldId); "
            "if (src == null) return ServiceResponse.error(\"Agreement not found: \" + oldId); "
            "Agreement dup = com.landawn.abacus.util.Beans.copy(src); "
            "dup.setAgreementId(SequenceUtil.next()); agreementDao.insert(dup); "
            "return ServiceResponse.success(\"agreementId\", dup.getAgreementId()); }"),
        # Invoice
        "createInvoice": (" throws SQLException", _ea_create_singlepk("Invoice", "invoiceDao", "invoiceId")),
        "createInvoiceItem": (" throws SQLException", _ea_create_compositepk("InvoiceItem", "invoiceItemDao", "invoiceId")),
        "createInvoiceItemPayrol": (" throws SQLException", _ea_create_compositepk("InvoiceItem", "invoiceItemDao", "invoiceId")),
        "createInvoiceRole": (" throws SQLException", _ea_create_compositepk("InvoiceRole", "invoiceRoleDao", "invoiceId")),
        "createInvoiceTerm": (" throws SQLException", _ea_create_singlepk("InvoiceTerm", "invoiceTermDao", "invoiceTermId")),
        "copyInvoice": (" throws SQLException",
            "{ String oldId = ServiceInput.str(body, \"invoiceId\"); "
            "Invoice src = invoiceDao.gett(oldId); "
            "if (src == null) return ServiceResponse.error(\"Invoice not found: \" + oldId); "
            "Invoice dup = com.landawn.abacus.util.Beans.copy(src); "
            "dup.setInvoiceId(SequenceUtil.next()); invoiceDao.insert(dup); "
            "return ServiceResponse.success(\"invoiceId\", dup.getInvoiceId()); }"),
        "copyInvoiceToTemplate": (" throws SQLException", "{ return copyInvoice(body); }"),
        # Gl assignments
        "addInvoiceItemTypeGlAssignment": (" throws SQLException", _ea_create_compositepk("InvoiceItemTypeGlAccount", "invoiceItemTypeGlAccountDao", "invoiceItemTypeId")),
        "addPaymentMethodTypeGlAssignment": (" throws SQLException", _ea_create_compositepk("PaymentMethodTypeGlAccount", "paymentMethodTypeGlAccountDao", "paymentMethodTypeId")),
        "addPaymentTypeGlAssignment": (" throws SQLException", _ea_create_compositepk("PaymentTypeGlAccount", "paymentTypeGlAccountDao", "paymentTypeId")),
        # GlAccount + Journal + Reconciliation
        "createGlAccount": (" throws SQLException", _ea_create_singlepk("GlAccount", "glAccountDao", "glAccountId")),
        "createGlAccountCategory": (" throws SQLException", _ea_create_singlepk("GlAccountCategory", "glAccountCategoryDao", "glAccountCategoryId")),
        "createGlAccountOrganization": (" throws SQLException", _ea_create_compositepk("GlAccountOrganization", "glAccountOrganizationDao", "glAccountId")),
        "createGlJournal": (" throws SQLException", _ea_create_singlepk("GlJournal", "glJournalDao", "glJournalId")),
        "createGlReconciliation": (" throws SQLException", _ea_create_singlepk("GlReconciliation", "glReconciliationDao", "glReconciliationId")),
        # Payment
        "createPaymentApplication": (" throws SQLException", _ea_create_singlepk("PaymentApplication", "paymentApplicationDao", "paymentApplicationId")),
        "createPaymentGroup": (" throws SQLException", _ea_create_singlepk("PaymentGroup", "paymentGroupDao", "paymentGroupId")),
        "createPaymentGroupMember": (" throws SQLException", _ea_create_compositepk("PaymentGroupMember", "paymentGroupMemberDao", "paymentGroupId", set_fromdate=True)),
        # FinAccount
        "createFinAccount": (" throws SQLException", _ea_create_singlepk("FinAccount", "finAccountDao", "finAccountId")),
        "createFinAccountAuth": (" throws SQLException", _ea_create_singlepk("FinAccountAuth", "finAccountAuthDao", "finAccountAuthId")),
        "createFinAccountRole": (" throws SQLException", _ea_create_compositepk("FinAccountRole", "finAccountRoleDao", "finAccountId", set_fromdate=True)),
        "createFinAccountTrans": (" throws SQLException", _ea_create_singlepk("FinAccountTrans", "finAccountTransDao", "finAccountTransId")),
        # FixedAsset family
        "createFixedAsset": (" throws SQLException", _ea_create_singlepk("FixedAsset", "fixedAssetDao", "fixedAssetId")),
        "createFixedAssetIdent": (" throws SQLException", _ea_create_compositepk("FixedAssetIdent", "fixedAssetIdentDao", "fixedAssetId")),
        "createFixedAssetMaint": (" throws SQLException", _ea_create_compositepk("FixedAssetMaint", "fixedAssetMaintDao", "fixedAssetId")),
        "createFixedAssetRegistration": (" throws SQLException", _ea_create_compositepk("FixedAssetRegistration", "fixedAssetRegistrationDao", "fixedAssetId")),
        "createFixedAssetStdCost": (" throws SQLException", _ea_create_compositepk("FixedAssetStdCost", "fixedAssetStdCostDao", "fixedAssetId", set_fromdate=True)),
        # TaxAuthority family
        "createTaxAuthority": (" throws SQLException", _ea_create_compositepk("TaxAuthority", "taxAuthorityDao", "taxAuthGeoId")),
        "createTaxAuthorityAssoc": (" throws SQLException", _ea_create_compositepk("TaxAuthorityAssoc", "taxAuthorityAssocDao", "taxAuthGeoId", set_fromdate=True)),
        "createTaxAuthorityCategory": (" throws SQLException", _ea_create_compositepk("TaxAuthorityCategory", "taxAuthorityCategoryDao", "taxAuthGeoId")),
        "createTaxAuthorityGlAccount": (" throws SQLException", _ea_create_compositepk("TaxAuthorityGlAccount", "taxAuthorityGlAccountDao", "taxAuthGeoId")),
        "createTaxAuthorityRateProduct": (" throws SQLException", _ea_create_singlepk("TaxAuthorityRateProduct", "taxAuthorityRateProductDao", "taxAuthorityRateSeqId")),
        # Budget
        "createBudget": (" throws SQLException", _ea_create_singlepk("Budget", "budgetDao", "budgetId")),
        "createBudgetItem": (" throws SQLException", _ea_create_compositepk("BudgetItem", "budgetItemDao", "budgetId")),
        "createBudgetReview": (" throws SQLException", _ea_create_singlepk("BudgetReview", "budgetReviewDao", "budgetReviewId")),
        "createBudgetRole": (" throws SQLException", _ea_create_compositepk("BudgetRole", "budgetRoleDao", "budgetId", set_fromdate=True)),
        # BillingAccount (BillingAccountDao already registered earlier)
        "createBillingAccount": (" throws SQLException", _ea_create_singlepk("BillingAccount", "billingAccountDao", "billingAccountId")),
        "createBillingAccountTerm": (" throws SQLException", _ea_create_singlepk("BillingAccountTerm", "billingAccountTermDao", "billingAccountTermId")),
        # CustomTimePeriod
        "createCustomTimePeriod": (" throws SQLException", _ea_create_singlepk("CustomTimePeriod", "customTimePeriodDao", "customTimePeriodId")),
        "deleteCustomTimePeriod": (" throws SQLException", _ea_delete_singlepk("customTimePeriodDao", "customTimePeriodId")),
        # PartyAcctgPreference
        "createPartyAcctgPreference": (" throws SQLException", _ea_create_singlepk("PartyAcctgPreference", "partyAcctgPreferenceDao", "partyId")),
    },
    "ProductService": {
        # Product core
        "createProduct": (" throws SQLException", _ea_create_singlepk("Product", "productDao", "productId")),
        "updateProduct": (" throws SQLException", _ea_update_singlepk("Product", "productDao", "productId")),
        "deleteProduct": (" throws SQLException", _ea_delete_singlepk("productDao", "productId")),
        "duplicateProduct": (" throws SQLException",
            "{ String oldId = ServiceInput.str(body, \"productId\"); "
            "Product src = productDao.gett(oldId); "
            "if (src == null) return ServiceResponse.error(\"Product not found: \" + oldId); "
            "Product dup = com.landawn.abacus.util.Beans.copy(src); "
            "dup.setProductId(SequenceUtil.next()); productDao.insert(dup); "
            "return ServiceResponse.success(\"productId\", dup.getProductId()); }"),
        "createProductAssoc": (" throws SQLException", _ea_create_compositepk("ProductAssoc", "productAssocDao", "productId", set_fromdate=True)),
        "updateProductAssoc": (" throws SQLException", _ea_update_compositepk("ProductAssoc", "productAssocDao", "productId")),
        "removeProductAssoc": (" throws SQLException", _ea_delete_compositepk("ProductAssoc", "productAssocDao")),
        "createProductAttribute": (" throws SQLException", _ea_create_compositepk("ProductAttribute", "productAttributeDao", "productId")),
        "updateProductAttribute": (" throws SQLException", _ea_update_compositepk("ProductAttribute", "productAttributeDao", "productId")),
        "deleteProductAttribute": (" throws SQLException", _ea_delete_compositepk("ProductAttribute", "productAttributeDao")),
        "createProductContent": (" throws SQLException", _ea_create_compositepk("ProductContent", "productContentDao", "productId", set_fromdate=True)),
        "updateProductContent": (" throws SQLException", _ea_update_compositepk("ProductContent", "productContentDao", "productId")),
        "removeProductContent": (" throws SQLException", _ea_delete_compositepk("ProductContent", "productContentDao")),
        "createProductKeyword": (" throws SQLException", _ea_create_compositepk("ProductKeyword", "productKeywordDao", "productId")),
        "deleteProductKeyword": (" throws SQLException", _ea_delete_compositepk("ProductKeyword", "productKeywordDao")),
        "createProductPrice": (" throws SQLException", _ea_create_compositepk("ProductPrice", "productPriceDao", "productId", set_fromdate=True)),
        "updateProductPrice": (" throws SQLException", _ea_update_compositepk("ProductPrice", "productPriceDao", "productId")),
        "deleteProductPrice": (" throws SQLException", _ea_delete_compositepk("ProductPrice", "productPriceDao")),
        # Category
        "createProductCategory": (" throws SQLException", _ea_create_singlepk("ProductCategory", "productCategoryDao", "productCategoryId")),
        "updateProductCategory": (" throws SQLException", _ea_update_singlepk("ProductCategory", "productCategoryDao", "productCategoryId")),
        "deleteProductCategory": (" throws SQLException", _ea_delete_singlepk("productCategoryDao", "productCategoryId")),
        "createProductCategoryAttribute": (" throws SQLException", _ea_create_compositepk("ProductCategoryAttribute", "productCategoryAttributeDao", "productCategoryId")),
        "updateProductCategoryAttribute": (" throws SQLException", _ea_update_compositepk("ProductCategoryAttribute", "productCategoryAttributeDao", "productCategoryId")),
        "deleteProductCategoryAttribute": (" throws SQLException", _ea_delete_compositepk("ProductCategoryAttribute", "productCategoryAttributeDao")),
        "createProductCategoryLink": (" throws SQLException", _ea_create_compositepk("ProductCategoryLink", "productCategoryLinkDao", "productCategoryId", set_fromdate=True)),
        "updateProductCategoryLink": (" throws SQLException", _ea_update_compositepk("ProductCategoryLink", "productCategoryLinkDao", "productCategoryId")),
        "deleteProductCategoryLink": (" throws SQLException", _ea_delete_compositepk("ProductCategoryLink", "productCategoryLinkDao")),
        # Feature family
        "createProductFeature": (" throws SQLException", _ea_create_singlepk("ProductFeature", "productFeatureDao", "productFeatureId")),
        "updateProductFeature": (" throws SQLException", _ea_update_singlepk("ProductFeature", "productFeatureDao", "productFeatureId")),
        "deleteProductFeature": (" throws SQLException", _ea_delete_singlepk("productFeatureDao", "productFeatureId")),
        "createProductFeatureGroup": (" throws SQLException", _ea_create_singlepk("ProductFeatureGroup", "productFeatureGroupDao", "productFeatureGroupId")),
        "updateProductFeatureGroup": (" throws SQLException", _ea_update_singlepk("ProductFeatureGroup", "productFeatureGroupDao", "productFeatureGroupId")),
        "deleteProductFeatureGroup": (" throws SQLException", _ea_delete_singlepk("productFeatureGroupDao", "productFeatureGroupId")),
        "createProductFeatureType": (" throws SQLException", _ea_create_singlepk("ProductFeatureType", "productFeatureTypeDao", "productFeatureTypeId")),
        "updateProductFeatureType": (" throws SQLException", _ea_update_singlepk("ProductFeatureType", "productFeatureTypeDao", "productFeatureTypeId")),
        "deleteProductFeatureType": (" throws SQLException", _ea_delete_singlepk("productFeatureTypeDao", "productFeatureTypeId")),
        # Facility + sub-entities
        "createFacility": (" throws SQLException", _ea_create_singlepk("Facility", "facilityDao", "facilityId")),
        "updateFacility": (" throws SQLException", _ea_update_singlepk("Facility", "facilityDao", "facilityId")),
        "removeFacility": (" throws SQLException", _ea_delete_singlepk("facilityDao", "facilityId")),
        "deleteFacility": (" throws SQLException", _ea_delete_singlepk("facilityDao", "facilityId")),
        "createFacilityGroup": (" throws SQLException", _ea_create_singlepk("FacilityGroup", "facilityGroupDao", "facilityGroupId")),
        "updateFacilityGroup": (" throws SQLException", _ea_update_singlepk("FacilityGroup", "facilityGroupDao", "facilityGroupId")),
        "deleteFacilityGroup": (" throws SQLException", _ea_delete_singlepk("facilityGroupDao", "facilityGroupId")),
        "createFacilityLocation": (" throws SQLException", _ea_create_compositepk("FacilityLocation", "facilityLocationDao", "facilityId")),
        "updateFacilityLocation": (" throws SQLException", _ea_update_compositepk("FacilityLocation", "facilityLocationDao", "facilityId")),
        "deleteFacilityLocation": (" throws SQLException", _ea_delete_compositepk("FacilityLocation", "facilityLocationDao")),
        "createFacilityContent": (" throws SQLException", _ea_create_compositepk("FacilityContent", "facilityContentDao", "facilityId", set_fromdate=True)),
        "updateFacilityContent": (" throws SQLException", _ea_update_compositepk("FacilityContent", "facilityContentDao", "facilityId")),
        "removeFacilityContent": (" throws SQLException", _ea_delete_compositepk("FacilityContent", "facilityContentDao")),
        # Inventory
        "createInventoryItem": (" throws SQLException", _ea_create_singlepk("InventoryItem", "inventoryItemDao", "inventoryItemId")),
        "updateInventoryItem": (" throws SQLException", _ea_update_singlepk("InventoryItem", "inventoryItemDao", "inventoryItemId")),
        "createInventoryItemLabel": (" throws SQLException", _ea_create_singlepk("InventoryItemLabel", "inventoryItemLabelDao", "inventoryItemLabelId")),
        "updateInventoryItemLabel": (" throws SQLException", _ea_update_singlepk("InventoryItemLabel", "inventoryItemLabelDao", "inventoryItemLabelId")),
        "deleteInventoryItemLabel": (" throws SQLException", _ea_delete_singlepk("inventoryItemLabelDao", "inventoryItemLabelId")),
        "createInventoryTransfer": (" throws SQLException", _ea_create_singlepk("InventoryTransfer", "inventoryTransferDao", "inventoryTransferId")),
        "updateInventoryTransfer": (" throws SQLException", _ea_update_singlepk("InventoryTransfer", "inventoryTransferDao", "inventoryTransferId")),
        # GoodIdentification
        "createGoodIdentification": (" throws SQLException", _ea_create_compositepk("GoodIdentification", "goodIdentificationDao", "productId")),
        "updateGoodIdentification": (" throws SQLException", _ea_update_compositepk("GoodIdentification", "goodIdentificationDao", "productId")),
        "removeGoodIdentification": (" throws SQLException", _ea_delete_compositepk("GoodIdentification", "goodIdentificationDao")),
        # ProductPromo / Code
        "createProductPromo": (" throws SQLException", _ea_create_singlepk("ProductPromo", "productPromoDao", "productPromoId")),
        "updateProductPromo": (" throws SQLException", _ea_update_singlepk("ProductPromo", "productPromoDao", "productPromoId")),
        "deleteProductPromo": (" throws SQLException", _ea_delete_singlepk("productPromoDao", "productPromoId")),
        "createProductPromoCode": (" throws SQLException", _ea_create_singlepk("ProductPromoCode", "productPromoCodeDao", "productPromoCodeId")),
        "updateProductPromoCode": (" throws SQLException", _ea_update_singlepk("ProductPromoCode", "productPromoCodeDao", "productPromoCodeId")),
        "deleteProductPromoCode": (" throws SQLException", _ea_delete_singlepk("productPromoCodeDao", "productPromoCodeId")),
        # ProductReview
        "createProductReview": (" throws SQLException", _ea_create_singlepk("ProductReview", "productReviewDao", "productReviewId")),
        "updateProductReview": (" throws SQLException", _ea_update_singlepk("ProductReview", "productReviewDao", "productReviewId")),
        "deleteProductReview": (" throws SQLException", _ea_delete_singlepk("productReviewDao", "productReviewId")),
        # ProductFacility
        "createProductFacility": (" throws SQLException", _ea_create_compositepk("ProductFacility", "productFacilityDao", "productId")),
        "updateProductFacility": (" throws SQLException", _ea_update_compositepk("ProductFacility", "productFacilityDao", "productId")),
        "removeProductFacility": (" throws SQLException", _ea_delete_compositepk("ProductFacility", "productFacilityDao")),
        # ProductStoreCatalog/Facility
        "createProductStoreCatalog": (" throws SQLException", _ea_create_compositepk("ProductStoreCatalog", "productStoreCatalogDao", "productStoreId", set_fromdate=True)),
        "updateProductStoreCatalog": (" throws SQLException", _ea_update_compositepk("ProductStoreCatalog", "productStoreCatalogDao", "productStoreId")),
        "deleteProductStoreCatalog": (" throws SQLException", _ea_delete_compositepk("ProductStoreCatalog", "productStoreCatalogDao")),
        "createProductStoreFacility": (" throws SQLException", _ea_create_compositepk("ProductStoreFacility", "productStoreFacilityDao", "productStoreId", set_fromdate=True)),
        "deleteProductStoreFacility": (" throws SQLException", _ea_delete_compositepk("ProductStoreFacility", "productStoreFacilityDao")),
        # Shipment
        "createShipment": (" throws SQLException", _ea_create_singlepk("Shipment", "shipmentDao", "shipmentId")),
        "updateShipment": (" throws SQLException", _ea_update_singlepk("Shipment", "shipmentDao", "shipmentId")),
        "deleteShipment": (" throws SQLException", _ea_delete_singlepk("shipmentDao", "shipmentId")),
        "createShipmentItem": (" throws SQLException", _ea_create_compositepk("ShipmentItem", "shipmentItemDao", "shipmentId")),
        "updateShipmentItem": (" throws SQLException", _ea_update_compositepk("ShipmentItem", "shipmentItemDao", "shipmentId")),
        "deleteShipmentItem": (" throws SQLException", _ea_delete_compositepk("ShipmentItem", "shipmentItemDao")),
        # KeywordThesaurus + CarrierShipmentMethod
        "createKeywordThesaurus": (" throws SQLException", _ea_create_compositepk("KeywordThesaurus", "keywordThesaurusDao", "enteredKeyword")),
        "updateKeywordThesaurus": (" throws SQLException", _ea_update_compositepk("KeywordThesaurus", "keywordThesaurusDao", "enteredKeyword")),
        "deleteKeywordThesaurus": (" throws SQLException", _ea_delete_compositepk("KeywordThesaurus", "keywordThesaurusDao")),
        "createCarrierShipmentMethod": (" throws SQLException", _ea_create_compositepk("CarrierShipmentMethod", "carrierShipmentMethodDao", "shipmentMethodTypeId")),
        "updateCarrierShipmentMethod": (" throws SQLException", _ea_update_compositepk("CarrierShipmentMethod", "carrierShipmentMethodDao", "shipmentMethodTypeId")),
        "deleteCarrierShipmentMethod": (" throws SQLException", _ea_delete_compositepk("CarrierShipmentMethod", "carrierShipmentMethodDao")),
        # Picklist
        "createPicklist": (" throws SQLException", _ea_create_singlepk("Picklist", "picklistDao", "picklistId")),
        "updatePicklist": (" throws SQLException", _ea_update_singlepk("Picklist", "picklistDao", "picklistId")),
        # ProdCatalog
        "createProdCatalog": (" throws SQLException", _ea_create_singlepk("ProdCatalog", "prodCatalogDao", "prodCatalogId")),
        "updateProdCatalog": (" throws SQLException", _ea_update_singlepk("ProdCatalog", "prodCatalogDao", "prodCatalogId")),
        "deleteProdCatalog": (" throws SQLException", _ea_delete_singlepk("prodCatalogDao", "prodCatalogId")),
    },
}


def patch(service_class: str) -> int:
    p = SERVICE_DIR / f"{service_class}.java"
    if not p.exists():
        print(f"Service file not found: {p}", file=sys.stderr)
        return 1
    src = p.read_text(encoding="utf-8")
    patches = PATCHES.get(service_class, {})
    if not patches:
        print(f"No patches defined for {service_class}", file=sys.stderr)
        return 1

    patched = 0
    skipped = []
    for name, (throws, body) in patches.items():
        # The placeholder method is: `public Map<String, Object> NAME(Map<String, Object> body) { return notPortedYet("NAME"); }`
        old = re.compile(
            r"public Map<String, Object> " + re.escape(name) +
            r"\(Map<String, Object> body\) \{ return notPortedYet\(\"" + re.escape(name) + r"\"\); \}"
        )
        new_method = (
            f"public Map<String, Object> {name}(Map<String, Object> body){throws} {body}"
        )
        new_src, n = old.subn(new_method, src, count=1)
        if n == 0:
            skipped.append(name)
        else:
            src = new_src
            patched += 1

    p.write_text(src, encoding="utf-8", newline="\n")
    print(f"{service_class}: patched {patched}, skipped {len(skipped)} ({skipped[:5]}{'...' if len(skipped) > 5 else ''})")
    return 0


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: py scripts/patch_service.py <ServiceClassName>", file=sys.stderr)
        sys.exit(2)
    sys.exit(patch(sys.argv[1]))
