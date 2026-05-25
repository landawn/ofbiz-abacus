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
}
