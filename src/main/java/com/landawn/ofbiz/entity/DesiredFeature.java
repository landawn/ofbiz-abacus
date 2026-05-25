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
@Table(name = "desired_feature")
public class DesiredFeature {
    @Id
    @Column(name = "desired_feature_id")
    private String desiredFeatureId;

    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "optional_ind")
    private String optionalInd;
}
