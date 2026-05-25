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
@Table(name = "order_item_price_info")
public class OrderItemPriceInfo {
    @Id
    @Column(name = "order_item_price_info_id")
    private String orderItemPriceInfoId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "product_price_rule_id")
    private String productPriceRuleId;

    @Column(name = "product_price_action_seq_id")
    private String productPriceActionSeqId;

    @Column(name = "modify_amount")
    private double modifyAmount;

    @Column(name = "description")
    private String description;

    @Column(name = "rate_code")
    private String rateCode;
}
