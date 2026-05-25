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
@Table(name = "entity_group_entry")
public class EntityGroupEntry {
    @Id
    @Column(name = "entity_group_id")
    private String entityGroupId;

    @Id
    @Column(name = "entity_or_package")
    private String entityOrPackage;

    @Column(name = "appl_enum_id")
    private String applEnumId;

    @JoinedBy("entityGroupId=EntityGroup.entityGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EntityGroup entityGroup;
}
