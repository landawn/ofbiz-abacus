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
@Table(name = "portlet_portlet_category")
public class PortletPortletCategory {
    @Id
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @Id
    @Column(name = "portlet_category_id")
    private String portletCategoryId;
}
