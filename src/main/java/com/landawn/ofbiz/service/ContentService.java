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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.*;
import com.landawn.ofbiz.entity.*;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 211 OFBiz services exposed by {@link com.landawn.ofbiz.controller.ContentController}.
 *
 * <p>Real entity-auto CRUD implementations across Content + ContentAssoc/Role/Purpose/Type/MetaData/
 * Attribute/Keyword/Revision/Approval, DataResource family, DataCategory, Survey + sub-entities,
 * MimeType/CharacterSet/FileExtension, WebSiteContent/PathAlias, Subscription family, ElectronicText.
 * Composite orchestrations (createContentFromUploadedFile, persistContentAndAssoc, autoCreateWebSiteContent,
 * Forum/Blog, EOModel, PDF surveys, render pipelines) and Layout sub-content remain as
 * {@code notPortedYet} stubs.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class ContentService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "ContentService" + " Javadoc)", null);
    }
    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }

    @Autowired private ContentDao contentDao;
    @Autowired private ContentAssocDao contentAssocDao;
    @Autowired private ContentAssocPredicateDao contentAssocPredicateDao;
    @Autowired private ContentAssocTypeDao contentAssocTypeDao;
    @Autowired private ContentAttributeDao contentAttributeDao;
    @Autowired private ContentKeywordDao contentKeywordDao;
    @Autowired private ContentMetaDataDao contentMetaDataDao;
    @Autowired private ContentPurposeDao contentPurposeDao;
    @Autowired private ContentPurposeTypeDao contentPurposeTypeDao;
    @Autowired private ContentRevisionDao contentRevisionDao;
    @Autowired private ContentRevisionItemDao contentRevisionItemDao;
    @Autowired private ContentRoleDao contentRoleDao;
    @Autowired private ContentTypeDao contentTypeDao;
    @Autowired private ContentTypeAttrDao contentTypeAttrDao;
    @Autowired private ContentApprovalDao contentApprovalDao;
    @Autowired private DataResourceDao dataResourceDao;
    @Autowired private DataResourceAttributeDao dataResourceAttributeDao;
    @Autowired private DataResourceRoleDao dataResourceRoleDao;
    @Autowired private DataResourceTypeDao dataResourceTypeDao;
    @Autowired private DataResourceTypeAttrDao dataResourceTypeAttrDao;
    @Autowired private DataCategoryDao dataCategoryDao;
    @Autowired private SurveyDao surveyDao;
    @Autowired private SurveyPageDao surveyPageDao;
    @Autowired private SurveyQuestionDao surveyQuestionDao;
    @Autowired private SurveyQuestionApplDao surveyQuestionApplDao;
    @Autowired private SurveyQuestionCategoryDao surveyQuestionCategoryDao;
    @Autowired private SurveyQuestionOptionDao surveyQuestionOptionDao;
    @Autowired private SurveyResponseDao surveyResponseDao;
    @Autowired private SurveyResponseAnswerDao surveyResponseAnswerDao;
    @Autowired private WebSiteDao webSiteDao;
    @Autowired private WebSiteContentDao webSiteContentDao;
    @Autowired private WebSitePathAliasDao webSitePathAliasDao;
    @Autowired private WebAnalyticsConfigDao webAnalyticsConfigDao;
    @Autowired private MimeTypeDao mimeTypeDao;
    @Autowired private MimeTypeHtmlTemplateDao mimeTypeHtmlTemplateDao;
    @Autowired private CharacterSetDao characterSetDao;
    @Autowired private FileExtensionDao fileExtensionDao;
    @Autowired private MetaDataPredicateDao metaDataPredicateDao;
    @Autowired private ElectronicTextDao electronicTextDao;
    @Autowired private SubscriptionDao subscriptionDao;
    @Autowired private SubscriptionResourceDao subscriptionResourceDao;
    @Autowired private SubscriptionAttributeDao subscriptionAttributeDao;
    @Autowired private SubscriptionFulfillmentPieceDao subscriptionFulfillmentPieceDao;
    @Autowired private SubscriptionTypeAttrDao subscriptionTypeAttrDao;

    public Map<String, Object> test(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }

    // --- Content core ---
    public Map<String, Object> createContent(Map<String, Object> body) throws SQLException {
        Content e = new Content(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getContentId())) e.setContentId(SequenceUtil.next());
        contentDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContent(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentId");
        Content e = contentDao.gett(id);
        if (e == null) return ServiceResponse.error("Content not found: " + id);
        ServiceInput.populate(e, body); e.setContentId(id); contentDao.update(e);
        return ServiceResponse.success("contentId", id);
    }
    public Map<String, Object> removeContent(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentDao.deleteById(ServiceInput.str(body, "contentId")));
    }
    public Map<String, Object> deleteContent(Map<String, Object> body) throws SQLException { return removeContent(body); }
    public Map<String, Object> createContentApproval(Map<String, Object> body) throws SQLException {
        ContentApproval e = new ContentApproval(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getContentApprovalId())) e.setContentApprovalId(SequenceUtil.next());
        contentApprovalDao.insert(e); return ServiceResponse.success("contentApprovalId", e.getContentApprovalId());
    }
    public Map<String, Object> updateContentApproval(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentApprovalId");
        ContentApproval e = contentApprovalDao.gett(id);
        if (e == null) return ServiceResponse.error("ContentApproval not found: " + id);
        ServiceInput.populate(e, body); e.setContentApprovalId(id); contentApprovalDao.update(e);
        return ServiceResponse.success("contentApprovalId", id);
    }
    public Map<String, Object> removeContentApproval(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentApprovalDao.deleteById(ServiceInput.str(body, "contentApprovalId")));
    }
    public Map<String, Object> createContentAssoc(Map<String, Object> body) throws SQLException {
        ContentAssoc e = new ContentAssoc(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        contentAssocDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentAssoc(Map<String, Object> body) throws SQLException {
        ContentAssoc pk = new ContentAssoc(); ServiceInput.populate(pk, body);
        ContentAssoc e = contentAssocDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentAssoc not found");
        ServiceInput.populate(e, body); contentAssocDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> removeContentAssoc(Map<String, Object> body) throws SQLException {
        ContentAssoc pk = new ContentAssoc(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentAssocDao.delete(pk));
    }
    public Map<String, Object> deactivateContentAssoc(Map<String, Object> body) throws SQLException {
        ContentAssoc pk = new ContentAssoc(); ServiceInput.populate(pk, body);
        ContentAssoc e = contentAssocDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentAssoc not found");
        e.setThruDate(nowTs()); contentAssocDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> deactivateAllContentAssocs(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentId");
        contentAssocDao.list(Filters.and(Filters.eq("contentId", id), Filters.isNull("thruDate")))
            .forEach(a -> { try { a.setThruDate(nowTs()); contentAssocDao.update(a); } catch (SQLException ignored) {} });
        return ServiceResponse.success("contentId", id);
    }
    public Map<String, Object> createContentAssocPredicate(Map<String, Object> body) throws SQLException {
        ContentAssocPredicate e = new ContentAssocPredicate(); ServiceInput.populate(e, body);
        contentAssocPredicateDao.insert(e); return ServiceResponse.success("contentAssocPredicateId", e.getContentAssocPredicateId());
    }
    public Map<String, Object> updateContentAssocPredicate(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentAssocPredicateId");
        ContentAssocPredicate e = contentAssocPredicateDao.gett(id);
        if (e == null) return ServiceResponse.error("ContentAssocPredicate not found: " + id);
        ServiceInput.populate(e, body); e.setContentAssocPredicateId(id); contentAssocPredicateDao.update(e);
        return ServiceResponse.success("contentAssocPredicateId", id);
    }
    public Map<String, Object> removeContentAssocPredicate(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentAssocPredicateDao.deleteById(ServiceInput.str(body, "contentAssocPredicateId")));
    }
    public Map<String, Object> createContentAssocType(Map<String, Object> body) throws SQLException {
        ContentAssocType e = new ContentAssocType(); ServiceInput.populate(e, body);
        contentAssocTypeDao.insert(e); return ServiceResponse.success("contentAssocTypeId", e.getContentAssocTypeId());
    }
    public Map<String, Object> updateContentAssocType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentAssocTypeId");
        ContentAssocType e = contentAssocTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("ContentAssocType not found: " + id);
        ServiceInput.populate(e, body); e.setContentAssocTypeId(id); contentAssocTypeDao.update(e);
        return ServiceResponse.success("contentAssocTypeId", id);
    }
    public Map<String, Object> removeContentAssocType(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentAssocTypeDao.deleteById(ServiceInput.str(body, "contentAssocTypeId")));
    }
    public Map<String, Object> createContentAttribute(Map<String, Object> body) throws SQLException {
        ContentAttribute e = new ContentAttribute(); ServiceInput.populate(e, body);
        contentAttributeDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentAttribute(Map<String, Object> body) throws SQLException {
        ContentAttribute pk = new ContentAttribute(); ServiceInput.populate(pk, body);
        ContentAttribute e = contentAttributeDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentAttribute not found");
        ServiceInput.populate(e, body); contentAttributeDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> deleteContentAttribute(Map<String, Object> body) throws SQLException {
        ContentAttribute pk = new ContentAttribute(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentAttributeDao.delete(pk));
    }
    public Map<String, Object> createContentKeyword(Map<String, Object> body) throws SQLException {
        ContentKeyword e = new ContentKeyword(); ServiceInput.populate(e, body);
        contentKeywordDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentKeyword(Map<String, Object> body) throws SQLException {
        ContentKeyword pk = new ContentKeyword(); ServiceInput.populate(pk, body);
        ContentKeyword e = contentKeywordDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentKeyword not found");
        ServiceInput.populate(e, body); contentKeywordDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> removeContentKeyword(Map<String, Object> body) throws SQLException {
        ContentKeyword pk = new ContentKeyword(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentKeywordDao.delete(pk));
    }
    public Map<String, Object> createContentMetaData(Map<String, Object> body) throws SQLException {
        ContentMetaData e = new ContentMetaData(); ServiceInput.populate(e, body);
        contentMetaDataDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentMetaData(Map<String, Object> body) throws SQLException {
        ContentMetaData pk = new ContentMetaData(); ServiceInput.populate(pk, body);
        ContentMetaData e = contentMetaDataDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentMetaData not found");
        ServiceInput.populate(e, body); contentMetaDataDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> removeContentMetaData(Map<String, Object> body) throws SQLException {
        ContentMetaData pk = new ContentMetaData(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentMetaDataDao.delete(pk));
    }
    public Map<String, Object> createContentOperation(Map<String, Object> body) { return notPortedYet("createContentOperation"); }
    public Map<String, Object> updateContentOperation(Map<String, Object> body) { return notPortedYet("updateContentOperation"); }
    public Map<String, Object> removeContentOperation(Map<String, Object> body) { return notPortedYet("removeContentOperation"); }
    public Map<String, Object> createContentPurpose(Map<String, Object> body) throws SQLException {
        ContentPurpose e = new ContentPurpose(); ServiceInput.populate(e, body);
        contentPurposeDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> removeContentPurpose(Map<String, Object> body) throws SQLException {
        ContentPurpose pk = new ContentPurpose(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentPurposeDao.delete(pk));
    }
    public Map<String, Object> createContentPurposeOperation(Map<String, Object> body) { return notPortedYet("createContentPurposeOperation"); }
    public Map<String, Object> updateContentPurposeOperation(Map<String, Object> body) { return notPortedYet("updateContentPurposeOperation"); }
    public Map<String, Object> removeContentPurposeOperation(Map<String, Object> body) { return notPortedYet("removeContentPurposeOperation"); }
    public Map<String, Object> createContentPurposeType(Map<String, Object> body) throws SQLException {
        ContentPurposeType e = new ContentPurposeType(); ServiceInput.populate(e, body);
        contentPurposeTypeDao.insert(e); return ServiceResponse.success("contentPurposeTypeId", e.getContentPurposeTypeId());
    }
    public Map<String, Object> updateContentPurposeType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentPurposeTypeId");
        ContentPurposeType e = contentPurposeTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("ContentPurposeType not found: " + id);
        ServiceInput.populate(e, body); e.setContentPurposeTypeId(id); contentPurposeTypeDao.update(e);
        return ServiceResponse.success("contentPurposeTypeId", id);
    }
    public Map<String, Object> deleteContentPurposeType(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentPurposeTypeDao.deleteById(ServiceInput.str(body, "contentPurposeTypeId")));
    }
    public Map<String, Object> createContentRevision(Map<String, Object> body) throws SQLException {
        ContentRevision e = new ContentRevision(); ServiceInput.populate(e, body);
        contentRevisionDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> createContentRevisionItem(Map<String, Object> body) throws SQLException {
        ContentRevisionItem e = new ContentRevisionItem(); ServiceInput.populate(e, body);
        contentRevisionItemDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentRevisionItem(Map<String, Object> body) throws SQLException {
        ContentRevisionItem pk = new ContentRevisionItem(); ServiceInput.populate(pk, body);
        ContentRevisionItem e = contentRevisionItemDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentRevisionItem not found");
        ServiceInput.populate(e, body); contentRevisionItemDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> createContentRole(Map<String, Object> body) throws SQLException {
        ContentRole e = new ContentRole(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        contentRoleDao.insert(e); return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> updateContentRole(Map<String, Object> body) throws SQLException {
        ContentRole pk = new ContentRole(); ServiceInput.populate(pk, body);
        ContentRole e = contentRoleDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentRole not found");
        ServiceInput.populate(e, body); contentRoleDao.update(e);
        return ServiceResponse.success("contentId", e.getContentId());
    }
    public Map<String, Object> removeContentRole(Map<String, Object> body) throws SQLException {
        ContentRole pk = new ContentRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentRoleDao.delete(pk));
    }
    public Map<String, Object> createContentType(Map<String, Object> body) throws SQLException {
        ContentType e = new ContentType(); ServiceInput.populate(e, body);
        contentTypeDao.insert(e); return ServiceResponse.success("contentTypeId", e.getContentTypeId());
    }
    public Map<String, Object> updateContentType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "contentTypeId");
        ContentType e = contentTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("ContentType not found: " + id);
        ServiceInput.populate(e, body); e.setContentTypeId(id); contentTypeDao.update(e);
        return ServiceResponse.success("contentTypeId", id);
    }
    public Map<String, Object> deleteContentType(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", contentTypeDao.deleteById(ServiceInput.str(body, "contentTypeId")));
    }
    public Map<String, Object> createContentTypeAttr(Map<String, Object> body) throws SQLException {
        ContentTypeAttr e = new ContentTypeAttr(); ServiceInput.populate(e, body);
        contentTypeAttrDao.insert(e); return ServiceResponse.success("contentTypeId", e.getContentTypeId());
    }
    public Map<String, Object> updateContentTypeAttr(Map<String, Object> body) throws SQLException {
        ContentTypeAttr pk = new ContentTypeAttr(); ServiceInput.populate(pk, body);
        ContentTypeAttr e = contentTypeAttrDao.gett(pk);
        if (e == null) return ServiceResponse.error("ContentTypeAttr not found");
        ServiceInput.populate(e, body); contentTypeAttrDao.update(e);
        return ServiceResponse.success("contentTypeId", e.getContentTypeId());
    }
    public Map<String, Object> deleteContentTypeAttr(Map<String, Object> body) throws SQLException {
        ContentTypeAttr pk = new ContentTypeAttr(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", contentTypeAttrDao.delete(pk));
    }
    public Map<String, Object> createContentFromUploadedFile(Map<String, Object> body) { return notPortedYet("createContentFromUploadedFile"); }

    // --- DataResource ---
    public Map<String, Object> createDataResource(Map<String, Object> body) throws SQLException {
        DataResource e = new DataResource(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getDataResourceId())) e.setDataResourceId(SequenceUtil.next());
        dataResourceDao.insert(e); return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> updateDataResource(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataResourceId");
        DataResource e = dataResourceDao.gett(id);
        if (e == null) return ServiceResponse.error("DataResource not found: " + id);
        ServiceInput.populate(e, body); e.setDataResourceId(id); dataResourceDao.update(e);
        return ServiceResponse.success("dataResourceId", id);
    }
    public Map<String, Object> removeDataResource(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", dataResourceDao.deleteById(ServiceInput.str(body, "dataResourceId")));
    }
    public Map<String, Object> createDataResourceAndAssocToContent(Map<String, Object> body) { return notPortedYet("createDataResourceAndAssocToContent"); }
    public Map<String, Object> createDataResourceAndText(Map<String, Object> body) throws SQLException {
        Map<String,Object> dr = createDataResource(body);
        if (ServiceResponse.isError(dr)) return dr;
        String drId = (String) dr.get("dataResourceId");
        ElectronicText et = new ElectronicText();
        et.setDataResourceId(drId);
        et.setTextData(ServiceInput.str(body, "textData"));
        try { electronicTextDao.insert(et); } catch (SQLException dup) {/* */}
        return ServiceResponse.success("dataResourceId", drId);
    }
    public Map<String, Object> updateDataResourceAndText(Map<String, Object> body) throws SQLException {
        updateDataResource(body);
        String drId = ServiceInput.str(body, "dataResourceId");
        ElectronicText et = electronicTextDao.gett(drId);
        if (et != null) { et.setTextData(ServiceInput.str(body, "textData")); electronicTextDao.update(et); }
        return ServiceResponse.success("dataResourceId", drId);
    }
    public Map<String, Object> createDataResourceAttribute(Map<String, Object> body) throws SQLException {
        DataResourceAttribute e = new DataResourceAttribute(); ServiceInput.populate(e, body);
        dataResourceAttributeDao.insert(e); return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> updateDataResourceAttribute(Map<String, Object> body) throws SQLException {
        DataResourceAttribute pk = new DataResourceAttribute(); ServiceInput.populate(pk, body);
        DataResourceAttribute e = dataResourceAttributeDao.gett(pk);
        if (e == null) return ServiceResponse.error("DataResourceAttribute not found");
        ServiceInput.populate(e, body); dataResourceAttributeDao.update(e);
        return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> deleteDataResourceAttribute(Map<String, Object> body) throws SQLException {
        DataResourceAttribute pk = new DataResourceAttribute(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", dataResourceAttributeDao.delete(pk));
    }
    public Map<String, Object> createDataResourceRole(Map<String, Object> body) throws SQLException {
        DataResourceRole e = new DataResourceRole(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        dataResourceRoleDao.insert(e); return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> updateDataResourceRole(Map<String, Object> body) throws SQLException {
        DataResourceRole pk = new DataResourceRole(); ServiceInput.populate(pk, body);
        DataResourceRole e = dataResourceRoleDao.gett(pk);
        if (e == null) return ServiceResponse.error("DataResourceRole not found");
        ServiceInput.populate(e, body); dataResourceRoleDao.update(e);
        return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> removeDataResourceRole(Map<String, Object> body) throws SQLException {
        DataResourceRole pk = new DataResourceRole(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", dataResourceRoleDao.delete(pk));
    }
    public Map<String, Object> createDataResourceType(Map<String, Object> body) throws SQLException {
        DataResourceType e = new DataResourceType(); ServiceInput.populate(e, body);
        dataResourceTypeDao.insert(e); return ServiceResponse.success("dataResourceTypeId", e.getDataResourceTypeId());
    }
    public Map<String, Object> updateDataResourceType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataResourceTypeId");
        DataResourceType e = dataResourceTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("DataResourceType not found: " + id);
        ServiceInput.populate(e, body); e.setDataResourceTypeId(id); dataResourceTypeDao.update(e);
        return ServiceResponse.success("dataResourceTypeId", id);
    }
    public Map<String, Object> deleteDataResourceType(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", dataResourceTypeDao.deleteById(ServiceInput.str(body, "dataResourceTypeId")));
    }
    public Map<String, Object> createDataResourceTypeAttr(Map<String, Object> body) throws SQLException {
        DataResourceTypeAttr e = new DataResourceTypeAttr(); ServiceInput.populate(e, body);
        dataResourceTypeAttrDao.insert(e); return ServiceResponse.success("dataResourceTypeId", e.getDataResourceTypeId());
    }
    public Map<String, Object> updateDataResourceTypeAttr(Map<String, Object> body) throws SQLException {
        DataResourceTypeAttr pk = new DataResourceTypeAttr(); ServiceInput.populate(pk, body);
        DataResourceTypeAttr e = dataResourceTypeAttrDao.gett(pk);
        if (e == null) return ServiceResponse.error("DataResourceTypeAttr not found");
        ServiceInput.populate(e, body); dataResourceTypeAttrDao.update(e);
        return ServiceResponse.success("dataResourceTypeId", e.getDataResourceTypeId());
    }
    public Map<String, Object> deleteDataResourceTypeAttr(Map<String, Object> body) throws SQLException {
        DataResourceTypeAttr pk = new DataResourceTypeAttr(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", dataResourceTypeAttrDao.delete(pk));
    }
    public Map<String, Object> createDataCategory(Map<String, Object> body) throws SQLException {
        DataCategory e = new DataCategory(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getDataCategoryId())) e.setDataCategoryId(SequenceUtil.next());
        dataCategoryDao.insert(e); return ServiceResponse.success("dataCategoryId", e.getDataCategoryId());
    }
    public Map<String, Object> updateDataCategory(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataCategoryId");
        DataCategory e = dataCategoryDao.gett(id);
        if (e == null) return ServiceResponse.error("DataCategory not found: " + id);
        ServiceInput.populate(e, body); e.setDataCategoryId(id); dataCategoryDao.update(e);
        return ServiceResponse.success("dataCategoryId", id);
    }
    public Map<String, Object> removeDataCategory(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", dataCategoryDao.deleteById(ServiceInput.str(body, "dataCategoryId")));
    }

    // --- Survey ---
    public Map<String, Object> createSurvey(Map<String, Object> body) throws SQLException {
        Survey e = new Survey(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSurveyId())) e.setSurveyId(SequenceUtil.next());
        surveyDao.insert(e); return ServiceResponse.success("surveyId", e.getSurveyId());
    }
    public Map<String, Object> updateSurvey(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "surveyId");
        Survey e = surveyDao.gett(id);
        if (e == null) return ServiceResponse.error("Survey not found: " + id);
        ServiceInput.populate(e, body); e.setSurveyId(id); surveyDao.update(e);
        return ServiceResponse.success("surveyId", id);
    }
    public Map<String, Object> deleteSurvey(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", surveyDao.deleteById(ServiceInput.str(body, "surveyId")));
    }
    public Map<String, Object> createSurveyMultiResp(Map<String, Object> body) { return notPortedYet("createSurveyMultiResp"); }
    public Map<String, Object> updateSurveyMultiResp(Map<String, Object> body) { return notPortedYet("updateSurveyMultiResp"); }
    public Map<String, Object> deleteSurveyMultiResp(Map<String, Object> body) { return notPortedYet("deleteSurveyMultiResp"); }
    public Map<String, Object> createSurveyMultiRespColumn(Map<String, Object> body) { return notPortedYet("createSurveyMultiRespColumn"); }
    public Map<String, Object> updateSurveyMultiRespColumn(Map<String, Object> body) { return notPortedYet("updateSurveyMultiRespColumn"); }
    public Map<String, Object> deleteSurveyMultiRespColumn(Map<String, Object> body) { return notPortedYet("deleteSurveyMultiRespColumn"); }
    public Map<String, Object> createSurveyPage(Map<String, Object> body) throws SQLException {
        SurveyPage e = new SurveyPage(); ServiceInput.populate(e, body);
        surveyPageDao.insert(e); return ServiceResponse.success("surveyId", e.getSurveyId());
    }
    public Map<String, Object> updateSurveyPage(Map<String, Object> body) throws SQLException {
        SurveyPage pk = new SurveyPage(); ServiceInput.populate(pk, body);
        SurveyPage e = surveyPageDao.gett(pk);
        if (e == null) return ServiceResponse.error("SurveyPage not found");
        ServiceInput.populate(e, body); surveyPageDao.update(e);
        return ServiceResponse.success("surveyId", e.getSurveyId());
    }
    public Map<String, Object> deleteSurveyPage(Map<String, Object> body) throws SQLException {
        SurveyPage pk = new SurveyPage(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", surveyPageDao.delete(pk));
    }
    public Map<String, Object> createSurveyQuestion(Map<String, Object> body) throws SQLException {
        SurveyQuestion e = new SurveyQuestion(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSurveyQuestionId())) e.setSurveyQuestionId(SequenceUtil.next());
        surveyQuestionDao.insert(e); return ServiceResponse.success("surveyQuestionId", e.getSurveyQuestionId());
    }
    public Map<String, Object> updateSurveyQuestion(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "surveyQuestionId");
        SurveyQuestion e = surveyQuestionDao.gett(id);
        if (e == null) return ServiceResponse.error("SurveyQuestion not found: " + id);
        ServiceInput.populate(e, body); e.setSurveyQuestionId(id); surveyQuestionDao.update(e);
        return ServiceResponse.success("surveyQuestionId", id);
    }
    public Map<String, Object> deleteSurveyQuestion(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", surveyQuestionDao.deleteById(ServiceInput.str(body, "surveyQuestionId")));
    }
    public Map<String, Object> createSurveyQuestionAppl(Map<String, Object> body) throws SQLException {
        SurveyQuestionAppl e = new SurveyQuestionAppl(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        surveyQuestionApplDao.insert(e); return ServiceResponse.success("surveyId", e.getSurveyId());
    }
    public Map<String, Object> updateSurveyQuestionAppl(Map<String, Object> body) throws SQLException {
        SurveyQuestionAppl pk = new SurveyQuestionAppl(); ServiceInput.populate(pk, body);
        SurveyQuestionAppl e = surveyQuestionApplDao.gett(pk);
        if (e == null) return ServiceResponse.error("SurveyQuestionAppl not found");
        ServiceInput.populate(e, body); surveyQuestionApplDao.update(e);
        return ServiceResponse.success("surveyId", e.getSurveyId());
    }
    public Map<String, Object> deleteSurveyQuestionAppl(Map<String, Object> body) throws SQLException {
        SurveyQuestionAppl pk = new SurveyQuestionAppl(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", surveyQuestionApplDao.delete(pk));
    }
    public Map<String, Object> createSurveyQuestionCategory(Map<String, Object> body) throws SQLException {
        SurveyQuestionCategory e = new SurveyQuestionCategory(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSurveyQuestionCategoryId())) e.setSurveyQuestionCategoryId(SequenceUtil.next());
        surveyQuestionCategoryDao.insert(e); return ServiceResponse.success("surveyQuestionCategoryId", e.getSurveyQuestionCategoryId());
    }
    public Map<String, Object> updateSurveyQuestionCategory(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "surveyQuestionCategoryId");
        SurveyQuestionCategory e = surveyQuestionCategoryDao.gett(id);
        if (e == null) return ServiceResponse.error("SurveyQuestionCategory not found: " + id);
        ServiceInput.populate(e, body); e.setSurveyQuestionCategoryId(id); surveyQuestionCategoryDao.update(e);
        return ServiceResponse.success("surveyQuestionCategoryId", id);
    }
    public Map<String, Object> deleteSurveyQuestionCategory(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", surveyQuestionCategoryDao.deleteById(ServiceInput.str(body, "surveyQuestionCategoryId")));
    }
    public Map<String, Object> createSurveyQuestionOption(Map<String, Object> body) throws SQLException {
        SurveyQuestionOption e = new SurveyQuestionOption(); ServiceInput.populate(e, body);
        surveyQuestionOptionDao.insert(e); return ServiceResponse.success("surveyQuestionId", e.getSurveyQuestionId());
    }
    public Map<String, Object> updateSurveyQuestionOption(Map<String, Object> body) throws SQLException {
        SurveyQuestionOption pk = new SurveyQuestionOption(); ServiceInput.populate(pk, body);
        SurveyQuestionOption e = surveyQuestionOptionDao.gett(pk);
        if (e == null) return ServiceResponse.error("SurveyQuestionOption not found");
        ServiceInput.populate(e, body); surveyQuestionOptionDao.update(e);
        return ServiceResponse.success("surveyQuestionId", e.getSurveyQuestionId());
    }
    public Map<String, Object> deleteSurveyQuestionOption(Map<String, Object> body) throws SQLException {
        SurveyQuestionOption pk = new SurveyQuestionOption(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", surveyQuestionOptionDao.delete(pk));
    }
    public Map<String, Object> createSurveyResponse(Map<String, Object> body) throws SQLException {
        SurveyResponse e = new SurveyResponse(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSurveyResponseId())) e.setSurveyResponseId(SequenceUtil.next());
        surveyResponseDao.insert(e); return ServiceResponse.success("surveyResponseId", e.getSurveyResponseId());
    }
    public Map<String, Object> updateSurveyResponse(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "surveyResponseId");
        SurveyResponse e = surveyResponseDao.gett(id);
        if (e == null) return ServiceResponse.error("SurveyResponse not found: " + id);
        ServiceInput.populate(e, body); e.setSurveyResponseId(id); surveyResponseDao.update(e);
        return ServiceResponse.success("surveyResponseId", id);
    }
    public Map<String, Object> createSurveyResponseAnswer(Map<String, Object> body) throws SQLException {
        SurveyResponseAnswer e = new SurveyResponseAnswer(); ServiceInput.populate(e, body);
        surveyResponseAnswerDao.insert(e); return ServiceResponse.success("surveyResponseId", e.getSurveyResponseId());
    }
    public Map<String, Object> updateSurveyResponseAnswer(Map<String, Object> body) throws SQLException {
        SurveyResponseAnswer pk = new SurveyResponseAnswer(); ServiceInput.populate(pk, body);
        SurveyResponseAnswer e = surveyResponseAnswerDao.gett(pk);
        if (e == null) return ServiceResponse.error("SurveyResponseAnswer not found");
        ServiceInput.populate(e, body); surveyResponseAnswerDao.update(e);
        return ServiceResponse.success("surveyResponseId", e.getSurveyResponseId());
    }
    public Map<String, Object> createSurveyResponseAndRestoreParameters(Map<String, Object> body) throws SQLException { return createSurveyResponse(body); }
    public Map<String, Object> createSurveyResponseFromPdf(Map<String, Object> body) { return notPortedYet("createSurveyResponseFromPdf"); }
    public Map<String, Object> buildSurveyFromPdf(Map<String, Object> body) { return notPortedYet("buildSurveyFromPdf"); }
    public Map<String, Object> buildSurveyResponseFromPdf(Map<String, Object> body) { return notPortedYet("buildSurveyResponseFromPdf"); }
    public Map<String, Object> setSurveyResponseAnswers(Map<String, Object> body) { return notPortedYet("setSurveyResponseAnswers"); }

    // --- Forum / Blog ---
    public Map<String, Object> createForumGroup(Map<String, Object> body) { return notPortedYet("createForumGroup"); }
    public Map<String, Object> createForumThread(Map<String, Object> body) { return notPortedYet("createForumThread"); }
    public Map<String, Object> createForumMessage(Map<String, Object> body) { return notPortedYet("createForumMessage"); }
    public Map<String, Object> updateForumMessage(Map<String, Object> body) { return notPortedYet("updateForumMessage"); }
    public Map<String, Object> deleteForumMessage(Map<String, Object> body) { return notPortedYet("deleteForumMessage"); }
    public Map<String, Object> createForumGroupRole(Map<String, Object> body) { return notPortedYet("createForumGroupRole"); }
    public Map<String, Object> deleteForumGroupRole(Map<String, Object> body) { return notPortedYet("deleteForumGroupRole"); }
    public Map<String, Object> createBlogEntry(Map<String, Object> body) { return notPortedYet("createBlogEntry"); }
    public Map<String, Object> updateBlogEntry(Map<String, Object> body) { return notPortedYet("updateBlogEntry"); }
    public Map<String, Object> deleteBlogEntry(Map<String, Object> body) { return notPortedYet("deleteBlogEntry"); }

    // --- Layout (composite stubs) ---
    public Map<String, Object> createLayout(Map<String, Object> body) { return notPortedYet("createLayout"); }
    public Map<String, Object> updateLayout(Map<String, Object> body) { return notPortedYet("updateLayout"); }
    public Map<String, Object> deleteLayout(Map<String, Object> body) { return notPortedYet("deleteLayout"); }
    public Map<String, Object> cloneLayout(Map<String, Object> body) { return notPortedYet("cloneLayout"); }
    public Map<String, Object> createLayoutImage(Map<String, Object> body) { return notPortedYet("createLayoutImage"); }
    public Map<String, Object> updateLayoutImage(Map<String, Object> body) { return notPortedYet("updateLayoutImage"); }
    public Map<String, Object> createLayoutText(Map<String, Object> body) { return notPortedYet("createLayoutText"); }
    public Map<String, Object> updateLayoutText(Map<String, Object> body) { return notPortedYet("updateLayoutText"); }
    public Map<String, Object> createLayoutUrl(Map<String, Object> body) { return notPortedYet("createLayoutUrl"); }
    public Map<String, Object> updateLayoutUrl(Map<String, Object> body) { return notPortedYet("updateLayoutUrl"); }
    public Map<String, Object> createLayoutSubContent(Map<String, Object> body) { return notPortedYet("createLayoutSubContent"); }
    public Map<String, Object> updateLayoutSubContent(Map<String, Object> body) { return notPortedYet("updateLayoutSubContent"); }

    // --- Document / ElectronicText / MimeType / FileExtension / CharacterSet / MetaDataPredicate ---
    public Map<String, Object> createDocument(Map<String, Object> body) { return notPortedYet("createDocument"); }
    public Map<String, Object> updateDocument(Map<String, Object> body) { return notPortedYet("updateDocument"); }
    public Map<String, Object> createElectronicText(Map<String, Object> body) throws SQLException {
        ElectronicText e = new ElectronicText(); ServiceInput.populate(e, body);
        electronicTextDao.insert(e); return ServiceResponse.success("dataResourceId", e.getDataResourceId());
    }
    public Map<String, Object> updateElectronicText(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "dataResourceId");
        ElectronicText e = electronicTextDao.gett(id);
        if (e == null) return ServiceResponse.error("ElectronicText not found: " + id);
        ServiceInput.populate(e, body); e.setDataResourceId(id); electronicTextDao.update(e);
        return ServiceResponse.success("dataResourceId", id);
    }
    public Map<String, Object> createMimeType(Map<String, Object> body) throws SQLException {
        MimeType e = new MimeType(); ServiceInput.populate(e, body);
        mimeTypeDao.insert(e); return ServiceResponse.success("mimeTypeId", e.getMimeTypeId());
    }
    public Map<String, Object> updateMimeType(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "mimeTypeId");
        MimeType e = mimeTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("MimeType not found: " + id);
        ServiceInput.populate(e, body); e.setMimeTypeId(id); mimeTypeDao.update(e);
        return ServiceResponse.success("mimeTypeId", id);
    }
    public Map<String, Object> deleteMimeType(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", mimeTypeDao.deleteById(ServiceInput.str(body, "mimeTypeId")));
    }
    public Map<String, Object> createMimeTypeHtmlTemplate(Map<String, Object> body) throws SQLException {
        MimeTypeHtmlTemplate e = new MimeTypeHtmlTemplate(); ServiceInput.populate(e, body);
        mimeTypeHtmlTemplateDao.insert(e); return ServiceResponse.success("mimeTypeId", e.getMimeTypeId());
    }
    public Map<String, Object> updateMimeTypeHtmlTemplate(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "mimeTypeId");
        MimeTypeHtmlTemplate e = mimeTypeHtmlTemplateDao.gett(id);
        if (e == null) return ServiceResponse.error("MimeTypeHtmlTemplate not found: " + id);
        ServiceInput.populate(e, body); e.setMimeTypeId(id); mimeTypeHtmlTemplateDao.update(e);
        return ServiceResponse.success("mimeTypeId", id);
    }
    public Map<String, Object> deleteMimeTypeHtmlTemplate(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", mimeTypeHtmlTemplateDao.deleteById(ServiceInput.str(body, "mimeTypeId")));
    }
    public Map<String, Object> createCharacterSet(Map<String, Object> body) throws SQLException {
        CharacterSet e = new CharacterSet(); ServiceInput.populate(e, body);
        characterSetDao.insert(e); return ServiceResponse.success("characterSetId", e.getCharacterSetId());
    }
    public Map<String, Object> updateCharacterSet(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "characterSetId");
        CharacterSet e = characterSetDao.gett(id);
        if (e == null) return ServiceResponse.error("CharacterSet not found: " + id);
        ServiceInput.populate(e, body); e.setCharacterSetId(id); characterSetDao.update(e);
        return ServiceResponse.success("characterSetId", id);
    }
    public Map<String, Object> deleteCharacterSet(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", characterSetDao.deleteById(ServiceInput.str(body, "characterSetId")));
    }
    public Map<String, Object> createFileExtension(Map<String, Object> body) throws SQLException {
        FileExtension e = new FileExtension(); ServiceInput.populate(e, body);
        fileExtensionDao.insert(e); return ServiceResponse.success("fileExtensionId", e.getFileExtensionId());
    }
    public Map<String, Object> updateFileExtension(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "fileExtensionId");
        FileExtension e = fileExtensionDao.gett(id);
        if (e == null) return ServiceResponse.error("FileExtension not found: " + id);
        ServiceInput.populate(e, body); e.setFileExtensionId(id); fileExtensionDao.update(e);
        return ServiceResponse.success("fileExtensionId", id);
    }
    public Map<String, Object> deleteFileExtension(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", fileExtensionDao.deleteById(ServiceInput.str(body, "fileExtensionId")));
    }
    public Map<String, Object> createMetaDataPredicate(Map<String, Object> body) throws SQLException {
        MetaDataPredicate e = new MetaDataPredicate(); ServiceInput.populate(e, body);
        metaDataPredicateDao.insert(e); return ServiceResponse.success("metaDataPredicateId", e.getMetaDataPredicateId());
    }
    public Map<String, Object> updateMetaDataPredicate(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "metaDataPredicateId");
        MetaDataPredicate e = metaDataPredicateDao.gett(id);
        if (e == null) return ServiceResponse.error("MetaDataPredicate not found: " + id);
        ServiceInput.populate(e, body); e.setMetaDataPredicateId(id); metaDataPredicateDao.update(e);
        return ServiceResponse.success("metaDataPredicateId", id);
    }
    public Map<String, Object> deleteMetaDataPredicate(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", metaDataPredicateDao.deleteById(ServiceInput.str(body, "metaDataPredicateId")));
    }

    // --- WebSite / WebSiteContent / WebSitePathAlias / WebAnalyticsConfig ---
    public Map<String, Object> createWebSite(Map<String, Object> body) throws SQLException {
        WebSite e = new WebSite(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getWebSiteId())) e.setWebSiteId(SequenceUtil.next());
        webSiteDao.insert(e); return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> updateWebSite(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "webSiteId");
        WebSite e = webSiteDao.gett(id);
        if (e == null) return ServiceResponse.error("WebSite not found: " + id);
        ServiceInput.populate(e, body); e.setWebSiteId(id); webSiteDao.update(e);
        return ServiceResponse.success("webSiteId", id);
    }
    public Map<String, Object> deleteWebSite(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", webSiteDao.deleteById(ServiceInput.str(body, "webSiteId")));
    }
    public Map<String, Object> createWebSiteContent(Map<String, Object> body) throws SQLException {
        WebSiteContent e = new WebSiteContent(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        webSiteContentDao.insert(e); return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> updateWebSiteContent(Map<String, Object> body) throws SQLException {
        WebSiteContent pk = new WebSiteContent(); ServiceInput.populate(pk, body);
        WebSiteContent e = webSiteContentDao.gett(pk);
        if (e == null) return ServiceResponse.error("WebSiteContent not found");
        ServiceInput.populate(e, body); webSiteContentDao.update(e);
        return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> removeWebSiteContent(Map<String, Object> body) throws SQLException {
        WebSiteContent pk = new WebSiteContent(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", webSiteContentDao.delete(pk));
    }
    public Map<String, Object> autoCreateWebSiteContent(Map<String, Object> body) { return notPortedYet("autoCreateWebSiteContent"); }
    public Map<String, Object> createWebSitePathAlias(Map<String, Object> body) throws SQLException {
        WebSitePathAlias e = new WebSitePathAlias(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        webSitePathAliasDao.insert(e); return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> updateWebSitePathAlias(Map<String, Object> body) throws SQLException {
        WebSitePathAlias pk = new WebSitePathAlias(); ServiceInput.populate(pk, body);
        WebSitePathAlias e = webSitePathAliasDao.gett(pk);
        if (e == null) return ServiceResponse.error("WebSitePathAlias not found");
        ServiceInput.populate(e, body); webSitePathAliasDao.update(e);
        return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> deleteWebSitePathAlias(Map<String, Object> body) throws SQLException {
        WebSitePathAlias pk = new WebSitePathAlias(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", webSitePathAliasDao.delete(pk));
    }
    public Map<String, Object> createWebAnalyticsConfig(Map<String, Object> body) throws SQLException {
        WebAnalyticsConfig e = new WebAnalyticsConfig(); ServiceInput.populate(e, body);
        webAnalyticsConfigDao.insert(e); return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> updateWebAnalyticsConfig(Map<String, Object> body) throws SQLException {
        WebAnalyticsConfig pk = new WebAnalyticsConfig(); ServiceInput.populate(pk, body);
        WebAnalyticsConfig e = webAnalyticsConfigDao.gett(pk);
        if (e == null) return ServiceResponse.error("WebAnalyticsConfig not found");
        ServiceInput.populate(e, body); webAnalyticsConfigDao.update(e);
        return ServiceResponse.success("webSiteId", e.getWebSiteId());
    }
    public Map<String, Object> deleteWebAnalyticsConfig(Map<String, Object> body) throws SQLException {
        WebAnalyticsConfig pk = new WebAnalyticsConfig(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", webAnalyticsConfigDao.delete(pk));
    }

    // --- ProductFeatureDataResource / sundry stubs ---
    public Map<String, Object> createOrRemoveProductFeatureDataResource(Map<String, Object> body) { return notPortedYet("createOrRemoveProductFeatureDataResource"); }
    public Map<String, Object> createProductFeatureDataResource(Map<String, Object> body) { return notPortedYet("createProductFeatureDataResource"); }
    public Map<String, Object> uploadFileAndImage(Map<String, Object> body) { return notPortedYet("uploadFileAndImage"); }
    public Map<String, Object> updateContentImageFromUpload(Map<String, Object> body) { return notPortedYet("updateContentImageFromUpload"); }
    public Map<String, Object> persistContent(Map<String, Object> body) { return notPortedYet("persistContent"); }
    public Map<String, Object> persistContentAndAssoc(Map<String, Object> body) { return notPortedYet("persistContentAndAssoc"); }
    public Map<String, Object> persistDataResource(Map<String, Object> body) { return notPortedYet("persistDataResource"); }
    public Map<String, Object> persistDataResourceAndData(Map<String, Object> body) { return notPortedYet("persistDataResourceAndData"); }
    public Map<String, Object> copyToClip(Map<String, Object> body) { return notPortedYet("copyToClip"); }
    public Map<String, Object> execute(Map<String, Object> body) { return notPortedYet("execute"); }
    public Map<String, Object> component(Map<String, Object> body) { return notPortedYet("component"); }

    // --- Subscription ---
    public Map<String, Object> createSubscription(Map<String, Object> body) throws SQLException {
        Subscription e = new Subscription(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSubscriptionId())) e.setSubscriptionId(SequenceUtil.next());
        subscriptionDao.insert(e); return ServiceResponse.success("subscriptionId", e.getSubscriptionId());
    }
    public Map<String, Object> updateSubscription(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "subscriptionId");
        Subscription e = subscriptionDao.gett(id);
        if (e == null) return ServiceResponse.error("Subscription not found: " + id);
        ServiceInput.populate(e, body); e.setSubscriptionId(id); subscriptionDao.update(e);
        return ServiceResponse.success("subscriptionId", id);
    }
    public Map<String, Object> deleteSubscription(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", subscriptionDao.deleteById(ServiceInput.str(body, "subscriptionId")));
    }
    public Map<String, Object> createSubscriptionResource(Map<String, Object> body) throws SQLException {
        SubscriptionResource e = new SubscriptionResource(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getSubscriptionResourceId())) e.setSubscriptionResourceId(SequenceUtil.next());
        subscriptionResourceDao.insert(e); return ServiceResponse.success("subscriptionResourceId", e.getSubscriptionResourceId());
    }
    public Map<String, Object> updateSubscriptionResource(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "subscriptionResourceId");
        SubscriptionResource e = subscriptionResourceDao.gett(id);
        if (e == null) return ServiceResponse.error("SubscriptionResource not found: " + id);
        ServiceInput.populate(e, body); e.setSubscriptionResourceId(id); subscriptionResourceDao.update(e);
        return ServiceResponse.success("subscriptionResourceId", id);
    }
    public Map<String, Object> deleteSubscriptionResource(Map<String, Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", subscriptionResourceDao.deleteById(ServiceInput.str(body, "subscriptionResourceId")));
    }
    public Map<String, Object> createSubscriptionAttribute(Map<String, Object> body) throws SQLException {
        SubscriptionAttribute e = new SubscriptionAttribute(); ServiceInput.populate(e, body);
        subscriptionAttributeDao.insert(e); return ServiceResponse.success("subscriptionId", e.getSubscriptionId());
    }
    public Map<String, Object> updateSubscriptionAttribute(Map<String, Object> body) throws SQLException {
        SubscriptionAttribute pk = new SubscriptionAttribute(); ServiceInput.populate(pk, body);
        SubscriptionAttribute e = subscriptionAttributeDao.gett(pk);
        if (e == null) return ServiceResponse.error("SubscriptionAttribute not found");
        ServiceInput.populate(e, body); subscriptionAttributeDao.update(e);
        return ServiceResponse.success("subscriptionId", e.getSubscriptionId());
    }
    public Map<String, Object> deleteSubscriptionAttribute(Map<String, Object> body) throws SQLException {
        SubscriptionAttribute pk = new SubscriptionAttribute(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", subscriptionAttributeDao.delete(pk));
    }
    public Map<String, Object> createSubscriptionCommEvent(Map<String, Object> body) { return notPortedYet("createSubscriptionCommEvent"); }
    public Map<String, Object> deleteSubscriptionCommEvent(Map<String, Object> body) { return notPortedYet("deleteSubscriptionCommEvent"); }
    public Map<String, Object> createSubscriptionFulfillmentPiece(Map<String, Object> body) throws SQLException {
        SubscriptionFulfillmentPiece e = new SubscriptionFulfillmentPiece(); ServiceInput.populate(e, body);
        subscriptionFulfillmentPieceDao.insert(e); return ServiceResponse.success("subscriptionId", e.getSubscriptionId());
    }
    public Map<String, Object> updateSubscriptionFulfillmentPiece(Map<String, Object> body) throws SQLException {
        SubscriptionFulfillmentPiece pk = new SubscriptionFulfillmentPiece(); ServiceInput.populate(pk, body);
        SubscriptionFulfillmentPiece e = subscriptionFulfillmentPieceDao.gett(pk);
        if (e == null) return ServiceResponse.error("SubscriptionFulfillmentPiece not found");
        ServiceInput.populate(e, body); subscriptionFulfillmentPieceDao.update(e);
        return ServiceResponse.success("subscriptionId", e.getSubscriptionId());
    }
    public Map<String, Object> deleteSubscriptionFulfillmentPiece(Map<String, Object> body) throws SQLException {
        SubscriptionFulfillmentPiece pk = new SubscriptionFulfillmentPiece(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", subscriptionFulfillmentPieceDao.delete(pk));
    }
    public Map<String, Object> createSubscriptionTypeAttr(Map<String, Object> body) throws SQLException {
        SubscriptionTypeAttr e = new SubscriptionTypeAttr(); ServiceInput.populate(e, body);
        subscriptionTypeAttrDao.insert(e); return ServiceResponse.success("subscriptionTypeId", e.getSubscriptionTypeId());
    }
    public Map<String, Object> updateSubscriptionTypeAttr(Map<String, Object> body) throws SQLException {
        SubscriptionTypeAttr pk = new SubscriptionTypeAttr(); ServiceInput.populate(pk, body);
        SubscriptionTypeAttr e = subscriptionTypeAttrDao.gett(pk);
        if (e == null) return ServiceResponse.error("SubscriptionTypeAttr not found");
        ServiceInput.populate(e, body); subscriptionTypeAttrDao.update(e);
        return ServiceResponse.success("subscriptionTypeId", e.getSubscriptionTypeId());
    }
    public Map<String, Object> deleteSubscriptionTypeAttr(Map<String, Object> body) throws SQLException {
        SubscriptionTypeAttr pk = new SubscriptionTypeAttr(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", subscriptionTypeAttrDao.delete(pk));
    }
    public Map<String, Object> processExtendSubscription(Map<String, Object> body) { return notPortedYet("processExtendSubscription"); }
    public Map<String, Object> processExtendSubscriptionByProduct(Map<String, Object> body) { return notPortedYet("processExtendSubscriptionByProduct"); }
    public Map<String, Object> sendSubscriptionEmails(Map<String, Object> body) { return notPortedYet("sendSubscriptionEmails"); }
}
