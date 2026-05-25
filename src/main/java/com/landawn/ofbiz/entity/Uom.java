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
@Table(name = "uom")
public class Uom {
    @Id
    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "uom_type_id")
    private String uomTypeId;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "numeric_code")
    private double numericCode;

    @Column(name = "description")
    private String description;
}
