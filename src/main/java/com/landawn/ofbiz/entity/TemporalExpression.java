package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "temporal_expression")
public class TemporalExpression {
    @Id
    @Column(name = "temp_expr_id")
    private String tempExprId;

    @Column(name = "temp_expr_type_id")
    private String tempExprTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "date1")
    private Timestamp date1;

    @Column(name = "date2")
    private Timestamp date2;

    @Column(name = "integer1")
    private double integer1;

    @Column(name = "integer2")
    private double integer2;

    @Column(name = "string1")
    private String string1;

    @Column(name = "string2")
    private String string2;
}
