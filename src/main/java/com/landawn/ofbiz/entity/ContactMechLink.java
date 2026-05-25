package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact_mech_link")
public class ContactMechLink {
    @Id
    @Column(name = "contact_mech_id_from")
    private String contactMechIdFrom;

    @Id
    @Column(name = "contact_mech_id_to")
    private String contactMechIdTo;
}
