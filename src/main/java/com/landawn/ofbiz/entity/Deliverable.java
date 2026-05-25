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
@Table(name = "deliverable")
public class Deliverable {
    @Id
    @Column(name = "deliverable_id")
    private String deliverableId;

    @Column(name = "deliverable_type_id")
    private String deliverableTypeId;

    @Column(name = "deliverable_name")
    private String deliverableName;

    @Column(name = "description")
    private String description;
}
