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
@Table(name = "lot")
public class Lot {
    @Id
    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "creation_date")
    private Timestamp creationDate;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "expiration_date")
    private Timestamp expirationDate;
}
