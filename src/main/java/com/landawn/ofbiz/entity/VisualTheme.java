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
@Table(name = "visual_theme")
public class VisualTheme {
    @Id
    @Column(name = "visual_theme_id")
    private String visualThemeId;

    @Column(name = "visual_theme_set_id")
    private String visualThemeSetId;

    @Column(name = "description")
    private String description;

    @JoinedBy("visualThemeSetId=VisualThemeSet.visualThemeSetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private VisualThemeSet visualThemeSet;
}
