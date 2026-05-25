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
@Table(name = "invoice_item_type_map")
public class InvoiceItemTypeMap {
    @Id
    @Column(name = "invoice_item_map_key")
    private String invoiceItemMapKey;

    @Id
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;
}
