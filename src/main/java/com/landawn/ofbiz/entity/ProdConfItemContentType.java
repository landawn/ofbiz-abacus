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
@Table(name = "prod_conf_item_content_type")
public class ProdConfItemContentType {
    @Id
    @Column(name = "conf_item_content_type_id")
    private String confItemContentTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=ProdConfItemContentType.confItemContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProdConfItemContentType prodConfItemContentType;
}
