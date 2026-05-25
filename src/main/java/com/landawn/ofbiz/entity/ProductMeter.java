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
@Table(name = "product_meter")
public class ProductMeter {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_meter_type_id")
    private String productMeterTypeId;

    @Column(name = "meter_uom_id")
    private String meterUomId;

    @Column(name = "meter_name")
    private String meterName;
}
