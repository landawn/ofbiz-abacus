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
@Table(name = "composite_pk_entity")
public class SampleCompositePKEntity {
    @Id
    @Column(name = "first_name")
    private String firstName;

    @Id
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

}
