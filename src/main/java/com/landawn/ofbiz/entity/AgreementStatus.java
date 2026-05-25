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
@Table(name = "agreement_status")
public class AgreementStatus {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
