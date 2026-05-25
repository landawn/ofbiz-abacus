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
@Table(name = "product_assoc")
public class ProductAssoc {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_id_to")
    private String productIdTo;

    @Id
    @Column(name = "product_assoc_type_id")
    private String productAssocTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "reason")
    private String reason;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "scrap_factor")
    private double scrapFactor;

    @Column(name = "instruction")
    private String instruction;

    @Column(name = "routing_work_effort_id")
    private String routingWorkEffortId;

    @Column(name = "estimate_calc_method")
    private String estimateCalcMethod;

    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;
}
