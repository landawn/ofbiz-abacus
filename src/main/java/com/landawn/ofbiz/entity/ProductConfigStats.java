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
@Table(name = "product_config_stats")
public class ProductConfigStats {
    @Id
    @Column(name = "config_id")
    private String configId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "num_of_confs")
    private double numOfConfs;

    @Column(name = "config_type_id")
    private String configTypeId;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
}
