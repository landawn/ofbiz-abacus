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
@Table(name = "user_pref_group_type")
public class UserPrefGroupType {
    @Id
    @Column(name = "user_pref_group_type_id")
    private String userPrefGroupTypeId;

    @Column(name = "description")
    private String description;
}
