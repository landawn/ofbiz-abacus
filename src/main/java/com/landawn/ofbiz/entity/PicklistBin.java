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
@Table(name = "picklist_bin")
public class PicklistBin {
    @Id
    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @Column(name = "picklist_id")
    private String picklistId;

    @Column(name = "bin_location_number")
    private double binLocationNumber;

    @Column(name = "primary_order_id")
    private String primaryOrderId;

    @Column(name = "primary_ship_group_seq_id")
    private String primaryShipGroupSeqId;
}
