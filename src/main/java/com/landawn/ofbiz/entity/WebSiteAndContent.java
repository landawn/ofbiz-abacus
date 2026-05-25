package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "web_site_and_content")
public class WebSiteAndContent {
    @ReadOnly
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "site_name")
    private String siteName;

    @ReadOnly
    @Column(name = "http_host")
    private String httpHost;

    @ReadOnly
    @Column(name = "http_port")
    private String httpPort;

    @ReadOnly
    @Column(name = "https_host")
    private String httpsHost;

    @ReadOnly
    @Column(name = "https_port")
    private String httpsPort;

    @ReadOnly
    @Column(name = "enable_https")
    private String enableHttps;

    @ReadOnly
    @Column(name = "webapp_path")
    private String webappPath;

    @ReadOnly
    @Column(name = "standard_content_prefix")
    private String standardContentPrefix;

    @ReadOnly
    @Column(name = "secure_content_prefix")
    private String secureContentPrefix;

    @ReadOnly
    @Column(name = "cookie_domain")
    private String cookieDomain;

    @ReadOnly
    @Column(name = "visual_theme_set_id")
    private String visualThemeSetId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "allow_product_store_change")
    private String allowProductStoreChange;

    @ReadOnly
    @Column(name = "hosted_path_alias")
    private String hostedPathAlias;

    @ReadOnly
    @Column(name = "is_default")
    private String isDefault;

    @ReadOnly
    @Column(name = "display_maintenance_page")
    private String displayMaintenancePage;

    @ReadOnly
    @Column(name = "content_id")
    private String contentId;

    @ReadOnly
    @Column(name = "web_site_content_type_id")
    private String webSiteContentTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
