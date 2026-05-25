package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem status;

    @JoinedBy("statusIdTo=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusTo;
}
