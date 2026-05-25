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
@Table(name = "web_site_content_type")
public class WebSiteContentType {
    @Id
    @Column(name = "web_site_content_type_id")
    private String webSiteContentTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;
}
