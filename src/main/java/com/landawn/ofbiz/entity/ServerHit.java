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
@Table(name = "server_hit")
public class ServerHit {
    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "hit_start_date_time")
    private Timestamp hitStartDateTime;

    @Id
    @Column(name = "hit_type_id")
    private String hitTypeId;

    @Column(name = "num_of_bytes")
    private double numOfBytes;

    @Column(name = "running_time_millis")
    private double runningTimeMillis;

    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "request_url")
    private String requestUrl;

    @Column(name = "referrer_url")
    private String referrerUrl;

    @Column(name = "server_ip_address")
    private String serverIpAddress;

    @Column(name = "server_host_name")
    private String serverHostName;

    @Column(name = "internal_content_id")
    private String internalContentId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "id_by_ip_contact_mech_id")
    private String idByIpContactMechId;

    @Column(name = "ref_by_web_contact_mech_id")
    private String refByWebContactMechId;

    @JoinedBy("hitTypeId=ServerHitType.hitTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ServerHitType serverHitType;

    @JoinedBy("visitId=Visit.visitId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Visit visit;
}
