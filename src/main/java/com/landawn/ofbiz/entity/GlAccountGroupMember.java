package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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

    @JoinedBy("glAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;

    @JoinedBy("glAccountGroupId=GlAccountGroup.glAccountGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccountGroup glAccountGroup;

    @JoinedBy("glAccountGroupTypeId=GlAccountGroupType.glAccountGroupTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccountGroupType glAccountGroupType;
}
