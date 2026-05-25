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
@Table(name = "communication_event_role")
public class CommunicationEventRole {
    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "status_id")
    private String statusId;
}
