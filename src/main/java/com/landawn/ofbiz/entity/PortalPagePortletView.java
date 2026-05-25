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
@Table(name = "portal_page_portlet_view")
public class PortalPagePortletView {
    @ReadOnly
    @Column(name = "portal_page_id")
    private String portalPageId;

    @ReadOnly
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @ReadOnly
    @Column(name = "portlet_seq_id")
    private String portletSeqId;

    @ReadOnly
    @Column(name = "column_seq_id")
    private String columnSeqId;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "portlet_name")
    private String portletName;

    @ReadOnly
    @Column(name = "screen_name")
    private String screenName;

    @ReadOnly
    @Column(name = "screen_location")
    private String screenLocation;

    @ReadOnly
    @Column(name = "edit_form_name")
    private String editFormName;

    @ReadOnly
    @Column(name = "edit_form_location")
    private String editFormLocation;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "screenshot")
    private String screenshot;

    @ReadOnly
    @Column(name = "security_service_name")
    private String securityServiceName;

    @ReadOnly
    @Column(name = "security_main_action")
    private String securityMainAction;
}
