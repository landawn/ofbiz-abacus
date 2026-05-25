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
@Table(name = "party_pref_doc_type_tpl_and_custom_screen")
public class PartyPrefDocTypeTplAndCustomScreen {
    @ReadOnly
    @Column(name = "party_pref_doc_type_tpl_id")
    private String partyPrefDocTypeTplId;

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
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "quote_type_id")
    private String quoteTypeId;

    @ReadOnly
    @Column(name = "custom_screen_id")
    private String customScreenId;

    @ReadOnly
    @Column(name = "custom_screen_type_id")
    private String customScreenTypeId;

    @ReadOnly
    @Column(name = "custom_screen_name")
    private String customScreenName;

    @ReadOnly
    @Column(name = "custom_screen_location")
    private String customScreenLocation;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
