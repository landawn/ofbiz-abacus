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
@Table(name = "party_relationship_type")
public class PartyRelationshipType {
    @Id
    @Column(name = "party_relationship_type_id")
    private String partyRelationshipTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "party_relationship_name")
    private String partyRelationshipName;

    @Column(name = "description")
    private String description;

    @Column(name = "role_type_id_valid_from")
    private String roleTypeIdValidFrom;

    @Column(name = "role_type_id_valid_to")
    private String roleTypeIdValidTo;
}
