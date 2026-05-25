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
@Table(name = "testing_remove_all")
public class TestingRemoveAll {
    @Id
    @Column(name = "testing_remove_all_id")
    private String testingRemoveAllId;

    @Column(name = "description")
    private String description;
}
