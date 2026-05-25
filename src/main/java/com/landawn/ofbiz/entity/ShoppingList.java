package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "shopping_list")
public class ShoppingList {
    @Id
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @Column(name = "shopping_list_type_id")
    private String shoppingListTypeId;

    @Column(name = "parent_shopping_list_id")
    private String parentShoppingListId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "visitor_id")
    private String visitorId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "list_name")
    private String listName;

    @Column(name = "description")
    private String description;

    @Column(name = "is_public")
    private String isPublic;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "currency_uom")
    private String currencyUom;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @Column(name = "last_ordered_date")
    private Timestamp lastOrderedDate;

    @Column(name = "last_admin_modified")
    private Timestamp lastAdminModified;

    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @JoinedBy("parentShoppingListId=ShoppingList.shoppingListId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShoppingList shoppingList;

    @JoinedBy("shoppingListTypeId=ShoppingListType.shoppingListTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShoppingListType shoppingListType;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("shipmentMethodTypeId=CarrierShipmentMethod.shipmentMethodTypeId, carrierPartyId=CarrierShipmentMethod.partyId, carrierRoleTypeId=CarrierShipmentMethod.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CarrierShipmentMethod carrierShipmentMethod;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("paymentMethodId=PaymentMethod.paymentMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethod paymentMethod;

    @JoinedBy("recurrenceInfoId=RecurrenceInfo.recurrenceInfoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RecurrenceInfo recurrenceInfo;

    @JoinedBy("productPromoCodeId=ProductPromoCode.productPromoCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoCode productPromoCode;
}
