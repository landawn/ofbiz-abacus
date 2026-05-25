package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "testing")
public class Testing {
    @Id
    @Column(name = "testing_id")
    private String testingId;

    @Column(name = "testing_type_id")
    private String testingTypeId;

    @Column(name = "testing_name")
    private String testingName;

    @Column(name = "description")
    private String description;

    @Column(name = "comments")
    private String comments;

    @Column(name = "testing_size")
    private double testingSize;

    @Column(name = "testing_date")
    private Timestamp testingDate;

    @JoinedBy("testingTypeId=TestingType.testingTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TestingType testingType;
}
