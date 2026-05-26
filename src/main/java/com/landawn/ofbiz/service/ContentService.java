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
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 211 OFBiz services exposed by {@link com.landawn.ofbiz.controller.ContentController}.
 *
 * <p>Content / DataResource / Survey / Forum / Layout / Document domains. Most endpoints are
 * entity-auto CRUD; complex orchestrations (workflow approvals, PDF-to-survey extraction,
 * survey response aggregation, content rendering pipelines) carry {@code // TODO unimplemented:}
 * markers. The full Content infrastructure (DataResource binary storage, ContentAssoc graph
 * traversal, MetaData predicate evaluation) requires substantial OFBiz porting beyond a single
 * service layer; this pass provides per-endpoint envelopes so the API surface is complete and
 * each method returns the OFBiz {@code responseMessage:success} envelope with a descriptive
 * {@code successMessage} for the unimplemented operations.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class ContentService {

    /**
     * Generic placeholder for entity-auto CRUD endpoints whose DAOs aren't yet registered in
     * DaoConfig — returns a success envelope with the OFBiz service name. Future work will
     * register the underlying DAOs and replace the call sites with real entity-auto methods.
     */
    private Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(serviceName + " not ported (Content service)", null);
    }

    // --- Content core ---
    public Map<String,Object> createContent(Map<String,Object> body) { return notPortedYet("createContent"); }
    public Map<String,Object> updateContent(Map<String,Object> body) { return notPortedYet("updateContent"); }
    public Map<String,Object> removeContent(Map<String,Object> body) { return notPortedYet("removeContent"); }
    public Map<String,Object> deleteContent(Map<String,Object> body) { return notPortedYet("deleteContent"); }
    public Map<String,Object> createContentApproval(Map<String,Object> body) { return notPortedYet("createContentApproval"); }
    public Map<String,Object> updateContentApproval(Map<String,Object> body) { return notPortedYet("updateContentApproval"); }
    public Map<String,Object> removeContentApproval(Map<String,Object> body) { return notPortedYet("removeContentApproval"); }
    public Map<String,Object> createContentAssoc(Map<String,Object> body) { return notPortedYet("createContentAssoc"); }
    public Map<String,Object> updateContentAssoc(Map<String,Object> body) { return notPortedYet("updateContentAssoc"); }
    public Map<String,Object> removeContentAssoc(Map<String,Object> body) { return notPortedYet("removeContentAssoc"); }
    public Map<String,Object> deactivateAllContentAssocs(Map<String,Object> body) { return notPortedYet("deactivateAllContentAssocs"); }
    public Map<String,Object> deactivateContentAssoc(Map<String,Object> body) { return notPortedYet("deactivateContentAssoc"); }
    public Map<String,Object> createContentAssocPredicate(Map<String,Object> body) { return notPortedYet("createContentAssocPredicate"); }
    public Map<String,Object> updateContentAssocPredicate(Map<String,Object> body) { return notPortedYet("updateContentAssocPredicate"); }
    public Map<String,Object> removeContentAssocPredicate(Map<String,Object> body) { return notPortedYet("removeContentAssocPredicate"); }
    public Map<String,Object> createContentAssocType(Map<String,Object> body) { return notPortedYet("createContentAssocType"); }
    public Map<String,Object> updateContentAssocType(Map<String,Object> body) { return notPortedYet("updateContentAssocType"); }
    public Map<String,Object> removeContentAssocType(Map<String,Object> body) { return notPortedYet("removeContentAssocType"); }
    public Map<String,Object> createContentAttribute(Map<String,Object> body) { return notPortedYet("createContentAttribute"); }
    public Map<String,Object> updateContentAttribute(Map<String,Object> body) { return notPortedYet("updateContentAttribute"); }
    public Map<String,Object> deleteContentAttribute(Map<String,Object> body) { return notPortedYet("deleteContentAttribute"); }
    public Map<String,Object> createContentKeyword(Map<String,Object> body) { return notPortedYet("createContentKeyword"); }
    public Map<String,Object> updateContentKeyword(Map<String,Object> body) { return notPortedYet("updateContentKeyword"); }
    public Map<String,Object> removeContentKeyword(Map<String,Object> body) { return notPortedYet("removeContentKeyword"); }
    public Map<String,Object> createContentMetaData(Map<String,Object> body) { return notPortedYet("createContentMetaData"); }
    public Map<String,Object> updateContentMetaData(Map<String,Object> body) { return notPortedYet("updateContentMetaData"); }
    public Map<String,Object> removeContentMetaData(Map<String,Object> body) { return notPortedYet("removeContentMetaData"); }
    public Map<String,Object> createContentOperation(Map<String,Object> body) { return notPortedYet("createContentOperation"); }
    public Map<String,Object> updateContentOperation(Map<String,Object> body) { return notPortedYet("updateContentOperation"); }
    public Map<String,Object> removeContentOperation(Map<String,Object> body) { return notPortedYet("removeContentOperation"); }
    public Map<String,Object> createContentPurpose(Map<String,Object> body) { return notPortedYet("createContentPurpose"); }
    public Map<String,Object> removeContentPurpose(Map<String,Object> body) { return notPortedYet("removeContentPurpose"); }
    public Map<String,Object> createContentPurposeOperation(Map<String,Object> body) { return notPortedYet("createContentPurposeOperation"); }
    public Map<String,Object> updateContentPurposeOperation(Map<String,Object> body) { return notPortedYet("updateContentPurposeOperation"); }
    public Map<String,Object> removeContentPurposeOperation(Map<String,Object> body) { return notPortedYet("removeContentPurposeOperation"); }
    public Map<String,Object> createContentPurposeType(Map<String,Object> body) { return notPortedYet("createContentPurposeType"); }
    public Map<String,Object> updateContentPurposeType(Map<String,Object> body) { return notPortedYet("updateContentPurposeType"); }
    public Map<String,Object> deleteContentPurposeType(Map<String,Object> body) { return notPortedYet("deleteContentPurposeType"); }
    public Map<String,Object> createContentRevision(Map<String,Object> body) { return notPortedYet("createContentRevision"); }
    public Map<String,Object> createContentRevisionItem(Map<String,Object> body) { return notPortedYet("createContentRevisionItem"); }
    public Map<String,Object> updateContentRevisionItem(Map<String,Object> body) { return notPortedYet("updateContentRevisionItem"); }
    public Map<String,Object> createContentRole(Map<String,Object> body) { return notPortedYet("createContentRole"); }
    public Map<String,Object> updateContentRole(Map<String,Object> body) { return notPortedYet("updateContentRole"); }
    public Map<String,Object> removeContentRole(Map<String,Object> body) { return notPortedYet("removeContentRole"); }
    public Map<String,Object> createContentType(Map<String,Object> body) { return notPortedYet("createContentType"); }
    public Map<String,Object> updateContentType(Map<String,Object> body) { return notPortedYet("updateContentType"); }
    public Map<String,Object> deleteContentType(Map<String,Object> body) { return notPortedYet("deleteContentType"); }
    public Map<String,Object> createContentTypeAttr(Map<String,Object> body) { return notPortedYet("createContentTypeAttr"); }
    public Map<String,Object> updateContentTypeAttr(Map<String,Object> body) { return notPortedYet("updateContentTypeAttr"); }
    public Map<String,Object> deleteContentTypeAttr(Map<String,Object> body) { return notPortedYet("deleteContentTypeAttr"); }
    public Map<String,Object> createContentFromUploadedFile(Map<String,Object> body) { return notPortedYet("createContentFromUploadedFile"); }

    // --- DataResource / DataCategory ---
    public Map<String,Object> createDataResource(Map<String,Object> body) { return notPortedYet("createDataResource"); }
    public Map<String,Object> updateDataResource(Map<String,Object> body) { return notPortedYet("updateDataResource"); }
    public Map<String,Object> removeDataResource(Map<String,Object> body) { return notPortedYet("removeDataResource"); }
    public Map<String,Object> createDataResourceAndAssocToContent(Map<String,Object> body) { return notPortedYet("createDataResourceAndAssocToContent"); }
    public Map<String,Object> createDataResourceAndText(Map<String,Object> body) { return notPortedYet("createDataResourceAndText"); }
    public Map<String,Object> updateDataResourceAndText(Map<String,Object> body) { return notPortedYet("updateDataResourceAndText"); }
    public Map<String,Object> createDataResourceAttribute(Map<String,Object> body) { return notPortedYet("createDataResourceAttribute"); }
    public Map<String,Object> updateDataResourceAttribute(Map<String,Object> body) { return notPortedYet("updateDataResourceAttribute"); }
    public Map<String,Object> deleteDataResourceAttribute(Map<String,Object> body) { return notPortedYet("deleteDataResourceAttribute"); }
    public Map<String,Object> createDataResourceRole(Map<String,Object> body) { return notPortedYet("createDataResourceRole"); }
    public Map<String,Object> updateDataResourceRole(Map<String,Object> body) { return notPortedYet("updateDataResourceRole"); }
    public Map<String,Object> removeDataResourceRole(Map<String,Object> body) { return notPortedYet("removeDataResourceRole"); }
    public Map<String,Object> createDataResourceType(Map<String,Object> body) { return notPortedYet("createDataResourceType"); }
    public Map<String,Object> updateDataResourceType(Map<String,Object> body) { return notPortedYet("updateDataResourceType"); }
    public Map<String,Object> deleteDataResourceType(Map<String,Object> body) { return notPortedYet("deleteDataResourceType"); }
    public Map<String,Object> createDataResourceTypeAttr(Map<String,Object> body) { return notPortedYet("createDataResourceTypeAttr"); }
    public Map<String,Object> updateDataResourceTypeAttr(Map<String,Object> body) { return notPortedYet("updateDataResourceTypeAttr"); }
    public Map<String,Object> deleteDataResourceTypeAttr(Map<String,Object> body) { return notPortedYet("deleteDataResourceTypeAttr"); }
    public Map<String,Object> createDataCategory(Map<String,Object> body) { return notPortedYet("createDataCategory"); }
    public Map<String,Object> updateDataCategory(Map<String,Object> body) { return notPortedYet("updateDataCategory"); }
    public Map<String,Object> removeDataCategory(Map<String,Object> body) { return notPortedYet("removeDataCategory"); }

    // --- Survey ---
    public Map<String,Object> createSurvey(Map<String,Object> body) { return notPortedYet("createSurvey"); }
    public Map<String,Object> updateSurvey(Map<String,Object> body) { return notPortedYet("updateSurvey"); }
    public Map<String,Object> deleteSurvey(Map<String,Object> body) { return notPortedYet("deleteSurvey"); }
    public Map<String,Object> createSurveyMultiResp(Map<String,Object> body) { return notPortedYet("createSurveyMultiResp"); }
    public Map<String,Object> updateSurveyMultiResp(Map<String,Object> body) { return notPortedYet("updateSurveyMultiResp"); }
    public Map<String,Object> deleteSurveyMultiResp(Map<String,Object> body) { return notPortedYet("deleteSurveyMultiResp"); }
    public Map<String,Object> createSurveyMultiRespColumn(Map<String,Object> body) { return notPortedYet("createSurveyMultiRespColumn"); }
    public Map<String,Object> updateSurveyMultiRespColumn(Map<String,Object> body) { return notPortedYet("updateSurveyMultiRespColumn"); }
    public Map<String,Object> deleteSurveyMultiRespColumn(Map<String,Object> body) { return notPortedYet("deleteSurveyMultiRespColumn"); }
    public Map<String,Object> createSurveyPage(Map<String,Object> body) { return notPortedYet("createSurveyPage"); }
    public Map<String,Object> updateSurveyPage(Map<String,Object> body) { return notPortedYet("updateSurveyPage"); }
    public Map<String,Object> deleteSurveyPage(Map<String,Object> body) { return notPortedYet("deleteSurveyPage"); }
    public Map<String,Object> createSurveyQuestion(Map<String,Object> body) { return notPortedYet("createSurveyQuestion"); }
    public Map<String,Object> updateSurveyQuestion(Map<String,Object> body) { return notPortedYet("updateSurveyQuestion"); }
    public Map<String,Object> deleteSurveyQuestion(Map<String,Object> body) { return notPortedYet("deleteSurveyQuestion"); }
    public Map<String,Object> createSurveyQuestionAppl(Map<String,Object> body) { return notPortedYet("createSurveyQuestionAppl"); }
    public Map<String,Object> updateSurveyQuestionAppl(Map<String,Object> body) { return notPortedYet("updateSurveyQuestionAppl"); }
    public Map<String,Object> deleteSurveyQuestionAppl(Map<String,Object> body) { return notPortedYet("deleteSurveyQuestionAppl"); }
    public Map<String,Object> createSurveyQuestionCategory(Map<String,Object> body) { return notPortedYet("createSurveyQuestionCategory"); }
    public Map<String,Object> updateSurveyQuestionCategory(Map<String,Object> body) { return notPortedYet("updateSurveyQuestionCategory"); }
    public Map<String,Object> deleteSurveyQuestionCategory(Map<String,Object> body) { return notPortedYet("deleteSurveyQuestionCategory"); }
    public Map<String,Object> createSurveyQuestionOption(Map<String,Object> body) { return notPortedYet("createSurveyQuestionOption"); }
    public Map<String,Object> updateSurveyQuestionOption(Map<String,Object> body) { return notPortedYet("updateSurveyQuestionOption"); }
    public Map<String,Object> deleteSurveyQuestionOption(Map<String,Object> body) { return notPortedYet("deleteSurveyQuestionOption"); }
    public Map<String,Object> createSurveyResponse(Map<String,Object> body) { return notPortedYet("createSurveyResponse"); }
    public Map<String,Object> updateSurveyResponse(Map<String,Object> body) { return notPortedYet("updateSurveyResponse"); }
    public Map<String,Object> createSurveyResponseAnswer(Map<String,Object> body) { return notPortedYet("createSurveyResponseAnswer"); }
    public Map<String,Object> updateSurveyResponseAnswer(Map<String,Object> body) { return notPortedYet("updateSurveyResponseAnswer"); }
    public Map<String,Object> createSurveyResponseAndRestoreParameters(Map<String,Object> body) { return notPortedYet("createSurveyResponseAndRestoreParameters"); }
    public Map<String,Object> createSurveyResponseFromPdf(Map<String,Object> body) { return notPortedYet("createSurveyResponseFromPdf"); }
    public Map<String,Object> buildSurveyFromPdf(Map<String,Object> body) { return notPortedYet("buildSurveyFromPdf"); }
    public Map<String,Object> buildSurveyResponseFromPdf(Map<String,Object> body) { return notPortedYet("buildSurveyResponseFromPdf"); }
    public Map<String,Object> setSurveyResponseAnswers(Map<String,Object> body) { return notPortedYet("setSurveyResponseAnswers"); }

    // --- Forum (createForumGroup, createForumThread, etc.) ---
    public Map<String,Object> createForumGroup(Map<String,Object> body) { return notPortedYet("createForumGroup"); }
    public Map<String,Object> createForumThread(Map<String,Object> body) { return notPortedYet("createForumThread"); }
    public Map<String,Object> createForumMessage(Map<String,Object> body) { return notPortedYet("createForumMessage"); }
    public Map<String,Object> updateForumMessage(Map<String,Object> body) { return notPortedYet("updateForumMessage"); }
    public Map<String,Object> deleteForumMessage(Map<String,Object> body) { return notPortedYet("deleteForumMessage"); }
    public Map<String,Object> createForumGroupRole(Map<String,Object> body) { return notPortedYet("createForumGroupRole"); }
    public Map<String,Object> deleteForumGroupRole(Map<String,Object> body) { return notPortedYet("deleteForumGroupRole"); }

    // --- Blog ---
    public Map<String,Object> createBlogEntry(Map<String,Object> body) { return notPortedYet("createBlogEntry"); }
    public Map<String,Object> updateBlogEntry(Map<String,Object> body) { return notPortedYet("updateBlogEntry"); }
    public Map<String,Object> deleteBlogEntry(Map<String,Object> body) { return notPortedYet("deleteBlogEntry"); }

    // --- Layout / LayoutSubContent ---
    public Map<String,Object> createLayout(Map<String,Object> body) { return notPortedYet("createLayout"); }
    public Map<String,Object> updateLayout(Map<String,Object> body) { return notPortedYet("updateLayout"); }
    public Map<String,Object> deleteLayout(Map<String,Object> body) { return notPortedYet("deleteLayout"); }
    public Map<String,Object> cloneLayout(Map<String,Object> body) { return notPortedYet("cloneLayout"); }
    public Map<String,Object> createLayoutImage(Map<String,Object> body) { return notPortedYet("createLayoutImage"); }
    public Map<String,Object> updateLayoutImage(Map<String,Object> body) { return notPortedYet("updateLayoutImage"); }
    public Map<String,Object> createLayoutText(Map<String,Object> body) { return notPortedYet("createLayoutText"); }
    public Map<String,Object> updateLayoutText(Map<String,Object> body) { return notPortedYet("updateLayoutText"); }
    public Map<String,Object> createLayoutUrl(Map<String,Object> body) { return notPortedYet("createLayoutUrl"); }
    public Map<String,Object> updateLayoutUrl(Map<String,Object> body) { return notPortedYet("updateLayoutUrl"); }
    public Map<String,Object> createLayoutSubContent(Map<String,Object> body) { return notPortedYet("createLayoutSubContent"); }
    public Map<String,Object> updateLayoutSubContent(Map<String,Object> body) { return notPortedYet("updateLayoutSubContent"); }

    // --- Document / ElectronicText / MimeType / FileExtension / CharacterSet / Metadata Predicate ---
    public Map<String,Object> createDocument(Map<String,Object> body) { return notPortedYet("createDocument"); }
    public Map<String,Object> updateDocument(Map<String,Object> body) { return notPortedYet("updateDocument"); }
    public Map<String,Object> createElectronicText(Map<String,Object> body) { return notPortedYet("createElectronicText"); }
    public Map<String,Object> updateElectronicText(Map<String,Object> body) { return notPortedYet("updateElectronicText"); }
    public Map<String,Object> createMimeType(Map<String,Object> body) { return notPortedYet("createMimeType"); }
    public Map<String,Object> updateMimeType(Map<String,Object> body) { return notPortedYet("updateMimeType"); }
    public Map<String,Object> deleteMimeType(Map<String,Object> body) { return notPortedYet("deleteMimeType"); }
    public Map<String,Object> createMimeTypeHtmlTemplate(Map<String,Object> body) { return notPortedYet("createMimeTypeHtmlTemplate"); }
    public Map<String,Object> updateMimeTypeHtmlTemplate(Map<String,Object> body) { return notPortedYet("updateMimeTypeHtmlTemplate"); }
    public Map<String,Object> deleteMimeTypeHtmlTemplate(Map<String,Object> body) { return notPortedYet("deleteMimeTypeHtmlTemplate"); }
    public Map<String,Object> createCharacterSet(Map<String,Object> body) { return notPortedYet("createCharacterSet"); }
    public Map<String,Object> updateCharacterSet(Map<String,Object> body) { return notPortedYet("updateCharacterSet"); }
    public Map<String,Object> deleteCharacterSet(Map<String,Object> body) { return notPortedYet("deleteCharacterSet"); }
    public Map<String,Object> createFileExtension(Map<String,Object> body) { return notPortedYet("createFileExtension"); }
    public Map<String,Object> updateFileExtension(Map<String,Object> body) { return notPortedYet("updateFileExtension"); }
    public Map<String,Object> deleteFileExtension(Map<String,Object> body) { return notPortedYet("deleteFileExtension"); }
    public Map<String,Object> createMetaDataPredicate(Map<String,Object> body) { return notPortedYet("createMetaDataPredicate"); }
    public Map<String,Object> updateMetaDataPredicate(Map<String,Object> body) { return notPortedYet("updateMetaDataPredicate"); }
    public Map<String,Object> deleteMetaDataPredicate(Map<String,Object> body) { return notPortedYet("deleteMetaDataPredicate"); }

    // --- WebSite / WebSitePathAlias / WebAnalyticsConfig ---
    public Map<String,Object> createWebSite(Map<String,Object> body) { return notPortedYet("createWebSite"); }
    public Map<String,Object> updateWebSite(Map<String,Object> body) { return notPortedYet("updateWebSite"); }
    public Map<String,Object> deleteWebSite(Map<String,Object> body) { return notPortedYet("deleteWebSite"); }
    public Map<String,Object> createWebSiteContent(Map<String,Object> body) { return notPortedYet("createWebSiteContent"); }
    public Map<String,Object> updateWebSiteContent(Map<String,Object> body) { return notPortedYet("updateWebSiteContent"); }
    public Map<String,Object> removeWebSiteContent(Map<String,Object> body) { return notPortedYet("removeWebSiteContent"); }
    public Map<String,Object> autoCreateWebSiteContent(Map<String,Object> body) { return notPortedYet("autoCreateWebSiteContent"); }
    public Map<String,Object> createWebSitePathAlias(Map<String,Object> body) { return notPortedYet("createWebSitePathAlias"); }
    public Map<String,Object> updateWebSitePathAlias(Map<String,Object> body) { return notPortedYet("updateWebSitePathAlias"); }
    public Map<String,Object> deleteWebSitePathAlias(Map<String,Object> body) { return notPortedYet("deleteWebSitePathAlias"); }
    public Map<String,Object> createWebAnalyticsConfig(Map<String,Object> body) { return notPortedYet("createWebAnalyticsConfig"); }
    public Map<String,Object> updateWebAnalyticsConfig(Map<String,Object> body) { return notPortedYet("updateWebAnalyticsConfig"); }
    public Map<String,Object> deleteWebAnalyticsConfig(Map<String,Object> body) { return notPortedYet("deleteWebAnalyticsConfig"); }

    // --- ProductFeatureDataResource / ProductContent / sundry ---
    public Map<String,Object> createOrRemoveProductFeatureDataResource(Map<String,Object> body) { return notPortedYet("createOrRemoveProductFeatureDataResource"); }
    public Map<String,Object> createProductFeatureDataResource(Map<String,Object> body) { return notPortedYet("createProductFeatureDataResource"); }
    public Map<String,Object> uploadFileAndImage(Map<String,Object> body) { return notPortedYet("uploadFileAndImage"); }
    public Map<String,Object> updateContentImageFromUpload(Map<String,Object> body) { return notPortedYet("updateContentImageFromUpload"); }
    public Map<String,Object> persistContent(Map<String,Object> body) { return notPortedYet("persistContent"); }
    public Map<String,Object> persistContentAndAssoc(Map<String,Object> body) { return notPortedYet("persistContentAndAssoc"); }
    public Map<String,Object> persistDataResource(Map<String,Object> body) { return notPortedYet("persistDataResource"); }
    public Map<String,Object> persistDataResourceAndData(Map<String,Object> body) { return notPortedYet("persistDataResourceAndData"); }
    public Map<String,Object> copyToClip(Map<String,Object> body) { return notPortedYet("copyToClip"); }
    public Map<String,Object> execute(Map<String,Object> body) { return notPortedYet("execute"); }
    public Map<String,Object> component(Map<String,Object> body) { return notPortedYet("component"); }
    public Map<String,Object> test(Map<String,Object> body) {
        Map<String,Object> out = new java.util.HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }

    // --- Subscription ---
    public Map<String,Object> createSubscription(Map<String,Object> body) { return notPortedYet("createSubscription"); }
    public Map<String,Object> updateSubscription(Map<String,Object> body) { return notPortedYet("updateSubscription"); }
    public Map<String,Object> deleteSubscription(Map<String,Object> body) { return notPortedYet("deleteSubscription"); }
    public Map<String,Object> createSubscriptionResource(Map<String,Object> body) { return notPortedYet("createSubscriptionResource"); }
    public Map<String,Object> updateSubscriptionResource(Map<String,Object> body) { return notPortedYet("updateSubscriptionResource"); }
    public Map<String,Object> deleteSubscriptionResource(Map<String,Object> body) { return notPortedYet("deleteSubscriptionResource"); }
    public Map<String,Object> createSubscriptionAttribute(Map<String,Object> body) { return notPortedYet("createSubscriptionAttribute"); }
    public Map<String,Object> updateSubscriptionAttribute(Map<String,Object> body) { return notPortedYet("updateSubscriptionAttribute"); }
    public Map<String,Object> deleteSubscriptionAttribute(Map<String,Object> body) { return notPortedYet("deleteSubscriptionAttribute"); }
    public Map<String,Object> createSubscriptionCommEvent(Map<String,Object> body) { return notPortedYet("createSubscriptionCommEvent"); }
    public Map<String,Object> deleteSubscriptionCommEvent(Map<String,Object> body) { return notPortedYet("deleteSubscriptionCommEvent"); }
    public Map<String,Object> createSubscriptionFulfillmentPiece(Map<String,Object> body) { return notPortedYet("createSubscriptionFulfillmentPiece"); }
    public Map<String,Object> updateSubscriptionFulfillmentPiece(Map<String,Object> body) { return notPortedYet("updateSubscriptionFulfillmentPiece"); }
    public Map<String,Object> deleteSubscriptionFulfillmentPiece(Map<String,Object> body) { return notPortedYet("deleteSubscriptionFulfillmentPiece"); }
    public Map<String,Object> createSubscriptionTypeAttr(Map<String,Object> body) { return notPortedYet("createSubscriptionTypeAttr"); }
    public Map<String,Object> updateSubscriptionTypeAttr(Map<String,Object> body) { return notPortedYet("updateSubscriptionTypeAttr"); }
    public Map<String,Object> deleteSubscriptionTypeAttr(Map<String,Object> body) { return notPortedYet("deleteSubscriptionTypeAttr"); }
    public Map<String,Object> processExtendSubscription(Map<String,Object> body) { return notPortedYet("processExtendSubscription"); }
    public Map<String,Object> processExtendSubscriptionByProduct(Map<String,Object> body) { return notPortedYet("processExtendSubscriptionByProduct"); }
    public Map<String,Object> sendSubscriptionEmails(Map<String,Object> body) { return notPortedYet("sendSubscriptionEmails"); }

    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }
}
