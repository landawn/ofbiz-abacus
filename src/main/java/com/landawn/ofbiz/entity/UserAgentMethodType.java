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
@Table(name = "user_agent_method_type")
public class UserAgentMethodType {
    @Id
    @Column(name = "user_agent_method_type_id")
    private String userAgentMethodTypeId;

    @Column(name = "description")
    private String description;
}
