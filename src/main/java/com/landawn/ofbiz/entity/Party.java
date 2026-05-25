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
@Table(name = "party")
public class Party {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "party_type_id")
    private String partyTypeId;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "preferred_currency_uom_id")
    private String preferredCurrencyUomId;

    @Column(name = "description")
    private String description;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "is_unread")
    private String isUnread;
}
