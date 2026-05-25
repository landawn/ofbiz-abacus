package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
