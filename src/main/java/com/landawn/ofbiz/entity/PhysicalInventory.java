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
@Table(name = "physical_inventory")
public class PhysicalInventory {
    @Id
    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @Column(name = "physical_inventory_date")
    private Timestamp physicalInventoryDate;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "general_comments")
    private String generalComments;
}
