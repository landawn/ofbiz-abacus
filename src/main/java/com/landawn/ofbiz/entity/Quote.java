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
@Table(name = "quote")
public class Quote {
    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Column(name = "quote_type_id")
    private String quoteTypeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "issue_date")
    private Timestamp issueDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @Column(name = "valid_from_date")
    private Timestamp validFromDate;

    @Column(name = "valid_thru_date")
    private Timestamp validThruDate;

    @Column(name = "quote_name")
    private String quoteName;

    @Column(name = "description")
    private String description;
}
