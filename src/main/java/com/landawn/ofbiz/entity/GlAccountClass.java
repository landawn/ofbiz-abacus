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
@Table(name = "gl_account_class")
public class GlAccountClass {
    @Id
    @Column(name = "gl_account_class_id")
    private String glAccountClassId;

    @Column(name = "parent_class_id")
    private String parentClassId;

    @Column(name = "description")
    private String description;

    @Column(name = "is_asset_class")
    private String isAssetClass;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
