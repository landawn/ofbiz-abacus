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
@Table(name = "old_picklist_status_history")
public class OldPicklistStatusHistory {
    @Id
    @Column(name = "picklist_id")
    private String picklistId;

    @Id
    @Column(name = "change_date")
    private Timestamp changeDate;

    @Column(name = "change_user_login_id")
    private String changeUserLoginId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "status_id_to")
    private String statusIdTo;
}
