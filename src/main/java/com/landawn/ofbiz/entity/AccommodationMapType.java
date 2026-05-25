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
@Table(name = "accommodation_map_type")
public class AccommodationMapType {
    @Id
    @Column(name = "accommodation_map_type_id")
    private String accommodationMapTypeId;

    @Column(name = "description")
    private String description;
}
