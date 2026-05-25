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
@Table(name = "good_identification")
public class GoodIdentification {
    @Id
    @Column(name = "good_identification_type_id")
    private String goodIdentificationTypeId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "id_value")
    private String idValue;
}
