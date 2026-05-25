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
@Table(name = "tenant_key_encrypting_key")
public class TenantKeyEncryptingKey {
    @Id
    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "kek_text")
    private String kekText;
}
