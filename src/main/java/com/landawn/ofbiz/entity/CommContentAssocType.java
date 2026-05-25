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
@Table(name = "comm_content_assoc_type")
public class CommContentAssocType {
    @Id
    @Column(name = "comm_content_assoc_type_id")
    private String commContentAssocTypeId;

    @Column(name = "description")
    private String description;
}
