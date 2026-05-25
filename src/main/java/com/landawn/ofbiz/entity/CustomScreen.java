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
@Table(name = "custom_screen")
public class CustomScreen {
    @Id
    @Column(name = "custom_screen_id")
    private String customScreenId;

    @Column(name = "custom_screen_type_id")
    private String customScreenTypeId;

    @Column(name = "custom_screen_name")
    private String customScreenName;

    @Column(name = "custom_screen_location")
    private String customScreenLocation;

    @Column(name = "description")
    private String description;

    @JoinedBy("customScreenTypeId=CustomScreenType.customScreenTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomScreenType customScreenType;
}
