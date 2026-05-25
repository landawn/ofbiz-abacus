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
@Table(name = "order_denylist")
public class OrderDenylist {
    @Id
    @Column(name = "denylist_string")
    private String denylistString;

    @Id
    @Column(name = "order_denylist_type_id")
    private String orderDenylistTypeId;
}
