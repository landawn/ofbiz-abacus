package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "shopping_list_item_attribute")
public class ShoppingListItemAttribute {
    @Id
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @Id
    @Column(name = "shopping_list_item_seq_id")
    private String shoppingListItemSeqId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @JoinedBy("shoppingListId=ShoppingListItem.shoppingListId, shoppingListItemSeqId=ShoppingListItem.shoppingListItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShoppingListItem shoppingListItem;
}
