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
@Table(name = "order_adjustment_type")
public class OrderAdjustmentType {
    @Id
    @Column(name = "order_adjustment_type_id")
    private String orderAdjustmentTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=OrderAdjustmentType.orderAdjustmentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderAdjustmentType orderAdjustmentType;
}
