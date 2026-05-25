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
@Table(name = "portal_page")
public class PortalPage {
    @Id
    @Column(name = "portal_page_id")
    private String portalPageId;

    @Column(name = "portal_page_name")
    private String portalPageName;

    @Column(name = "description")
    private String description;

    @Column(name = "owner_user_login_id")
    private String ownerUserLoginId;

    @Column(name = "original_portal_page_id")
    private String originalPortalPageId;

    @Column(name = "parent_portal_page_id")
    private String parentPortalPageId;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "security_group_id")
    private String securityGroupId;

    @Column(name = "help_content_id")
    private String helpContentId;
}
