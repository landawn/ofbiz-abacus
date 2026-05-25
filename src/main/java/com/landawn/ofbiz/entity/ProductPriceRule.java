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
@Table(name = "product_price_rule")
public class ProductPriceRule {
    @Id
    @Column(name = "product_price_rule_id")
    private String productPriceRuleId;

    @Column(name = "rule_name")
    private String ruleName;

    @Column(name = "description")
    private String description;

    @Column(name = "is_sale")
    private String isSale;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
