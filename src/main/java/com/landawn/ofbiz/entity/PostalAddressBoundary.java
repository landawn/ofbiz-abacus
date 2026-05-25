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
@Table(name = "postal_address_boundary")
public class PostalAddressBoundary {
    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Id
    @Column(name = "geo_id")
    private String geoId;
}
