package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "communication_event")
public class CommunicationEvent {
    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Column(name = "communication_event_type_id")
    private String communicationEventTypeId;

    @Column(name = "orig_comm_event_id")
    private String origCommEventId;

    @Column(name = "parent_comm_event_id")
    private String parentCommEventId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @Column(name = "contact_mech_id_from")
    private String contactMechIdFrom;

    @Column(name = "contact_mech_id_to")
    private String contactMechIdTo;

    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "entry_date")
    private Timestamp entryDate;

    @Column(name = "datetime_started")
    private Timestamp datetimeStarted;

    @Column(name = "datetime_ended")
    private Timestamp datetimeEnded;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content_mime_type_id")
    private String contentMimeTypeId;

    @Column(name = "content")
    private String content;

    @Column(name = "note")
    private String note;

    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @Column(name = "contact_list_id")
    private String contactListId;

    @Column(name = "header_string")
    private String headerString;

    @Column(name = "from_string")
    private String fromString;

    @Column(name = "to_string")
    private String toString;

    @Column(name = "cc_string")
    private String ccString;

    @Column(name = "bcc_string")
    private String bccString;

    @Column(name = "message_id")
    private String messageId;
}
