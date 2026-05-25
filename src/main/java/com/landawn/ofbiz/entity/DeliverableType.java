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
@Table(name = "deliverable_type")
public class DeliverableType {
    @Id
    @Column(name = "deliverable_type_id")
    private String deliverableTypeId;

    @Column(name = "description")
    private String description;
}
