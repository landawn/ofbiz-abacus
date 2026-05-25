package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_payment_preference")
public class OrderPaymentPreference {
    @Id
    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "product_price_purpose_id")
    private String productPricePurposeId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "security_code")
    private String securityCode;

    @Column(name = "track2")
    private String track2;

    @Column(name = "present_flag")
    private String presentFlag;

    @Column(name = "swiped_flag")
    private String swipedFlag;

    @Column(name = "overflow_flag")
    private String overflowFlag;

    @Column(name = "max_amount")
    private double maxAmount;

    @Column(name = "process_attempt")
    private double processAttempt;

    @Column(name = "billing_postal_code")
    private String billingPostalCode;

    @Column(name = "manual_auth_code")
    private String manualAuthCode;

    @Column(name = "manual_ref_num")
    private String manualRefNum;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "needs_nsf_retry")
    private String needsNsfRetry;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("productPricePurposeId=ProductPricePurpose.productPricePurposeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPricePurpose productPricePurpose;

    @JoinedBy("paymentMethodTypeId=PaymentMethodType.paymentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethodType paymentMethodType;

    @JoinedBy("paymentMethodId=PaymentMethod.paymentMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethod paymentMethod;

    @JoinedBy("finAccountId=FinAccount.finAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccount finAccount;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
