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
@Table(name = "gift_card")
public class GiftCard {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "pin_number")
    private String pinNumber;

    @Column(name = "expire_date")
    private String expireDate;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @JoinedBy("paymentMethodId=PaymentMethod.paymentMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethod paymentMethod;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("contactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress postalAddress;
}
