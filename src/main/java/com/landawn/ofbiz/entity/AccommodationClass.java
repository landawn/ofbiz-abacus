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
@Table(name = "accommodation_class")
public class AccommodationClass {
    @Id
    @Column(name = "accommodation_class_id")
    private String accommodationClassId;

    @Column(name = "parent_class_id")
    private String parentClassId;

    @Column(name = "description")
    private String description;
}
