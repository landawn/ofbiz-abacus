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
@Table(name = "entity_group")
public class EntityGroup {
    @Id
    @Column(name = "entity_group_id")
    private String entityGroupId;

    @Column(name = "entity_group_name")
    private String entityGroupName;
}
