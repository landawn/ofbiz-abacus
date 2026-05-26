package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.util.ServiceInput;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.party.ClearAddressMatchMapRequest;
import com.landawn.ofbiz.model.party.ClearAddressMatchMapResponse;
import com.landawn.ofbiz.model.party.CreateAddressMatchMapRequest;
import com.landawn.ofbiz.model.party.CreateAddressMatchMapResponse;
import com.landawn.ofbiz.model.party.CreateCommEventWorkEffortRequest;
import com.landawn.ofbiz.model.party.CreateCommEventWorkEffortResponse;
import com.landawn.ofbiz.model.party.CreateCommunicationEventPurposeRequest;
import com.landawn.ofbiz.model.party.CreateCommunicationEventPurposeResponse;
import com.landawn.ofbiz.model.party.CreateCommunicationEventRequest;
import com.landawn.ofbiz.model.party.CreateCommunicationEventResponse;
import com.landawn.ofbiz.model.party.CreateCommunicationEventRoleRequest;
import com.landawn.ofbiz.model.party.CreateCommunicationEventRoleResponse;
import com.landawn.ofbiz.model.party.CreateMaritalStatusRequest;
import com.landawn.ofbiz.model.party.CreateMaritalStatusResponse;
import com.landawn.ofbiz.model.party.CreateMaritalStatusTypeRequest;
import com.landawn.ofbiz.model.party.CreateMaritalStatusTypeResponse;
import com.landawn.ofbiz.model.party.CreatePartyAttributeRequest;
import com.landawn.ofbiz.model.party.CreatePartyAttributeResponse;
import com.landawn.ofbiz.model.party.CreatePartyCarrierAccountRequest;
import com.landawn.ofbiz.model.party.CreatePartyCarrierAccountResponse;
import com.landawn.ofbiz.model.party.CreatePartyClassificationGroupRequest;
import com.landawn.ofbiz.model.party.CreatePartyClassificationGroupResponse;
import com.landawn.ofbiz.model.party.CreatePartyClassificationRequest;
import com.landawn.ofbiz.model.party.CreatePartyClassificationResponse;
import com.landawn.ofbiz.model.party.CreatePartyContactMechPurposeRequest;
import com.landawn.ofbiz.model.party.CreatePartyContactMechPurposeResponse;
import com.landawn.ofbiz.model.party.CreatePartyContactMechRequest;
import com.landawn.ofbiz.model.party.CreatePartyContactMechResponse;
import com.landawn.ofbiz.model.party.CreatePartyContentResponse;
import com.landawn.ofbiz.model.party.CreatePartyEmailAddressRequest;
import com.landawn.ofbiz.model.party.CreatePartyEmailAddressResponse;
import com.landawn.ofbiz.model.party.CreatePartyFtpAddressRequest;
import com.landawn.ofbiz.model.party.CreatePartyFtpAddressResponse;
import com.landawn.ofbiz.model.party.CreatePartyGroupRequest;
import com.landawn.ofbiz.model.party.CreatePartyGroupResponse;
import com.landawn.ofbiz.model.party.CreatePartyIdentificationRequest;
import com.landawn.ofbiz.model.party.CreatePartyIdentificationResponse;
import com.landawn.ofbiz.model.party.CreatePartyInvitationGroupAssocRequest;
import com.landawn.ofbiz.model.party.CreatePartyInvitationGroupAssocResponse;
import com.landawn.ofbiz.model.party.CreatePartyInvitationRequest;
import com.landawn.ofbiz.model.party.CreatePartyInvitationResponse;
import com.landawn.ofbiz.model.party.CreatePartyInvitationRoleAssocRequest;
import com.landawn.ofbiz.model.party.CreatePartyInvitationRoleAssocResponse;
import com.landawn.ofbiz.model.party.CreatePartyNoteRequest;
import com.landawn.ofbiz.model.party.CreatePartyNoteResponse;
import com.landawn.ofbiz.model.party.CreatePartyPostalAddressRequest;
import com.landawn.ofbiz.model.party.CreatePartyPostalAddressResponse;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipAndRoleRequest;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipAndRoleResponse;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipContactAccountRequest;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipContactAccountResponse;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipRequest;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipResponse;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipTypeRequest;
import com.landawn.ofbiz.model.party.CreatePartyRelationshipTypeResponse;
import com.landawn.ofbiz.model.party.CreatePartyRoleRequest;
import com.landawn.ofbiz.model.party.CreatePartyRoleResponse;
import com.landawn.ofbiz.model.party.CreatePartyTelecomNumberRequest;
import com.landawn.ofbiz.model.party.CreatePartyTelecomNumberResponse;
import com.landawn.ofbiz.model.party.CreatePersonRequest;
import com.landawn.ofbiz.model.party.CreatePersonResponse;
import com.landawn.ofbiz.model.party.CreateRoleTypeRequest;
import com.landawn.ofbiz.model.party.CreateRoleTypeResponse;
import com.landawn.ofbiz.model.party.CreateVendorRequest;
import com.landawn.ofbiz.model.party.CreateVendorResponse;
import com.landawn.ofbiz.model.party.DeleteCommunicationEventRequest;
import com.landawn.ofbiz.model.party.DeleteCommunicationEventResponse;
import com.landawn.ofbiz.model.party.DeleteMaritalStatusRequest;
import com.landawn.ofbiz.model.party.DeleteMaritalStatusResponse;
import com.landawn.ofbiz.model.party.DeletePartyClassificationGroupRequest;
import com.landawn.ofbiz.model.party.DeletePartyClassificationGroupResponse;
import com.landawn.ofbiz.model.party.DeletePartyClassificationRequest;
import com.landawn.ofbiz.model.party.DeletePartyClassificationResponse;
import com.landawn.ofbiz.model.party.DeletePartyContactMechRequest;
import com.landawn.ofbiz.model.party.DeletePartyContactMechResponse;
import com.landawn.ofbiz.model.party.DeletePartyIdentificationRequest;
import com.landawn.ofbiz.model.party.DeletePartyIdentificationResponse;
import com.landawn.ofbiz.model.party.DeletePartyInvitationGroupAssocRequest;
import com.landawn.ofbiz.model.party.DeletePartyInvitationGroupAssocResponse;
import com.landawn.ofbiz.model.party.DeletePartyInvitationRequest;
import com.landawn.ofbiz.model.party.DeletePartyInvitationResponse;
import com.landawn.ofbiz.model.party.DeletePartyInvitationRoleAssocRequest;
import com.landawn.ofbiz.model.party.DeletePartyInvitationRoleAssocResponse;
import com.landawn.ofbiz.model.party.DeletePartyRelationshipRequest;
import com.landawn.ofbiz.model.party.DeletePartyRelationshipResponse;
import com.landawn.ofbiz.model.party.DeletePartyRoleRequest;
import com.landawn.ofbiz.model.party.DeletePartyRoleResponse;
import com.landawn.ofbiz.model.party.ExpirePartyContactMechPurposeRequest;
import com.landawn.ofbiz.model.party.ExpirePartyContactMechPurposeResponse;
import com.landawn.ofbiz.model.party.ImportAddressMatchMapCsvRequest;
import com.landawn.ofbiz.model.party.ImportAddressMatchMapCsvResponse;
import com.landawn.ofbiz.model.party.ImportPartyRequest;
import com.landawn.ofbiz.model.party.ImportPartyResponse;
import com.landawn.ofbiz.model.party.LinkPartyRecordRequest;
import com.landawn.ofbiz.model.party.LinkPartyRecordResponse;
import com.landawn.ofbiz.model.party.RemoveAddressMatchMapRequest;
import com.landawn.ofbiz.model.party.RemoveAddressMatchMapResponse;
import com.landawn.ofbiz.model.party.RemoveCommunicationEventPurposeRequest;
import com.landawn.ofbiz.model.party.RemoveCommunicationEventPurposeResponse;
import com.landawn.ofbiz.model.party.RemoveCommunicationEventRoleRequest;
import com.landawn.ofbiz.model.party.RemoveCommunicationEventRoleResponse;
import com.landawn.ofbiz.model.party.RemovePartyAttributeRequest;
import com.landawn.ofbiz.model.party.RemovePartyAttributeResponse;
import com.landawn.ofbiz.model.party.RemovePartyContentRequest;
import com.landawn.ofbiz.model.party.RemovePartyContentResponse;
import com.landawn.ofbiz.model.party.SetCommunicationEventRoleStatusRequest;
import com.landawn.ofbiz.model.party.SetCommunicationEventRoleStatusResponse;
import com.landawn.ofbiz.model.party.UpdateCommunicationEventRequest;
import com.landawn.ofbiz.model.party.UpdateCommunicationEventResponse;
import com.landawn.ofbiz.model.party.UpdateMaritalStatusRequest;
import com.landawn.ofbiz.model.party.UpdateMaritalStatusResponse;
import com.landawn.ofbiz.model.party.UpdatePartyAttributeRequest;
import com.landawn.ofbiz.model.party.UpdatePartyAttributeResponse;
import com.landawn.ofbiz.model.party.UpdatePartyCarrierAccountRequest;
import com.landawn.ofbiz.model.party.UpdatePartyCarrierAccountResponse;
import com.landawn.ofbiz.model.party.UpdatePartyClassificationGroupRequest;
import com.landawn.ofbiz.model.party.UpdatePartyClassificationGroupResponse;
import com.landawn.ofbiz.model.party.UpdatePartyClassificationRequest;
import com.landawn.ofbiz.model.party.UpdatePartyClassificationResponse;
import com.landawn.ofbiz.model.party.UpdatePartyContactMechRequest;
import com.landawn.ofbiz.model.party.UpdatePartyContactMechResponse;
import com.landawn.ofbiz.model.party.UpdatePartyContentResponse;
import com.landawn.ofbiz.model.party.UpdatePartyEmailAddressRequest;
import com.landawn.ofbiz.model.party.UpdatePartyEmailAddressResponse;
import com.landawn.ofbiz.model.party.UpdatePartyFtpAddressRequest;
import com.landawn.ofbiz.model.party.UpdatePartyFtpAddressResponse;
import com.landawn.ofbiz.model.party.UpdatePartyGroupRequest;
import com.landawn.ofbiz.model.party.UpdatePartyGroupResponse;
import com.landawn.ofbiz.model.party.UpdatePartyIdentificationRequest;
import com.landawn.ofbiz.model.party.UpdatePartyIdentificationResponse;
import com.landawn.ofbiz.model.party.UpdatePartyInvitationRequest;
import com.landawn.ofbiz.model.party.UpdatePartyInvitationResponse;
import com.landawn.ofbiz.model.party.UpdatePartyPostalAddressRequest;
import com.landawn.ofbiz.model.party.UpdatePartyPostalAddressResponse;
import com.landawn.ofbiz.model.party.UpdatePartyRelationshipRequest;
import com.landawn.ofbiz.model.party.UpdatePartyRelationshipResponse;
import com.landawn.ofbiz.model.party.UpdatePartyTelecomNumberRequest;
import com.landawn.ofbiz.model.party.UpdatePartyTelecomNumberResponse;
import com.landawn.ofbiz.model.party.UpdatePersonRequest;
import com.landawn.ofbiz.model.party.UpdatePersonResponse;
import com.landawn.ofbiz.model.party.UpdateVendorRequest;
import com.landawn.ofbiz.model.party.UpdateVendorResponse;
import com.landawn.ofbiz.model.party.UploadPartyContentFileRequest;
import com.landawn.ofbiz.model.party.UploadPartyContentFileResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/party")
public class PartyController {

    private final com.landawn.ofbiz.service.PartyService service;

    public PartyController(com.landawn.ofbiz.service.PartyService service) {
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
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/NewDraftCommunicationEvent")
    public ResponseEntity<CreateCommunicationEventResponse> createCommunicationEvent(@RequestBody CreateCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, CreateCommunicationEventResponse::new);
    }

    /**
     * Add a UserLogin to a SecurityGroup
     * <p>service: addUserLoginToSecurityGroup  entities: UserLoginSecurityGroup  auth: true
     */
    @PostMapping("/partymgr/control/ProfileAddUserLoginToSecurityGroup")
    public ResponseEntity<Map<String, Object>> addUserLoginToSecurityGroup(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.addUserLoginToSecurityGroup(body));
    }

    /**
     * Create a UserLogin
     * <p>service: createUserLogin  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/ProfileCreateUserLogin")
    public ResponseEntity<Map<String, Object>> createUserLogin(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createUserLogin(body));
    }

    /**
     * Expire UserLoginSecurityGroup
     * <p>service: expireUserLoginSecurityGroup  entities: UserLoginSecurityGroup  auth: true
     */
    @PostMapping("/partymgr/control/ProfileExpireUserLoginFromSecurityGroup")
    public ResponseEntity<Map<String, Object>> expireUserLoginSecurityGroup(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.expireUserLoginSecurityGroup(body));
    }

    /**
     * No description.
     * <p>service: updatePassword  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/ProfileUpdatePassword")
    public ResponseEntity<Map<String, Object>> updatePassword(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updatePassword(java.util.Map.copyOf(params)));
    }

    /**
     * Update UserLogin Security Settings
     * <p>service: updateUserLoginSecurity  entities: UserLogin  auth: true
     */
    @PostMapping("/partymgr/control/ProfileUpdateUserLoginSecurity")
    public ResponseEntity<Map<String, Object>> updateUserLoginSecurity(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateUserLoginSecurity(body));
    }

    /**
     * Update a UserLogin to SecurityGroup Appl
     * <p>service: updateUserLoginToSecurityGroup  entities: UserLoginSecurityGroup  auth: true
     */
    @PostMapping("/partymgr/control/ProfileUpdateUserLoginToSecurityGroup")
    public ResponseEntity<Map<String, Object>> updateUserLoginToSecurityGroup(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateUserLoginToSecurityGroup(body));
    }

    /**
     * Remove a Communication Event Role
     * <p>service: removeCommunicationEventRole  entities: CommunicationEventRole  auth: true
     */
    @PostMapping("/partymgr/control/RemoveCommunicationEventRole")
    public ResponseEntity<RemoveCommunicationEventRoleResponse> removeCommunicationEventRole(@RequestBody RemoveCommunicationEventRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCommunicationEventRole(ServiceInput.toMap(request));
        return wrap(result, RemoveCommunicationEventRoleResponse::new);
    }

    /**
     * No description.
     * <p>service: addBulkFromCart  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/addBulkToShoppingList")
    public ResponseEntity<Map<String, Object>> addBulkFromCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addBulkFromCart(java.util.Map.copyOf(params)));
    }

    /**
     * Create a shopping list item
     * <p>service: createShoppingListItem  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/addItemToShoppingList")
    public ResponseEntity<Map<String, Object>> createShoppingListItem(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createShoppingListItem(body));
    }

    /**
     * No description.
     * <p>service: addListToCart  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/addListToCart")
    public ResponseEntity<Map<String, Object>> addListToCart(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addListToCart(java.util.Map.copyOf(params)));
    }

    /**
     * Create a Party Role (add a Role to a Party). The logged in user must have PARTYMGR_CREATE or have permission to change the role of this partyId
     * <p>service: createPartyRole  entities: PartyRole  auth: true
     */
    @PostMapping("/partymgr/control/addrole")
    public ResponseEntity<CreatePartyRoleResponse> createPartyRole(@RequestBody CreatePartyRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyRole(ServiceInput.toMap(request));
        return wrap(result, CreatePartyRoleResponse::new);
    }

    /**
     * Update a PartyGroup
     * <p>service: updatePartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/partymgr/control/ajaxUpdatePartyGroup")
    public ResponseEntity<UpdatePartyGroupResponse> updatePartyGroup(@RequestBody UpdatePartyGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyGroup(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyGroupResponse::new);
    }

    /**
     * No description.
     * <p>service: allocateMsgToParty  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/allocateMsgToParty")
    public ResponseEntity<Map<String, Object>> allocateMsgToParty(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.allocateMsgToParty(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createServiceCredit  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/applyServiceCredit")
    public ResponseEntity<Map<String, Object>> createServiceCredit(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createServiceCredit(body));
    }

    /**
     * No description.
     * <p>service: markCommunicationAsRead  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/ceimages")
    public ResponseEntity<Map<String, Object>> markCommunicationAsRead(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.markCommunicationAsRead(java.util.Map.copyOf(params)));
    }

    /**
     * Delete an AddressMatchMap record
     * <p>service: clearAddressMatchMap  entities: AddressMatchMap  auth: true
     */
    @PostMapping("/partymgr/control/clearAddressMatchMap")
    public ResponseEntity<ClearAddressMatchMapResponse> clearAddressMatchMap(@RequestBody ClearAddressMatchMapRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.clearAddressMatchMap(ServiceInput.toMap(request));
        return wrap(result, ClearAddressMatchMapResponse::new);
    }

    /**
     * Create an AddressMatchMap record
     * <p>service: createAddressMatchMap  entities: AddressMatchMap  auth: true
     */
    @PostMapping("/partymgr/control/createAddressMatchMap")
    public ResponseEntity<CreateAddressMatchMapResponse> createAddressMatchMap(@RequestBody CreateAddressMatchMapRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createAddressMatchMap(ServiceInput.toMap(request));
        return wrap(result, CreateAddressMatchMapResponse::new);
    }

    /**
     * Create a Billing Account
     * <p>service: createBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/partymgr/control/createBillingAccount")
    public ResponseEntity<Map<String, Object>> createBillingAccount(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createBillingAccount(body));
    }

    /**
     * No description.
     * <p>service: createBillingAccountAndRole  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createBillingAccountAndRole")
    public ResponseEntity<Map<String, Object>> createBillingAccountAndRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createBillingAccountAndRole(body));
    }

    /**
     * No description.
     * <p>service: createCheckAccount  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createCheckForParty")
    public ResponseEntity<Map<String, Object>> createCheckAccount(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCheckAccount(java.util.Map.copyOf(params)));
    }

    /**
     * Create CommunicationEvent and Content
     * <p>service: createCommContentDataResource  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createCommContentDataResource")
    public ResponseEntity<Map<String, Object>> createCommContentDataResource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommContentDataResource(body));
    }

    /**
     * Creates a WorkEffort entity and CommunicationEventWorkEff
     * <p>service: createCommEventWorkEffort  entities: CommunicationEventWorkEff, WorkEffort  auth: true
     */
    @PostMapping("/partymgr/control/createCommEventWorkEffort")
    public ResponseEntity<CreateCommEventWorkEffortResponse> createCommEventWorkEffort(@RequestBody CreateCommEventWorkEffortRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCommEventWorkEffort(ServiceInput.toMap(request));
        return wrap(result, CreateCommEventWorkEffortResponse::new);
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEvent")
    public ResponseEntity<CreateCommunicationEventResponse> createCommunicationEventCreateCommunicationEvent(@RequestBody CreateCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, CreateCommunicationEventResponse::new);
    }

    /**
     * Create a Communication Event Order
     * <p>service: createCommunicationEventOrder  entities: CommunicationEventOrder  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEventOrder")
    public ResponseEntity<Map<String, Object>> createCommunicationEventOrder(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEventOrder(body));
    }

    /**
     * Create a Communication Event Product
     * <p>service: createCommunicationEventProduct  entities: CommunicationEventProduct  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEventProduct")
    public ResponseEntity<Map<String, Object>> createCommunicationEventProduct(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEventProduct(body));
    }

    /**
     * Create a Communication Event Purpose
     * <p>service: createCommunicationEventPurpose  entities: CommunicationEventPurpose  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEventPurpose")
    public ResponseEntity<CreateCommunicationEventPurposeResponse> createCommunicationEventPurpose(@RequestBody CreateCommunicationEventPurposeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCommunicationEventPurpose(ServiceInput.toMap(request));
        return wrap(result, CreateCommunicationEventPurposeResponse::new);
    }

    /**
     * Create a Communication Event Return
     * <p>service: createCommunicationEventReturn  entities: CommunicationEventReturn  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEventReturn")
    public ResponseEntity<Map<String, Object>> createCommunicationEventReturn(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEventReturn(body));
    }

    /**
     * Create a Communication Event Role with permission check
     * <p>service: createCommunicationEventRole  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createCommunicationEventRole")
    public ResponseEntity<CreateCommunicationEventRoleResponse> createCommunicationEventRole(@RequestBody CreateCommunicationEventRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCommunicationEventRole(ServiceInput.toMap(request));
        return wrap(result, CreateCommunicationEventRoleResponse::new);
    }

    /**
     * Add Party to ContactList
     * <p>service: createContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/partymgr/control/createContactListParty")
    public ResponseEntity<Map<String, Object>> createContactListParty(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createContactListParty(body));
    }

    /**
     * Create a PartyContactMech
     * <p>service: createPartyContactMech  entities: ContactMech, PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/createContactMech")
    public ResponseEntity<CreatePartyContactMechResponse> createPartyContactMech(@RequestBody CreatePartyContactMechRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyContactMech(ServiceInput.toMap(request));
        return wrap(result, CreatePartyContactMechResponse::new);
    }

    /**
     * No description.
     * <p>service: createCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createCreditCard")
    public ResponseEntity<Map<String, Object>> createCreditCard(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCreditCard(java.util.Map.copyOf(params)));
    }

    /**
     * Create a custRequest record and optionally create a custRequest item.
     * <p>service: createCustRequest  entities: CustRequest, CustRequestItem  auth: true
     */
    @PostMapping("/partymgr/control/createCustRequest")
    public ResponseEntity<Map<String, Object>> createCustRequest(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCustRequest(body));
    }

    /**
     * No description.
     * <p>service: createCustomer  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createCustomer")
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCustomer(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createEftAccount  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createEftAccount")
    public ResponseEntity<Map<String, Object>> createEftAccount(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createEftAccount(java.util.Map.copyOf(params)));
    }

    /**
     * Create an Email Address
     * <p>service: createPartyEmailAddress  entities: ContactMech, PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/createEmailAddress")
    public ResponseEntity<CreatePartyEmailAddressResponse> createPartyEmailAddress(@RequestBody CreatePartyEmailAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyEmailAddress(ServiceInput.toMap(request));
        return wrap(result, CreatePartyEmailAddressResponse::new);
    }

    /**
     * No description.
     * <p>service: createEmployee  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createEmployee")
    public ResponseEntity<Map<String, Object>> createEmployee(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createEmployee(java.util.Map.copyOf(params)));
    }

    /**
     * Create an Employment Application
     * <p>service: createEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/partymgr/control/createEmploymentAppExt")
    public ResponseEntity<Map<String, Object>> createEmploymentApp(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createEmploymentApp(body));
    }

    /**
     * Create a shopping list entity
     * <p>service: createShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createEmptyShoppingList")
    public ResponseEntity<Map<String, Object>> createShoppingList(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createShoppingList(body));
    }

    /**
     * Create an Ftp Address associated to a party
     * <p>service: createPartyFtpAddress  entities: ContactMech, FtpAddress, PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/createFtpAddress")
    public ResponseEntity<CreatePartyFtpAddressResponse> createPartyFtpAddress(@RequestBody CreatePartyFtpAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyFtpAddress(ServiceInput.toMap(request));
        return wrap(result, CreatePartyFtpAddressResponse::new);
    }

    /**
     * Create GiftCard
     * <p>service: createGiftCard  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createGiftCard")
    public ResponseEntity<Map<String, Object>> createGiftCard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createGiftCard(body));
    }

    /**
     * create Party MaritalStatus entity
     * <p>service: createMaritalStatus  entities: MaritalStatus  auth: -
     */
    @PostMapping("/partymgr/control/createMaritalStatus")
    public ResponseEntity<CreateMaritalStatusResponse> createMaritalStatus(@RequestBody CreateMaritalStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createMaritalStatus(ServiceInput.toMap(request));
        return wrap(result, CreateMaritalStatusResponse::new);
    }

    /**
     * create MaritalStatusType entity
     * <p>service: createMaritalStatusType  entities: MaritalStatusType  auth: -
     */
    @PostMapping("/partymgr/control/createMaritalStatusType")
    public ResponseEntity<CreateMaritalStatusTypeResponse> createMaritalStatusType(@RequestBody CreateMaritalStatusTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createMaritalStatusType(ServiceInput.toMap(request));
        return wrap(result, CreateMaritalStatusTypeResponse::new);
    }

    /**
     * create a party attribute record
     * <p>service: createPartyAttribute  entities: PartyAttribute  auth: true
     */
    @PostMapping("/partymgr/control/createPartyAttribute")
    public ResponseEntity<CreatePartyAttributeResponse> createPartyAttribute(@RequestBody CreatePartyAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyAttribute(ServiceInput.toMap(request));
        return wrap(result, CreatePartyAttributeResponse::new);
    }

    /**
     * Create a PartyCarrierAccount record
     * <p>service: createPartyCarrierAccount  entities: PartyCarrierAccount  auth: true
     */
    @PostMapping("/partymgr/control/createPartyCarrierAccount")
    public ResponseEntity<CreatePartyCarrierAccountResponse> createPartyCarrierAccount(@RequestBody CreatePartyCarrierAccountRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyCarrierAccount(ServiceInput.toMap(request));
        return wrap(result, CreatePartyCarrierAccountResponse::new);
    }

    /**
     * create PartyClassification
     * <p>service: createPartyClassification  entities: PartyClassification  auth: true
     */
    @PostMapping("/partymgr/control/createPartyClassification")
    public ResponseEntity<CreatePartyClassificationResponse> createPartyClassification(@RequestBody CreatePartyClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyClassification(ServiceInput.toMap(request));
        return wrap(result, CreatePartyClassificationResponse::new);
    }

    /**
     * create PartyClassificationGroup
     * <p>service: createPartyClassificationGroup  entities: PartyClassificationGroup  auth: true
     */
    @PostMapping("/partymgr/control/createPartyClassificationGroup")
    public ResponseEntity<CreatePartyClassificationGroupResponse> createPartyClassificationGroup(@RequestBody CreatePartyClassificationGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyClassificationGroup(ServiceInput.toMap(request));
        return wrap(result, CreatePartyClassificationGroupResponse::new);
    }

    /**
     * create PartyClassification
     * <p>service: createPartyClassification  entities: PartyClassification  auth: true
     */
    @PostMapping("/partymgr/control/createPartyClassificationParty")
    public ResponseEntity<CreatePartyClassificationResponse> createPartyClassificationCreatePartyClassificationParty(@RequestBody CreatePartyClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyClassification(ServiceInput.toMap(request));
        return wrap(result, CreatePartyClassificationResponse::new);
    }

    /**
     * Create a Party ContactMech Purpose
     * <p>service: createPartyContactMechPurpose  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createPartyContactMechPurpose")
    public ResponseEntity<CreatePartyContactMechPurposeResponse> createPartyContactMechPurpose(@RequestBody CreatePartyContactMechPurposeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyContactMechPurpose(ServiceInput.toMap(request));
        return wrap(result, CreatePartyContactMechPurposeResponse::new);
    }

    /**
     * No description.
     * <p>service: createPartyContent  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createPartyContent")
    public ResponseEntity<CreatePartyContentResponse> createPartyContent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyContent(java.util.Map.copyOf(params));
        return wrap(result, CreatePartyContentResponse::new);
    }

    /**
     * Create a PartyGroup
     * <p>service: createPartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/partymgr/control/createPartyGroup")
    public ResponseEntity<CreatePartyGroupResponse> createPartyGroup(@RequestBody CreatePartyGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyGroup(ServiceInput.toMap(request));
        return wrap(result, CreatePartyGroupResponse::new);
    }

    /**
     * create PartyIdentification entity
     * <p>service: createPartyIdentification  entities: PartyIdentification  auth: true
     */
    @PostMapping("/partymgr/control/createPartyIdentification")
    public ResponseEntity<CreatePartyIdentificationResponse> createPartyIdentification(@RequestBody CreatePartyIdentificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyIdentification(ServiceInput.toMap(request));
        return wrap(result, CreatePartyIdentificationResponse::new);
    }

    /**
     * Create Party Invitation
     * <p>service: createPartyInvitation  entities: PartyInvitation  auth: true
     */
    @PostMapping("/partymgr/control/createPartyInvitation")
    public ResponseEntity<CreatePartyInvitationResponse> createPartyInvitation(@RequestBody CreatePartyInvitationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyInvitation(ServiceInput.toMap(request));
        return wrap(result, CreatePartyInvitationResponse::new);
    }

    /**
     * Create PartyInvitationGroupAssoc
     * <p>service: createPartyInvitationGroupAssoc  entities: PartyInvitationGroupAssoc  auth: true
     */
    @PostMapping("/partymgr/control/createPartyInvitationGroupAssoc")
    public ResponseEntity<CreatePartyInvitationGroupAssocResponse> createPartyInvitationGroupAssoc(@RequestBody CreatePartyInvitationGroupAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyInvitationGroupAssoc(ServiceInput.toMap(request));
        return wrap(result, CreatePartyInvitationGroupAssocResponse::new);
    }

    /**
     * Create PartyInvitationRoleAssoc
     * <p>service: createPartyInvitationRoleAssoc  entities: PartyInvitationRoleAssoc  auth: true
     */
    @PostMapping("/partymgr/control/createPartyInvitationRoleAssoc")
    public ResponseEntity<CreatePartyInvitationRoleAssocResponse> createPartyInvitationRoleAssoc(@RequestBody CreatePartyInvitationRoleAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyInvitationRoleAssoc(ServiceInput.toMap(request));
        return wrap(result, CreatePartyInvitationRoleAssocResponse::new);
    }

    /**
     * Create a note item and associate with a party. If a noteId is passed, creates an assoication to that note instead.
     * <p>service: createPartyNote  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createPartyNote")
    public ResponseEntity<CreatePartyNoteResponse> createPartyNote(@RequestBody CreatePartyNoteRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyNote(ServiceInput.toMap(request));
        return wrap(result, CreatePartyNoteResponse::new);
    }

    /**
     * Creates PartyRate
     * <p>service: updatePartyRate  entities: PartyRate  auth: true
     */
    @PostMapping("/partymgr/control/createPartyRate")
    public ResponseEntity<Map<String, Object>> updatePartyRate(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyRate(body));
    }

    /**
     * Create a Relationship between two Parties; if partyIdFrom is not specified the partyId of the current userLogin will be used; if roleTypeIds are not specified they will default to "_NA_". If a partyIdFrom is passed in, it will be used if the userLogin has PARTYMGR_REL_CREATE permission.
     * <p>service: createPartyRelationship  entities: PartyRelationship  auth: true
     */
    @PostMapping("/partymgr/control/createPartyRelationship")
    public ResponseEntity<CreatePartyRelationshipResponse> createPartyRelationship(@RequestBody CreatePartyRelationshipRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyRelationship(ServiceInput.toMap(request));
        return wrap(result, CreatePartyRelationshipResponse::new);
    }

    /**
     * Create party's roles and party's relationship
     * <p>service: createPartyRelationshipAndRole  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createPartyRelationshipAndRole")
    public ResponseEntity<CreatePartyRelationshipAndRoleResponse> createPartyRelationshipAndRole(@RequestBody CreatePartyRelationshipAndRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyRelationshipAndRole(ServiceInput.toMap(request));
        return wrap(result, CreatePartyRelationshipAndRoleResponse::new);
    }

    /**
     * create a company/contact relationship and add the related roles
     * <p>service: createPartyRelationshipContactAccount  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/createPartyRelationshipContactAccount")
    public ResponseEntity<CreatePartyRelationshipContactAccountResponse> createPartyRelationshipContactAccount(@RequestBody CreatePartyRelationshipContactAccountRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyRelationshipContactAccount(ServiceInput.toMap(request));
        return wrap(result, CreatePartyRelationshipContactAccountResponse::new);
    }

    /**
     * Create a new Party Relationship type
     * <p>service: createPartyRelationshipType  entities: PartyRelationshipType  auth: true
     */
    @PostMapping("/partymgr/control/createPartyRelationshipType")
    public ResponseEntity<CreatePartyRelationshipTypeResponse> createPartyRelationshipType(@RequestBody CreatePartyRelationshipTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyRelationshipType(ServiceInput.toMap(request));
        return wrap(result, CreatePartyRelationshipTypeResponse::new);
    }

    /**
     * Create Resume for a Party
     * <p>service: createPartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/partymgr/control/createPartyResume")
    public ResponseEntity<Map<String, Object>> createPartyResume(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyResume(body));
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/partymgr/control/createPartySkillExt")
    public ResponseEntity<Map<String, Object>> createPartySkill(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartySkill(body));
    }

    /**
     * Create PartyTaxAuthInfo
     * <p>service: createPartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/partymgr/control/createPartyTaxAuthInfo")
    public ResponseEntity<Map<String, Object>> createPartyTaxAuthInfo(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createPartyTaxAuthInfo(body));
    }

    /**
     * Create a Person
     * <p>service: createPerson  entities: Person  auth: true
     */
    @PostMapping("/partymgr/control/createPerson")
    public ResponseEntity<CreatePersonResponse> createPerson(@RequestBody CreatePersonRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPerson(ServiceInput.toMap(request));
        return wrap(result, CreatePersonResponse::new);
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/partymgr/control/createPostalAddress")
    public ResponseEntity<CreatePartyPostalAddressResponse> createPartyPostalAddress(@RequestBody CreatePartyPostalAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyPostalAddress(ServiceInput.toMap(request));
        return wrap(result, CreatePartyPostalAddressResponse::new);
    }

    /**
     * Create a Postal Address
     * <p>service: createPartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/partymgr/control/createPostalAddressAndPurpose")
    public ResponseEntity<CreatePartyPostalAddressResponse> createPartyPostalAddressCreatePostalAddressAndPurpose(@RequestBody CreatePartyPostalAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyPostalAddress(ServiceInput.toMap(request));
        return wrap(result, CreatePartyPostalAddressResponse::new);
    }

    /**
     * No description.
     * <p>service: createProspect  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/createProspect")
    public ResponseEntity<Map<String, Object>> createProspect(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createProspect(java.util.Map.copyOf(params)));
    }

    /**
     * Create a Customer request from a commEvent(email)
     * <p>service: createCustRequestFromCommEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/partymgr/control/createRequestFromCommEvent")
    public ResponseEntity<Map<String, Object>> createCustRequestFromCommEvent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCustRequestFromCommEvent(body));
    }

    /**
     * Create a SegmentGroupRole
     * <p>service: createSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/partymgr/control/createSegmentRole")
    public ResponseEntity<Map<String, Object>> createSegmentGroupRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createSegmentGroupRole(body));
    }

    /**
     * Create a Telecommunications Number
     * <p>service: createPartyTelecomNumber  entities: PartyContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/partymgr/control/createTelecomNumber")
    public ResponseEntity<CreatePartyTelecomNumberResponse> createPartyTelecomNumber(@RequestBody CreatePartyTelecomNumberRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createPartyTelecomNumber(ServiceInput.toMap(request));
        return wrap(result, CreatePartyTelecomNumberResponse::new);
    }

    /**
     * Create Vendor Information
     * <p>service: createVendor  entities: Vendor  auth: true
     */
    @PostMapping("/partymgr/control/createVendor")
    public ResponseEntity<CreateVendorResponse> createVendor(@RequestBody CreateVendorRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createVendor(ServiceInput.toMap(request));
        return wrap(result, CreateVendorResponse::new);
    }

    /**
     * Create a custRequest record and optionally create a custRequest item.
     * <p>service: createCustRequest  entities: CustRequest, CustRequestItem  auth: true
     */
    @PostMapping("/partymgr/control/createrequest")
    public ResponseEntity<Map<String, Object>> createCustRequestCreaterequest(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCustRequest(body));
    }

    /**
     * Create a new role type
     * <p>service: createRoleType  entities: RoleType  auth: true
     */
    @PostMapping("/partymgr/control/createroletype")
    public ResponseEntity<CreateRoleTypeResponse> createRoleType(@RequestBody CreateRoleTypeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createRoleType(ServiceInput.toMap(request));
        return wrap(result, CreateRoleTypeResponse::new);
    }

    /**
     * No description.
     * <p>service: deleteBillingAccount  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/deleteBillingAccount")
    public ResponseEntity<Map<String, Object>> deleteBillingAccount(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.deleteBillingAccount(java.util.Map.copyOf(params)));
    }

    /**
     * Deletes CommunicationEventWorkEff
     * <p>service: deleteCommunicationEventWorkEff  entities: CommunicationEventWorkEff  auth: true
     */
    @PostMapping("/partymgr/control/deleteCommEventWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteCommunicationEventWorkEff(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteCommunicationEventWorkEff(body));
    }

    /**
     * Delete a Communication Event, optionally delete the attached content and dataresource
     * <p>service: deleteCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/partymgr/control/deleteCommunicationEvent")
    public ResponseEntity<DeleteCommunicationEventResponse> deleteCommunicationEvent(@RequestBody DeleteCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, DeleteCommunicationEventResponse::new);
    }

    /**
     * Remove a Communication Event Order
     * <p>service: removeCommunicationEventOrder  entities: CommunicationEventOrder  auth: true
     */
    @PostMapping("/partymgr/control/deleteCommunicationEventOrder")
    public ResponseEntity<Map<String, Object>> removeCommunicationEventOrder(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeCommunicationEventOrder(body));
    }

    /**
     * Remove a Communication Event Product
     * <p>service: removeCommunicationEventProduct  entities: CommunicationEventProduct  auth: true
     */
    @PostMapping("/partymgr/control/deleteCommunicationEventProduct")
    public ResponseEntity<Map<String, Object>> removeCommunicationEventProduct(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeCommunicationEventProduct(body));
    }

    /**
     * Remove a Communication Event Return
     * <p>service: removeCommunicationEventReturn  entities: CommunicationEventReturn  auth: true
     */
    @PostMapping("/partymgr/control/deleteCommunicationEventReturn")
    public ResponseEntity<Map<String, Object>> removeCommunicationEventReturn(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeCommunicationEventReturn(body));
    }

    /**
     * No description.
     * <p>service: deleteCommunicationEvent  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/deleteCommunicationEvents")
    public ResponseEntity<DeleteCommunicationEventResponse> deleteCommunicationEventDeleteCommunicationEvents(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteCommunicationEvent(java.util.Map.copyOf(params));
        return wrap(result, DeleteCommunicationEventResponse::new);
    }

    /**
     * Delete a PartyContactMech
     * <p>service: deletePartyContactMech  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/deleteContactMech")
    public ResponseEntity<DeletePartyContactMechResponse> deletePartyContactMech(@RequestBody DeletePartyContactMechRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyContactMech(ServiceInput.toMap(request));
        return wrap(result, DeletePartyContactMechResponse::new);
    }

    /**
     * Delete an Employment Application
     * <p>service: deleteEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/partymgr/control/deleteEmploymentApp")
    public ResponseEntity<Map<String, Object>> deleteEmploymentApp(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteEmploymentApp(body));
    }

    /**
     * delete Party MaritalStatus entity
     * <p>service: deleteMaritalStatus  entities: MaritalStatus  auth: -
     */
    @PostMapping("/partymgr/control/deleteMaritalStatus")
    public ResponseEntity<DeleteMaritalStatusResponse> deleteMaritalStatus(@RequestBody DeleteMaritalStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteMaritalStatus(ServiceInput.toMap(request));
        return wrap(result, DeleteMaritalStatusResponse::new);
    }

    /**
     * delete PartyClassification
     * <p>service: deletePartyClassification  entities: PartyClassification  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyClassification")
    public ResponseEntity<DeletePartyClassificationResponse> deletePartyClassification(@RequestBody DeletePartyClassificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyClassification(ServiceInput.toMap(request));
        return wrap(result, DeletePartyClassificationResponse::new);
    }

    /**
     * delete PartyClassificationGroup
     * <p>service: deletePartyClassificationGroup  entities: PartyClassificationGroup  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyClassificationGroup")
    public ResponseEntity<DeletePartyClassificationGroupResponse> deletePartyClassificationGroup(@RequestBody DeletePartyClassificationGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyClassificationGroup(ServiceInput.toMap(request));
        return wrap(result, DeletePartyClassificationGroupResponse::new);
    }

    /**
     * delete PartyClassificationGroup
     * <p>service: deletePartyIdentification  entities: PartyIdentification  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyIdentification")
    public ResponseEntity<DeletePartyIdentificationResponse> deletePartyIdentification(@RequestBody DeletePartyIdentificationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyIdentification(ServiceInput.toMap(request));
        return wrap(result, DeletePartyIdentificationResponse::new);
    }

    /**
     * Remove Party Invitation
     * <p>service: deletePartyInvitation  entities: PartyInvitation  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyInvitation")
    public ResponseEntity<DeletePartyInvitationResponse> deletePartyInvitation(@RequestBody DeletePartyInvitationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyInvitation(ServiceInput.toMap(request));
        return wrap(result, DeletePartyInvitationResponse::new);
    }

    /**
     * Remove PartyInvitationGroupAssoc
     * <p>service: deletePartyInvitationGroupAssoc  entities: PartyInvitationGroupAssoc  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyInvitationGroupAssoc")
    public ResponseEntity<DeletePartyInvitationGroupAssocResponse> deletePartyInvitationGroupAssoc(@RequestBody DeletePartyInvitationGroupAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyInvitationGroupAssoc(ServiceInput.toMap(request));
        return wrap(result, DeletePartyInvitationGroupAssocResponse::new);
    }

    /**
     * Remove PartyInvitationRoleAssoc
     * <p>service: deletePartyInvitationRoleAssoc  entities: PartyInvitationRoleAssoc  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyInvitationRoleAssoc")
    public ResponseEntity<DeletePartyInvitationRoleAssocResponse> deletePartyInvitationRoleAssoc(@RequestBody DeletePartyInvitationRoleAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyInvitationRoleAssoc(ServiceInput.toMap(request));
        return wrap(result, DeletePartyInvitationRoleAssocResponse::new);
    }

    /**
     * Delete a Relationship between two Parties; if partyIdFrom is not specified the partyId of the current userLogin will be used; if roleTypeIds are not specified they will default to "_NA_".
     * <p>service: deletePartyRelationship  entities: PartyRelationship  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyRelationship")
    public ResponseEntity<DeletePartyRelationshipResponse> deletePartyRelationship(@RequestBody DeletePartyRelationshipRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyRelationship(ServiceInput.toMap(request));
        return wrap(result, DeletePartyRelationshipResponse::new);
    }

    /**
     * Delete a Resume of Party
     * <p>service: deletePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyResume")
    public ResponseEntity<Map<String, Object>> deletePartyResume(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deletePartyResume(body));
    }

    /**
     * Delete a PartySkill
     * <p>service: deletePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/partymgr/control/deletePartySkill")
    public ResponseEntity<Map<String, Object>> deletePartySkill(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deletePartySkill(body));
    }

    /**
     * Delete PartyTaxAuthInfo
     * <p>service: deletePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/partymgr/control/deletePartyTaxAuthInfo")
    public ResponseEntity<Map<String, Object>> deletePartyTaxAuthInfo(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deletePartyTaxAuthInfo(body));
    }

    /**
     * No description.
     * <p>service: deletePaymentMethod  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/deletePaymentMethod")
    public ResponseEntity<Map<String, Object>> deletePaymentMethod(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.deletePaymentMethod(java.util.Map.copyOf(params)));
    }

    /**
     * Delete a SegmentGroupRole
     * <p>service: deleteSegmentGroupRole  entities: SegmentGroupRole  auth: true
     */
    @PostMapping("/partymgr/control/deleteSegmentGroupRole")
    public ResponseEntity<Map<String, Object>> deleteSegmentGroupRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteSegmentGroupRole(body));
    }

    /**
     * Delete a Communication Event, optionally delete the attached content and dataresource
     * <p>service: deleteCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/partymgr/control/deleteUnknownCommunicationEvent")
    public ResponseEntity<DeleteCommunicationEventResponse> deleteCommunicationEventDeleteUnknownCommunicationEvent(@RequestBody DeleteCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, DeleteCommunicationEventResponse::new);
    }

    /**
     * Delete a Party Role (remove a Role from a Party). The logged in user must have PARTYMGR_DELETE or have permission to change the role of this partyId
     * <p>service: deletePartyRole  entities: PartyRole  auth: true
     */
    @PostMapping("/partymgr/control/deleterole")
    public ResponseEntity<DeletePartyRoleResponse> deletePartyRole(@RequestBody DeletePartyRoleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deletePartyRole(ServiceInput.toMap(request));
        return wrap(result, DeletePartyRoleResponse::new);
    }

    /**
     * No description.
     * <p>service: editGeoLocation  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/editGeoLocation")
    public ResponseEntity<Map<String, Object>> editGeoLocation(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.editGeoLocation(java.util.Map.copyOf(params)));
    }

    /**
     * Expires a Party Contact Mech Purpose
     * <p>service: expirePartyContactMechPurpose  entities: PartyContactMechPurpose  auth: true
     */
    @PostMapping("/partymgr/control/expirePartyContactMechPurpose")
    public ResponseEntity<ExpirePartyContactMechPurposeResponse> expirePartyContactMechPurpose(@RequestBody ExpirePartyContactMechPurposeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.expirePartyContactMechPurpose(ServiceInput.toMap(request));
        return wrap(result, ExpirePartyContactMechPurposeResponse::new);
    }

    /**
     * Expire PartyRate and expire related rateAmount
     * <p>service: expirePartyRate  entities: PartyRate  auth: true
     */
    @PostMapping("/partymgr/control/expirePartyRate")
    public ResponseEntity<Map<String, Object>> expirePartyRate(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.expirePartyRate(body));
    }

    /**
     * No description.
     * <p>service: serveImage  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/img")
    public ResponseEntity<Map<String, Object>> serveImage(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.serveImage(java.util.Map.copyOf(params)));
    }

    /**
     * Import a CSV (name,value) of AddressMatchMap records
     * <p>service: importAddressMatchMapCsv  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/importAddressMatchMapCsv")
    public ResponseEntity<ImportAddressMatchMapCsvResponse> importAddressMatchMapCsv(@RequestBody ImportAddressMatchMapCsvRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.importAddressMatchMapCsv(ServiceInput.toMap(request));
        return wrap(result, ImportAddressMatchMapCsvResponse::new);
    }

    /**
     * Delete an AddressMatchMap record
     * <p>service: removeAddressMatchMap  entities: AddressMatchMap  auth: true
     */
    @PostMapping("/partymgr/control/removeAddressMatchMap")
    public ResponseEntity<RemoveAddressMatchMapResponse> removeAddressMatchMap(@RequestBody RemoveAddressMatchMapRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeAddressMatchMap(ServiceInput.toMap(request));
        return wrap(result, RemoveAddressMatchMapResponse::new);
    }

    /**
     * Expire CommEventContentAssoc
     * <p>service: expireCommEventContentAssoc  entities: CommEventContentAssoc  auth: true
     */
    @PostMapping("/partymgr/control/removeAttachFile")
    public ResponseEntity<Map<String, Object>> expireCommEventContentAssoc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.expireCommEventContentAssoc(body));
    }

    /**
     * Remove a Communication Event Purpose
     * <p>service: removeCommunicationEventPurpose  entities: CommunicationEventPurpose  auth: true
     */
    @PostMapping("/partymgr/control/removeCommunicationEventPurpose")
    public ResponseEntity<RemoveCommunicationEventPurposeResponse> removeCommunicationEventPurpose(@RequestBody RemoveCommunicationEventPurposeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCommunicationEventPurpose(ServiceInput.toMap(request));
        return wrap(result, RemoveCommunicationEventPurposeResponse::new);
    }

    /**
     * Remove a shopping list item
     * <p>service: removeShoppingListItem  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/removeFromShoppingList")
    public ResponseEntity<Map<String, Object>> removeShoppingListItem(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeShoppingListItem(body));
    }

    /**
     * removes a party attribute record
     * <p>service: removePartyAttribute  entities: PartyAttribute  auth: true
     */
    @PostMapping("/partymgr/control/removePartyAttribute")
    public ResponseEntity<RemovePartyAttributeResponse> removePartyAttribute(@RequestBody RemovePartyAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removePartyAttribute(ServiceInput.toMap(request));
        return wrap(result, RemovePartyAttributeResponse::new);
    }

    /**
     * Remove a PartyContent record
     * <p>service: removePartyContent  entities: PartyContent  auth: true
     */
    @PostMapping("/partymgr/control/removePartyContent")
    public ResponseEntity<RemovePartyContentResponse> removePartyContent(@RequestBody RemovePartyContentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removePartyContent(ServiceInput.toMap(request));
        return wrap(result, RemovePartyContentResponse::new);
    }

    /**
     * Sets a single user preference.
     * <p>service: removeUserPreference  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/removePreference")
    public ResponseEntity<Map<String, Object>> removeUserPreference(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeUserPreference(body));
    }

    /**
     * No description.
     * <p>service: replaceShoppingListItem  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/replaceShoppingListItem")
    public ResponseEntity<Map<String, Object>> replaceShoppingListItem(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.replaceShoppingListItem(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: deleteAVSOverride  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/resetAvsOverride")
    public ResponseEntity<Map<String, Object>> deleteAVSOverride(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.deleteAVSOverride(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: restoreAutoSaveList  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/restoreCartFromList")
    public ResponseEntity<Map<String, Object>> restoreAutoSaveList(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.restoreAutoSaveList(java.util.Map.copyOf(params)));
    }

    /**
     * Update a Communication Event
     * <p>service: updateCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/partymgr/control/sendCommunicationEvent")
    public ResponseEntity<UpdateCommunicationEventResponse> updateCommunicationEvent(@RequestBody UpdateCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, UpdateCommunicationEventResponse::new);
    }

    /**
     * Set the Communication event Status for a specific role
     * <p>service: setCommunicationEventRoleStatus  entities: CommunicationEventRole  auth: true
     */
    @PostMapping("/partymgr/control/setCommunicationEventRoleStatus")
    public ResponseEntity<SetCommunicationEventRoleStatusResponse> setCommunicationEventRoleStatus(@RequestBody SetCommunicationEventRoleStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.setCommunicationEventRoleStatus(ServiceInput.toMap(request));
        return wrap(result, SetCommunicationEventRoleStatusResponse::new);
    }

    /**
     * Set the Customer Request Status
     * <p>service: setCustRequestStatus  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/setCustRequestStatus")
    public ResponseEntity<Map<String, Object>> setCustRequestStatus(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.setCustRequestStatus(body));
    }

    /**
     * Merges customer accounts and disabled the duplicate
     * <p>service: linkPartyRecord  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/setPartyLink")
    public ResponseEntity<LinkPartyRecordResponse> linkPartyRecord(@RequestBody LinkPartyRecordRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.linkPartyRecord(ServiceInput.toMap(request));
        return wrap(result, LinkPartyRecordResponse::new);
    }

    /**
     * Create ProductStoreRole
     * <p>service: createProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/partymgr/control/storeCreateRole")
    public ResponseEntity<Map<String, Object>> createProductStoreRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createProductStoreRole(body));
    }

    /**
     * Remove ProductStoreRole
     * <p>service: removeProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/partymgr/control/storeRemoveRole")
    public ResponseEntity<Map<String, Object>> removeProductStoreRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeProductStoreRole(body));
    }

    /**
     * Update a Product Store Role
     * <p>service: updateProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/partymgr/control/storeUpdateRole")
    public ResponseEntity<Map<String, Object>> updateProductStoreRole(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateProductStoreRole(body));
    }

    /**
     * No description.
     * <p>service: updateAVSOverride  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updateAvsOverride")
    public ResponseEntity<Map<String, Object>> updateAVSOverride(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateAVSOverride(java.util.Map.copyOf(params)));
    }

    /**
     * Update a Billing Account
     * <p>service: updateBillingAccount  entities: BillingAccount  auth: true
     */
    @PostMapping("/partymgr/control/updateBillingAccount")
    public ResponseEntity<Map<String, Object>> updateBillingAccount(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateBillingAccount(body));
    }

    /**
     * No description.
     * <p>service: updateCheckAccount  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updateCheckAccount")
    public ResponseEntity<Map<String, Object>> updateCheckAccount(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateCheckAccount(java.util.Map.copyOf(params)));
    }

    /**
     * Update CommunicationEvent and Content
     * <p>service: updateCommContentDataResource  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/updateCommContentDataResource")
    public ResponseEntity<Map<String, Object>> updateCommContentDataResource(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateCommContentDataResource(body));
    }

    /**
     * Updates CommunicationEventWorkEff
     * <p>service: updateCommunicationEventWorkEff  entities: CommunicationEvent, CommunicationEventWorkEff  auth: true
     */
    @PostMapping("/partymgr/control/updateCommEventWorkEffort")
    public ResponseEntity<Map<String, Object>> updateCommunicationEventWorkEff(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateCommunicationEventWorkEff(body));
    }

    /**
     * Update a Communication Event
     * <p>service: updateCommunicationEvent  entities: CommunicationEvent  auth: true
     */
    @PostMapping("/partymgr/control/updateCommunicationEvent")
    public ResponseEntity<UpdateCommunicationEventResponse> updateCommunicationEventUpdateCommunicationEvent(@RequestBody UpdateCommunicationEventRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCommunicationEvent(ServiceInput.toMap(request));
        return wrap(result, UpdateCommunicationEventResponse::new);
    }

    /**
     * Update Party to ContactList Join
     * <p>service: updateContactListParty  entities: ContactListParty  auth: true
     */
    @PostMapping("/partymgr/control/updateContactListParty")
    public ResponseEntity<Map<String, Object>> updateContactListParty(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateContactListParty(body));
    }

    /**
     * Update a PartyContactMech
     * <p>service: updatePartyContactMech  entities: PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/updateContactMech")
    public ResponseEntity<UpdatePartyContactMechResponse> updatePartyContactMech(@RequestBody UpdatePartyContactMechRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyContactMech(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyContactMechResponse::new);
    }

    /**
     * No description.
     * <p>service: updateCreditCard  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updateCreditCard")
    public ResponseEntity<Map<String, Object>> updateCreditCard(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateCreditCard(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: updateEftAccount  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updateEftAccount")
    public ResponseEntity<Map<String, Object>> updateEftAccount(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateEftAccount(java.util.Map.copyOf(params)));
    }

    /**
     * Update an Email Address
     * <p>service: updatePartyEmailAddress  entities: PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/updateEmailAddress")
    public ResponseEntity<UpdatePartyEmailAddressResponse> updatePartyEmailAddress(@RequestBody UpdatePartyEmailAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyEmailAddress(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyEmailAddressResponse::new);
    }

    /**
     * No description.
     * <p>service: updateEmploymentApp  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updateEmploymentAppExt")
    public ResponseEntity<Map<String, Object>> updateEmploymentApp(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateEmploymentApp(java.util.Map.copyOf(params)));
    }

    /**
     * Update an Ftp Address associated to a party
     * <p>service: updatePartyFtpAddress  entities: FtpAddress, PartyContactMech  auth: true
     */
    @PostMapping("/partymgr/control/updateFtpAddress")
    public ResponseEntity<UpdatePartyFtpAddressResponse> updatePartyFtpAddress(@RequestBody UpdatePartyFtpAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyFtpAddress(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyFtpAddressResponse::new);
    }

    /**
     * Update GiftCard
     * <p>service: updateGiftCard  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/updateGiftCard")
    public ResponseEntity<Map<String, Object>> updateGiftCard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateGiftCard(body));
    }

    /**
     * update Party MaritalStatus entity
     * <p>service: updateMaritalStatus  entities: MaritalStatus  auth: -
     */
    @PostMapping("/partymgr/control/updateMaritalStatus")
    public ResponseEntity<UpdateMaritalStatusResponse> updateMaritalStatus(@RequestBody UpdateMaritalStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateMaritalStatus(ServiceInput.toMap(request));
        return wrap(result, UpdateMaritalStatusResponse::new);
    }

    /**
     * updates a party attribute record
     * <p>service: updatePartyAttribute  entities: PartyAttribute  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyAttribute")
    public ResponseEntity<UpdatePartyAttributeResponse> updatePartyAttribute(@RequestBody UpdatePartyAttributeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyAttribute(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyAttributeResponse::new);
    }

    /**
     * Update a PartyCarrierAccount record
     * <p>service: updatePartyCarrierAccount  entities: PartyCarrierAccount  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyCarrierAccount")
    public ResponseEntity<UpdatePartyCarrierAccountResponse> updatePartyCarrierAccount(@RequestBody UpdatePartyCarrierAccountRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyCarrierAccount(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyCarrierAccountResponse::new);
    }

    /**
     * update PartyClassification
     * <p>service: updatePartyClassification  entities: PartyClassification  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyClassification")
    public ResponseEntity<UpdatePartyClassificationResponse> updatePartyClassification(@RequestBody UpdatePartyClassificationRequest request) throws java.sql.SQLException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * update PartyClassificationGroup
     * <p>service: updatePartyClassificationGroup  entities: PartyClassificationGroup  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyClassificationGroup")
    public ResponseEntity<UpdatePartyClassificationGroupResponse> updatePartyClassificationGroup(@RequestBody UpdatePartyClassificationGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyClassificationGroup(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyClassificationGroupResponse::new);
    }

    /**
     * update PartyClassification
     * <p>service: updatePartyClassification  entities: PartyClassification  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyClassificationParty")
    public ResponseEntity<UpdatePartyClassificationResponse> updatePartyClassificationUpdatePartyClassificationParty(@RequestBody UpdatePartyClassificationRequest request) throws java.sql.SQLException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyContent  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/updatePartyContent")
    public ResponseEntity<UpdatePartyContentResponse> updatePartyContent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyContent(java.util.Map.copyOf(params));
        return wrap(result, UpdatePartyContentResponse::new);
    }

    /**
     * Update a PartyGroup
     * <p>service: updatePartyGroup  entities: PartyGroup  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyGroup")
    public ResponseEntity<UpdatePartyGroupResponse> updatePartyGroupUpdatePartyGroup(@RequestBody UpdatePartyGroupRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyGroup(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyGroupResponse::new);
    }

    /**
     * update PartyIdentification entity
     * <p>service: updatePartyIdentification  entities: PartyIdentification  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyIdentification")
    public ResponseEntity<UpdatePartyIdentificationResponse> updatePartyIdentification(@RequestBody UpdatePartyIdentificationRequest request) throws java.sql.SQLException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party Invitation
     * <p>service: updatePartyInvitation  entities: PartyInvitation  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyInvitation")
    public ResponseEntity<UpdatePartyInvitationResponse> updatePartyInvitation(@RequestBody UpdatePartyInvitationRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyInvitation(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyInvitationResponse::new);
    }

    /**
     * Creates PartyRate
     * <p>service: updatePartyRate  entities: PartyRate  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyRate")
    public ResponseEntity<Map<String, Object>> updatePartyRateUpdatePartyRate(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyRate(body));
    }

    /**
     * Update a Relationship between two Parties; if partyIdFrom is not specified the partyId of the current userLogin will be used; if roleTypeIds are not specified they will default to "_NA_". If a partyIdFrom is passed in, it will be used if the userLogin has PARTYMGR_REL_UPDATE permission.
     * <p>service: updatePartyRelationship  entities: PartyRelationship  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyRelationship")
    public ResponseEntity<UpdatePartyRelationshipResponse> updatePartyRelationship(@RequestBody UpdatePartyRelationshipRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyRelationship(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyRelationshipResponse::new);
    }

    /**
     * Update a Resume of Party
     * <p>service: updatePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyResume")
    public ResponseEntity<Map<String, Object>> updatePartyResume(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyResume(body));
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/partymgr/control/updatePartySkillExt")
    public ResponseEntity<Map<String, Object>> updatePartySkill(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartySkill(body));
    }

    /**
     * Update PartyTaxAuthInfo
     * <p>service: updatePartyTaxAuthInfo  entities: PartyTaxAuthInfo  auth: true
     */
    @PostMapping("/partymgr/control/updatePartyTaxAuthInfo")
    public ResponseEntity<Map<String, Object>> updatePartyTaxAuthInfo(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyTaxAuthInfo(body));
    }

    /**
     * Update a Person
     * <p>service: updatePerson  entities: Person  auth: true
     */
    @PostMapping("/partymgr/control/updatePerson")
    public ResponseEntity<UpdatePersonResponse> updatePerson(@RequestBody UpdatePersonRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePerson(ServiceInput.toMap(request));
        return wrap(result, UpdatePersonResponse::new);
    }

    /**
     * Update a Postal Address
     * <p>service: updatePartyPostalAddress  entities: PartyContactMech, PostalAddress  auth: true
     */
    @PostMapping("/partymgr/control/updatePostalAddress")
    public ResponseEntity<UpdatePartyPostalAddressResponse> updatePartyPostalAddress(@RequestBody UpdatePartyPostalAddressRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyPostalAddress(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyPostalAddressResponse::new);
    }

    /**
     * Update a shopping list entity
     * <p>service: updateShoppingList  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/updateShoppingList")
    public ResponseEntity<Map<String, Object>> updateShoppingList(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateShoppingList(body));
    }

    /**
     * Update a shopping list item
     * <p>service: updateShoppingListItem  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/updateShoppingListItem")
    public ResponseEntity<Map<String, Object>> updateShoppingListItem(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateShoppingListItem(body));
    }

    /**
     * Update a Telecommunications Number
     * <p>service: updatePartyTelecomNumber  entities: PartyContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/partymgr/control/updateTelecomNumber")
    public ResponseEntity<UpdatePartyTelecomNumberResponse> updatePartyTelecomNumber(@RequestBody UpdatePartyTelecomNumberRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updatePartyTelecomNumber(ServiceInput.toMap(request));
        return wrap(result, UpdatePartyTelecomNumberResponse::new);
    }

    /**
     * Update Vendor Information
     * <p>service: updateVendor  entities: Vendor  auth: true
     */
    @PostMapping("/partymgr/control/updateVendor")
    public ResponseEntity<UpdateVendorResponse> updateVendor(@RequestBody UpdateVendorRequest request) throws java.sql.SQLException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createCommunicationEventContent  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/uploadAttachFile")
    public ResponseEntity<Map<String, Object>> createCommunicationEventContent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEventContent(java.util.Map.copyOf(params)));
    }

    /**
     * No description.
     * <p>service: createCommunicationEventContent  entities: unknown  auth: true
     */
    @GetMapping("/partymgr/control/uploadAttachFiletoEmail")
    public ResponseEntity<Map<String, Object>> createCommunicationEventContentUploadAttachFiletoEmail(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createCommunicationEventContent(java.util.Map.copyOf(params)));
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/partymgr/control/uploadCommEventContent")
    public ResponseEntity<Map<String, Object>> persistContentAndAssoc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.persistContentAndAssoc(body));
    }

    /**
     * Import an party with related main role, company and contact info in csv format, will ignore parties already entered
     * <p>service: importParty  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/uploadParty")
    public ResponseEntity<ImportPartyResponse> importParty(@RequestBody ImportPartyRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.importParty(ServiceInput.toMap(request));
        return wrap(result, ImportPartyResponse::new);
    }

    /**
     * Upload and attach a file to a party
     * <p>service: uploadPartyContentFile  entities: unknown  auth: true
     */
    @PostMapping("/partymgr/control/uploadPartyContent")
    public ResponseEntity<UploadPartyContentFileResponse> uploadPartyContentFile(@RequestBody UploadPartyContentFileRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.uploadPartyContentFile(ServiceInput.toMap(request));
        return wrap(result, UploadPartyContentFileResponse::new);
    }
}
