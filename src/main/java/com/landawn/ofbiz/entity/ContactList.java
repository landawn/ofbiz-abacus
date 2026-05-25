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
@Table(name = "contact_list")
public class ContactList {
    @Id
    @Column(name = "contact_list_id")
    private String contactListId;

    @Column(name = "contact_list_type_id")
    private String contactListTypeId;

    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Column(name = "contact_list_name")
    private String contactListName;

    @Column(name = "description")
    private String description;

    @Column(name = "comments")
    private String comments;

    @Column(name = "is_public")
    private String isPublic;

    @Column(name = "single_use")
    private String singleUse;

    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @Column(name = "verify_email_from")
    private String verifyEmailFrom;

    @Column(name = "verify_email_screen")
    private String verifyEmailScreen;

    @Column(name = "verify_email_subject")
    private String verifyEmailSubject;

    @Column(name = "verify_email_web_site_id")
    private String verifyEmailWebSiteId;

    @Column(name = "opt_out_screen")
    private String optOutScreen;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("marketingCampaignId=MarketingCampaign.marketingCampaignId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketingCampaign marketingCampaign;

    @JoinedBy("contactListTypeId=ContactListType.contactListTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactListType contactListType;

    @JoinedBy("contactMechTypeId=ContactMechType.contactMechTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMechType contactMechType;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;

    @JoinedBy("ownerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
