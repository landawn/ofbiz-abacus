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
@Table(name = "portlet_portlet_category")
public class PortletPortletCategory {
    @Id
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @Id
    @Column(name = "portlet_category_id")
    private String portletCategoryId;

    @JoinedBy("portalPortletId=PortalPortlet.portalPortletId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PortalPortlet portalPortlet;

    @JoinedBy("portletCategoryId=PortletCategory.portletCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PortletCategory portletCategory;
}
