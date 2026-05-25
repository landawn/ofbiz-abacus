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
@Table(name = "user_login_and_protected_view")
public class UserLoginAndProtectedView {
    @ReadOnly
    @Column(name = "user_login_id")
    private String userLoginId;

    @ReadOnly
    @Column(name = "group_id")
    private String groupId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "view_name_id")
    private String viewNameId;

    @ReadOnly
    @Column(name = "max_hits")
    private double maxHits;

    @ReadOnly
    @Column(name = "max_hits_duration")
    private double maxHitsDuration;

    @ReadOnly
    @Column(name = "tarpit_duration")
    private double tarpitDuration;
}
