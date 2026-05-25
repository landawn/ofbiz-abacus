package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "portal_page_and_portlet")
public class PortalPageAndPortlet {
    @ReadOnly
    @Column(name = "portlet_sequence_num")
    private String portletSequenceNum;

    @ReadOnly
    @Column(name = "portal_page_id")
    private String portalPageId;

    @ReadOnly
    @Column(name = "portal_page_name")
    private String portalPageName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "owner_user_login_id")
    private String ownerUserLoginId;

    @ReadOnly
    @Column(name = "original_portal_page_id")
    private String originalPortalPageId;

    @ReadOnly
    @Column(name = "parent_portal_page_id")
    private String parentPortalPageId;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "security_group_id")
    private String securityGroupId;

    @ReadOnly
    @Column(name = "help_content_id")
    private String helpContentId;

    @ReadOnly
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @ReadOnly
    @Column(name = "portlet_seq_id")
    private String portletSeqId;

    @ReadOnly
    @Column(name = "column_seq_id")
    private String columnSeqId;
}
