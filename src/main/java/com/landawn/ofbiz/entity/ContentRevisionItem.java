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

    @JoinedBy("contentId=ContentRevision.contentId, contentRevisionSeqId=ContentRevision.contentRevisionSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContentRevision contentRevision;

    @JoinedBy("oldDataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource oldDataResource;

    @JoinedBy("newDataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource newDataResource;
}
