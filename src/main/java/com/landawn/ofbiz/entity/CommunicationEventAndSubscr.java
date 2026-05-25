package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "communication_event_and_subscr")
public class CommunicationEventAndSubscr {
    @ReadOnly
    @Column(name = "subscription_id")
    private String subscriptionId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "subscription_resource_id")
    private String subscriptionResourceId;

    @ReadOnly
    @Column(name = "communication_event_id")
    private String communicationEventId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "originated_from_party_id")
    private String originatedFromPartyId;

    @ReadOnly
    @Column(name = "originated_from_role_type_id")
    private String originatedFromRoleTypeId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "party_need_id")
    private String partyNeedId;

    @ReadOnly
    @Column(name = "need_type_id")
    private String needTypeId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "subscription_type_id")
    private String subscriptionTypeId;

    @ReadOnly
    @Column(name = "external_subscription_id")
    private String externalSubscriptionId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "purchase_from_date")
    private Timestamp purchaseFromDate;

    @ReadOnly
    @Column(name = "purchase_thru_date")
    private Timestamp purchaseThruDate;

    @ReadOnly
    @Column(name = "max_life_time")
    private double maxLifeTime;

    @ReadOnly
    @Column(name = "max_life_time_uom_id")
    private String maxLifeTimeUomId;

    @ReadOnly
    @Column(name = "available_time")
    private double availableTime;

    @ReadOnly
    @Column(name = "available_time_uom_id")
    private String availableTimeUomId;

    @ReadOnly
    @Column(name = "use_count_limit")
    private double useCountLimit;

    @ReadOnly
    @Column(name = "use_time")
    private double useTime;

    @ReadOnly
    @Column(name = "use_time_uom_id")
    private String useTimeUomId;

    @ReadOnly
    @Column(name = "automatic_extend")
    private String automaticExtend;

    @ReadOnly
    @Column(name = "cancl_autm_ext_time")
    private double canclAutmExtTime;

    @ReadOnly
    @Column(name = "cancl_autm_ext_time_uom_id")
    private String canclAutmExtTimeUomId;

    @ReadOnly
    @Column(name = "grace_period_on_expiry")
    private double gracePeriodOnExpiry;

    @ReadOnly
    @Column(name = "grace_period_on_expiry_uom_id")
    private String gracePeriodOnExpiryUomId;

    @ReadOnly
    @Column(name = "expiration_completed_date")
    private Timestamp expirationCompletedDate;
}
