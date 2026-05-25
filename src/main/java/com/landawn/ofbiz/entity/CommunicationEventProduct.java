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
@Table(name = "communication_event_product")
public class CommunicationEventProduct {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;
}
