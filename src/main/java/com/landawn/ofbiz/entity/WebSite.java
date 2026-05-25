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
@Table(name = "web_site")
public class WebSite {
    @Id
    @Column(name = "web_site_id")
    private String webSiteId;

    @Column(name = "site_name")
    private String siteName;

    @Column(name = "http_host")
    private String httpHost;

    @Column(name = "http_port")
    private String httpPort;

    @Column(name = "https_host")
    private String httpsHost;

    @Column(name = "https_port")
    private String httpsPort;

    @Column(name = "enable_https")
    private String enableHttps;

    @Column(name = "webapp_path")
    private String webappPath;

    @Column(name = "standard_content_prefix")
    private String standardContentPrefix;

    @Column(name = "secure_content_prefix")
    private String secureContentPrefix;

    @Column(name = "cookie_domain")
    private String cookieDomain;

    @Column(name = "visual_theme_set_id")
    private String visualThemeSetId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "allow_product_store_change")
    private String allowProductStoreChange;

    @Column(name = "hosted_path_alias")
    private String hostedPathAlias;

    @Column(name = "is_default")
    private String isDefault;

    @Column(name = "display_maintenance_page")
    private String displayMaintenancePage;

    @JoinedBy("visualThemeSetId=VisualThemeSet.visualThemeSetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private VisualThemeSet visualThemeSet;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;
}
