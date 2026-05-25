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
@Table(name = "web_site_path_alias")
public class WebSitePathAlias {
    @Id
    @Column(name = "web_site_id")
    private String webSiteId;

    @Id
    @Column(name = "path_alias")
    private String pathAlias;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "alias_to")
    private String aliasTo;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "map_key")
    private String mapKey;

    @JoinedBy("webSiteId=WebSite.webSiteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WebSite webSite;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;
}
