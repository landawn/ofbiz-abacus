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
@Table(name = "party_classification_group")
public class PartyClassificationGroup {
    @Id
    @Column(name = "party_classification_group_id")
    private String partyClassificationGroupId;

    @Column(name = "party_classification_type_id")
    private String partyClassificationTypeId;

    @Column(name = "parent_group_id")
    private String parentGroupId;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentGroupId=PartyClassificationGroup.partyClassificationGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyClassificationGroup partyClassificationGroup;

    @JoinedBy("partyClassificationTypeId=PartyClassificationType.partyClassificationTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyClassificationType partyClassificationType;
}
