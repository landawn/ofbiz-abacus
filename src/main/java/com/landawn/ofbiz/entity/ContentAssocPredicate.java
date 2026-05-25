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
@Table(name = "content_assoc_predicate")
public class ContentAssocPredicate {
    @Id
    @Column(name = "content_assoc_predicate_id")
    private String contentAssocPredicateId;

    @Column(name = "description")
    private String description;
}
