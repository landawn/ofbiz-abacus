package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entity_sync_incl_grp_detail_view")
public class EntitySyncInclGrpDetailView {
    @ReadOnly
    @Column(name = "entity_sync_id")
    private String entitySyncId;

    @ReadOnly
    @Column(name = "entity_group_id")
    private String entityGroupId;

    @ReadOnly
    @Column(name = "entity_or_package")
    private String entityOrPackage;

    @ReadOnly
    @Column(name = "appl_enum_id")
    private String applEnumId;
}
