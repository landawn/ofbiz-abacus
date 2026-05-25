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
@Table(name = "supplier_product")
public class SupplierProduct {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "available_from_date")
    private Timestamp availableFromDate;

    @Column(name = "available_thru_date")
    private Timestamp availableThruDate;

    @Column(name = "supplier_pref_order_id")
    private String supplierPrefOrderId;

    @Column(name = "supplier_rating_type_id")
    private String supplierRatingTypeId;

    @Column(name = "standard_lead_time_days")
    private double standardLeadTimeDays;

    @Id
    @Column(name = "minimum_order_quantity")
    private double minimumOrderQuantity;

    @Column(name = "order_qty_increments")
    private double orderQtyIncrements;

    @Column(name = "units_included")
    private double unitsIncluded;

    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @Column(name = "agreement_id")
    private String agreementId;

    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Column(name = "last_price")
    private double lastPrice;

    @Column(name = "shipping_price")
    private double shippingPrice;

    @Id
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "supplier_product_name")
    private String supplierProductName;

    @Column(name = "supplier_product_id")
    private String supplierProductId;

    @Column(name = "can_drop_ship")
    private String canDropShip;

    @Column(name = "comments")
    private String comments;
}
