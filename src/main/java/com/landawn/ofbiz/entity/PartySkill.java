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
@Table(name = "party_skill")
public class PartySkill {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "skill_type_id")
    private String skillTypeId;

    @Column(name = "years_experience")
    private double yearsExperience;

    @Column(name = "rating")
    private double rating;

    @Column(name = "skill_level")
    private double skillLevel;

    @Column(name = "started_using_date")
    private Timestamp startedUsingDate;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("skillTypeId=SkillType.skillTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SkillType skillType;
}
