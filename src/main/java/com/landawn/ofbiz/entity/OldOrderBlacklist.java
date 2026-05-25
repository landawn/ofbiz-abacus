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
@Table(name = "old_order_blacklist")
public class OldOrderBlacklist {
    @Id
    @Column(name = "blacklist_string")
    private String blacklistString;

    @Id
    @Column(name = "order_blacklist_type_id")
    private String orderBlacklistTypeId;
}
