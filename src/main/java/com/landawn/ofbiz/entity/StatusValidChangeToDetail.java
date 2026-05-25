package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "status_valid_change_to_detail")
public class StatusValidChangeToDetail {
    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "status_id_to")
    private String statusIdTo;

    @ReadOnly
    @Column(name = "condition_expression")
    private String conditionExpression;

    @ReadOnly
    @Column(name = "transition_name")
    private String transitionName;

    @ReadOnly
    @Column(name = "status_type_id")
    private String statusTypeId;

    @ReadOnly
    @Column(name = "status_code")
    private String statusCode;

    @ReadOnly
    @Column(name = "sequence_id")
    private String sequenceId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
