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
@Table(name = "work_effort")
public class WorkEffort {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;

    @Column(name = "current_status_id")
    private String currentStatusId;

    @Column(name = "last_status_update")
    private Timestamp lastStatusUpdate;

    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;

    @Column(name = "work_effort_parent_id")
    private String workEffortParentId;

    @Column(name = "scope_enum_id")
    private String scopeEnumId;

    @Column(name = "priority")
    private double priority;

    @Column(name = "percent_complete")
    private double percentComplete;

    @Column(name = "work_effort_name")
    private String workEffortName;

    @Column(name = "show_as_enum_id")
    private String showAsEnumId;

    @Column(name = "send_notification_email")
    private String sendNotificationEmail;

    @Column(name = "description")
    private String description;

    @Column(name = "location_desc")
    private String locationDesc;

    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @Column(name = "estimated_completion_date")
    private Timestamp estimatedCompletionDate;

    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @Column(name = "actual_completion_date")
    private Timestamp actualCompletionDate;

    @Column(name = "estimated_milli_seconds")
    private Double estimatedMilliSeconds;

    @Column(name = "estimated_setup_millis")
    private Double estimatedSetupMillis;

    @Column(name = "estimate_calc_method")
    private String estimateCalcMethod;

    @Column(name = "actual_milli_seconds")
    private Double actualMilliSeconds;

    @Column(name = "actual_setup_millis")
    private Double actualSetupMillis;

    @Column(name = "total_milli_seconds_allowed")
    private Double totalMilliSecondsAllowed;

    @Column(name = "total_money_allowed")
    private double totalMoneyAllowed;

    @Column(name = "money_uom_id")
    private String moneyUomId;

    @Column(name = "special_terms")
    private String specialTerms;

    @Column(name = "time_transparency")
    private double timeTransparency;

    @Column(name = "universal_id")
    private String universalId;

    @Column(name = "source_reference_id")
    private String sourceReferenceId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "info_url")
    private String infoUrl;

    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @Column(name = "temp_expr_id")
    private String tempExprId;

    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @Column(name = "note_id")
    private String noteId;

    @Column(name = "service_loader_name")
    private String serviceLoaderName;

    @Column(name = "quantity_to_produce")
    private double quantityToProduce;

    @Column(name = "quantity_produced")
    private double quantityProduced;

    @Column(name = "quantity_rejected")
    private double quantityRejected;

    @Column(name = "reserv_persons")
    private double reservPersons;

    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @Column(name = "accommodation_map_id")
    private String accommodationMapId;

    @Column(name = "accommodation_spot_id")
    private String accommodationSpotId;

    @Column(name = "revision_number")
    private double revisionNumber;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("workEffortTypeId=WorkEffortType.workEffortTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortType workEffortType;

    @JoinedBy("workEffortPurposeTypeId=WorkEffortPurposeType.workEffortPurposeTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortPurposeType workEffortPurposeType;

    @JoinedBy("workEffortParentId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("currentStatusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("scopeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("moneyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("recurrenceInfoId=RecurrenceInfo.recurrenceInfoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RecurrenceInfo recurrenceInfo;

    @JoinedBy("tempExprId=TemporalExpression.tempExprId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TemporalExpression temporalExpression;

    @JoinedBy("runtimeDataId=RuntimeData.runtimeDataId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RuntimeData runtimeData;

    @JoinedBy("noteId=NoteData.noteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private NoteData noteData;

    @JoinedBy("estimateCalcMethod=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;

    @JoinedBy("accommodationMapId=AccommodationMap.accommodationMapId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AccommodationMap accommodationMap;

    @JoinedBy("accommodationSpotId=AccommodationSpot.accommodationSpotId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AccommodationSpot accommodationSpot;
}
