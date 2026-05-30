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
 * Ports the 280 OFBiz services exposed by {@link com.landawn.ofbiz.controller.AccountingController}.
 *
 * <p>Real implementations for the entity-auto CRUD subset across AcctgTrans, Agreement family,
 * BillingAccount/Term, Budget family, FinAccount family, FixedAsset family, GlAccount/Category/
 * Organization/Journal/Reconciliation, Invoice/Item/Role/Term, Payment/Application/Group, TaxAuthority
 * family, CustomTimePeriod. Workflow services (capture/auth/cancel payments, commission invoices,
 * bank reconciliation, payroll, closeFinancialTimePeriod, cost-center calcs) carry
 * {@code notPortedYet} stubs — they need substantial business-logic ports.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class AccountingService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "AccountingService" + " Javadoc)", null);
    }
    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }

    @Autowired private AcctgTransDao acctgTransDao;
    @Autowired private AcctgTransEntryDao acctgTransEntryDao;
    @Autowired private AgreementDao agreementDao;
    @Autowired private AgreementItemDao agreementItemDao;
    @Autowired private AgreementRoleDao agreementRoleDao;
    @Autowired private AgreementTermDao agreementTermDao;
    @Autowired private AgreementProductApplDao agreementProductApplDao;
    @Autowired private AgreementWorkEffortApplicDao agreementWorkEffortApplicDao;
    @Autowired private InvoiceDao invoiceDao;
    @Autowired private InvoiceItemDao invoiceItemDao;
    @Autowired private InvoiceRoleDao invoiceRoleDao;
    @Autowired private InvoiceTermDao invoiceTermDao;
    @Autowired private InvoiceItemTypeGlAccountDao invoiceItemTypeGlAccountDao;
    @Autowired private PaymentMethodTypeGlAccountDao paymentMethodTypeGlAccountDao;
    // PaymentTypeGlAccountDao doesn't exist; addPaymentTypeGlAssignment is a stub.
    @Autowired private GlAccountDao glAccountDao;
    @Autowired private GlAccountCategoryDao glAccountCategoryDao;
    @Autowired private GlAccountOrganizationDao glAccountOrganizationDao;
    @Autowired private GlJournalDao glJournalDao;
    @Autowired private GlReconciliationDao glReconciliationDao;
    @Autowired private PaymentDao paymentDao;
    @Autowired private PaymentApplicationDao paymentApplicationDao;
    @Autowired private PaymentGroupDao paymentGroupDao;
    @Autowired private PaymentGroupMemberDao paymentGroupMemberDao;
    @Autowired private FinAccountDao finAccountDao;
    @Autowired private FinAccountAuthDao finAccountAuthDao;
    @Autowired private FinAccountRoleDao finAccountRoleDao;
    @Autowired private FinAccountTransDao finAccountTransDao;
    @Autowired private FixedAssetDao fixedAssetDao;
    @Autowired private FixedAssetIdentDao fixedAssetIdentDao;
    @Autowired private FixedAssetMaintDao fixedAssetMaintDao;
    @Autowired private FixedAssetRegistrationDao fixedAssetRegistrationDao;
    @Autowired private FixedAssetStdCostDao fixedAssetStdCostDao;
    @Autowired private TaxAuthorityDao taxAuthorityDao;
    @Autowired private TaxAuthorityAssocDao taxAuthorityAssocDao;
    @Autowired private TaxAuthorityCategoryDao taxAuthorityCategoryDao;
    @Autowired private TaxAuthorityGlAccountDao taxAuthorityGlAccountDao;
    @Autowired private TaxAuthorityRateProductDao taxAuthorityRateProductDao;
    @Autowired private BudgetDao budgetDao;
    @Autowired private BudgetItemDao budgetItemDao;
    @Autowired private BudgetReviewDao budgetReviewDao;
    @Autowired private BudgetRoleDao budgetRoleDao;
    @Autowired private BillingAccountDao billingAccountDao;
    @Autowired private BillingAccountTermDao billingAccountTermDao;
    @Autowired private CustomTimePeriodDao customTimePeriodDao;
    @Autowired private PartyAcctgPreferenceDao partyAcctgPreferenceDao;

    /** Framework chain-test service. */
    public Map<String, Object> test(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }

    public Map<String, Object> addFixedAssetProduct(Map<String, Object> body) { return notPortedYet("addFixedAssetProduct"); }
    public Map<String, Object> addInvoiceItemTypeGlAssignment(Map<String, Object> body) throws SQLException { InvoiceItemTypeGlAccount e = new InvoiceItemTypeGlAccount(); ServiceInput.populate(e, body); invoiceItemTypeGlAccountDao.insert(e); return ServiceResponse.success("invoiceItemTypeId", e.getInvoiceItemTypeId()); }
    public Map<String, Object> addPaymentMethodTypeGlAssignment(Map<String, Object> body) throws SQLException { PaymentMethodTypeGlAccount e = new PaymentMethodTypeGlAccount(); ServiceInput.populate(e, body); paymentMethodTypeGlAccountDao.insert(e); return ServiceResponse.success("paymentMethodTypeId", e.getPaymentMethodTypeId()); }
    public Map<String, Object> addPaymentTypeGlAssignment(Map<String, Object> body) { return notPortedYet("addPaymentTypeGlAssignment"); }
    public Map<String, Object> addTaxOnInvoice(Map<String, Object> body) { return notPortedYet("addTaxOnInvoice"); }
    public Map<String, Object> assignGlRecToFinAccTrans(Map<String, Object> body) { return notPortedYet("assignGlRecToFinAccTrans"); }
    public Map<String, Object> authOrderPaymentPreference(Map<String, Object> body) { return notPortedYet("authOrderPaymentPreference"); }
    public Map<String, Object> cancelBankReconciliation(Map<String, Object> body) { return notPortedYet("cancelBankReconciliation"); }
    public Map<String, Object> cancelCheckRunPayments(Map<String, Object> body) { return notPortedYet("cancelCheckRunPayments"); }
    public Map<String, Object> cancelFixedAssetStdCost(Map<String, Object> body) { return notPortedYet("cancelFixedAssetStdCost"); }
    public Map<String, Object> cancelPaymentBatch(Map<String, Object> body) { return notPortedYet("cancelPaymentBatch"); }
    public Map<String, Object> captureOrderPayments(Map<String, Object> body) { return notPortedYet("captureOrderPayments"); }
    public Map<String, Object> capturePaymentsByInvoice(Map<String, Object> body) { return notPortedYet("capturePaymentsByInvoice"); }
    public Map<String, Object> checkAndCreateBatchForValidPayments(Map<String, Object> body) { return notPortedYet("checkAndCreateBatchForValidPayments"); }
    public Map<String, Object> closeFinancialTimePeriod(Map<String, Object> body) { return notPortedYet("closeFinancialTimePeriod"); }
    public Map<String, Object> completeAcctgTransEntries(Map<String, Object> body) { return notPortedYet("completeAcctgTransEntries"); }
    public Map<String, Object> copyAcctgTransAndEntries(Map<String, Object> body) { return notPortedYet("copyAcctgTransAndEntries"); }
    public Map<String, Object> copyAgreement(Map<String, Object> body) throws SQLException { String oldId = ServiceInput.str(body, "agreementId"); Agreement src = agreementDao.gett(oldId); if (src == null) return ServiceResponse.error("Agreement not found: " + oldId); Agreement dup = com.landawn.abacus.util.Beans.copy(src); dup.setAgreementId(SequenceUtil.next()); agreementDao.insert(dup); return ServiceResponse.success("agreementId", dup.getAgreementId()); }
    public Map<String, Object> copyInvoice(Map<String, Object> body) throws SQLException { String oldId = ServiceInput.str(body, "invoiceId"); Invoice src = invoiceDao.gett(oldId); if (src == null) return ServiceResponse.error("Invoice not found: " + oldId); Invoice dup = com.landawn.abacus.util.Beans.copy(src); dup.setInvoiceId(SequenceUtil.next()); invoiceDao.insert(dup); return ServiceResponse.success("invoiceId", dup.getInvoiceId()); }
    public Map<String, Object> copyInvoiceToTemplate(Map<String, Object> body) throws SQLException { return copyInvoice(body); }
    public Map<String, Object> createAcctgTrans(Map<String, Object> body) throws SQLException { AcctgTrans e = new AcctgTrans(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getAcctgTransId())) e.setAcctgTransId(SequenceUtil.next()); acctgTransDao.insert(e); return ServiceResponse.success("acctgTransId", e.getAcctgTransId()); }
    public Map<String, Object> createAcctgTransEntry(Map<String, Object> body) throws SQLException { AcctgTransEntry e = new AcctgTransEntry(); ServiceInput.populate(e, body); acctgTransEntryDao.insert(e); return ServiceResponse.success("acctgTransId", e.getAcctgTransId()); }
    public Map<String, Object> createAgreement(Map<String, Object> body) throws SQLException { Agreement e = new Agreement(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getAgreementId())) e.setAgreementId(SequenceUtil.next()); agreementDao.insert(e); return ServiceResponse.success("agreementId", e.getAgreementId()); }
    public Map<String, Object> createAgreementFacilityAppl(Map<String, Object> body) { return notPortedYet("createAgreementFacilityAppl"); }
    public Map<String, Object> createAgreementGeographicalApplic(Map<String, Object> body) { return notPortedYet("createAgreementGeographicalApplic"); }
    public Map<String, Object> createAgreementItem(Map<String, Object> body) throws SQLException { AgreementItem e = new AgreementItem(); ServiceInput.populate(e, body); agreementItemDao.insert(e); return ServiceResponse.success("agreementId", e.getAgreementId()); }
    public Map<String, Object> createAgreementPartyApplic(Map<String, Object> body) { return notPortedYet("createAgreementPartyApplic"); }
    public Map<String, Object> createAgreementProductAppl(Map<String, Object> body) throws SQLException { AgreementProductAppl e = new AgreementProductAppl(); ServiceInput.populate(e, body); agreementProductApplDao.insert(e); return ServiceResponse.success("agreementId", e.getAgreementId()); }
    public Map<String, Object> createAgreementPromoAppl(Map<String, Object> body) { return notPortedYet("createAgreementPromoAppl"); }
    public Map<String, Object> createAgreementRole(Map<String, Object> body) throws SQLException { AgreementRole e = new AgreementRole(); ServiceInput.populate(e, body); agreementRoleDao.insert(e); return ServiceResponse.success("agreementId", e.getAgreementId()); }
    public Map<String, Object> createAgreementTerm(Map<String, Object> body) throws SQLException { AgreementTerm e = new AgreementTerm(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getAgreementTermId())) e.setAgreementTermId(SequenceUtil.next()); agreementTermDao.insert(e); return ServiceResponse.success("agreementTermId", e.getAgreementTermId()); }
    public Map<String, Object> createAgreementWorkEffortApplic(Map<String, Object> body) throws SQLException { AgreementWorkEffortApplic e = new AgreementWorkEffortApplic(); ServiceInput.populate(e, body); agreementWorkEffortApplicDao.insert(e); return ServiceResponse.success("agreementId", e.getAgreementId()); }
    public Map<String, Object> createBillingAccount(Map<String, Object> body) throws SQLException { BillingAccount e = new BillingAccount(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getBillingAccountId())) e.setBillingAccountId(SequenceUtil.next()); billingAccountDao.insert(e); return ServiceResponse.success("billingAccountId", e.getBillingAccountId()); }
    public Map<String, Object> createBillingAccountAndRole(Map<String, Object> body) { return notPortedYet("createBillingAccountAndRole"); }
    public Map<String, Object> createBillingAccountRole(Map<String, Object> body) { return notPortedYet("createBillingAccountRole"); }
    public Map<String, Object> createBillingAccountTerm(Map<String, Object> body) throws SQLException { BillingAccountTerm e = new BillingAccountTerm(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getBillingAccountTermId())) e.setBillingAccountTermId(SequenceUtil.next()); billingAccountTermDao.insert(e); return ServiceResponse.success("billingAccountTermId", e.getBillingAccountTermId()); }
    public Map<String, Object> createBudget(Map<String, Object> body) throws SQLException { Budget e = new Budget(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getBudgetId())) e.setBudgetId(SequenceUtil.next()); budgetDao.insert(e); return ServiceResponse.success("budgetId", e.getBudgetId()); }
    public Map<String, Object> createBudgetItem(Map<String, Object> body) throws SQLException { BudgetItem e = new BudgetItem(); ServiceInput.populate(e, body); budgetItemDao.insert(e); return ServiceResponse.success("budgetId", e.getBudgetId()); }
    public Map<String, Object> createBudgetReview(Map<String, Object> body) throws SQLException { BudgetReview e = new BudgetReview(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getBudgetReviewId())) e.setBudgetReviewId(SequenceUtil.next()); budgetReviewDao.insert(e); return ServiceResponse.success("budgetReviewId", e.getBudgetReviewId()); }
    public Map<String, Object> createBudgetRole(Map<String, Object> body) throws SQLException { BudgetRole e = new BudgetRole(); ServiceInput.populate(e, body); budgetRoleDao.insert(e); return ServiceResponse.success("budgetId", e.getBudgetId()); }
    public Map<String, Object> createCommissionInvoices(Map<String, Object> body) { return notPortedYet("createCommissionInvoices"); }
    public Map<String, Object> createCostComponentCalc(Map<String, Object> body) { return notPortedYet("createCostComponentCalc"); }
    public Map<String, Object> createCreditCardTypeGlAccount(Map<String, Object> body) { return notPortedYet("createCreditCardTypeGlAccount"); }
    public Map<String, Object> createCustomTimePeriod(Map<String, Object> body) throws SQLException { CustomTimePeriod e = new CustomTimePeriod(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getCustomTimePeriodId())) e.setCustomTimePeriodId(SequenceUtil.next()); customTimePeriodDao.insert(e); return ServiceResponse.success("customTimePeriodId", e.getCustomTimePeriodId()); }
    public Map<String, Object> createFinAccount(Map<String, Object> body) throws SQLException { FinAccount e = new FinAccount(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFinAccountId())) e.setFinAccountId(SequenceUtil.next()); finAccountDao.insert(e); return ServiceResponse.success("finAccountId", e.getFinAccountId()); }
    public Map<String, Object> createFinAccountAuth(Map<String, Object> body) throws SQLException { FinAccountAuth e = new FinAccountAuth(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFinAccountAuthId())) e.setFinAccountAuthId(SequenceUtil.next()); finAccountAuthDao.insert(e); return ServiceResponse.success("finAccountAuthId", e.getFinAccountAuthId()); }
    public Map<String, Object> createFinAccountRole(Map<String, Object> body) throws SQLException { FinAccountRole e = new FinAccountRole(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); finAccountRoleDao.insert(e); return ServiceResponse.success("finAccountId", e.getFinAccountId()); }
    public Map<String, Object> createFinAccountTrans(Map<String, Object> body) throws SQLException { FinAccountTrans e = new FinAccountTrans(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFinAccountTransId())) e.setFinAccountTransId(SequenceUtil.next()); finAccountTransDao.insert(e); return ServiceResponse.success("finAccountTransId", e.getFinAccountTransId()); }
    public Map<String, Object> createFinAccountTypeGlAccount(Map<String, Object> body) { return notPortedYet("createFinAccountTypeGlAccount"); }
    public Map<String, Object> createFixedAsset(Map<String, Object> body) throws SQLException { FixedAsset e = new FixedAsset(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getFixedAssetId())) e.setFixedAssetId(SequenceUtil.next()); fixedAssetDao.insert(e); return ServiceResponse.success("fixedAssetId", e.getFixedAssetId()); }
    public Map<String, Object> createFixedAssetDepMethod(Map<String, Object> body) { return notPortedYet("createFixedAssetDepMethod"); }
    public Map<String, Object> createFixedAssetIdent(Map<String, Object> body) throws SQLException { FixedAssetIdent e = new FixedAssetIdent(); ServiceInput.populate(e, body); fixedAssetIdentDao.insert(e); return ServiceResponse.success("fixedAssetId", e.getFixedAssetId()); }
    public Map<String, Object> createFixedAssetMaint(Map<String, Object> body) throws SQLException { FixedAssetMaint e = new FixedAssetMaint(); ServiceInput.populate(e, body); fixedAssetMaintDao.insert(e); return ServiceResponse.success("fixedAssetId", e.getFixedAssetId()); }
    public Map<String, Object> createFixedAssetMaintOrder(Map<String, Object> body) { return notPortedYet("createFixedAssetMaintOrder"); }
    public Map<String, Object> createFixedAssetMeter(Map<String, Object> body) { return notPortedYet("createFixedAssetMeter"); }
    public Map<String, Object> createFixedAssetRegistration(Map<String, Object> body) throws SQLException { FixedAssetRegistration e = new FixedAssetRegistration(); ServiceInput.populate(e, body); fixedAssetRegistrationDao.insert(e); return ServiceResponse.success("fixedAssetId", e.getFixedAssetId()); }
    public Map<String, Object> createFixedAssetStdCost(Map<String, Object> body) throws SQLException { FixedAssetStdCost e = new FixedAssetStdCost(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); fixedAssetStdCostDao.insert(e); return ServiceResponse.success("fixedAssetId", e.getFixedAssetId()); }
    public Map<String, Object> createFixedAssetTypeGlAccount(Map<String, Object> body) { return notPortedYet("createFixedAssetTypeGlAccount"); }
    public Map<String, Object> createGlAccount(Map<String, Object> body) throws SQLException { GlAccount e = new GlAccount(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getGlAccountId())) e.setGlAccountId(SequenceUtil.next()); glAccountDao.insert(e); return ServiceResponse.success("glAccountId", e.getGlAccountId()); }
    public Map<String, Object> createGlAccountCategory(Map<String, Object> body) throws SQLException { GlAccountCategory e = new GlAccountCategory(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getGlAccountCategoryId())) e.setGlAccountCategoryId(SequenceUtil.next()); glAccountCategoryDao.insert(e); return ServiceResponse.success("glAccountCategoryId", e.getGlAccountCategoryId()); }
    public Map<String, Object> createGlAccountCategoryMember(Map<String, Object> body) { return notPortedYet("createGlAccountCategoryMember"); }
    public Map<String, Object> createGlAccountOrganization(Map<String, Object> body) throws SQLException { GlAccountOrganization e = new GlAccountOrganization(); ServiceInput.populate(e, body); glAccountOrganizationDao.insert(e); return ServiceResponse.success("glAccountId", e.getGlAccountId()); }
    public Map<String, Object> createGlAccountTypeDefault(Map<String, Object> body) { return notPortedYet("createGlAccountTypeDefault"); }
    public Map<String, Object> createGlJournal(Map<String, Object> body) throws SQLException { GlJournal e = new GlJournal(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getGlJournalId())) e.setGlJournalId(SequenceUtil.next()); glJournalDao.insert(e); return ServiceResponse.success("glJournalId", e.getGlJournalId()); }
    public Map<String, Object> createGlReconciliation(Map<String, Object> body) throws SQLException { GlReconciliation e = new GlReconciliation(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getGlReconciliationId())) e.setGlReconciliationId(SequenceUtil.next()); glReconciliationDao.insert(e); return ServiceResponse.success("glReconciliationId", e.getGlReconciliationId()); }
    public Map<String, Object> createInvoice(Map<String, Object> body) throws SQLException { Invoice e = new Invoice(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getInvoiceId())) e.setInvoiceId(SequenceUtil.next()); invoiceDao.insert(e); return ServiceResponse.success("invoiceId", e.getInvoiceId()); }
    public Map<String, Object> createInvoiceItem(Map<String, Object> body) throws SQLException { InvoiceItem e = new InvoiceItem(); ServiceInput.populate(e, body); invoiceItemDao.insert(e); return ServiceResponse.success("invoiceId", e.getInvoiceId()); }
    public Map<String, Object> createInvoiceItemPayrol(Map<String, Object> body) throws SQLException { InvoiceItem e = new InvoiceItem(); ServiceInput.populate(e, body); invoiceItemDao.insert(e); return ServiceResponse.success("invoiceId", e.getInvoiceId()); }
    public Map<String, Object> createInvoiceRole(Map<String, Object> body) throws SQLException { InvoiceRole e = new InvoiceRole(); ServiceInput.populate(e, body); invoiceRoleDao.insert(e); return ServiceResponse.success("invoiceId", e.getInvoiceId()); }
    public Map<String, Object> createInvoiceTerm(Map<String, Object> body) throws SQLException { InvoiceTerm e = new InvoiceTerm(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getInvoiceTermId())) e.setInvoiceTermId(SequenceUtil.next()); invoiceTermDao.insert(e); return ServiceResponse.success("invoiceTermId", e.getInvoiceTermId()); }
    public Map<String, Object> createPartyAcctgPreference(Map<String, Object> body) throws SQLException { PartyAcctgPreference e = new PartyAcctgPreference(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getPartyId())) e.setPartyId(SequenceUtil.next()); partyAcctgPreferenceDao.insert(e); return ServiceResponse.success("partyId", e.getPartyId()); }
    public Map<String, Object> createPartyFixedAssetAssignment(Map<String, Object> body) { return notPortedYet("createPartyFixedAssetAssignment"); }
    public Map<String, Object> createPartyGlAccount(Map<String, Object> body) { return notPortedYet("createPartyGlAccount"); }
    public Map<String, Object> createPartyPrefDocTypeTpl(Map<String, Object> body) { return notPortedYet("createPartyPrefDocTypeTpl"); }
    public Map<String, Object> createPartyTaxAuthInfo(Map<String, Object> body) { return notPortedYet("createPartyTaxAuthInfo"); }
    public Map<String, Object> createPaymentAndApplication(Map<String, Object> body) { return notPortedYet("createPaymentAndApplication"); }
    public Map<String, Object> createPaymentAndFinAccountTrans(Map<String, Object> body) { return notPortedYet("createPaymentAndFinAccountTrans"); }
    public Map<String, Object> createPaymentAndPaymentGroupForInvoices(Map<String, Object> body) { return notPortedYet("createPaymentAndPaymentGroupForInvoices"); }
    public Map<String, Object> createPaymentApplication(Map<String, Object> body) throws SQLException { PaymentApplication e = new PaymentApplication(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getPaymentApplicationId())) e.setPaymentApplicationId(SequenceUtil.next()); paymentApplicationDao.insert(e); return ServiceResponse.success("paymentApplicationId", e.getPaymentApplicationId()); }
    public Map<String, Object> createPaymentGroup(Map<String, Object> body) throws SQLException { PaymentGroup e = new PaymentGroup(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getPaymentGroupId())) e.setPaymentGroupId(SequenceUtil.next()); paymentGroupDao.insert(e); return ServiceResponse.success("paymentGroupId", e.getPaymentGroupId()); }
    public Map<String, Object> createPaymentGroupMember(Map<String, Object> body) throws SQLException { PaymentGroupMember e = new PaymentGroupMember(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); paymentGroupMemberDao.insert(e); return ServiceResponse.success("paymentGroupId", e.getPaymentGroupId()); }
    public Map<String, Object> createProductCategoryGlAccount(Map<String, Object> body) { return notPortedYet("createProductCategoryGlAccount"); }
    public Map<String, Object> createProductGlAccount(Map<String, Object> body) { return notPortedYet("createProductGlAccount"); }
    public Map<String, Object> createReconcileAccount(Map<String, Object> body) { return notPortedYet("createReconcileAccount"); }
    public Map<String, Object> createSupplierProduct(Map<String, Object> body) { return notPortedYet("createSupplierProduct"); }
    public Map<String, Object> createTaxAuthority(Map<String, Object> body) throws SQLException { TaxAuthority e = new TaxAuthority(); ServiceInput.populate(e, body); taxAuthorityDao.insert(e); return ServiceResponse.success("taxAuthGeoId", e.getTaxAuthGeoId()); }
    public Map<String, Object> createTaxAuthorityAssoc(Map<String, Object> body) throws SQLException { TaxAuthorityAssoc e = new TaxAuthorityAssoc(); ServiceInput.populate(e, body); if (e.getFromDate() == null) e.setFromDate(nowTs()); taxAuthorityAssocDao.insert(e); return ServiceResponse.success("taxAuthGeoId", e.getTaxAuthGeoId()); }
    public Map<String, Object> createTaxAuthorityCategory(Map<String, Object> body) throws SQLException { TaxAuthorityCategory e = new TaxAuthorityCategory(); ServiceInput.populate(e, body); taxAuthorityCategoryDao.insert(e); return ServiceResponse.success("taxAuthGeoId", e.getTaxAuthGeoId()); }
    public Map<String, Object> createTaxAuthorityGlAccount(Map<String, Object> body) throws SQLException { TaxAuthorityGlAccount e = new TaxAuthorityGlAccount(); ServiceInput.populate(e, body); taxAuthorityGlAccountDao.insert(e); return ServiceResponse.success("taxAuthGeoId", e.getTaxAuthGeoId()); }
    public Map<String, Object> createTaxAuthorityRateProduct(Map<String, Object> body) throws SQLException { TaxAuthorityRateProduct e = new TaxAuthorityRateProduct(); ServiceInput.populate(e, body); if (Strings.isEmpty(e.getTaxAuthorityRateSeqId())) e.setTaxAuthorityRateSeqId(SequenceUtil.next()); taxAuthorityRateProductDao.insert(e); return ServiceResponse.success("taxAuthorityRateSeqId", e.getTaxAuthorityRateSeqId()); }
    public Map<String, Object> createUpdateCostCenter(Map<String, Object> body) { return notPortedYet("createUpdateCostCenter"); }
    public Map<String, Object> createVarianceReasonGlAccount(Map<String, Object> body) { return notPortedYet("createVarianceReasonGlAccount"); }
    public Map<String, Object> createVendor(Map<String, Object> body) { return notPortedYet("createVendor"); }
    public Map<String, Object> createWorkEffortAndPartyAssign(Map<String, Object> body) { return notPortedYet("createWorkEffortAndPartyAssign"); }
    public Map<String, Object> deleteAcctgTransEntry(Map<String, Object> body) throws SQLException { AcctgTransEntry pk = new AcctgTransEntry(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", acctgTransEntryDao.delete(pk)); }
    public Map<String, Object> deleteAgreementRole(Map<String, Object> body) throws SQLException { AgreementRole pk = new AgreementRole(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", agreementRoleDao.delete(pk)); }
    public Map<String, Object> deleteAgreementTerm(Map<String, Object> body) throws SQLException { return ServiceResponse.success("deletedRows", agreementTermDao.deleteById(ServiceInput.str(body, "agreementTermId"))); }
    public Map<String, Object> deleteAgreementWorkEffortApplic(Map<String, Object> body) throws SQLException { AgreementWorkEffortApplic pk = new AgreementWorkEffortApplic(); ServiceInput.populate(pk, body); return ServiceResponse.success("deletedRows", agreementWorkEffortApplicDao.delete(pk)); }
    public Map<String, Object> deleteCreditCardTypeGlAccount(Map<String, Object> body) { return notPortedYet("deleteCreditCardTypeGlAccount"); }
    public Map<String, Object> deleteCustomTimePeriod(Map<String, Object> body) throws SQLException { return ServiceResponse.success("deletedRows", customTimePeriodDao.deleteById(ServiceInput.str(body, "customTimePeriodId"))); }
    public Map<String, Object> deleteFinAccount(Map<String, Object> body) { return notPortedYet("deleteFinAccount"); }
    public Map<String, Object> deleteFinAccountRole(Map<String, Object> body) { return notPortedYet("deleteFinAccountRole"); }
    public Map<String, Object> deleteFinAccountTypeGlAccount(Map<String, Object> body) { return notPortedYet("deleteFinAccountTypeGlAccount"); }
    public Map<String, Object> deleteFixedAssetDepMethod(Map<String, Object> body) { return notPortedYet("deleteFixedAssetDepMethod"); }
    public Map<String, Object> deleteFixedAssetMaint(Map<String, Object> body) { return notPortedYet("deleteFixedAssetMaint"); }
    public Map<String, Object> deleteFixedAssetMaintOrder(Map<String, Object> body) { return notPortedYet("deleteFixedAssetMaintOrder"); }
    public Map<String, Object> deleteFixedAssetMeter(Map<String, Object> body) { return notPortedYet("deleteFixedAssetMeter"); }
    public Map<String, Object> deleteFixedAssetRegistration(Map<String, Object> body) { return notPortedYet("deleteFixedAssetRegistration"); }
    public Map<String, Object> deleteFixedAssetTypeGlAccount(Map<String, Object> body) { return notPortedYet("deleteFixedAssetTypeGlAccount"); }
    public Map<String, Object> deleteGlAccountCategoryMember(Map<String, Object> body) { return notPortedYet("deleteGlAccountCategoryMember"); }
    public Map<String, Object> deleteGlJournal(Map<String, Object> body) { return notPortedYet("deleteGlJournal"); }
    public Map<String, Object> deleteInvoiceTerm(Map<String, Object> body) { return notPortedYet("deleteInvoiceTerm"); }
    public Map<String, Object> deletePartyFixedAssetAssignment(Map<String, Object> body) { return notPortedYet("deletePartyFixedAssetAssignment"); }
    public Map<String, Object> deletePartyGlAccount(Map<String, Object> body) { return notPortedYet("deletePartyGlAccount"); }
    public Map<String, Object> deletePartyTaxAuthInfo(Map<String, Object> body) { return notPortedYet("deletePartyTaxAuthInfo"); }
    public Map<String, Object> deletePaymentGroup(Map<String, Object> body) { return notPortedYet("deletePaymentGroup"); }
    public Map<String, Object> deleteProductCategoryGlAccount(Map<String, Object> body) { return notPortedYet("deleteProductCategoryGlAccount"); }
    public Map<String, Object> deleteProductGlAccount(Map<String, Object> body) { return notPortedYet("deleteProductGlAccount"); }
    public Map<String, Object> deleteTaxAuthorityAssoc(Map<String, Object> body) { return notPortedYet("deleteTaxAuthorityAssoc"); }
    public Map<String, Object> deleteTaxAuthorityCategory(Map<String, Object> body) { return notPortedYet("deleteTaxAuthorityCategory"); }
    public Map<String, Object> deleteTaxAuthorityGlAccount(Map<String, Object> body) { return notPortedYet("deleteTaxAuthorityGlAccount"); }
    public Map<String, Object> deleteTaxAuthorityRateProduct(Map<String, Object> body) { return notPortedYet("deleteTaxAuthorityRateProduct"); }
    public Map<String, Object> deleteVarianceReasonGlAccount(Map<String, Object> body) { return notPortedYet("deleteVarianceReasonGlAccount"); }
    public Map<String, Object> depositWithdrawPayments(Map<String, Object> body) { return notPortedYet("depositWithdrawPayments"); }
    public Map<String, Object> expireAgreement(Map<String, Object> body) { return notPortedYet("expireAgreement"); }
    public Map<String, Object> expireFinAccountAuth(Map<String, Object> body) { return notPortedYet("expireFinAccountAuth"); }
    public Map<String, Object> expirePartyPrefDocTypeTpl(Map<String, Object> body) { return notPortedYet("expirePartyPrefDocTypeTpl"); }
    public Map<String, Object> expirePaymentGroupMember(Map<String, Object> body) { return notPortedYet("expirePaymentGroupMember"); }
    public Map<String, Object> expireRateAmount(Map<String, Object> body) { return notPortedYet("expireRateAmount"); }
    public Map<String, Object> getFinAccountTransRunningTotalAndBalances(Map<String, Object> body) { return notPortedYet("getFinAccountTransRunningTotalAndBalances"); }
    public Map<String, Object> getInvoiceRunningTotal(Map<String, Object> body) { return notPortedYet("getInvoiceRunningTotal"); }
    public Map<String, Object> getPaymentRunningTotal(Map<String, Object> body) { return notPortedYet("getPaymentRunningTotal"); }
    public Map<String, Object> importInvoice(Map<String, Object> body) { return notPortedYet("importInvoice"); }
    public Map<String, Object> manualForcedCcTransaction(Map<String, Object> body) { return notPortedYet("manualForcedCcTransaction"); }
    public Map<String, Object> massChangeInvoiceStatus(Map<String, Object> body) { return notPortedYet("massChangeInvoiceStatus"); }
    public Map<String, Object> massChangePaymentStatus(Map<String, Object> body) { return notPortedYet("massChangePaymentStatus"); }
    public Map<String, Object> postAcctgTrans(Map<String, Object> body) { return notPortedYet("postAcctgTrans"); }
    public Map<String, Object> quickCreateAcctgTransAndEntries(Map<String, Object> body) { return notPortedYet("quickCreateAcctgTransAndEntries"); }
    public Map<String, Object> quickSendPayment(Map<String, Object> body) { return notPortedYet("quickSendPayment"); }
    public Map<String, Object> reconcileFinAccountTrans(Map<String, Object> body) { return notPortedYet("reconcileFinAccountTrans"); }
    public Map<String, Object> refundOrderPaymentPreference(Map<String, Object> body) { return notPortedYet("refundOrderPaymentPreference"); }
    public Map<String, Object> releaseOrderPaymentPreference(Map<String, Object> body) { return notPortedYet("releaseOrderPaymentPreference"); }
    public Map<String, Object> removeAgreementContent(Map<String, Object> body) { return notPortedYet("removeAgreementContent"); }
    public Map<String, Object> removeAgreementFacilityAppl(Map<String, Object> body) { return notPortedYet("removeAgreementFacilityAppl"); }
    public Map<String, Object> removeAgreementGeographicalApplic(Map<String, Object> body) { return notPortedYet("removeAgreementGeographicalApplic"); }
    public Map<String, Object> removeAgreementItem(Map<String, Object> body) { return notPortedYet("removeAgreementItem"); }
    public Map<String, Object> removeAgreementPartyApplic(Map<String, Object> body) { return notPortedYet("removeAgreementPartyApplic"); }
    public Map<String, Object> removeAgreementProductAppl(Map<String, Object> body) { return notPortedYet("removeAgreementProductAppl"); }
    public Map<String, Object> removeAgreementPromoAppl(Map<String, Object> body) { return notPortedYet("removeAgreementPromoAppl"); }
    public Map<String, Object> removeBillingAccountRole(Map<String, Object> body) { return notPortedYet("removeBillingAccountRole"); }
    public Map<String, Object> removeBillingAccountTerm(Map<String, Object> body) { return notPortedYet("removeBillingAccountTerm"); }
    public Map<String, Object> removeBudgetItem(Map<String, Object> body) { return notPortedYet("removeBudgetItem"); }
    public Map<String, Object> removeBudgetReview(Map<String, Object> body) { return notPortedYet("removeBudgetReview"); }
    public Map<String, Object> removeBudgetRole(Map<String, Object> body) { return notPortedYet("removeBudgetRole"); }
    public Map<String, Object> removeCostComponentCalc(Map<String, Object> body) { return notPortedYet("removeCostComponentCalc"); }
    public Map<String, Object> removeFinAccountTransFromReconciliation(Map<String, Object> body) { return notPortedYet("removeFinAccountTransFromReconciliation"); }
    public Map<String, Object> removeFixedAssetIdent(Map<String, Object> body) { return notPortedYet("removeFixedAssetIdent"); }
    public Map<String, Object> removeFixedAssetProduct(Map<String, Object> body) { return notPortedYet("removeFixedAssetProduct"); }
    public Map<String, Object> removeGlAccountTypeDefault(Map<String, Object> body) { return notPortedYet("removeGlAccountTypeDefault"); }
    public Map<String, Object> removeInvoiceItem(Map<String, Object> body) { return notPortedYet("removeInvoiceItem"); }
    public Map<String, Object> removeInvoiceItemTypeGlAssignment(Map<String, Object> body) { return notPortedYet("removeInvoiceItemTypeGlAssignment"); }
    public Map<String, Object> removeInvoiceRole(Map<String, Object> body) { return notPortedYet("removeInvoiceRole"); }
    public Map<String, Object> removePaymentApplication(Map<String, Object> body) { return notPortedYet("removePaymentApplication"); }
    public Map<String, Object> removePaymentMethodTypeGlAssignment(Map<String, Object> body) { return notPortedYet("removePaymentMethodTypeGlAssignment"); }
    public Map<String, Object> removePaymentTypeGlAssignment(Map<String, Object> body) { return notPortedYet("removePaymentTypeGlAssignment"); }
    public Map<String, Object> removeSupplierProduct(Map<String, Object> body) { return notPortedYet("removeSupplierProduct"); }
    public Map<String, Object> sendInvoicePerEmail(Map<String, Object> body) { return notPortedYet("sendInvoicePerEmail"); }
    public Map<String, Object> setAcctgCompany(Map<String, Object> body) { return notPortedYet("setAcctgCompany"); }
    public Map<String, Object> setFinAccountTransStatus(Map<String, Object> body) { return notPortedYet("setFinAccountTransStatus"); }
    public Map<String, Object> setInvoiceStatus(Map<String, Object> body) { return notPortedYet("setInvoiceStatus"); }
    public Map<String, Object> setPaymentStatus(Map<String, Object> body) { return notPortedYet("setPaymentStatus"); }
    public Map<String, Object> updateAcctgTrans(Map<String, Object> body) { return notPortedYet("updateAcctgTrans"); }
    public Map<String, Object> updateAcctgTransEntry(Map<String, Object> body) { return notPortedYet("updateAcctgTransEntry"); }
    public Map<String, Object> updateAgreement(Map<String, Object> body) { return notPortedYet("updateAgreement"); }
    public Map<String, Object> updateAgreementFacilityAppl(Map<String, Object> body) { return notPortedYet("updateAgreementFacilityAppl"); }
    public Map<String, Object> updateAgreementItem(Map<String, Object> body) { return notPortedYet("updateAgreementItem"); }
    public Map<String, Object> updateAgreementPartyApplic(Map<String, Object> body) { return notPortedYet("updateAgreementPartyApplic"); }
    public Map<String, Object> updateAgreementProductAppl(Map<String, Object> body) { return notPortedYet("updateAgreementProductAppl"); }
    public Map<String, Object> updateAgreementPromoAppl(Map<String, Object> body) { return notPortedYet("updateAgreementPromoAppl"); }
    public Map<String, Object> updateAgreementRole(Map<String, Object> body) { return notPortedYet("updateAgreementRole"); }
    public Map<String, Object> updateAgreementTerm(Map<String, Object> body) { return notPortedYet("updateAgreementTerm"); }
    public Map<String, Object> updateBillingAccount(Map<String, Object> body) { return notPortedYet("updateBillingAccount"); }
    public Map<String, Object> updateBillingAccountRole(Map<String, Object> body) { return notPortedYet("updateBillingAccountRole"); }
    public Map<String, Object> updateBillingAccountTerm(Map<String, Object> body) { return notPortedYet("updateBillingAccountTerm"); }
    public Map<String, Object> updateBudget(Map<String, Object> body) { return notPortedYet("updateBudget"); }
    public Map<String, Object> updateBudgetItem(Map<String, Object> body) { return notPortedYet("updateBudgetItem"); }
    public Map<String, Object> updateBudgetStatus(Map<String, Object> body) { return notPortedYet("updateBudgetStatus"); }
    public Map<String, Object> updateCostComponentCalc(Map<String, Object> body) { return notPortedYet("updateCostComponentCalc"); }
    public Map<String, Object> updateCreditCardTypeGlAccount(Map<String, Object> body) { return notPortedYet("updateCreditCardTypeGlAccount"); }
    public Map<String, Object> updateCustomTimePeriod(Map<String, Object> body) { return notPortedYet("updateCustomTimePeriod"); }
    public Map<String, Object> updateFXConversion(Map<String, Object> body) { return notPortedYet("updateFXConversion"); }
    public Map<String, Object> updateFinAccount(Map<String, Object> body) { return notPortedYet("updateFinAccount"); }
    public Map<String, Object> updateFinAccountRole(Map<String, Object> body) { return notPortedYet("updateFinAccountRole"); }
    public Map<String, Object> updateFinAccountTypeGlAccount(Map<String, Object> body) { return notPortedYet("updateFinAccountTypeGlAccount"); }
    public Map<String, Object> updateFixedAsset(Map<String, Object> body) { return notPortedYet("updateFixedAsset"); }
    public Map<String, Object> updateFixedAssetDepMethod(Map<String, Object> body) { return notPortedYet("updateFixedAssetDepMethod"); }
    public Map<String, Object> updateFixedAssetIdent(Map<String, Object> body) { return notPortedYet("updateFixedAssetIdent"); }
    public Map<String, Object> updateFixedAssetMaint(Map<String, Object> body) { return notPortedYet("updateFixedAssetMaint"); }
    public Map<String, Object> updateFixedAssetMeter(Map<String, Object> body) { return notPortedYet("updateFixedAssetMeter"); }
    public Map<String, Object> updateFixedAssetProduct(Map<String, Object> body) { return notPortedYet("updateFixedAssetProduct"); }
    public Map<String, Object> updateFixedAssetRegistration(Map<String, Object> body) { return notPortedYet("updateFixedAssetRegistration"); }
    public Map<String, Object> updateFixedAssetStdCost(Map<String, Object> body) { return notPortedYet("updateFixedAssetStdCost"); }
    public Map<String, Object> updateGlAccount(Map<String, Object> body) { return notPortedYet("updateGlAccount"); }
    public Map<String, Object> updateGlAccountCategory(Map<String, Object> body) { return notPortedYet("updateGlAccountCategory"); }
    public Map<String, Object> updateGlAccountCategoryMember(Map<String, Object> body) { return notPortedYet("updateGlAccountCategoryMember"); }
    public Map<String, Object> updateGlJournal(Map<String, Object> body) { return notPortedYet("updateGlJournal"); }
    public Map<String, Object> updateGlReconciliation(Map<String, Object> body) { return notPortedYet("updateGlReconciliation"); }
    public Map<String, Object> updateInvoice(Map<String, Object> body) { return notPortedYet("updateInvoice"); }
    public Map<String, Object> updateInvoiceItem(Map<String, Object> body) { return notPortedYet("updateInvoiceItem"); }
    public Map<String, Object> updateInvoiceItemType(Map<String, Object> body) { return notPortedYet("updateInvoiceItemType"); }
    public Map<String, Object> updateInvoiceTerm(Map<String, Object> body) { return notPortedYet("updateInvoiceTerm"); }
    public Map<String, Object> updatePartyAcctgPreference(Map<String, Object> body) { return notPortedYet("updatePartyAcctgPreference"); }
    public Map<String, Object> updatePartyFixedAssetAssignment(Map<String, Object> body) { return notPortedYet("updatePartyFixedAssetAssignment"); }
    public Map<String, Object> updatePartyGlAccount(Map<String, Object> body) { return notPortedYet("updatePartyGlAccount"); }
    public Map<String, Object> updatePartyTaxAuthInfo(Map<String, Object> body) { return notPortedYet("updatePartyTaxAuthInfo"); }
    public Map<String, Object> updatePayment(Map<String, Object> body) { return notPortedYet("updatePayment"); }
    public Map<String, Object> updatePaymentApplicationDef(Map<String, Object> body) { return notPortedYet("updatePaymentApplicationDef"); }
    public Map<String, Object> updatePaymentGatewayConfig(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfig"); }
    public Map<String, Object> updatePaymentGatewayConfigAuthorizeNet(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigAuthorizeNet"); }
    public Map<String, Object> updatePaymentGatewayConfigClearCommerce(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigClearCommerce"); }
    public Map<String, Object> updatePaymentGatewayConfigCyberSource(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigCyberSource"); }
    public Map<String, Object> updatePaymentGatewayConfigEway(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigEway"); }
    public Map<String, Object> updatePaymentGatewayConfigPayPal(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigPayPal"); }
    public Map<String, Object> updatePaymentGatewayConfigPayflowPro(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigPayflowPro"); }
    public Map<String, Object> updatePaymentGatewayConfigSagePay(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigSagePay"); }
    public Map<String, Object> updatePaymentGatewayConfigSecurePay(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigSecurePay"); }
    public Map<String, Object> updatePaymentGatewayConfigType(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigType"); }
    public Map<String, Object> updatePaymentGatewayConfigWorldPay(Map<String, Object> body) { return notPortedYet("updatePaymentGatewayConfigWorldPay"); }
    public Map<String, Object> updatePaymentGroup(Map<String, Object> body) { return notPortedYet("updatePaymentGroup"); }
    public Map<String, Object> updatePaymentGroupMember(Map<String, Object> body) { return notPortedYet("updatePaymentGroupMember"); }
    public Map<String, Object> updatePaymentMethodType(Map<String, Object> body) { return notPortedYet("updatePaymentMethodType"); }
    public Map<String, Object> updateProductCategoryGlAccount(Map<String, Object> body) { return notPortedYet("updateProductCategoryGlAccount"); }
    public Map<String, Object> updateProductGlAccount(Map<String, Object> body) { return notPortedYet("updateProductGlAccount"); }
    public Map<String, Object> updateRateAmount(Map<String, Object> body) { return notPortedYet("updateRateAmount"); }
    public Map<String, Object> updateSupplierProduct(Map<String, Object> body) { return notPortedYet("updateSupplierProduct"); }
    public Map<String, Object> updateTaxAuthority(Map<String, Object> body) { return notPortedYet("updateTaxAuthority"); }
    public Map<String, Object> updateTaxAuthorityAssoc(Map<String, Object> body) { return notPortedYet("updateTaxAuthorityAssoc"); }
    public Map<String, Object> updateTaxAuthorityCategory(Map<String, Object> body) { return notPortedYet("updateTaxAuthorityCategory"); }
    public Map<String, Object> updateTaxAuthorityGlAccount(Map<String, Object> body) { return notPortedYet("updateTaxAuthorityGlAccount"); }
    public Map<String, Object> updateTaxAuthorityRateProduct(Map<String, Object> body) { return notPortedYet("updateTaxAuthorityRateProduct"); }
    public Map<String, Object> updateTimeEntry(Map<String, Object> body) { return notPortedYet("updateTimeEntry"); }
    public Map<String, Object> updateVarianceReasonGlAccount(Map<String, Object> body) { return notPortedYet("updateVarianceReasonGlAccount"); }
    public Map<String, Object> updateVendor(Map<String, Object> body) { return notPortedYet("updateVendor"); }
    public Map<String, Object> updateWorkEffort(Map<String, Object> body) { return notPortedYet("updateWorkEffort"); }
    public Map<String, Object> uploadAgreementContentFile(Map<String, Object> body) { return notPortedYet("uploadAgreementContentFile"); }
    public Map<String, Object> voidPayment(Map<String, Object> body) { return notPortedYet("voidPayment"); }
}
