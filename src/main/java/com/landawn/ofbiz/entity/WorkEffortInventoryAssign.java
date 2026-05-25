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
@Table(name = "work_effort_inventory_assign")
public class WorkEffortInventoryAssign {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "quantity")
    private Double quantity;
}
