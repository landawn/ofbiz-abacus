package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "payment_gateway_resp_msg")
public class PaymentGatewayRespMsg {
    @Id
    @Column(name = "payment_gateway_resp_msg_id")
    private String paymentGatewayRespMsgId;

    @Column(name = "payment_gateway_response_id")
    private String paymentGatewayResponseId;

    @Column(name = "pgr_message")
    private String pgrMessage;

    @JoinedBy("paymentGatewayResponseId=PaymentGatewayResponse.paymentGatewayResponseId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayResponse paymentGatewayResponse;
}
