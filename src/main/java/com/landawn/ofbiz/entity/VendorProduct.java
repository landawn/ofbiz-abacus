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
@Table(name = "vendor_product")
public class VendorProduct {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @Id
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;
}
