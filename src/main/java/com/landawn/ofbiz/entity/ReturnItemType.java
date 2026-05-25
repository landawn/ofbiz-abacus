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
@Table(name = "return_item_type")
public class ReturnItemType {
    @Id
    @Column(name = "return_item_type_id")
    private String returnItemTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=ReturnItemType.returnItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnItemType returnItemType;
}
