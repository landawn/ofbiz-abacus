package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entity_sync")
public class EntitySync {
    @Id
    @Column(name = "entity_sync_id")
    private String entitySyncId;

    @Column(name = "run_status_id")
    private String runStatusId;

    @Column(name = "last_successful_synch_time")
    private Timestamp lastSuccessfulSynchTime;

    @Column(name = "last_history_start_date")
    private Timestamp lastHistoryStartDate;

    @Column(name = "pre_offline_synch_time")
    private Timestamp preOfflineSynchTime;

    @Column(name = "offline_sync_split_millis")
    private double offlineSyncSplitMillis;

    @Column(name = "sync_split_millis")
    private double syncSplitMillis;

    @Column(name = "sync_end_buffer_millis")
    private double syncEndBufferMillis;

    @Column(name = "max_running_no_update_millis")
    private double maxRunningNoUpdateMillis;

    @Column(name = "target_service_name")
    private String targetServiceName;

    @Column(name = "target_delegator_name")
    private String targetDelegatorName;

    @Column(name = "keep_remove_info_hours")
    private Double keepRemoveInfoHours;

    @Column(name = "for_pull_only")
    private String forPullOnly;

    @Column(name = "for_push_only")
    private String forPushOnly;
}
