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
@Table(name = "testing_crypto")
public class TestingCrypto {
    @Id
    @Column(name = "testing_crypto_id")
    private String testingCryptoId;

    @Column(name = "testing_crypto_type_id")
    private String testingCryptoTypeId;

    @Column(name = "unencrypted_value")
    private String unencryptedValue;

    @Column(name = "encrypted_value")
    private String encryptedValue;

    @Column(name = "salted_encrypted_value")
    private String saltedEncryptedValue;
}
