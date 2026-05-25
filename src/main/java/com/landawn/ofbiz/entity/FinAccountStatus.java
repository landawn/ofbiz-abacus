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
@Table(name = "fin_account_status")
public class FinAccountStatus {
    @Id
    @Column(name = "fin_account_id")
    private String finAccountId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "status_end_date")
    private Timestamp statusEndDate;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
