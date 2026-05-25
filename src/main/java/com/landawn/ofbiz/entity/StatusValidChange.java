package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "status_valid_change")
public class StatusValidChange {
    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_id_to")
    private String statusIdTo;

    @Column(name = "condition_expression")
    private String conditionExpression;

    @Column(name = "transition_name")
    private String transitionName;
}
