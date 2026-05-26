package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.accounting.AddFixedAssetProductRequest;
import com.landawn.ofbiz.model.accounting.AddFixedAssetProductResponse;
import com.landawn.ofbiz.model.accounting.AddInvoiceItemTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.AddInvoiceItemTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.AddPaymentMethodTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.AddPaymentMethodTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.AddPaymentTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.AddPaymentTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.AddTaxOnInvoiceRequest;
import com.landawn.ofbiz.model.accounting.AddTaxOnInvoiceResponse;
import com.landawn.ofbiz.model.accounting.AssignGlRecToFinAccTransResponse;
import com.landawn.ofbiz.model.accounting.AuthOrderPaymentPreferenceRequest;
import com.landawn.ofbiz.model.accounting.AuthOrderPaymentPreferenceResponse;
import com.landawn.ofbiz.model.accounting.CancelBankReconciliationRequest;
import com.landawn.ofbiz.model.accounting.CancelBankReconciliationResponse;
import com.landawn.ofbiz.model.accounting.CancelCheckRunPaymentsRequest;
import com.landawn.ofbiz.model.accounting.CancelCheckRunPaymentsResponse;
import com.landawn.ofbiz.model.accounting.CancelFixedAssetStdCostRequest;
import com.landawn.ofbiz.model.accounting.CancelFixedAssetStdCostResponse;
import com.landawn.ofbiz.model.accounting.CancelPaymentBatchRequest;
import com.landawn.ofbiz.model.accounting.CancelPaymentBatchResponse;
import com.landawn.ofbiz.model.accounting.CaptureOrderPaymentsRequest;
import com.landawn.ofbiz.model.accounting.CaptureOrderPaymentsResponse;
import com.landawn.ofbiz.model.accounting.CapturePaymentsByInvoiceRequest;
import com.landawn.ofbiz.model.accounting.CapturePaymentsByInvoiceResponse;
import com.landawn.ofbiz.model.accounting.CheckAndCreateBatchForValidPaymentsRequest;
import com.landawn.ofbiz.model.accounting.CheckAndCreateBatchForValidPaymentsResponse;
import com.landawn.ofbiz.model.accounting.CloseFinancialTimePeriodRequest;
import com.landawn.ofbiz.model.accounting.CloseFinancialTimePeriodResponse;
import com.landawn.ofbiz.model.accounting.CompleteAcctgTransEntriesRequest;
import com.landawn.ofbiz.model.accounting.CompleteAcctgTransEntriesResponse;
import com.landawn.ofbiz.model.accounting.CopyAcctgTransAndEntriesRequest;
import com.landawn.ofbiz.model.accounting.CopyAcctgTransAndEntriesResponse;
import com.landawn.ofbiz.model.accounting.CopyAgreementRequest;
import com.landawn.ofbiz.model.accounting.CopyAgreementResponse;
import com.landawn.ofbiz.model.accounting.CopyInvoiceRequest;
import com.landawn.ofbiz.model.accounting.CopyInvoiceResponse;
import com.landawn.ofbiz.model.accounting.CopyInvoiceToTemplateRequest;
import com.landawn.ofbiz.model.accounting.CopyInvoiceToTemplateResponse;
import com.landawn.ofbiz.model.accounting.CreateAcctgTransEntryRequest;
import com.landawn.ofbiz.model.accounting.CreateAcctgTransEntryResponse;
import com.landawn.ofbiz.model.accounting.CreateAcctgTransRequest;
import com.landawn.ofbiz.model.accounting.CreateAcctgTransResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementFacilityApplRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementFacilityApplResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementGeographicalApplicRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementGeographicalApplicResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementItemRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementItemResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementPartyApplicRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementPartyApplicResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementProductApplRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementProductApplResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementPromoApplRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementPromoApplResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementTermRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementTermResponse;
import com.landawn.ofbiz.model.accounting.CreateAgreementWorkEffortApplicRequest;
import com.landawn.ofbiz.model.accounting.CreateAgreementWorkEffortApplicResponse;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountAndRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountAndRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountTermRequest;
import com.landawn.ofbiz.model.accounting.CreateBillingAccountTermResponse;
import com.landawn.ofbiz.model.accounting.CreateBudgetItemRequest;
import com.landawn.ofbiz.model.accounting.CreateBudgetItemResponse;
import com.landawn.ofbiz.model.accounting.CreateBudgetRequest;
import com.landawn.ofbiz.model.accounting.CreateBudgetResponse;
import com.landawn.ofbiz.model.accounting.CreateBudgetReviewRequest;
import com.landawn.ofbiz.model.accounting.CreateBudgetReviewResponse;
import com.landawn.ofbiz.model.accounting.CreateBudgetRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateBudgetRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateCommissionInvoicesRequest;
import com.landawn.ofbiz.model.accounting.CreateCommissionInvoicesResponse;
import com.landawn.ofbiz.model.accounting.CreateCostComponentCalcRequest;
import com.landawn.ofbiz.model.accounting.CreateCostComponentCalcResponse;
import com.landawn.ofbiz.model.accounting.CreateCreditCardTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateCreditCardTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateFinAccountAuthRequest;
import com.landawn.ofbiz.model.accounting.CreateFinAccountAuthResponse;
import com.landawn.ofbiz.model.accounting.CreateFinAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateFinAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateFinAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateFinAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateFinAccountTransRequest;
import com.landawn.ofbiz.model.accounting.CreateFinAccountTransResponse;
import com.landawn.ofbiz.model.accounting.CreateFinAccountTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateFinAccountTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetDepMethodRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetDepMethodResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetIdentRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetIdentResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMaintOrderRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMaintOrderResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMaintRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMaintResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMeterRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetMeterResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetRegistrationRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetRegistrationResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetStdCostRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetStdCostResponse;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateFixedAssetTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateGlAccountCategoryMemberRequest;
import com.landawn.ofbiz.model.accounting.CreateGlAccountCategoryMemberResponse;
import com.landawn.ofbiz.model.accounting.CreateGlAccountCategoryRequest;
import com.landawn.ofbiz.model.accounting.CreateGlAccountCategoryResponse;
import com.landawn.ofbiz.model.accounting.CreateGlAccountOrganizationRequest;
import com.landawn.ofbiz.model.accounting.CreateGlAccountOrganizationResponse;
import com.landawn.ofbiz.model.accounting.CreateGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateGlAccountTypeDefaultRequest;
import com.landawn.ofbiz.model.accounting.CreateGlAccountTypeDefaultResponse;
import com.landawn.ofbiz.model.accounting.CreateGlJournalRequest;
import com.landawn.ofbiz.model.accounting.CreateGlJournalResponse;
import com.landawn.ofbiz.model.accounting.CreateGlReconciliationRequest;
import com.landawn.ofbiz.model.accounting.CreateGlReconciliationResponse;
import com.landawn.ofbiz.model.accounting.CreateInvoiceItemRequest;
import com.landawn.ofbiz.model.accounting.CreateInvoiceItemResponse;
import com.landawn.ofbiz.model.accounting.CreateInvoiceRequest;
import com.landawn.ofbiz.model.accounting.CreateInvoiceResponse;
import com.landawn.ofbiz.model.accounting.CreateInvoiceRoleRequest;
import com.landawn.ofbiz.model.accounting.CreateInvoiceRoleResponse;
import com.landawn.ofbiz.model.accounting.CreateInvoiceTermRequest;
import com.landawn.ofbiz.model.accounting.CreateInvoiceTermResponse;
import com.landawn.ofbiz.model.accounting.CreatePartyAcctgPreferenceRequest;
import com.landawn.ofbiz.model.accounting.CreatePartyAcctgPreferenceResponse;
import com.landawn.ofbiz.model.accounting.CreatePartyFixedAssetAssignmentRequest;
import com.landawn.ofbiz.model.accounting.CreatePartyFixedAssetAssignmentResponse;
import com.landawn.ofbiz.model.accounting.CreatePartyGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreatePartyGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreatePartyPrefDocTypeTplRequest;
import com.landawn.ofbiz.model.accounting.CreatePartyPrefDocTypeTplResponse;
import com.landawn.ofbiz.model.accounting.CreatePartyTaxAuthInfoRequest;
import com.landawn.ofbiz.model.accounting.CreatePartyTaxAuthInfoResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndApplicationRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndApplicationResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndFinAccountTransRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndFinAccountTransResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndPaymentGroupForInvoicesRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentAndPaymentGroupForInvoicesResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentApplicationRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentApplicationResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentGroupMemberRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentGroupMemberResponse;
import com.landawn.ofbiz.model.accounting.CreatePaymentGroupRequest;
import com.landawn.ofbiz.model.accounting.CreatePaymentGroupResponse;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityAssocRequest;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityAssocResponse;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityCategoryRequest;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityCategoryResponse;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityGlAccountResponse;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityRateProductRequest;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityRateProductResponse;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityRequest;
import com.landawn.ofbiz.model.accounting.CreateTaxAuthorityResponse;
import com.landawn.ofbiz.model.accounting.CreateUpdateCostCenterResponse;
import com.landawn.ofbiz.model.accounting.CreateVarianceReasonGlAccountRequest;
import com.landawn.ofbiz.model.accounting.CreateVarianceReasonGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteAcctgTransEntryRequest;
import com.landawn.ofbiz.model.accounting.DeleteAcctgTransEntryResponse;
import com.landawn.ofbiz.model.accounting.DeleteAgreementRoleRequest;
import com.landawn.ofbiz.model.accounting.DeleteAgreementRoleResponse;
import com.landawn.ofbiz.model.accounting.DeleteAgreementTermRequest;
import com.landawn.ofbiz.model.accounting.DeleteAgreementTermResponse;
import com.landawn.ofbiz.model.accounting.DeleteAgreementWorkEffortApplicRequest;
import com.landawn.ofbiz.model.accounting.DeleteAgreementWorkEffortApplicResponse;
import com.landawn.ofbiz.model.accounting.DeleteCreditCardTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteCreditCardTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteFinAccountTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetDepMethodRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetDepMethodResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMaintOrderRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMaintOrderResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMaintRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMaintResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMeterRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetMeterResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetRegistrationRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetRegistrationResponse;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteFixedAssetTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteGlAccountCategoryMemberRequest;
import com.landawn.ofbiz.model.accounting.DeleteGlAccountCategoryMemberResponse;
import com.landawn.ofbiz.model.accounting.DeleteGlJournalRequest;
import com.landawn.ofbiz.model.accounting.DeleteGlJournalResponse;
import com.landawn.ofbiz.model.accounting.DeleteInvoiceTermRequest;
import com.landawn.ofbiz.model.accounting.DeleteInvoiceTermResponse;
import com.landawn.ofbiz.model.accounting.DeletePartyFixedAssetAssignmentRequest;
import com.landawn.ofbiz.model.accounting.DeletePartyFixedAssetAssignmentResponse;
import com.landawn.ofbiz.model.accounting.DeletePartyGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeletePartyGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeletePartyTaxAuthInfoRequest;
import com.landawn.ofbiz.model.accounting.DeletePartyTaxAuthInfoResponse;
import com.landawn.ofbiz.model.accounting.DeletePaymentGroupRequest;
import com.landawn.ofbiz.model.accounting.DeletePaymentGroupResponse;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityAssocRequest;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityAssocResponse;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityCategoryRequest;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityCategoryResponse;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityRateProductRequest;
import com.landawn.ofbiz.model.accounting.DeleteTaxAuthorityRateProductResponse;
import com.landawn.ofbiz.model.accounting.DeleteVarianceReasonGlAccountRequest;
import com.landawn.ofbiz.model.accounting.DeleteVarianceReasonGlAccountResponse;
import com.landawn.ofbiz.model.accounting.DepositWithdrawPaymentsRequest;
import com.landawn.ofbiz.model.accounting.DepositWithdrawPaymentsResponse;
import com.landawn.ofbiz.model.accounting.ExpireAgreementRequest;
import com.landawn.ofbiz.model.accounting.ExpireAgreementResponse;
import com.landawn.ofbiz.model.accounting.ExpireFinAccountAuthRequest;
import com.landawn.ofbiz.model.accounting.ExpireFinAccountAuthResponse;
import com.landawn.ofbiz.model.accounting.ExpirePartyPrefDocTypeTplRequest;
import com.landawn.ofbiz.model.accounting.ExpirePartyPrefDocTypeTplResponse;
import com.landawn.ofbiz.model.accounting.ExpirePaymentGroupMemberRequest;
import com.landawn.ofbiz.model.accounting.ExpirePaymentGroupMemberResponse;
import com.landawn.ofbiz.model.accounting.ExpireRateAmountRequest;
import com.landawn.ofbiz.model.accounting.ExpireRateAmountResponse;
import com.landawn.ofbiz.model.accounting.GetFinAccountTransRunningTotalAndBalancesResponse;
import com.landawn.ofbiz.model.accounting.GetInvoiceRunningTotalRequest;
import com.landawn.ofbiz.model.accounting.GetInvoiceRunningTotalResponse;
import com.landawn.ofbiz.model.accounting.GetPaymentRunningTotalRequest;
import com.landawn.ofbiz.model.accounting.GetPaymentRunningTotalResponse;
import com.landawn.ofbiz.model.accounting.ImportInvoiceRequest;
import com.landawn.ofbiz.model.accounting.ImportInvoiceResponse;
import com.landawn.ofbiz.model.accounting.ManualForcedCcTransactionRequest;
import com.landawn.ofbiz.model.accounting.ManualForcedCcTransactionResponse;
import com.landawn.ofbiz.model.accounting.MassChangeInvoiceStatusRequest;
import com.landawn.ofbiz.model.accounting.MassChangeInvoiceStatusResponse;
import com.landawn.ofbiz.model.accounting.MassChangePaymentStatusRequest;
import com.landawn.ofbiz.model.accounting.MassChangePaymentStatusResponse;
import com.landawn.ofbiz.model.accounting.PostAcctgTransRequest;
import com.landawn.ofbiz.model.accounting.PostAcctgTransResponse;
import com.landawn.ofbiz.model.accounting.QuickCreateAcctgTransAndEntriesRequest;
import com.landawn.ofbiz.model.accounting.QuickCreateAcctgTransAndEntriesResponse;
import com.landawn.ofbiz.model.accounting.QuickSendPaymentResponse;
import com.landawn.ofbiz.model.accounting.ReconcileFinAccountTransResponse;
import com.landawn.ofbiz.model.accounting.RefundOrderPaymentPreferenceRequest;
import com.landawn.ofbiz.model.accounting.RefundOrderPaymentPreferenceResponse;
import com.landawn.ofbiz.model.accounting.ReleaseOrderPaymentPreferenceRequest;
import com.landawn.ofbiz.model.accounting.ReleaseOrderPaymentPreferenceResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementContentRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementContentResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementFacilityApplRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementFacilityApplResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementGeographicalApplicRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementGeographicalApplicResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementItemRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementItemResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementPartyApplicRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementPartyApplicResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementProductApplRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementProductApplResponse;
import com.landawn.ofbiz.model.accounting.RemoveAgreementPromoApplRequest;
import com.landawn.ofbiz.model.accounting.RemoveAgreementPromoApplResponse;
import com.landawn.ofbiz.model.accounting.RemoveBillingAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.RemoveBillingAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.RemoveBillingAccountTermRequest;
import com.landawn.ofbiz.model.accounting.RemoveBillingAccountTermResponse;
import com.landawn.ofbiz.model.accounting.RemoveBudgetItemRequest;
import com.landawn.ofbiz.model.accounting.RemoveBudgetItemResponse;
import com.landawn.ofbiz.model.accounting.RemoveBudgetReviewRequest;
import com.landawn.ofbiz.model.accounting.RemoveBudgetReviewResponse;
import com.landawn.ofbiz.model.accounting.RemoveBudgetRoleRequest;
import com.landawn.ofbiz.model.accounting.RemoveBudgetRoleResponse;
import com.landawn.ofbiz.model.accounting.RemoveCostComponentCalcRequest;
import com.landawn.ofbiz.model.accounting.RemoveCostComponentCalcResponse;
import com.landawn.ofbiz.model.accounting.RemoveFinAccountTransFromReconciliationRequest;
import com.landawn.ofbiz.model.accounting.RemoveFinAccountTransFromReconciliationResponse;
import com.landawn.ofbiz.model.accounting.RemoveFixedAssetIdentRequest;
import com.landawn.ofbiz.model.accounting.RemoveFixedAssetIdentResponse;
import com.landawn.ofbiz.model.accounting.RemoveFixedAssetProductRequest;
import com.landawn.ofbiz.model.accounting.RemoveFixedAssetProductResponse;
import com.landawn.ofbiz.model.accounting.RemoveGlAccountTypeDefaultRequest;
import com.landawn.ofbiz.model.accounting.RemoveGlAccountTypeDefaultResponse;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceItemRequest;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceItemResponse;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceItemTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceItemTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceRoleRequest;
import com.landawn.ofbiz.model.accounting.RemoveInvoiceRoleResponse;
import com.landawn.ofbiz.model.accounting.RemovePaymentApplicationRequest;
import com.landawn.ofbiz.model.accounting.RemovePaymentApplicationResponse;
import com.landawn.ofbiz.model.accounting.RemovePaymentMethodTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.RemovePaymentMethodTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.RemovePaymentTypeGlAssignmentRequest;
import com.landawn.ofbiz.model.accounting.RemovePaymentTypeGlAssignmentResponse;
import com.landawn.ofbiz.model.accounting.SendInvoicePerEmailRequest;
import com.landawn.ofbiz.model.accounting.SendInvoicePerEmailResponse;
import com.landawn.ofbiz.model.accounting.SetAcctgCompanyRequest;
import com.landawn.ofbiz.model.accounting.SetAcctgCompanyResponse;
import com.landawn.ofbiz.model.accounting.SetFinAccountTransStatusRequest;
import com.landawn.ofbiz.model.accounting.SetFinAccountTransStatusResponse;
import com.landawn.ofbiz.model.accounting.SetInvoiceStatusRequest;
import com.landawn.ofbiz.model.accounting.SetInvoiceStatusResponse;
import com.landawn.ofbiz.model.accounting.SetPaymentStatusRequest;
import com.landawn.ofbiz.model.accounting.SetPaymentStatusResponse;
import com.landawn.ofbiz.model.accounting.UpdateAcctgTransEntryRequest;
import com.landawn.ofbiz.model.accounting.UpdateAcctgTransEntryResponse;
import com.landawn.ofbiz.model.accounting.UpdateAcctgTransRequest;
import com.landawn.ofbiz.model.accounting.UpdateAcctgTransResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementFacilityApplRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementFacilityApplResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementItemRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementItemResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementPartyApplicRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementPartyApplicResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementProductApplRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementProductApplResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementPromoApplRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementPromoApplResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementRoleRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementRoleResponse;
import com.landawn.ofbiz.model.accounting.UpdateAgreementTermRequest;
import com.landawn.ofbiz.model.accounting.UpdateAgreementTermResponse;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountTermRequest;
import com.landawn.ofbiz.model.accounting.UpdateBillingAccountTermResponse;
import com.landawn.ofbiz.model.accounting.UpdateBudgetItemResponse;
import com.landawn.ofbiz.model.accounting.UpdateBudgetRequest;
import com.landawn.ofbiz.model.accounting.UpdateBudgetResponse;
import com.landawn.ofbiz.model.accounting.UpdateBudgetStatusRequest;
import com.landawn.ofbiz.model.accounting.UpdateBudgetStatusResponse;
import com.landawn.ofbiz.model.accounting.UpdateCostComponentCalcRequest;
import com.landawn.ofbiz.model.accounting.UpdateCostComponentCalcResponse;
import com.landawn.ofbiz.model.accounting.UpdateCreditCardTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateCreditCardTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateFXConversionRequest;
import com.landawn.ofbiz.model.accounting.UpdateFXConversionResponse;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountRoleRequest;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountRoleResponse;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountTypeGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateFinAccountTypeGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetDepMethodRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetDepMethodResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetIdentRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetIdentResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetMaintRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetMaintResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetMeterRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetMeterResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetProductRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetProductResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetRegistrationRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetRegistrationResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetResponse;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetStdCostRequest;
import com.landawn.ofbiz.model.accounting.UpdateFixedAssetStdCostResponse;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountCategoryMemberRequest;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountCategoryMemberResponse;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountCategoryRequest;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountCategoryResponse;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateGlJournalRequest;
import com.landawn.ofbiz.model.accounting.UpdateGlJournalResponse;
import com.landawn.ofbiz.model.accounting.UpdateGlReconciliationRequest;
import com.landawn.ofbiz.model.accounting.UpdateGlReconciliationResponse;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceItemResponse;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceItemTypeRequest;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceItemTypeResponse;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceRequest;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceResponse;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceTermRequest;
import com.landawn.ofbiz.model.accounting.UpdateInvoiceTermResponse;
import com.landawn.ofbiz.model.accounting.UpdatePartyAcctgPreferenceRequest;
import com.landawn.ofbiz.model.accounting.UpdatePartyAcctgPreferenceResponse;
import com.landawn.ofbiz.model.accounting.UpdatePartyFixedAssetAssignmentRequest;
import com.landawn.ofbiz.model.accounting.UpdatePartyFixedAssetAssignmentResponse;
import com.landawn.ofbiz.model.accounting.UpdatePartyGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdatePartyGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdatePartyTaxAuthInfoRequest;
import com.landawn.ofbiz.model.accounting.UpdatePartyTaxAuthInfoResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentApplicationDefRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentApplicationDefResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigAuthorizeNetRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigAuthorizeNetResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigClearCommerceRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigClearCommerceResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigCyberSourceRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigCyberSourceResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigEwayRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigEwayResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigPayPalRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigPayPalResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigPayflowProRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigPayflowProResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigSagePayRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigSagePayResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigSecurePayRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigSecurePayResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigTypeRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigTypeResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigWorldPayRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGatewayConfigWorldPayResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGroupMemberRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGroupMemberResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGroupRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentGroupResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentMethodTypeRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentMethodTypeResponse;
import com.landawn.ofbiz.model.accounting.UpdatePaymentRequest;
import com.landawn.ofbiz.model.accounting.UpdatePaymentResponse;
import com.landawn.ofbiz.model.accounting.UpdateRateAmountRequest;
import com.landawn.ofbiz.model.accounting.UpdateRateAmountResponse;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityAssocRequest;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityAssocResponse;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityCategoryRequest;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityCategoryResponse;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityRateProductRequest;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityRateProductResponse;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityRequest;
import com.landawn.ofbiz.model.accounting.UpdateTaxAuthorityResponse;
import com.landawn.ofbiz.model.accounting.UpdateVarianceReasonGlAccountRequest;
import com.landawn.ofbiz.model.accounting.UpdateVarianceReasonGlAccountResponse;
import com.landawn.ofbiz.model.accounting.UploadAgreementContentFileRequest;
import com.landawn.ofbiz.model.accounting.UploadAgreementContentFileResponse;
import com.landawn.ofbiz.model.accounting.VoidPaymentRequest;
import com.landawn.ofbiz.model.accounting.VoidPaymentResponse;
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

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/AdminMain")
    public ResponseEntity<SetAcctgCompanyResponse> setAcctgCompany(@RequestBody SetAcctgCompanyRequest request) {
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
    public ResponseEntity<SetAcctgCompanyResponse> setAcctgCompanyImportExport(@RequestBody SetAcctgCompanyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Import an invoice with invoice items in csv format
     * <p>service: importInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/ImportInvoice")
    public ResponseEntity<ImportInvoiceResponse> importInvoice(@RequestBody ImportInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/PartyAccountsSummary")
    public ResponseEntity<SetAcctgCompanyResponse> setAcctgCompanyPartyAccountsSummary(@RequestBody SetAcctgCompanyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Accounting Company when select
     * <p>service: setAcctgCompany  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/PartyAcctgPreference")
    public ResponseEntity<SetAcctgCompanyResponse> setAcctgCompanyPartyAcctgPreference(@RequestBody SetAcctgCompanyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config
     * <p>service: updatePaymentGatewayConfig  entities: PaymentGatewayConfig  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfig")
    public ResponseEntity<UpdatePaymentGatewayConfigResponse> updatePaymentGatewayConfig(@RequestBody UpdatePaymentGatewayConfigRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Authorize Dot Net
     * <p>service: updatePaymentGatewayConfigAuthorizeNet  entities: PaymentGatewayAuthorizeNet  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigAuthorizeNet")
    public ResponseEntity<UpdatePaymentGatewayConfigAuthorizeNetResponse> updatePaymentGatewayConfigAuthorizeNet(@RequestBody UpdatePaymentGatewayConfigAuthorizeNetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Clear Commerce
     * <p>service: updatePaymentGatewayConfigClearCommerce  entities: PaymentGatewayClearCommerce  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigClearCommerce")
    public ResponseEntity<UpdatePaymentGatewayConfigClearCommerceResponse> updatePaymentGatewayConfigClearCommerce(@RequestBody UpdatePaymentGatewayConfigClearCommerceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config CyberSource
     * <p>service: updatePaymentGatewayConfigCyberSource  entities: PaymentGatewayCyberSource  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigCyberSource")
    public ResponseEntity<UpdatePaymentGatewayConfigCyberSourceResponse> updatePaymentGatewayConfigCyberSource(@RequestBody UpdatePaymentGatewayConfigCyberSourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePaymentGatewayConfigEway  entities: PaymentGatewayEway  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigEway")
    public ResponseEntity<UpdatePaymentGatewayConfigEwayResponse> updatePaymentGatewayConfigEway(@RequestBody UpdatePaymentGatewayConfigEwayRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config PayPal
     * <p>service: updatePaymentGatewayConfigPayPal  entities: PaymentGatewayPayPal  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigPayPal")
    public ResponseEntity<UpdatePaymentGatewayConfigPayPalResponse> updatePaymentGatewayConfigPayPal(@RequestBody UpdatePaymentGatewayConfigPayPalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Payflow Pro
     * <p>service: updatePaymentGatewayConfigPayflowPro  entities: PaymentGatewayPayflowPro  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigPayflowPro")
    public ResponseEntity<UpdatePaymentGatewayConfigPayflowProResponse> updatePaymentGatewayConfigPayflowPro(@RequestBody UpdatePaymentGatewayConfigPayflowProRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config SagePay
     * <p>service: updatePaymentGatewayConfigSagePay  entities: PaymentGatewaySagePay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigSagePay")
    public ResponseEntity<UpdatePaymentGatewayConfigSagePayResponse> updatePaymentGatewayConfigSagePay(@RequestBody UpdatePaymentGatewayConfigSagePayRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config SecurePay
     * <p>service: updatePaymentGatewayConfigSecurePay  entities: PaymentGatewaySecurePay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigSecurePay")
    public ResponseEntity<UpdatePaymentGatewayConfigSecurePayResponse> updatePaymentGatewayConfigSecurePay(@RequestBody UpdatePaymentGatewayConfigSecurePayRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config Type
     * <p>service: updatePaymentGatewayConfigType  entities: PaymentGatewayConfigType  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigType")
    public ResponseEntity<UpdatePaymentGatewayConfigTypeResponse> updatePaymentGatewayConfigType(@RequestBody UpdatePaymentGatewayConfigTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Payment Gateway Config WorldPay
     * <p>service: updatePaymentGatewayConfigWorldPay  entities: PaymentGatewayWorldPay  auth: true
     */
    @PostMapping("/accounting/control/UpdatePaymentGatewayConfigWorldPay")
    public ResponseEntity<UpdatePaymentGatewayConfigWorldPayResponse> updatePaymentGatewayConfigWorldPay(@RequestBody UpdatePaymentGatewayConfigWorldPayRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check For Outgoing/Incoming Payment And Create Payment Group Member
     * <p>service: createPaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/addDepositSlipMember")
    public ResponseEntity<CreatePaymentGroupMemberResponse> createPaymentGroupMember(@RequestBody CreatePaymentGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Fixed Asset
     * <p>service: addFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/addFixedAssetProduct")
    public ResponseEntity<AddFixedAssetProductResponse> addFixedAssetProduct(@RequestBody AddFixedAssetProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a default GL account number to a payment method type.
     * <p>service: addPaymentMethodTypeGlAssignment  entities: PaymentMethodTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addPaymentMethodTypeGlAssignment")
    public ResponseEntity<AddPaymentMethodTypeGlAssignmentResponse> addPaymentMethodTypeGlAssignment(@RequestBody AddPaymentMethodTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a default GL account type to a payment type.
     * <p>service: addPaymentTypeGlAssignment  entities: PaymentGlAccountTypeMap  auth: true
     */
    @PostMapping("/accounting/control/addPaymentTypeGlAssignment")
    public ResponseEntity<AddPaymentTypeGlAssignmentResponse> addPaymentTypeGlAssignment(@RequestBody AddPaymentTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a override GL account number to a invoice Itemtype for a certain organisation party.
     * <p>service: addInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addPurInvoiceItemTypeGlAssignment")
    public ResponseEntity<AddInvoiceItemTypeGlAssignmentResponse> addInvoiceItemTypeGlAssignment(@RequestBody AddInvoiceItemTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a override GL account number to a invoice Itemtype for a certain organisation party.
     * <p>service: addInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/addSalInvoiceItemTypeGlAssignment")
    public ResponseEntity<AddInvoiceItemTypeGlAssignmentResponse> addInvoiceItemTypeGlAssignmentAddSalInvoiceItemTypeGlAssignment(@RequestBody AddInvoiceItemTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Call Tax Calculate Service
     * <p>service: addTaxOnInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/addtax")
    public ResponseEntity<AddTaxOnInvoiceResponse> addTaxOnInvoice(@RequestBody AddTaxOnInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: assignGlRecToFinAccTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/assignGlRecToFinAccTrans")
    public ResponseEntity<AssignGlRecToFinAccTransResponse> assignGlRecToFinAccTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: reconcileFinAccountTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/callReconcileFinAccountTrans")
    public ResponseEntity<ReconcileFinAccountTransResponse> reconcileFinAccountTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire an Agreement
     * <p>service: expireAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/cancelAgreement")
    public ResponseEntity<ExpireAgreementResponse> expireAgreement(@RequestBody ExpireAgreementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel bank reconciliation.
     * <p>service: cancelBankReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelBankReconciliation")
    public ResponseEntity<CancelBankReconciliationResponse> cancelBankReconciliation(@RequestBody CancelBankReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel all payments for payment group
     * <p>service: cancelCheckRunPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelCheckRunPayments")
    public ResponseEntity<CancelCheckRunPaymentsResponse> cancelCheckRunPayments(@RequestBody CancelCheckRunPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a Fixed Asset Standard Cost
     * <p>service: cancelFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/cancelFixedAssetStdCost")
    public ResponseEntity<CancelFixedAssetStdCostResponse> cancelFixedAssetStdCost(@RequestBody CancelFixedAssetStdCostRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * cancel payment batch
     * <p>service: cancelPaymentBatch  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelPaymentGroup")
    public ResponseEntity<CancelPaymentBatchResponse> cancelPaymentBatch(@RequestBody CancelPaymentBatchRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel bank reconciliation.
     * <p>service: cancelBankReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/cancelReconciliation")
    public ResponseEntity<CancelBankReconciliationResponse> cancelBankReconciliationCancelReconciliation(@RequestBody CancelBankReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Captures (settles) pre-authorized order payments by invoice
     * <p>service: capturePaymentsByInvoice  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/capturePaymentsByInvoice")
    public ResponseEntity<CapturePaymentsByInvoiceResponse> capturePaymentsByInvoice(@RequestBody CapturePaymentsByInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Close a financial time period
     * <p>service: closeFinancialTimePeriod  entities: CustomTimePeriod  auth: true
     */
    @PostMapping("/accounting/control/closeFinancialTimePeriod")
    public ResponseEntity<CloseFinancialTimePeriodResponse> closeFinancialTimePeriod(@RequestBody CloseFinancialTimePeriodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Completes, if possible, the AcctgTransEntries using the mappings defined in the gl setup
     * <p>service: completeAcctgTransEntries  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/completeAcctgTransEntries")
    public ResponseEntity<CompleteAcctgTransEntriesResponse> completeAcctgTransEntries(@RequestBody CompleteAcctgTransEntriesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Acctg Trans And Entry(Duplicate or revert)
     * <p>service: copyAcctgTransAndEntries  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/copyAcctgTransAndEntries")
    public ResponseEntity<CopyAcctgTransAndEntriesResponse> copyAcctgTransAndEntries(@RequestBody CopyAcctgTransAndEntriesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy an Agreement
     * <p>service: copyAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/copyAgreement")
    public ResponseEntity<CopyAgreementResponse> copyAgreement(@RequestBody CopyAgreementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record/items from an existing invoice
     * <p>service: copyInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/copyInvoice")
    public ResponseEntity<CopyInvoiceResponse> copyInvoice(@RequestBody CopyInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Save a Invoice data to a template.
     * <p>service: copyInvoiceToTemplate  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/copyInvoiceToTemplate")
    public ResponseEntity<CopyInvoiceToTemplateResponse> copyInvoiceToTemplate(@RequestBody CopyInvoiceToTemplateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a AcctgTrans record with isPosted set to "N"
     * <p>service: createAcctgTrans  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/createAcctgTrans")
    public ResponseEntity<CreateAcctgTransResponse> createAcctgTrans(@RequestBody CreateAcctgTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add an Entry to a AcctgTrans. Will use baseCurrencyUomId in PartyAcctgPreference if no currencyUomId is in parameters.
     * <p>service: createAcctgTransEntry  entities: AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/createAcctgTransEntry")
    public ResponseEntity<CreateAcctgTransEntryResponse> createAcctgTransEntry(@RequestBody CreateAcctgTransEntryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Agreement
     * <p>service: createAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/createAgreement")
    public ResponseEntity<CreateAgreementResponse> createAgreement(@RequestBody CreateAgreementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementGeographicalApplic
     * <p>service: createAgreementGeographicalApplic  entities: AgreementGeographicalApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementGeographicalApplic")
    public ResponseEntity<CreateAgreementGeographicalApplicResponse> createAgreementGeographicalApplic(@RequestBody CreateAgreementGeographicalApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementItem
     * <p>service: createAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItem")
    public ResponseEntity<CreateAgreementItemResponse> createAgreementItem(@RequestBody CreateAgreementItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementFacilityAppl
     * <p>service: createAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemFacility")
    public ResponseEntity<CreateAgreementFacilityApplResponse> createAgreementFacilityAppl(@RequestBody CreateAgreementFacilityApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementPartyApplic
     * <p>service: createAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemParty")
    public ResponseEntity<CreateAgreementPartyApplicResponse> createAgreementPartyApplic(@RequestBody CreateAgreementPartyApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementProductAppl
     * <p>service: createAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementItemProduct")
    public ResponseEntity<CreateAgreementProductApplResponse> createAgreementProductAppl(@RequestBody CreateAgreementProductApplRequest request) {
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
    public ResponseEntity<CreateAgreementTermResponse> createAgreementTerm(@RequestBody CreateAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementPromoAppl
     * <p>service: createAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/createAgreementPromoAppl")
    public ResponseEntity<CreateAgreementPromoApplResponse> createAgreementPromoAppl(@RequestBody CreateAgreementPromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Agreement Role
     * <p>service: createAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/createAgreementRole")
    public ResponseEntity<CreateAgreementRoleResponse> createAgreementRole(@RequestBody CreateAgreementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an AgreementTerm
     * <p>service: createAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/createAgreementTerm")
    public ResponseEntity<CreateAgreementTermResponse> createAgreementTermCreateAgreementTerm(@RequestBody CreateAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create AgreementWorkEffortApplic
     * <p>service: createAgreementWorkEffortApplic  entities: AgreementWorkEffortApplic  auth: true
     */
    @PostMapping("/accounting/control/createAgreementWorkEffortApplic")
    public ResponseEntity<CreateAgreementWorkEffortApplicResponse> createAgreementWorkEffortApplic(@RequestBody CreateAgreementWorkEffortApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account
     * <p>service: createBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccount")
    public ResponseEntity<CreateBillingAccountResponse> createBillingAccount(@RequestBody CreateBillingAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createBillingAccountAndRole  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountAndRole")
    public ResponseEntity<CreateBillingAccountAndRoleResponse> createBillingAccountAndRole(@RequestBody CreateBillingAccountAndRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account Role
     * <p>service: createBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountRole")
    public ResponseEntity<CreateBillingAccountRoleResponse> createBillingAccountRole(@RequestBody CreateBillingAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Billing Account Term
     * <p>service: createBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/createBillingAccountTerm")
    public ResponseEntity<CreateBillingAccountTermResponse> createBillingAccountTerm(@RequestBody CreateBillingAccountTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Budget
     * <p>service: createBudget  entities: Budget  auth: true
     */
    @PostMapping("/accounting/control/createBudget")
    public ResponseEntity<CreateBudgetResponse> createBudget(@RequestBody CreateBudgetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Budget Item
     * <p>service: createBudgetItem  entities: BudgetItem  auth: true
     */
    @PostMapping("/accounting/control/createBudgetItem")
    public ResponseEntity<CreateBudgetItemResponse> createBudgetItem(@RequestBody CreateBudgetItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Budget Review Record
     * <p>service: createBudgetReview  entities: BudgetReview  auth: true
     */
    @PostMapping("/accounting/control/createBudgetReview")
    public ResponseEntity<CreateBudgetReviewResponse> createBudgetReview(@RequestBody CreateBudgetReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Budget Role Record
     * <p>service: createBudgetRole  entities: BudgetRole  auth: true
     */
    @PostMapping("/accounting/control/createBudgetRole")
    public ResponseEntity<CreateBudgetRoleResponse> createBudgetRole(@RequestBody CreateBudgetRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CostComponentCalc
     * <p>service: createCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/createCostComponentCalc")
    public ResponseEntity<CreateCostComponentCalcResponse> createCostComponentCalc(@RequestBody CreateCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create a Credit Card Gl Account
     * <p>service: createCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createCreditCardTypeGlAccount")
    public ResponseEntity<CreateCreditCardTypeGlAccountResponse> createCreditCardTypeGlAccount(@RequestBody CreateCreditCardTypeGlAccountRequest request) {
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
    public ResponseEntity<CreatePaymentAndFinAccountTransResponse> createPaymentAndFinAccountTrans(@RequestBody CreatePaymentAndFinAccountTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account. If no finAccountId is provided, an auto-sequenced one will be used.
     * <p>service: createFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/createFinAccount")
    public ResponseEntity<CreateFinAccountResponse> createFinAccount(@RequestBody CreateFinAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Lower level service for creating authorization against a fin account. Will use current time for authorizationDate and thruDate if not supplied.
     * <p>service: createFinAccountAuth  entities: FinAccountAuth  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountAuth")
    public ResponseEntity<CreateFinAccountAuthResponse> createFinAccountAuth(@RequestBody CreateFinAccountAuthRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account Role
     * <p>service: createFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountRole")
    public ResponseEntity<CreateFinAccountRoleResponse> createFinAccountRole(@RequestBody CreateFinAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Financial Account Transaction. Will use current timestamp for entryDate and trasanctionDate if none is provided.
     * <p>service: createFinAccountTrans  entities: FinAccountTrans  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountTrans")
    public ResponseEntity<CreateFinAccountTransResponse> createFinAccountTrans(@RequestBody CreateFinAccountTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FinAccountTypeGlAccount
     * <p>service: createFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFinAccountTypeGlAccount")
    public ResponseEntity<CreateFinAccountTypeGlAccountResponse> createFinAccountTypeGlAccount(@RequestBody CreateFinAccountTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset
     * <p>service: createFixedAsset  entities: FixedAsset  auth: true
     */
    @PostMapping("/accounting/control/createFixedAsset")
    public ResponseEntity<CreateFixedAssetResponse> createFixedAsset(@RequestBody CreateFixedAssetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Depreciation Method
     * <p>service: createFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetDepMethod")
    public ResponseEntity<CreateFixedAssetDepMethodResponse> createFixedAssetDepMethod(@RequestBody CreateFixedAssetDepMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Identification
     * <p>service: createFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetIdent")
    public ResponseEntity<CreateFixedAssetIdentResponse> createFixedAssetIdent(@RequestBody CreateFixedAssetIdentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Maintenance
     * <p>service: createFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMaint")
    public ResponseEntity<CreateFixedAssetMaintResponse> createFixedAssetMaint(@RequestBody CreateFixedAssetMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Maintenance Order
     * <p>service: createFixedAssetMaintOrder  entities: FixedAssetMaintOrder  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMaintOrder")
    public ResponseEntity<CreateFixedAssetMaintOrderResponse> createFixedAssetMaintOrder(@RequestBody CreateFixedAssetMaintOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed asset Meter
     * <p>service: createFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetMeter")
    public ResponseEntity<CreateFixedAssetMeterResponse> createFixedAssetMeter(@RequestBody CreateFixedAssetMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Registration
     * <p>service: createFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetRegistration")
    public ResponseEntity<CreateFixedAssetRegistrationResponse> createFixedAssetRegistration(@RequestBody CreateFixedAssetRegistrationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Standard Cost
     * <p>service: createFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetStdCost")
    public ResponseEntity<CreateFixedAssetStdCostResponse> createFixedAssetStdCost(@RequestBody CreateFixedAssetStdCostRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Type Gl Account Mapping
     * <p>service: createFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetTypeGlAccount")
    public ResponseEntity<CreateFixedAssetTypeGlAccountResponse> createFixedAssetTypeGlAccount(@RequestBody CreateFixedAssetTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Type Gl Account Mapping
     * <p>service: createFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createFixedAssetTypeGlAccountForFixedAsset")
    public ResponseEntity<CreateFixedAssetTypeGlAccountResponse> createFixedAssetTypeGlAccountCreateFixedAssetTypeGlAccountForFixedAsset(@RequestBody CreateFixedAssetTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlAccount record
     * <p>service: createGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/createGlAccount")
    public ResponseEntity<CreateGlAccountResponse> createGlAccount(@RequestBody CreateGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create GL Account Category
     * <p>service: createGlAccountCategory  entities: GlAccountCategory  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountCategory")
    public ResponseEntity<CreateGlAccountCategoryResponse> createGlAccountCategory(@RequestBody CreateGlAccountCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create GL Account Category Member
     * <p>service: createGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountCategoryMember")
    public ResponseEntity<CreateGlAccountCategoryMemberResponse> createGlAccountCategoryMember(@RequestBody CreateGlAccountCategoryMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlAccount record
     * <p>service: createGlAccountOrganization  entities: GlAccountOrganization  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountOrganization")
    public ResponseEntity<CreateGlAccountOrganizationResponse> createGlAccountOrganization(@RequestBody CreateGlAccountOrganizationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Define a default GL account for an Account Type for a certain organisation party.
     * <p>service: createGlAccountTypeDefault  entities: GlAccountTypeDefault  auth: true
     */
    @PostMapping("/accounting/control/createGlAccountTypeDefault")
    public ResponseEntity<CreateGlAccountTypeDefaultResponse> createGlAccountTypeDefault(@RequestBody CreateGlAccountTypeDefaultRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlJournal record
     * <p>service: createGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/createGlJournal")
    public ResponseEntity<CreateGlJournalResponse> createGlJournal(@RequestBody CreateGlJournalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GlReconciliation record
     * <p>service: createGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/createGlReconciliation")
    public ResponseEntity<CreateGlReconciliationResponse> createGlReconciliation(@RequestBody CreateGlReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/createInvoice")
    public ResponseEntity<CreateInvoiceResponse> createInvoice(@RequestBody CreateInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Invoice Item Record
     * <p>service: createInvoiceItem  entities: InvoiceItem  auth: true
     */
    @PostMapping("/accounting/control/createInvoiceItem")
    public ResponseEntity<CreateInvoiceItemResponse> createInvoiceItem(@RequestBody CreateInvoiceItemRequest request) {
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
    public ResponseEntity<CreateInvoiceRoleResponse> createInvoiceRole(@RequestBody CreateInvoiceRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice (Item) Term Record
     * <p>service: createInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/createInvoiceTerm")
    public ResponseEntity<CreateInvoiceTermResponse> createInvoiceTerm(@RequestBody CreateInvoiceTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityGlAccount
     * <p>service: createTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<CreateTaxAuthorityGlAccountResponse> createTaxAuthorityGlAccount(@RequestBody CreateTaxAuthorityGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create accounting preferences for a party (organization)
     * <p>service: createPartyAcctgPreference  entities: PartyAcctgPreference  auth: true
     */
    @PostMapping("/accounting/control/createPartyAcctgPreference")
    public ResponseEntity<CreatePartyAcctgPreferenceResponse> createPartyAcctgPreference(@RequestBody CreatePartyAcctgPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party to a Fixed Asset
     * <p>service: createPartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/createPartyFixedAssetAssignment")
    public ResponseEntity<CreatePartyFixedAssetAssignmentResponse> createPartyFixedAssetAssignment(@RequestBody CreatePartyFixedAssetAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Associate a party to a General Ledger Account
     * <p>service: createPartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createPartyGlAccount")
    public ResponseEntity<CreatePartyGlAccountResponse> createPartyGlAccount(@RequestBody CreatePartyGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a documentType preference for a party (organization)
     * <p>service: createPartyPrefDocTypeTpl  entities: PartyPrefDocTypeTpl  auth: true
     */
    @PostMapping("/accounting/control/createPartyPrefDocTypeTpl")
    public ResponseEntity<CreatePartyPrefDocTypeTplResponse> createPartyPrefDocTypeTpl(@RequestBody CreatePartyPrefDocTypeTplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPayment")
    public ResponseEntity<CreatePaymentAndFinAccountTransResponse> createPaymentAndFinAccountTransCreatePayment(@RequestBody CreatePaymentAndFinAccountTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a payment and a payment application for the full amount
     * <p>service: createPaymentAndApplication  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/createPaymentAndAssociateToBillingAccount")
    public ResponseEntity<CreatePaymentAndApplicationResponse> createPaymentAndApplication(@RequestBody CreatePaymentAndApplicationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a payment application
     * <p>service: createPaymentApplication  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPaymentApplication")
    public ResponseEntity<CreatePaymentApplicationResponse> createPaymentApplication(@RequestBody CreatePaymentApplicationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check the valid(unbatched) payment and create batch for same
     * <p>service: checkAndCreateBatchForValidPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createPaymentBatch")
    public ResponseEntity<CheckAndCreateBatchForValidPaymentsResponse> checkAndCreateBatchForValidPayments(@RequestBody CheckAndCreateBatchForValidPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Payment Group
     * <p>service: createPaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/createPaymentGroup")
    public ResponseEntity<CreatePaymentGroupResponse> createPaymentGroup(@RequestBody CreatePaymentGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Check For Outgoing/Incoming Payment And Create Payment Group Member
     * <p>service: createPaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/createPaymentGroupMember")
    public ResponseEntity<CreatePaymentGroupMemberResponse> createPaymentGroupMemberCreatePaymentGroupMember(@RequestBody CreatePaymentGroupMemberRequest request) {
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
    public ResponseEntity<CreateTaxAuthorityResponse> createTaxAuthority(@RequestBody CreateTaxAuthorityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityAssoc
     * <p>service: createTaxAuthorityAssoc  entities: TaxAuthorityAssoc  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityAssoc")
    public ResponseEntity<CreateTaxAuthorityAssocResponse> createTaxAuthorityAssoc(@RequestBody CreateTaxAuthorityAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityCategory
     * <p>service: createTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityCategory")
    public ResponseEntity<CreateTaxAuthorityCategoryResponse> createTaxAuthorityCategory(@RequestBody CreateTaxAuthorityCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityGlAccount
     * <p>service: createTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityGlAccount")
    public ResponseEntity<CreateTaxAuthorityGlAccountResponse> createTaxAuthorityGlAccountCreateTaxAuthorityGlAccount(@RequestBody CreateTaxAuthorityGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create PartyTaxAuthInfo
     * <p>service: createPartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityPartyInfo")
    public ResponseEntity<CreatePartyTaxAuthInfoResponse> createPartyTaxAuthInfo(@RequestBody CreatePartyTaxAuthInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create TaxAuthorityRateProduct
     * <p>service: createTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/createTaxAuthorityRateProduct")
    public ResponseEntity<CreateTaxAuthorityRateProductResponse> createTaxAuthorityRateProduct(@RequestBody CreateTaxAuthorityRateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createUpdateCostCenter  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/createUpdateCostCenter")
    public ResponseEntity<CreateUpdateCostCenterResponse> createUpdateCostCenter(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create a Variance Reason Gl Account
     * <p>service: createVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/createVarianceReasonGlAccount")
    public ResponseEntity<CreateVarianceReasonGlAccountResponse> createVarianceReasonGlAccount(@RequestBody CreateVarianceReasonGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/createWithdrawalPayment")
    public ResponseEntity<CreatePaymentAndFinAccountTransResponse> createPaymentAndFinAccountTransCreateWithdrawalPayment(@RequestBody CreatePaymentAndFinAccountTransRequest request) {
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
    public ResponseEntity<DeleteAcctgTransEntryResponse> deleteAcctgTransEntry(@RequestBody DeleteAcctgTransEntryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Agreement Role
     * <p>service: deleteAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementRole")
    public ResponseEntity<DeleteAgreementRoleResponse> deleteAgreementRole(@RequestBody DeleteAgreementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an AgreementTerm
     * <p>service: deleteAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementTerm")
    public ResponseEntity<DeleteAgreementTermResponse> deleteAgreementTerm(@RequestBody DeleteAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementWorkEffortApplic
     * <p>service: deleteAgreementWorkEffortApplic  entities: AgreementWorkEffortApplic  auth: true
     */
    @PostMapping("/accounting/control/deleteAgreementWorkEffortApplic")
    public ResponseEntity<DeleteAgreementWorkEffortApplicResponse> deleteAgreementWorkEffortApplic(@RequestBody DeleteAgreementWorkEffortApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Billing Account Role
     * <p>service: removeBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/deleteBillingAccountRole")
    public ResponseEntity<RemoveBillingAccountRoleResponse> removeBillingAccountRole(@RequestBody RemoveBillingAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a CostComponentCalc
     * <p>service: removeCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/deleteCostComponentCalc")
    public ResponseEntity<RemoveCostComponentCalcResponse> removeCostComponentCalc(@RequestBody RemoveCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete a Credit Card Gl Account
     * <p>service: deleteCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteCreditCardTypeGlAccount")
    public ResponseEntity<DeleteCreditCardTypeGlAccountResponse> deleteCreditCardTypeGlAccount(@RequestBody DeleteCreditCardTypeGlAccountRequest request) {
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
    public ResponseEntity<CancelPaymentBatchResponse> cancelPaymentBatchDeleteDepositSlip(@RequestBody CancelPaymentBatchRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Financial Account
     * <p>service: deleteFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccount")
    public ResponseEntity<DeleteFinAccountResponse> deleteFinAccount(@RequestBody DeleteFinAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FinAccountRole
     * <p>service: deleteFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccountRole")
    public ResponseEntity<DeleteFinAccountRoleResponse> deleteFinAccountRole(@RequestBody DeleteFinAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FinAccountTypeGlAccount
     * <p>service: deleteFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFinAccountTypeGlAccount")
    public ResponseEntity<DeleteFinAccountTypeGlAccountResponse> deleteFinAccountTypeGlAccount(@RequestBody DeleteFinAccountTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Depreciation Method
     * <p>service: deleteFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetDepMethod")
    public ResponseEntity<DeleteFixedAssetDepMethodResponse> deleteFixedAssetDepMethod(@RequestBody DeleteFixedAssetDepMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance
     * <p>service: deleteFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMaint")
    public ResponseEntity<DeleteFixedAssetMaintResponse> deleteFixedAssetMaint(@RequestBody DeleteFixedAssetMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance Order
     * <p>service: deleteFixedAssetMaintOrder  entities: FixedAssetMaintOrder  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMaintOrder")
    public ResponseEntity<DeleteFixedAssetMaintOrderResponse> deleteFixedAssetMaintOrder(@RequestBody DeleteFixedAssetMaintOrderRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Maintenance Meter
     * <p>service: deleteFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetMeter")
    public ResponseEntity<DeleteFixedAssetMeterResponse> deleteFixedAssetMeter(@RequestBody DeleteFixedAssetMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Registration
     * <p>service: deleteFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetRegistration")
    public ResponseEntity<DeleteFixedAssetRegistrationResponse> deleteFixedAssetRegistration(@RequestBody DeleteFixedAssetRegistrationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Type Gl Account Mapping
     * <p>service: deleteFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetTypeGlAccount")
    public ResponseEntity<DeleteFixedAssetTypeGlAccountResponse> deleteFixedAssetTypeGlAccount(@RequestBody DeleteFixedAssetTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Fixed Asset Type Gl Account Mapping
     * <p>service: deleteFixedAssetTypeGlAccount  entities: FixedAssetTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteFixedAssetTypeGlAccountForFixedAsset")
    public ResponseEntity<DeleteFixedAssetTypeGlAccountResponse> deleteFixedAssetTypeGlAccountDeleteFixedAssetTypeGlAccountForFixedAsset(@RequestBody DeleteFixedAssetTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete GL Account Category Member
     * <p>service: deleteGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/deleteGlAccountCategoryMember")
    public ResponseEntity<DeleteGlAccountCategoryMemberResponse> deleteGlAccountCategoryMember(@RequestBody DeleteGlAccountCategoryMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a GlJournal record
     * <p>service: deleteGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/deleteGlJournal")
    public ResponseEntity<DeleteGlJournalResponse> deleteGlJournal(@RequestBody DeleteGlJournalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Invoice (Item) Term Record
     * <p>service: deleteInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/deleteInvoiceTerm")
    public ResponseEntity<DeleteInvoiceTermResponse> deleteInvoiceTerm(@RequestBody DeleteInvoiceTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityGlAccount
     * <p>service: deleteTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<DeleteTaxAuthorityGlAccountResponse> deleteTaxAuthorityGlAccount(@RequestBody DeleteTaxAuthorityGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Party to Fixed Asset
     * <p>service: deletePartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/deletePartyFixedAssetAssignment")
    public ResponseEntity<DeletePartyFixedAssetAssignmentResponse> deletePartyFixedAssetAssignment(@RequestBody DeletePartyFixedAssetAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an existing General Ledger Account of a Party
     * <p>service: deletePartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deletePartyGlAccount")
    public ResponseEntity<DeletePartyGlAccountResponse> deletePartyGlAccount(@RequestBody DeletePartyGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Payment Group
     * <p>service: deletePaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/deletePaymentGroup")
    public ResponseEntity<DeletePaymentGroupResponse> deletePaymentGroup(@RequestBody DeletePaymentGroupRequest request) {
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
    public ResponseEntity<DeleteTaxAuthorityAssocResponse> deleteTaxAuthorityAssoc(@RequestBody DeleteTaxAuthorityAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityCategory
     * <p>service: deleteTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityCategory")
    public ResponseEntity<DeleteTaxAuthorityCategoryResponse> deleteTaxAuthorityCategory(@RequestBody DeleteTaxAuthorityCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityGlAccount
     * <p>service: deleteTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityGlAccount")
    public ResponseEntity<DeleteTaxAuthorityGlAccountResponse> deleteTaxAuthorityGlAccountDeleteTaxAuthorityGlAccount(@RequestBody DeleteTaxAuthorityGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PartyTaxAuthInfo
     * <p>service: deletePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityPartyInfo")
    public ResponseEntity<DeletePartyTaxAuthInfoResponse> deletePartyTaxAuthInfo(@RequestBody DeletePartyTaxAuthInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete TaxAuthorityRateProduct
     * <p>service: deleteTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/deleteTaxAuthorityRateProduct")
    public ResponseEntity<DeleteTaxAuthorityRateProductResponse> deleteTaxAuthorityRateProduct(@RequestBody DeleteTaxAuthorityRateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * delete a Variance Reason Gl Account
     * <p>service: deleteVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/deleteVarianceReasonGlAccount")
    public ResponseEntity<DeleteVarianceReasonGlAccountResponse> deleteVarianceReasonGlAccount(@RequestBody DeleteVarianceReasonGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deposit withdraw payments
     * <p>service: depositWithdrawPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/depositWithdrawPayments")
    public ResponseEntity<DepositWithdrawPaymentsResponse> depositWithdrawPayments(@RequestBody DepositWithdrawPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Send an invoice per email
     * <p>service: sendInvoicePerEmail  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/executeSendPerEmail")
    public ResponseEntity<SendInvoicePerEmailResponse> sendInvoicePerEmail(@RequestBody SendInvoicePerEmailRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire a Payment Group Member
     * <p>service: expirePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/expireDepositSlipMember")
    public ResponseEntity<ExpirePaymentGroupMemberResponse> expirePaymentGroupMember(@RequestBody ExpirePaymentGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expires a fin account authorization. Will use current time if no time is supplied in parameter
     * <p>service: expireFinAccountAuth  entities: FinAccountAuth  auth: true
     */
    @PostMapping("/accounting/control/expireFinAccountAuth")
    public ResponseEntity<ExpireFinAccountAuthResponse> expireFinAccountAuth(@RequestBody ExpireFinAccountAuthRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a documentType preference for a party (organization)
     * <p>service: expirePartyPrefDocTypeTpl  entities: PartyPrefDocTypeTpl  auth: true
     */
    @PostMapping("/accounting/control/expirePartyPrefDocTypeTpl")
    public ResponseEntity<ExpirePartyPrefDocTypeTplResponse> expirePartyPrefDocTypeTpl(@RequestBody ExpirePartyPrefDocTypeTplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire a Payment Group Member
     * <p>service: expirePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/expirePaymentGroupMember")
    public ResponseEntity<ExpirePaymentGroupMemberResponse> expirePaymentGroupMemberExpirePaymentGroupMember(@RequestBody ExpirePaymentGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * expire Rate Amount
     * <p>service: expireRateAmount  entities: RateAmount  auth: true
     */
    @PostMapping("/accounting/control/expireRateAmount")
    public ResponseEntity<ExpireRateAmountResponse> expireRateAmount(@RequestBody ExpireRateAmountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getFinAccountTransRunningTotalAndBalances  entities: unknown  auth: -
     */
    @GetMapping("/accounting/control/getFinAccountTransRunningTotalAndBalances")
    public ResponseEntity<GetFinAccountTransRunningTotalAndBalancesResponse> getFinAccountTransRunningTotalAndBalances(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * calculate running total for selected Invoices
     * <p>service: getInvoiceRunningTotal  entities: unknown  auth: -
     */
    @PostMapping("/accounting/control/getInvoiceRunningTotal")
    public ResponseEntity<GetInvoiceRunningTotalResponse> getInvoiceRunningTotal(@RequestBody GetInvoiceRunningTotalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * calculate running total for payments
     * <p>service: getPaymentRunningTotal  entities: unknown  auth: -
     */
    @PostMapping("/accounting/control/getPaymentRunningTotal")
    public ResponseEntity<GetPaymentRunningTotalResponse> getPaymentRunningTotal(@RequestBody GetPaymentRunningTotalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Post a AcctgTrans and related entries. This will make sure that the time period is not closed and that the sum of the debits and credits are equal.
     * <p>service: postAcctgTrans  entities: AcctgTrans  auth: true
     */
    @PostMapping("/accounting/control/postAcctgTrans")
    public ResponseEntity<PostAcctgTransResponse> postAcctgTrans(@RequestBody PostAcctgTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Process (authorizes/re-authorizes) a single payment for an order with an optional overrideAmount
     * <p>service: authOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processAuthorizeTransaction")
    public ResponseEntity<AuthOrderPaymentPreferenceResponse> authOrderPaymentPreference(@RequestBody AuthOrderPaymentPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Captures (settles) pre-authorized order payments, re-authorizing any remaining balance. If the order involves billing accounts, capture to it in full before proceeding to other payment preferences.
     * <p>service: captureOrderPayments  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processCaptureTransaction")
    public ResponseEntity<CaptureOrderPaymentsResponse> captureOrderPayments(@RequestBody CaptureOrderPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create commission invoice for the list of sales invoices. Returns a List of Maps, one for each invoice created containing: commissionInvoiceId: the invoiceId of the invoice created salesRepresentative: the invoice partyIdFrom
     * <p>service: createCommissionInvoices  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processCommissionRun")
    public ResponseEntity<CreateCommissionInvoicesResponse> createCommissionInvoices(@RequestBody CreateCommissionInvoicesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Direct link to payment processors to force manual transactions; not logged in system
     * <p>service: manualForcedCcTransaction  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processManualCcTx")
    public ResponseEntity<ManualForcedCcTransactionResponse> manualForcedCcTransaction(@RequestBody ManualForcedCcTransactionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Refund payment authorization for a single OrderPaymentPreference
     * <p>service: refundOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processRefundTransaction")
    public ResponseEntity<RefundOrderPaymentPreferenceResponse> refundOrderPaymentPreference(@RequestBody RefundOrderPaymentPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Releases payment authorization for a single OrderPaymentPreference
     * <p>service: releaseOrderPaymentPreference  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/processReleaseTransaction")
    public ResponseEntity<ReleaseOrderPaymentPreferenceResponse> releaseOrderPaymentPreference(@RequestBody ReleaseOrderPaymentPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an AcctgTrans and two offsetting AcctgTransEntry records
     * <p>service: quickCreateAcctgTransAndEntries  entities: AcctgTrans, AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/quickCreateAcctgTransAndEntries")
    public ResponseEntity<QuickCreateAcctgTransAndEntriesResponse> quickCreateAcctgTransAndEntries(@RequestBody QuickCreateAcctgTransAndEntriesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickSendPayment  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/quickSendPayment")
    public ResponseEntity<QuickSendPaymentResponse> quickSendPayment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: reconcileFinAccountTrans  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/reconcileFinAccountTrans")
    public ResponseEntity<ReconcileFinAccountTransResponse> reconcileFinAccountTransReconcileFinAccountTrans(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Agreement
     * <p>service: removeAgreementContent  entities: AgreementContent  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementContent")
    public ResponseEntity<RemoveAgreementContentResponse> removeAgreementContent(@RequestBody RemoveAgreementContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementGeographicalApplic
     * <p>service: removeAgreementGeographicalApplic  entities: AgreementGeographicalApplic  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementGeographicalApplic")
    public ResponseEntity<RemoveAgreementGeographicalApplicResponse> removeAgreementGeographicalApplic(@RequestBody RemoveAgreementGeographicalApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementItem
     * <p>service: removeAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItem")
    public ResponseEntity<RemoveAgreementItemResponse> removeAgreementItem(@RequestBody RemoveAgreementItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementFacilityAppl
     * <p>service: removeAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemFacility")
    public ResponseEntity<RemoveAgreementFacilityApplResponse> removeAgreementFacilityAppl(@RequestBody RemoveAgreementFacilityApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementPartyApplic
     * <p>service: removeAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemParty")
    public ResponseEntity<RemoveAgreementPartyApplicResponse> removeAgreementPartyApplic(@RequestBody RemoveAgreementPartyApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementProductAppl
     * <p>service: removeAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementItemProduct")
    public ResponseEntity<RemoveAgreementProductApplResponse> removeAgreementProductAppl(@RequestBody RemoveAgreementProductApplRequest request) {
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
    public ResponseEntity<DeleteAgreementTermResponse> deleteAgreementTermRemoveAgreementItemTerm(@RequestBody DeleteAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an AgreementPromoAppl
     * <p>service: removeAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/removeAgreementPromoAppl")
    public ResponseEntity<RemoveAgreementPromoApplResponse> removeAgreementPromoAppl(@RequestBody RemoveAgreementPromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Billing Account Term
     * <p>service: removeBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/removeBillingAccountTerm")
    public ResponseEntity<RemoveBillingAccountTermResponse> removeBillingAccountTerm(@RequestBody RemoveBillingAccountTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Item Record
     * <p>service: removeBudgetItem  entities: BudgetItem  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetItem")
    public ResponseEntity<RemoveBudgetItemResponse> removeBudgetItem(@RequestBody RemoveBudgetItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Review Record
     * <p>service: removeBudgetReview  entities: BudgetReview  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetReview")
    public ResponseEntity<RemoveBudgetReviewResponse> removeBudgetReview(@RequestBody RemoveBudgetReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Budget Role Record
     * <p>service: removeBudgetRole  entities: BudgetRole  auth: true
     */
    @PostMapping("/accounting/control/removeBudgetRole")
    public ResponseEntity<RemoveBudgetRoleResponse> removeBudgetRole(@RequestBody RemoveBudgetRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove finaAccountTrans association with gl reconciliation
     * <p>service: removeFinAccountTransFromReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/removeFinAccountTransFromReconciliation")
    public ResponseEntity<RemoveFinAccountTransFromReconciliationResponse> removeFinAccountTransFromReconciliation(@RequestBody RemoveFinAccountTransFromReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Fixed Asset Identification
     * <p>service: removeFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/removeFixedAssetIdent")
    public ResponseEntity<RemoveFixedAssetIdentResponse> removeFixedAssetIdent(@RequestBody RemoveFixedAssetIdentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Fixed Asset
     * <p>service: removeFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/removeFixedAssetProduct")
    public ResponseEntity<RemoveFixedAssetProductResponse> removeFixedAssetProduct(@RequestBody RemoveFixedAssetProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account for an Account Type for a certain organisation party.
     * <p>service: removeGlAccountTypeDefault  entities: GlAccountTypeDefault  auth: true
     */
    @PostMapping("/accounting/control/removeGlAccountTypeDefault")
    public ResponseEntity<RemoveGlAccountTypeDefaultResponse> removeGlAccountTypeDefault(@RequestBody RemoveGlAccountTypeDefaultRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a paymentApplication record.
     * <p>service: removePaymentApplication  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceApplication")
    public ResponseEntity<RemovePaymentApplicationResponse> removePaymentApplication(@RequestBody RemovePaymentApplicationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Invoice Item Record
     * <p>service: removeInvoiceItem  entities: InvoiceItem  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceItem")
    public ResponseEntity<RemoveInvoiceItemResponse> removeInvoiceItem(@RequestBody RemoveInvoiceItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove an existing Invoice Role Record
     * <p>service: removeInvoiceRole  entities: InvoiceRole  auth: true
     */
    @PostMapping("/accounting/control/removeInvoiceRole")
    public ResponseEntity<RemoveInvoiceRoleResponse> removeInvoiceRole(@RequestBody RemoveInvoiceRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a paymentApplication record.
     * <p>service: removePaymentApplication  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/removePaymentApplication")
    public ResponseEntity<RemovePaymentApplicationResponse> removePaymentApplicationRemovePaymentApplication(@RequestBody RemovePaymentApplicationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account number from a payment method type.
     * <p>service: removePaymentMethodTypeGlAssignment  entities: PaymentMethodTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removePaymentMethodTypeGlAssignment")
    public ResponseEntity<RemovePaymentMethodTypeGlAssignmentResponse> removePaymentMethodTypeGlAssignment(@RequestBody RemovePaymentMethodTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a default GL account type from a payment type.
     * <p>service: removePaymentTypeGlAssignment  entities: PaymentGlAccountTypeMap  auth: true
     */
    @PostMapping("/accounting/control/removePaymentTypeGlAssignment")
    public ResponseEntity<RemovePaymentTypeGlAssignmentResponse> removePaymentTypeGlAssignment(@RequestBody RemovePaymentTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a override GL account number to a invoice type for a certain organisation party.
     * <p>service: removeInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removePurInvoiceItemTypeGlAssignment")
    public ResponseEntity<RemoveInvoiceItemTypeGlAssignmentResponse> removeInvoiceItemTypeGlAssignment(@RequestBody RemoveInvoiceItemTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a override GL account number to a invoice type for a certain organisation party.
     * <p>service: removeInvoiceItemTypeGlAssignment  entities: InvoiceItemTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/removeSalInvoiceItemTypeGlAssignment")
    public ResponseEntity<RemoveInvoiceItemTypeGlAssignmentResponse> removeInvoiceItemTypeGlAssignmentRemoveSalInvoiceItemTypeGlAssignment(@RequestBody RemoveInvoiceItemTypeGlAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove finaAccountTrans association with gl reconciliation
     * <p>service: removeFinAccountTransFromReconciliation  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/reomveFinAccountTransAssociation")
    public ResponseEntity<RemoveFinAccountTransFromReconciliationResponse> removeFinAccountTransFromReconciliationReomveFinAccountTransAssociation(@RequestBody RemoveFinAccountTransFromReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set financial account transaction status
     * <p>service: setFinAccountTransStatus  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/setFinAccountTransStatus")
    public ResponseEntity<SetFinAccountTransStatusResponse> setFinAccountTransStatus(@RequestBody SetFinAccountTransStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Invoice Status
     * <p>service: setInvoiceStatus  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/setInvoiceStatus")
    public ResponseEntity<SetInvoiceStatusResponse> setInvoiceStatus(@RequestBody SetInvoiceStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the status of a Payment
     * <p>service: setPaymentStatus  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/setPaymentStatus")
    public ResponseEntity<SetPaymentStatusResponse> setPaymentStatus(@RequestBody SetPaymentStatusRequest request) {
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
    public ResponseEntity<UpdateAcctgTransResponse> updateAcctgTrans(@RequestBody UpdateAcctgTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Entry to a AcctgTrans record
     * <p>service: updateAcctgTransEntry  entities: AcctgTransEntry  auth: true
     */
    @PostMapping("/accounting/control/updateAcctgTransEntry")
    public ResponseEntity<UpdateAcctgTransEntryResponse> updateAcctgTransEntry(@RequestBody UpdateAcctgTransEntryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Agreement
     * <p>service: updateAgreement  entities: Agreement  auth: true
     */
    @PostMapping("/accounting/control/updateAgreement")
    public ResponseEntity<UpdateAgreementResponse> updateAgreement(@RequestBody UpdateAgreementRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementItem
     * <p>service: updateAgreementItem  entities: AgreementItem  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItem")
    public ResponseEntity<UpdateAgreementItemResponse> updateAgreementItem(@RequestBody UpdateAgreementItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementFacilityAppl
     * <p>service: updateAgreementFacilityAppl  entities: AgreementFacilityAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemFacility")
    public ResponseEntity<UpdateAgreementFacilityApplResponse> updateAgreementFacilityAppl(@RequestBody UpdateAgreementFacilityApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementPartyApplic
     * <p>service: updateAgreementPartyApplic  entities: AgreementPartyApplic  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemParty")
    public ResponseEntity<UpdateAgreementPartyApplicResponse> updateAgreementPartyApplic(@RequestBody UpdateAgreementPartyApplicRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementProductAppl
     * <p>service: updateAgreementProductAppl  entities: AgreementProductAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementItemProduct")
    public ResponseEntity<UpdateAgreementProductApplResponse> updateAgreementProductAppl(@RequestBody UpdateAgreementProductApplRequest request) {
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
    public ResponseEntity<UpdateAgreementTermResponse> updateAgreementTerm(@RequestBody UpdateAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementPromoAppl
     * <p>service: updateAgreementPromoAppl  entities: AgreementPromoAppl  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementPromoAppl")
    public ResponseEntity<UpdateAgreementPromoApplResponse> updateAgreementPromoAppl(@RequestBody UpdateAgreementPromoApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Agreement Role
     * <p>service: updateAgreementRole  entities: AgreementRole  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementRole")
    public ResponseEntity<UpdateAgreementRoleResponse> updateAgreementRole(@RequestBody UpdateAgreementRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an AgreementTerm
     * <p>service: updateAgreementTerm  entities: AgreementTerm  auth: true
     */
    @PostMapping("/accounting/control/updateAgreementTerm")
    public ResponseEntity<UpdateAgreementTermResponse> updateAgreementTermUpdateAgreementTerm(@RequestBody UpdateAgreementTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account
     * <p>service: updateBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccount")
    public ResponseEntity<UpdateBillingAccountResponse> updateBillingAccount(@RequestBody UpdateBillingAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account Role
     * <p>service: updateBillingAccountRole  entities: BillingAccountRole  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccountRole")
    public ResponseEntity<UpdateBillingAccountRoleResponse> updateBillingAccountRole(@RequestBody UpdateBillingAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Billing Account Term
     * <p>service: updateBillingAccountTerm  entities: BillingAccountTerm  auth: true
     */
    @PostMapping("/accounting/control/updateBillingAccountTerm")
    public ResponseEntity<UpdateBillingAccountTermResponse> updateBillingAccountTerm(@RequestBody UpdateBillingAccountTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Budget
     * <p>service: updateBudget  entities: Budget  auth: true
     */
    @PostMapping("/accounting/control/updateBudget")
    public ResponseEntity<UpdateBudgetResponse> updateBudget(@RequestBody UpdateBudgetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateBudgetItem  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/updateBudgetItem")
    public ResponseEntity<UpdateBudgetItemResponse> updateBudgetItem(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Budget
     * <p>service: updateBudgetStatus  entities: BudgetStatus  auth: true
     */
    @PostMapping("/accounting/control/updateBudgetStatus")
    public ResponseEntity<UpdateBudgetStatusResponse> updateBudgetStatus(@RequestBody UpdateBudgetStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CostComponentCalc
     * <p>service: updateCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/accounting/control/updateCostComponentCalc")
    public ResponseEntity<UpdateCostComponentCalcResponse> updateCostComponentCalc(@RequestBody UpdateCostComponentCalcRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Credit Card Gl Account
     * <p>service: updateCreditCardTypeGlAccount  entities: CreditCardTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateCreditCardTypeGlAccount")
    public ResponseEntity<UpdateCreditCardTypeGlAccountResponse> updateCreditCardTypeGlAccount(@RequestBody UpdateCreditCardTypeGlAccountRequest request) {
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
    public ResponseEntity<UpdatePaymentGroupResponse> updatePaymentGroup(@RequestBody UpdatePaymentGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group Member
     * <p>service: updatePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/updateDepositSlipMember")
    public ResponseEntity<UpdatePaymentGroupMemberResponse> updatePaymentGroupMember(@RequestBody UpdatePaymentGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the conversion rate between two currencies and expire the old conversion rates
     * <p>service: updateFXConversion  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/updateFXConversion")
    public ResponseEntity<UpdateFXConversionResponse> updateFXConversion(@RequestBody UpdateFXConversionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Financial Account
     * <p>service: updateFinAccount  entities: FinAccount  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccount")
    public ResponseEntity<UpdateFinAccountResponse> updateFinAccount(@RequestBody UpdateFinAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlReconciliation record
     * <p>service: updateGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountGlReconciliation")
    public ResponseEntity<UpdateGlReconciliationResponse> updateGlReconciliation(@RequestBody UpdateGlReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FinAccountRole
     * <p>service: updateFinAccountRole  entities: FinAccountRole  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountRole")
    public ResponseEntity<UpdateFinAccountRoleResponse> updateFinAccountRole(@RequestBody UpdateFinAccountRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FinAccountTypeGlAccount
     * <p>service: updateFinAccountTypeGlAccount  entities: FinAccountTypeGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateFinAccountTypeGlAccount")
    public ResponseEntity<UpdateFinAccountTypeGlAccountResponse> updateFinAccountTypeGlAccount(@RequestBody UpdateFinAccountTypeGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset
     * <p>service: updateFixedAsset  entities: FixedAsset  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAsset")
    public ResponseEntity<UpdateFixedAssetResponse> updateFixedAsset(@RequestBody UpdateFixedAssetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Fixed Asset Depreciation Method
     * <p>service: updateFixedAssetDepMethod  entities: FixedAssetDepMethod  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetDepMethod")
    public ResponseEntity<UpdateFixedAssetDepMethodResponse> updateFixedAssetDepMethod(@RequestBody UpdateFixedAssetDepMethodRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Identification
     * <p>service: updateFixedAssetIdent  entities: FixedAssetIdent  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetIdent")
    public ResponseEntity<UpdateFixedAssetIdentResponse> updateFixedAssetIdent(@RequestBody UpdateFixedAssetIdentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Maintenance
     * <p>service: updateFixedAssetMaint  entities: FixedAssetMaint  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetMaint")
    public ResponseEntity<UpdateFixedAssetMaintResponse> updateFixedAssetMaint(@RequestBody UpdateFixedAssetMaintRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed asset Meter
     * <p>service: updateFixedAssetMeter  entities: FixedAssetMeter  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetMeter")
    public ResponseEntity<UpdateFixedAssetMeterResponse> updateFixedAssetMeter(@RequestBody UpdateFixedAssetMeterRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the Product to Fixed Asset information
     * <p>service: updateFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetProduct")
    public ResponseEntity<UpdateFixedAssetProductResponse> updateFixedAssetProduct(@RequestBody UpdateFixedAssetProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Registration
     * <p>service: updateFixedAssetRegistration  entities: FixedAssetRegistration  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetRegistration")
    public ResponseEntity<UpdateFixedAssetRegistrationResponse> updateFixedAssetRegistration(@RequestBody UpdateFixedAssetRegistrationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Fixed Asset Standard Cost
     * <p>service: updateFixedAssetStdCost  entities: FixedAssetStdCost  auth: true
     */
    @PostMapping("/accounting/control/updateFixedAssetStdCost")
    public ResponseEntity<UpdateFixedAssetStdCostResponse> updateFixedAssetStdCost(@RequestBody UpdateFixedAssetStdCostRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlAccount record
     * <p>service: updateGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccount")
    public ResponseEntity<UpdateGlAccountResponse> updateGlAccount(@RequestBody UpdateGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update GL Account Category
     * <p>service: updateGlAccountCategory  entities: GlAccountCategory  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountCategory")
    public ResponseEntity<UpdateGlAccountCategoryResponse> updateGlAccountCategory(@RequestBody UpdateGlAccountCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update GL Account Category Member
     * <p>service: updateGlAccountCategoryMember  entities: GlAccountCategoryMember  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountCategoryMember")
    public ResponseEntity<UpdateGlAccountCategoryMemberResponse> updateGlAccountCategoryMember(@RequestBody UpdateGlAccountCategoryMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlAccount record
     * <p>service: updateGlAccount  entities: GlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateGlAccountOrganization")
    public ResponseEntity<UpdateGlAccountResponse> updateGlAccountUpdateGlAccountOrganization(@RequestBody UpdateGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlJournal record
     * <p>service: updateGlJournal  entities: GlJournal  auth: true
     */
    @PostMapping("/accounting/control/updateGlJournal")
    public ResponseEntity<UpdateGlJournalResponse> updateGlJournal(@RequestBody UpdateGlJournalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GlReconciliation record
     * <p>service: updateGlReconciliation  entities: GlReconciliation  auth: true
     */
    @PostMapping("/accounting/control/updateGlReconciliation")
    public ResponseEntity<UpdateGlReconciliationResponse> updateGlReconciliationUpdateGlReconciliation(@RequestBody UpdateGlReconciliationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing Invoice Record
     * <p>service: updateInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/accounting/control/updateInvoice")
    public ResponseEntity<UpdateInvoiceResponse> updateInvoice(@RequestBody UpdateInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a payment to a Invoice or other payment or Billing account or Taxauthority, If no ammountApplied is supplied the system will calculate and use the maximum possible value.
     * <p>service: updatePaymentApplicationDef  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceApplication")
    public ResponseEntity<UpdatePaymentApplicationDefResponse> updatePaymentApplicationDef(@RequestBody UpdatePaymentApplicationDefRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateInvoiceItem  entities: unknown  auth: true
     */
    @GetMapping("/accounting/control/updateInvoiceItem")
    public ResponseEntity<UpdateInvoiceItemResponse> updateInvoiceItem(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Invoice Item Type Record
     * <p>service: updateInvoiceItemType  entities: InvoiceItemType  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceItemType")
    public ResponseEntity<UpdateInvoiceItemTypeResponse> updateInvoiceItemType(@RequestBody UpdateInvoiceItemTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Invoice (Item) Term Record
     * <p>service: updateInvoiceTerm  entities: InvoiceTerm  auth: true
     */
    @PostMapping("/accounting/control/updateInvoiceTerm")
    public ResponseEntity<UpdateInvoiceTermResponse> updateInvoiceTerm(@RequestBody UpdateInvoiceTermRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityGlAccount
     * <p>service: updateTaxAuthorityGlAccount  entities: TaxAuthorityGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateOrganizationTaxAuthorityGlAccount")
    public ResponseEntity<UpdateTaxAuthorityGlAccountResponse> updateTaxAuthorityGlAccount(@RequestBody UpdateTaxAuthorityGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update accounting preferences for a party (organization)
     * <p>service: updatePartyAcctgPreference  entities: PartyAcctgPreference  auth: true
     */
    @PostMapping("/accounting/control/updatePartyAcctgPreference")
    public ResponseEntity<UpdatePartyAcctgPreferenceResponse> updatePartyAcctgPreference(@RequestBody UpdatePartyAcctgPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party to Fixed Asset
     * <p>service: updatePartyFixedAssetAssignment  entities: PartyFixedAssetAssignment  auth: true
     */
    @PostMapping("/accounting/control/updatePartyFixedAssetAssignment")
    public ResponseEntity<UpdatePartyFixedAssetAssignmentResponse> updatePartyFixedAssetAssignment(@RequestBody UpdatePartyFixedAssetAssignmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing General Ledger Account of a Party
     * <p>service: updatePartyGlAccount  entities: PartyGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updatePartyGlAccount")
    public ResponseEntity<UpdatePartyGlAccountResponse> updatePartyGlAccount(@RequestBody UpdatePartyGlAccountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment
     * <p>service: updatePayment  entities: Payment  auth: true
     */
    @PostMapping("/accounting/control/updatePayment")
    public ResponseEntity<UpdatePaymentResponse> updatePayment(@RequestBody UpdatePaymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a payment to a Invoice or other payment or Billing account or Taxauthority, If no ammountApplied is supplied the system will calculate and use the maximum possible value.
     * <p>service: updatePaymentApplicationDef  entities: PaymentApplication  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentApplication")
    public ResponseEntity<UpdatePaymentApplicationDefResponse> updatePaymentApplicationDefUpdatePaymentApplication(@RequestBody UpdatePaymentApplicationDefRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group
     * <p>service: updatePaymentGroup  entities: PaymentGroup  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentGroup")
    public ResponseEntity<UpdatePaymentGroupResponse> updatePaymentGroupUpdatePaymentGroup(@RequestBody UpdatePaymentGroupRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Group Member
     * <p>service: updatePaymentGroupMember  entities: PaymentGroupMember  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentGroupMember")
    public ResponseEntity<UpdatePaymentGroupMemberResponse> updatePaymentGroupMemberUpdatePaymentGroupMember(@RequestBody UpdatePaymentGroupMemberRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Payment Method Type
     * <p>service: updatePaymentMethodType  entities: PaymentMethodType  auth: true
     */
    @PostMapping("/accounting/control/updatePaymentMethodType")
    public ResponseEntity<UpdatePaymentMethodTypeResponse> updatePaymentMethodType(@RequestBody UpdatePaymentMethodTypeRequest request) {
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
    public ResponseEntity<UpdateRateAmountResponse> updateRateAmount(@RequestBody UpdateRateAmountRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthority
     * <p>service: updateTaxAuthority  entities: TaxAuthority  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthority")
    public ResponseEntity<UpdateTaxAuthorityResponse> updateTaxAuthority(@RequestBody UpdateTaxAuthorityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityAssoc
     * <p>service: updateTaxAuthorityAssoc  entities: TaxAuthorityAssoc  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityAssoc")
    public ResponseEntity<UpdateTaxAuthorityAssocResponse> updateTaxAuthorityAssoc(@RequestBody UpdateTaxAuthorityAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityCategory
     * <p>service: updateTaxAuthorityCategory  entities: TaxAuthorityCategory  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityCategory")
    public ResponseEntity<UpdateTaxAuthorityCategoryResponse> updateTaxAuthorityCategory(@RequestBody UpdateTaxAuthorityCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update PartyTaxAuthInfo
     * <p>service: updatePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityPartyInfo")
    public ResponseEntity<UpdatePartyTaxAuthInfoResponse> updatePartyTaxAuthInfo(@RequestBody UpdatePartyTaxAuthInfoRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update TaxAuthorityRateProduct
     * <p>service: updateTaxAuthorityRateProduct  entities: TaxAuthorityRateProduct  auth: true
     */
    @PostMapping("/accounting/control/updateTaxAuthorityRateProduct")
    public ResponseEntity<UpdateTaxAuthorityRateProductResponse> updateTaxAuthorityRateProduct(@RequestBody UpdateTaxAuthorityRateProductRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Variance Reason Gl Account
     * <p>service: updateVarianceReasonGlAccount  entities: VarianceReasonGlAccount  auth: true
     */
    @PostMapping("/accounting/control/updateVarianceReasonGlAccount")
    public ResponseEntity<UpdateVarianceReasonGlAccountResponse> updateVarianceReasonGlAccount(@RequestBody UpdateVarianceReasonGlAccountRequest request) {
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
    public ResponseEntity<UploadAgreementContentFileResponse> uploadAgreementContentFile(@RequestBody UploadAgreementContentFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sets payment status to PMNT_VOID, removes all PaymentApplications, changes related invoice statuses to INVOICE_READY if status is INVOICE_PAID, and reverses related AcctgTrans by calling copyAcctgTransAndEntries service
     * <p>service: voidPayment  entities: unknown  auth: true
     */
    @PostMapping("/accounting/control/voidPayment")
    public ResponseEntity<VoidPaymentResponse> voidPayment(@RequestBody VoidPaymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel all payments for payment group
     * <p>service: cancelCheckRunPayments  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/cancelCheckRunPayments")
    public ResponseEntity<CancelCheckRunPaymentsResponse> cancelCheckRunPaymentsCancelCheckRunPayments(@RequestBody CancelCheckRunPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/ap/control/createInvoice")
    public ResponseEntity<CreateInvoiceResponse> createInvoiceCreateInvoice(@RequestBody CreateInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/createPayment")
    public ResponseEntity<CreatePaymentAndFinAccountTransResponse> createPaymentAndFinAccountTransCreatePayment2(@RequestBody CreatePaymentAndFinAccountTransRequest request) {
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
    public ResponseEntity<MassChangeInvoiceStatusResponse> massChangeInvoiceStatus(@RequestBody MassChangeInvoiceStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates Payments, Payment Application and Payment Group for the same
     * <p>service: createPaymentAndPaymentGroupForInvoices  entities: unknown  auth: true
     */
    @PostMapping("/ap/control/processMassCheckRun")
    public ResponseEntity<CreatePaymentAndPaymentGroupForInvoicesResponse> createPaymentAndPaymentGroupForInvoices(@RequestBody CreatePaymentAndPaymentGroupForInvoicesRequest request) {
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
    public ResponseEntity<CancelPaymentBatchResponse> cancelPaymentBatchCancelPaymentGroup(@RequestBody CancelPaymentBatchRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Invoice Record
     * <p>service: createInvoice  entities: Invoice  auth: true
     */
    @PostMapping("/ar/control/createInvoice")
    public ResponseEntity<CreateInvoiceResponse> createInvoiceCreateInvoice2(@RequestBody CreateInvoiceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * create new payment and associate with respective financial account in FinAccountTrans Entity.
     * <p>service: createPaymentAndFinAccountTrans  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/createPayment")
    public ResponseEntity<CreatePaymentAndFinAccountTransResponse> createPaymentAndFinAccountTransCreatePayment3(@RequestBody CreatePaymentAndFinAccountTransRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deposit withdraw payments
     * <p>service: depositWithdrawPayments  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/createPaymentBatch")
    public ResponseEntity<DepositWithdrawPaymentsResponse> depositWithdrawPaymentsCreatePaymentBatch(@RequestBody DepositWithdrawPaymentsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set status of invoices in bulk.
     * <p>service: massChangeInvoiceStatus  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/massChangeInvoiceStatus")
    public ResponseEntity<MassChangeInvoiceStatusResponse> massChangeInvoiceStatusMassChangeInvoiceStatus(@RequestBody MassChangeInvoiceStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set status of Payments in bulk.
     * <p>service: massChangePaymentStatus  entities: unknown  auth: true
     */
    @PostMapping("/ar/control/massChangePaymentStatus")
    public ResponseEntity<MassChangePaymentStatusResponse> massChangePaymentStatus(@RequestBody MassChangePaymentStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
