package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "entity_sync_history")
public class EntitySyncHistory {
    @Id
    @Column(name = "entity_sync_id")
    private String entitySyncId;

    @Id
    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "run_status_id")
    private String runStatusId;

    @Column(name = "beginning_synch_time")
    private Timestamp beginningSynchTime;

    @Column(name = "last_successful_synch_time")
    private Timestamp lastSuccessfulSynchTime;

    @Column(name = "last_candidate_end_time")
    private Timestamp lastCandidateEndTime;

    @Column(name = "last_split_start_time")
    private double lastSplitStartTime;

    @Column(name = "to_create_inserted")
    private double toCreateInserted;

    @Column(name = "to_create_updated")
    private double toCreateUpdated;

    @Column(name = "to_create_not_updated")
    private double toCreateNotUpdated;

    @Column(name = "to_store_inserted")
    private double toStoreInserted;

    @Column(name = "to_store_updated")
    private double toStoreUpdated;

    @Column(name = "to_store_not_updated")
    private double toStoreNotUpdated;

    @Column(name = "to_remove_deleted")
    private double toRemoveDeleted;

    @Column(name = "to_remove_already_deleted")
    private double toRemoveAlreadyDeleted;

    @Column(name = "total_rows_exported")
    private double totalRowsExported;

    @Column(name = "total_rows_to_create")
    private double totalRowsToCreate;

    @Column(name = "total_rows_to_store")
    private double totalRowsToStore;

    @Column(name = "total_rows_to_remove")
    private double totalRowsToRemove;

    @Column(name = "total_splits")
    private double totalSplits;

    @Column(name = "total_store_calls")
    private double totalStoreCalls;

    @Column(name = "running_time_millis")
    private double runningTimeMillis;

    @Column(name = "per_split_min_millis")
    private double perSplitMinMillis;

    @Column(name = "per_split_max_millis")
    private double perSplitMaxMillis;

    @Column(name = "per_split_min_items")
    private double perSplitMinItems;

    @Column(name = "per_split_max_items")
    private double perSplitMaxItems;

    @JoinedBy("entitySyncId=EntitySync.entitySyncId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EntitySync entitySync;
}
