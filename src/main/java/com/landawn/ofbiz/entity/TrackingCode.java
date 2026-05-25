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
@Table(name = "tracking_code")
public class TrackingCode {
    @Id
    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @Column(name = "tracking_code_type_id")
    private String trackingCodeTypeId;

    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Column(name = "redirect_url")
    private String redirectUrl;

    @Column(name = "override_logo")
    private String overrideLogo;

    @Column(name = "override_css")
    private String overrideCss;

    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "description")
    private String description;

    @Column(name = "trackable_lifetime")
    private double trackableLifetime;

    @Column(name = "billable_lifetime")
    private double billableLifetime;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "subgroup_id")
    private String subgroupId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("marketingCampaignId=MarketingCampaign.marketingCampaignId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketingCampaign marketingCampaign;

    @JoinedBy("trackingCodeTypeId=TrackingCodeType.trackingCodeTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TrackingCodeType trackingCodeType;
}
