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
@RequestMapping("/accounting")
public class AccountingController {

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/AdminMain")
    public ResponseEntity<Map<String, Object>> setAcctgCompany(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createReconcileAccount  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/EditGlReconciliation")
    public ResponseEntity<Map<String, Object>> createReconcileAccount(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/ImportExport")
    public ResponseEntity<Map<String, Object>> setAcctgCompanyImportExport(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Import an invoice with invoice items in csv format
     * <p>service: importInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/ImportInvoice")
    public ResponseEntity<Map<String, Object>> importInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/PartyAccountsSummary")
    public ResponseEntity<Map<String, Object>> setAcctgCompanyPartyAccountsSummary(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/PartyAcctgPreference")
    public ResponseEntity<Map<String, Object>> setAcctgCompanyPartyAcctgPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config
     * <p>service: updatePaymentGatewayConfig  entities: PaymentGatewayConfig  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfig")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Authorize Dot Net
     * <p>service: updatePaymentGatewayConfigAuthorizeNet  entities: PaymentGatewayAuthorizeNet  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigAuthorizeNet")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigAuthorizeNet(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Clear Commerce
     * <p>service: updatePaymentGatewayConfigClearCommerce  entities: PaymentGatewayClearCommerce  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigClearCommerce")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigClearCommerce(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config CyberSource
     * <p>service: updatePaymentGatewayConfigCyberSource  entities: PaymentGatewayCyberSource  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigCyberSource")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigCyberSource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePaymentGatewayConfigEway  entities: PaymentGatewayEway  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigEway")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigEway(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config PayPal
     * <p>service: updatePaymentGatewayConfigPayPal  entities: PaymentGatewayPayPal  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigPayPal")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigPayPal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Payflow Pro
     * <p>service: updatePaymentGatewayConfigPayflowPro  entities: PaymentGatewayPayflowPro  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigPayflowPro")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigPayflowPro(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config SagePay
     * <p>service: updatePaymentGatewayConfigSagePay  entities: PaymentGatewaySagePay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigSagePay")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigSagePay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config SecurePay
     * <p>service: updatePaymentGatewayConfigSecurePay  entities: PaymentGatewaySecurePay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigSecurePay")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigSecurePay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Type
     * <p>service: updatePaymentGatewayConfigType  entities: PaymentGatewayConfigType  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigType")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config WorldPay
     * <p>service: updatePaymentGatewayConfigWorldPay  entities: PaymentGatewayWorldPay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigWorldPay")
    public ResponseEntity<Map<String, Object>> updatePaymentGatewayConfigWorldPay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check For Outgoing/Incoming Payment And Create Payment Group Member
     * <p>service: createPaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/addDepositSlipMember")
    public ResponseEntity<Map<String, Object>> createPaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Fixed Asset
     * <p>service: addFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/addFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> addFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a default GL account number to a payment method type.
     * <p>service: addPaymentMethodTypeGlAssignment  entities: PaymentMethodTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addPaymentMethodTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> addPaymentMethodTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a default GL account type to a payment type.
     * <p>service: addPaymentTypeGlAssignment  entities: PaymentGlAccountTypeMap  auth: true
     */
    @PostMapping("/accounting/control/addPaymentTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> addPaymentTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a override GL account number to a invoice Itemtype for a certain organisation party.
     * <p>service: addInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addPurInvoiceItemTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> addInvoiceItemTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a override GL account number to a invoice Itemtype for a certain organisation party.
     * <p>service: addInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addSalInvoiceItemTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> addInvoiceItemTypeGlAssignmentAddSalInvoiceItemTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Call Tax Calculate Service
     * <p>service: addTaxOnInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/addtax")
    public ResponseEntity<Map<String, Object>> addTaxOnInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: assignGlRecToFinAccTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/assignGlRecToFinAccTrans")
    public ResponseEntity<Map<String, Object>> assignGlRecToFinAccTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: reconcileFinAccountTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/callReconcileFinAccountTrans")
    public ResponseEntity<Map<String, Object>> reconcileFinAccountTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire an Agreement
     * <p>service: expireAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/cancelAgreement")
    public ResponseEntity<Map<String, Object>> expireAgreement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel bank reconciliation.
     * <p>service: cancelBankReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelBankReconciliation")
    public ResponseEntity<Map<String, Object>> cancelBankReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel all payments for payment group
     * <p>service: cancelCheckRunPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelCheckRunPayments")
    public ResponseEntity<Map<String, Object>> cancelCheckRunPayments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a Fixed Asset Standard Cost
     * <p>service: cancelFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/cancelFixedAssetStdCost")
    public ResponseEntity<Map<String, Object>> cancelFixedAssetStdCost(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * cancel payment batch
     * <p>service: cancelPaymentBatch  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelPaymentGroup")
    public ResponseEntity<Map<String, Object>> cancelPaymentBatch(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel bank reconciliation.
     * <p>service: cancelBankReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelReconciliation")
    public ResponseEntity<Map<String, Object>> cancelBankReconciliationCancelReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Captures (settles) pre-authorized order payments by invoice
     * <p>service: capturePaymentsByInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/capturePaymentsByInvoice")
    public ResponseEntity<Map<String, Object>> capturePaymentsByInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Close a financial time period
     * <p>service: closeFinancialTimePeriod  entities: CustomTimePeriod  auth: true
     */
    @PostMapping("/accounting/control/closeFinancialTimePeriod")
    public ResponseEntity<Map<String, Object>> closeFinancialTimePeriod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Completes, if possible, the AcctgTransEntries using the mappings defined in the gl setup
     * <p>service: completeAcctgTransEntries  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/completeAcctgTransEntries")
    public ResponseEntity<Map<String, Object>> completeAcctgTransEntries(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Acctg Trans And Entry(Duplicate or revert)
     * <p>service: copyAcctgTransAndEntries  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/copyAcctgTransAndEntries")
    public ResponseEntity<Map<String, Object>> copyAcctgTransAndEntries(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy an Agreement
     * <p>service: copyAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/copyAgreement")
    public ResponseEntity<Map<String, Object>> copyAgreement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record/items from an existing invoice
     * <p>service: copyInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/copyInvoice")
    public ResponseEntity<Map<String, Object>> copyInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Save a Invoice data to a template.
     * <p>service: copyInvoiceToTemplate  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/copyInvoiceToTemplate")
    public ResponseEntity<Map<String, Object>> copyInvoiceToTemplate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a AcctgTrans record with isPosted set to "N"
     * <p>service: createAcctgTrans  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/createAcctgTrans")
    public ResponseEntity<Map<String, Object>> createAcctgTrans(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add an Entry to a AcctgTrans. Will use baseCurrencyUomId in PartyAcctgPreference if no currencyUomId is in parameters.
     * <p>service: createAcctgTransEntry  entities: AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/createAcctgTransEntry")
    public ResponseEntity<Map<String, Object>> createAcctgTransEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Agreement
     * <p>service: createAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/createAgreement")
    public ResponseEntity<Map<String, Object>> createAgreement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementGeographicalApplic
     * <p>service: createAgreementGeographicalApplic  entities: AgreementGeographicalApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementGeographicalApplic")
    public ResponseEntity<Map<String, Object>> createAgreementGeographicalApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementItem
     * <p>service: createAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItem")
    public ResponseEntity<Map<String, Object>> createAgreementItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementFacilityAppl
     * <p>service: createAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemFacility")
    public ResponseEntity<Map<String, Object>> createAgreementFacilityAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementPartyApplic
     * <p>service: createAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemParty")
    public ResponseEntity<Map<String, Object>> createAgreementPartyApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementProductAppl
     * <p>service: createAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemProduct")
    public ResponseEntity<Map<String, Object>> createAgreementProductAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new SupplierProduct record
     * <p>service: createSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemSupplierProduct")
    public ResponseEntity<Map<String, Object>> createSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementTerm
     * <p>service: createAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemTerm")
    public ResponseEntity<Map<String, Object>> createAgreementTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementPromoAppl
     * <p>service: createAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementPromoAppl")
    public ResponseEntity<Map<String, Object>> createAgreementPromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Agreement Role
     * <p>service: createAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/createAgreementRole")
    public ResponseEntity<Map<String, Object>> createAgreementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementTerm
     * <p>service: createAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/createAgreementTerm")
    public ResponseEntity<Map<String, Object>> createAgreementTermCreateAgreementTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create AgreementWorkEffortApplic
     * <p>service: createAgreementWorkEffortApplic  entities: AgreementWorkEffortApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementWorkEffortApplic")
    public ResponseEntity<Map<String, Object>> createAgreementWorkEffortApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account
     * <p>service: createBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccount")
    public ResponseEntity<Map<String, Object>> createBillingAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createBillingAccountAndRole  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountAndRole")
    public ResponseEntity<Map<String, Object>> createBillingAccountAndRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account Role
     * <p>service: createBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountRole")
    public ResponseEntity<Map<String, Object>> createBillingAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account Term
     * <p>service: createBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountTerm")
    public ResponseEntity<Map<String, Object>> createBillingAccountTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Budget
     * <p>service: createBudget  entities: Budget  auth: true
     */
    @PostMapping("/accounting/control/createBudget")
    public ResponseEntity<Map<String, Object>> createBudget(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Budget Item
     * <p>service: createBudgetItem  entities: BudgetItem  auth: true
     */
    @PostMapping("/accounting/control/createBudgetItem")
    public ResponseEntity<Map<String, Object>> createBudgetItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Budget Review Record
     * <p>service: createBudgetReview  entities: BudgetReview  auth: true
     */
    @PostMapping("/accounting/control/createBudgetReview")
    public ResponseEntity<Map<String, Object>> createBudgetReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Budget Role Record
     * <p>service: createBudgetRole  entities: BudgetRole  auth: true
     */
    @PostMapping("/accounting/control/createBudgetRole")
    public ResponseEntity<Map<String, Object>> createBudgetRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CostComponentCalc
     * <p>service: createCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/createCostComponentCalc")
    public ResponseEntity<Map<String, Object>> createCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create a Credit Card Gl Account
     * <p>service: createCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createCreditCardTypeGlAccount")
    public ResponseEntity<Map<String, Object>> createCreditCardTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CustomTimePeriod record
     * <p>service: createCustomTimePeriod  entities: CustomTimePeriod  auth: true
     */
    @PostMapping("/accounting/control/createCustomTimePeriod")
    public ResponseEntity<Map<String, Object>> createCustomTimePeriod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createDepositPayment")
    public ResponseEntity<Map<String, Object>> createPaymentAndFinAccountTrans(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account. If no finAccountId is provided, an auto-sequenced one will be used.
     * <p>service: createFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/createFinAccount")
    public ResponseEntity<Map<String, Object>> createFinAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Lower level service for creating authorization against a fin account. Will use current time for authorizationDate and thruDate if not supplied.
     * <p>service: createFinAccountAuth  entities: FinAccountAuth  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountAuth")
    public ResponseEntity<Map<String, Object>> createFinAccountAuth(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account Role
     * <p>service: createFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountRole")
    public ResponseEntity<Map<String, Object>> createFinAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account Transaction. Will use current timestamp for entryDate and trasanctionDate if none is provided.
     * <p>service: createFinAccountTrans  entities: FinAccountTrans  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountTrans")
    public ResponseEntity<Map<String, Object>> createFinAccountTrans(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FinAccountTypeGlAccount
     * <p>service: createFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountTypeGlAccount")
    public ResponseEntity<Map<String, Object>> createFinAccountTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset
     * <p>service: createFixedAsset  entities: FixedAsset  auth: true
     */
    @PostMapping("/accounting/control/createFixedAsset")
    public ResponseEntity<Map<String, Object>> createFixedAsset(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Depreciation Method
     * <p>service: createFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetDepMethod")
    public ResponseEntity<Map<String, Object>> createFixedAssetDepMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Identification
     * <p>service: createFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetIdent")
    public ResponseEntity<Map<String, Object>> createFixedAssetIdent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Maintenance
     * <p>service: createFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMaint")
    public ResponseEntity<Map<String, Object>> createFixedAssetMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Maintenance Order
     * <p>service: createFixedAssetMaintOrder  entities: FixedAssetMaintOrder  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMaintOrder")
    public ResponseEntity<Map<String, Object>> createFixedAssetMaintOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed asset Meter
     * <p>service: createFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMeter")
    public ResponseEntity<Map<String, Object>> createFixedAssetMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Registration
     * <p>service: createFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetRegistration")
    public ResponseEntity<Map<String, Object>> createFixedAssetRegistration(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Standard Cost
     * <p>service: createFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetStdCost")
    public ResponseEntity<Map<String, Object>> createFixedAssetStdCost(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Type Gl Account Mapping
     * <p>service: createFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetTypeGlAccount")
    public ResponseEntity<Map<String, Object>> createFixedAssetTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Type Gl Account Mapping
     * <p>service: createFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetTypeGlAccountForFixedAsset")
    public ResponseEntity<Map<String, Object>> createFixedAssetTypeGlAccountCreateFixedAssetTypeGlAccountForFixedAsset(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlAccount record
     * <p>service: createGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/createGlAccount")
    public ResponseEntity<Map<String, Object>> createGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create GL Account Category
     * <p>service: createGlAccountCategory  entities: GlAccountCategory  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountCategory")
    public ResponseEntity<Map<String, Object>> createGlAccountCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create GL Account Category Member
     * <p>service: createGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountCategoryMember")
    public ResponseEntity<Map<String, Object>> createGlAccountCategoryMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlAccount record
     * <p>service: createGlAccountOrganization  entities: GlAccountOrganization  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountOrganization")
    public ResponseEntity<Map<String, Object>> createGlAccountOrganization(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Define a default GL account for an Account Type for a certain organisation party.
     * <p>service: createGlAccountTypeDefault  entities: GlAccountTypeDefault  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountTypeDefault")
    public ResponseEntity<Map<String, Object>> createGlAccountTypeDefault(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlJournal record
     * <p>service: createGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/createGlJournal")
    public ResponseEntity<Map<String, Object>> createGlJournal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlReconciliation record
     * <p>service: createGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/createGlReconciliation")
    public ResponseEntity<Map<String, Object>> createGlReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/createInvoice")
    public ResponseEntity<Map<String, Object>> createInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Invoice Item Record
     * <p>service: createInvoiceItem  entities: InvoiceItem  auth: true
     */
    @PostMapping("/accounting/control/createInvoiceItem")
    public ResponseEntity<Map<String, Object>> createInvoiceItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createInvoiceItemPayrol  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/createInvoiceItemPayrol")
    public ResponseEntity<Map<String, Object>> createInvoiceItemPayrol(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Invoice Role Record
     * <p>service: createInvoiceRole  entities: InvoiceRole  auth: true
     */
    @PostMapping("/accounting/control/createInvoiceRole")
    public ResponseEntity<Map<String, Object>> createInvoiceRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice (Item) Term Record
     * <p>service: createInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/createInvoiceTerm")
    public ResponseEntity<Map<String, Object>> createInvoiceTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityGlAccount
     * <p>service: createTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<Map<String, Object>> createTaxAuthorityGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create accounting preferences for a party (organization)
     * <p>service: createPartyAcctgPreference  entities: PartyAcctgPreference  auth: true
     */
    @PostMapping("/accounting/control/createPartyAcctgPreference")
    public ResponseEntity<Map<String, Object>> createPartyAcctgPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party to a Fixed Asset
     * <p>service: createPartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/createPartyFixedAssetAssignment")
    public ResponseEntity<Map<String, Object>> createPartyFixedAssetAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Associate a party to a General Ledger Account
     * <p>service: createPartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createPartyGlAccount")
    public ResponseEntity<Map<String, Object>> createPartyGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a documentType preference for a party (organization)
     * <p>service: createPartyPrefDocTypeTpl  entities: PartyPrefDocTypeTpl  auth: true
     */
    @PostMapping("/accounting/control/createPartyPrefDocTypeTpl")
    public ResponseEntity<Map<String, Object>> createPartyPrefDocTypeTpl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPayment")
    public ResponseEntity<Map<String, Object>> createPaymentAndFinAccountTransCreatePayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a payment and a payment application for the full amount
     * <p>service: createPaymentAndApplication  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/createPaymentAndAssociateToBillingAccount")
    public ResponseEntity<Map<String, Object>> createPaymentAndApplication(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a payment application
     * <p>service: createPaymentApplication  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPaymentApplication")
    public ResponseEntity<Map<String, Object>> createPaymentApplication(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check the valid(unbatched) payment and create batch for same
     * <p>service: checkAndCreateBatchForValidPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPaymentBatch")
    public ResponseEntity<Map<String, Object>> checkAndCreateBatchForValidPayments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Payment Group
     * <p>service: createPaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/createPaymentGroup")
    public ResponseEntity<Map<String, Object>> createPaymentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check For Outgoing/Incoming Payment And Create Payment Group Member
     * <p>service: createPaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/createPaymentGroupMember")
    public ResponseEntity<Map<String, Object>> createPaymentGroupMemberCreatePaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductCategoryGlAccount
     * <p>service: createProductCategoryGlAccount  entities: ProductCategoryGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createProductCategoryGlAccount")
    public ResponseEntity<Map<String, Object>> createProductCategoryGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductGlAccount
     * <p>service: createProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createProductGlAccount")
    public ResponseEntity<Map<String, Object>> createProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthority
     * <p>service: createTaxAuthority  entities: TaxAuthority  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthority")
    public ResponseEntity<Map<String, Object>> createTaxAuthority(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityAssoc
     * <p>service: createTaxAuthorityAssoc  entities: TaxAuthorityAssoc  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityAssoc")
    public ResponseEntity<Map<String, Object>> createTaxAuthorityAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityCategory
     * <p>service: createTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityCategory")
    public ResponseEntity<Map<String, Object>> createTaxAuthorityCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityGlAccount
     * <p>service: createTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityGlAccount")
    public ResponseEntity<Map<String, Object>> createTaxAuthorityGlAccountCreateTaxAuthorityGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create PartyTaxAuthInfo
     * <p>service: createPartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityPartyInfo")
    public ResponseEntity<Map<String, Object>> createPartyTaxAuthInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityRateProduct
     * <p>service: createTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityRateProduct")
    public ResponseEntity<Map<String, Object>> createTaxAuthorityRateProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createUpdateCostCenter  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/createUpdateCostCenter")
    public ResponseEntity<Map<String, Object>> createUpdateCostCenter(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create a Variance Reason Gl Account
     * <p>service: createVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createVarianceReasonGlAccount")
    public ResponseEntity<Map<String, Object>> createVarianceReasonGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createWithdrawalPayment")
    public ResponseEntity<Map<String, Object>> createPaymentAndFinAccountTransCreateWithdrawalPayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort Entity and assign to a party
     * <p>service: createWorkEffortAndPartyAssign  entities: WorkEffort  auth: true
     */
    @PostMapping("/accounting/control/createWorkEffortAndPartyAssign")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndPartyAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an Entry from a AcctgTrans
     * <p>service: deleteAcctgTransEntry  entities: AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/deleteAcctgTransEntry")
    public ResponseEntity<Map<String, Object>> deleteAcctgTransEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Agreement Role
     * <p>service: deleteAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementRole")
    public ResponseEntity<Map<String, Object>> deleteAgreementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an AgreementTerm
     * <p>service: deleteAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementTerm")
    public ResponseEntity<Map<String, Object>> deleteAgreementTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementWorkEffortApplic
     * <p>service: deleteAgreementWorkEffortApplic  entities: AgreementWorkEffortApplic  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementWorkEffortApplic")
    public ResponseEntity<Map<String, Object>> deleteAgreementWorkEffortApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Billing Account Role
     * <p>service: removeBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/deleteBillingAccountRole")
    public ResponseEntity<Map<String, Object>> removeBillingAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a CostComponentCalc
     * <p>service: removeCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/deleteCostComponentCalc")
    public ResponseEntity<Map<String, Object>> removeCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete a Credit Card Gl Account
     * <p>service: deleteCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteCreditCardTypeGlAccount")
    public ResponseEntity<Map<String, Object>> deleteCreditCardTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a CustomTimePeriod record
     * <p>service: deleteCustomTimePeriod  entities: CustomTimePeriod  auth: true
     */
    @PostMapping("/accounting/control/deleteCustomTimePeriod")
    public ResponseEntity<Map<String, Object>> deleteCustomTimePeriod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * cancel payment batch
     * <p>service: cancelPaymentBatch  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/deleteDepositSlip")
    public ResponseEntity<Map<String, Object>> cancelPaymentBatchDeleteDepositSlip(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Financial Account
     * <p>service: deleteFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccount")
    public ResponseEntity<Map<String, Object>> deleteFinAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FinAccountRole
     * <p>service: deleteFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccountRole")
    public ResponseEntity<Map<String, Object>> deleteFinAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FinAccountTypeGlAccount
     * <p>service: deleteFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccountTypeGlAccount")
    public ResponseEntity<Map<String, Object>> deleteFinAccountTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Depreciation Method
     * <p>service: deleteFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetDepMethod")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetDepMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance
     * <p>service: deleteFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMaint")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance Order
     * <p>service: deleteFixedAssetMaintOrder  entities: FixedAssetMaintOrder  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMaintOrder")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetMaintOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance Meter
     * <p>service: deleteFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMeter")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Registration
     * <p>service: deleteFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetRegistration")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetRegistration(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Type Gl Account Mapping
     * <p>service: deleteFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetTypeGlAccount")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Type Gl Account Mapping
     * <p>service: deleteFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetTypeGlAccountForFixedAsset")
    public ResponseEntity<Map<String, Object>> deleteFixedAssetTypeGlAccountDeleteFixedAssetTypeGlAccountForFixedAsset(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete GL Account Category Member
     * <p>service: deleteGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/deleteGlAccountCategoryMember")
    public ResponseEntity<Map<String, Object>> deleteGlAccountCategoryMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a GlJournal record
     * <p>service: deleteGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/deleteGlJournal")
    public ResponseEntity<Map<String, Object>> deleteGlJournal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Invoice (Item) Term Record
     * <p>service: deleteInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/deleteInvoiceTerm")
    public ResponseEntity<Map<String, Object>> deleteInvoiceTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityGlAccount
     * <p>service: deleteTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<Map<String, Object>> deleteTaxAuthorityGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Party to Fixed Asset
     * <p>service: deletePartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/deletePartyFixedAssetAssignment")
    public ResponseEntity<Map<String, Object>> deletePartyFixedAssetAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an existing General Ledger Account of a Party
     * <p>service: deletePartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deletePartyGlAccount")
    public ResponseEntity<Map<String, Object>> deletePartyGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Payment Group
     * <p>service: deletePaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/deletePaymentGroup")
    public ResponseEntity<Map<String, Object>> deletePaymentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductCategoryGlAccount
     * <p>service: deleteProductCategoryGlAccount  entities: ProductCategoryGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteProductCategoryGlAccount")
    public ResponseEntity<Map<String, Object>> deleteProductCategoryGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductGlAccount
     * <p>service: deleteProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteProductGlAccount")
    public ResponseEntity<Map<String, Object>> deleteProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityAssoc
     * <p>service: deleteTaxAuthorityAssoc  entities: TaxAuthorityAssoc  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityAssoc")
    public ResponseEntity<Map<String, Object>> deleteTaxAuthorityAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityCategory
     * <p>service: deleteTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityCategory")
    public ResponseEntity<Map<String, Object>> deleteTaxAuthorityCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityGlAccount
     * <p>service: deleteTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityGlAccount")
    public ResponseEntity<Map<String, Object>> deleteTaxAuthorityGlAccountDeleteTaxAuthorityGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PartyTaxAuthInfo
     * <p>service: deletePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityPartyInfo")
    public ResponseEntity<Map<String, Object>> deletePartyTaxAuthInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityRateProduct
     * <p>service: deleteTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityRateProduct")
    public ResponseEntity<Map<String, Object>> deleteTaxAuthorityRateProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete a Variance Reason Gl Account
     * <p>service: deleteVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteVarianceReasonGlAccount")
    public ResponseEntity<Map<String, Object>> deleteVarianceReasonGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deposit withdraw payments
     * <p>service: depositWithdrawPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/depositWithdrawPayments")
    public ResponseEntity<Map<String, Object>> depositWithdrawPayments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send an invoice per email
     * <p>service: sendInvoicePerEmail  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/executeSendPerEmail")
    public ResponseEntity<Map<String, Object>> sendInvoicePerEmail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire a Payment Group Member
     * <p>service: expirePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/expireDepositSlipMember")
    public ResponseEntity<Map<String, Object>> expirePaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expires a fin account authorization. Will use current time if no time is supplied in parameter
     * <p>service: expireFinAccountAuth  entities: FinAccountAuth  auth: true
     */
    @PostMapping("/accounting/control/expireFinAccountAuth")
    public ResponseEntity<Map<String, Object>> expireFinAccountAuth(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a documentType preference for a party (organization)
     * <p>service: expirePartyPrefDocTypeTpl  entities: PartyPrefDocTypeTpl  auth: true
     */
    @PostMapping("/accounting/control/expirePartyPrefDocTypeTpl")
    public ResponseEntity<Map<String, Object>> expirePartyPrefDocTypeTpl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire a Payment Group Member
     * <p>service: expirePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/expirePaymentGroupMember")
    public ResponseEntity<Map<String, Object>> expirePaymentGroupMemberExpirePaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire Rate Amount
     * <p>service: expireRateAmount  entities: RateAmount  auth: true
     */
    @PostMapping("/accounting/control/expireRateAmount")
    public ResponseEntity<Map<String, Object>> expireRateAmount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getFinAccountTransRunningTotalAndBalances  entities: unknown  auth: -
     */
    @GetMapping("/accounting/control/getFinAccountTransRunningTotalAndBalances")
    public ResponseEntity<Map<String, Object>> getFinAccountTransRunningTotalAndBalances(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * calculate running total for selected Invoices
     * <p>service: getInvoiceRunningTotal  entities: unknown  auth: -
     */
    @PostMapping("/accounting/control/getInvoiceRunningTotal")
    public ResponseEntity<Map<String, Object>> getInvoiceRunningTotal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * calculate running total for payments
     * <p>service: getPaymentRunningTotal  entities: unknown  auth: -
     */
    @PostMapping("/accounting/control/getPaymentRunningTotal")
    public ResponseEntity<Map<String, Object>> getPaymentRunningTotal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Post a AcctgTrans and related entries. This will make sure that the time period is not closed and that the sum of the debits and credits are equal.
     * <p>service: postAcctgTrans  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/postAcctgTrans")
    public ResponseEntity<Map<String, Object>> postAcctgTrans(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Process (authorizes/re-authorizes) a single payment for an order with an optional overrideAmount
     * <p>service: authOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processAuthorizeTransaction")
    public ResponseEntity<Map<String, Object>> authOrderPaymentPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Captures (settles) pre-authorized order payments, re-authorizing any remaining balance. If the order involves billing accounts, capture to it in full before proceeding to other payment preferences.
     * <p>service: captureOrderPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processCaptureTransaction")
    public ResponseEntity<Map<String, Object>> captureOrderPayments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create commission invoice for the list of sales invoices. Returns a List of Maps, one for each invoice created containing: commissionInvoiceId: the invoiceId of the invoice created salesRepresentative: the invoice partyIdFrom
     * <p>service: createCommissionInvoices  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processCommissionRun")
    public ResponseEntity<Map<String, Object>> createCommissionInvoices(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Direct link to payment processors to force manual transactions; not logged in system
     * <p>service: manualForcedCcTransaction  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processManualCcTx")
    public ResponseEntity<Map<String, Object>> manualForcedCcTransaction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Refund payment authorization for a single OrderPaymentPreference
     * <p>service: refundOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processRefundTransaction")
    public ResponseEntity<Map<String, Object>> refundOrderPaymentPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Releases payment authorization for a single OrderPaymentPreference
     * <p>service: releaseOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processReleaseTransaction")
    public ResponseEntity<Map<String, Object>> releaseOrderPaymentPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an AcctgTrans and two offsetting AcctgTransEntry records
     * <p>service: quickCreateAcctgTransAndEntries  entities: AcctgTrans, AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/quickCreateAcctgTransAndEntries")
    public ResponseEntity<Map<String, Object>> quickCreateAcctgTransAndEntries(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickSendPayment  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/quickSendPayment")
    public ResponseEntity<Map<String, Object>> quickSendPayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: reconcileFinAccountTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/reconcileFinAccountTrans")
    public ResponseEntity<Map<String, Object>> reconcileFinAccountTransReconcileFinAccountTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Agreement
     * <p>service: removeAgreementContent  entities: AgreementContent  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementContent")
    public ResponseEntity<Map<String, Object>> removeAgreementContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementGeographicalApplic
     * <p>service: removeAgreementGeographicalApplic  entities: AgreementGeographicalApplic  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementGeographicalApplic")
    public ResponseEntity<Map<String, Object>> removeAgreementGeographicalApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementItem
     * <p>service: removeAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItem")
    public ResponseEntity<Map<String, Object>> removeAgreementItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementFacilityAppl
     * <p>service: removeAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemFacility")
    public ResponseEntity<Map<String, Object>> removeAgreementFacilityAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementPartyApplic
     * <p>service: removeAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemParty")
    public ResponseEntity<Map<String, Object>> removeAgreementPartyApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementProductAppl
     * <p>service: removeAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemProduct")
    public ResponseEntity<Map<String, Object>> removeAgreementProductAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a SupplierProduct record
     * <p>service: removeSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemSupplierProduct")
    public ResponseEntity<Map<String, Object>> removeSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an AgreementTerm
     * <p>service: deleteAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemTerm")
    public ResponseEntity<Map<String, Object>> deleteAgreementTermRemoveAgreementItemTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementPromoAppl
     * <p>service: removeAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementPromoAppl")
    public ResponseEntity<Map<String, Object>> removeAgreementPromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Billing Account Term
     * <p>service: removeBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/removeBillingAccountTerm")
    public ResponseEntity<Map<String, Object>> removeBillingAccountTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Item Record
     * <p>service: removeBudgetItem  entities: BudgetItem  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetItem")
    public ResponseEntity<Map<String, Object>> removeBudgetItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Review Record
     * <p>service: removeBudgetReview  entities: BudgetReview  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetReview")
    public ResponseEntity<Map<String, Object>> removeBudgetReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Role Record
     * <p>service: removeBudgetRole  entities: BudgetRole  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetRole")
    public ResponseEntity<Map<String, Object>> removeBudgetRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove finaAccountTrans association with gl reconciliation
     * <p>service: removeFinAccountTransFromReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/removeFinAccountTransFromReconciliation")
    public ResponseEntity<Map<String, Object>> removeFinAccountTransFromReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Identification
     * <p>service: removeFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/removeFixedAssetIdent")
    public ResponseEntity<Map<String, Object>> removeFixedAssetIdent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Fixed Asset
     * <p>service: removeFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/removeFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> removeFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account for an Account Type for a certain organisation party.
     * <p>service: removeGlAccountTypeDefault  entities: GlAccountTypeDefault  auth: true
     */
    @PostMapping("/accounting/control/removeGlAccountTypeDefault")
    public ResponseEntity<Map<String, Object>> removeGlAccountTypeDefault(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a paymentApplication record.
     * <p>service: removePaymentApplication  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceApplication")
    public ResponseEntity<Map<String, Object>> removePaymentApplication(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Invoice Item Record
     * <p>service: removeInvoiceItem  entities: InvoiceItem  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceItem")
    public ResponseEntity<Map<String, Object>> removeInvoiceItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Invoice Role Record
     * <p>service: removeInvoiceRole  entities: InvoiceRole  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceRole")
    public ResponseEntity<Map<String, Object>> removeInvoiceRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a paymentApplication record.
     * <p>service: removePaymentApplication  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/removePaymentApplication")
    public ResponseEntity<Map<String, Object>> removePaymentApplicationRemovePaymentApplication(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account number from a payment method type.
     * <p>service: removePaymentMethodTypeGlAssignment  entities: PaymentMethodTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removePaymentMethodTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> removePaymentMethodTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account type from a payment type.
     * <p>service: removePaymentTypeGlAssignment  entities: PaymentGlAccountTypeMap  auth: true
     */
    @PostMapping("/accounting/control/removePaymentTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> removePaymentTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a override GL account number to a invoice type for a certain organisation party.
     * <p>service: removeInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removePurInvoiceItemTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> removeInvoiceItemTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a override GL account number to a invoice type for a certain organisation party.
     * <p>service: removeInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removeSalInvoiceItemTypeGlAssignment")
    public ResponseEntity<Map<String, Object>> removeInvoiceItemTypeGlAssignmentRemoveSalInvoiceItemTypeGlAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove finaAccountTrans association with gl reconciliation
     * <p>service: removeFinAccountTransFromReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/reomveFinAccountTransAssociation")
    public ResponseEntity<Map<String, Object>> removeFinAccountTransFromReconciliationReomveFinAccountTransAssociation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set financial account transaction status
     * <p>service: setFinAccountTransStatus  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/setFinAccountTransStatus")
    public ResponseEntity<Map<String, Object>> setFinAccountTransStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Invoice Status
     * <p>service: setInvoiceStatus  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/setInvoiceStatus")
    public ResponseEntity<Map<String, Object>> setInvoiceStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of a Payment
     * <p>service: setPaymentStatus  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/setPaymentStatus")
    public ResponseEntity<Map<String, Object>> setPaymentStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates TimeEntry
     * <p>service: updateTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/accounting/control/unlinkInvoiceFromTimeEntry")
    public ResponseEntity<Map<String, Object>> updateTimeEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a AcctgTrans record
     * <p>service: updateAcctgTrans  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/updateAcctgTrans")
    public ResponseEntity<Map<String, Object>> updateAcctgTrans(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Entry to a AcctgTrans record
     * <p>service: updateAcctgTransEntry  entities: AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/updateAcctgTransEntry")
    public ResponseEntity<Map<String, Object>> updateAcctgTransEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Agreement
     * <p>service: updateAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/updateAgreement")
    public ResponseEntity<Map<String, Object>> updateAgreement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementItem
     * <p>service: updateAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItem")
    public ResponseEntity<Map<String, Object>> updateAgreementItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementFacilityAppl
     * <p>service: updateAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemFacility")
    public ResponseEntity<Map<String, Object>> updateAgreementFacilityAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementPartyApplic
     * <p>service: updateAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemParty")
    public ResponseEntity<Map<String, Object>> updateAgreementPartyApplic(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementProductAppl
     * <p>service: updateAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemProduct")
    public ResponseEntity<Map<String, Object>> updateAgreementProductAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SupplierProduct record
     * <p>service: updateSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemSupplierProduct")
    public ResponseEntity<Map<String, Object>> updateSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementTerm
     * <p>service: updateAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemTerm")
    public ResponseEntity<Map<String, Object>> updateAgreementTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementPromoAppl
     * <p>service: updateAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementPromoAppl")
    public ResponseEntity<Map<String, Object>> updateAgreementPromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Agreement Role
     * <p>service: updateAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementRole")
    public ResponseEntity<Map<String, Object>> updateAgreementRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementTerm
     * <p>service: updateAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementTerm")
    public ResponseEntity<Map<String, Object>> updateAgreementTermUpdateAgreementTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account
     * <p>service: updateBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccount")
    public ResponseEntity<Map<String, Object>> updateBillingAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account Role
     * <p>service: updateBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccountRole")
    public ResponseEntity<Map<String, Object>> updateBillingAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account Term
     * <p>service: updateBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccountTerm")
    public ResponseEntity<Map<String, Object>> updateBillingAccountTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Budget
     * <p>service: updateBudget  entities: Budget  auth: true
     */
    @PostMapping("/accounting/control/updateBudget")
    public ResponseEntity<Map<String, Object>> updateBudget(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateBudgetItem  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/updateBudgetItem")
    public ResponseEntity<Map<String, Object>> updateBudgetItem(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Budget
     * <p>service: updateBudgetStatus  entities: BudgetStatus  auth: true
     */
    @PostMapping("/accounting/control/updateBudgetStatus")
    public ResponseEntity<Map<String, Object>> updateBudgetStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CostComponentCalc
     * <p>service: updateCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/updateCostComponentCalc")
    public ResponseEntity<Map<String, Object>> updateCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Credit Card Gl Account
     * <p>service: updateCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateCreditCardTypeGlAccount")
    public ResponseEntity<Map<String, Object>> updateCreditCardTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CustomTimePeriod record
     * <p>service: updateCustomTimePeriod  entities: CustomTimePeriod  auth: true
     */
    @PostMapping("/accounting/control/updateCustomTimePeriod")
    public ResponseEntity<Map<String, Object>> updateCustomTimePeriod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group
     * <p>service: updatePaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/updateDepositSlip")
    public ResponseEntity<Map<String, Object>> updatePaymentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group Member
     * <p>service: updatePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/updateDepositSlipMember")
    public ResponseEntity<Map<String, Object>> updatePaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the conversion rate between two currencies and expire the old conversion rates
     * <p>service: updateFXConversion  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/updateFXConversion")
    public ResponseEntity<Map<String, Object>> updateFXConversion(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Financial Account
     * <p>service: updateFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccount")
    public ResponseEntity<Map<String, Object>> updateFinAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlReconciliation record
     * <p>service: updateGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountGlReconciliation")
    public ResponseEntity<Map<String, Object>> updateGlReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FinAccountRole
     * <p>service: updateFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountRole")
    public ResponseEntity<Map<String, Object>> updateFinAccountRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FinAccountTypeGlAccount
     * <p>service: updateFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountTypeGlAccount")
    public ResponseEntity<Map<String, Object>> updateFinAccountTypeGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset
     * <p>service: updateFixedAsset  entities: FixedAsset  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAsset")
    public ResponseEntity<Map<String, Object>> updateFixedAsset(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Depreciation Method
     * <p>service: updateFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetDepMethod")
    public ResponseEntity<Map<String, Object>> updateFixedAssetDepMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Identification
     * <p>service: updateFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetIdent")
    public ResponseEntity<Map<String, Object>> updateFixedAssetIdent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Maintenance
     * <p>service: updateFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetMaint")
    public ResponseEntity<Map<String, Object>> updateFixedAssetMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed asset Meter
     * <p>service: updateFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetMeter")
    public ResponseEntity<Map<String, Object>> updateFixedAssetMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the Product to Fixed Asset information
     * <p>service: updateFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> updateFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Registration
     * <p>service: updateFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetRegistration")
    public ResponseEntity<Map<String, Object>> updateFixedAssetRegistration(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Standard Cost
     * <p>service: updateFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetStdCost")
    public ResponseEntity<Map<String, Object>> updateFixedAssetStdCost(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlAccount record
     * <p>service: updateGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccount")
    public ResponseEntity<Map<String, Object>> updateGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update GL Account Category
     * <p>service: updateGlAccountCategory  entities: GlAccountCategory  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountCategory")
    public ResponseEntity<Map<String, Object>> updateGlAccountCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update GL Account Category Member
     * <p>service: updateGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountCategoryMember")
    public ResponseEntity<Map<String, Object>> updateGlAccountCategoryMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlAccount record
     * <p>service: updateGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountOrganization")
    public ResponseEntity<Map<String, Object>> updateGlAccountUpdateGlAccountOrganization(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlJournal record
     * <p>service: updateGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/updateGlJournal")
    public ResponseEntity<Map<String, Object>> updateGlJournal(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlReconciliation record
     * <p>service: updateGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/updateGlReconciliation")
    public ResponseEntity<Map<String, Object>> updateGlReconciliationUpdateGlReconciliation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing Invoice Record
     * <p>service: updateInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/updateInvoice")
    public ResponseEntity<Map<String, Object>> updateInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a payment to a Invoice or other payment or Billing account or Taxauthority, If no ammountApplied is supplied the system will calculate and use the maximum possible value.
     * <p>service: updatePaymentApplicationDef  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceApplication")
    public ResponseEntity<Map<String, Object>> updatePaymentApplicationDef(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateInvoiceItem  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/updateInvoiceItem")
    public ResponseEntity<Map<String, Object>> updateInvoiceItem(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Invoice Item Type Record
     * <p>service: updateInvoiceItemType  entities: InvoiceItemType  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceItemType")
    public ResponseEntity<Map<String, Object>> updateInvoiceItemType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Invoice (Item) Term Record
     * <p>service: updateInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceTerm")
    public ResponseEntity<Map<String, Object>> updateInvoiceTerm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityGlAccount
     * <p>service: updateTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<Map<String, Object>> updateTaxAuthorityGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update accounting preferences for a party (organization)
     * <p>service: updatePartyAcctgPreference  entities: PartyAcctgPreference  auth: true
     */
    @PostMapping("/accounting/control/updatePartyAcctgPreference")
    public ResponseEntity<Map<String, Object>> updatePartyAcctgPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party to Fixed Asset
     * <p>service: updatePartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/updatePartyFixedAssetAssignment")
    public ResponseEntity<Map<String, Object>> updatePartyFixedAssetAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing General Ledger Account of a Party
     * <p>service: updatePartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updatePartyGlAccount")
    public ResponseEntity<Map<String, Object>> updatePartyGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment
     * <p>service: updatePayment  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/updatePayment")
    public ResponseEntity<Map<String, Object>> updatePayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a payment to a Invoice or other payment or Billing account or Taxauthority, If no ammountApplied is supplied the system will calculate and use the maximum possible value.
     * <p>service: updatePaymentApplicationDef  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentApplication")
    public ResponseEntity<Map<String, Object>> updatePaymentApplicationDefUpdatePaymentApplication(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group
     * <p>service: updatePaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentGroup")
    public ResponseEntity<Map<String, Object>> updatePaymentGroupUpdatePaymentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group Member
     * <p>service: updatePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentGroupMember")
    public ResponseEntity<Map<String, Object>> updatePaymentGroupMemberUpdatePaymentGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Method Type
     * <p>service: updatePaymentMethodType  entities: PaymentMethodType  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentMethodType")
    public ResponseEntity<Map<String, Object>> updatePaymentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCategoryGlAccount
     * <p>service: updateProductCategoryGlAccount  entities: ProductCategoryGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateProductCategoryGlAccount")
    public ResponseEntity<Map<String, Object>> updateProductCategoryGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductGlAccount
     * <p>service: updateProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateProductGlAccount")
    public ResponseEntity<Map<String, Object>> updateProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create/update Rate Amount
     * <p>service: updateRateAmount  entities: RateAmount  auth: true
     */
    @PostMapping("/accounting/control/updateRateAmount")
    public ResponseEntity<Map<String, Object>> updateRateAmount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthority
     * <p>service: updateTaxAuthority  entities: TaxAuthority  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthority")
    public ResponseEntity<Map<String, Object>> updateTaxAuthority(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityAssoc
     * <p>service: updateTaxAuthorityAssoc  entities: TaxAuthorityAssoc  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityAssoc")
    public ResponseEntity<Map<String, Object>> updateTaxAuthorityAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityCategory
     * <p>service: updateTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityCategory")
    public ResponseEntity<Map<String, Object>> updateTaxAuthorityCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update PartyTaxAuthInfo
     * <p>service: updatePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityPartyInfo")
    public ResponseEntity<Map<String, Object>> updatePartyTaxAuthInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityRateProduct
     * <p>service: updateTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityRateProduct")
    public ResponseEntity<Map<String, Object>> updateTaxAuthorityRateProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Variance Reason Gl Account
     * <p>service: updateVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateVarianceReasonGlAccount")
    public ResponseEntity<Map<String, Object>> updateVarianceReasonGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/accounting/control/updateWorkEffort")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Upload and attach a file to an agreement
     * <p>service: uploadAgreementContentFile  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/uploadAgreementContent")
    public ResponseEntity<Map<String, Object>> uploadAgreementContentFile(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets payment status to PMNT_VOID, removes all PaymentApplications, changes related invoice statuses to INVOICE_READY if status is INVOICE_PAID, and reverses related AcctgTrans by calling copyAcctgTransAndEntries service
     * <p>service: voidPayment  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/voidPayment")
    public ResponseEntity<Map<String, Object>> voidPayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel all payments for payment group
     * <p>service: cancelCheckRunPayments  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/cancelCheckRunPayments")
    public ResponseEntity<Map<String, Object>> cancelCheckRunPaymentsCancelCheckRunPayments(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/ap/control/createInvoice")
    public ResponseEntity<Map<String, Object>> createInvoiceCreateInvoice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/createPayment")
    public ResponseEntity<Map<String, Object>> createPaymentAndFinAccountTransCreatePayment2(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Vendor Information
     * <p>service: createVendor  entities: Vendor  auth: true
     */
    @PostMapping("/ap/control/createVendor")
    public ResponseEntity<Map<String, Object>> createVendor(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set status of invoices in bulk.
     * <p>service: massChangeInvoiceStatus  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/massChangeInvoiceStatus")
    public ResponseEntity<Map<String, Object>> massChangeInvoiceStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates Payments, Payment Application and Payment Group for the same
     * <p>service: createPaymentAndPaymentGroupForInvoices  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/processMassCheckRun")
    public ResponseEntity<Map<String, Object>> createPaymentAndPaymentGroupForInvoices(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Vendor Information
     * <p>service: updateVendor  entities: Vendor  auth: true
     */
    @PostMapping("/ap/control/updateVendor")
    public ResponseEntity<Map<String, Object>> updateVendor(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * cancel payment batch
     * <p>service: cancelPaymentBatch  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/cancelPaymentGroup")
    public ResponseEntity<Map<String, Object>> cancelPaymentBatchCancelPaymentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/ar/control/createInvoice")
    public ResponseEntity<Map<String, Object>> createInvoiceCreateInvoice2(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/createPayment")
    public ResponseEntity<Map<String, Object>> createPaymentAndFinAccountTransCreatePayment3(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deposit withdraw payments
     * <p>service: depositWithdrawPayments  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/createPaymentBatch")
    public ResponseEntity<Map<String, Object>> depositWithdrawPaymentsCreatePaymentBatch(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set status of invoices in bulk.
     * <p>service: massChangeInvoiceStatus  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/massChangeInvoiceStatus")
    public ResponseEntity<Map<String, Object>> massChangeInvoiceStatusMassChangeInvoiceStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set status of Payments in bulk.
     * <p>service: massChangePaymentStatus  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/massChangePaymentStatus")
    public ResponseEntity<Map<String, Object>> massChangePaymentStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
