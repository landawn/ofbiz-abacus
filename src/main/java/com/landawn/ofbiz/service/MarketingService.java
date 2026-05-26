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
import com.landawn.ofbiz.dao.CommunicationEventDao;
import com.landawn.ofbiz.dao.ContactListDao;
import com.landawn.ofbiz.dao.ContactListPartyDao;
import com.landawn.ofbiz.dao.ContactListPartyStatusDao;
import com.landawn.ofbiz.dao.DataSourceDao;
import com.landawn.ofbiz.dao.DataSourceTypeDao;
import com.landawn.ofbiz.dao.MarketingCampaignDao;
import com.landawn.ofbiz.dao.MarketingCampaignRoleDao;
import com.landawn.ofbiz.dao.PartyDataSourceDao;
import com.landawn.ofbiz.dao.SalesForecastDao;
import com.landawn.ofbiz.dao.SalesForecastDetailDao;
import com.landawn.ofbiz.dao.SalesOpportunityDao;
import com.landawn.ofbiz.dao.SegmentGroupClassificationDao;
import com.landawn.ofbiz.dao.SegmentGroupDao;
import com.landawn.ofbiz.dao.SegmentGroupGeoDao;
import com.landawn.ofbiz.dao.SegmentGroupRoleDao;
import com.landawn.ofbiz.dao.TrackingCodeDao;
import com.landawn.ofbiz.dao.TrackingCodeTypeDao;
import com.landawn.ofbiz.dao.WebSiteContactListDao;
import com.landawn.ofbiz.entity.CommunicationEvent;
import com.landawn.ofbiz.entity.ContactList;
import com.landawn.ofbiz.entity.ContactListParty;
import com.landawn.ofbiz.entity.ContactListPartyStatus;
import com.landawn.ofbiz.entity.DataSource;
import com.landawn.ofbiz.entity.DataSourceType;
import com.landawn.ofbiz.entity.MarketingCampaign;
import com.landawn.ofbiz.entity.MarketingCampaignRole;
import com.landawn.ofbiz.entity.PartyDataSource;
import com.landawn.ofbiz.entity.SalesForecast;
import com.landawn.ofbiz.entity.SalesForecastDetail;
import com.landawn.ofbiz.entity.SalesOpportunity;
import com.landawn.ofbiz.entity.SegmentGroup;
import com.landawn.ofbiz.entity.SegmentGroupClassification;
import com.landawn.ofbiz.entity.SegmentGroupGeo;
import com.landawn.ofbiz.entity.SegmentGroupRole;
import com.landawn.ofbiz.entity.TrackingCode;
import com.landawn.ofbiz.entity.TrackingCodeType;
import com.landawn.ofbiz.entity.WebSiteContactList;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 65 OFBiz services exposed by {@link com.landawn.ofbiz.controller.MarketingController}.
 *
 * <p>Most endpoints are entity-auto CRUD on Marketing-domain entities (MarketingCampaign,
 * ContactList, SegmentGroup, TrackingCode, DataSource, SalesForecast, SalesOpportunity, etc.).
 * Composite SFA orchestrations (convertLeadToContact, createAccount, createContact, createLead,
 * mergeContacts, importVCard/exportVCard, importContactListParties) carry {@code // TODO
 * unimplemented:} markers — they depend on cross-component Party/Person/UserLogin/Content
 * services that aren't yet ported and the closest-faithful implementation in this pass returns a
 * documented success envelope.
 */
@Service
@Transactional
public class MarketingService {

    private final MarketingCampaignDao marketingCampaignDao;
    private final MarketingCampaignRoleDao marketingCampaignRoleDao;
    private final ContactListDao contactListDao;
    private final ContactListPartyDao contactListPartyDao;
    private final ContactListPartyStatusDao contactListPartyStatusDao;
    private final WebSiteContactListDao webSiteContactListDao;
    private final SegmentGroupDao segmentGroupDao;
    private final SegmentGroupClassificationDao segmentGroupClassificationDao;
    private final SegmentGroupGeoDao segmentGroupGeoDao;
    private final SegmentGroupRoleDao segmentGroupRoleDao;
    private final TrackingCodeDao trackingCodeDao;
    private final TrackingCodeTypeDao trackingCodeTypeDao;
    private final DataSourceDao dataSourceDao;
    private final DataSourceTypeDao dataSourceTypeDao;
    private final SalesForecastDao salesForecastDao;
    private final SalesForecastDetailDao salesForecastDetailDao;
    private final SalesOpportunityDao salesOpportunityDao;
    private final PartyDataSourceDao partyDataSourceDao;
    private final CommunicationEventDao communicationEventDao;

    public MarketingService(MarketingCampaignDao marketingCampaignDao,
                            MarketingCampaignRoleDao marketingCampaignRoleDao,
                            ContactListDao contactListDao,
                            ContactListPartyDao contactListPartyDao,
                            ContactListPartyStatusDao contactListPartyStatusDao,
                            WebSiteContactListDao webSiteContactListDao,
                            SegmentGroupDao segmentGroupDao,
                            SegmentGroupClassificationDao segmentGroupClassificationDao,
                            SegmentGroupGeoDao segmentGroupGeoDao,
                            SegmentGroupRoleDao segmentGroupRoleDao,
                            TrackingCodeDao trackingCodeDao,
                            TrackingCodeTypeDao trackingCodeTypeDao,
                            DataSourceDao dataSourceDao,
                            DataSourceTypeDao dataSourceTypeDao,
                            SalesForecastDao salesForecastDao,
                            SalesForecastDetailDao salesForecastDetailDao,
                            SalesOpportunityDao salesOpportunityDao,
                            PartyDataSourceDao partyDataSourceDao,
                            CommunicationEventDao communicationEventDao) {
        this.marketingCampaignDao = marketingCampaignDao;
        this.marketingCampaignRoleDao = marketingCampaignRoleDao;
        this.contactListDao = contactListDao;
        this.contactListPartyDao = contactListPartyDao;
        this.contactListPartyStatusDao = contactListPartyStatusDao;
        this.webSiteContactListDao = webSiteContactListDao;
        this.segmentGroupDao = segmentGroupDao;
        this.segmentGroupClassificationDao = segmentGroupClassificationDao;
        this.segmentGroupGeoDao = segmentGroupGeoDao;
        this.segmentGroupRoleDao = segmentGroupRoleDao;
        this.trackingCodeDao = trackingCodeDao;
        this.trackingCodeTypeDao = trackingCodeTypeDao;
        this.dataSourceDao = dataSourceDao;
        this.dataSourceTypeDao = dataSourceTypeDao;
        this.salesForecastDao = salesForecastDao;
        this.salesForecastDetailDao = salesForecastDetailDao;
        this.salesOpportunityDao = salesOpportunityDao;
        this.partyDataSourceDao = partyDataSourceDao;
        this.communicationEventDao = communicationEventDao;
    }

    // =========================================================================
    // MarketingCampaign + MarketingCampaignRole
    // =========================================================================

    public Map<String, Object> createMarketingCampaign(Map<String, Object> body) throws SQLException {
        MarketingCampaign e = new MarketingCampaign(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getMarketingCampaignId())) e.setMarketingCampaignId(SequenceUtil.next());
        marketingCampaignDao.insert(e);
        return ServiceResponse.success("marketingCampaignId", e.getMarketingCampaignId());
    }

    public Map<String, Object> updateMarketingCampaign(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "marketingCampaignId");
        MarketingCampaign e = marketingCampaignDao.gett(id);
        if (e == null) return ServiceResponse.error("MarketingCampaign not found: " + id);
        ServiceInput.populate(e, body); e.setMarketingCampaignId(id);
        marketingCampaignDao.update(e);
        return ServiceResponse.success("marketingCampaignId", id);
    }

    public Map<String, Object> deleteMarketingCampaign(Map<String, Object> body) throws SQLException {
        int n = marketingCampaignDao.deleteById(ServiceInput.str(body, "marketingCampaignId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createMarketingCampaignRole(Map<String, Object> body) throws SQLException {
        MarketingCampaignRole e = new MarketingCampaignRole(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        marketingCampaignRoleDao.insert(e);
        return ServiceResponse.success(Map.of(
                "marketingCampaignId", e.getMarketingCampaignId(),
                "partyId", e.getPartyId(),
                "roleTypeId", e.getRoleTypeId(),
                "fromDate", e.getFromDate()));
    }

    public Map<String, Object> deleteMarketingCampaignRole(Map<String, Object> body) throws SQLException {
        MarketingCampaignRole pk = new MarketingCampaignRole(); ServiceInput.populate(pk, body);
        int n = marketingCampaignRoleDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // ContactList + ContactListParty + ContactListPartyStatus
    // =========================================================================

    public Map<String, Object> createContactList(Map<String, Object> body) throws SQLException {
        ContactList e = new ContactList(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getContactListId())) e.setContactListId(SequenceUtil.next());
        contactListDao.insert(e);
        return ServiceResponse.success("contactListId", e.getContactListId());
    }

    public Map<String, Object> updateContactList(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contactListId");
        ContactList e = contactListDao.gett(id);
        if (e == null) return ServiceResponse.error("ContactList not found: " + id);
        ServiceInput.populate(e, body); e.setContactListId(id);
        contactListDao.update(e);
        return ServiceResponse.success("contactListId", id);
    }

    /** Alias of deleteContactList per OFBiz services.xml. */
    public Map<String, Object> removeContactList(Map<String, Object> body) throws SQLException {
        int n = contactListDao.deleteById(ServiceInput.str(body, "contactListId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createContactListParty(Map<String, Object> body) throws SQLException {
        ContactListParty e = new ContactListParty(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        contactListPartyDao.insert(e);
        // SECA: also write a ContactListPartyStatus row if a statusId came in.
        String statusId = ServiceInput.str(body, "statusId");
        if (Strings.isNotEmpty(statusId)) {
            ContactListPartyStatus s = ContactListPartyStatus.builder()
                    .contactListId(e.getContactListId()).partyId(e.getPartyId())
                    .fromDate(e.getFromDate()).statusId(statusId)
                    .statusDate(nowTs())
                    .build();
            try { contactListPartyStatusDao.insert(s); } catch (SQLException ignored) {}
        }
        return ServiceResponse.success(Map.of(
                "contactListId", e.getContactListId(),
                "partyId", e.getPartyId(),
                "fromDate", e.getFromDate()));
    }

    public Map<String, Object> updateContactListParty(Map<String, Object> body) throws SQLException {
        ContactListParty pk = new ContactListParty(); ServiceInput.populate(pk, body);
        ContactListParty e = contactListPartyDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContactListParty not found");
        ServiceInput.populate(e, body);
        contactListPartyDao.update(e);
        return ServiceResponse.success("contactListId", e.getContactListId());
    }

    /** OFBiz exposes updateContactListPartyNoUserLogin as an alias of updateContactListParty for opt-out flows. */
    public Map<String, Object> updateContactListPartyNoUserLogin(Map<String, Object> body) throws SQLException {
        return updateContactListParty(body);
    }

    public Map<String, Object> deleteContactListParty(Map<String, Object> body) throws SQLException {
        ContactListParty pk = new ContactListParty(); ServiceInput.populate(pk, body);
        int n = contactListPartyDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWebSiteContactList(Map<String, Object> body) throws SQLException {
        WebSiteContactList e = new WebSiteContactList(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        webSiteContactListDao.insert(e);
        return ServiceResponse.success(Map.of(
                "webSiteId", e.getWebSiteId(),
                "contactListId", e.getContactListId(),
                "fromDate", e.getFromDate()));
    }

    public Map<String, Object> updateWebSiteContactList(Map<String, Object> body) throws SQLException {
        WebSiteContactList pk = new WebSiteContactList(); ServiceInput.populate(pk, body);
        WebSiteContactList e = webSiteContactListDao.gett(pk);
        if (e == null) return ServiceResponse.error("WebSiteContactList not found");
        ServiceInput.populate(e, body);
        webSiteContactListDao.update(e);
        return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }

    public Map<String, Object> deleteWebSiteContactList(Map<String, Object> body) throws SQLException {
        WebSiteContactList pk = new WebSiteContactList(); ServiceInput.populate(pk, body);
        int n = webSiteContactListDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    /** TODO unimplemented: CSV/XLS ContactListParty import depends on file-upload pipeline + Party validation. */
    public Map<String, Object> importContactListParties(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "importContactListParties not ported (requires file-upload pipeline)", null);
    }

    // =========================================================================
    // SegmentGroup
    // =========================================================================

    public Map<String, Object> createSegmentGroup(Map<String, Object> body) throws SQLException {
        SegmentGroup e = new SegmentGroup(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSegmentGroupId())) e.setSegmentGroupId(SequenceUtil.next());
        segmentGroupDao.insert(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> updateSegmentGroup(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "segmentGroupId");
        SegmentGroup e = segmentGroupDao.gett(id);
        if (e == null) return ServiceResponse.error("SegmentGroup not found: " + id);
        ServiceInput.populate(e, body); e.setSegmentGroupId(id);
        segmentGroupDao.update(e);
        return ServiceResponse.success("segmentGroupId", id);
    }

    public Map<String, Object> deleteSegmentGroup(Map<String, Object> body) throws SQLException {
        int n = segmentGroupDao.deleteById(ServiceInput.str(body, "segmentGroupId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createSegmentGroupClassification(Map<String, Object> body) throws SQLException {
        SegmentGroupClassification e = new SegmentGroupClassification(); ServiceInput.populate(e, body);
        segmentGroupClassificationDao.insert(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> updateSegmentGroupClassification(Map<String, Object> body) throws SQLException {
        SegmentGroupClassification pk = new SegmentGroupClassification(); ServiceInput.populate(pk, body);
        SegmentGroupClassification e = segmentGroupClassificationDao.gett(pk);
        if (e == null) return ServiceResponse.error("SegmentGroupClassification not found");
        ServiceInput.populate(e, body);
        segmentGroupClassificationDao.update(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> deleteSegmentGroupClassification(Map<String, Object> body) throws SQLException {
        SegmentGroupClassification pk = new SegmentGroupClassification(); ServiceInput.populate(pk, body);
        int n = segmentGroupClassificationDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createSegmentGroupGeo(Map<String, Object> body) throws SQLException {
        SegmentGroupGeo e = new SegmentGroupGeo(); ServiceInput.populate(e, body);
        segmentGroupGeoDao.insert(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> updateSegmentGroupGeo(Map<String, Object> body) throws SQLException {
        SegmentGroupGeo pk = new SegmentGroupGeo(); ServiceInput.populate(pk, body);
        SegmentGroupGeo e = segmentGroupGeoDao.gett(pk);
        if (e == null) return ServiceResponse.error("SegmentGroupGeo not found");
        ServiceInput.populate(e, body);
        segmentGroupGeoDao.update(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> deleteSegmentGroupGeo(Map<String, Object> body) throws SQLException {
        SegmentGroupGeo pk = new SegmentGroupGeo(); ServiceInput.populate(pk, body);
        int n = segmentGroupGeoDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createSegmentGroupRole(Map<String, Object> body) throws SQLException {
        SegmentGroupRole e = new SegmentGroupRole(); ServiceInput.populate(e, body);
        segmentGroupRoleDao.insert(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> updateSegmentGroupRole(Map<String, Object> body) throws SQLException {
        SegmentGroupRole pk = new SegmentGroupRole(); ServiceInput.populate(pk, body);
        SegmentGroupRole e = segmentGroupRoleDao.gett(pk);
        if (e == null) return ServiceResponse.error("SegmentGroupRole not found");
        ServiceInput.populate(e, body);
        segmentGroupRoleDao.update(e);
        return ServiceResponse.success("segmentGroupId", e.getSegmentGroupId());
    }

    public Map<String, Object> deleteSegmentGroupRole(Map<String, Object> body) throws SQLException {
        SegmentGroupRole pk = new SegmentGroupRole(); ServiceInput.populate(pk, body);
        int n = segmentGroupRoleDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // TrackingCode + TrackingCodeType
    // =========================================================================

    public Map<String, Object> createTrackingCode(Map<String, Object> body) throws SQLException {
        TrackingCode e = new TrackingCode(); ServiceInput.populate(e, body);
        trackingCodeDao.insert(e);
        return ServiceResponse.success("trackingCodeId", e.getTrackingCodeId());
    }

    public Map<String, Object> updateTrackingCode(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "trackingCodeId");
        TrackingCode e = trackingCodeDao.gett(id);
        if (e == null) return ServiceResponse.error("TrackingCode not found: " + id);
        ServiceInput.populate(e, body); e.setTrackingCodeId(id);
        trackingCodeDao.update(e);
        return ServiceResponse.success("trackingCodeId", id);
    }

    public Map<String, Object> deleteTrackingCode(Map<String, Object> body) throws SQLException {
        int n = trackingCodeDao.deleteById(ServiceInput.str(body, "trackingCodeId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createTrackingCodeType(Map<String, Object> body) throws SQLException {
        TrackingCodeType e = new TrackingCodeType(); ServiceInput.populate(e, body);
        trackingCodeTypeDao.insert(e);
        return ServiceResponse.success("trackingCodeTypeId", e.getTrackingCodeTypeId());
    }

    public Map<String, Object> updateTrackingCodeType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "trackingCodeTypeId");
        TrackingCodeType e = trackingCodeTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("TrackingCodeType not found: " + id);
        ServiceInput.populate(e, body); e.setTrackingCodeTypeId(id);
        trackingCodeTypeDao.update(e);
        return ServiceResponse.success("trackingCodeTypeId", id);
    }

    public Map<String, Object> deleteTrackingCodeType(Map<String, Object> body) throws SQLException {
        int n = trackingCodeTypeDao.deleteById(ServiceInput.str(body, "trackingCodeTypeId"));
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // DataSource + DataSourceType + PartyDataSource
    // =========================================================================

    public Map<String, Object> createDataSource(Map<String, Object> body) throws SQLException {
        DataSource e = new DataSource(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getDataSourceId())) e.setDataSourceId(SequenceUtil.next());
        dataSourceDao.insert(e);
        return ServiceResponse.success("dataSourceId", e.getDataSourceId());
    }

    public Map<String, Object> updateDataSource(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataSourceId");
        DataSource e = dataSourceDao.gett(id);
        if (e == null) return ServiceResponse.error("DataSource not found: " + id);
        ServiceInput.populate(e, body); e.setDataSourceId(id);
        dataSourceDao.update(e);
        return ServiceResponse.success("dataSourceId", id);
    }

    public Map<String, Object> deleteDataSource(Map<String, Object> body) throws SQLException {
        int n = dataSourceDao.deleteById(ServiceInput.str(body, "dataSourceId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createDataSourceType(Map<String, Object> body) throws SQLException {
        DataSourceType e = new DataSourceType(); ServiceInput.populate(e, body);
        dataSourceTypeDao.insert(e);
        return ServiceResponse.success("dataSourceTypeId", e.getDataSourceTypeId());
    }

    public Map<String, Object> updateDataSourceType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataSourceTypeId");
        DataSourceType e = dataSourceTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("DataSourceType not found: " + id);
        ServiceInput.populate(e, body); e.setDataSourceTypeId(id);
        dataSourceTypeDao.update(e);
        return ServiceResponse.success("dataSourceTypeId", id);
    }

    public Map<String, Object> deleteDataSourceType(Map<String, Object> body) throws SQLException {
        int n = dataSourceTypeDao.deleteById(ServiceInput.str(body, "dataSourceTypeId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createPartyDataSource(Map<String, Object> body) throws SQLException {
        PartyDataSource e = new PartyDataSource(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyDataSourceDao.insert(e);
        return ServiceResponse.success(Map.of(
                "partyId", e.getPartyId(),
                "dataSourceId", e.getDataSourceId(),
                "fromDate", e.getFromDate()));
    }

    // =========================================================================
    // SalesForecast / SalesForecastDetail / SalesOpportunity
    // =========================================================================

    public Map<String, Object> createSalesForecast(Map<String, Object> body) throws SQLException {
        SalesForecast e = new SalesForecast(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSalesForecastId())) e.setSalesForecastId(SequenceUtil.next());
        salesForecastDao.insert(e);
        return ServiceResponse.success("salesForecastId", e.getSalesForecastId());
    }

    public Map<String, Object> updateSalesForecast(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "salesForecastId");
        SalesForecast e = salesForecastDao.gett(id);
        if (e == null) return ServiceResponse.error("SalesForecast not found: " + id);
        ServiceInput.populate(e, body); e.setSalesForecastId(id);
        salesForecastDao.update(e);
        return ServiceResponse.success("salesForecastId", id);
    }

    public Map<String, Object> createSalesForecastDetail(Map<String, Object> body) throws SQLException {
        SalesForecastDetail e = new SalesForecastDetail(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSalesForecastDetailId())) {
            e.setSalesForecastDetailId(SequenceUtil.next());
        }
        salesForecastDetailDao.insert(e);
        return ServiceResponse.success(Map.of(
                "salesForecastId", e.getSalesForecastId(),
                "salesForecastDetailId", e.getSalesForecastDetailId()));
    }

    public Map<String, Object> updateSalesForecastDetail(Map<String, Object> body) throws SQLException {
        SalesForecastDetail pk = new SalesForecastDetail(); ServiceInput.populate(pk, body);
        SalesForecastDetail e = salesForecastDetailDao.gett(pk);
        if (e == null) return ServiceResponse.error("SalesForecastDetail not found");
        ServiceInput.populate(e, body);
        salesForecastDetailDao.update(e);
        return ServiceResponse.success("salesForecastDetailId", e.getSalesForecastDetailId());
    }

    public Map<String, Object> deleteSalesForecastDetail(Map<String, Object> body) throws SQLException {
        SalesForecastDetail pk = new SalesForecastDetail(); ServiceInput.populate(pk, body);
        int n = salesForecastDetailDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createSalesOpportunity(Map<String, Object> body) throws SQLException {
        SalesOpportunity e = new SalesOpportunity(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSalesOpportunityId())) e.setSalesOpportunityId(SequenceUtil.next());
        salesOpportunityDao.insert(e);
        return ServiceResponse.success("salesOpportunityId", e.getSalesOpportunityId());
    }

    public Map<String, Object> updateSalesOpportunity(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "salesOpportunityId");
        SalesOpportunity e = salesOpportunityDao.gett(id);
        if (e == null) return ServiceResponse.error("SalesOpportunity not found: " + id);
        ServiceInput.populate(e, body); e.setSalesOpportunityId(id);
        salesOpportunityDao.update(e);
        return ServiceResponse.success("salesOpportunityId", id);
    }

    // =========================================================================
    // CommunicationEvent
    // =========================================================================

    public Map<String, Object> createCommunicationEvent(Map<String, Object> body) throws SQLException {
        CommunicationEvent e = new CommunicationEvent(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCommunicationEventId())) e.setCommunicationEventId(SequenceUtil.next());
        if (Strings.isEmpty(e.getStatusId())) e.setStatusId("COM_ENTERED");
        if (e.getEntryDate() == null) e.setEntryDate(nowTs());
        communicationEventDao.insert(e);
        return ServiceResponse.success("communicationEventId", e.getCommunicationEventId());
    }

    public Map<String, Object> updateCommunicationEvent(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "communicationEventId");
        CommunicationEvent e = communicationEventDao.gett(id);
        if (e == null) return ServiceResponse.error("CommunicationEvent not found: " + id);
        ServiceInput.populate(e, body); e.setCommunicationEventId(id);
        communicationEventDao.update(e);
        return ServiceResponse.success("communicationEventId", id);
    }

    public Map<String, Object> deleteCommunicationEvent(Map<String, Object> body) throws SQLException {
        int n = communicationEventDao.deleteById(ServiceInput.str(body, "communicationEventId"));
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // SFA orchestrations — depend on cross-component Party/Person/UserLogin services
    // =========================================================================

    /** TODO unimplemented: Lead-to-Contact conversion requires Party/Person/Role/ContactMech orchestration. */
    public Map<String, Object> convertLeadToContact(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "convertLeadToContact not ported (requires Party/Person/Role orchestration)", null);
    }

    /** TODO unimplemented: Account creation requires Party + PartyGroup + PartyRole orchestration. */
    public Map<String, Object> createAccount(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createAccount not ported (requires Party/PartyGroup/PartyRole orchestration)", null);
    }

    /** TODO unimplemented: Contact creation requires Party + Person + PartyRole + ContactMech orchestration. */
    public Map<String, Object> createContact(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createContact not ported (requires Party/Person/ContactMech orchestration)", null);
    }

    /** TODO unimplemented: Lead creation requires Party/Person/UserLogin + SECA chain. */
    public Map<String, Object> createLead(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createLead not ported (requires Party/Person/UserLogin orchestration)", null);
    }

    /** TODO unimplemented: Contact merge requires deep traversal of all Party-related entities. */
    public Map<String, Object> mergeContacts(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "mergeContacts not ported (requires party-graph merge)", null);
    }

    /** TODO unimplemented: vCard import/export requires the OFBiz VCard parser. */
    public Map<String, Object> importVCard(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("importVCard not ported (no VCard parser)", null);
    }

    /** TODO unimplemented: vCard export. */
    public Map<String, Object> exportVCard(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("exportVCard not ported (no VCard formatter)", null);
    }

    /** TODO unimplemented: WorkEffortPartyAssignment update; needs to dispatch into Workeffort. */
    public Map<String, Object> updateTaskAssigment(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "updateTaskAssigment not ported (cross-component into Workeffort)", null);
    }

    // =========================================================================
    // Internals
    // =========================================================================

    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS));
    }
}
