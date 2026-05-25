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
@Table(name = "entity_sync_remove")
public class EntitySyncRemove {
    @Id
    @Column(name = "entity_sync_remove_id")
    private String entitySyncRemoveId;

    @Column(name = "primary_key_removed")
    private String primaryKeyRemoved;
}
