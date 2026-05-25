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
@Table(name = "uom_group")
public class UomGroup {
    @Id
    @Column(name = "uom_group_id")
    private String uomGroupId;

    @Id
    @Column(name = "uom_id")
    private String uomId;
}
