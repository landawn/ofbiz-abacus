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
@Table(name = "cust_req_and_type_and_party_rel")
public class CustReqAndTypeAndPartyRel {
    @ReadOnly
    @Column(name = "type_description")
    private String typeDescription;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "rel_status_id")
    private String relStatusId;

    @ReadOnly
    @Column(name = "party_relationship_type_id")
    private String partyRelationshipTypeId;

    @ReadOnly
    @Column(name = "cust_request_id")
    private String custRequestId;

    @ReadOnly
    @Column(name = "cust_request_type_id")
    private String custRequestTypeId;

    @ReadOnly
    @Column(name = "cust_request_category_id")
    private String custRequestCategoryId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "from_party_id")
    private String fromPartyId;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "cust_request_date")
    private Timestamp custRequestDate;

    @ReadOnly
    @Column(name = "response_required_date")
    private Timestamp responseRequiredDate;

    @ReadOnly
    @Column(name = "cust_request_name")
    private String custRequestName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "maximum_amount_uom_id")
    private String maximumAmountUomId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @ReadOnly
    @Column(name = "fulfill_contact_mech_id")
    private String fulfillContactMechId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "open_date_time")
    private Timestamp openDateTime;

    @ReadOnly
    @Column(name = "closed_date_time")
    private Timestamp closedDateTime;

    @ReadOnly
    @Column(name = "internal_comment")
    private String internalComment;

    @ReadOnly
    @Column(name = "reason")
    private String reason;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
