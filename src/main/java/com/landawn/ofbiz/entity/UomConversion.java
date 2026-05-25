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
@Table(name = "uom_conversion")
public class UomConversion {
    @Id
    @Column(name = "uom_id")
    private String uomId;

    @Id
    @Column(name = "uom_id_to")
    private String uomIdTo;

    @Column(name = "conversion_factor")
    private Double conversionFactor;

    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "decimal_scale")
    private double decimalScale;

    @Column(name = "rounding_mode")
    private String roundingMode;

    @JoinedBy("uomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("uomIdTo=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uomTo;

    @JoinedBy("customMethodId=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;
}
