package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "prod_conf_item_content")
public class ProdConfItemContent {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "conf_item_content_type_id")
    private String confItemContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("configItemId=ProductConfigItem.configItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigItem productConfigItem;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("confItemContentTypeId=ProdConfItemContentType.confItemContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProdConfItemContentType prodConfItemContentType;
}
