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
@Table(name = "order_adjustment")
public class OrderAdjustment {
    @Id
    @Column(name = "order_adjustment_id")
    private String orderAdjustmentId;

    @Column(name = "order_adjustment_type_id")
    private String orderAdjustmentTypeId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private double amount;

    @Column(name = "recurring_amount")
    private double recurringAmount;

    @Column(name = "amount_already_included")
    private double amountAlreadyIncluded;

    @Column(name = "product_promo_id")
    private String productPromoId;

    @Column(name = "product_promo_rule_id")
    private String productPromoRuleId;

    @Column(name = "product_promo_action_seq_id")
    private String productPromoActionSeqId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "corresponding_product_id")
    private String correspondingProductId;

    @Column(name = "tax_authority_rate_seq_id")
    private String taxAuthorityRateSeqId;

    @Column(name = "source_reference_id")
    private String sourceReferenceId;

    @Column(name = "source_percentage")
    private double sourcePercentage;

    @Column(name = "customer_reference_id")
    private String customerReferenceId;

    @Column(name = "primary_geo_id")
    private String primaryGeoId;

    @Column(name = "secondary_geo_id")
    private String secondaryGeoId;

    @Column(name = "exempt_amount")
    private double exemptAmount;

    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @Column(name = "include_in_tax")
    private String includeInTax;

    @Column(name = "include_in_shipping")
    private String includeInShipping;

    @Column(name = "is_manual")
    private String isManual;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "original_adjustment_id")
    private String originalAdjustmentId;
}
