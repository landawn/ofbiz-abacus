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
@RequestMapping("/content")
public class ContentController {

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
    public ResponseEntity<Map<String, Object>> createWebSiteContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Content
     * <p>service: removeWebSiteContent  entities: WebSiteContent  auth: true
     */
    @PostMapping("/content/control/RemoveWebSiteContent")
    public ResponseEntity<Map<String, Object>> removeWebSiteContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite Content
     * <p>service: updateWebSiteContent  entities: WebSiteContent  auth: true
     */
    @PostMapping("/content/control/UpdateWebSiteContent")
    public ResponseEntity<Map<String, Object>> updateWebSiteContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: generateBlogRssFeed  entities: unknown  auth: true
     */
    @GetMapping("/content/control/ViewBlogRss")
    public ResponseEntity<Map<String, Object>> generateBlogRssFeed(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> createCharacterSet(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssocPredicate
     * <p>service: createContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/addContentAssocPredicate")
    public ResponseEntity<Map<String, Object>> createContentAssocPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssocType
     * <p>service: createContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/addContentAssocType")
    public ResponseEntity<Map<String, Object>> createContentAssocType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAttribute
     * <p>service: createContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/addContentAttribute")
    public ResponseEntity<Map<String, Object>> createContentAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentMetaData
     * <p>service: createContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/addContentMetaData")
    public ResponseEntity<Map<String, Object>> createContentMetaData(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentOperation
     * <p>service: createContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/addContentOperation")
    public ResponseEntity<Map<String, Object>> createContentOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurpose
     * <p>service: createContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/addContentPurpose")
    public ResponseEntity<Map<String, Object>> createContentPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurposeOperation
     * <p>service: createContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/addContentPurposeOperation")
    public ResponseEntity<Map<String, Object>> createContentPurposeOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurposeType
     * <p>service: createContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/addContentPurposeType")
    public ResponseEntity<Map<String, Object>> createContentPurposeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRole
     * <p>service: createContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/addContentRole")
    public ResponseEntity<Map<String, Object>> createContentRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentType
     * <p>service: createContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/addContentType")
    public ResponseEntity<Map<String, Object>> createContentType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentTypeAttr
     * <p>service: createContentTypeAttr  entities: ContentTypeAttr  auth: true
     */
    @PostMapping("/content/control/addContentTypeAttr")
    public ResponseEntity<Map<String, Object>> createContentTypeAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataCategory
     * <p>service: createDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/addDataCategory")
    public ResponseEntity<Map<String, Object>> createDataCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceAttribute
     * <p>service: createDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/addDataResourceAttribute")
    public ResponseEntity<Map<String, Object>> createDataResourceAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceRole
     * <p>service: createDataResourceRole  entities: DataResourceRole  auth: true
     */
    @PostMapping("/content/control/addDataResourceRole")
    public ResponseEntity<Map<String, Object>> createDataResourceRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceType
     * <p>service: createDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/addDataResourceType")
    public ResponseEntity<Map<String, Object>> createDataResourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResourceTypeAttr
     * <p>service: createDataResourceTypeAttr  entities: DataResourceTypeAttr  auth: true
     */
    @PostMapping("/content/control/addDataResourceTypeAttr")
    public ResponseEntity<Map<String, Object>> createDataResourceTypeAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDocument  entities: unknown  auth: true
     */
    @GetMapping("/content/control/addDocumentToTree")
    public ResponseEntity<Map<String, Object>> createDocument(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ElectronicText
     * <p>service: createElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/addElectronicText")
    public ResponseEntity<Map<String, Object>> createElectronicText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FileExtension
     * <p>service: createFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/addFileExtension")
    public ResponseEntity<Map<String, Object>> createFileExtension(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ElectronicText
     * <p>service: createElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/addHtmlText")
    public ResponseEntity<Map<String, Object>> createElectronicTextAddHtmlText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MetaDataPredicate
     * <p>service: createMetaDataPredicate  entities: MetaDataPredicate  auth: true
     */
    @PostMapping("/content/control/addMetaDataPredicate")
    public ResponseEntity<Map<String, Object>> createMetaDataPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a MimeType
     * <p>service: createMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/addMimeType")
    public ResponseEntity<Map<String, Object>> createMimeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Auto Create Content Publish Points
     * <p>service: autoCreateWebSiteContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/autoCreateWebSiteContent")
    public ResponseEntity<Map<String, Object>> autoCreateWebSiteContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey and related entities from AcroForm
     * <p>service: buildSurveyFromPdf  entities: unknown  auth: true
     */
    @PostMapping("/content/control/buildSurveyFromPdf")
    public ResponseEntity<Map<String, Object>> buildSurveyFromPdf(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey and related entities from AcroForm
     * <p>service: buildSurveyResponseFromPdf  entities: unknown  auth: true
     */
    @PostMapping("/content/control/buildSurveyResponseFromPdf")
    public ResponseEntity<Map<String, Object>> buildSurveyResponseFromPdf(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createBlogEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Text Document DataResource and Content Records
     * <p>service: createTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createBlogResponse")
    public ResponseEntity<Map<String, Object>> createTextContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContent")
    public ResponseEntity<Map<String, Object>> createContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentApproval
     * <p>service: createContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/createContentApproval")
    public ResponseEntity<Map<String, Object>> createContentApproval(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentAssoc
     * <p>service: createContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContentAssoc")
    public ResponseEntity<Map<String, Object>> createContentAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createContentCms")
    public ResponseEntity<Map<String, Object>> createContentCreateContentCms(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentKeyword
     * <p>service: createContentKeyword  entities: ContentKeyword  auth: true
     */
    @PostMapping("/content/control/createContentKeyword")
    public ResponseEntity<Map<String, Object>> createContentKeyword(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRevision
     * <p>service: createContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/createContentRevision")
    public ResponseEntity<Map<String, Object>> createContentRevision(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRevisionItem
     * <p>service: createContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/createContentRevisionItem")
    public ResponseEntity<Map<String, Object>> createContentRevisionItem(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createDataResourceAndAssocToContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a DataResource and, possibly, ElectronicText or ImageDataResource
     * <p>service: createDataResourceAndText  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/createDataResourceAndText")
    public ResponseEntity<Map<String, Object>> createDataResourceAndText(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createDataResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/createForum")
    public ResponseEntity<Map<String, Object>> persistContentAndAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content
     * <p>service: createContent  entities: Content, ContentAssoc  auth: true
     */
    @PostMapping("/content/control/createForumGroup")
    public ResponseEntity<Map<String, Object>> createContentCreateForumGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentPurpose
     * <p>service: createContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/createForumGroupPurpose")
    public ResponseEntity<Map<String, Object>> createContentPurposeCreateForumGroupPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ContentRole
     * <p>service: createContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/createForumGroupRole")
    public ResponseEntity<Map<String, Object>> createContentRoleCreateForumGroupRole(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createMimeTypeHtmlTemplate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Accepts file upload, creates DataResource and Content records.
     * <p>service: createContentFromUploadedFile  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createObjectContentCms")
    public ResponseEntity<Map<String, Object>> createContentFromUploadedFile(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey
     * <p>service: createSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/createSurvey")
    public ResponseEntity<Map<String, Object>> createSurvey(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyMultiResp; surveyMultiRespId will be auto-sequenced
     * <p>service: createSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/createSurveyMultiResp")
    public ResponseEntity<Map<String, Object>> createSurveyMultiResp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyMultiRespColumn; surveyMultiRespColId will be auto-sequenced
     * <p>service: createSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/createSurveyMultiRespColumn")
    public ResponseEntity<Map<String, Object>> createSurveyMultiRespColumn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyPage; the surveyPageSeqId will be auto-generated
     * <p>service: createSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/createSurveyPage")
    public ResponseEntity<Map<String, Object>> createSurveyPage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestion
     * <p>service: createSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestion")
    public ResponseEntity<Map<String, Object>> createSurveyQuestion(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionAppl
     * <p>service: createSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionAppl")
    public ResponseEntity<Map<String, Object>> createSurveyQuestionAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionCategory
     * <p>service: createSurveyQuestionCategory  entities: SurveyQuestionCategory  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionCategory")
    public ResponseEntity<Map<String, Object>> createSurveyQuestionCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SurveyQuestionOption
     * <p>service: createSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/createSurveyQuestionOption")
    public ResponseEntity<Map<String, Object>> createSurveyQuestionOption(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a Text Document DataResource and Content Records
     * <p>service: createTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/createTextContentCms")
    public ResponseEntity<Map<String, Object>> createTextContentCreateTextContentCms(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createWebSite(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> createTextContentCreateWebSiteMetaInfoJson(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite Path Alias
     * <p>service: createWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/createWebSitePathAlias")
    public ResponseEntity<Map<String, Object>> createWebSitePathAlias(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WebSite Path Alias
     * <p>service: createWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/createWebSitePathAliasJson")
    public ResponseEntity<Map<String, Object>> createWebSitePathAliasCreateWebSitePathAliasJson(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add WebSite Role
     * <p>service: createWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/createWebSiteRole")
    public ResponseEntity<Map<String, Object>> createWebSiteRole(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> deleteContentKeyword(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete all the keywords of a content
     * <p>service: deleteContentKeywords  entities: unknown  auth: true
     */
    @PostMapping("/content/control/deleteContentKeywords")
    public ResponseEntity<Map<String, Object>> deleteContentKeywords(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurpose
     * <p>service: removeContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/deleteForumGroupPurpose")
    public ResponseEntity<Map<String, Object>> removeContentPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRole
     * <p>service: removeContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/deleteForumGroupRole")
    public ResponseEntity<Map<String, Object>> removeContentRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Survey
     * <p>service: deleteSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/deleteSurvey")
    public ResponseEntity<Map<String, Object>> deleteSurvey(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyMultiResp
     * <p>service: deleteSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/deleteSurveyMultiResp")
    public ResponseEntity<Map<String, Object>> deleteSurveyMultiResp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyMultiRespColumn
     * <p>service: deleteSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/deleteSurveyMultiRespColumn")
    public ResponseEntity<Map<String, Object>> deleteSurveyMultiRespColumn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestion
     * <p>service: deleteSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/deleteSurveyQuestion")
    public ResponseEntity<Map<String, Object>> deleteSurveyQuestion(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestionOption
     * <p>service: deleteSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/deleteSurveyQuestionOption")
    public ResponseEntity<Map<String, Object>> deleteSurveyQuestionOption(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> generateMissingSeoUrlForWebsite(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> linkContentToPubPt(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<Map<String, Object>> createContentNewBlog(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistBlogImage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistBlogSummary")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistBlogSummary(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistBlogText")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistBlogText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistContent")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/persistContentStuff")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistContentStuff(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPersistSubContentStuff(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/postNewSubSite")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocPostNewSubSite(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateContent  entities: unknown  auth: true
     */
    @GetMapping("/content/control/publishResponse")
    public ResponseEntity<Map<String, Object>> updateContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove CharacterSet
     * <p>service: removeCharacterSet  entities: CharacterSet  auth: true
     */
    @PostMapping("/content/control/removeCharacterSet")
    public ResponseEntity<Map<String, Object>> removeCharacterSet(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentApproval
     * <p>service: removeContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/removeContentApproval")
    public ResponseEntity<Map<String, Object>> removeContentApproval(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeContentAssoc")
    public ResponseEntity<Map<String, Object>> removeContentAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssocPredicate
     * <p>service: removeContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/removeContentAssocPredicate")
    public ResponseEntity<Map<String, Object>> removeContentAssocPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssocType
     * <p>service: removeContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/removeContentAssocType")
    public ResponseEntity<Map<String, Object>> removeContentAssocType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAttribute
     * <p>service: removeContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/removeContentAttribute")
    public ResponseEntity<Map<String, Object>> removeContentAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentMetaData
     * <p>service: removeContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/removeContentMetaData")
    public ResponseEntity<Map<String, Object>> removeContentMetaData(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentOperation
     * <p>service: removeContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/removeContentOperation")
    public ResponseEntity<Map<String, Object>> removeContentOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurpose
     * <p>service: removeContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/removeContentPurpose")
    public ResponseEntity<Map<String, Object>> removeContentPurposeRemoveContentPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurposeOperation
     * <p>service: removeContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/removeContentPurposeOperation")
    public ResponseEntity<Map<String, Object>> removeContentPurposeOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentPurposeType
     * <p>service: removeContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/removeContentPurposeType")
    public ResponseEntity<Map<String, Object>> removeContentPurposeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRevision
     * <p>service: removeContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/removeContentRevision")
    public ResponseEntity<Map<String, Object>> removeContentRevision(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRevisionItem
     * <p>service: removeContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/removeContentRevisionItem")
    public ResponseEntity<Map<String, Object>> removeContentRevisionItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentRole
     * <p>service: removeContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/removeContentRole")
    public ResponseEntity<Map<String, Object>> removeContentRoleRemoveContentRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentType
     * <p>service: removeContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/removeContentType")
    public ResponseEntity<Map<String, Object>> removeContentType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentTypeAttr
     * <p>service: removeContentTypeAttr  entities: ContentTypeAttr  auth: true
     */
    @PostMapping("/content/control/removeContentTypeAttr")
    public ResponseEntity<Map<String, Object>> removeContentTypeAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataCategory
     * <p>service: removeDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/removeDataCategory")
    public ResponseEntity<Map<String, Object>> removeDataCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceAttribute
     * <p>service: removeDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/removeDataResourceAttribute")
    public ResponseEntity<Map<String, Object>> removeDataResourceAttribute(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> removeDataResourceRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceType
     * <p>service: removeDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/removeDataResourceType")
    public ResponseEntity<Map<String, Object>> removeDataResourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove DataResourceTypeAttr
     * <p>service: removeDataResourceTypeAttr  entities: DataResourceTypeAttr  auth: true
     */
    @PostMapping("/content/control/removeDataResourceTypeAttr")
    public ResponseEntity<Map<String, Object>> removeDataResourceTypeAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeDocumentFromTree")
    public ResponseEntity<Map<String, Object>> removeContentAssocRemoveDocumentFromTree(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ElectronicText
     * <p>service: removeElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/removeElectronicText")
    public ResponseEntity<Map<String, Object>> removeElectronicText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove FileExtension
     * <p>service: removeFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/removeFileExtension")
    public ResponseEntity<Map<String, Object>> removeFileExtension(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ContentAssoc
     * <p>service: removeContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/removeLayout")
    public ResponseEntity<Map<String, Object>> removeContentAssocRemoveLayout(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MetaDataPredicate
     * <p>service: removeMetaDataPredicate  entities: MetaDataPredicate  auth: true
     */
    @PostMapping("/content/control/removeMetaDataPredicate")
    public ResponseEntity<Map<String, Object>> removeMetaDataPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MimeType
     * <p>service: removeMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/removeMimeType")
    public ResponseEntity<Map<String, Object>> removeMimeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove MimeTypeHtmlTemplate
     * <p>service: removeMimeTypeHtmlTemplate  entities: MimeTypeHtmlTemplate  auth: true
     */
    @PostMapping("/content/control/removeMimeTypeHtmlTemplate")
    public ResponseEntity<Map<String, Object>> removeMimeTypeHtmlTemplate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Supply thruDate to all ContentAssoc that come "before" current one
     * <p>service: deactivateAssocs  entities: unknown  auth: true
     */
    @PostMapping("/content/control/removeSite")
    public ResponseEntity<Map<String, Object>> deactivateAssocs(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyPage
     * <p>service: deleteSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/removeSurveyPage")
    public ResponseEntity<Map<String, Object>> deleteSurveyPage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete SurveyQuestionAppl
     * <p>service: deleteSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/removeSurveyQuestionAppl")
    public ResponseEntity<Map<String, Object>> deleteSurveyQuestionAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Path Alias
     * <p>service: removeWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/removeWebSitePathAlias")
    public ResponseEntity<Map<String, Object>> removeWebSitePathAlias(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WebSite Path Alias
     * <p>service: removeWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/removeWebSitePathAliasJson")
    public ResponseEntity<Map<String, Object>> removeWebSitePathAliasRemoveWebSitePathAliasJson(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove WebSite Role
     * <p>service: removeWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/removeWebSiteRole")
    public ResponseEntity<Map<String, Object>> removeWebSiteRole(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateContentUpdateBlog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates content records for a blog entry
     * <p>service: updateBlogEntry  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateBlogArticle")
    public ResponseEntity<Map<String, Object>> updateBlogEntry(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Text Document DataResource and Content Records
     * <p>service: updateTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateBlogResponse")
    public ResponseEntity<Map<String, Object>> updateTextContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CharacterSet
     * <p>service: updateCharacterSet  entities: CharacterSet  auth: true
     */
    @PostMapping("/content/control/updateCharacterSet")
    public ResponseEntity<Map<String, Object>> updateCharacterSet(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateContent")
    public ResponseEntity<Map<String, Object>> updateContentUpdateContent(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateContentApproval(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentApproval
     * <p>service: updateContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/updateContentApprovalStatus")
    public ResponseEntity<Map<String, Object>> updateContentApprovalUpdateContentApprovalStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssoc
     * <p>service: updateContentAssoc  entities: ContentAssoc  auth: true
     */
    @PostMapping("/content/control/updateContentAssoc")
    public ResponseEntity<Map<String, Object>> updateContentAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssocPredicate
     * <p>service: updateContentAssocPredicate  entities: ContentAssocPredicate  auth: true
     */
    @PostMapping("/content/control/updateContentAssocPredicate")
    public ResponseEntity<Map<String, Object>> updateContentAssocPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAssocType
     * <p>service: updateContentAssocType  entities: ContentAssocType  auth: true
     */
    @PostMapping("/content/control/updateContentAssocType")
    public ResponseEntity<Map<String, Object>> updateContentAssocType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentAttribute
     * <p>service: updateContentAttribute  entities: ContentAttribute  auth: true
     */
    @PostMapping("/content/control/updateContentAttribute")
    public ResponseEntity<Map<String, Object>> updateContentAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateContentCms")
    public ResponseEntity<Map<String, Object>> updateContentUpdateContentCms(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentMetaData
     * <p>service: updateContentMetaData  entities: ContentMetaData  auth: true
     */
    @PostMapping("/content/control/updateContentMetaData")
    public ResponseEntity<Map<String, Object>> updateContentMetaData(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentOperation
     * <p>service: updateContentOperation  entities: ContentOperation  auth: true
     */
    @PostMapping("/content/control/updateContentOperation")
    public ResponseEntity<Map<String, Object>> updateContentOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurpose
     * <p>service: updateContentPurpose  entities: ContentPurpose  auth: true
     */
    @PostMapping("/content/control/updateContentPurpose")
    public ResponseEntity<Map<String, Object>> updateContentPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurposeOperation
     * <p>service: updateContentPurposeOperation  entities: ContentPurposeOperation  auth: true
     */
    @PostMapping("/content/control/updateContentPurposeOperation")
    public ResponseEntity<Map<String, Object>> updateContentPurposeOperation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentPurposeType
     * <p>service: updateContentPurposeType  entities: ContentPurposeType  auth: true
     */
    @PostMapping("/content/control/updateContentPurposeType")
    public ResponseEntity<Map<String, Object>> updateContentPurposeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRevision
     * <p>service: updateContentRevision  entities: ContentRevision  auth: true
     */
    @PostMapping("/content/control/updateContentRevision")
    public ResponseEntity<Map<String, Object>> updateContentRevision(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRevisionItem
     * <p>service: updateContentRevisionItem  entities: ContentRevisionItem  auth: true
     */
    @PostMapping("/content/control/updateContentRevisionItem")
    public ResponseEntity<Map<String, Object>> updateContentRevisionItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRole
     * <p>service: updateContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/updateContentRole")
    public ResponseEntity<Map<String, Object>> updateContentRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentType
     * <p>service: updateContentType  entities: ContentType  auth: true
     */
    @PostMapping("/content/control/updateContentType")
    public ResponseEntity<Map<String, Object>> updateContentType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataCategory
     * <p>service: updateDataCategory  entities: DataCategory  auth: true
     */
    @PostMapping("/content/control/updateDataCategory")
    public ResponseEntity<Map<String, Object>> updateDataCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResource
     * <p>service: updateDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/updateDataResource")
    public ResponseEntity<Map<String, Object>> updateDataResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceAttribute
     * <p>service: updateDataResourceAttribute  entities: DataResourceAttribute  auth: true
     */
    @PostMapping("/content/control/updateDataResourceAttribute")
    public ResponseEntity<Map<String, Object>> updateDataResourceAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceRole
     * <p>service: updateDataResourceRole  entities: DataResourceRole  auth: true
     */
    @PostMapping("/content/control/updateDataResourceRole")
    public ResponseEntity<Map<String, Object>> updateDataResourceRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResource
     * <p>service: updateDataResource  entities: DataResource  auth: true
     */
    @PostMapping("/content/control/updateDataResourceText")
    public ResponseEntity<Map<String, Object>> updateDataResourceUpdateDataResourceText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a DataResourceType
     * <p>service: updateDataResourceType  entities: DataResourceType  auth: true
     */
    @PostMapping("/content/control/updateDataResourceType")
    public ResponseEntity<Map<String, Object>> updateDataResourceType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateDocumentTree")
    public ResponseEntity<Map<String, Object>> updateContentUpdateDocumentTree(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ElectronicText
     * <p>service: updateElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateElectronicText")
    public ResponseEntity<Map<String, Object>> updateElectronicText(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createOrRemoveProductFeatureDataResource  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateFeatures")
    public ResponseEntity<Map<String, Object>> createOrRemoveProductFeatureDataResource(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FileExtension
     * <p>service: updateFileExtension  entities: FileExtension  auth: true
     */
    @PostMapping("/content/control/updateFileExtension")
    public ResponseEntity<Map<String, Object>> updateFileExtension(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForum")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocUpdateForum(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Content
     * <p>service: updateContent  entities: Content  auth: true
     */
    @PostMapping("/content/control/updateForumGroup")
    public ResponseEntity<Map<String, Object>> updateContentUpdateForumGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentRole
     * <p>service: updateContentRole  entities: ContentRole  auth: true
     */
    @PostMapping("/content/control/updateForumGroupRole")
    public ResponseEntity<Map<String, Object>> updateContentRoleUpdateForumGroupRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForumMessage")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocUpdateForumMessage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Content, DataResource and/or ContentAssoc
     * <p>service: persistContentAndAssoc  entities: Content, ContentAssoc, ContentAssocDataResourceViewTo, ContentDataResourceView, DataResource, ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateForumThreadMessage")
    public ResponseEntity<Map<String, Object>> persistContentAndAssocUpdateForumThreadMessage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ElectronicText
     * <p>service: updateElectronicText  entities: ElectronicText  auth: true
     */
    @PostMapping("/content/control/updateHtmlText")
    public ResponseEntity<Map<String, Object>> updateElectronicTextUpdateHtmlText(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateMetaDataPredicate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MimeType
     * <p>service: updateMimeType  entities: MimeType  auth: true
     */
    @PostMapping("/content/control/updateMimeType")
    public ResponseEntity<Map<String, Object>> updateMimeType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a MimeTypeHtmlTemplate
     * <p>service: updateMimeTypeHtmlTemplate  entities: MimeTypeHtmlTemplate  auth: true
     */
    @PostMapping("/content/control/updateMimeTypeHtmlTemplate")
    public ResponseEntity<Map<String, Object>> updateMimeTypeHtmlTemplate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Accepts file upload, updates DataResource and Content records.
     * <p>service: updateContentAndUploadedFile  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateObjectContentCms")
    public ResponseEntity<Map<String, Object>> updateContentAndUploadedFile(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSiteRoles  entities: unknown  auth: true
     */
    @GetMapping("/content/control/updateSiteRoles")
    public ResponseEntity<Map<String, Object>> updateSiteRoles(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Survey
     * <p>service: updateSurvey  entities: Survey  auth: true
     */
    @PostMapping("/content/control/updateSurvey")
    public ResponseEntity<Map<String, Object>> updateSurvey(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyMultiResp
     * <p>service: updateSurveyMultiResp  entities: SurveyMultiResp  auth: true
     */
    @PostMapping("/content/control/updateSurveyMultiResp")
    public ResponseEntity<Map<String, Object>> updateSurveyMultiResp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyMultiRespColumn
     * <p>service: updateSurveyMultiRespColumn  entities: SurveyMultiRespColumn  auth: true
     */
    @PostMapping("/content/control/updateSurveyMultiRespColumn")
    public ResponseEntity<Map<String, Object>> updateSurveyMultiRespColumn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyPage
     * <p>service: updateSurveyPage  entities: SurveyPage  auth: true
     */
    @PostMapping("/content/control/updateSurveyPage")
    public ResponseEntity<Map<String, Object>> updateSurveyPage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestion
     * <p>service: updateSurveyQuestion  entities: SurveyQuestion  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestion")
    public ResponseEntity<Map<String, Object>> updateSurveyQuestion(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestionAppl
     * <p>service: updateSurveyQuestionAppl  entities: SurveyQuestionAppl  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestionAppl")
    public ResponseEntity<Map<String, Object>> updateSurveyQuestionAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SurveyQuestionOption
     * <p>service: updateSurveyQuestionOption  entities: SurveyQuestionOption  auth: true
     */
    @PostMapping("/content/control/updateSurveyQuestionOption")
    public ResponseEntity<Map<String, Object>> updateSurveyQuestionOption(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Survey Response w/ Response Answers
     * <p>service: createSurveyResponse  entities: SurveyResponse  auth: true
     */
    @PostMapping("/content/control/updateSurveyResponse")
    public ResponseEntity<Map<String, Object>> createSurveyResponse(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a Text Document DataResource and Content Records
     * <p>service: updateTextContent  entities: unknown  auth: true
     */
    @PostMapping("/content/control/updateTextContentCms")
    public ResponseEntity<Map<String, Object>> updateTextContentUpdateTextContentCms(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ContentApproval
     * <p>service: updateContentApproval  entities: ContentApproval  auth: true
     */
    @PostMapping("/content/control/updateWaitingContentApproval")
    public ResponseEntity<Map<String, Object>> updateContentApprovalUpdateWaitingContentApproval(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateWebSite(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> updateDataResourceUpdateWebSiteMetaInfoJson(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite Path Alias
     * <p>service: updateWebSitePathAlias  entities: WebSitePathAlias  auth: true
     */
    @PostMapping("/content/control/updateWebSitePathAlias")
    public ResponseEntity<Map<String, Object>> updateWebSitePathAlias(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add WebSite Role
     * <p>service: updateWebSiteRole  entities: WebSiteRole  auth: true
     */
    @PostMapping("/content/control/updateWebSiteRole")
    public ResponseEntity<Map<String, Object>> updateWebSiteRole(@RequestBody Map<String, Object> body) {
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
    public ResponseEntity<Map<String, Object>> persistContentAndAssocUploadImage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
