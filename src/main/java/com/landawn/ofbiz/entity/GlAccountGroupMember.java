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
@Table(name = "gl_account_group_member")
public class GlAccountGroupMember {
    @Id
    @Column(name = "gl_account_id")
    private String glAccountId;

    @Id
    @Column(name = "gl_account_group_type_id")
    private String glAccountGroupTypeId;

    @Column(name = "gl_account_group_id")
    private String glAccountGroupId;
}
