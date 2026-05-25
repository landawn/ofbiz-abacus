package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_field_type")
public class TestFieldType {
    @Id
    @Column(name = "test_field_type_id")
    private String testFieldTypeId;

    @Column(name = "blob_field")
    private byte[] blobField;

    @Column(name = "byte_array_field")
    private byte[] byteArrayField;

    @Column(name = "object_field")
    private byte[] objectField;

    @Column(name = "date_field")
    private Date dateField;

    @Column(name = "time_field")
    private Time timeField;

    @Column(name = "date_time_field")
    private Timestamp dateTimeField;

    @Column(name = "fixed_point_field")
    private double fixedPointField;

    @Column(name = "floating_point_field")
    private Double floatingPointField;

    @Column(name = "numeric_field")
    private double numericField;

    @Column(name = "clob_field")
    private String clobField;
}
