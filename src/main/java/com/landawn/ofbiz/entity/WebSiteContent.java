package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "web_site_content")
public class WebSiteContent {
    @Id
    @Column(name = "web_site_id")
    private String webSiteId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "web_site_content_type_id")
    private String webSiteContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("webSiteId=WebSite.webSiteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WebSite webSite;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("webSiteContentTypeId=WebSiteContentType.webSiteContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WebSiteContentType webSiteContentType;
}
