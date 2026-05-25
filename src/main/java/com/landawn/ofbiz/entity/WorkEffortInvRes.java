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
@Table(name = "work_effort_inv_res")
public class WorkEffortInvRes {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "reserve_order_enum_id")
    private String reserveOrderEnumId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "quantity_not_available")
    private double quantityNotAvailable;

    @Column(name = "reserved_datetime")
    private Timestamp reservedDatetime;

    @Column(name = "created_datetime")
    private Timestamp createdDatetime;

    @Column(name = "promised_datetime")
    private Timestamp promisedDatetime;

    @Column(name = "current_promised_date")
    private Timestamp currentPromisedDate;

    @Column(name = "sequence_id")
    private String sequenceId;
}
