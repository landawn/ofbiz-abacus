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
@Table(name = "affiliate")
public class Affiliate {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "affiliate_name")
    private String affiliateName;

    @Column(name = "affiliate_description")
    private String affiliateDescription;

    @Column(name = "year_established")
    private String yearEstablished;

    @Column(name = "site_type")
    private String siteType;

    @Column(name = "site_page_views")
    private String sitePageViews;

    @Column(name = "site_visitors")
    private String siteVisitors;

    @Column(name = "date_time_created")
    private Timestamp dateTimeCreated;

    @Column(name = "date_time_approved")
    private Timestamp dateTimeApproved;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("partyId=PartyGroup.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyGroup partyGroup;
}
