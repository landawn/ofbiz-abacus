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
@Table(name = "container")
public class Container {
    @Id
    @Column(name = "container_id")
    private String containerId;

    @Column(name = "container_type_id")
    private String containerTypeId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "description")
    private String description;

    @JoinedBy("containerTypeId=ContainerType.containerTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContainerType containerType;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;
}
