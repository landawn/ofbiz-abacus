package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "return_item_type_map")
public class ReturnItemTypeMap {
    @Id
    @Column(name = "return_item_map_key")
    private String returnItemMapKey;

    @Id
    @Column(name = "return_header_type_id")
    private String returnHeaderTypeId;

    @Column(name = "return_item_type_id")
    private String returnItemTypeId;

    @JoinedBy("returnHeaderTypeId=ReturnHeaderType.returnHeaderTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeaderType returnHeaderType;
}
