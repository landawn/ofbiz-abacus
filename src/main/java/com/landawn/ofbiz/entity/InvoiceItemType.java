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
@Table(name = "invoice_item_type")
public class InvoiceItemType {
    @Id
    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @Column(name = "default_gl_account_id")
    private String defaultGlAccountId;

    @JoinedBy("parentTypeId=InvoiceItemType.invoiceItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItemType invoiceItemType;

    @JoinedBy("defaultGlAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;
}
