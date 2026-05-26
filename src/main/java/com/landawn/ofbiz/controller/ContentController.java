package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.content.AutoCreateWebSiteContentRequest;
import com.landawn.ofbiz.model.content.AutoCreateWebSiteContentResponse;
import com.landawn.ofbiz.model.content.BuildSurveyFromPdfRequest;
import com.landawn.ofbiz.model.content.BuildSurveyFromPdfResponse;
import com.landawn.ofbiz.model.content.BuildSurveyResponseFromPdfRequest;
import com.landawn.ofbiz.model.content.BuildSurveyResponseFromPdfResponse;
import com.landawn.ofbiz.model.content.CreateBlogEntryRequest;
import com.landawn.ofbiz.model.content.CreateBlogEntryResponse;
import com.landawn.ofbiz.model.content.CreateCharacterSetRequest;
import com.landawn.ofbiz.model.content.CreateCharacterSetResponse;
import com.landawn.ofbiz.model.content.CreateContentApprovalRequest;
import com.landawn.ofbiz.model.content.CreateContentApprovalResponse;
import com.landawn.ofbiz.model.content.CreateContentAssocPredicateRequest;
import com.landawn.ofbiz.model.content.CreateContentAssocPredicateResponse;
import com.landawn.ofbiz.model.content.CreateContentAssocRequest;
import com.landawn.ofbiz.model.content.CreateContentAssocResponse;
import com.landawn.ofbiz.model.content.CreateContentAssocTypeRequest;
import com.landawn.ofbiz.model.content.CreateContentAssocTypeResponse;
import com.landawn.ofbiz.model.content.CreateContentAttributeRequest;
import com.landawn.ofbiz.model.content.CreateContentAttributeResponse;
import com.landawn.ofbiz.model.content.CreateContentFromUploadedFileRequest;
import com.landawn.ofbiz.model.content.CreateContentFromUploadedFileResponse;
import com.landawn.ofbiz.model.content.CreateContentKeywordRequest;
import com.landawn.ofbiz.model.content.CreateContentKeywordResponse;
import com.landawn.ofbiz.model.content.CreateContentMetaDataRequest;
import com.landawn.ofbiz.model.content.CreateContentMetaDataResponse;
import com.landawn.ofbiz.model.content.CreateContentOperationRequest;
import com.landawn.ofbiz.model.content.CreateContentOperationResponse;
import com.landawn.ofbiz.model.content.CreateContentPurposeOperationRequest;
import com.landawn.ofbiz.model.content.CreateContentPurposeOperationResponse;
import com.landawn.ofbiz.model.content.CreateContentPurposeRequest;
import com.landawn.ofbiz.model.content.CreateContentPurposeResponse;
import com.landawn.ofbiz.model.content.CreateContentPurposeTypeRequest;
import com.landawn.ofbiz.model.content.CreateContentPurposeTypeResponse;
import com.landawn.ofbiz.model.content.CreateContentRequest;
import com.landawn.ofbiz.model.content.CreateContentResponse;
import com.landawn.ofbiz.model.content.CreateContentRevisionItemRequest;
import com.landawn.ofbiz.model.content.CreateContentRevisionItemResponse;
import com.landawn.ofbiz.model.content.CreateContentRevisionRequest;
import com.landawn.ofbiz.model.content.CreateContentRevisionResponse;
import com.landawn.ofbiz.model.content.CreateContentRoleRequest;
import com.landawn.ofbiz.model.content.CreateContentRoleResponse;
import com.landawn.ofbiz.model.content.CreateContentTypeAttrRequest;
import com.landawn.ofbiz.model.content.CreateContentTypeAttrResponse;
import com.landawn.ofbiz.model.content.CreateContentTypeRequest;
import com.landawn.ofbiz.model.content.CreateContentTypeResponse;
import com.landawn.ofbiz.model.content.CreateDataCategoryRequest;
import com.landawn.ofbiz.model.content.CreateDataCategoryResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceAndAssocToContentRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceAndAssocToContentResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceAndTextRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceAndTextResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceAttributeRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceAttributeResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceRoleRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceRoleResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceTypeAttrRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceTypeAttrResponse;
import com.landawn.ofbiz.model.content.CreateDataResourceTypeRequest;
import com.landawn.ofbiz.model.content.CreateDataResourceTypeResponse;
import com.landawn.ofbiz.model.content.CreateDocumentResponse;
import com.landawn.ofbiz.model.content.CreateElectronicTextRequest;
import com.landawn.ofbiz.model.content.CreateElectronicTextResponse;
import com.landawn.ofbiz.model.content.CreateFileExtensionRequest;
import com.landawn.ofbiz.model.content.CreateFileExtensionResponse;
import com.landawn.ofbiz.model.content.CreateMetaDataPredicateRequest;
import com.landawn.ofbiz.model.content.CreateMetaDataPredicateResponse;
import com.landawn.ofbiz.model.content.CreateMimeTypeHtmlTemplateRequest;
import com.landawn.ofbiz.model.content.CreateMimeTypeHtmlTemplateResponse;
import com.landawn.ofbiz.model.content.CreateMimeTypeRequest;
import com.landawn.ofbiz.model.content.CreateMimeTypeResponse;
import com.landawn.ofbiz.model.content.CreateOrRemoveProductFeatureDataResourceResponse;
import com.landawn.ofbiz.model.content.CreateSurveyMultiRespColumnRequest;
import com.landawn.ofbiz.model.content.CreateSurveyMultiRespColumnResponse;
import com.landawn.ofbiz.model.content.CreateSurveyMultiRespRequest;
import com.landawn.ofbiz.model.content.CreateSurveyMultiRespResponse;
import com.landawn.ofbiz.model.content.CreateSurveyPageRequest;
import com.landawn.ofbiz.model.content.CreateSurveyPageResponse;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionApplRequest;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionApplResponse;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionCategoryRequest;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionCategoryResponse;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionOptionRequest;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionOptionResponse;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionRequest;
import com.landawn.ofbiz.model.content.CreateSurveyQuestionResponse;
import com.landawn.ofbiz.model.content.CreateSurveyRequest;
import com.landawn.ofbiz.model.content.CreateSurveyResponse;
import com.landawn.ofbiz.model.content.CreateSurveyResponseRequest;
import com.landawn.ofbiz.model.content.CreateSurveyResponseResponse;
import com.landawn.ofbiz.model.content.CreateTextContentRequest;
import com.landawn.ofbiz.model.content.CreateTextContentResponse;
import com.landawn.ofbiz.model.content.CreateWebSiteContentRequest;
import com.landawn.ofbiz.model.content.CreateWebSiteContentResponse;
import com.landawn.ofbiz.model.content.CreateWebSitePathAliasRequest;
import com.landawn.ofbiz.model.content.CreateWebSitePathAliasResponse;
import com.landawn.ofbiz.model.content.CreateWebSiteRequest;
import com.landawn.ofbiz.model.content.CreateWebSiteResponse;
import com.landawn.ofbiz.model.content.CreateWebSiteRoleRequest;
import com.landawn.ofbiz.model.content.CreateWebSiteRoleResponse;
import com.landawn.ofbiz.model.content.DeactivateAssocsRequest;
import com.landawn.ofbiz.model.content.DeactivateAssocsResponse;
import com.landawn.ofbiz.model.content.DeleteContentKeywordRequest;
import com.landawn.ofbiz.model.content.DeleteContentKeywordResponse;
import com.landawn.ofbiz.model.content.DeleteContentKeywordsRequest;
import com.landawn.ofbiz.model.content.DeleteContentKeywordsResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyMultiRespColumnRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyMultiRespColumnResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyMultiRespRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyMultiRespResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyPageRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyPageResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionApplRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionApplResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionOptionRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionOptionResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyQuestionResponse;
import com.landawn.ofbiz.model.content.DeleteSurveyRequest;
import com.landawn.ofbiz.model.content.DeleteSurveyResponse;
import com.landawn.ofbiz.model.content.GenerateBlogRssFeedResponse;
import com.landawn.ofbiz.model.content.GenerateMissingSeoUrlForWebsiteRequest;
import com.landawn.ofbiz.model.content.GenerateMissingSeoUrlForWebsiteResponse;
import com.landawn.ofbiz.model.content.LinkContentToPubPtResponse;
import com.landawn.ofbiz.model.content.PersistContentAndAssocRequest;
import com.landawn.ofbiz.model.content.PersistContentAndAssocResponse;
import com.landawn.ofbiz.model.content.RemoveCharacterSetRequest;
import com.landawn.ofbiz.model.content.RemoveCharacterSetResponse;
import com.landawn.ofbiz.model.content.RemoveContentApprovalRequest;
import com.landawn.ofbiz.model.content.RemoveContentApprovalResponse;
import com.landawn.ofbiz.model.content.RemoveContentAssocPredicateRequest;
import com.landawn.ofbiz.model.content.RemoveContentAssocPredicateResponse;
import com.landawn.ofbiz.model.content.RemoveContentAssocRequest;
import com.landawn.ofbiz.model.content.RemoveContentAssocResponse;
import com.landawn.ofbiz.model.content.RemoveContentAssocTypeRequest;
import com.landawn.ofbiz.model.content.RemoveContentAssocTypeResponse;
import com.landawn.ofbiz.model.content.RemoveContentAttributeRequest;
import com.landawn.ofbiz.model.content.RemoveContentAttributeResponse;
import com.landawn.ofbiz.model.content.RemoveContentMetaDataRequest;
import com.landawn.ofbiz.model.content.RemoveContentMetaDataResponse;
import com.landawn.ofbiz.model.content.RemoveContentOperationRequest;
import com.landawn.ofbiz.model.content.RemoveContentOperationResponse;
import com.landawn.ofbiz.model.content.RemoveContentPurposeOperationRequest;
import com.landawn.ofbiz.model.content.RemoveContentPurposeOperationResponse;
import com.landawn.ofbiz.model.content.RemoveContentPurposeRequest;
import com.landawn.ofbiz.model.content.RemoveContentPurposeResponse;
import com.landawn.ofbiz.model.content.RemoveContentPurposeTypeRequest;
import com.landawn.ofbiz.model.content.RemoveContentPurposeTypeResponse;
import com.landawn.ofbiz.model.content.RemoveContentRevisionItemRequest;
import com.landawn.ofbiz.model.content.RemoveContentRevisionItemResponse;
import com.landawn.ofbiz.model.content.RemoveContentRevisionRequest;
import com.landawn.ofbiz.model.content.RemoveContentRevisionResponse;
import com.landawn.ofbiz.model.content.RemoveContentRoleRequest;
import com.landawn.ofbiz.model.content.RemoveContentRoleResponse;
import com.landawn.ofbiz.model.content.RemoveContentTypeAttrRequest;
import com.landawn.ofbiz.model.content.RemoveContentTypeAttrResponse;
import com.landawn.ofbiz.model.content.RemoveContentTypeRequest;
import com.landawn.ofbiz.model.content.RemoveContentTypeResponse;
import com.landawn.ofbiz.model.content.RemoveDataCategoryRequest;
import com.landawn.ofbiz.model.content.RemoveDataCategoryResponse;
import com.landawn.ofbiz.model.content.RemoveDataResourceAttributeRequest;
import com.landawn.ofbiz.model.content.RemoveDataResourceAttributeResponse;
import com.landawn.ofbiz.model.content.RemoveDataResourceRoleRequest;
import com.landawn.ofbiz.model.content.RemoveDataResourceRoleResponse;
import com.landawn.ofbiz.model.content.RemoveDataResourceTypeAttrRequest;
import com.landawn.ofbiz.model.content.RemoveDataResourceTypeAttrResponse;
import com.landawn.ofbiz.model.content.RemoveDataResourceTypeRequest;
import com.landawn.ofbiz.model.content.RemoveDataResourceTypeResponse;
import com.landawn.ofbiz.model.content.RemoveElectronicTextRequest;
import com.landawn.ofbiz.model.content.RemoveElectronicTextResponse;
import com.landawn.ofbiz.model.content.RemoveFileExtensionRequest;
import com.landawn.ofbiz.model.content.RemoveFileExtensionResponse;
import com.landawn.ofbiz.model.content.RemoveMetaDataPredicateRequest;
import com.landawn.ofbiz.model.content.RemoveMetaDataPredicateResponse;
import com.landawn.ofbiz.model.content.RemoveMimeTypeHtmlTemplateRequest;
import com.landawn.ofbiz.model.content.RemoveMimeTypeHtmlTemplateResponse;
import com.landawn.ofbiz.model.content.RemoveMimeTypeRequest;
import com.landawn.ofbiz.model.content.RemoveMimeTypeResponse;
import com.landawn.ofbiz.model.content.RemoveWebSiteContentRequest;
import com.landawn.ofbiz.model.content.RemoveWebSiteContentResponse;
import com.landawn.ofbiz.model.content.RemoveWebSitePathAliasRequest;
import com.landawn.ofbiz.model.content.RemoveWebSitePathAliasResponse;
import com.landawn.ofbiz.model.content.RemoveWebSiteRoleRequest;
import com.landawn.ofbiz.model.content.RemoveWebSiteRoleResponse;
import com.landawn.ofbiz.model.content.UpdateBlogEntryRequest;
import com.landawn.ofbiz.model.content.UpdateBlogEntryResponse;
import com.landawn.ofbiz.model.content.UpdateCharacterSetRequest;
import com.landawn.ofbiz.model.content.UpdateCharacterSetResponse;
import com.landawn.ofbiz.model.content.UpdateContentAndUploadedFileRequest;
import com.landawn.ofbiz.model.content.UpdateContentAndUploadedFileResponse;
import com.landawn.ofbiz.model.content.UpdateContentApprovalRequest;
import com.landawn.ofbiz.model.content.UpdateContentApprovalResponse;
import com.landawn.ofbiz.model.content.UpdateContentAssocPredicateRequest;
import com.landawn.ofbiz.model.content.UpdateContentAssocPredicateResponse;
import com.landawn.ofbiz.model.content.UpdateContentAssocRequest;
import com.landawn.ofbiz.model.content.UpdateContentAssocResponse;
import com.landawn.ofbiz.model.content.UpdateContentAssocTypeRequest;
import com.landawn.ofbiz.model.content.UpdateContentAssocTypeResponse;
import com.landawn.ofbiz.model.content.UpdateContentAttributeRequest;
import com.landawn.ofbiz.model.content.UpdateContentAttributeResponse;
import com.landawn.ofbiz.model.content.UpdateContentMetaDataRequest;
import com.landawn.ofbiz.model.content.UpdateContentMetaDataResponse;
import com.landawn.ofbiz.model.content.UpdateContentOperationRequest;
import com.landawn.ofbiz.model.content.UpdateContentOperationResponse;
import com.landawn.ofbiz.model.content.UpdateContentPurposeOperationRequest;
import com.landawn.ofbiz.model.content.UpdateContentPurposeOperationResponse;
import com.landawn.ofbiz.model.content.UpdateContentPurposeRequest;
import com.landawn.ofbiz.model.content.UpdateContentPurposeResponse;
import com.landawn.ofbiz.model.content.UpdateContentPurposeTypeRequest;
import com.landawn.ofbiz.model.content.UpdateContentPurposeTypeResponse;
import com.landawn.ofbiz.model.content.UpdateContentRequest;
import com.landawn.ofbiz.model.content.UpdateContentResponse;
import com.landawn.ofbiz.model.content.UpdateContentRevisionItemRequest;
import com.landawn.ofbiz.model.content.UpdateContentRevisionItemResponse;
import com.landawn.ofbiz.model.content.UpdateContentRevisionRequest;
import com.landawn.ofbiz.model.content.UpdateContentRevisionResponse;
import com.landawn.ofbiz.model.content.UpdateContentRoleRequest;
import com.landawn.ofbiz.model.content.UpdateContentRoleResponse;
import com.landawn.ofbiz.model.content.UpdateContentTypeRequest;
import com.landawn.ofbiz.model.content.UpdateContentTypeResponse;
import com.landawn.ofbiz.model.content.UpdateDataCategoryRequest;
import com.landawn.ofbiz.model.content.UpdateDataCategoryResponse;
import com.landawn.ofbiz.model.content.UpdateDataResourceAttributeRequest;
import com.landawn.ofbiz.model.content.UpdateDataResourceAttributeResponse;
import com.landawn.ofbiz.model.content.UpdateDataResourceRequest;
import com.landawn.ofbiz.model.content.UpdateDataResourceResponse;
import com.landawn.ofbiz.model.content.UpdateDataResourceRoleRequest;
import com.landawn.ofbiz.model.content.UpdateDataResourceRoleResponse;
import com.landawn.ofbiz.model.content.UpdateDataResourceTypeRequest;
import com.landawn.ofbiz.model.content.UpdateDataResourceTypeResponse;
import com.landawn.ofbiz.model.content.UpdateElectronicTextRequest;
import com.landawn.ofbiz.model.content.UpdateElectronicTextResponse;
import com.landawn.ofbiz.model.content.UpdateFileExtensionRequest;
import com.landawn.ofbiz.model.content.UpdateFileExtensionResponse;
import com.landawn.ofbiz.model.content.UpdateMetaDataPredicateRequest;
import com.landawn.ofbiz.model.content.UpdateMetaDataPredicateResponse;
import com.landawn.ofbiz.model.content.UpdateMimeTypeHtmlTemplateRequest;
import com.landawn.ofbiz.model.content.UpdateMimeTypeHtmlTemplateResponse;
import com.landawn.ofbiz.model.content.UpdateMimeTypeRequest;
import com.landawn.ofbiz.model.content.UpdateMimeTypeResponse;
import com.landawn.ofbiz.model.content.UpdateSiteRolesResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyMultiRespColumnRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyMultiRespColumnResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyMultiRespRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyMultiRespResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyPageRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyPageResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionApplRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionApplResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionOptionRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionOptionResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyQuestionResponse;
import com.landawn.ofbiz.model.content.UpdateSurveyRequest;
import com.landawn.ofbiz.model.content.UpdateSurveyResponse;
import com.landawn.ofbiz.model.content.UpdateTextContentRequest;
import com.landawn.ofbiz.model.content.UpdateTextContentResponse;
import com.landawn.ofbiz.model.content.UpdateWebSiteContentRequest;
import com.landawn.ofbiz.model.content.UpdateWebSiteContentResponse;
import com.landawn.ofbiz.model.content.UpdateWebSitePathAliasRequest;
import com.landawn.ofbiz.model.content.UpdateWebSitePathAliasResponse;
import com.landawn.ofbiz.model.content.UpdateWebSiteRequest;
import com.landawn.ofbiz.model.content.UpdateWebSiteResponse;
import com.landawn.ofbiz.model.content.UpdateWebSiteRoleRequest;
import com.landawn.ofbiz.model.content.UpdateWebSiteRoleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/content")
public class ContentController {

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * No description.
     * <p>service: component://content/webapp/content/WEB-INF/events/OfbizContentUrlEvent.groovy  entities: unknown  auth: true
     */
    @GetMapping("/content/control/<@ofbizContentUrl>")
    public ResponseEntity<Map<String, Object>> componentContentWebappContentWEBINFEventsOfbizContentUrlEventGroovy(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite Content
     * <p>service: createWebSiteContent  entities: WebSiteContent  auth: true
     */
    @PostMapping("/content/control/CreateWebSiteContent")
    public ResponseEntity<CreateWebSiteContentResponse> createWebSiteContent(@RequestBody CreateWebSiteContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Content
     * <p>service: removeWebSiteContent  entities: WebSiteContent  auth: true
     */
    @PostMapping("/content/control/RemoveWebSiteContent")
    public ResponseEntity<RemoveWebSiteContentResponse> removeWebSiteContent(@RequestBody RemoveWebSiteContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite Content
     * <p>service: updateWebSiteContent  entities: WebSiteContent  auth: true
     */
    @PostMapping("/content/control/UpdateWebSiteContent")
    public ResponseEntity<UpdateWebSiteContentResponse> updateWebSiteContent(@RequestBody UpdateWebSiteContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: generateBlogRssFeed  entities: unknown  auth: true
     */
    @GetMapping("/content/control/ViewBlogRss")
    public ResponseEntity<GenerateBlogRssFeedResponse> generateBlogRssFeed(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: execute  entities: unknown  auth: true
     */
    @GetMapping("/content/control/WebSiteCmsPreview")
    public ResponseEntity<Map<String, Object>> execute(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CharacterSet
     * <p>service: createCharacterSet  entities: CharacterSet  auth: true
     */
    @PostMapping("/content/control/addCharacterSet")
    public ResponseEntity<CreateCharacterSetResponse> createCharacterSet(@RequestBody CreateCharacterSetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssocPredicate
     * <p>service: createContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/addContentAssocPredicate")
    public ResponseEntity<CreateContentAssocPredicateResponse> createContentAssocPredicate(@RequestBody CreateContentAssocPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssocType
     * <p>service: createContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/addContentAssocType")
    public ResponseEntity<CreateContentAssocTypeResponse> createContentAssocType(@RequestBody CreateContentAssocTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAttribute
     * <p>service: createContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/addContentAttribute")
    public ResponseEntity<CreateContentAttributeResponse> createContentAttribute(@RequestBody CreateContentAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentMetaData
     * <p>service: createContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/addContentMetaData")
    public ResponseEntity<CreateContentMetaDataResponse> createContentMetaData(@RequestBody CreateContentMetaDataRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentOperation
     * <p>service: createContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/addContentOperation")
    public ResponseEntity<CreateContentOperationResponse> createContentOperation(@RequestBody CreateContentOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurpose
     * <p>service: createContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/addContentPurpose")
    public ResponseEntity<CreateContentPurposeResponse> createContentPurpose(@RequestBody CreateContentPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurposeOperation
     * <p>service: createContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/addContentPurposeOperation")
    public ResponseEntity<CreateContentPurposeOperationResponse> createContentPurposeOperation(@RequestBody CreateContentPurposeOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurposeType
     * <p>service: createContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/addContentPurposeType")
    public ResponseEntity<CreateContentPurposeTypeResponse> createContentPurposeType(@RequestBody CreateContentPurposeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRole
     * <p>service: createContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/addContentRole")
    public ResponseEntity<CreateContentRoleResponse> createContentRole(@RequestBody CreateContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentType
     * <p>service: createContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/addContentType")
    public ResponseEntity<CreateContentTypeResponse> createContentType(@RequestBody CreateContentTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentTypeAttr
     * <p>service: createContentTypeAttr  entities: ContentTypeAttr  auth: true
     */
    @PostMapping("/content/control/addContentTypeAttr")
    public ResponseEntity<CreateContentTypeAttrResponse> createContentTypeAttr(@RequestBody CreateContentTypeAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataCategory
     * <p>service: createDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/addDataCategory")
    public ResponseEntity<CreateDataCategoryResponse> createDataCategory(@RequestBody CreateDataCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceAttribute
     * <p>service: createDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/addDataResourceAttribute")
    public ResponseEntity<CreateDataResourceAttributeResponse> createDataResourceAttribute(@RequestBody CreateDataResourceAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceRole
     * <p>service: createDataResourceRole  entities: DataResourceRole  auth: true
     */
    @PostMapping("/content/control/addDataResourceRole")
    public ResponseEntity<CreateDataResourceRoleResponse> createDataResourceRole(@RequestBody CreateDataResourceRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceType
     * <p>service: createDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/addDataResourceType")
    public ResponseEntity<CreateDataResourceTypeResponse> createDataResourceType(@RequestBody CreateDataResourceTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceTypeAttr
     * <p>service: createDataResourceTypeAttr  entities: DataResourceTypeAttr  auth: true
     */
    @PostMapping("/content/control/addDataResourceTypeAttr")
    public ResponseEntity<CreateDataResourceTypeAttrResponse> createDataResourceTypeAttr(@RequestBody CreateDataResourceTypeAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDocument  entities: unknown  auth: true
     */
    @GetMapping("/content/control/addDocumentToTree")
    public ResponseEntity<CreateDocumentResponse> createDocument(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ElectronicText
     * <p>service: createElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/addElectronicText")
    public ResponseEntity<CreateElectronicTextResponse> createElectronicText(@RequestBody CreateElectronicTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FileExtension
     * <p>service: createFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/addFileExtension")
    public ResponseEntity<CreateFileExtensionResponse> createFileExtension(@RequestBody CreateFileExtensionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ElectronicText
     * <p>service: createElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/addHtmlText")
    public ResponseEntity<CreateElectronicTextResponse> createElectronicTextAddHtmlText(@RequestBody CreateElectronicTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MetaDataPredicate
     * <p>service: createMetaDataPredicate  entities: MetaDataPredicate  auth: true
     */
    @PostMapping("/content/control/addMetaDataPredicate")
    public ResponseEntity<CreateMetaDataPredicateResponse> createMetaDataPredicate(@RequestBody CreateMetaDataPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MimeType
     * <p>service: createMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/addMimeType")
    public ResponseEntity<CreateMimeTypeResponse> createMimeType(@RequestBody CreateMimeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Auto Create Content Publish Points
     * <p>service: autoCreateWebSiteContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/autoCreateWebSiteContent")
    public ResponseEntity<AutoCreateWebSiteContentResponse> autoCreateWebSiteContent(@RequestBody AutoCreateWebSiteContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey and related entities from AcroForm
     * <p>service: buildSurveyFromPdf  entities: unknown  auth: true
     */
    @PostMapping("/content/control/buildSurveyFromPdf")
    public ResponseEntity<BuildSurveyFromPdfResponse> buildSurveyFromPdf(@RequestBody BuildSurveyFromPdfRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey and related entities from AcroForm
     * <p>service: buildSurveyResponseFromPdf  entities: unknown  auth: true
     */
    @PostMapping("/content/control/buildSurveyResponseFromPdf")
    public ResponseEntity<BuildSurveyResponseFromPdfResponse> buildSurveyResponseFromPdf(@RequestBody BuildSurveyResponseFromPdfRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: test  entities: unknown  auth: false
     */
    @GetMapping("/content/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: copyToClip  entities: unknown  auth: true
     */
    @GetMapping("/content/control/clipFindLayout")
    public ResponseEntity<Map<String, Object>> copyToClip(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: cloneLayout  entities: unknown  auth: true
     */
    @GetMapping("/content/control/cloneLayout")
    public ResponseEntity<Map<String, Object>> cloneLayout(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates content records for a blog entry
     * <p>service: createBlogEntry  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createBlogArticle")
    public ResponseEntity<CreateBlogEntryResponse> createBlogEntry(@RequestBody CreateBlogEntryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Text Document DataResource and Content Records
     * <p>service: createTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createBlogResponse")
    public ResponseEntity<CreateTextContentResponse> createTextContent(@RequestBody CreateTextContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContent")
    public ResponseEntity<CreateContentResponse> createContent(@RequestBody CreateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentApproval
     * <p>service: createContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/createContentApproval")
    public ResponseEntity<CreateContentApprovalResponse> createContentApproval(@RequestBody CreateContentApprovalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssoc
     * <p>service: createContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContentAssoc")
    public ResponseEntity<CreateContentAssocResponse> createContentAssoc(@RequestBody CreateContentAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContentCms")
    public ResponseEntity<CreateContentResponse> createContentCreateContentCms(@RequestBody CreateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentKeyword
     * <p>service: createContentKeyword  entities: ContentKeyword  auth: true
     */
    @PostMapping("/content/control/createContentKeyword")
    public ResponseEntity<CreateContentKeywordResponse> createContentKeyword(@RequestBody CreateContentKeywordRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRevision
     * <p>service: createContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/createContentRevision")
    public ResponseEntity<CreateContentRevisionResponse> createContentRevision(@RequestBody CreateContentRevisionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRevisionItem
     * <p>service: createContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/createContentRevisionItem")
    public ResponseEntity<CreateContentRevisionItemResponse> createContentRevisionItem(@RequestBody CreateContentRevisionItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: persistDataResource  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createDataResource")
    public ResponseEntity<Map<String, Object>> persistDataResource(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResource and link this data to the content present
     * <p>service: createDataResourceAndAssocToContent  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/createDataResourceAndAssocToContent")
    public ResponseEntity<CreateDataResourceAndAssocToContentResponse> createDataResourceAndAssocToContent(@RequestBody CreateDataResourceAndAssocToContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResource and, possibly, ElectronicText or ImageDataResource
     * <p>service: createDataResourceAndText  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/createDataResourceAndText")
    public ResponseEntity<CreateDataResourceAndTextResponse> createDataResourceAndText(@RequestBody CreateDataResourceAndTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductFeature-DataResource
     * <p>service: createProductFeatureDataResource  entities: ProductFeatureDataResource  auth: true
     */
    @PostMapping("/content/control/createDataResourceProductFeature")
    public ResponseEntity<Map<String, Object>> createProductFeatureDataResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResource
     * <p>service: createDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/createDataResourceUpload")
    public ResponseEntity<CreateDataResourceResponse> createDataResource(@RequestBody CreateDataResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/createForum")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssoc(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createForumGroup")
    public ResponseEntity<CreateContentResponse> createContentCreateForumGroup(@RequestBody CreateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurpose
     * <p>service: createContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/createForumGroupPurpose")
    public ResponseEntity<CreateContentPurposeResponse> createContentPurposeCreateForumGroupPurpose(@RequestBody CreateContentPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRole
     * <p>service: createContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/createForumGroupRole")
    public ResponseEntity<CreateContentRoleResponse> createContentRoleCreateForumGroupRole(@RequestBody CreateContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayout  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayout")
    public ResponseEntity<Map<String, Object>> createLayout(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayoutText  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayoutHtml")
    public ResponseEntity<Map<String, Object>> createLayoutText(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayoutImage  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayoutImage")
    public ResponseEntity<Map<String, Object>> createLayoutImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayoutSubContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayoutSubContent")
    public ResponseEntity<Map<String, Object>> createLayoutSubContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayoutText  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayoutText")
    public ResponseEntity<Map<String, Object>> createLayoutTextCreateLayoutText(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createLayoutUrl  entities: unknown  auth: true
     */
    @GetMapping("/content/control/createLayoutUrl")
    public ResponseEntity<Map<String, Object>> createLayoutUrl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MimeTypeHtmlTemplate
     * <p>service: createMimeTypeHtmlTemplate  entities: MimeTypeHtmlTemplate  auth: true
     */
    @PostMapping("/content/control/createMimeTypeHtmlTemplate")
    public ResponseEntity<CreateMimeTypeHtmlTemplateResponse> createMimeTypeHtmlTemplate(@RequestBody CreateMimeTypeHtmlTemplateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Accepts file upload, creates DataResource and Content records.
     * <p>service: createContentFromUploadedFile  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createObjectContentCms")
    public ResponseEntity<CreateContentFromUploadedFileResponse> createContentFromUploadedFile(@RequestBody CreateContentFromUploadedFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey
     * <p>service: createSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/createSurvey")
    public ResponseEntity<CreateSurveyResponse> createSurvey(@RequestBody CreateSurveyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyMultiResp; surveyMultiRespId will be auto-sequenced
     * <p>service: createSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/createSurveyMultiResp")
    public ResponseEntity<CreateSurveyMultiRespResponse> createSurveyMultiResp(@RequestBody CreateSurveyMultiRespRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyMultiRespColumn; surveyMultiRespColId will be auto-sequenced
     * <p>service: createSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/createSurveyMultiRespColumn")
    public ResponseEntity<CreateSurveyMultiRespColumnResponse> createSurveyMultiRespColumn(@RequestBody CreateSurveyMultiRespColumnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyPage; the surveyPageSeqId will be auto-generated
     * <p>service: createSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/createSurveyPage")
    public ResponseEntity<CreateSurveyPageResponse> createSurveyPage(@RequestBody CreateSurveyPageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestion
     * <p>service: createSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestion")
    public ResponseEntity<CreateSurveyQuestionResponse> createSurveyQuestion(@RequestBody CreateSurveyQuestionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionAppl
     * <p>service: createSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionAppl")
    public ResponseEntity<CreateSurveyQuestionApplResponse> createSurveyQuestionAppl(@RequestBody CreateSurveyQuestionApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionCategory
     * <p>service: createSurveyQuestionCategory  entities: SurveyQuestionCategory  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionCategory")
    public ResponseEntity<CreateSurveyQuestionCategoryResponse> createSurveyQuestionCategory(@RequestBody CreateSurveyQuestionCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionOption
     * <p>service: createSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionOption")
    public ResponseEntity<CreateSurveyQuestionOptionResponse> createSurveyQuestionOption(@RequestBody CreateSurveyQuestionOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Text Document DataResource and Content Records
     * <p>service: createTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createTextContentCms")
    public ResponseEntity<CreateTextContentResponse> createTextContentCreateTextContentCms(@RequestBody CreateTextContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebAnalyticsConfig
     * <p>service: createWebAnalyticsConfig  entities: WebAnalyticsConfig  auth: true
     */
    @PostMapping("/content/control/createWebAnalyticsConfig")
    public ResponseEntity<Map<String, Object>> createWebAnalyticsConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite
     * <p>service: createWebSite  entities: WebSite  auth: true
     */
    @PostMapping("/content/control/createWebSite")
    public ResponseEntity<CreateWebSiteResponse> createWebSite(@RequestBody CreateWebSiteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/content/control/createWebSiteContactList")
    public ResponseEntity<Map<String, Object>> createWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Text Document DataResource and Content Records
     * <p>service: createTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createWebSiteMetaInfoJson")
    public ResponseEntity<CreateTextContentResponse> createTextContentCreateWebSiteMetaInfoJson(@RequestBody CreateTextContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite Path Alias
     * <p>service: createWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/createWebSitePathAlias")
    public ResponseEntity<CreateWebSitePathAliasResponse> createWebSitePathAlias(@RequestBody CreateWebSitePathAliasRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite Path Alias
     * <p>service: createWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/createWebSitePathAliasJson")
    public ResponseEntity<CreateWebSitePathAliasResponse> createWebSitePathAliasCreateWebSitePathAliasJson(@RequestBody CreateWebSitePathAliasRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add WebSite Role
     * <p>service: createWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/createWebSiteRole")
    public ResponseEntity<CreateWebSiteRoleResponse> createWebSiteRole(@RequestBody CreateWebSiteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Work Effort Content
     * <p>service: createWorkEffortContent  entities: WorkEffortContent  auth: true
     */
    @PostMapping("/content/control/createWorkEffortContent")
    public ResponseEntity<Map<String, Object>> createWorkEffortContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/deleteContentJson")
    public ResponseEntity<Map<String, Object>> deleteContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ContentKeyword
     * <p>service: deleteContentKeyword  entities: ContentKeyword  auth: true
     */
    @PostMapping("/content/control/deleteContentKeyword")
    public ResponseEntity<DeleteContentKeywordResponse> deleteContentKeyword(@RequestBody DeleteContentKeywordRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete all the keywords of a content
     * <p>service: deleteContentKeywords  entities: unknown  auth: true
     */
    @PostMapping("/content/control/deleteContentKeywords")
    public ResponseEntity<DeleteContentKeywordsResponse> deleteContentKeywords(@RequestBody DeleteContentKeywordsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurpose
     * <p>service: removeContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/deleteForumGroupPurpose")
    public ResponseEntity<RemoveContentPurposeResponse> removeContentPurpose(@RequestBody RemoveContentPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRole
     * <p>service: removeContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/deleteForumGroupRole")
    public ResponseEntity<RemoveContentRoleResponse> removeContentRole(@RequestBody RemoveContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Survey
     * <p>service: deleteSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/deleteSurvey")
    public ResponseEntity<DeleteSurveyResponse> deleteSurvey(@RequestBody DeleteSurveyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyMultiResp
     * <p>service: deleteSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/deleteSurveyMultiResp")
    public ResponseEntity<DeleteSurveyMultiRespResponse> deleteSurveyMultiResp(@RequestBody DeleteSurveyMultiRespRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyMultiRespColumn
     * <p>service: deleteSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/deleteSurveyMultiRespColumn")
    public ResponseEntity<DeleteSurveyMultiRespColumnResponse> deleteSurveyMultiRespColumn(@RequestBody DeleteSurveyMultiRespColumnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestion
     * <p>service: deleteSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/deleteSurveyQuestion")
    public ResponseEntity<DeleteSurveyQuestionResponse> deleteSurveyQuestion(@RequestBody DeleteSurveyQuestionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestionOption
     * <p>service: deleteSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/deleteSurveyQuestionOption")
    public ResponseEntity<DeleteSurveyQuestionOptionResponse> deleteSurveyQuestionOption(@RequestBody DeleteSurveyQuestionOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a WebAnalyticsConfig
     * <p>service: deleteWebAnalyticsConfig  entities: WebAnalyticsConfig  auth: true
     */
    @PostMapping("/content/control/deleteWebAnalyticsConfig")
    public ResponseEntity<Map<String, Object>> deleteWebAnalyticsConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/content/control/deleteWebSiteContactList")
    public ResponseEntity<Map<String, Object>> deleteWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Work Effort Content
     * <p>service: deleteWorkEffortContent  entities: WorkEffortContent  auth: true
     */
    @PostMapping("/content/control/deleteWorkEffortContent")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Generate Missing Seo URL's for Website
     * <p>service: generateMissingSeoUrlForWebsite  entities: unknown  auth: true
     */
    @PostMapping("/content/control/generateMissingSeoUrlForWebsite")
    public ResponseEntity<GenerateMissingSeoUrlForWebsiteResponse> generateMissingSeoUrlForWebsite(@RequestBody GenerateMissingSeoUrlForWebsiteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getContentAssocs  entities: unknown  auth: true
     */
    @GetMapping("/content/control/getContentAssocsJson")
    public ResponseEntity<Map<String, Object>> getContentAssocs(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: serveImage  entities: unknown  auth: true
     */
    @GetMapping("/content/control/img")
    public ResponseEntity<Map<String, Object>> serveImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: linkContentToPubPt  entities: unknown  auth: true
     */
    @GetMapping("/content/control/linkContentToPubPt")
    public ResponseEntity<LinkContentToPubPtResponse> linkContentToPubPt(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: moveContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/moveContentJson")
    public ResponseEntity<Map<String, Object>> moveContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/newBlog")
    public ResponseEntity<CreateContentResponse> createContentNewBlog(@RequestBody CreateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: pasteSubContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/pasteSubContent")
    public ResponseEntity<Map<String, Object>> pasteSubContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistBlogImage")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistBlogImage(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistBlogSummary")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistBlogSummary(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistBlogText")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistBlogText(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistContent")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistContent(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistContentStuff")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistContentStuff(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: uploadContentAndImage  entities: unknown  auth: true
     */
    @GetMapping("/content/control/persistImage")
    public ResponseEntity<Map<String, Object>> uploadContentAndImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistSubContentStuff")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPersistSubContentStuff(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/postNewSubSite")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocPostNewSubSite(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/publishResponse")
    public ResponseEntity<UpdateContentResponse> updateContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove CharacterSet
     * <p>service: removeCharacterSet  entities: CharacterSet  auth: true
     */
    @PostMapping("/content/control/removeCharacterSet")
    public ResponseEntity<RemoveCharacterSetResponse> removeCharacterSet(@RequestBody RemoveCharacterSetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentApproval
     * <p>service: removeContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/removeContentApproval")
    public ResponseEntity<RemoveContentApprovalResponse> removeContentApproval(@RequestBody RemoveContentApprovalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeContentAssoc")
    public ResponseEntity<RemoveContentAssocResponse> removeContentAssoc(@RequestBody RemoveContentAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssocPredicate
     * <p>service: removeContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/removeContentAssocPredicate")
    public ResponseEntity<RemoveContentAssocPredicateResponse> removeContentAssocPredicate(@RequestBody RemoveContentAssocPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssocType
     * <p>service: removeContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/removeContentAssocType")
    public ResponseEntity<RemoveContentAssocTypeResponse> removeContentAssocType(@RequestBody RemoveContentAssocTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAttribute
     * <p>service: removeContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/removeContentAttribute")
    public ResponseEntity<RemoveContentAttributeResponse> removeContentAttribute(@RequestBody RemoveContentAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentMetaData
     * <p>service: removeContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/removeContentMetaData")
    public ResponseEntity<RemoveContentMetaDataResponse> removeContentMetaData(@RequestBody RemoveContentMetaDataRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentOperation
     * <p>service: removeContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/removeContentOperation")
    public ResponseEntity<RemoveContentOperationResponse> removeContentOperation(@RequestBody RemoveContentOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurpose
     * <p>service: removeContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/removeContentPurpose")
    public ResponseEntity<RemoveContentPurposeResponse> removeContentPurposeRemoveContentPurpose(@RequestBody RemoveContentPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurposeOperation
     * <p>service: removeContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/removeContentPurposeOperation")
    public ResponseEntity<RemoveContentPurposeOperationResponse> removeContentPurposeOperation(@RequestBody RemoveContentPurposeOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurposeType
     * <p>service: removeContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/removeContentPurposeType")
    public ResponseEntity<RemoveContentPurposeTypeResponse> removeContentPurposeType(@RequestBody RemoveContentPurposeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRevision
     * <p>service: removeContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/removeContentRevision")
    public ResponseEntity<RemoveContentRevisionResponse> removeContentRevision(@RequestBody RemoveContentRevisionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRevisionItem
     * <p>service: removeContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/removeContentRevisionItem")
    public ResponseEntity<RemoveContentRevisionItemResponse> removeContentRevisionItem(@RequestBody RemoveContentRevisionItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRole
     * <p>service: removeContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/removeContentRole")
    public ResponseEntity<RemoveContentRoleResponse> removeContentRoleRemoveContentRole(@RequestBody RemoveContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentType
     * <p>service: removeContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/removeContentType")
    public ResponseEntity<RemoveContentTypeResponse> removeContentType(@RequestBody RemoveContentTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentTypeAttr
     * <p>service: removeContentTypeAttr  entities: ContentTypeAttr  auth: true
     */
    @PostMapping("/content/control/removeContentTypeAttr")
    public ResponseEntity<RemoveContentTypeAttrResponse> removeContentTypeAttr(@RequestBody RemoveContentTypeAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataCategory
     * <p>service: removeDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/removeDataCategory")
    public ResponseEntity<RemoveDataCategoryResponse> removeDataCategory(@RequestBody RemoveDataCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceAttribute
     * <p>service: removeDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/removeDataResourceAttribute")
    public ResponseEntity<RemoveDataResourceAttributeResponse> removeDataResourceAttribute(@RequestBody RemoveDataResourceAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductFeature-DataResource
     * <p>service: removeProductFeatureDataResource  entities: ProductFeatureDataResource  auth: true
     */
    @PostMapping("/content/control/removeDataResourceProductFeature")
    public ResponseEntity<Map<String, Object>> removeProductFeatureDataResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceRole
     * <p>service: removeDataResourceRole  entities: DataResourceRole  auth: true
     */
    @PostMapping("/content/control/removeDataResourceRole")
    public ResponseEntity<RemoveDataResourceRoleResponse> removeDataResourceRole(@RequestBody RemoveDataResourceRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceType
     * <p>service: removeDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/removeDataResourceType")
    public ResponseEntity<RemoveDataResourceTypeResponse> removeDataResourceType(@RequestBody RemoveDataResourceTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceTypeAttr
     * <p>service: removeDataResourceTypeAttr  entities: DataResourceTypeAttr  auth: true
     */
    @PostMapping("/content/control/removeDataResourceTypeAttr")
    public ResponseEntity<RemoveDataResourceTypeAttrResponse> removeDataResourceTypeAttr(@RequestBody RemoveDataResourceTypeAttrRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeDocumentFromTree")
    public ResponseEntity<RemoveContentAssocResponse> removeContentAssocRemoveDocumentFromTree(@RequestBody RemoveContentAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ElectronicText
     * <p>service: removeElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/removeElectronicText")
    public ResponseEntity<RemoveElectronicTextResponse> removeElectronicText(@RequestBody RemoveElectronicTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove FileExtension
     * <p>service: removeFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/removeFileExtension")
    public ResponseEntity<RemoveFileExtensionResponse> removeFileExtension(@RequestBody RemoveFileExtensionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeLayout")
    public ResponseEntity<RemoveContentAssocResponse> removeContentAssocRemoveLayout(@RequestBody RemoveContentAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MetaDataPredicate
     * <p>service: removeMetaDataPredicate  entities: MetaDataPredicate  auth: true
     */
    @PostMapping("/content/control/removeMetaDataPredicate")
    public ResponseEntity<RemoveMetaDataPredicateResponse> removeMetaDataPredicate(@RequestBody RemoveMetaDataPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MimeType
     * <p>service: removeMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/removeMimeType")
    public ResponseEntity<RemoveMimeTypeResponse> removeMimeType(@RequestBody RemoveMimeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MimeTypeHtmlTemplate
     * <p>service: removeMimeTypeHtmlTemplate  entities: MimeTypeHtmlTemplate  auth: true
     */
    @PostMapping("/content/control/removeMimeTypeHtmlTemplate")
    public ResponseEntity<RemoveMimeTypeHtmlTemplateResponse> removeMimeTypeHtmlTemplate(@RequestBody RemoveMimeTypeHtmlTemplateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Supply thruDate to all ContentAssoc that come "before" current one
     * <p>service: deactivateAssocs  entities: unknown  auth: true
     */
    @PostMapping("/content/control/removeSite")
    public ResponseEntity<DeactivateAssocsResponse> deactivateAssocs(@RequestBody DeactivateAssocsRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyPage
     * <p>service: deleteSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/removeSurveyPage")
    public ResponseEntity<DeleteSurveyPageResponse> deleteSurveyPage(@RequestBody DeleteSurveyPageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestionAppl
     * <p>service: deleteSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/removeSurveyQuestionAppl")
    public ResponseEntity<DeleteSurveyQuestionApplResponse> deleteSurveyQuestionAppl(@RequestBody DeleteSurveyQuestionApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Path Alias
     * <p>service: removeWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/removeWebSitePathAlias")
    public ResponseEntity<RemoveWebSitePathAliasResponse> removeWebSitePathAlias(@RequestBody RemoveWebSitePathAliasRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Path Alias
     * <p>service: removeWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/removeWebSitePathAliasJson")
    public ResponseEntity<RemoveWebSitePathAliasResponse> removeWebSitePathAliasRemoveWebSitePathAliasJson(@RequestBody RemoveWebSitePathAliasRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove WebSite Role
     * <p>service: removeWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/removeWebSiteRole")
    public ResponseEntity<RemoveWebSiteRoleResponse> removeWebSiteRole(@RequestBody RemoveWebSiteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: replaceSubContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/replaceSubContent")
    public ResponseEntity<Map<String, Object>> replaceSubContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateBlog")
    public ResponseEntity<UpdateContentResponse> updateContentUpdateBlog(@RequestBody UpdateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates content records for a blog entry
     * <p>service: updateBlogEntry  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateBlogArticle")
    public ResponseEntity<UpdateBlogEntryResponse> updateBlogEntry(@RequestBody UpdateBlogEntryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Text Document DataResource and Content Records
     * <p>service: updateTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateBlogResponse")
    public ResponseEntity<UpdateTextContentResponse> updateTextContent(@RequestBody UpdateTextContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CharacterSet
     * <p>service: updateCharacterSet  entities: CharacterSet  auth: true
     */
    @PostMapping("/content/control/updateCharacterSet")
    public ResponseEntity<UpdateCharacterSetResponse> updateCharacterSet(@RequestBody UpdateCharacterSetRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateContent")
    public ResponseEntity<UpdateContentResponse> updateContentUpdateContent(@RequestBody UpdateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateAllContentKeywords  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateContentAllKeywords")
    public ResponseEntity<Map<String, Object>> updateAllContentKeywords(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentApproval
     * <p>service: updateContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/updateContentApproval")
    public ResponseEntity<UpdateContentApprovalResponse> updateContentApproval(@RequestBody UpdateContentApprovalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentApproval
     * <p>service: updateContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/updateContentApprovalStatus")
    public ResponseEntity<UpdateContentApprovalResponse> updateContentApprovalUpdateContentApprovalStatus(@RequestBody UpdateContentApprovalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssoc
     * <p>service: updateContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/updateContentAssoc")
    public ResponseEntity<UpdateContentAssocResponse> updateContentAssoc(@RequestBody UpdateContentAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssocPredicate
     * <p>service: updateContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/updateContentAssocPredicate")
    public ResponseEntity<UpdateContentAssocPredicateResponse> updateContentAssocPredicate(@RequestBody UpdateContentAssocPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssocType
     * <p>service: updateContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/updateContentAssocType")
    public ResponseEntity<UpdateContentAssocTypeResponse> updateContentAssocType(@RequestBody UpdateContentAssocTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAttribute
     * <p>service: updateContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/updateContentAttribute")
    public ResponseEntity<UpdateContentAttributeResponse> updateContentAttribute(@RequestBody UpdateContentAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateContentCms")
    public ResponseEntity<UpdateContentResponse> updateContentUpdateContentCms(@RequestBody UpdateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentMetaData
     * <p>service: updateContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/updateContentMetaData")
    public ResponseEntity<UpdateContentMetaDataResponse> updateContentMetaData(@RequestBody UpdateContentMetaDataRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentOperation
     * <p>service: updateContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/updateContentOperation")
    public ResponseEntity<UpdateContentOperationResponse> updateContentOperation(@RequestBody UpdateContentOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurpose
     * <p>service: updateContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/updateContentPurpose")
    public ResponseEntity<UpdateContentPurposeResponse> updateContentPurpose(@RequestBody UpdateContentPurposeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurposeOperation
     * <p>service: updateContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/updateContentPurposeOperation")
    public ResponseEntity<UpdateContentPurposeOperationResponse> updateContentPurposeOperation(@RequestBody UpdateContentPurposeOperationRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurposeType
     * <p>service: updateContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/updateContentPurposeType")
    public ResponseEntity<UpdateContentPurposeTypeResponse> updateContentPurposeType(@RequestBody UpdateContentPurposeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRevision
     * <p>service: updateContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/updateContentRevision")
    public ResponseEntity<UpdateContentRevisionResponse> updateContentRevision(@RequestBody UpdateContentRevisionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRevisionItem
     * <p>service: updateContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/updateContentRevisionItem")
    public ResponseEntity<UpdateContentRevisionItemResponse> updateContentRevisionItem(@RequestBody UpdateContentRevisionItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRole
     * <p>service: updateContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/updateContentRole")
    public ResponseEntity<UpdateContentRoleResponse> updateContentRole(@RequestBody UpdateContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentType
     * <p>service: updateContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/updateContentType")
    public ResponseEntity<UpdateContentTypeResponse> updateContentType(@RequestBody UpdateContentTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataCategory
     * <p>service: updateDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/updateDataCategory")
    public ResponseEntity<UpdateDataCategoryResponse> updateDataCategory(@RequestBody UpdateDataCategoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResource
     * <p>service: updateDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/updateDataResource")
    public ResponseEntity<UpdateDataResourceResponse> updateDataResource(@RequestBody UpdateDataResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceAttribute
     * <p>service: updateDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/updateDataResourceAttribute")
    public ResponseEntity<UpdateDataResourceAttributeResponse> updateDataResourceAttribute(@RequestBody UpdateDataResourceAttributeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceRole
     * <p>service: updateDataResourceRole  entities: DataResourceRole  auth: true
     */
    @PostMapping("/content/control/updateDataResourceRole")
    public ResponseEntity<UpdateDataResourceRoleResponse> updateDataResourceRole(@RequestBody UpdateDataResourceRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResource
     * <p>service: updateDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/updateDataResourceText")
    public ResponseEntity<UpdateDataResourceResponse> updateDataResourceUpdateDataResourceText(@RequestBody UpdateDataResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceType
     * <p>service: updateDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/updateDataResourceType")
    public ResponseEntity<UpdateDataResourceTypeResponse> updateDataResourceType(@RequestBody UpdateDataResourceTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateDocumentTree")
    public ResponseEntity<UpdateContentResponse> updateContentUpdateDocumentTree(@RequestBody UpdateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ElectronicText
     * <p>service: updateElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateElectronicText")
    public ResponseEntity<UpdateElectronicTextResponse> updateElectronicText(@RequestBody UpdateElectronicTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createOrRemoveProductFeatureDataResource  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateFeatures")
    public ResponseEntity<CreateOrRemoveProductFeatureDataResourceResponse> createOrRemoveProductFeatureDataResource(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FileExtension
     * <p>service: updateFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/updateFileExtension")
    public ResponseEntity<UpdateFileExtensionResponse> updateFileExtension(@RequestBody UpdateFileExtensionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForum")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocUpdateForum(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateForumGroup")
    public ResponseEntity<UpdateContentResponse> updateContentUpdateForumGroup(@RequestBody UpdateContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRole
     * <p>service: updateContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/updateForumGroupRole")
    public ResponseEntity<UpdateContentRoleResponse> updateContentRoleUpdateForumGroupRole(@RequestBody UpdateContentRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForumMessage")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocUpdateForumMessage(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForumThreadMessage")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocUpdateForumThreadMessage(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ElectronicText
     * <p>service: updateElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateHtmlText")
    public ResponseEntity<UpdateElectronicTextResponse> updateElectronicTextUpdateHtmlText(@RequestBody UpdateElectronicTextRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayout  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayout")
    public ResponseEntity<Map<String, Object>> updateLayout(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutText  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutHtml")
    public ResponseEntity<Map<String, Object>> updateLayoutText(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutImage  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutImage")
    public ResponseEntity<Map<String, Object>> updateLayoutImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutImageOnly  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutImageOnly")
    public ResponseEntity<Map<String, Object>> updateLayoutImageOnly(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutSubContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutSubContent")
    public ResponseEntity<Map<String, Object>> updateLayoutSubContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutText  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutText")
    public ResponseEntity<Map<String, Object>> updateLayoutTextUpdateLayoutText(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateLayoutUrl  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateLayoutUrl")
    public ResponseEntity<Map<String, Object>> updateLayoutUrl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MetaDataPredicate
     * <p>service: updateMetaDataPredicate  entities: MetaDataPredicate  auth: true
     */
    @PostMapping("/content/control/updateMetaDataPredicate")
    public ResponseEntity<UpdateMetaDataPredicateResponse> updateMetaDataPredicate(@RequestBody UpdateMetaDataPredicateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MimeType
     * <p>service: updateMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/updateMimeType")
    public ResponseEntity<UpdateMimeTypeResponse> updateMimeType(@RequestBody UpdateMimeTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MimeTypeHtmlTemplate
     * <p>service: updateMimeTypeHtmlTemplate  entities: MimeTypeHtmlTemplate  auth: true
     */
    @PostMapping("/content/control/updateMimeTypeHtmlTemplate")
    public ResponseEntity<UpdateMimeTypeHtmlTemplateResponse> updateMimeTypeHtmlTemplate(@RequestBody UpdateMimeTypeHtmlTemplateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Accepts file upload, updates DataResource and Content records.
     * <p>service: updateContentAndUploadedFile  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateObjectContentCms")
    public ResponseEntity<UpdateContentAndUploadedFileResponse> updateContentAndUploadedFile(@RequestBody UpdateContentAndUploadedFileRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSiteRoles  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateSiteRoles")
    public ResponseEntity<UpdateSiteRolesResponse> updateSiteRoles(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Survey
     * <p>service: updateSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/updateSurvey")
    public ResponseEntity<UpdateSurveyResponse> updateSurvey(@RequestBody UpdateSurveyRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyMultiResp
     * <p>service: updateSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/updateSurveyMultiResp")
    public ResponseEntity<UpdateSurveyMultiRespResponse> updateSurveyMultiResp(@RequestBody UpdateSurveyMultiRespRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyMultiRespColumn
     * <p>service: updateSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/updateSurveyMultiRespColumn")
    public ResponseEntity<UpdateSurveyMultiRespColumnResponse> updateSurveyMultiRespColumn(@RequestBody UpdateSurveyMultiRespColumnRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyPage
     * <p>service: updateSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/updateSurveyPage")
    public ResponseEntity<UpdateSurveyPageResponse> updateSurveyPage(@RequestBody UpdateSurveyPageRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestion
     * <p>service: updateSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestion")
    public ResponseEntity<UpdateSurveyQuestionResponse> updateSurveyQuestion(@RequestBody UpdateSurveyQuestionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestionAppl
     * <p>service: updateSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestionAppl")
    public ResponseEntity<UpdateSurveyQuestionApplResponse> updateSurveyQuestionAppl(@RequestBody UpdateSurveyQuestionApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestionOption
     * <p>service: updateSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestionOption")
    public ResponseEntity<UpdateSurveyQuestionOptionResponse> updateSurveyQuestionOption(@RequestBody UpdateSurveyQuestionOptionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey Response w/ Response Answers
     * <p>service: createSurveyResponse  entities: SurveyResponse  auth: true
     */
    @PostMapping("/content/control/updateSurveyResponse")
    public ResponseEntity<CreateSurveyResponseResponse> createSurveyResponse(@RequestBody CreateSurveyResponseRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Text Document DataResource and Content Records
     * <p>service: updateTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateTextContentCms")
    public ResponseEntity<UpdateTextContentResponse> updateTextContentUpdateTextContentCms(@RequestBody UpdateTextContentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentApproval
     * <p>service: updateContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/updateWaitingContentApproval")
    public ResponseEntity<UpdateContentApprovalResponse> updateContentApprovalUpdateWaitingContentApproval(@RequestBody UpdateContentApprovalRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebAnalyticsConfig
     * <p>service: updateWebAnalyticsConfig  entities: WebAnalyticsConfig  auth: true
     */
    @PostMapping("/content/control/updateWebAnalyticsConfig")
    public ResponseEntity<Map<String, Object>> updateWebAnalyticsConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite
     * <p>service: updateWebSite  entities: WebSite  auth: true
     */
    @PostMapping("/content/control/updateWebSite")
    public ResponseEntity<UpdateWebSiteResponse> updateWebSite(@RequestBody UpdateWebSiteRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateWebSiteContactList  entities: WebSiteContactList  auth: false
     */
    @PostMapping("/content/control/updateWebSiteContactList")
    public ResponseEntity<Map<String, Object>> updateWebSiteContactList(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResource
     * <p>service: updateDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/updateWebSiteMetaInfoJson")
    public ResponseEntity<UpdateDataResourceResponse> updateDataResourceUpdateWebSiteMetaInfoJson(@RequestBody UpdateDataResourceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite Path Alias
     * <p>service: updateWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/updateWebSitePathAlias")
    public ResponseEntity<UpdateWebSitePathAliasResponse> updateWebSitePathAlias(@RequestBody UpdateWebSitePathAliasRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add WebSite Role
     * <p>service: updateWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/updateWebSiteRole")
    public ResponseEntity<UpdateWebSiteRoleResponse> updateWebSiteRole(@RequestBody UpdateWebSiteRoleRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Work Effort Content
     * <p>service: updateWorkEffortContent  entities: WorkEffortContent  auth: true
     */
    @PostMapping("/content/control/updateWorkEffortContent")
    public ResponseEntity<Map<String, Object>> updateWorkEffortContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/uploadImage")
    public ResponseEntity<PersistContentAndAssocResponse> persistContentAndAssocUploadImage(@RequestBody PersistContentAndAssocRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
