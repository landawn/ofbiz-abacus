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
@Table(name = "cust_request_resolution")
public class CustRequestResolution {
    @Id
    @Column(name = "cust_request_resolution_id")
    private String custRequestResolutionId;

    @Column(name = "cust_request_type_id")
    private String custRequestTypeId;

    @Column(name = "description")
    private String description;
}
