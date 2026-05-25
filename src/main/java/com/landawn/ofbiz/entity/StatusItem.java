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
@Table(name = "status_item")
public class StatusItem {
    @Id
    @Column(name = "status_id")
    private String statusId;

    @Column(name = "status_type_id")
    private String statusTypeId;

    @Column(name = "status_code")
    private String statusCode;

    @Column(name = "sequence_id")
    private String sequenceId;

    @Column(name = "description")
    private String description;

    @JoinedBy("statusTypeId=StatusType.statusTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusType statusType;
}
