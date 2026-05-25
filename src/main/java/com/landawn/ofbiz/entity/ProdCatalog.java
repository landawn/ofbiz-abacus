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
@Table(name = "prod_catalog")
public class ProdCatalog {
    @Id
    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @Column(name = "catalog_name")
    private String catalogName;

    @Column(name = "use_quick_add")
    private String useQuickAdd;

    @Column(name = "style_sheet")
    private String styleSheet;

    @Column(name = "header_logo")
    private String headerLogo;

    @Column(name = "content_path_prefix")
    private String contentPathPrefix;

    @Column(name = "template_path_prefix")
    private String templatePathPrefix;

    @Column(name = "view_allow_perm_reqd")
    private String viewAllowPermReqd;

    @Column(name = "purchase_allow_perm_reqd")
    private String purchaseAllowPermReqd;
}
