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
@Table(name = "need_type")
public class NeedType {
    @Id
    @Column(name = "need_type_id")
    private String needTypeId;

    @Column(name = "description")
    private String description;
}
