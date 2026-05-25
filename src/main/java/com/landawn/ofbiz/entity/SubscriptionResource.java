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
@Table(name = "subscription_resource")
public class SubscriptionResource {
    @Id
    @Column(name = "subscription_resource_id")
    private String subscriptionResourceId;

    @Column(name = "parent_resource_id")
    private String parentResourceId;

    @Column(name = "description")
    private String description;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "web_site_id")
    private String webSiteId;

    @Column(name = "service_name_on_expiry")
    private String serviceNameOnExpiry;
}
