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
@Table(name = "order_item_group")
public class OrderItemGroup {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_group_seq_id")
    private String orderItemGroupSeqId;

    @Column(name = "parent_group_seq_id")
    private String parentGroupSeqId;

    @Column(name = "group_name")
    private String groupName;
}
