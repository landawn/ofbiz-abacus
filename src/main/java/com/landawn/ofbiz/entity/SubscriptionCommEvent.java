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
@Table(name = "subscription_comm_event")
public class SubscriptionCommEvent {
    @Id
    @Column(name = "subscription_id")
    private String subscriptionId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @JoinedBy("communicationEventId=CommunicationEvent.communicationEventId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CommunicationEvent communicationEvent;

    @JoinedBy("subscriptionId=Subscription.subscriptionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Subscription subscription;
}
