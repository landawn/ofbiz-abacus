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
@Table(name = "product_subscription_resource")
public class ProductSubscriptionResource {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "subscription_resource_id")
    private String subscriptionResourceId;

    @Id
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

    @Column(name = "use_role_type_id")
    private String useRoleTypeId;

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
}
