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
@Table(name = "cust_request_status")
public class CustRequestStatus {
    @Id
    @Column(name = "cust_request_status_id")
    private String custRequestStatusId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "cust_request_id")
    private String custRequestId;

    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
