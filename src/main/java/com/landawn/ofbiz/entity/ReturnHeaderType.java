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
@Table(name = "return_header_type")
public class ReturnHeaderType {
    @Id
    @Column(name = "return_header_type_id")
    private String returnHeaderTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=ReturnHeaderType.returnHeaderTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeaderType returnHeaderType;
}
