package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_summary_entry")
public class OrderSummaryEntry {
    @Id
    @Column(name = "entry_date")
    private Date entryDate;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "total_quantity")
    private double totalQuantity;

    @Column(name = "gross_sales")
    private double grossSales;

    @Column(name = "product_cost")
    private double productCost;
}
