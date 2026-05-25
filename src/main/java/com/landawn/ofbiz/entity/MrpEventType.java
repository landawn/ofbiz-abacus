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
@Table(name = "mrp_event_type")
public class MrpEventType {
    @Id
    @Column(name = "mrp_event_type_id")
    private String mrpEventTypeId;

    @Column(name = "description")
    private String description;
}
