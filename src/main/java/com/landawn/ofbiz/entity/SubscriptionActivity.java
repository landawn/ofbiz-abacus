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
@Table(name = "subscription_activity")
public class SubscriptionActivity {
    @Id
    @Column(name = "subscription_activity_id")
    private String subscriptionActivityId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "date_sent")
    private Timestamp dateSent;
}
