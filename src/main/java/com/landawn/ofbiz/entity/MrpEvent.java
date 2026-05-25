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
@Table(name = "mrp_event")
public class MrpEvent {
    @Id
    @Column(name = "mrp_id")
    private String mrpId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "event_date")
    private Timestamp eventDate;

    @Id
    @Column(name = "mrp_event_type_id")
    private String mrpEventTypeId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "is_late")
    private String isLate;

    @Column(name = "facility_id_to")
    private String facilityIdTo;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("mrpEventTypeId=MrpEventType.mrpEventTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MrpEventType mrpEventType;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;
}
