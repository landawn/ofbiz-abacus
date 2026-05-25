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
@Table(name = "payment_content")
public class PaymentContent {
    @Id
    @Column(name = "payment_id")
    private String paymentId;

    @Id
    @Column(name = "payment_content_type_id")
    private String paymentContentTypeId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("paymentContentTypeId=PaymentContentType.paymentContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentContentType paymentContentType;
}
