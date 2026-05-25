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

    @JoinedBy("partyTypeId=PartyType.partyTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyType partyType;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;

    @JoinedBy("preferredCurrencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("dataSourceId=DataSource.dataSourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataSource dataSource;
}
