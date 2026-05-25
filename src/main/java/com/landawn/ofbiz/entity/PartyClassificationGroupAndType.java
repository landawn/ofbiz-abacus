package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "party_classification_group_and_type")
public class PartyClassificationGroupAndType {
    @ReadOnly
    @Column(name = "type_description")
    private String typeDescription;

    @ReadOnly
    @Column(name = "parent_type_id")
    private String parentTypeId;

    @ReadOnly
    @Column(name = "party_classification_group_id")
    private String partyClassificationGroupId;

    @ReadOnly
    @Column(name = "party_classification_type_id")
    private String partyClassificationTypeId;

    @ReadOnly
    @Column(name = "parent_group_id")
    private String parentGroupId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
