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
@Table(name = "content_assoc")
public class ContentAssoc {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "content_id_to")
    private String contentIdTo;

    @Id
    @Column(name = "content_assoc_type_id")
    private String contentAssocTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "content_assoc_predicate_id")
    private String contentAssocPredicateId;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "map_key")
    private String mapKey;

    @Column(name = "upper_coordinate")
    private double upperCoordinate;

    @Column(name = "left_coordinate")
    private double leftCoordinate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
