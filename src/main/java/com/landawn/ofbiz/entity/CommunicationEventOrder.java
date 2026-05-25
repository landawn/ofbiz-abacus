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
@Table(name = "communication_event_order")
public class CommunicationEventOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("communicationEventId=CommunicationEvent.communicationEventId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CommunicationEvent communicationEvent;
}
