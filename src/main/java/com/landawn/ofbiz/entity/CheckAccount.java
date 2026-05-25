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
@Table(name = "check_account")
public class CheckAccount {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "routing_number")
    private String routingNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "name_on_account")
    private String nameOnAccount;

    @Column(name = "company_name_on_account")
    private String companyNameOnAccount;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "branch_code")
    private String branchCode;
}
