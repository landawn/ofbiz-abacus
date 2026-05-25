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
@Table(name = "product_search_result")
public class ProductSearchResult {
    @Id
    @Column(name = "product_search_result_id")
    private String productSearchResultId;

    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "order_by_name")
    private String orderByName;

    @Column(name = "is_ascending")
    private String isAscending;

    @Column(name = "num_results")
    private double numResults;

    @Column(name = "seconds_total")
    private Double secondsTotal;

    @Column(name = "search_date")
    private Timestamp searchDate;
}
