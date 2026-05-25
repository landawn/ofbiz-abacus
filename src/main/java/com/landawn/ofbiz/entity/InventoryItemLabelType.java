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
@Table(name = "inventory_item_label_type")
public class InventoryItemLabelType {
    @Id
    @Column(name = "inventory_item_label_type_id")
    private String inventoryItemLabelTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=InventoryItemLabelType.inventoryItemLabelTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItemLabelType inventoryItemLabelType;
}
