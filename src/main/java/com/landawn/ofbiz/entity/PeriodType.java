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
@Table(name = "period_type")
public class PeriodType {
    @Id
    @Column(name = "period_type_id")
    private String periodTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "period_length")
    private double periodLength;

    @Column(name = "uom_id")
    private String uomId;
}
