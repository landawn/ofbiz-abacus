package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

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

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;
}
