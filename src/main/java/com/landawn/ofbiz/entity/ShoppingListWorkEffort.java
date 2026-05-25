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
@Table(name = "shopping_list_work_effort")
public class ShoppingListWorkEffort {
    @Id
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @JoinedBy("shoppingListId=ShoppingList.shoppingListId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShoppingList shoppingList;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;
}
