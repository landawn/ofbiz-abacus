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
@Table(name = "quote_item")
public class QuoteItem {
    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "quote_item_seq_id")
    private String quoteItemSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "deliverable_type_id")
    private String deliverableTypeId;

    @Column(name = "skill_type_id")
    private String skillTypeId;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "cust_request_id")
    private String custRequestId;

    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "selected_amount")
    private double selectedAmount;

    @Column(name = "quote_unit_price")
    private double quoteUnitPrice;

    @Column(name = "reserv_start")
    private Timestamp reservStart;

    @Column(name = "reserv_length")
    private double reservLength;

    @Column(name = "reserv_persons")
    private double reservPersons;

    @Column(name = "config_id")
    private String configId;

    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "is_promo")
    private String isPromo;

    @Column(name = "lead_time_days")
    private double leadTimeDays;
}
