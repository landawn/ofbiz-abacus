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
@Table(name = "telecom_method_type")
public class TelecomMethodType {
    @Id
    @Column(name = "telecom_method_type_id")
    private String telecomMethodTypeId;

    @Column(name = "description")
    private String description;
}
