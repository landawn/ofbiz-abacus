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
@Table(name = "gl_account_category")
public class GlAccountCategory {
    @Id
    @Column(name = "gl_account_category_id")
    private String glAccountCategoryId;

    @Column(name = "gl_account_category_type_id")
    private String glAccountCategoryTypeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("glAccountCategoryTypeId=GlAccountCategoryType.glAccountCategoryTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccountCategoryType glAccountCategoryType;
}
