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
@Table(name = "subscription_comm_event")
public class SubscriptionCommEvent {
    @Id
    @Column(name = "subscription_id")
    private String subscriptionId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;
}
