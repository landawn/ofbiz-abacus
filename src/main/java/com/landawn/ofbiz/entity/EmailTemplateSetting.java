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
@Table(name = "email_template_setting")
public class EmailTemplateSetting {
    @Id
    @Column(name = "email_template_setting_id")
    private String emailTemplateSettingId;

    @Column(name = "email_type")
    private String emailType;

    @Column(name = "description")
    private String description;

    @Column(name = "body_screen_location")
    private String bodyScreenLocation;

    @Column(name = "xslfo_attach_screen_location")
    private String xslfoAttachScreenLocation;

    @Column(name = "from_address")
    private String fromAddress;

    @Column(name = "cc_address")
    private String ccAddress;

    @Column(name = "bcc_address")
    private String bccAddress;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content_type")
    private String contentType;

    @JoinedBy("emailType=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
