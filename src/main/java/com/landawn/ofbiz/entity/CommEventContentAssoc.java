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
@Table(name = "comm_event_content_assoc")
public class CommEventContentAssoc {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Column(name = "comm_content_assoc_type_id")
    private String commContentAssocTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("communicationEventId=CommunicationEvent.communicationEventId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CommunicationEvent communicationEvent;

    @JoinedBy("commContentAssocTypeId=CommContentAssocType.commContentAssocTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CommContentAssocType commContentAssocType;
}
