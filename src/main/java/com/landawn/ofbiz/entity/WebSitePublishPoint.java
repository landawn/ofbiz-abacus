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
@Table(name = "web_site_publish_point")
public class WebSitePublishPoint {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Column(name = "template_title")
    private String templateTitle;

    @Column(name = "style_sheet_file")
    private String styleSheetFile;

    @Column(name = "logo")
    private String logo;

    @Column(name = "medallion_logo")
    private String medallionLogo;

    @Column(name = "line_logo")
    private String lineLogo;

    @Column(name = "left_bar_id")
    private String leftBarId;

    @Column(name = "right_bar_id")
    private String rightBarId;

    @Column(name = "content_dept")
    private String contentDept;

    @Column(name = "about_content_id")
    private String aboutContentId;
}
