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
@Table(name = "image_data_resource")
public class ImageDataResource {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Column(name = "image_data")
    private byte[] imageData;
}
