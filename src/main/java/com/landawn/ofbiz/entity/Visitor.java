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
@Table(name = "visitor")
public class Visitor {
    @Id
    @Column(name = "visitor_id")
    private String visitorId;

    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "party_id")
    private String partyId;
}
