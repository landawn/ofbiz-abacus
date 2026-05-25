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
@Table(name = "marketing_campaign_price")
public class MarketingCampaignPrice {
    @Id
    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Id
    @Column(name = "product_price_rule_id")
    private String productPriceRuleId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("marketingCampaignId=MarketingCampaign.marketingCampaignId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketingCampaign marketingCampaign;

    @JoinedBy("productPriceRuleId=ProductPriceRule.productPriceRuleId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPriceRule productPriceRule;
}
