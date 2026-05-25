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

    @JoinedBy("quoteTypeId=QuoteType.quoteTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuoteType quoteType;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("salesChannelEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
