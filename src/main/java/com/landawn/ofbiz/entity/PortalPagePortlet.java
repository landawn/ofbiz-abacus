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
@Table(name = "portal_page_portlet")
public class PortalPagePortlet {
    @Id
    @Column(name = "portal_page_id")
    private String portalPageId;

    @Id
    @Column(name = "portal_portlet_id")
    private String portalPortletId;

    @Id
    @Column(name = "portlet_seq_id")
    private String portletSeqId;

    @Column(name = "column_seq_id")
    private String columnSeqId;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
