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
@Table(name = "product_maint")
public class ProductMaint {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_maint_seq_id")
    private String productMaintSeqId;

    @Column(name = "product_maint_type_id")
    private String productMaintTypeId;

    @Column(name = "maint_name")
    private String maintName;

    @Column(name = "maint_template_work_effort_id")
    private String maintTemplateWorkEffortId;

    @Column(name = "interval_quantity")
    private double intervalQuantity;

    @Column(name = "interval_uom_id")
    private String intervalUomId;

    @Column(name = "interval_meter_type_id")
    private String intervalMeterTypeId;

    @Column(name = "repeat_count")
    private double repeatCount;
}
