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
@Table(name = "content_revision_item")
public class ContentRevisionItem {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "content_revision_seq_id")
    private String contentRevisionSeqId;

    @Id
    @Column(name = "item_content_id")
    private String itemContentId;

    @Column(name = "old_data_resource_id")
    private String oldDataResourceId;

    @Column(name = "new_data_resource_id")
    private String newDataResourceId;
}
