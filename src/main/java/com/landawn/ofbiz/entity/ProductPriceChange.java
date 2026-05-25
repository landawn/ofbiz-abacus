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
@Table(name = "product_price_change")
public class ProductPriceChange {
    @Id
    @Column(name = "product_price_change_id")
    private String productPriceChangeId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_price_type_id")
    private String productPriceTypeId;

    @Column(name = "product_price_purpose_id")
    private String productPricePurposeId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "price")
    private double price;

    @Column(name = "old_price")
    private double oldPrice;

    @Column(name = "changed_date")
    private Timestamp changedDate;

    @Column(name = "changed_by_user_login")
    private String changedByUserLogin;
}
