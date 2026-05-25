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
@Table(name = "entity_audit_log")
public class EntityAuditLog {
    @Id
    @Column(name = "audit_history_seq_id")
    private String auditHistorySeqId;

    @Column(name = "changed_entity_name")
    private String changedEntityName;

    @Column(name = "changed_field_name")
    private String changedFieldName;

    @Column(name = "pk_combined_value_text")
    private String pkCombinedValueText;

    @Column(name = "old_value_text")
    private String oldValueText;

    @Column(name = "new_value_text")
    private String newValueText;

    @Column(name = "changed_date")
    private Timestamp changedDate;

    @Column(name = "changed_by_info")
    private String changedByInfo;

    @Column(name = "changed_session_info")
    private String changedSessionInfo;
}
