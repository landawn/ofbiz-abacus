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
@Table(name = "web_page")
public class WebPage {
    @Id
    @Column(name = "web_page_id")
    private String webPageId;

    @Column(name = "page_name")
    private String pageName;

    @Column(name = "web_site_id")
    private String webSiteId;

    @Column(name = "content_id")
    private String contentId;
}
