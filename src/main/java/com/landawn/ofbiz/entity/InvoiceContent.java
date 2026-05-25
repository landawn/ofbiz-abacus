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
@Table(name = "invoice_content")
public class InvoiceContent {
    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_content_type_id")
    private String invoiceContentTypeId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("invoiceId=Invoice.invoiceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Invoice invoice;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("invoiceContentTypeId=InvoiceContentType.invoiceContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceContentType invoiceContentType;
}
