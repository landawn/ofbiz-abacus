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
@Table(name = "requirement_status")
public class RequirementStatus {
    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
