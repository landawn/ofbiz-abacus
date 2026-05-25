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
@Table(name = "uom_conversion_dated")
public class UomConversionDated {
    @Id
    @Column(name = "uom_id")
    private String uomId;

    @Id
    @Column(name = "uom_id_to")
    private String uomIdTo;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "conversion_factor")
    private Double conversionFactor;

    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "decimal_scale")
    private double decimalScale;

    @Column(name = "rounding_mode")
    private String roundingMode;

    @Column(name = "purpose_enum_id")
    private String purposeEnumId;
}
