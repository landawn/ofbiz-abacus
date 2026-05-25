package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "communication_event_type")
public class CommunicationEventType {
    @Id
    @Column(name = "communication_event_type_id")
    private String communicationEventTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @JoinedBy("parentTypeId=CommunicationEventType.communicationEventTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CommunicationEventType communicationEventType;

    @JoinedBy("contactMechTypeId=ContactMechType.contactMechTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMechType contactMechType;
}
