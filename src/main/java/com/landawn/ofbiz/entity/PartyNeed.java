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
@Table(name = "party_need")
public class PartyNeed {
    @Id
    @Column(name = "party_need_id")
    private String partyNeedId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "party_type_id")
    private String partyTypeId;

    @Column(name = "need_type_id")
    private String needTypeId;

    @Column(name = "communication_event_id")
    private String communicationEventId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "datetime_recorded")
    private Timestamp datetimeRecorded;

    @Column(name = "description")
    private String description;
}
