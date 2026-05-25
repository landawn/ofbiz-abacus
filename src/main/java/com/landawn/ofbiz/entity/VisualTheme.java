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
@Table(name = "visual_theme")
public class VisualTheme {
    @Id
    @Column(name = "visual_theme_id")
    private String visualThemeId;

    @Column(name = "visual_theme_set_id")
    private String visualThemeSetId;

    @Column(name = "description")
    private String description;
}
