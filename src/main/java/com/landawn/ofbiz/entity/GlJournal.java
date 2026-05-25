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
@Table(name = "gl_journal")
public class GlJournal {
    @Id
    @Column(name = "gl_journal_id")
    private String glJournalId;

    @Column(name = "gl_journal_name")
    private String glJournalName;

    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "is_posted")
    private String isPosted;

    @Column(name = "posted_date")
    private Timestamp postedDate;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
