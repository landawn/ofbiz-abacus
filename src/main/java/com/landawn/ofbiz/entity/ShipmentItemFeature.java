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
@Table(name = "shipment_item_feature")
public class ShipmentItemFeature {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;
}
