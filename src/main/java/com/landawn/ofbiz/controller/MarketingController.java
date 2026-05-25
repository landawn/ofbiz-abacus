package com.landawn.ofbiz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/marketing")
public class MarketingController {

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListPartyNoUserLogin  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/contactListOptOut")
    public ResponseEntity<Map<String, Object>> updateContactListPartyNoUserLogin(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContactList record
     * <p>service: createContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/createContactList")
    public ResponseEntity<Map<String, Object>> createContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/marketing/control/createContactListCommEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party to ContactList
     * <p>service: createContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/createContactListParty")
    public ResponseEntity<Map<String, Object>> createContactListParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataSource record
     * <p>service: createDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/createDataSource")
    public ResponseEntity<Map<String, Object>> createDataSource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataSourceType record
     * <p>service: createDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/createDataSourceType")
    public ResponseEntity<Map<String, Object>> createDataSourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MarketingCampaign record
     * <p>service: createMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/createMarketingCampaign")
    public ResponseEntity<Map<String, Object>> createMarketingCampaign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Role to Campaign
     * <p>service: createMarketingCampaignRole  entities: MarketingCampaignRole  auth: true
     */
    @PostMapping("/marketing/control/createMarketingCampaignRole")
    public ResponseEntity<Map<String, Object>> createMarketingCampaignRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SegmentGroup
     * <p>service: createSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroup")
    public ResponseEntity<Map<String, Object>> createSegmentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SegmentGroupClassification
     * <p>service: createSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupClassification")
    public ResponseEntity<Map<String, Object>> createSegmentGroupClassification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SegmentGroupGeo
     * <p>service: createSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupGeo")
    public ResponseEntity<Map<String, Object>> createSegmentGroupGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SegmentGroupRole
     * <p>service: createSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupRole")
    public ResponseEntity<Map<String, Object>> createSegmentGroupRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a TrackingCode record
     * <p>service: createTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/createTrackingCode")
    public ResponseEntity<Map<String, Object>> createTrackingCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a TrackingCodeType record
     * <p>service: createTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/createTrackingCodeType")
    public ResponseEntity<Map<String, Object>> createTrackingCodeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/createWebSiteContactList")
    public ResponseEntity<Map<String, Object>> createWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a DataSource record
     * <p>service: deleteDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/deleteDataSource")
    public ResponseEntity<Map<String, Object>> deleteDataSource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a DataSourceType record
     * <p>service: deleteDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/deleteDataSourceType")
    public ResponseEntity<Map<String, Object>> deleteDataSourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a SegmentGroup
     * <p>service: deleteSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroup")
    public ResponseEntity<Map<String, Object>> deleteSegmentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a SegmentGroupClassification
     * <p>service: deleteSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupClassification")
    public ResponseEntity<Map<String, Object>> deleteSegmentGroupClassification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a SegmentGroupGeo
     * <p>service: deleteSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupGeo")
    public ResponseEntity<Map<String, Object>> deleteSegmentGroupGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a SegmentGroupRole
     * <p>service: deleteSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupRole")
    public ResponseEntity<Map<String, Object>> deleteSegmentGroupRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a TrackingCode record
     * <p>service: deleteTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/deleteTrackingCode")
    public ResponseEntity<Map<String, Object>> deleteTrackingCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a TrackingCodeType record
     * <p>service: deleteTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/deleteTrackingCodeType")
    public ResponseEntity<Map<String, Object>> deleteTrackingCodeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/deleteWebSiteContactList")
    public ResponseEntity<Map<String, Object>> deleteWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/expireContactListParty")
    public ResponseEntity<Map<String, Object>> updateContactListParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: importContactListParties  entities: unknown  auth: true
     */
    @GetMapping("/marketing/control/importContactListParties")
    public ResponseEntity<Map<String, Object>> importContactListParties(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ContactList record
     * <p>service: removeContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/removeContactList")
    public ResponseEntity<Map<String, Object>> removeContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Communication Event, optionally delete the attached content and dataresource
     * <p>service: deleteCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/marketing/control/removeContactListCommEvent")
    public ResponseEntity<Map<String, Object>> deleteCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party from ContactList
     * <p>service: deleteContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/removeContactListParty")
    public ResponseEntity<Map<String, Object>> deleteContactListParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a MarketingCampaign record
     * <p>service: deleteMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/removeMarketingCampaign")
    public ResponseEntity<Map<String, Object>> deleteMarketingCampaign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Role from Campaign
     * <p>service: deleteMarketingCampaignRole  entities: MarketingCampaignRole  auth: true
     */
    @PostMapping("/marketing/control/removeMarketingCampaignRole")
    public ResponseEntity<Map<String, Object>> deleteMarketingCampaignRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContactList record
     * <p>service: updateContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/updateContactList")
    public ResponseEntity<Map<String, Object>> updateContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Communication Event
     * <p>service: updateCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/marketing/control/updateContactListCommEvent")
    public ResponseEntity<Map<String, Object>> updateCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/updateContactListParty")
    public ResponseEntity<Map<String, Object>> updateContactListPartyUpdateContactListParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataSource record
     * <p>service: updateDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/updateDataSource")
    public ResponseEntity<Map<String, Object>> updateDataSource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataSourceType record
     * <p>service: updateDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/updateDataSourceType")
    public ResponseEntity<Map<String, Object>> updateDataSourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MarketingCampaign record
     * <p>service: updateMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/updateMarketingCampaign")
    public ResponseEntity<Map<String, Object>> updateMarketingCampaign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SegmentGroup
     * <p>service: updateSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroup")
    public ResponseEntity<Map<String, Object>> updateSegmentGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SegmentGroupClassification
     * <p>service: updateSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupClassification")
    public ResponseEntity<Map<String, Object>> updateSegmentGroupClassification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SegmentGroupGeo
     * <p>service: updateSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupGeo")
    public ResponseEntity<Map<String, Object>> updateSegmentGroupGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SegmentGroupRole
     * <p>service: updateSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupRole")
    public ResponseEntity<Map<String, Object>> updateSegmentGroupRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a TrackingCode record
     * <p>service: updateTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/updateTrackingCode")
    public ResponseEntity<Map<String, Object>> updateTrackingCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a TrackingCodeType record
     * <p>service: updateTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/updateTrackingCodeType")
    public ResponseEntity<Map<String, Object>> updateTrackingCodeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/updateWebSiteContactList")
    public ResponseEntity<Map<String, Object>> updateWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an sales opportunity
     * <p>service: updateSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/closeSalesOpportunity")
    public ResponseEntity<Map<String, Object>> updateSalesOpportunity(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: convertLeadToContact  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/convertLead")
    public ResponseEntity<Map<String, Object>> convertLeadToContact(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Account Group
     * <p>service: createAccount  entities: PartyGroup, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createAccount")
    public ResponseEntity<Map<String, Object>> createAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createCommunicationEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEventCreateCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Contact Person
     * <p>service: createContact  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createContact")
    public ResponseEntity<Map<String, Object>> createContact(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: importVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createContactFromVCard")
    public ResponseEntity<Map<String, Object>> importVCard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sales Lead can be just a person or a person representing a company or a company (party group). createLead works 1) If person information is passed. 2) If company (party group) information is passed. 3) If Person and company (party group) information is passed.
     * <p>service: createLead  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createLead")
    public ResponseEntity<Map<String, Object>> createLead(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: importVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createLeadFromVCard")
    public ResponseEntity<Map<String, Object>> importVCardCreateLeadFromVCard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a relation between a Party and a DataSource using PartyDataSource. The userLogin must have PARTYMGR_SRC_CREATE permission.
     * <p>service: createPartyDataSource  entities: PartyDataSource  auth: true
     */
    @PostMapping("/sfa/control/createLeadPartyDataSource")
    public ResponseEntity<Map<String, Object>> createPartyDataSource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Sales Forecast for the userLogin. Requires ORDERMGR_4C_CREATE permission. This will save the forecast into the history as well. Note that this service does not compute the forecast. That must be done in a higher level service.
     * <p>service: createSalesForecast  entities: SalesForecast  auth: true
     */
    @PostMapping("/sfa/control/createSalesForecast")
    public ResponseEntity<Map<String, Object>> createSalesForecast(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Sales Forecast Detail
     * <p>service: createSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/createSalesForecastDetail")
    public ResponseEntity<Map<String, Object>> createSalesForecastDetail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an sales opportunity
     * <p>service: createSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/createSalesOpportunity")
    public ResponseEntity<Map<String, Object>> createSalesOpportunity(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: exportVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createVCardFromContact")
    public ResponseEntity<Map<String, Object>> exportVCard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Sales Forecast Detail
     * <p>service: deleteSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/deleteSalesForecastDetail")
    public ResponseEntity<Map<String, Object>> deleteSalesForecastDetail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * This service merges the contact details of two parties, partyId merges into partyIdTo
     * <p>service: mergeContacts  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/mergeContacts")
    public ResponseEntity<Map<String, Object>> mergeContacts(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Contact Person
     * <p>service: createContact  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/quickAddContact")
    public ResponseEntity<Map<String, Object>> createContactQuickAddContact(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Sales Lead can be just a person or a person representing a company or a company (party group). createLead works 1) If person information is passed. 2) If company (party group) information is passed. 3) If Person and company (party group) information is passed.
     * <p>service: createLead  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/quickAddLead")
    public ResponseEntity<Map<String, Object>> createLeadQuickAddLead(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Sales Forecast and marks it as modified by the userLogin. Requires ORDERMGR_4C_UPDATE permission. This will save the current forecast into the history before overwritting it. Note that this service does not compute the forecast. That must be done in a higher level service.
     * <p>service: updateSalesForecast  entities: SalesForecast  auth: true
     */
    @PostMapping("/sfa/control/updateSalesForecast")
    public ResponseEntity<Map<String, Object>> updateSalesForecast(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Sales Forecast Detail
     * <p>service: updateSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/updateSalesForecastDetail")
    public ResponseEntity<Map<String, Object>> updateSalesForecastDetail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an sales opportunity
     * <p>service: updateSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/updateSalesOpportunity")
    public ResponseEntity<Map<String, Object>> updateSalesOpportunityUpdateSalesOpportunity(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTaskAssigment  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/updateTaskAssigment")
    public ResponseEntity<Map<String, Object>> updateTaskAssigment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
