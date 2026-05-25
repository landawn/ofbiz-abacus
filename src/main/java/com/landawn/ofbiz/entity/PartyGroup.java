package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "party_group")
public class PartyGroup {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_name_local")
    private String groupNameLocal;

    @Column(name = "office_site_name")
    private String officeSiteName;

    @Column(name = "annual_revenue")
    private double annualRevenue;

    @Column(name = "num_employees")
    private double numEmployees;

    @Column(name = "ticker_symbol")
    private String tickerSymbol;

    @Column(name = "comments")
    private String comments;

    @Column(name = "logo_image_url")
    private String logoImageUrl;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
