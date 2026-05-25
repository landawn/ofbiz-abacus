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
@Table(name = "work_effort_content")
public class WorkEffortContent {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "work_effort_content_type_id")
    private String workEffortContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("workEffortContentTypeId=WorkEffortContentType.workEffortContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortContentType workEffortContentType;
}
