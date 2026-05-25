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
@Table(name = "cart_abandoned_line")
public class CartAbandonedLine {
    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "cart_abandoned_line_seq_id")
    private String cartAbandonedLineSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "reserv_start")
    private Timestamp reservStart;

    @Column(name = "reserv_length")
    private double reservLength;

    @Column(name = "reserv_persons")
    private double reservPersons;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @Column(name = "config_id")
    private String configId;

    @Column(name = "total_with_adjustments")
    private double totalWithAdjustments;

    @Column(name = "was_reserved")
    private String wasReserved;
}
