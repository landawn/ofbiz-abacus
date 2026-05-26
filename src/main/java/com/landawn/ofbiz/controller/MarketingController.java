package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.util.ServiceInput;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.marketing.ConvertLeadToContactRequest;
import com.landawn.ofbiz.model.marketing.ConvertLeadToContactResponse;
import com.landawn.ofbiz.model.marketing.CreateAccountRequest;
import com.landawn.ofbiz.model.marketing.CreateAccountResponse;
import com.landawn.ofbiz.model.marketing.CreateContactListPartyRequest;
import com.landawn.ofbiz.model.marketing.CreateContactListPartyResponse;
import com.landawn.ofbiz.model.marketing.CreateContactListRequest;
import com.landawn.ofbiz.model.marketing.CreateContactListResponse;
import com.landawn.ofbiz.model.marketing.CreateContactRequest;
import com.landawn.ofbiz.model.marketing.CreateContactResponse;
import com.landawn.ofbiz.model.marketing.CreateLeadRequest;
import com.landawn.ofbiz.model.marketing.CreateLeadResponse;
import com.landawn.ofbiz.model.marketing.CreateMarketingCampaignRequest;
import com.landawn.ofbiz.model.marketing.CreateMarketingCampaignResponse;
import com.landawn.ofbiz.model.marketing.CreateMarketingCampaignRoleRequest;
import com.landawn.ofbiz.model.marketing.CreateMarketingCampaignRoleResponse;
import com.landawn.ofbiz.model.marketing.CreateSalesForecastDetailRequest;
import com.landawn.ofbiz.model.marketing.CreateSalesForecastDetailResponse;
import com.landawn.ofbiz.model.marketing.CreateSalesForecastRequest;
import com.landawn.ofbiz.model.marketing.CreateSalesForecastResponse;
import com.landawn.ofbiz.model.marketing.CreateSalesOpportunityRequest;
import com.landawn.ofbiz.model.marketing.CreateSalesOpportunityResponse;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupClassificationRequest;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupClassificationResponse;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupGeoRequest;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupGeoResponse;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupRequest;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupResponse;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupRoleRequest;
import com.landawn.ofbiz.model.marketing.CreateSegmentGroupRoleResponse;
import com.landawn.ofbiz.model.marketing.CreateTrackingCodeRequest;
import com.landawn.ofbiz.model.marketing.CreateTrackingCodeResponse;
import com.landawn.ofbiz.model.marketing.CreateTrackingCodeTypeRequest;
import com.landawn.ofbiz.model.marketing.CreateTrackingCodeTypeResponse;
import com.landawn.ofbiz.model.marketing.CreateWebSiteContactListRequest;
import com.landawn.ofbiz.model.marketing.CreateWebSiteContactListResponse;
import com.landawn.ofbiz.model.marketing.DeleteContactListPartyRequest;
import com.landawn.ofbiz.model.marketing.DeleteContactListPartyResponse;
import com.landawn.ofbiz.model.marketing.DeleteMarketingCampaignRequest;
import com.landawn.ofbiz.model.marketing.DeleteMarketingCampaignResponse;
import com.landawn.ofbiz.model.marketing.DeleteMarketingCampaignRoleRequest;
import com.landawn.ofbiz.model.marketing.DeleteMarketingCampaignRoleResponse;
import com.landawn.ofbiz.model.marketing.DeleteSalesForecastDetailRequest;
import com.landawn.ofbiz.model.marketing.DeleteSalesForecastDetailResponse;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupClassificationRequest;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupClassificationResponse;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupGeoRequest;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupGeoResponse;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupRequest;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupResponse;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupRoleRequest;
import com.landawn.ofbiz.model.marketing.DeleteSegmentGroupRoleResponse;
import com.landawn.ofbiz.model.marketing.DeleteTrackingCodeRequest;
import com.landawn.ofbiz.model.marketing.DeleteTrackingCodeResponse;
import com.landawn.ofbiz.model.marketing.DeleteTrackingCodeTypeRequest;
import com.landawn.ofbiz.model.marketing.DeleteTrackingCodeTypeResponse;
import com.landawn.ofbiz.model.marketing.DeleteWebSiteContactListRequest;
import com.landawn.ofbiz.model.marketing.DeleteWebSiteContactListResponse;
import com.landawn.ofbiz.model.marketing.ExportVCardRequest;
import com.landawn.ofbiz.model.marketing.ExportVCardResponse;
import com.landawn.ofbiz.model.marketing.ImportVCardRequest;
import com.landawn.ofbiz.model.marketing.ImportVCardResponse;
import com.landawn.ofbiz.model.marketing.MergeContactsRequest;
import com.landawn.ofbiz.model.marketing.MergeContactsResponse;
import com.landawn.ofbiz.model.marketing.RemoveContactListRequest;
import com.landawn.ofbiz.model.marketing.RemoveContactListResponse;
import com.landawn.ofbiz.model.marketing.UpdateContactListPartyNoUserLoginRequest;
import com.landawn.ofbiz.model.marketing.UpdateContactListPartyNoUserLoginResponse;
import com.landawn.ofbiz.model.marketing.UpdateContactListPartyRequest;
import com.landawn.ofbiz.model.marketing.UpdateContactListPartyResponse;
import com.landawn.ofbiz.model.marketing.UpdateContactListRequest;
import com.landawn.ofbiz.model.marketing.UpdateContactListResponse;
import com.landawn.ofbiz.model.marketing.UpdateMarketingCampaignRequest;
import com.landawn.ofbiz.model.marketing.UpdateMarketingCampaignResponse;
import com.landawn.ofbiz.model.marketing.UpdateSalesForecastDetailRequest;
import com.landawn.ofbiz.model.marketing.UpdateSalesForecastDetailResponse;
import com.landawn.ofbiz.model.marketing.UpdateSalesForecastRequest;
import com.landawn.ofbiz.model.marketing.UpdateSalesForecastResponse;
import com.landawn.ofbiz.model.marketing.UpdateSalesOpportunityRequest;
import com.landawn.ofbiz.model.marketing.UpdateSalesOpportunityResponse;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupClassificationRequest;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupClassificationResponse;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupGeoRequest;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupGeoResponse;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupRequest;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupResponse;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupRoleRequest;
import com.landawn.ofbiz.model.marketing.UpdateSegmentGroupRoleResponse;
import com.landawn.ofbiz.model.marketing.UpdateTrackingCodeRequest;
import com.landawn.ofbiz.model.marketing.UpdateTrackingCodeResponse;
import com.landawn.ofbiz.model.marketing.UpdateTrackingCodeTypeRequest;
import com.landawn.ofbiz.model.marketing.UpdateTrackingCodeTypeResponse;
import com.landawn.ofbiz.model.marketing.UpdateWebSiteContactListRequest;
import com.landawn.ofbiz.model.marketing.UpdateWebSiteContactListResponse;
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

    private final com.landawn.ofbiz.service.MarketingService service;

    public MarketingController(com.landawn.ofbiz.service.MarketingService service) {
        this.service = service;
    }

    /** 200/400 routing for typed responses. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /** Convert a service-result map into a typed response and wrap. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(
            Map<String, Object> result, java.util.function.Supplier<T> factory) {
        return wrap(com.landawn.ofbiz.service.ServiceResponse.toDto(result, factory));
    }

    /** 200/400 routing for loosely-typed Map responses. */
    private static ResponseEntity<Map<String, Object>> wrapMap(Map<String, Object> result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListPartyNoUserLogin  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/contactListOptOut")
    public ResponseEntity<UpdateContactListPartyNoUserLoginResponse> updateContactListPartyNoUserLogin(@RequestBody UpdateContactListPartyNoUserLoginRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateContactListPartyNoUserLogin(ServiceInput.toMap(request));
        return wrap(result, UpdateContactListPartyNoUserLoginResponse::new);
    }

    /**
     * Create a ContactList record
     * <p>service: createContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/createContactList")
    public ResponseEntity<CreateContactListResponse> createContactList(@RequestBody CreateContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createContactList(ServiceInput.toMap(request));
        return wrap(result, CreateContactListResponse::new);
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/marketing/control/createContactListCommEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEvent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEvent(body));
    }

    /**
     * Add Party to ContactList
     * <p>service: createContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/createContactListParty")
    public ResponseEntity<CreateContactListPartyResponse> createContactListParty(@RequestBody CreateContactListPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createContactListParty(ServiceInput.toMap(request));
        return wrap(result, CreateContactListPartyResponse::new);
    }

    /**
     * Create a DataSource record
     * <p>service: createDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/createDataSource")
    public ResponseEntity<Map<String, Object>> createDataSource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createDataSource(body));
    }

    /**
     * Create a DataSourceType record
     * <p>service: createDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/createDataSourceType")
    public ResponseEntity<Map<String, Object>> createDataSourceType(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createDataSourceType(body));
    }

    /**
     * Create a MarketingCampaign record
     * <p>service: createMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/createMarketingCampaign")
    public ResponseEntity<CreateMarketingCampaignResponse> createMarketingCampaign(@RequestBody CreateMarketingCampaignRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createMarketingCampaign(ServiceInput.toMap(request));
        return wrap(result, CreateMarketingCampaignResponse::new);
    }

    /**
     * Add Role to Campaign
     * <p>service: createMarketingCampaignRole  entities: MarketingCampaignRole  auth: true
     */
    @PostMapping("/marketing/control/createMarketingCampaignRole")
    public ResponseEntity<CreateMarketingCampaignRoleResponse> createMarketingCampaignRole(@RequestBody CreateMarketingCampaignRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createMarketingCampaignRole(ServiceInput.toMap(request));
        return wrap(result, CreateMarketingCampaignRoleResponse::new);
    }

    /**
     * Create a SegmentGroup
     * <p>service: createSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroup")
    public ResponseEntity<CreateSegmentGroupResponse> createSegmentGroup(@RequestBody CreateSegmentGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSegmentGroup(ServiceInput.toMap(request));
        return wrap(result, CreateSegmentGroupResponse::new);
    }

    /**
     * Create a SegmentGroupClassification
     * <p>service: createSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupClassification")
    public ResponseEntity<CreateSegmentGroupClassificationResponse> createSegmentGroupClassification(@RequestBody CreateSegmentGroupClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSegmentGroupClassification(ServiceInput.toMap(request));
        return wrap(result, CreateSegmentGroupClassificationResponse::new);
    }

    /**
     * Create a SegmentGroupGeo
     * <p>service: createSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupGeo")
    public ResponseEntity<CreateSegmentGroupGeoResponse> createSegmentGroupGeo(@RequestBody CreateSegmentGroupGeoRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSegmentGroupGeo(ServiceInput.toMap(request));
        return wrap(result, CreateSegmentGroupGeoResponse::new);
    }

    /**
     * Create a SegmentGroupRole
     * <p>service: createSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/createSegmentGroupRole")
    public ResponseEntity<CreateSegmentGroupRoleResponse> createSegmentGroupRole(@RequestBody CreateSegmentGroupRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSegmentGroupRole(ServiceInput.toMap(request));
        return wrap(result, CreateSegmentGroupRoleResponse::new);
    }

    /**
     * Create a TrackingCode record
     * <p>service: createTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/createTrackingCode")
    public ResponseEntity<CreateTrackingCodeResponse> createTrackingCode(@RequestBody CreateTrackingCodeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createTrackingCode(ServiceInput.toMap(request));
        return wrap(result, CreateTrackingCodeResponse::new);
    }

    /**
     * Create a TrackingCodeType record
     * <p>service: createTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/createTrackingCodeType")
    public ResponseEntity<CreateTrackingCodeTypeResponse> createTrackingCodeType(@RequestBody CreateTrackingCodeTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createTrackingCodeType(ServiceInput.toMap(request));
        return wrap(result, CreateTrackingCodeTypeResponse::new);
    }

    /**
     * No description.
     * <p>service: createWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/createWebSiteContactList")
    public ResponseEntity<CreateWebSiteContactListResponse> createWebSiteContactList(@RequestBody CreateWebSiteContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createWebSiteContactList(ServiceInput.toMap(request));
        return wrap(result, CreateWebSiteContactListResponse::new);
    }

    /**
     * Delete a DataSource record
     * <p>service: deleteDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/deleteDataSource")
    public ResponseEntity<Map<String, Object>> deleteDataSource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteDataSource(body));
    }

    /**
     * Delete a DataSourceType record
     * <p>service: deleteDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/deleteDataSourceType")
    public ResponseEntity<Map<String, Object>> deleteDataSourceType(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteDataSourceType(body));
    }

    /**
     * Delete a SegmentGroup
     * <p>service: deleteSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroup")
    public ResponseEntity<DeleteSegmentGroupResponse> deleteSegmentGroup(@RequestBody DeleteSegmentGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteSegmentGroup(ServiceInput.toMap(request));
        return wrap(result, DeleteSegmentGroupResponse::new);
    }

    /**
     * Delete a SegmentGroupClassification
     * <p>service: deleteSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupClassification")
    public ResponseEntity<DeleteSegmentGroupClassificationResponse> deleteSegmentGroupClassification(@RequestBody DeleteSegmentGroupClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteSegmentGroupClassification(ServiceInput.toMap(request));
        return wrap(result, DeleteSegmentGroupClassificationResponse::new);
    }

    /**
     * Delete a SegmentGroupGeo
     * <p>service: deleteSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupGeo")
    public ResponseEntity<DeleteSegmentGroupGeoResponse> deleteSegmentGroupGeo(@RequestBody DeleteSegmentGroupGeoRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteSegmentGroupGeo(ServiceInput.toMap(request));
        return wrap(result, DeleteSegmentGroupGeoResponse::new);
    }

    /**
     * Delete a SegmentGroupRole
     * <p>service: deleteSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/deleteSegmentGroupRole")
    public ResponseEntity<DeleteSegmentGroupRoleResponse> deleteSegmentGroupRole(@RequestBody DeleteSegmentGroupRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteSegmentGroupRole(ServiceInput.toMap(request));
        return wrap(result, DeleteSegmentGroupRoleResponse::new);
    }

    /**
     * Delete a TrackingCode record
     * <p>service: deleteTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/deleteTrackingCode")
    public ResponseEntity<DeleteTrackingCodeResponse> deleteTrackingCode(@RequestBody DeleteTrackingCodeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteTrackingCode(ServiceInput.toMap(request));
        return wrap(result, DeleteTrackingCodeResponse::new);
    }

    /**
     * Update a TrackingCodeType record
     * <p>service: deleteTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/deleteTrackingCodeType")
    public ResponseEntity<DeleteTrackingCodeTypeResponse> deleteTrackingCodeType(@RequestBody DeleteTrackingCodeTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteTrackingCodeType(ServiceInput.toMap(request));
        return wrap(result, DeleteTrackingCodeTypeResponse::new);
    }

    /**
     * No description.
     * <p>service: deleteWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/deleteWebSiteContactList")
    public ResponseEntity<DeleteWebSiteContactListResponse> deleteWebSiteContactList(@RequestBody DeleteWebSiteContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteWebSiteContactList(ServiceInput.toMap(request));
        return wrap(result, DeleteWebSiteContactListResponse::new);
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/expireContactListParty")
    public ResponseEntity<UpdateContactListPartyResponse> updateContactListParty(@RequestBody UpdateContactListPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateContactListParty(ServiceInput.toMap(request));
        return wrap(result, UpdateContactListPartyResponse::new);
    }

    /**
     * No description.
     * <p>service: importContactListParties  entities: unknown  auth: true
     */
    @GetMapping("/marketing/control/importContactListParties")
    public ResponseEntity<Map<String, Object>> importContactListParties(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.importContactListParties(java.util.Map.copyOf(params)));
    }

    /**
     * Remove a ContactList record
     * <p>service: removeContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/removeContactList")
    public ResponseEntity<RemoveContactListResponse> removeContactList(@RequestBody RemoveContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeContactList(ServiceInput.toMap(request));
        return wrap(result, RemoveContactListResponse::new);
    }

    /**
     * Delete a Communication Event, optionally delete the attached content and dataresource
     * <p>service: deleteCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/marketing/control/removeContactListCommEvent")
    public ResponseEntity<Map<String, Object>> deleteCommunicationEvent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteCommunicationEvent(body));
    }

    /**
     * Remove Party from ContactList
     * <p>service: deleteContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/removeContactListParty")
    public ResponseEntity<DeleteContactListPartyResponse> deleteContactListParty(@RequestBody DeleteContactListPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteContactListParty(ServiceInput.toMap(request));
        return wrap(result, DeleteContactListPartyResponse::new);
    }

    /**
     * Remove a MarketingCampaign record
     * <p>service: deleteMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/removeMarketingCampaign")
    public ResponseEntity<DeleteMarketingCampaignResponse> deleteMarketingCampaign(@RequestBody DeleteMarketingCampaignRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteMarketingCampaign(ServiceInput.toMap(request));
        return wrap(result, DeleteMarketingCampaignResponse::new);
    }

    /**
     * Remove Role from Campaign
     * <p>service: deleteMarketingCampaignRole  entities: MarketingCampaignRole  auth: true
     */
    @PostMapping("/marketing/control/removeMarketingCampaignRole")
    public ResponseEntity<DeleteMarketingCampaignRoleResponse> deleteMarketingCampaignRole(@RequestBody DeleteMarketingCampaignRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteMarketingCampaignRole(ServiceInput.toMap(request));
        return wrap(result, DeleteMarketingCampaignRoleResponse::new);
    }

    /**
     * Update a ContactList record
     * <p>service: updateContactList  entities: ContactList  auth: true
     */
    @PostMapping("/marketing/control/updateContactList")
    public ResponseEntity<UpdateContactListResponse> updateContactList(@RequestBody UpdateContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateContactList(ServiceInput.toMap(request));
        return wrap(result, UpdateContactListResponse::new);
    }

    /**
     * Update a Communication Event
     * <p>service: updateCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/marketing/control/updateContactListCommEvent")
    public ResponseEntity<Map<String, Object>> updateCommunicationEvent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateCommunicationEvent(body));
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/marketing/control/updateContactListParty")
    public ResponseEntity<UpdateContactListPartyResponse> updateContactListPartyUpdateContactListParty(@RequestBody UpdateContactListPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateContactListParty(ServiceInput.toMap(request));
        return wrap(result, UpdateContactListPartyResponse::new);
    }

    /**
     * Update a DataSource record
     * <p>service: updateDataSource  entities: DataSource  auth: true
     */
    @PostMapping("/marketing/control/updateDataSource")
    public ResponseEntity<Map<String, Object>> updateDataSource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateDataSource(body));
    }

    /**
     * Update a DataSourceType record
     * <p>service: updateDataSourceType  entities: DataSourceType  auth: true
     */
    @PostMapping("/marketing/control/updateDataSourceType")
    public ResponseEntity<Map<String, Object>> updateDataSourceType(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateDataSourceType(body));
    }

    /**
     * Update a MarketingCampaign record
     * <p>service: updateMarketingCampaign  entities: MarketingCampaign  auth: true
     */
    @PostMapping("/marketing/control/updateMarketingCampaign")
    public ResponseEntity<UpdateMarketingCampaignResponse> updateMarketingCampaign(@RequestBody UpdateMarketingCampaignRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateMarketingCampaign(ServiceInput.toMap(request));
        return wrap(result, UpdateMarketingCampaignResponse::new);
    }

    /**
     * Update a SegmentGroup
     * <p>service: updateSegmentGroup  entities: SegmentGroup  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroup")
    public ResponseEntity<UpdateSegmentGroupResponse> updateSegmentGroup(@RequestBody UpdateSegmentGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSegmentGroup(ServiceInput.toMap(request));
        return wrap(result, UpdateSegmentGroupResponse::new);
    }

    /**
     * Update a SegmentGroupClassification
     * <p>service: updateSegmentGroupClassification  entities: SegmentGroupClassification  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupClassification")
    public ResponseEntity<UpdateSegmentGroupClassificationResponse> updateSegmentGroupClassification(@RequestBody UpdateSegmentGroupClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSegmentGroupClassification(ServiceInput.toMap(request));
        return wrap(result, UpdateSegmentGroupClassificationResponse::new);
    }

    /**
     * Update a SegmentGroupGeo
     * <p>service: updateSegmentGroupGeo  entities: SegmentGroupGeo  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupGeo")
    public ResponseEntity<UpdateSegmentGroupGeoResponse> updateSegmentGroupGeo(@RequestBody UpdateSegmentGroupGeoRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSegmentGroupGeo(ServiceInput.toMap(request));
        return wrap(result, UpdateSegmentGroupGeoResponse::new);
    }

    /**
     * Update a SegmentGroupRole
     * <p>service: updateSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/marketing/control/updateSegmentGroupRole")
    public ResponseEntity<UpdateSegmentGroupRoleResponse> updateSegmentGroupRole(@RequestBody UpdateSegmentGroupRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSegmentGroupRole(ServiceInput.toMap(request));
        return wrap(result, UpdateSegmentGroupRoleResponse::new);
    }

    /**
     * Update a TrackingCode record
     * <p>service: updateTrackingCode  entities: TrackingCode  auth: true
     */
    @PostMapping("/marketing/control/updateTrackingCode")
    public ResponseEntity<UpdateTrackingCodeResponse> updateTrackingCode(@RequestBody UpdateTrackingCodeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateTrackingCode(ServiceInput.toMap(request));
        return wrap(result, UpdateTrackingCodeResponse::new);
    }

    /**
     * Update a TrackingCodeType record
     * <p>service: updateTrackingCodeType  entities: TrackingCodeType  auth: true
     */
    @PostMapping("/marketing/control/updateTrackingCodeType")
    public ResponseEntity<UpdateTrackingCodeTypeResponse> updateTrackingCodeType(@RequestBody UpdateTrackingCodeTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateTrackingCodeType(ServiceInput.toMap(request));
        return wrap(result, UpdateTrackingCodeTypeResponse::new);
    }

    /**
     * No description.
     * <p>service: updateWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/marketing/control/updateWebSiteContactList")
    public ResponseEntity<UpdateWebSiteContactListResponse> updateWebSiteContactList(@RequestBody UpdateWebSiteContactListRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateWebSiteContactList(ServiceInput.toMap(request));
        return wrap(result, UpdateWebSiteContactListResponse::new);
    }

    /**
     * Update an sales opportunity
     * <p>service: updateSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/closeSalesOpportunity")
    public ResponseEntity<UpdateSalesOpportunityResponse> updateSalesOpportunity(@RequestBody UpdateSalesOpportunityRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSalesOpportunity(ServiceInput.toMap(request));
        return wrap(result, UpdateSalesOpportunityResponse::new);
    }

    /**
     * No description.
     * <p>service: convertLeadToContact  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/convertLead")
    public ResponseEntity<ConvertLeadToContactResponse> convertLeadToContact(@RequestBody ConvertLeadToContactRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.convertLeadToContact(ServiceInput.toMap(request));
        return wrap(result, ConvertLeadToContactResponse::new);
    }

    /**
     * Create an Account Group
     * <p>service: createAccount  entities: PartyGroup, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createAccount")
    public ResponseEntity<CreateAccountResponse> createAccount(@RequestBody CreateAccountRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createAccount(ServiceInput.toMap(request));
        return wrap(result, CreateAccountResponse::new);
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createCommunicationEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEventCreateCommunicationEvent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEvent(body));
    }

    /**
     * Create a Contact Person
     * <p>service: createContact  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createContact")
    public ResponseEntity<CreateContactResponse> createContact(@RequestBody CreateContactRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createContact(ServiceInput.toMap(request));
        return wrap(result, CreateContactResponse::new);
    }

    /**
     * No description.
     * <p>service: importVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createContactFromVCard")
    public ResponseEntity<ImportVCardResponse> importVCard(@RequestBody ImportVCardRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.importVCard(ServiceInput.toMap(request));
        return wrap(result, ImportVCardResponse::new);
    }

    /**
     * Sales Lead can be just a person or a person representing a company or a company (party group). createLead works 1) If person information is passed. 2) If company (party group) information is passed. 3) If Person and company (party group) information is passed.
     * <p>service: createLead  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/createLead")
    public ResponseEntity<CreateLeadResponse> createLead(@RequestBody CreateLeadRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createLead(ServiceInput.toMap(request));
        return wrap(result, CreateLeadResponse::new);
    }

    /**
     * No description.
     * <p>service: importVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createLeadFromVCard")
    public ResponseEntity<ImportVCardResponse> importVCardCreateLeadFromVCard(@RequestBody ImportVCardRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.importVCard(ServiceInput.toMap(request));
        return wrap(result, ImportVCardResponse::new);
    }

    /**
     * Creates a relation between a Party and a DataSource using PartyDataSource. The userLogin must have PARTYMGR_SRC_CREATE permission.
     * <p>service: createPartyDataSource  entities: PartyDataSource  auth: true
     */
    @PostMapping("/sfa/control/createLeadPartyDataSource")
    public ResponseEntity<Map<String, Object>> createPartyDataSource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyDataSource(body));
    }

    /**
     * Creates a Sales Forecast for the userLogin. Requires ORDERMGR_4C_CREATE permission. This will save the forecast into the history as well. Note that this service does not compute the forecast. That must be done in a higher level service.
     * <p>service: createSalesForecast  entities: SalesForecast  auth: true
     */
    @PostMapping("/sfa/control/createSalesForecast")
    public ResponseEntity<CreateSalesForecastResponse> createSalesForecast(@RequestBody CreateSalesForecastRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSalesForecast(ServiceInput.toMap(request));
        return wrap(result, CreateSalesForecastResponse::new);
    }

    /**
     * Creates a Sales Forecast Detail
     * <p>service: createSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/createSalesForecastDetail")
    public ResponseEntity<CreateSalesForecastDetailResponse> createSalesForecastDetail(@RequestBody CreateSalesForecastDetailRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSalesForecastDetail(ServiceInput.toMap(request));
        return wrap(result, CreateSalesForecastDetailResponse::new);
    }

    /**
     * Create an sales opportunity
     * <p>service: createSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/createSalesOpportunity")
    public ResponseEntity<CreateSalesOpportunityResponse> createSalesOpportunity(@RequestBody CreateSalesOpportunityRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createSalesOpportunity(ServiceInput.toMap(request));
        return wrap(result, CreateSalesOpportunityResponse::new);
    }

    /**
     * No description.
     * <p>service: exportVCard  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/createVCardFromContact")
    public ResponseEntity<ExportVCardResponse> exportVCard(@RequestBody ExportVCardRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.exportVCard(ServiceInput.toMap(request));
        return wrap(result, ExportVCardResponse::new);
    }

    /**
     * Delete a Sales Forecast Detail
     * <p>service: deleteSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/deleteSalesForecastDetail")
    public ResponseEntity<DeleteSalesForecastDetailResponse> deleteSalesForecastDetail(@RequestBody DeleteSalesForecastDetailRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteSalesForecastDetail(ServiceInput.toMap(request));
        return wrap(result, DeleteSalesForecastDetailResponse::new);
    }

    /**
     * This service merges the contact details of two parties, partyId merges into partyIdTo
     * <p>service: mergeContacts  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/mergeContacts")
    public ResponseEntity<MergeContactsResponse> mergeContacts(@RequestBody MergeContactsRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.mergeContacts(ServiceInput.toMap(request));
        return wrap(result, MergeContactsResponse::new);
    }

    /**
     * Create a Contact Person
     * <p>service: createContact  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/quickAddContact")
    public ResponseEntity<CreateContactResponse> createContactQuickAddContact(@RequestBody CreateContactRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createContact(ServiceInput.toMap(request));
        return wrap(result, CreateContactResponse::new);
    }

    /**
     * Sales Lead can be just a person or a person representing a company or a company (party group). createLead works 1) If person information is passed. 2) If company (party group) information is passed. 3) If Person and company (party group) information is passed.
     * <p>service: createLead  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/sfa/control/quickAddLead")
    public ResponseEntity<CreateLeadResponse> createLeadQuickAddLead(@RequestBody CreateLeadRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createLead(ServiceInput.toMap(request));
        return wrap(result, CreateLeadResponse::new);
    }

    /**
     * Updates a Sales Forecast and marks it as modified by the userLogin. Requires ORDERMGR_4C_UPDATE permission. This will save the current forecast into the history before overwritting it. Note that this service does not compute the forecast. That must be done in a higher level service.
     * <p>service: updateSalesForecast  entities: SalesForecast  auth: true
     */
    @PostMapping("/sfa/control/updateSalesForecast")
    public ResponseEntity<UpdateSalesForecastResponse> updateSalesForecast(@RequestBody UpdateSalesForecastRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSalesForecast(ServiceInput.toMap(request));
        return wrap(result, UpdateSalesForecastResponse::new);
    }

    /**
     * Updates a Sales Forecast Detail
     * <p>service: updateSalesForecastDetail  entities: SalesForecastDetail  auth: true
     */
    @PostMapping("/sfa/control/updateSalesForecastDetail")
    public ResponseEntity<UpdateSalesForecastDetailResponse> updateSalesForecastDetail(@RequestBody UpdateSalesForecastDetailRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSalesForecastDetail(ServiceInput.toMap(request));
        return wrap(result, UpdateSalesForecastDetailResponse::new);
    }

    /**
     * Update an sales opportunity
     * <p>service: updateSalesOpportunity  entities: SalesOpportunity  auth: true
     */
    @PostMapping("/sfa/control/updateSalesOpportunity")
    public ResponseEntity<UpdateSalesOpportunityResponse> updateSalesOpportunityUpdateSalesOpportunity(@RequestBody UpdateSalesOpportunityRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateSalesOpportunity(ServiceInput.toMap(request));
        return wrap(result, UpdateSalesOpportunityResponse::new);
    }

    /**
     * No description.
     * <p>service: updateTaskAssigment  entities: unknown  auth: true
     */
    @PostMapping("/sfa/control/updateTaskAssigment")
    public ResponseEntity<Map<String, Object>> updateTaskAssigment(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateTaskAssigment(body));
    }
}
