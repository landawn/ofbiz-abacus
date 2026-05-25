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
@Table(name = "portlet_attribute")
public class PortletAttribute {
    @Id
    @Column(name = "portal_page_id")
    private String portalPageId;

    @Id
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @Id
    @Column(name = "portlet_seq_id")
    private String portletSeqId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;

    @Column(name = "attr_type")
    private String attrType;

    @JoinedBy("portalPortletId=PortalPortlet.portalPortletId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PortalPortlet portalPortlet;
}
