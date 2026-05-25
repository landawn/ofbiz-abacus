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
@Table(name = "product_promo")
public class ProductPromo {
    @Id
    @Column(name = "product_promo_id")
    private String productPromoId;

    @Column(name = "promo_name")
    private String promoName;

    @Column(name = "promo_text")
    private String promoText;

    @Column(name = "user_entered")
    private String userEntered;

    @Column(name = "show_to_customer")
    private String showToCustomer;

    @Column(name = "require_code")
    private String requireCode;

    @Column(name = "use_limit_per_order")
    private double useLimitPerOrder;

    @Column(name = "use_limit_per_customer")
    private double useLimitPerCustomer;

    @Column(name = "use_limit_per_promotion")
    private double useLimitPerPromotion;

    @Column(name = "billback_factor")
    private double billbackFactor;

    @Column(name = "override_org_party_id")
    private String overrideOrgPartyId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("overrideOrgPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;
}
