package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "testing_crypto_raw_view")
public class TestingCryptoRawView {
    @ReadOnly
    @Column(name = "testing_crypto_id")
    private String testingCryptoId;

    @ReadOnly
    @Column(name = "testing_crypto_type_id")
    private String testingCryptoTypeId;

    @ReadOnly
    @Column(name = "unencrypted_value")
    private String unencryptedValue;

    @ReadOnly
    @Column(name = "encrypted_value")
    private String encryptedValue;

    @ReadOnly
    @Column(name = "salted_encrypted_value")
    private String saltedEncryptedValue;
}
