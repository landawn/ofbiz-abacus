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
@Table(name = "subscription")
public class Subscription {
    @Id
    @Column(name = "subscription_id")
    private String subscriptionId;

    @Column(name = "description")
    private String description;

    @Column(name = "subscription_resource_id")
    private String subscriptionResourceId;

    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "originated_from_party_id")
    private String originatedFromPartyId;

    @Column(name = "originated_from_role_type_id")
    private String originatedFromRoleTypeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "party_need_id")
    private String partyNeedId;

    @Column(name = "need_type_id")
    private String needTypeId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "subscription_type_id")
    private String subscriptionTypeId;

    @Column(name = "external_subscription_id")
    private String externalSubscriptionId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "purchase_from_date")
    private Timestamp purchaseFromDate;

    @Column(name = "purchase_thru_date")
    private Timestamp purchaseThruDate;

    @Column(name = "max_life_time")
    private double maxLifeTime;

    @Column(name = "max_life_time_uom_id")
    private String maxLifeTimeUomId;

    @Column(name = "available_time")
    private double availableTime;

    @Column(name = "available_time_uom_id")
    private String availableTimeUomId;

    @Column(name = "use_count_limit")
    private double useCountLimit;

    @Column(name = "use_time")
    private double useTime;

    @Column(name = "use_time_uom_id")
    private String useTimeUomId;

    @Column(name = "automatic_extend")
    private String automaticExtend;

    @Column(name = "cancl_autm_ext_time")
    private double canclAutmExtTime;

    @Column(name = "cancl_autm_ext_time_uom_id")
    private String canclAutmExtTimeUomId;

    @Column(name = "grace_period_on_expiry")
    private double gracePeriodOnExpiry;

    @Column(name = "grace_period_on_expiry_uom_id")
    private String gracePeriodOnExpiryUomId;

    @Column(name = "expiration_completed_date")
    private Timestamp expirationCompletedDate;
}
