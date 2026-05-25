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
@Table(name = "temporal_expression_assoc")
public class TemporalExpressionAssoc {
    @Id
    @Column(name = "from_temp_expr_id")
    private String fromTempExprId;

    @Id
    @Column(name = "to_temp_expr_id")
    private String toTempExprId;

    @Column(name = "expr_assoc_type")
    private String exprAssocType;
}
