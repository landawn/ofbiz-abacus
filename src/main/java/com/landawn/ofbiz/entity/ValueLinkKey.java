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
@Table(name = "value_link_key")
public class ValueLinkKey {
    @Id
    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "public_key")
    private String publicKey;

    @Column(name = "private_key")
    private String privateKey;

    @Column(name = "exchange_key")
    private String exchangeKey;

    @Column(name = "working_key")
    private String workingKey;

    @Column(name = "working_key_index")
    private double workingKeyIndex;

    @Column(name = "last_working_key")
    private String lastWorkingKey;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_terminal")
    private String createdByTerminal;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_terminal")
    private String lastModifiedByTerminal;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
