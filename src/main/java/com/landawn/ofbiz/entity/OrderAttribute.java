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
@Table(name = "order_attribute")
public class OrderAttribute {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;
}
