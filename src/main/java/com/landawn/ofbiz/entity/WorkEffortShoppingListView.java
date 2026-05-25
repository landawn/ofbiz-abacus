package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "work_effort_shopping_list_view")
public class WorkEffortShoppingListView {
    @ReadOnly
    @Column(name = "shopping_list_type_description")
    private String shoppingListTypeDescription;

    @ReadOnly
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "shopping_list_type_id")
    private String shoppingListTypeId;

    @ReadOnly
    @Column(name = "parent_shopping_list_id")
    private String parentShoppingListId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "visitor_id")
    private String visitorId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "list_name")
    private String listName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "is_public")
    private String isPublic;

    @ReadOnly
    @Column(name = "is_active")
    private String isActive;

    @ReadOnly
    @Column(name = "currency_uom")
    private String currencyUom;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @ReadOnly
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @ReadOnly
    @Column(name = "last_ordered_date")
    private Timestamp lastOrderedDate;

    @ReadOnly
    @Column(name = "last_admin_modified")
    private Timestamp lastAdminModified;

    @ReadOnly
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;
}
