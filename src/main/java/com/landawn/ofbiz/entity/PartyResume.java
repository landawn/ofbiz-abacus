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
@Table(name = "party_resume")
public class PartyResume {
    @Id
    @Column(name = "resume_id")
    private String resumeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "resume_date")
    private Timestamp resumeDate;

    @Column(name = "resume_text")
    private String resumeText;
}
