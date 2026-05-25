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
@Table(name = "shopping_list_item")
public class ShoppingListItem {
    @Id
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @Id
    @Column(name = "shopping_list_item_seq_id")
    private String shoppingListItemSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "modified_price")
    private double modifiedPrice;

    @Column(name = "reserv_start")
    private Timestamp reservStart;

    @Column(name = "reserv_length")
    private double reservLength;

    @Column(name = "reserv_persons")
    private double reservPersons;

    @Column(name = "quantity_purchased")
    private double quantityPurchased;

    @Column(name = "config_id")
    private String configId;
}
