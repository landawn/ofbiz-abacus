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
@Table(name = "visual_theme_resource")
public class VisualThemeResource {
    @Id
    @Column(name = "visual_theme_id")
    private String visualThemeId;

    @Id
    @Column(name = "resource_type_enum_id")
    private String resourceTypeEnumId;

    @Id
    @Column(name = "sequence_id")
    private String sequenceId;

    @Column(name = "resource_value")
    private String resourceValue;

    @JoinedBy("visualThemeId=VisualTheme.visualThemeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private VisualTheme visualTheme;

    @JoinedBy("resourceTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
