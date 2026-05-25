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
@Table(name = "protocol_type")
public class ProtocolType {
    @Id
    @Column(name = "protocol_type_id")
    private String protocolTypeId;

    @Column(name = "protocol_name")
    private String protocolName;
}
