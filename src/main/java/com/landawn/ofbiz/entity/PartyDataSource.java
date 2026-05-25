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
@Table(name = "party_data_source")
public class PartyDataSource {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "data_source_id")
    private String dataSourceId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "is_create")
    private String isCreate;
}
