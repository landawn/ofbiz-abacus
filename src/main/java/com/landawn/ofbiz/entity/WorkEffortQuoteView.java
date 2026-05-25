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
@Table(name = "work_effort_quote_view")
public class WorkEffortQuoteView {
    @ReadOnly
    @Column(name = "status_item_description")
    private String statusItemDescription;

    @ReadOnly
    @Column(name = "quote_id")
    private String quoteId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "quote_type_id")
    private String quoteTypeId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "issue_date")
    private Timestamp issueDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @ReadOnly
    @Column(name = "valid_from_date")
    private String validFromDate;

    @ReadOnly
    @Column(name = "valid_thru_date")
    private Timestamp validThruDate;

    @ReadOnly
    @Column(name = "quote_name")
    private String quoteName;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
