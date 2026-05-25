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
@Table(name = "web_preference_type")
public class WebPreferenceType {
    @Id
    @Column(name = "web_preference_type_id")
    private String webPreferenceTypeId;

    @Column(name = "description")
    private String description;
}
