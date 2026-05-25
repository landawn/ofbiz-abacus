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
@Table(name = "marketing_campaign_note")
public class MarketingCampaignNote {
    @Id
    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Id
    @Column(name = "note_id")
    private String noteId;
}
