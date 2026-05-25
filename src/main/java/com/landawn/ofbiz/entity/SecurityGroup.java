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
@Table(name = "security_group")
public class SecurityGroup {
    @Id
    @Column(name = "group_id")
    private String groupId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "description")
    private String description;
}
