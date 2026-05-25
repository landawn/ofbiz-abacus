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
@Table(name = "gift_card_fulfillment")
public class GiftCardFulfillment {
    @Id
    @Column(name = "fulfillment_id")
    private String fulfillmentId;

    @Column(name = "type_enum_id")
    private String typeEnumId;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "pin_number")
    private String pinNumber;

    @Column(name = "amount")
    private double amount;

    @Column(name = "response_code")
    private String responseCode;

    @Column(name = "reference_num")
    private String referenceNum;

    @Column(name = "auth_code")
    private String authCode;

    @Column(name = "fulfillment_date")
    private Timestamp fulfillmentDate;
}
