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
@Table(name = "gl_xbrl_class")
public class GlXbrlClass {
    @Id
    @Column(name = "gl_xbrl_class_id")
    private String glXbrlClassId;

    @Column(name = "parent_gl_xbrl_class_id")
    private String parentGlXbrlClassId;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentGlXbrlClassId=GlXbrlClass.glXbrlClassId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlXbrlClass glXbrlClass;
}
