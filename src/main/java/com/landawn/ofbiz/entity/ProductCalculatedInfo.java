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
@Table(name = "product_calculated_info")
public class ProductCalculatedInfo {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "total_quantity_ordered")
    private double totalQuantityOrdered;

    @Column(name = "total_times_viewed")
    private double totalTimesViewed;

    @Column(name = "average_customer_rating")
    private double averageCustomerRating;
}
