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

    @JoinedBy("parentResourceId=SubscriptionResource.subscriptionResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SubscriptionResource subscriptionResource;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("webSiteId=WebSite.webSiteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WebSite webSite;
}
