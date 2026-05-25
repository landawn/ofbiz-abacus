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
@Table(name = "x509_issuer_provision")
public class X509IssuerProvision {
    @Id
    @Column(name = "cert_provision_id")
    private String certProvisionId;

    @Column(name = "common_name")
    private String commonName;

    @Column(name = "organizational_unit")
    private String organizationalUnit;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "city_locality")
    private String cityLocality;

    @Column(name = "state_province")
    private String stateProvince;

    @Column(name = "country")
    private String country;

    @Column(name = "serial_number")
    private String serialNumber;
}
