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
@Table(name = "email_address_verification")
public class EmailAddressVerification {
    @Id
    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "verify_hash")
    private String verifyHash;

    @Column(name = "expire_date")
    private Timestamp expireDate;
}
