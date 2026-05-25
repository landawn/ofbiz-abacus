package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "temporal_expression_child")
public class TemporalExpressionChild {
    @ReadOnly
    @Column(name = "from_temp_expr_id")
    private String fromTempExprId;

    @ReadOnly
    @Column(name = "expr_assoc_type")
    private String exprAssocType;

    @ReadOnly
    @Column(name = "temp_expr_id")
    private String tempExprId;

    @ReadOnly
    @Column(name = "temp_expr_type_id")
    private String tempExprTypeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "date1")
    private Timestamp date1;

    @ReadOnly
    @Column(name = "date2")
    private Timestamp date2;

    @ReadOnly
    @Column(name = "integer1")
    private double integer1;

    @ReadOnly
    @Column(name = "integer2")
    private double integer2;

    @ReadOnly
    @Column(name = "string1")
    private String string1;

    @ReadOnly
    @Column(name = "string2")
    private String string2;
}
