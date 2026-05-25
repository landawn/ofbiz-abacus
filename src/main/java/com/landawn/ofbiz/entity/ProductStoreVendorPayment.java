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
@Table(name = "product_store_vendor_payment")
public class ProductStoreVendorPayment {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @Id
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Id
    @Column(name = "credit_card_enum_id")
    private String creditCardEnumId;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("vendorPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("paymentMethodTypeId=PaymentMethodType.paymentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethodType paymentMethodType;

    @JoinedBy("creditCardEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
