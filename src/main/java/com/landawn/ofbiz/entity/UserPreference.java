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
@Table(name = "user_preference")
public class UserPreference {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Id
    @Column(name = "user_pref_type_id")
    private String userPrefTypeId;

    @Column(name = "user_pref_group_type_id")
    private String userPrefGroupTypeId;

    @Column(name = "user_pref_value")
    private String userPrefValue;

    @Column(name = "user_pref_data_type")
    private String userPrefDataType;
}
