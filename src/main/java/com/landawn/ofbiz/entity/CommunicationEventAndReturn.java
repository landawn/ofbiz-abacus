package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "communication_event_and_return")
public class CommunicationEventAndReturn {
    @ReadOnly
    @Column(name = "return_id")
    private String returnId;

    @ReadOnly
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @ReadOnly
    @Column(name = "communication_event_type_id")
    private String communicationEventTypeId;

    @ReadOnly
    @Column(name = "orig_comm_event_id")
    private String origCommEventId;

    @ReadOnly
    @Column(name = "parent_comm_event_id")
    private String parentCommEventId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "contact_mech_id_from")
    private String contactMechIdFrom;

    @ReadOnly
    @Column(name = "contact_mech_id_to")
    private String contactMechIdTo;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "entry_date")
    private Timestamp entryDate;

    @ReadOnly
    @Column(name = "datetime_started")
    private Timestamp datetimeStarted;

    @ReadOnly
    @Column(name = "datetime_ended")
    private Timestamp datetimeEnded;

    @ReadOnly
    @Column(name = "subject")
    private String subject;

    @ReadOnly
    @Column(name = "content_mime_type_id")
    private String contentMimeTypeId;

    @ReadOnly
    @Column(name = "content")
    private String content;

    @ReadOnly
    @Column(name = "note")
    private String note;

    @ReadOnly
    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @ReadOnly
    @Column(name = "contact_list_id")
    private String contactListId;

    @ReadOnly
    @Column(name = "header_string")
    private String headerString;

    @ReadOnly
    @Column(name = "from_string")
    private String fromString;

    @ReadOnly
    @Column(name = "to_string")
    private String toString;

    @ReadOnly
    @Column(name = "cc_string")
    private String ccString;

    @ReadOnly
    @Column(name = "bcc_string")
    private String bccString;

    @ReadOnly
    @Column(name = "message_id")
    private String messageId;
}
