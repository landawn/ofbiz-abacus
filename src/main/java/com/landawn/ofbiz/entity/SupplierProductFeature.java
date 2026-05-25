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
@Table(name = "supplier_product_feature")
public class SupplierProductFeature {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "description")
    private String description;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "id_code")
    private String idCode;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("productFeatureId=ProductFeature.productFeatureId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeature productFeature;

    @JoinedBy("uomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;
}
