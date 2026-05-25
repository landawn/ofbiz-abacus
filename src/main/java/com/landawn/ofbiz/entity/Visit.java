package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "visit")
public class Visit {
    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "visitor_id")
    private String visitorId;

    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "user_created")
    private String userCreated;

    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "server_ip_address")
    private String serverIpAddress;

    @Column(name = "server_host_name")
    private String serverHostName;

    @Column(name = "webapp_name")
    private String webappName;

    @Column(name = "initial_locale")
    private String initialLocale;

    @Column(name = "initial_request")
    private String initialRequest;

    @Column(name = "initial_referrer")
    private String initialReferrer;

    @Column(name = "initial_user_agent")
    private String initialUserAgent;

    @Column(name = "user_agent_id")
    private String userAgentId;

    @Column(name = "client_ip_address")
    private String clientIpAddress;

    @Column(name = "client_host_name")
    private String clientHostName;

    @Column(name = "client_user")
    private String clientUser;

    @Column(name = "client_ip_isp_name")
    private String clientIpIspName;

    @Column(name = "client_ip_postal_code")
    private String clientIpPostalCode;

    @Column(name = "cookie")
    private String cookie;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "client_ip_state_prov_geo_id")
    private String clientIpStateProvGeoId;

    @Column(name = "client_ip_country_geo_id")
    private String clientIpCountryGeoId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @JoinedBy("visitorId=Visitor.visitorId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Visitor visitor;

    @JoinedBy("userAgentId=UserAgent.userAgentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserAgent userAgent;
}
