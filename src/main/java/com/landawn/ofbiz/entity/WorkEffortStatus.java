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
@Table(name = "work_effort_status")
public class WorkEffortStatus {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_datetime")
    private Timestamp statusDatetime;

    @Column(name = "set_by_user_login")
    private String setByUserLogin;

    @Column(name = "reason")
    private String reason;
}
