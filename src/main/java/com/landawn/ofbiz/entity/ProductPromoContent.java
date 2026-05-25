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
@Table(name = "product_promo_content")
public class ProductPromoContent {
    @Id
    @Column(name = "product_promo_id")
    private String productPromoId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "product_promo_content_type_id")
    private String productPromoContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
