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
@Table(name = "mime_type_html_template")
public class MimeTypeHtmlTemplate {
    @Id
    @Column(name = "mime_type_id")
    private String mimeTypeId;

    @Column(name = "template_location")
    private String templateLocation;
}
