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
@Table(name = "gl_fiscal_type")
public class GlFiscalType {
    @Id
    @Column(name = "gl_fiscal_type_id")
    private String glFiscalTypeId;

    @Column(name = "description")
    private String description;
}
