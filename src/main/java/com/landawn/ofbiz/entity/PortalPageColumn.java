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
@Table(name = "portal_page_column")
public class PortalPageColumn {
    @Id
    @Column(name = "portal_page_id")
    private String portalPageId;

    @Id
    @Column(name = "column_seq_id")
    private String columnSeqId;

    @Column(name = "column_width_pixels")
    private double columnWidthPixels;

    @Column(name = "column_width_percentage")
    private double columnWidthPercentage;

    @JoinedBy("portalPageId=PortalPage.portalPageId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PortalPage portalPage;
}
