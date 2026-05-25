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
@Table(name = "cost_component_calc")
public class CostComponentCalc {
    @Id
    @Column(name = "cost_component_calc_id")
    private String costComponentCalcId;

    @Column(name = "description")
    private String description;

    @Column(name = "cost_gl_account_type_id")
    private String costGlAccountTypeId;

    @Column(name = "offsetting_gl_account_type_id")
    private String offsettingGlAccountTypeId;

    @Column(name = "fixed_cost")
    private double fixedCost;

    @Column(name = "variable_cost")
    private double variableCost;

    @Column(name = "per_milli_second")
    private double perMilliSecond;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "cost_custom_method_id")
    private String costCustomMethodId;
}
