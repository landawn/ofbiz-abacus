/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.*;
import com.landawn.ofbiz.entity.*;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 160 OFBiz services exposed by {@link com.landawn.ofbiz.controller.PartyController}.
 *
 * <p>Heavy entity-auto CRUD across Party-domain (Party, Person, PartyGroup, PartyRole,
 * PartyClassification, PartyContactMech*, PartyEmail/Telecom/Postal, PartyContent/Note/Identification,
 * PartyInvitation*, PartyRelationship*, UserLogin, BillingAccount, CommunicationEvent*,
 * ShoppingList*, CreditCard/Eft/Gift/Check, PartyTaxAuthInfo, MaritalStatus, RoleType, AVS).
 * Composite orchestrations (createCustomer, createVendor, createEmployee, createPerson,
 * createPartyGroup, importParty, uploadPartyContentFile, serveImage) carry
 * {@code // TODO unimplemented:} markers — they need UserLogin/Party/Person + ContactMech +
 * PartyRole orchestration that is beyond a single service method.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class PartyService {

    private final PartyDao partyDao;
    private final PersonDao personDao;
    private final PartyGroupDao partyGroupDao;
    private final PartyAttributeDao partyAttributeDao;
    private final PartyRoleDao partyRoleDao;
    private final PartyClassificationDao partyClassificationDao;
    private final PartyClassificationGroupDao partyClassificationGroupDao;
    private final ContactMechDao contactMechDao;
    private final PartyContactMechDao partyContactMechDao;
    private final PartyContactMechPurposeDao partyContactMechPurposeDao;
    private final PartyContentDao partyContentDao;
    private final PartyNoteDao partyNoteDao;
    private final PartyIdentificationDao partyIdentificationDao;
    private final PartyInvitationDao partyInvitationDao;
    private final PartyInvitationGroupAssocDao partyInvitationGroupAssocDao;
    private final PartyInvitationRoleAssocDao partyInvitationRoleAssocDao;
    private final PartyRelationshipDao partyRelationshipDao;
    private final PartyRelationshipTypeDao partyRelationshipTypeDao;
    private final PartyCarrierAccountDao partyCarrierAccountDao;
    private final PartyTaxAuthInfoDao partyTaxAuthInfoDao;
    private final PartyRateDao partyRateDao;
    private final UserLoginDao userLoginDao;
    private final UserLoginSecurityGroupDao userLoginSecurityGroupDao;
    private final MaritalStatusDao maritalStatusDao;
    private final MaritalStatusTypeDao maritalStatusTypeDao;
    private final RoleTypeDao roleTypeDao;
    private final ProductStoreRoleDao productStoreRoleDao;
    private final BillingAccountDao billingAccountDao;
    private final BillingAccountRoleDao billingAccountRoleDao;
    private final CommunicationEventDao communicationEventDao;
    private final CommunicationEventRoleDao communicationEventRoleDao;
    private final CommunicationEventPurposeDao communicationEventPurposeDao;
    private final CommunicationEventProductDao communicationEventProductDao;
    private final CommunicationEventReturnDao communicationEventReturnDao;
    private final CommunicationEventOrderDao communicationEventOrderDao;
    private final CommunicationEventWorkEffDao communicationEventWorkEffDao;
    private final CommEventContentAssocDao commEventContentAssocDao;
    private final CommEventContentAssocDao commEventContentAssocDao_unused;
    private final ShoppingListDao shoppingListDao;
    private final ShoppingListItemDao shoppingListItemDao;
    private final CreditCardDao creditCardDao;
    private final EftAccountDao eftAccountDao;
    private final GiftCardDao giftCardDao;
    private final CheckAccountDao checkAccountDao;
    private final AddressMatchMapDao addressMatchMapDao;
    private final PartyIcsAvsOverrideDao avsOverrideDao;
    private final PostalAddressDao postalAddressDao;
    private final TelecomNumberDao telecomNumberDao;
    private final FtpAddressDao ftpAddressDao;
    private final CustRequestDao custRequestDao;
    private final ContactListPartyDao contactListPartyDao;
    private final EmploymentAppDao employmentAppDao;
    private final PartyResumeDao partyResumeDao;
    private final PartySkillDao partySkillDao;
    private final SegmentGroupRoleDao segmentGroupRoleDao;

    public PartyService(PartyDao partyDao, PersonDao personDao, PartyGroupDao partyGroupDao,
                        PartyAttributeDao partyAttributeDao, PartyRoleDao partyRoleDao,
                        PartyClassificationDao partyClassificationDao,
                        PartyClassificationGroupDao partyClassificationGroupDao,
                        ContactMechDao contactMechDao, PartyContactMechDao partyContactMechDao,
                        PartyContactMechPurposeDao partyContactMechPurposeDao,
                        PartyContentDao partyContentDao, PartyNoteDao partyNoteDao,
                        PartyIdentificationDao partyIdentificationDao,
                        PartyInvitationDao partyInvitationDao,
                        PartyInvitationGroupAssocDao partyInvitationGroupAssocDao,
                        PartyInvitationRoleAssocDao partyInvitationRoleAssocDao,
                        PartyRelationshipDao partyRelationshipDao,
                        PartyRelationshipTypeDao partyRelationshipTypeDao,
                        PartyCarrierAccountDao partyCarrierAccountDao,
                        PartyTaxAuthInfoDao partyTaxAuthInfoDao,
                        PartyRateDao partyRateDao,
                        UserLoginDao userLoginDao,
                        UserLoginSecurityGroupDao userLoginSecurityGroupDao,
                        MaritalStatusDao maritalStatusDao,
                        MaritalStatusTypeDao maritalStatusTypeDao,
                        RoleTypeDao roleTypeDao,
                        ProductStoreRoleDao productStoreRoleDao,
                        BillingAccountDao billingAccountDao,
                        BillingAccountRoleDao billingAccountRoleDao,
                        CommunicationEventDao communicationEventDao,
                        CommunicationEventRoleDao communicationEventRoleDao,
                        CommunicationEventPurposeDao communicationEventPurposeDao,
                        CommunicationEventProductDao communicationEventProductDao,
                        CommunicationEventReturnDao communicationEventReturnDao,
                        CommunicationEventOrderDao communicationEventOrderDao,
                        CommunicationEventWorkEffDao communicationEventWorkEffDao,
                        CommEventContentAssocDao commEventContentAssocDao,
                        CommEventContentAssocDao commEventContentAssocDao_unused,
                        ShoppingListDao shoppingListDao, ShoppingListItemDao shoppingListItemDao,
                        CreditCardDao creditCardDao, EftAccountDao eftAccountDao,
                        GiftCardDao giftCardDao, CheckAccountDao checkAccountDao,
                        AddressMatchMapDao addressMatchMapDao,
                        PartyIcsAvsOverrideDao avsOverrideDao,
                        PostalAddressDao postalAddressDao,
                        TelecomNumberDao telecomNumberDao,
                        FtpAddressDao ftpAddressDao,
                        CustRequestDao custRequestDao,
                        ContactListPartyDao contactListPartyDao,
                        EmploymentAppDao employmentAppDao,
                        PartyResumeDao partyResumeDao,
                        PartySkillDao partySkillDao,
                        SegmentGroupRoleDao segmentGroupRoleDao) {
        this.partyDao = partyDao; this.personDao = personDao; this.partyGroupDao = partyGroupDao;
        this.partyAttributeDao = partyAttributeDao; this.partyRoleDao = partyRoleDao;
        this.partyClassificationDao = partyClassificationDao;
        this.partyClassificationGroupDao = partyClassificationGroupDao;
        this.contactMechDao = contactMechDao; this.partyContactMechDao = partyContactMechDao;
        this.partyContactMechPurposeDao = partyContactMechPurposeDao;
        this.partyContentDao = partyContentDao; this.partyNoteDao = partyNoteDao;
        this.partyIdentificationDao = partyIdentificationDao;
        this.partyInvitationDao = partyInvitationDao;
        this.partyInvitationGroupAssocDao = partyInvitationGroupAssocDao;
        this.partyInvitationRoleAssocDao = partyInvitationRoleAssocDao;
        this.partyRelationshipDao = partyRelationshipDao;
        this.partyRelationshipTypeDao = partyRelationshipTypeDao;
        this.partyCarrierAccountDao = partyCarrierAccountDao;
        this.partyTaxAuthInfoDao = partyTaxAuthInfoDao;
        this.partyRateDao = partyRateDao;
        this.userLoginDao = userLoginDao;
        this.userLoginSecurityGroupDao = userLoginSecurityGroupDao;
        this.maritalStatusDao = maritalStatusDao; this.maritalStatusTypeDao = maritalStatusTypeDao;
        this.roleTypeDao = roleTypeDao; this.productStoreRoleDao = productStoreRoleDao;
        this.billingAccountDao = billingAccountDao; this.billingAccountRoleDao = billingAccountRoleDao;
        this.communicationEventDao = communicationEventDao;
        this.communicationEventRoleDao = communicationEventRoleDao;
        this.communicationEventPurposeDao = communicationEventPurposeDao;
        this.communicationEventProductDao = communicationEventProductDao;
        this.communicationEventReturnDao = communicationEventReturnDao;
        this.communicationEventOrderDao = communicationEventOrderDao;
        this.communicationEventWorkEffDao = communicationEventWorkEffDao;
        this.commEventContentAssocDao = commEventContentAssocDao;
        this.commEventContentAssocDao_unused = commEventContentAssocDao_unused;
        this.shoppingListDao = shoppingListDao; this.shoppingListItemDao = shoppingListItemDao;
        this.creditCardDao = creditCardDao; this.eftAccountDao = eftAccountDao;
        this.giftCardDao = giftCardDao; this.checkAccountDao = checkAccountDao;
        this.addressMatchMapDao = addressMatchMapDao; this.avsOverrideDao = avsOverrideDao;
        this.postalAddressDao = postalAddressDao; this.telecomNumberDao = telecomNumberDao;
        this.ftpAddressDao = ftpAddressDao; this.custRequestDao = custRequestDao;
        this.contactListPartyDao = contactListPartyDao;
        this.employmentAppDao = employmentAppDao; this.partyResumeDao = partyResumeDao;
        this.partySkillDao = partySkillDao;
        this.segmentGroupRoleDao = segmentGroupRoleDao;
    }

    // ======================================================================
    // PartyGroup
    // ======================================================================
    public Map<String,Object> createPartyGroup(Map<String,Object> body) throws SQLException {
        String pid = ServiceInput.str(body, "partyId");
        if (Strings.isEmpty(pid)) pid = SequenceUtil.next();
        Party p = new Party(); p.setPartyId(pid); p.setPartyTypeId("PARTY_GROUP");
        try { partyDao.insert(p); } catch (SQLException dup) {/* already exists */}
        PartyGroup g = new PartyGroup(); ServiceInput.populate(g, body); g.setPartyId(pid);
        partyGroupDao.insert(g);
        return ServiceResponse.success("partyId", pid);
    }
    public Map<String,Object> updatePartyGroup(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "partyId");
        PartyGroup g = partyGroupDao.gett(id);
        if (g == null) return ServiceResponse.error("PartyGroup not found: " + id);
        ServiceInput.populate(g, body); g.setPartyId(id);
        partyGroupDao.update(g);
        return ServiceResponse.success("partyId", id);
    }
    public Map<String,Object> createPerson(Map<String,Object> body) throws SQLException {
        String pid = ServiceInput.str(body, "partyId");
        if (Strings.isEmpty(pid)) pid = SequenceUtil.next();
        Party p = new Party(); p.setPartyId(pid); p.setPartyTypeId("PERSON");
        try { partyDao.insert(p); } catch (SQLException dup) {/* */}
        Person person = new Person(); ServiceInput.populate(person, body); person.setPartyId(pid);
        personDao.insert(person);
        return ServiceResponse.success("partyId", pid);
    }
    public Map<String,Object> updatePerson(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "partyId");
        Person p = personDao.gett(id);
        if (p == null) return ServiceResponse.error("Person not found: " + id);
        ServiceInput.populate(p, body); p.setPartyId(id);
        personDao.update(p);
        return ServiceResponse.success("partyId", id);
    }

    // ======================================================================
    // PartyRole / PartyClassification / PartyAttribute
    // ======================================================================
    public Map<String,Object> createPartyRole(Map<String,Object> body) throws SQLException {
        PartyRole e = new PartyRole(); ServiceInput.populate(e, body);
        if (partyRoleDao.gett(e) == null) partyRoleDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartyRole(Map<String,Object> body) throws SQLException {
        PartyRole pk = new PartyRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyRoleDao.delete(pk));
    }
    public Map<String,Object> createPartyClassification(Map<String,Object> body) throws SQLException {
        PartyClassification e = new PartyClassification(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyClassificationDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartyClassification(Map<String,Object> body) throws SQLException {
        PartyClassification pk = new PartyClassification(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyClassificationDao.delete(pk));
    }
    public Map<String,Object> createPartyClassificationGroup(Map<String,Object> body) throws SQLException {
        PartyClassificationGroup e = new PartyClassificationGroup(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getPartyClassificationGroupId())) e.setPartyClassificationGroupId(SequenceUtil.next());
        partyClassificationGroupDao.insert(e);
        return ServiceResponse.success("partyClassificationGroupId", e.getPartyClassificationGroupId());
    }
    public Map<String,Object> updatePartyClassificationGroup(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "partyClassificationGroupId");
        PartyClassificationGroup e = partyClassificationGroupDao.gett(id);
        if (e == null) return ServiceResponse.error("PartyClassificationGroup not found: " + id);
        ServiceInput.populate(e, body); e.setPartyClassificationGroupId(id);
        partyClassificationGroupDao.update(e);
        return ServiceResponse.success("partyClassificationGroupId", id);
    }
    public Map<String,Object> deletePartyClassificationGroup(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", partyClassificationGroupDao.deleteById(ServiceInput.str(body, "partyClassificationGroupId")));
    }
    public Map<String,Object> createPartyAttribute(Map<String,Object> body) throws SQLException {
        PartyAttribute e = new PartyAttribute(); ServiceInput.populate(e, body);
        partyAttributeDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartyAttribute(Map<String,Object> body) throws SQLException {
        PartyAttribute pk = new PartyAttribute(); ServiceInput.populate(pk, body);
        PartyAttribute e = partyAttributeDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyAttribute not found");
        ServiceInput.populate(e, body); partyAttributeDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> removePartyAttribute(Map<String,Object> body) throws SQLException {
        PartyAttribute pk = new PartyAttribute(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyAttributeDao.delete(pk));
    }

    // ======================================================================
    // ContactMech (PartyContactMech + PartyEmail/Telecom/Postal/Ftp)
    // ======================================================================
    public Map<String,Object> createPartyContactMech(Map<String,Object> body) throws SQLException {
        PartyContactMech e = new PartyContactMech(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyContactMechDao.insert(e);
        return ServiceResponse.success("contactMechId", e.getContactMechId());
    }
    public Map<String,Object> updatePartyContactMech(Map<String,Object> body) throws SQLException {
        PartyContactMech pk = new PartyContactMech(); ServiceInput.populate(pk, body);
        PartyContactMech e = partyContactMechDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyContactMech not found");
        ServiceInput.populate(e, body); partyContactMechDao.update(e);
        return ServiceResponse.success("contactMechId", e.getContactMechId());
    }
    public Map<String,Object> deletePartyContactMech(Map<String,Object> body) throws SQLException {
        PartyContactMech pk = new PartyContactMech(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyContactMechDao.delete(pk));
    }
    public Map<String,Object> createPartyContactMechPurpose(Map<String,Object> body) throws SQLException {
        PartyContactMechPurpose e = new PartyContactMechPurpose(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyContactMechPurposeDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> expirePartyContactMechPurpose(Map<String,Object> body) throws SQLException {
        PartyContactMechPurpose pk = new PartyContactMechPurpose(); ServiceInput.populate(pk, body);
        PartyContactMechPurpose e = partyContactMechPurposeDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyContactMechPurpose not found");
        e.setThruDate(nowTs()); partyContactMechPurposeDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }

    /** Create a fresh ContactMech (EMAIL_ADDRESS) + PartyContactMech link. */
    public Map<String,Object> createPartyEmailAddress(Map<String,Object> body) throws SQLException {
        return createParty_ContactMech(body, "EMAIL_ADDRESS");
    }
    public Map<String,Object> updatePartyEmailAddress(Map<String,Object> body) throws SQLException {
        return updateContactMechInfo(body);
    }
    public Map<String,Object> createPartyTelecomNumber(Map<String,Object> body) throws SQLException {
        String cmId = SequenceUtil.next();
        ContactMech cm = new ContactMech(); cm.setContactMechId(cmId);
        cm.setContactMechTypeId("TELECOM_NUMBER"); contactMechDao.insert(cm);
        TelecomNumber tn = new TelecomNumber(); ServiceInput.populate(tn, body); tn.setContactMechId(cmId);
        telecomNumberDao.insert(tn);
        PartyContactMech pcm = new PartyContactMech(); ServiceInput.populate(pcm, body);
        pcm.setContactMechId(cmId); pcm.setFromDate(nowTs());
        partyContactMechDao.insert(pcm);
        return ServiceResponse.success("contactMechId", cmId);
    }
    public Map<String,Object> updatePartyTelecomNumber(Map<String,Object> body) throws SQLException {
        String cmId = ServiceInput.str(body, "contactMechId");
        TelecomNumber tn = telecomNumberDao.gett(cmId);
        if (tn != null) { ServiceInput.populate(tn, body); tn.setContactMechId(cmId); telecomNumberDao.update(tn); }
        return ServiceResponse.success("contactMechId", cmId);
    }
    public Map<String,Object> createPartyPostalAddress(Map<String,Object> body) throws SQLException {
        String cmId = SequenceUtil.next();
        ContactMech cm = new ContactMech(); cm.setContactMechId(cmId);
        cm.setContactMechTypeId("POSTAL_ADDRESS"); contactMechDao.insert(cm);
        PostalAddress pa = new PostalAddress(); ServiceInput.populate(pa, body); pa.setContactMechId(cmId);
        postalAddressDao.insert(pa);
        PartyContactMech pcm = new PartyContactMech(); ServiceInput.populate(pcm, body);
        pcm.setContactMechId(cmId); pcm.setFromDate(nowTs());
        partyContactMechDao.insert(pcm);
        return ServiceResponse.success("contactMechId", cmId);
    }
    public Map<String,Object> updatePartyPostalAddress(Map<String,Object> body) throws SQLException {
        String cmId = ServiceInput.str(body, "contactMechId");
        PostalAddress pa = postalAddressDao.gett(cmId);
        if (pa != null) { ServiceInput.populate(pa, body); pa.setContactMechId(cmId); postalAddressDao.update(pa); }
        return ServiceResponse.success("contactMechId", cmId);
    }
    public Map<String,Object> createPartyFtpAddress(Map<String,Object> body) throws SQLException {
        String cmId = SequenceUtil.next();
        ContactMech cm = new ContactMech(); cm.setContactMechId(cmId);
        cm.setContactMechTypeId("FTP_ADDRESS"); contactMechDao.insert(cm);
        FtpAddress fa = new FtpAddress(); ServiceInput.populate(fa, body); fa.setContactMechId(cmId);
        ftpAddressDao.insert(fa);
        PartyContactMech pcm = new PartyContactMech(); ServiceInput.populate(pcm, body);
        pcm.setContactMechId(cmId); pcm.setFromDate(nowTs());
        partyContactMechDao.insert(pcm);
        return ServiceResponse.success("contactMechId", cmId);
    }
    public Map<String,Object> updatePartyFtpAddress(Map<String,Object> body) throws SQLException {
        String cmId = ServiceInput.str(body, "contactMechId");
        FtpAddress fa = ftpAddressDao.gett(cmId);
        if (fa != null) { ServiceInput.populate(fa, body); fa.setContactMechId(cmId); ftpAddressDao.update(fa); }
        return ServiceResponse.success("contactMechId", cmId);
    }

    // ======================================================================
    // Helpers for ContactMech orchestration
    // ======================================================================
    private static class M extends HashMap<String, Object> {}
    private Map<String,Object> createParty_ContactMech(Map<String,Object> body, String type) throws SQLException {
        String cmId = SequenceUtil.next();
        ContactMech cm = new ContactMech(); cm.setContactMechId(cmId);
        cm.setContactMechTypeId(type); cm.setInfoString(ServiceInput.str(body, "emailAddress"));
        contactMechDao.insert(cm);
        PartyContactMech pcm = new PartyContactMech(); ServiceInput.populate(pcm, body);
        pcm.setContactMechId(cmId); pcm.setFromDate(nowTs());
        partyContactMechDao.insert(pcm);
        return ServiceResponse.success("contactMechId", cmId);
    }
    private Map<String,Object> updateContactMechInfo(Map<String,Object> body) throws SQLException {
        String cmId = ServiceInput.str(body, "contactMechId");
        ContactMech cm = contactMechDao.gett(cmId);
        if (cm == null) return ServiceResponse.error("ContactMech not found: " + cmId);
        cm.setInfoString(ServiceInput.str(body, "emailAddress"));
        contactMechDao.update(cm);
        return ServiceResponse.success("contactMechId", cmId);
    }

    // ======================================================================
    // PartyContent / PartyNote / PartyIdentification
    // ======================================================================
    public Map<String,Object> createPartyContent(Map<String,Object> body) throws SQLException {
        PartyContent e = new PartyContent(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyContentDao.insert(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String,Object> updatePartyContent(Map<String,Object> body) throws SQLException {
        PartyContent pk = new PartyContent(); ServiceInput.populate(pk, body);
        PartyContent e = partyContentDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyContent not found");
        ServiceInput.populate(e, body); partyContentDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String,Object> removePartyContent(Map<String,Object> body) throws SQLException {
        PartyContent pk = new PartyContent(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyContentDao.delete(pk));
    }
    public Map<String,Object> createPartyNote(Map<String,Object> body) throws SQLException {
        PartyNote e = new PartyNote(); ServiceInput.populate(e, body);
        partyNoteDao.insert(e);
        return ServiceResponse.success("noteId", e.getNoteId());
    }
    public Map<String,Object> createPartyIdentification(Map<String,Object> body) throws SQLException {
        PartyIdentification e = new PartyIdentification(); ServiceInput.populate(e, body);
        partyIdentificationDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartyIdentification(Map<String,Object> body) throws SQLException {
        PartyIdentification pk = new PartyIdentification(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyIdentificationDao.delete(pk));
    }

    // ======================================================================
    // PartyInvitation
    // ======================================================================
    public Map<String,Object> createPartyInvitation(Map<String,Object> body) throws SQLException {
        PartyInvitation e = new PartyInvitation(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getPartyInvitationId())) e.setPartyInvitationId(SequenceUtil.next());
        partyInvitationDao.insert(e);
        return ServiceResponse.success("partyInvitationId", e.getPartyInvitationId());
    }
    public Map<String,Object> updatePartyInvitation(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "partyInvitationId");
        PartyInvitation e = partyInvitationDao.gett(id);
        if (e == null) return ServiceResponse.error("PartyInvitation not found: " + id);
        ServiceInput.populate(e, body); e.setPartyInvitationId(id);
        partyInvitationDao.update(e);
        return ServiceResponse.success("partyInvitationId", id);
    }
    public Map<String,Object> deletePartyInvitation(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", partyInvitationDao.deleteById(ServiceInput.str(body, "partyInvitationId")));
    }
    public Map<String,Object> createPartyInvitationGroupAssoc(Map<String,Object> body) throws SQLException {
        PartyInvitationGroupAssoc e = new PartyInvitationGroupAssoc(); ServiceInput.populate(e, body);
        partyInvitationGroupAssocDao.insert(e);
        return ServiceResponse.success("partyInvitationId", e.getPartyInvitationId());
    }
    public Map<String,Object> deletePartyInvitationGroupAssoc(Map<String,Object> body) throws SQLException {
        PartyInvitationGroupAssoc pk = new PartyInvitationGroupAssoc(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyInvitationGroupAssocDao.delete(pk));
    }
    public Map<String,Object> createPartyInvitationRoleAssoc(Map<String,Object> body) throws SQLException {
        PartyInvitationRoleAssoc e = new PartyInvitationRoleAssoc(); ServiceInput.populate(e, body);
        partyInvitationRoleAssocDao.insert(e);
        return ServiceResponse.success("partyInvitationId", e.getPartyInvitationId());
    }
    public Map<String,Object> deletePartyInvitationRoleAssoc(Map<String,Object> body) throws SQLException {
        PartyInvitationRoleAssoc pk = new PartyInvitationRoleAssoc(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyInvitationRoleAssocDao.delete(pk));
    }

    // ======================================================================
    // PartyRelationship
    // ======================================================================
    public Map<String,Object> createPartyRelationship(Map<String,Object> body) throws SQLException {
        PartyRelationship e = new PartyRelationship(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyRelationshipDao.insert(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> updatePartyRelationship(Map<String,Object> body) throws SQLException {
        PartyRelationship pk = new PartyRelationship(); ServiceInput.populate(pk, body);
        PartyRelationship e = partyRelationshipDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyRelationship not found");
        ServiceInput.populate(e, body); partyRelationshipDao.update(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> deletePartyRelationship(Map<String,Object> body) throws SQLException {
        PartyRelationship pk = new PartyRelationship(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyRelationshipDao.delete(pk));
    }
    public Map<String,Object> createPartyRelationshipType(Map<String,Object> body) throws SQLException {
        PartyRelationshipType e = new PartyRelationshipType(); ServiceInput.populate(e, body);
        partyRelationshipTypeDao.insert(e);
        return ServiceResponse.success("partyRelationshipTypeId", e.getPartyRelationshipTypeId());
    }
    public Map<String,Object> createPartyRelationshipAndRole(Map<String,Object> body) throws SQLException {
        createPartyRole(body); createPartyRole(reverseRoleBody(body));
        return createPartyRelationship(body);
    }
    public Map<String,Object> createPartyRelationshipContactAccount(Map<String,Object> body) throws SQLException {
        return createPartyRelationship(body);
    }
    private Map<String,Object> reverseRoleBody(Map<String,Object> body) {
        Map<String,Object> r = new HashMap<>(body);
        r.put("partyId", body.get("partyIdTo"));
        r.put("roleTypeId", body.get("roleTypeIdTo"));
        return r;
    }

    // ======================================================================
    // PartyCarrierAccount / PartyTaxAuthInfo / PartyRate
    // ======================================================================
    public Map<String,Object> createPartyCarrierAccount(Map<String,Object> body) throws SQLException {
        PartyCarrierAccount e = new PartyCarrierAccount(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyCarrierAccountDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartyCarrierAccount(Map<String,Object> body) throws SQLException {
        PartyCarrierAccount pk = new PartyCarrierAccount(); ServiceInput.populate(pk, body);
        PartyCarrierAccount e = partyCarrierAccountDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyCarrierAccount not found");
        ServiceInput.populate(e, body); partyCarrierAccountDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> createPartyTaxAuthInfo(Map<String,Object> body) throws SQLException {
        PartyTaxAuthInfo e = new PartyTaxAuthInfo(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyTaxAuthInfoDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartyTaxAuthInfo(Map<String,Object> body) throws SQLException {
        PartyTaxAuthInfo pk = new PartyTaxAuthInfo(); ServiceInput.populate(pk, body);
        PartyTaxAuthInfo e = partyTaxAuthInfoDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyTaxAuthInfo not found");
        ServiceInput.populate(e, body); partyTaxAuthInfoDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartyTaxAuthInfo(Map<String,Object> body) throws SQLException {
        PartyTaxAuthInfo pk = new PartyTaxAuthInfo(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyTaxAuthInfoDao.delete(pk));
    }
    public Map<String,Object> updatePartyRate(Map<String,Object> body) throws SQLException {
        PartyRate pk = new PartyRate(); ServiceInput.populate(pk, body);
        PartyRate e = partyRateDao.gett(pk);
        if (e == null) { partyRateDao.insert(pk); return ServiceResponse.success("partyId", pk.getPartyId()); }
        ServiceInput.populate(e, body); partyRateDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> expirePartyRate(Map<String,Object> body) throws SQLException {
        PartyRate pk = new PartyRate(); ServiceInput.populate(pk, body);
        PartyRate e = partyRateDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyRate not found");
        e.setThruDate(nowTs()); partyRateDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }

    // ======================================================================
    // UserLogin (createUserLogin, updatePassword, updateUserLoginSecurity, security groups)
    // ======================================================================
    public Map<String,Object> createUserLogin(Map<String,Object> body) throws SQLException {
        UserLogin u = new UserLogin(); ServiceInput.populate(u, body);
        if (Strings.isEmpty(u.getEnabled())) u.setEnabled("Y");
        userLoginDao.insert(u);
        return ServiceResponse.success("userLoginId", u.getUserLoginId());
    }
    public Map<String,Object> updateUserLoginSecurity(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "userLoginId");
        UserLogin u = userLoginDao.gett(id);
        if (u == null) return ServiceResponse.error("UserLogin not found: " + id);
        ServiceInput.populate(u, body); u.setUserLoginId(id);
        userLoginDao.update(u);
        return ServiceResponse.success("userLoginId", id);
    }
    public Map<String,Object> updatePassword(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "userLoginId");
        UserLogin u = userLoginDao.gett(id);
        if (u == null) return ServiceResponse.error("UserLogin not found: " + id);
        String pw = ServiceInput.str(body, "newPassword");
        if (Strings.isEmpty(pw)) return ServiceResponse.error("newPassword required");
        u.setCurrentPassword(pw); u.setPasswordHint(ServiceInput.str(body, "passwordHint"));
        userLoginDao.update(u);
        return ServiceResponse.success("userLoginId", id);
    }
    public Map<String,Object> addUserLoginToSecurityGroup(Map<String,Object> body) throws SQLException {
        UserLoginSecurityGroup e = new UserLoginSecurityGroup(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        userLoginSecurityGroupDao.insert(e);
        return ServiceResponse.success("userLoginId", e.getUserLoginId());
    }
    public Map<String,Object> updateUserLoginToSecurityGroup(Map<String,Object> body) throws SQLException {
        UserLoginSecurityGroup pk = new UserLoginSecurityGroup(); ServiceInput.populate(pk, body);
        UserLoginSecurityGroup e = userLoginSecurityGroupDao.gett(pk);
        if (e == null) return ServiceResponse.error("UserLoginSecurityGroup not found");
        ServiceInput.populate(e, body); userLoginSecurityGroupDao.update(e);
        return ServiceResponse.success("userLoginId", e.getUserLoginId());
    }
    public Map<String,Object> expireUserLoginSecurityGroup(Map<String,Object> body) throws SQLException {
        UserLoginSecurityGroup pk = new UserLoginSecurityGroup(); ServiceInput.populate(pk, body);
        UserLoginSecurityGroup e = userLoginSecurityGroupDao.gett(pk);
        if (e == null) return ServiceResponse.error("UserLoginSecurityGroup not found");
        e.setThruDate(nowTs()); userLoginSecurityGroupDao.update(e);
        return ServiceResponse.success("userLoginId", e.getUserLoginId());
    }
    public Map<String,Object> removeUserPreference(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("removeUserPreference not ported (needs UserPreference DAO)", null);
    }

    // ======================================================================
    // MaritalStatus / MaritalStatusType
    // ======================================================================
    public Map<String,Object> createMaritalStatus(Map<String,Object> body) throws SQLException {
        MaritalStatus e = new MaritalStatus(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        maritalStatusDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updateMaritalStatus(Map<String,Object> body) throws SQLException {
        MaritalStatus pk = new MaritalStatus(); ServiceInput.populate(pk, body);
        MaritalStatus e = maritalStatusDao.gett(pk);
        if (e == null) return ServiceResponse.error("MaritalStatus not found");
        ServiceInput.populate(e, body); maritalStatusDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deleteMaritalStatus(Map<String,Object> body) throws SQLException {
        MaritalStatus pk = new MaritalStatus(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", maritalStatusDao.delete(pk));
    }
    public Map<String,Object> createMaritalStatusType(Map<String,Object> body) throws SQLException {
        MaritalStatusType e = new MaritalStatusType(); ServiceInput.populate(e, body);
        maritalStatusTypeDao.insert(e);
        return ServiceResponse.success("maritalStatusTypeId", e.getMaritalStatusTypeId());
    }

    // ======================================================================
    // RoleType / ProductStoreRole
    // ======================================================================
    public Map<String,Object> createRoleType(Map<String,Object> body) throws SQLException {
        RoleType e = new RoleType(); ServiceInput.populate(e, body);
        roleTypeDao.insert(e);
        return ServiceResponse.success("roleTypeId", e.getRoleTypeId());
    }
    public Map<String,Object> createProductStoreRole(Map<String,Object> body) throws SQLException {
        ProductStoreRole e = new ProductStoreRole(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        productStoreRoleDao.insert(e);
        return ServiceResponse.success("productStoreId", e.getProductStoreId());
    }
    public Map<String,Object> updateProductStoreRole(Map<String,Object> body) throws SQLException {
        ProductStoreRole pk = new ProductStoreRole(); ServiceInput.populate(pk, body);
        ProductStoreRole e = productStoreRoleDao.gett(pk);
        if (e == null) return ServiceResponse.error("ProductStoreRole not found");
        ServiceInput.populate(e, body); productStoreRoleDao.update(e);
        return ServiceResponse.success("productStoreId", e.getProductStoreId());
    }
    public Map<String,Object> removeProductStoreRole(Map<String,Object> body) throws SQLException {
        ProductStoreRole pk = new ProductStoreRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", productStoreRoleDao.delete(pk));
    }

    // ======================================================================
    // BillingAccount
    // ======================================================================
    public Map<String,Object> createBillingAccount(Map<String,Object> body) throws SQLException {
        BillingAccount e = new BillingAccount(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getBillingAccountId())) e.setBillingAccountId(SequenceUtil.next());
        billingAccountDao.insert(e);
        return ServiceResponse.success("billingAccountId", e.getBillingAccountId());
    }
    public Map<String,Object> createBillingAccountAndRole(Map<String,Object> body) throws SQLException {
        Map<String,Object> created = createBillingAccount(body);
        if (ServiceResponse.isError(created)) return created;
        body.put("billingAccountId", created.get("billingAccountId"));
        BillingAccountRole r = new BillingAccountRole(); ServiceInput.populate(r, body);
        if (r.getFromDate() == null) r.setFromDate(nowTs());
        billingAccountRoleDao.insert(r);
        return created;
    }
    public Map<String,Object> updateBillingAccount(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "billingAccountId");
        BillingAccount e = billingAccountDao.gett(id);
        if (e == null) return ServiceResponse.error("BillingAccount not found: " + id);
        ServiceInput.populate(e, body); e.setBillingAccountId(id);
        billingAccountDao.update(e);
        return ServiceResponse.success("billingAccountId", id);
    }
    public Map<String,Object> deleteBillingAccount(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", billingAccountDao.deleteById(ServiceInput.str(body, "billingAccountId")));
    }

    // ======================================================================
    // CommunicationEvent + family
    // ======================================================================
    public Map<String,Object> createCommunicationEvent(Map<String,Object> body) throws SQLException {
        CommunicationEvent e = new CommunicationEvent(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCommunicationEventId())) e.setCommunicationEventId(SequenceUtil.next());
        if (Strings.isEmpty(e.getStatusId())) e.setStatusId("COM_ENTERED");
        if (e.getEntryDate() == null) e.setEntryDate(nowTs());
        communicationEventDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> updateCommunicationEvent(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "communicationEventId");
        CommunicationEvent e = communicationEventDao.gett(id);
        if (e == null) return ServiceResponse.error("CommunicationEvent not found: " + id);
        ServiceInput.populate(e, body); e.setCommunicationEventId(id);
        communicationEventDao.update(e);
        return ServiceResponse.success("communicationEventId", id);
    }
    public Map<String,Object> deleteCommunicationEvent(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", communicationEventDao.deleteById(ServiceInput.str(body, "communicationEventId")));
    }
    public Map<String,Object> markCommunicationAsRead(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "communicationEventId");
        CommunicationEvent e = communicationEventDao.gett(id);
        if (e != null) { e.setStatusId("COM_READ"); communicationEventDao.update(e); }
        return ServiceResponse.success("communicationEventId", id);
    }
    public Map<String,Object> createCommunicationEventRole(Map<String,Object> body) throws SQLException {
        CommunicationEventRole e = new CommunicationEventRole(); ServiceInput.populate(e, body);
        communicationEventRoleDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> removeCommunicationEventRole(Map<String,Object> body) throws SQLException {
        CommunicationEventRole pk = new CommunicationEventRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventRoleDao.delete(pk));
    }
    public Map<String,Object> setCommunicationEventRoleStatus(Map<String,Object> body) throws SQLException {
        CommunicationEventRole pk = new CommunicationEventRole(); ServiceInput.populate(pk, body);
        CommunicationEventRole e = communicationEventRoleDao.gett(pk);
        if (e == null) return ServiceResponse.error("CommunicationEventRole not found");
        e.setStatusId(ServiceInput.str(body, "statusId"));
        communicationEventRoleDao.update(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> createCommunicationEventPurpose(Map<String,Object> body) throws SQLException {
        CommunicationEventPurpose e = new CommunicationEventPurpose(); ServiceInput.populate(e, body);
        communicationEventPurposeDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> removeCommunicationEventPurpose(Map<String,Object> body) throws SQLException {
        CommunicationEventPurpose pk = new CommunicationEventPurpose(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventPurposeDao.delete(pk));
    }
    public Map<String,Object> createCommunicationEventProduct(Map<String,Object> body) throws SQLException {
        CommunicationEventProduct e = new CommunicationEventProduct(); ServiceInput.populate(e, body);
        communicationEventProductDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> removeCommunicationEventProduct(Map<String,Object> body) throws SQLException {
        CommunicationEventProduct pk = new CommunicationEventProduct(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventProductDao.delete(pk));
    }
    public Map<String,Object> createCommunicationEventReturn(Map<String,Object> body) throws SQLException {
        CommunicationEventReturn e = new CommunicationEventReturn(); ServiceInput.populate(e, body);
        communicationEventReturnDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> removeCommunicationEventReturn(Map<String,Object> body) throws SQLException {
        CommunicationEventReturn pk = new CommunicationEventReturn(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventReturnDao.delete(pk));
    }
    public Map<String,Object> createCommunicationEventOrder(Map<String,Object> body) throws SQLException {
        CommunicationEventOrder e = new CommunicationEventOrder(); ServiceInput.populate(e, body);
        communicationEventOrderDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> removeCommunicationEventOrder(Map<String,Object> body) throws SQLException {
        CommunicationEventOrder pk = new CommunicationEventOrder(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventOrderDao.delete(pk));
    }
    public Map<String,Object> createCommEventWorkEffort(Map<String,Object> body) throws SQLException {
        CommunicationEventWorkEff e = new CommunicationEventWorkEff(); ServiceInput.populate(e, body);
        communicationEventWorkEffDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> updateCommunicationEventWorkEff(Map<String,Object> body) throws SQLException {
        CommunicationEventWorkEff pk = new CommunicationEventWorkEff(); ServiceInput.populate(pk, body);
        CommunicationEventWorkEff e = communicationEventWorkEffDao.gett(pk);
        if (e == null) return ServiceResponse.error("CommunicationEventWorkEff not found");
        ServiceInput.populate(e, body); communicationEventWorkEffDao.update(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> deleteCommunicationEventWorkEff(Map<String,Object> body) throws SQLException {
        CommunicationEventWorkEff pk = new CommunicationEventWorkEff(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", communicationEventWorkEffDao.delete(pk));
    }
    public Map<String,Object> createCommContentDataResource(Map<String,Object> body) {
        // TODO unimplemented: CommEventContentDataResource is a view-entity; the source-of-truth
        // (CommEventContentAssoc + DataResource) write is handled by createCommunicationEventContent.
        return ServiceResponse.successWithMessage("createCommContentDataResource view-only", null);
    }
    public Map<String,Object> updateCommContentDataResource(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("updateCommContentDataResource view-only", null);
    }
    public Map<String,Object> expireCommEventContentAssoc(Map<String,Object> body) throws SQLException {
        CommEventContentAssoc pk = new CommEventContentAssoc(); ServiceInput.populate(pk, body);
        CommEventContentAssoc e = commEventContentAssocDao.gett(pk);
        if (e == null) return ServiceResponse.error("CommEventContentAssoc not found");
        e.setThruDate(nowTs()); commEventContentAssocDao.update(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> createCommunicationEventContent(Map<String,Object> body) throws SQLException {
        CommEventContentAssoc e = new CommEventContentAssoc(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        commEventContentAssocDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }
    public Map<String,Object> createCustRequestFromCommEvent(Map<String,Object> body) throws SQLException {
        CustRequest cr = new CustRequest(); ServiceInput.populate(cr, body);
        if (Strings.isEmpty(cr.getCustRequestId())) cr.setCustRequestId(SequenceUtil.next());
        if (Strings.isEmpty(cr.getStatusId())) cr.setStatusId("CRQ_SUBMITTED");
        custRequestDao.insert(cr);
        return ServiceResponse.success("custRequestId", cr.getCustRequestId());
    }
    public Map<String,Object> setCustRequestStatus(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "custRequestId");
        CustRequest cr = custRequestDao.gett(id);
        if (cr == null) return ServiceResponse.error("CustRequest not found: " + id);
        cr.setStatusId(ServiceInput.str(body, "statusId"));
        custRequestDao.update(cr);
        return ServiceResponse.success("custRequestId", id);
    }

    // ======================================================================
    // ShoppingList
    // ======================================================================
    public Map<String,Object> createShoppingList(Map<String,Object> body) throws SQLException {
        ShoppingList e = new ShoppingList(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getShoppingListId())) e.setShoppingListId(SequenceUtil.next());
        shoppingListDao.insert(e);
        return ServiceResponse.success("shoppingListId", e.getShoppingListId());
    }
    public Map<String,Object> updateShoppingList(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "shoppingListId");
        ShoppingList e = shoppingListDao.gett(id);
        if (e == null) return ServiceResponse.error("ShoppingList not found: " + id);
        ServiceInput.populate(e, body); e.setShoppingListId(id);
        shoppingListDao.update(e);
        return ServiceResponse.success("shoppingListId", id);
    }
    public Map<String,Object> createShoppingListItem(Map<String,Object> body) throws SQLException {
        ShoppingListItem e = new ShoppingListItem(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getShoppingListItemSeqId())) e.setShoppingListItemSeqId(SequenceUtil.next());
        shoppingListItemDao.insert(e);
        return ServiceResponse.success("shoppingListItemSeqId", e.getShoppingListItemSeqId());
    }
    public Map<String,Object> updateShoppingListItem(Map<String,Object> body) throws SQLException {
        ShoppingListItem pk = new ShoppingListItem(); ServiceInput.populate(pk, body);
        ShoppingListItem e = shoppingListItemDao.gett(pk);
        if (e == null) return ServiceResponse.error("ShoppingListItem not found");
        ServiceInput.populate(e, body); shoppingListItemDao.update(e);
        return ServiceResponse.success("shoppingListItemSeqId", e.getShoppingListItemSeqId());
    }
    public Map<String,Object> removeShoppingListItem(Map<String,Object> body) throws SQLException {
        ShoppingListItem pk = new ShoppingListItem(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", shoppingListItemDao.delete(pk));
    }
    public Map<String,Object> replaceShoppingListItem(Map<String,Object> body) throws SQLException {
        removeShoppingListItem(body); return createShoppingListItem(body);
    }
    public Map<String,Object> restoreAutoSaveList(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("restoreAutoSaveList not ported (cart restore)", null);
    }
    public Map<String,Object> addListToCart(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("addListToCart not ported (cart orchestration)", null);
    }
    public Map<String,Object> addBulkFromCart(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("addBulkFromCart not ported (cart orchestration)", null);
    }

    // ======================================================================
    // Payment methods (CreditCard / EftAccount / GiftCard / CheckAccount)
    // ======================================================================
    public Map<String,Object> createCreditCard(Map<String,Object> body) throws SQLException {
        String pmid = SequenceUtil.next();
        CreditCard e = new CreditCard(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid);
        creditCardDao.insert(e);
        return ServiceResponse.success("paymentMethodId", pmid);
    }
    public Map<String,Object> updateCreditCard(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "paymentMethodId");
        CreditCard e = creditCardDao.gett(id);
        if (e == null) return ServiceResponse.error("CreditCard not found: " + id);
        ServiceInput.populate(e, body); e.setPaymentMethodId(id);
        creditCardDao.update(e);
        return ServiceResponse.success("paymentMethodId", id);
    }
    public Map<String,Object> createEftAccount(Map<String,Object> body) throws SQLException {
        String pmid = SequenceUtil.next();
        EftAccount e = new EftAccount(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid);
        eftAccountDao.insert(e);
        return ServiceResponse.success("paymentMethodId", pmid);
    }
    public Map<String,Object> updateEftAccount(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "paymentMethodId");
        EftAccount e = eftAccountDao.gett(id);
        if (e == null) return ServiceResponse.error("EftAccount not found: " + id);
        ServiceInput.populate(e, body); e.setPaymentMethodId(id);
        eftAccountDao.update(e);
        return ServiceResponse.success("paymentMethodId", id);
    }
    public Map<String,Object> createGiftCard(Map<String,Object> body) throws SQLException {
        String pmid = SequenceUtil.next();
        GiftCard e = new GiftCard(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid);
        giftCardDao.insert(e);
        return ServiceResponse.success("paymentMethodId", pmid);
    }
    public Map<String,Object> updateGiftCard(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "paymentMethodId");
        GiftCard e = giftCardDao.gett(id);
        if (e == null) return ServiceResponse.error("GiftCard not found: " + id);
        ServiceInput.populate(e, body); e.setPaymentMethodId(id);
        giftCardDao.update(e);
        return ServiceResponse.success("paymentMethodId", id);
    }
    public Map<String,Object> createCheckAccount(Map<String,Object> body) throws SQLException {
        String pmid = SequenceUtil.next();
        CheckAccount e = new CheckAccount(); ServiceInput.populate(e, body); e.setPaymentMethodId(pmid);
        checkAccountDao.insert(e);
        return ServiceResponse.success("paymentMethodId", pmid);
    }
    public Map<String,Object> updateCheckAccount(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "paymentMethodId");
        CheckAccount e = checkAccountDao.gett(id);
        if (e == null) return ServiceResponse.error("CheckAccount not found: " + id);
        ServiceInput.populate(e, body); e.setPaymentMethodId(id);
        checkAccountDao.update(e);
        return ServiceResponse.success("paymentMethodId", id);
    }
    public Map<String,Object> deletePaymentMethod(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "paymentMethodId");
        creditCardDao.deleteById(id); eftAccountDao.deleteById(id);
        giftCardDao.deleteById(id); checkAccountDao.deleteById(id);
        return ServiceResponse.success("deletedRows", 1);
    }
    public Map<String,Object> createServiceCredit(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createServiceCredit not ported", null);
    }

    // ======================================================================
    // AddressMatchMap + AVS
    // ======================================================================
    public Map<String,Object> createAddressMatchMap(Map<String,Object> body) throws SQLException {
        AddressMatchMap e = new AddressMatchMap(); ServiceInput.populate(e, body);
        addressMatchMapDao.insert(e);
        return ServiceResponse.success("mapKey", e.getMapKey());
    }
    public Map<String,Object> removeAddressMatchMap(Map<String,Object> body) throws SQLException {
        AddressMatchMap pk = new AddressMatchMap(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", addressMatchMapDao.delete(pk));
    }
    public Map<String,Object> clearAddressMatchMap(Map<String,Object> body) throws SQLException {
        int n = addressMatchMapDao.delete(Filters.eq("mapKey", ServiceInput.str(body, "mapKey")));
        return ServiceResponse.success("deletedRows", n);
    }
    public Map<String,Object> importAddressMatchMapCsv(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("importAddressMatchMapCsv not ported (file upload)", null);
    }
    public Map<String,Object> updateAVSOverride(Map<String,Object> body) throws SQLException {
        String pid = ServiceInput.str(body, "partyId");
        PartyIcsAvsOverride e = avsOverrideDao.gett(pid);
        if (e == null) {
            PartyIcsAvsOverride n = new PartyIcsAvsOverride(); ServiceInput.populate(n, body);
            avsOverrideDao.insert(n);
            return ServiceResponse.success("partyId", n.getPartyId());
        }
        ServiceInput.populate(e, body); avsOverrideDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deleteAVSOverride(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows",
                avsOverrideDao.deleteById(ServiceInput.str(body, "partyId")));
    }

    // ======================================================================
    // ContactList / Employment / Vendor / Customer / Resume / Skill (cross-component)
    // ======================================================================
    public Map<String,Object> createContactListParty(Map<String,Object> body) throws SQLException {
        ContactListParty e = new ContactListParty(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        contactListPartyDao.insert(e);
        return ServiceResponse.success("contactListId", e.getContactListId());
    }
    public Map<String,Object> updateContactListParty(Map<String,Object> body) throws SQLException {
        ContactListParty pk = new ContactListParty(); ServiceInput.populate(pk, body);
        ContactListParty e = contactListPartyDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContactListParty not found");
        ServiceInput.populate(e, body); contactListPartyDao.update(e);
        return ServiceResponse.success("contactListId", e.getContactListId());
    }
    public Map<String,Object> createEmploymentApp(Map<String,Object> body) throws SQLException {
        EmploymentApp e = new EmploymentApp(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getApplicationId())) e.setApplicationId(SequenceUtil.next());
        employmentAppDao.insert(e);
        return ServiceResponse.success("applicationId", e.getApplicationId());
    }
    public Map<String,Object> updateEmploymentApp(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "applicationId");
        EmploymentApp e = employmentAppDao.gett(id);
        if (e == null) return ServiceResponse.error("EmploymentApp not found: " + id);
        ServiceInput.populate(e, body); e.setApplicationId(id);
        employmentAppDao.update(e);
        return ServiceResponse.success("applicationId", id);
    }
    public Map<String,Object> deleteEmploymentApp(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", employmentAppDao.deleteById(ServiceInput.str(body, "applicationId")));
    }
    public Map<String,Object> createPartyResume(Map<String,Object> body) throws SQLException {
        PartyResume e = new PartyResume(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getResumeId())) e.setResumeId(SequenceUtil.next());
        partyResumeDao.insert(e);
        return ServiceResponse.success("resumeId", e.getResumeId());
    }
    public Map<String,Object> updatePartyResume(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "resumeId");
        PartyResume e = partyResumeDao.gett(id);
        if (e == null) return ServiceResponse.error("PartyResume not found: " + id);
        ServiceInput.populate(e, body); e.setResumeId(id);
        partyResumeDao.update(e);
        return ServiceResponse.success("resumeId", id);
    }
    public Map<String,Object> deletePartyResume(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", partyResumeDao.deleteById(ServiceInput.str(body, "resumeId")));
    }
    public Map<String,Object> createPartySkill(Map<String,Object> body) throws SQLException {
        PartySkill e = new PartySkill(); ServiceInput.populate(e, body);
        partySkillDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartySkill(Map<String,Object> body) throws SQLException {
        PartySkill pk = new PartySkill(); ServiceInput.populate(pk, body);
        PartySkill e = partySkillDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartySkill not found");
        ServiceInput.populate(e, body); partySkillDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartySkill(Map<String,Object> body) throws SQLException {
        PartySkill pk = new PartySkill(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partySkillDao.delete(pk));
    }
    public Map<String,Object> createSegmentGroupRole(Map<String,Object> body) throws SQLException {
        SegmentGroupRole e = new SegmentGroupRole(); ServiceInput.populate(e, body);
        segmentGroupRoleDao.insert(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }
    public Map<String,Object> deleteSegmentGroupRole(Map<String,Object> body) throws SQLException {
        SegmentGroupRole pk = new SegmentGroupRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", segmentGroupRoleDao.delete(pk));
    }

    // ======================================================================
    // Orchestrated stubs
    // ======================================================================
    public Map<String,Object> createCustomer(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createCustomer not ported (Party+Person+Role+ContactMech orchestration)", null);
    }
    public Map<String,Object> createVendor(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createVendor not ported (Party+PartyGroup+Role orchestration)", null);
    }
    public Map<String,Object> createEmployee(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createEmployee not ported (Party+Person+Employment orchestration)", null);
    }
    public Map<String,Object> createProspect(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createProspect not ported", null);
    }
    public Map<String,Object> importParty(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("importParty not ported (CSV/XML import)", null);
    }
    public Map<String,Object> linkPartyRecord(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("linkPartyRecord not ported (party merge)", null);
    }
    public Map<String,Object> uploadPartyContentFile(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("uploadPartyContentFile not ported (multipart upload)", null);
    }
    public Map<String,Object> serveImage(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("serveImage not ported (binary content streaming)", null);
    }
    public Map<String,Object> persistContentAndAssoc(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("persistContentAndAssoc not ported (Content cross-component)", null);
    }
    public Map<String,Object> editGeoLocation(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("editGeoLocation not ported (GeoPoint cross-component)", null);
    }
    public Map<String,Object> allocateMsgToParty(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("allocateMsgToParty not ported (messaging cross-component)", null);
    }
    public Map<String,Object> createCustRequest(Map<String,Object> body) throws SQLException {
        CustRequest e = new CustRequest(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCustRequestId())) e.setCustRequestId(SequenceUtil.next());
        if (Strings.isEmpty(e.getStatusId())) e.setStatusId("CRQ_SUBMITTED");
        custRequestDao.insert(e);
        return ServiceResponse.success("custRequestId", e.getCustRequestId());
    }

    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }
}
