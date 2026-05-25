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
@Table(name = "file_extension")
public class FileExtension {
    @Id
    @Column(name = "file_extension_id")
    private String fileExtensionId;

    @Column(name = "mime_type_id")
    private String mimeTypeId;
}
