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
@Table(name = "product_price_auto_notice")
public class ProductPriceAutoNotice {
    @Id
    @Column(name = "product_price_notice_id")
    private String productPriceNoticeId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "run_date")
    private Timestamp runDate;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
