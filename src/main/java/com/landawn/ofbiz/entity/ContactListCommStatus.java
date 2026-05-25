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
@Table(name = "contact_list_comm_status")
public class ContactListCommStatus {
    @Id
    @Column(name = "contact_list_id")
    private String contactListId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
