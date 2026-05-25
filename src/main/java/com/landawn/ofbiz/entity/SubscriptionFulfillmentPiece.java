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
@Table(name = "subscription_fulfillment_piece")
public class SubscriptionFulfillmentPiece {
    @Id
    @Column(name = "subscription_activity_id")
    private String subscriptionActivityId;

    @Id
    @Column(name = "subscription_id")
    private String subscriptionId;

    @JoinedBy("subscriptionId=Subscription.subscriptionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Subscription subscription;

    @JoinedBy("subscriptionActivityId=SubscriptionActivity.subscriptionActivityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SubscriptionActivity subscriptionActivity;
}
