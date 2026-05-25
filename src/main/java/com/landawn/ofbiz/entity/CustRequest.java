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
@Table(name = "cust_request")
public class CustRequest {
    @Id
    @Column(name = "cust_request_id")
    private String custRequestId;

    @Column(name = "cust_request_type_id")
    private String custRequestTypeId;

    @Column(name = "cust_request_category_id")
    private String custRequestCategoryId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "from_party_id")
    private String fromPartyId;

    @Column(name = "priority")
    private double priority;

    @Column(name = "cust_request_date")
    private Timestamp custRequestDate;

    @Column(name = "response_required_date")
    private Timestamp responseRequiredDate;

    @Column(name = "cust_request_name")
    private String custRequestName;

    @Column(name = "description")
    private String description;

    @Column(name = "maximum_amount_uom_id")
    private String maximumAmountUomId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @Column(name = "fulfill_contact_mech_id")
    private String fulfillContactMechId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "open_date_time")
    private Timestamp openDateTime;

    @Column(name = "closed_date_time")
    private Timestamp closedDateTime;

    @Column(name = "internal_comment")
    private String internalComment;

    @Column(name = "reason")
    private String reason;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("custRequestTypeId=CustRequestType.custRequestTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequestType custRequestType;

    @JoinedBy("custRequestCategoryId=CustRequestCategory.custRequestCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequestCategory custRequestCategory;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("fromPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("maximumAmountUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom maximumAmountUom;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("salesChannelEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("fulfillContactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom currencyUom;
}
