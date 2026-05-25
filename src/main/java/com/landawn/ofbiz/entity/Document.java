package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "document")
public class Document {
    @Id
    @Column(name = "document_id")
    private String documentId;

    @Column(name = "document_type_id")
    private String documentTypeId;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Column(name = "comments")
    private String comments;

    @Column(name = "document_location")
    private String documentLocation;

    @Column(name = "document_text")
    private String documentText;

    @Column(name = "image_data")
    private byte[] imageData;
}
