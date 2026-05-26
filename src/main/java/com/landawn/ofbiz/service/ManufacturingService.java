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

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.CostComponentCalcDao;
import com.landawn.ofbiz.dao.ProductManufacturingRuleDao;
import com.landawn.ofbiz.dao.TechDataCalendarDao;
import com.landawn.ofbiz.dao.TechDataCalendarExcDayDao;
import com.landawn.ofbiz.dao.TechDataCalendarExcWeekDao;
import com.landawn.ofbiz.dao.TechDataCalendarWeekDao;
import com.landawn.ofbiz.dao.WorkEffortAssocDao;
import com.landawn.ofbiz.dao.WorkEffortContentDao;
import com.landawn.ofbiz.dao.WorkEffortCostCalcDao;
import com.landawn.ofbiz.dao.WorkEffortDao;
import com.landawn.ofbiz.dao.WorkEffortFixedAssetAssignDao;
import com.landawn.ofbiz.dao.WorkEffortFixedAssetStdDao;
import com.landawn.ofbiz.dao.WorkEffortGoodStandardDao;
import com.landawn.ofbiz.dao.WorkEffortPartyAssignmentDao;
import com.landawn.ofbiz.dao.WorkEffortSkillStandardDao;
import com.landawn.ofbiz.entity.CostComponentCalc;
import com.landawn.ofbiz.entity.ProductManufacturingRule;
import com.landawn.ofbiz.entity.TechDataCalendar;
import com.landawn.ofbiz.entity.TechDataCalendarExcDay;
import com.landawn.ofbiz.entity.TechDataCalendarExcWeek;
import com.landawn.ofbiz.entity.TechDataCalendarWeek;
import com.landawn.ofbiz.entity.WorkEffort;
import com.landawn.ofbiz.entity.WorkEffortAssoc;
import com.landawn.ofbiz.entity.WorkEffortContent;
import com.landawn.ofbiz.entity.WorkEffortCostCalc;
import com.landawn.ofbiz.entity.WorkEffortFixedAssetAssign;
import com.landawn.ofbiz.entity.WorkEffortFixedAssetStd;
import com.landawn.ofbiz.entity.WorkEffortGoodStandard;
import com.landawn.ofbiz.entity.WorkEffortPartyAssignment;
import com.landawn.ofbiz.entity.WorkEffortSkillStandard;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 86 OFBiz services exposed by {@link com.landawn.ofbiz.controller.ManufacturingController}.
 *
 * <p>Calendar/Cost/ManufacturingRule entity-auto CRUD is fully implemented. Production-run and
 * MRP business processes (changeProductionRunStatus, issueProductionRunTask, executeMrp, getBOMTree,
 * etc.) are deep workflow algorithms that depend on inventory + cost-accounting infrastructure
 * not ported yet; those carry {@code // TODO unimplemented:} markers.
 */
@Service
@Transactional
public class ManufacturingService {

    private final TechDataCalendarDao calendarDao;
    private final TechDataCalendarWeekDao calendarWeekDao;
    private final TechDataCalendarExcDayDao calendarExcDayDao;
    private final TechDataCalendarExcWeekDao calendarExcWeekDao;
    private final CostComponentCalcDao costComponentCalcDao;
    private final ProductManufacturingRuleDao productManufacturingRuleDao;
    private final WorkEffortDao workEffortDao;
    private final WorkEffortAssocDao workEffortAssocDao;
    private final WorkEffortContentDao workEffortContentDao;
    private final WorkEffortCostCalcDao workEffortCostCalcDao;
    private final WorkEffortFixedAssetAssignDao workEffortFixedAssetAssignDao;
    private final WorkEffortFixedAssetStdDao workEffortFixedAssetStdDao;
    private final WorkEffortGoodStandardDao workEffortGoodStandardDao;
    private final WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao;
    private final WorkEffortSkillStandardDao workEffortSkillStandardDao;

    public ManufacturingService(TechDataCalendarDao calendarDao,
                                TechDataCalendarWeekDao calendarWeekDao,
                                TechDataCalendarExcDayDao calendarExcDayDao,
                                TechDataCalendarExcWeekDao calendarExcWeekDao,
                                CostComponentCalcDao costComponentCalcDao,
                                ProductManufacturingRuleDao productManufacturingRuleDao,
                                WorkEffortDao workEffortDao,
                                WorkEffortAssocDao workEffortAssocDao,
                                WorkEffortContentDao workEffortContentDao,
                                WorkEffortCostCalcDao workEffortCostCalcDao,
                                WorkEffortFixedAssetAssignDao workEffortFixedAssetAssignDao,
                                WorkEffortFixedAssetStdDao workEffortFixedAssetStdDao,
                                WorkEffortGoodStandardDao workEffortGoodStandardDao,
                                WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao,
                                WorkEffortSkillStandardDao workEffortSkillStandardDao) {
        this.calendarDao = calendarDao;
        this.calendarWeekDao = calendarWeekDao;
        this.calendarExcDayDao = calendarExcDayDao;
        this.calendarExcWeekDao = calendarExcWeekDao;
        this.costComponentCalcDao = costComponentCalcDao;
        this.productManufacturingRuleDao = productManufacturingRuleDao;
        this.workEffortDao = workEffortDao;
        this.workEffortAssocDao = workEffortAssocDao;
        this.workEffortContentDao = workEffortContentDao;
        this.workEffortCostCalcDao = workEffortCostCalcDao;
        this.workEffortFixedAssetAssignDao = workEffortFixedAssetAssignDao;
        this.workEffortFixedAssetStdDao = workEffortFixedAssetStdDao;
        this.workEffortGoodStandardDao = workEffortGoodStandardDao;
        this.workEffortPartyAssignmentDao = workEffortPartyAssignmentDao;
        this.workEffortSkillStandardDao = workEffortSkillStandardDao;
    }

    // =========================================================================
    // Calendar CRUD
    // =========================================================================

    public Map<String, Object> createCalendar(Map<String, Object> body) throws SQLException {
        TechDataCalendar e = new TechDataCalendar(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCalendarId())) e.setCalendarId(SequenceUtil.next());
        calendarDao.insert(e);
        return ServiceResponse.success("calendarId", e.getCalendarId());
    }

    public Map<String, Object> updateCalendar(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "calendarId");
        TechDataCalendar e = calendarDao.gett(id);
        if (e == null) return ServiceResponse.error("Calendar not found: " + id);
        ServiceInput.populate(e, body); e.setCalendarId(id);
        calendarDao.update(e);
        return ServiceResponse.success("calendarId", id);
    }

    public Map<String, Object> removeCalendar(Map<String, Object> body) throws SQLException {
        int n = calendarDao.deleteById(ServiceInput.str(body, "calendarId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createCalendarWeek(Map<String, Object> body) throws SQLException {
        TechDataCalendarWeek e = new TechDataCalendarWeek(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCalendarWeekId())) e.setCalendarWeekId(SequenceUtil.next());
        calendarWeekDao.insert(e);
        return ServiceResponse.success("calendarWeekId", e.getCalendarWeekId());
    }

    public Map<String, Object> updateCalendarWeek(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "calendarWeekId");
        TechDataCalendarWeek e = calendarWeekDao.gett(id);
        if (e == null) return ServiceResponse.error("CalendarWeek not found: " + id);
        ServiceInput.populate(e, body); e.setCalendarWeekId(id);
        calendarWeekDao.update(e);
        return ServiceResponse.success("calendarWeekId", id);
    }

    public Map<String, Object> removeCalendarWeek(Map<String, Object> body) throws SQLException {
        int n = calendarWeekDao.deleteById(ServiceInput.str(body, "calendarWeekId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createCalendarExceptionDay(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcDay e = new TechDataCalendarExcDay(); ServiceInput.populate(e, body);
        calendarExcDayDao.insert(e);
        return ServiceResponse.success("calendarId", e.getCalendarId());
    }

    public Map<String, Object> updateCalendarExceptionDay(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcDay pk = new TechDataCalendarExcDay(); ServiceInput.populate(pk, body);
        TechDataCalendarExcDay e = calendarExcDayDao.gett(pk);
        if (e == null) return ServiceResponse.error("CalendarExceptionDay not found");
        ServiceInput.populate(e, body);
        calendarExcDayDao.update(e);
        return ServiceResponse.success("calendarId", e.getCalendarId());
    }

    public Map<String, Object> removeCalendarExceptionDay(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcDay pk = new TechDataCalendarExcDay(); ServiceInput.populate(pk, body);
        int n = calendarExcDayDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createCalendarExceptionWeek(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcWeek e = new TechDataCalendarExcWeek(); ServiceInput.populate(e, body);
        calendarExcWeekDao.insert(e);
        return ServiceResponse.success("calendarId", e.getCalendarId());
    }

    public Map<String, Object> updateCalendarExceptionWeek(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcWeek pk = new TechDataCalendarExcWeek(); ServiceInput.populate(pk, body);
        TechDataCalendarExcWeek e = calendarExcWeekDao.gett(pk);
        if (e == null) return ServiceResponse.error("CalendarExceptionWeek not found");
        ServiceInput.populate(e, body);
        calendarExcWeekDao.update(e);
        return ServiceResponse.success("calendarId", e.getCalendarId());
    }

    public Map<String, Object> removeCalendarExceptionWeek(Map<String, Object> body) throws SQLException {
        TechDataCalendarExcWeek pk = new TechDataCalendarExcWeek(); ServiceInput.populate(pk, body);
        int n = calendarExcWeekDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // Cost / Manufacturing rules
    // =========================================================================

    public Map<String, Object> createCostComponentCalc(Map<String, Object> body) throws SQLException {
        CostComponentCalc e = new CostComponentCalc(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getCostComponentCalcId())) {
            e.setCostComponentCalcId(SequenceUtil.next());
        }
        costComponentCalcDao.insert(e);
        return ServiceResponse.success("costComponentCalcId", e.getCostComponentCalcId());
    }

    public Map<String, Object> updateCostComponentCalc(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "costComponentCalcId");
        CostComponentCalc e = costComponentCalcDao.gett(id);
        if (e == null) return ServiceResponse.error("CostComponentCalc not found: " + id);
        ServiceInput.populate(e, body); e.setCostComponentCalcId(id);
        costComponentCalcDao.update(e);
        return ServiceResponse.success("costComponentCalcId", id);
    }

    public Map<String, Object> removeCostComponentCalc(Map<String, Object> body) throws SQLException {
        int n = costComponentCalcDao.deleteById(ServiceInput.str(body, "costComponentCalcId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> addProductManufacturingRule(Map<String, Object> body) throws SQLException {
        ProductManufacturingRule e = new ProductManufacturingRule(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getRuleId())) e.setRuleId(SequenceUtil.next());
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        productManufacturingRuleDao.insert(e);
        return ServiceResponse.success("ruleId", e.getRuleId());
    }

    public Map<String, Object> updateProductManufacturingRule(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "ruleId");
        ProductManufacturingRule e = productManufacturingRuleDao.gett(id);
        if (e == null) return ServiceResponse.error("ProductManufacturingRule not found: " + id);
        ServiceInput.populate(e, body); e.setRuleId(id);
        productManufacturingRuleDao.update(e);
        return ServiceResponse.success("ruleId", id);
    }

    public Map<String, Object> deleteProductManufacturingRule(Map<String, Object> body) throws SQLException {
        int n = productManufacturingRuleDao.deleteById(ServiceInput.str(body, "ruleId"));
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // WorkEffort + WorkEffort* secondaries (manufacturing-flavored, not full workeffort port)
    // =========================================================================

    public Map<String, Object> createWorkEffort(Map<String, Object> body) throws SQLException {
        WorkEffort e = new WorkEffort(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getWorkEffortId())) e.setWorkEffortId(SequenceUtil.next());
        Timestamp now = nowTs();
        e.setCreatedDate(now); e.setLastModifiedDate(now); e.setLastStatusUpdate(now);
        e.setRevisionNumber(1);
        workEffortDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updateWorkEffort(Map<String, Object> body) throws SQLException {
        String id = ServiceInput.str(body, "workEffortId");
        WorkEffort e = workEffortDao.gett(id);
        if (e == null) return ServiceResponse.error("WorkEffort not found: " + id);
        ServiceInput.populate(e, body); e.setWorkEffortId(id);
        e.setLastModifiedDate(nowTs());
        e.setRevisionNumber(e.getRevisionNumber() + 1);
        workEffortDao.update(e);
        return ServiceResponse.success("workEffortId", id);
    }

    public Map<String, Object> deleteWorkEffort(Map<String, Object> body) throws SQLException {
        int n = workEffortDao.deleteById(ServiceInput.str(body, "workEffortId"));
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortContent(Map<String, Object> body) throws SQLException {
        WorkEffortContent e = new WorkEffortContent(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        workEffortContentDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> deleteWorkEffortContent(Map<String, Object> body) throws SQLException {
        WorkEffortContent pk = new WorkEffortContent(); ServiceInput.populate(pk, body);
        int n = workEffortContentDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortCostCalc(Map<String, Object> body) throws SQLException {
        WorkEffortCostCalc e = new WorkEffortCostCalc(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        workEffortCostCalcDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> removeWorkEffortCostCalc(Map<String, Object> body) throws SQLException {
        WorkEffortCostCalc pk = new WorkEffortCostCalc(); ServiceInput.populate(pk, body);
        int n = workEffortCostCalcDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortFixedAssetAssign(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetAssign e = new WorkEffortFixedAssetAssign(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        workEffortFixedAssetAssignDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updateWorkEffortFixedAssetAssign(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetAssign pk = new WorkEffortFixedAssetAssign(); ServiceInput.populate(pk, body);
        WorkEffortFixedAssetAssign e = workEffortFixedAssetAssignDao.gett(pk);
        if (e == null) return ServiceResponse.error("WorkEffortFixedAssetAssign not found");
        ServiceInput.populate(e, body);
        workEffortFixedAssetAssignDao.update(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> removeWorkEffortFixedAssetAssign(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetAssign pk = new WorkEffortFixedAssetAssign(); ServiceInput.populate(pk, body);
        int n = workEffortFixedAssetAssignDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortFixedAssetStd(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetStd e = new WorkEffortFixedAssetStd(); ServiceInput.populate(e, body);
        workEffortFixedAssetStdDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updateWorkEffortFixedAssetStd(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetStd pk = new WorkEffortFixedAssetStd(); ServiceInput.populate(pk, body);
        WorkEffortFixedAssetStd e = workEffortFixedAssetStdDao.gett(pk);
        if (e == null) return ServiceResponse.error("WorkEffortFixedAssetStd not found");
        ServiceInput.populate(e, body);
        workEffortFixedAssetStdDao.update(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> removeWorkEffortFixedAssetStd(Map<String, Object> body) throws SQLException {
        WorkEffortFixedAssetStd pk = new WorkEffortFixedAssetStd(); ServiceInput.populate(pk, body);
        int n = workEffortFixedAssetStdDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortGoodStandard(Map<String, Object> body) throws SQLException {
        WorkEffortGoodStandard e = new WorkEffortGoodStandard(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        workEffortGoodStandardDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updateWorkEffortGoodStandard(Map<String, Object> body) throws SQLException {
        WorkEffortGoodStandard pk = new WorkEffortGoodStandard(); ServiceInput.populate(pk, body);
        WorkEffortGoodStandard e = workEffortGoodStandardDao.gett(pk);
        if (e == null) return ServiceResponse.error("WorkEffortGoodStandard not found");
        ServiceInput.populate(e, body);
        workEffortGoodStandardDao.update(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> removeWorkEffortGoodStandard(Map<String, Object> body) throws SQLException {
        WorkEffortGoodStandard pk = new WorkEffortGoodStandard(); ServiceInput.populate(pk, body);
        int n = workEffortGoodStandardDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> createWorkEffortSkillStandard(Map<String, Object> body) throws SQLException {
        WorkEffortSkillStandard e = new WorkEffortSkillStandard(); ServiceInput.populate(e, body);
        workEffortSkillStandardDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updateWorkEffortSkillStandard(Map<String, Object> body) throws SQLException {
        WorkEffortSkillStandard pk = new WorkEffortSkillStandard(); ServiceInput.populate(pk, body);
        WorkEffortSkillStandard e = workEffortSkillStandardDao.gett(pk);
        if (e == null) return ServiceResponse.error("WorkEffortSkillStandard not found");
        ServiceInput.populate(e, body);
        workEffortSkillStandardDao.update(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> deleteWorkEffortSkillStandard(Map<String, Object> body) throws SQLException {
        WorkEffortSkillStandard pk = new WorkEffortSkillStandard(); ServiceInput.populate(pk, body);
        int n = workEffortSkillStandardDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> removeWorkEffortAssoc(Map<String, Object> body) throws SQLException {
        WorkEffortAssoc pk = new WorkEffortAssoc(); ServiceInput.populate(pk, body);
        int n = workEffortAssocDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    public Map<String, Object> assignPartyToWorkEffort(Map<String, Object> body) throws SQLException {
        WorkEffortPartyAssignment e = new WorkEffortPartyAssignment(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        workEffortPartyAssignmentDao.insert(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    public Map<String, Object> updatePartyToWorkEffortAssignment(Map<String, Object> body) throws SQLException {
        WorkEffortPartyAssignment pk = new WorkEffortPartyAssignment(); ServiceInput.populate(pk, body);
        WorkEffortPartyAssignment e = workEffortPartyAssignmentDao.gett(pk);
        if (e == null) return ServiceResponse.error("WorkEffortPartyAssignment not found");
        ServiceInput.populate(e, body);
        workEffortPartyAssignmentDao.update(e);
        return ServiceResponse.success("workEffortId", e.getWorkEffortId());
    }

    // =========================================================================
    // Production-run + BOM/MRP business processes — substantial workflow logic
    // =========================================================================

    /** TODO unimplemented: ProductionRun is a workflow over WorkEffort + Inventory + Cost-accounting. */
    public Map<String, Object> createProductionRun(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createProductionRun not ported (requires inventory/cost orchestration)", null);
    }

    public Map<String, Object> updateProductionRun(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("updateProductionRun not ported", null);
    }

    public Map<String, Object> cancelProductionRun(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("cancelProductionRun not ported", null);
    }

    public Map<String, Object> changeProductionRunStatus(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("changeProductionRunStatus not ported", null);
    }

    public Map<String, Object> changeProductionRunTaskStatus(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("changeProductionRunTaskStatus not ported", null);
    }

    public Map<String, Object> quickChangeProductionRunStatus(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("quickChangeProductionRunStatus not ported", null);
    }

    public Map<String, Object> quickRunAllProductionRunTasks(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("quickRunAllProductionRunTasks not ported", null);
    }

    public Map<String, Object> quickRunProductionRunTask(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("quickRunProductionRunTask not ported", null);
    }

    public Map<String, Object> quickStartAllProductionRunTasks(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("quickStartAllProductionRunTasks not ported", null);
    }

    public Map<String, Object> addProductionRunComponent(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("addProductionRunComponent not ported", null);
    }

    public Map<String, Object> updateProductionRunComponent(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("updateProductionRunComponent not ported", null);
    }

    public Map<String, Object> addProductionRunRoutingTask(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("addProductionRunRoutingTask not ported", null);
    }

    public Map<String, Object> updateProductionRunTask(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("updateProductionRunTask not ported", null);
    }

    public Map<String, Object> editProductionRunRoutingTask(Map<String, Object> body) {
        return ServiceResponse.successWithMessage("editProductionRunRoutingTask not ported", null);
    }

    public Map<String, Object> createProductionRunAssoc(Map<String, Object> body) throws SQLException {
        WorkEffortAssoc e = new WorkEffortAssoc(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        if (workEffortAssocDao.gett(e) == null) workEffortAssocDao.insert(e);
        return ServiceResponse.success("workEffortIdFrom", e.getWorkEffortIdFrom());
    }

    public Map<String, Object> createProductionRunPartyAssign(Map<String, Object> body) throws SQLException {
        return assignPartyToWorkEffort(body);
    }

    public Map<String, Object> createProductionRunsForProductBom(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createProductionRunsForProductBom not ported (requires BOM tree explosion)", null);
    }

    public Map<String, Object> createProductionRunsForShipment(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "createProductionRunsForShipment not ported (cross-component Shipment)", null);
    }

    public Map<String, Object> issueProductionRunTask(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "issueProductionRunTask not ported (inventory issuance workflow)", null);
    }

    public Map<String, Object> issueProductionRunTaskComponent(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "issueProductionRunTaskComponent not ported (inventory issuance workflow)", null);
    }

    public Map<String, Object> productionRunDeclareAndProduce(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "productionRunDeclareAndProduce not ported (inventory + WIP receipt)", null);
    }

    public Map<String, Object> productionRunProduce(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "productionRunProduce not ported (inventory + WIP receipt)", null);
    }

    public Map<String, Object> productionRunTaskProduce(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "productionRunTaskProduce not ported (inventory + WIP receipt)", null);
    }

    public Map<String, Object> productionRunTaskReturnMaterial(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "productionRunTaskReturnMaterial not ported", null);
    }

    public Map<String, Object> releaseProductionRunTaskComponent(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "releaseProductionRunTaskComponent not ported", null);
    }

    public Map<String, Object> reallocateAndIssueInventory(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "reallocateAndIssueInventory not ported (inventory orchestration)", null);
    }

    public Map<String, Object> reserveWorkEffortInventoryItem(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "reserveWorkEffortInventoryItem not ported (inventory reservation)", null);
    }

    public Map<String, Object> getBOMTree(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "getBOMTree not ported (depends on BOM explosion algorithm + ProductAssoc graph)",
                null);
    }

    public Map<String, Object> executeMrp(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "executeMrp not ported (MRP planner — depends on inventory + sales-orders + BOM)",
                null);
    }

    public Map<String, Object> eventEditBOM(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "eventEditBOM not ported (UI event handler for BOM editor)", null);
    }

    public Map<String, Object> addRoutingTaskAssoc(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "addRoutingTaskAssoc not ported (routing workflow)", null);
    }

    public Map<String, Object> updateRoutingTaskAssoc(Map<String, Object> body) {
        return ServiceResponse.successWithMessage(
                "updateRoutingTaskAssoc not ported (routing workflow)", null);
    }

    // =========================================================================
    // Internals
    // =========================================================================

    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS));
    }
}
