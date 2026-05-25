package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
