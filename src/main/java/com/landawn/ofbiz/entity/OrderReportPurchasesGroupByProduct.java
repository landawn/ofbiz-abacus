package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "order_report_purchases_group_by_product")
public class OrderReportPurchasesGroupByProduct {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "order_status_id")
    private String orderStatusId;

    @ReadOnly
    @Column(name = "order_item_status_id")
    private String orderItemStatusId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "to_party_id")
    private String toPartyId;

    @ReadOnly
    @Column(name = "to_role_type_id")
    private String toRoleTypeId;

    @ReadOnly
    @Column(name = "from_party_id")
    private String fromPartyId;

    @ReadOnly
    @Column(name = "from_role_type_id")
    private String fromRoleTypeId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "unit_price")
    private double unitPrice;
}
