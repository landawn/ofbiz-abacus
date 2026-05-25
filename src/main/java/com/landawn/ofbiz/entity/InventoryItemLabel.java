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
@Table(name = "inventory_item_label")
public class InventoryItemLabel {
    @Id
    @Column(name = "inventory_item_label_id")
    private String inventoryItemLabelId;

    @Column(name = "inventory_item_label_type_id")
    private String inventoryItemLabelTypeId;

    @Column(name = "description")
    private String description;
}
