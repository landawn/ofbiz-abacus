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
@Table(name = "portal_portlet")
public class PortalPortlet {
    @Id
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @Column(name = "portlet_name")
    private String portletName;

    @Column(name = "screen_name")
    private String screenName;

    @Column(name = "screen_location")
    private String screenLocation;

    @Column(name = "edit_form_name")
    private String editFormName;

    @Column(name = "edit_form_location")
    private String editFormLocation;

    @Column(name = "description")
    private String description;

    @Column(name = "screenshot")
    private String screenshot;

    @Column(name = "security_service_name")
    private String securityServiceName;

    @Column(name = "security_main_action")
    private String securityMainAction;
}
