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
@Table(name = "party_profile_default")
public class PartyProfileDefault {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "default_ship_addr")
    private String defaultShipAddr;

    @Column(name = "default_bill_addr")
    private String defaultBillAddr;

    @Column(name = "default_pay_meth")
    private String defaultPayMeth;

    @Column(name = "default_ship_meth")
    private String defaultShipMeth;
}
