package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "work_effort_and_time_entry")
public class WorkEffortAndTimeEntry {
    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;

    @ReadOnly
    @Column(name = "current_status_id")
    private String currentStatusId;

    @ReadOnly
    @Column(name = "last_status_update")
    private Timestamp lastStatusUpdate;

    @ReadOnly
    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;

    @ReadOnly
    @Column(name = "work_effort_parent_id")
    private String workEffortParentId;

    @ReadOnly
    @Column(name = "scope_enum_id")
    private String scopeEnumId;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "percent_complete")
    private double percentComplete;

    @ReadOnly
    @Column(name = "work_effort_name")
    private String workEffortName;

    @ReadOnly
    @Column(name = "show_as_enum_id")
    private String showAsEnumId;

    @ReadOnly
    @Column(name = "send_notification_email")
    private String sendNotificationEmail;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "location_desc")
    private String locationDesc;

    @ReadOnly
    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @ReadOnly
    @Column(name = "estimated_completion_date")
    private Timestamp estimatedCompletionDate;

    @ReadOnly
    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @ReadOnly
    @Column(name = "actual_completion_date")
    private Timestamp actualCompletionDate;

    @ReadOnly
    @Column(name = "estimated_milli_seconds")
    private Double estimatedMilliSeconds;

    @ReadOnly
    @Column(name = "estimated_setup_millis")
    private Double estimatedSetupMillis;

    @ReadOnly
    @Column(name = "estimate_calc_method")
    private String estimateCalcMethod;

    @ReadOnly
    @Column(name = "actual_milli_seconds")
    private Double actualMilliSeconds;

    @ReadOnly
    @Column(name = "actual_setup_millis")
    private Double actualSetupMillis;

    @ReadOnly
    @Column(name = "total_milli_seconds_allowed")
    private Double totalMilliSecondsAllowed;

    @ReadOnly
    @Column(name = "total_money_allowed")
    private double totalMoneyAllowed;

    @ReadOnly
    @Column(name = "money_uom_id")
    private String moneyUomId;

    @ReadOnly
    @Column(name = "special_terms")
    private String specialTerms;

    @ReadOnly
    @Column(name = "time_transparency")
    private double timeTransparency;

    @ReadOnly
    @Column(name = "universal_id")
    private String universalId;

    @ReadOnly
    @Column(name = "source_reference_id")
    private String sourceReferenceId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "info_url")
    private String infoUrl;

    @ReadOnly
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @ReadOnly
    @Column(name = "temp_expr_id")
    private String tempExprId;

    @ReadOnly
    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @ReadOnly
    @Column(name = "note_id")
    private String noteId;

    @ReadOnly
    @Column(name = "service_loader_name")
    private String serviceLoaderName;

    @ReadOnly
    @Column(name = "quantity_to_produce")
    private double quantityToProduce;

    @ReadOnly
    @Column(name = "quantity_produced")
    private double quantityProduced;

    @ReadOnly
    @Column(name = "quantity_rejected")
    private double quantityRejected;

    @ReadOnly
    @Column(name = "reserv_persons")
    private double reservPersons;

    @ReadOnly
    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @ReadOnly
    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @ReadOnly
    @Column(name = "accommodation_map_id")
    private String accommodationMapId;

    @ReadOnly
    @Column(name = "accommodation_spot_id")
    private String accommodationSpotId;

    @ReadOnly
    @Column(name = "revision_number")
    private double revisionNumber;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "time_entry_id")
    private String timeEntryId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "rate_type_id")
    private String rateTypeId;

    @ReadOnly
    @Column(name = "timesheet_id")
    private String timesheetId;

    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "hours")
    private Double hours;

    @ReadOnly
    @Column(name = "comments")
    private String comments;
}
