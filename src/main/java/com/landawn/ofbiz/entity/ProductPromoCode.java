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
@Table(name = "product_promo_code")
public class ProductPromoCode {
    @Id
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @Column(name = "product_promo_id")
    private String productPromoId;

    @Column(name = "user_entered")
    private String userEntered;

    @Column(name = "require_email_or_party")
    private String requireEmailOrParty;

    @Column(name = "use_limit_per_code")
    private double useLimitPerCode;

    @Column(name = "use_limit_per_customer")
    private double useLimitPerCustomer;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
