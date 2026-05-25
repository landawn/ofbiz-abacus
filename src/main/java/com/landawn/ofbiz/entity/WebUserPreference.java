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
@Table(name = "web_user_preference")
public class WebUserPreference {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "web_preference_type_id")
    private String webPreferenceTypeId;

    @Column(name = "web_preference_value")
    private String webPreferenceValue;
}
