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
@Table(name = "product_store_email_setting")
public class ProductStoreEmailSetting {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "email_type")
    private String emailType;

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
}
