package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales_opportunity_competitor")
public class SalesOpportunityCompetitor {
    @Id
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Id
    @Column(name = "competitor_party_id")
    private String competitorPartyId;

    @Column(name = "position_enum_id")
    private String positionEnumId;

    @Column(name = "strengths")
    private String strengths;

    @Column(name = "weaknesses")
    private String weaknesses;
}
