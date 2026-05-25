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
@Table(name = "cust_request_comm_event")
public class CustRequestCommEvent {
    @Id
    @Column(name = "cust_request_id")
    private String custRequestId;

    @Id
    @Column(name = "communication_event_id")
    private String communicationEventId;
}
