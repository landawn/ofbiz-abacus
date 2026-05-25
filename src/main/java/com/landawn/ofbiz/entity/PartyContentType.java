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
@Table(name = "party_content_type")
public class PartyContentType {
    @Id
    @Column(name = "party_content_type_id")
    private String partyContentTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "description")
    private String description;
}
