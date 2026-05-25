package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "return_status")
public class ReturnStatus {
    @Id
    @Column(name = "return_status_id")
    private String returnStatusId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;

    @Column(name = "status_datetime")
    private Timestamp statusDatetime;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("returnId=ReturnHeader.returnId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeader returnHeader;

    @JoinedBy("changeByUserLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
