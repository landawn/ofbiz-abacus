package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_gateway_response")
public class PaymentGatewayResponse {
    @Id
    @Column(name = "payment_gateway_response_id")
    private String paymentGatewayResponseId;

    @Column(name = "payment_service_type_enum_id")
    private String paymentServiceTypeEnumId;

    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "trans_code_enum_id")
    private String transCodeEnumId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "reference_num")
    private String referenceNum;

    @Column(name = "alt_reference")
    private String altReference;

    @Column(name = "sub_reference")
    private String subReference;

    @Column(name = "gateway_code")
    private String gatewayCode;

    @Column(name = "gateway_flag")
    private String gatewayFlag;

    @Column(name = "gateway_avs_result")
    private String gatewayAvsResult;

    @Column(name = "gateway_cv_result")
    private String gatewayCvResult;

    @Column(name = "gateway_score_result")
    private String gatewayScoreResult;

    @Column(name = "gateway_message")
    private String gatewayMessage;

    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @Column(name = "result_declined")
    private String resultDeclined;

    @Column(name = "result_nsf")
    private String resultNsf;

    @Column(name = "result_bad_expire")
    private String resultBadExpire;

    @Column(name = "result_bad_card_number")
    private String resultBadCardNumber;
}
