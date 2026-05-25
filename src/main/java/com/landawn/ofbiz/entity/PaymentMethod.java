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
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "gl_account_id")
    private String glAccountId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "description")
    private String description;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
