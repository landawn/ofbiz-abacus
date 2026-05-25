package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fixed_asset_maint_work_effort")
public class FixedAssetMaintWorkEffort {
    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "fixed_asset_type_id")
    private String fixedAssetTypeId;

    @ReadOnly
    @Column(name = "parent_fixed_asset_id")
    private String parentFixedAssetId;

    @ReadOnly
    @Column(name = "instance_of_product_id")
    private String instanceOfProductId;

    @ReadOnly
    @Column(name = "class_enum_id")
    private String classEnumId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "fixed_asset_name")
    private String fixedAssetName;

    @ReadOnly
    @Column(name = "acquire_order_id")
    private String acquireOrderId;

    @ReadOnly
    @Column(name = "acquire_order_item_seq_id")
    private String acquireOrderItemSeqId;

    @ReadOnly
    @Column(name = "date_acquired")
    private Timestamp dateAcquired;

    @ReadOnly
    @Column(name = "date_last_serviced")
    private Timestamp dateLastServiced;

    @ReadOnly
    @Column(name = "date_next_service")
    private Timestamp dateNextService;

    @ReadOnly
    @Column(name = "expected_end_of_life")
    private Date expectedEndOfLife;

    @ReadOnly
    @Column(name = "actual_end_of_life")
    private Date actualEndOfLife;

    @ReadOnly
    @Column(name = "production_capacity")
    private double productionCapacity;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "calendar_id")
    private String calendarId;

    @ReadOnly
    @Column(name = "serial_number")
    private String serialNumber;

    @ReadOnly
    @Column(name = "located_at_facility_id")
    private String locatedAtFacilityId;

    @ReadOnly
    @Column(name = "located_at_location_seq_id")
    private String locatedAtLocationSeqId;

    @ReadOnly
    @Column(name = "salvage_value")
    private double salvageValue;

    @ReadOnly
    @Column(name = "depreciation")
    private double depreciation;

    @ReadOnly
    @Column(name = "purchase_cost")
    private double purchaseCost;

    @ReadOnly
    @Column(name = "purchase_cost_uom_id")
    private String purchaseCostUomId;

    @ReadOnly
    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "product_maint_type_id")
    private String productMaintTypeId;

    @ReadOnly
    @Column(name = "product_maint_seq_id")
    private String productMaintSeqId;

    @ReadOnly
    @Column(name = "schedule_work_effort_id")
    private String scheduleWorkEffortId;

    @ReadOnly
    @Column(name = "interval_quantity")
    private double intervalQuantity;

    @ReadOnly
    @Column(name = "interval_uom_id")
    private String intervalUomId;

    @ReadOnly
    @Column(name = "interval_meter_type_id")
    private String intervalMeterTypeId;

    @ReadOnly
    @Column(name = "purchase_order_id")
    private String purchaseOrderId;

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
}
