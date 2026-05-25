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
@Table(name = "runtime_data")
public class RuntimeData {
    @Id
    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @Column(name = "runtime_info")
    private String runtimeInfo;
}
