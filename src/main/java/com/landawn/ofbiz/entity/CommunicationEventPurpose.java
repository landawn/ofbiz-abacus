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
@Table(name = "communication_event_purpose")
public class CommunicationEventPurpose {
    @Id
    @Column(name = "communication_event_prp_typ_id")
    private String communicationEventPrpTypId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Column(name = "description")
    private String description;
}
