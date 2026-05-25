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
@Table(name = "web_analytics_config")
public class WebAnalyticsConfig {
    @Id
    @Column(name = "web_site_id")
    private String webSiteId;

    @Id
    @Column(name = "web_analytics_type_id")
    private String webAnalyticsTypeId;

    @Column(name = "web_analytics_code")
    private String webAnalyticsCode;
}
