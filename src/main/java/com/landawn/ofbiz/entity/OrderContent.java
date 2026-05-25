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
@Table(name = "order_content")
public class OrderContent {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "order_content_type_id")
    private String orderContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
