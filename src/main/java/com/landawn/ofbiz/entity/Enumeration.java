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
@Table(name = "enumeration")
public class Enumeration {
    @Id
    @Column(name = "enum_id")
    private String enumId;

    @Column(name = "enum_type_id")
    private String enumTypeId;

    @Column(name = "enum_code")
    private String enumCode;

    @Column(name = "sequence_id")
    private String sequenceId;

    @Column(name = "description")
    private String description;
}
