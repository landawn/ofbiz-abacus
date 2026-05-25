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
@Table(name = "inventory_item_temp_res")
public class InventoryItemTempRes {
    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "reserved_date")
    private Timestamp reservedDate;
}
