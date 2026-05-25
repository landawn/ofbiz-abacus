package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "product_feature_price")
public class ProductFeaturePrice {
    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Id
    @Column(name = "product_price_type_id")
    private String productPriceTypeId;

    @Id
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "price")
    private double price;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("productPriceTypeId=ProductPriceType.productPriceTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPriceType productPriceType;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;
}
