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
@Table(name = "work_req_fulf_type")
public class WorkReqFulfType {
    @Id
    @Column(name = "work_req_fulf_type_id")
    private String workReqFulfTypeId;

    @Column(name = "description")
    private String description;
}
