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
@Table(name = "custom_method")
public class CustomMethod {
    @Id
    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "custom_method_type_id")
    private String customMethodTypeId;

    @Column(name = "custom_method_name")
    private String customMethodName;

    @Column(name = "description")
    private String description;

    @JoinedBy("customMethodTypeId=CustomMethodType.customMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethodType customMethodType;
}
