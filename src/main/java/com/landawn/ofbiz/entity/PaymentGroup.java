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
@Table(name = "payment_group")
public class PaymentGroup {
    @Id
    @Column(name = "payment_group_id")
    private String paymentGroupId;

    @Column(name = "payment_group_type_id")
    private String paymentGroupTypeId;

    @Column(name = "payment_group_name")
    private String paymentGroupName;
}
