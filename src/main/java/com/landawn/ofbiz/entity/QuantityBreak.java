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
@Table(name = "quantity_break")
public class QuantityBreak {
    @Id
    @Column(name = "quantity_break_id")
    private String quantityBreakId;

    @Column(name = "quantity_break_type_id")
    private String quantityBreakTypeId;

    @Column(name = "from_quantity")
    private double fromQuantity;

    @Column(name = "thru_quantity")
    private double thruQuantity;

    @JoinedBy("quantityBreakTypeId=QuantityBreakType.quantityBreakTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuantityBreakType quantityBreakType;
}
