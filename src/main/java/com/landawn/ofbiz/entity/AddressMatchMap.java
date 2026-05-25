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
@Table(name = "address_match_map")
public class AddressMatchMap {
    @Id
    @Column(name = "map_key")
    private String mapKey;

    @Id
    @Column(name = "map_value")
    private String mapValue;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
