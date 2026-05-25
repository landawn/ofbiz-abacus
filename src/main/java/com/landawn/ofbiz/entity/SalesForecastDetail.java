package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "sales_forecast_detail")
public class SalesForecastDetail {
    @Id
    @Column(name = "sales_forecast_id")
    private String salesForecastId;

    @Id
    @Column(name = "sales_forecast_detail_id")
    private String salesForecastDetailId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @JoinedBy("salesForecastId=SalesForecast.salesForecastId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SalesForecast salesForecast;

    @JoinedBy("quantityUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;
}
