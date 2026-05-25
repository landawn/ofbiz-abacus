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
@Table(name = "keyword_thesaurus")
public class KeywordThesaurus {
    @Id
    @Column(name = "entered_keyword")
    private String enteredKeyword;

    @Id
    @Column(name = "alternate_keyword")
    private String alternateKeyword;

    @Column(name = "relationship_enum_id")
    private String relationshipEnumId;

    @JoinedBy("relationshipEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
