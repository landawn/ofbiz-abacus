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
@RequestMapping("/manufacturing")
public class ManufacturingController {

    /**
     * Create a Product Manufacturing Rule
     * <p>service: addProductManufacturingRule  entities: ProductManufacturingRule  auth: true
     */
    @PostMapping("/manufacturing/control/AddProductManufacturingRule")
    public ResponseEntity<Map<String, Object>> addProductManufacturingRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/AddRoutingProductLink")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addRoutingTaskAssoc  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/AddRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> addRoutingTaskAssoc(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a calendar
     * <p>service: createCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendar")
    public ResponseEntity<Map<String, Object>> createCalendar(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a calendar ExceptionDay
     * <p>service: createCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendarExceptionDay")
    public ResponseEntity<Map<String, Object>> createCalendarExceptionDay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Calendar Exception Week
     * <p>service: createCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendarExceptionWeek")
    public ResponseEntity<Map<String, Object>> createCalendarExceptionWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort Entity
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/CreateRouting")
    public ResponseEntity<Map<String, Object>> createWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort Entity
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/CreateRoutingTask")
    public ResponseEntity<Map<String, Object>> createWorkEffortCreateRoutingTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Product Manufacturing Rule
     * <p>service: deleteProductManufacturingRule  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/DeleteProductManufacturingRule")
    public ResponseEntity<Map<String, Object>> deleteProductManufacturingRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a calendar
     * <p>service: removeCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendar")
    public ResponseEntity<Map<String, Object>> removeCalendar(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a calendar ExceptionDay
     * <p>service: removeCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarExceptionDay")
    public ResponseEntity<Map<String, Object>> removeCalendarExceptionDay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Calendar Exception Week
     * <p>service: removeCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarExceptionWeek")
    public ResponseEntity<Map<String, Object>> removeCalendarExceptionWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Calendar Week
     * <p>service: removeCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarWeek")
    public ResponseEntity<Map<String, Object>> removeCalendarWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveRoutingTask")
    public ResponseEntity<Map<String, Object>> deleteWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: removeWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> removeWorkEffortAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/ShowProductionRun")
    public ResponseEntity<Map<String, Object>> showProductionRun(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a calendar
     * <p>service: updateCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendar")
    public ResponseEntity<Map<String, Object>> updateCalendar(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a calendar ExceptionDay
     * <p>service: updateCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendarExceptionDay")
    public ResponseEntity<Map<String, Object>> updateCalendarExceptionDay(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Calendar Exception Week
     * <p>service: updateCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendarExceptionWeek")
    public ResponseEntity<Map<String, Object>> updateCalendarExceptionWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: eventEditBOM  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/UpdateProductBom")
    public ResponseEntity<Map<String, Object>> eventEditBOM(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Manufacturing Rule
     * <p>service: updateProductManufacturingRule  entities: ProductManufacturingRule  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateProductManufacturingRule")
    public ResponseEntity<Map<String, Object>> updateProductManufacturingRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRouting")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingProductLink")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingTask")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateRoutingTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateRoutingTaskAssoc  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/UpdateRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> updateRoutingTaskAssoc(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingTaskForRouting")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateRoutingTaskForRouting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * add a Product Component to an existing ProductionRun
     * <p>service: addProductionRunComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/addProductionRunComponent")
    public ResponseEntity<Map<String, Object>> addProductionRunComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductionRunRoutingTask  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/addProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> addProductionRunRoutingTask(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffortCostCalc entry
     * <p>service: createWorkEffortCostCalc  entities: WorkEffortCostCalc  auth: true
     */
    @PostMapping("/manufacturing/control/addRoutingTaskCost")
    public ResponseEntity<Map<String, Object>> createWorkEffortCostCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/addRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandardAddRoutingTaskProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancels a ProductionRun.
     * <p>service: cancelProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/cancelProductionRun")
    public ResponseEntity<Map<String, Object>> cancelProductionRun(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the Production Run status
     * <p>service: changeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunStatusToClosed")
    public ResponseEntity<Map<String, Object>> changeProductionRunStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the Production Run status
     * <p>service: changeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunStatusToPrinted")
    public ResponseEntity<Map<String, Object>> changeProductionRunStatusChangeProductionRunStatusToPrinted(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Change the Production Run Task status
     * <p>service: changeProductionRunTaskStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunTaskStatus")
    public ResponseEntity<Map<String, Object>> changeProductionRunTaskStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Calendar Week
     * <p>service: createCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/createCalendarWeek")
    public ResponseEntity<Map<String, Object>> createCalendarWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CostComponentCalc
     * <p>service: createCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/createCostComponentCalc")
    public ResponseEntity<Map<String, Object>> createCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductionRun  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRun")
    public ResponseEntity<Map<String, Object>> createProductionRun(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Associate the production run to another production run
     * <p>service: createProductionRunAssoc  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunAssoc")
    public ResponseEntity<Map<String, Object>> createProductionRunAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createWorkEffortContent  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRunContents")
    public ResponseEntity<Map<String, Object>> createWorkEffortContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Associate a party to the production run
     * <p>service: createProductionRunPartyAssign  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunPartyAssign")
    public ResponseEntity<Map<String, Object>> createProductionRunPartyAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Production Run
     * <p>service: createProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunSingle")
    public ResponseEntity<Map<String, Object>> createProductionRunCreateProductionRunSingle(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Inventory from a Production Run Task.
     * <p>service: productionRunTaskProduce  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunTaskProduct")
    public ResponseEntity<Map<String, Object>> productionRunTaskProduce(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Explodes a product id and creates all the needed production runs.
     * <p>service: createProductionRunsForProductBom  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunsForProductBom")
    public ResponseEntity<Map<String, Object>> createProductionRunsForProductBom(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductionRunsForShipment  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRunsForShipment")
    public ResponseEntity<Map<String, Object>> createProductionRunsForShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffortPartyAssignment Entity
     * <p>service: assignPartyToWorkEffort  entities: WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutinTaskPartyAssign")
    public ResponseEntity<Map<String, Object>> assignPartyToWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a WorkEffortFixedAssetStd entry to associate a routing task with a fixed asset (type)
     * <p>service: createWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> createWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create WorkEffortSkillStandard
     * <p>service: createWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> createWorkEffortSkillStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffortFixedAssetAssign entry to associate a fixed asset with a work effort (e.g. a production run task)
     * <p>service: createWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/createWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> createWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Manufacturing-specific wrapper for inventory reservation. Provides a flexible extension point for production business rules (e.g., lot selection, task status checks) that should not be implemented in the generic core engine.
     * <p>service: reserveWorkEffortInventoryItem  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createWorkEffortInvRes")
    public ResponseEntity<Map<String, Object>> reserveWorkEffortInventoryItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunComponent")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Work Effort Content
     * <p>service: deleteWorkEffortContent  entities: WorkEffortContent  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunContent")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortDeleteProductionRunRoutingTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete WorkEffortSkillStandard
     * <p>service: deleteWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/deleteRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortSkillStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancels reservations
     * <p>service: releaseProductionRunTaskComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/deleteWorkEffortInvRes")
    public ResponseEntity<Map<String, Object>> releaseProductionRunTaskComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Issues the Inventory for a Production Run Task. Note that this skips the normal inventory reservation process.
     * <p>service: issueProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/issueProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> issueProductionRunTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Issues the Inventory for a Production Run Task Component. For more info see the issueProductionRunTask service. If fromDate is passed, then the WorkEffortGoodStandard record with pk composed of (workEffortId|productId|fromDate) with type PRUNT_PROD_NEEDED is retrieved and used to get the quantity; its status is also updated to COMPLETED after the issuance is done. If locationSeqIds are provided, then the items are only issued from the inventory items associated to the locations. If failIfItemsAreNotAvailable is set to "Y" (the default is "Y") then the service fails if there is not enough inventory available: no reservation will be reallocated. If failIfItemsAreNotOnHand is set to "Y" (the default is "Y") then the service fails if there is not enough inventory: no items with negative qoh will be created. If lotId is filled, failIfItemsAreNotAvailable is set to automatically set to "Y".
     * <p>service: issueProductionRunTaskComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/issueProductionRunTaskComponent")
    public ResponseEntity<Map<String, Object>> issueProductionRunTaskComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueProductionRunTaskComponent  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/issueProductionRunTaskComponents")
    public ResponseEntity<Map<String, Object>> issueProductionRunTaskComponentIssueProductionRunTaskComponents(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: productionRunDeclareAndProduce  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/productionRunDeclareAndProduce")
    public ResponseEntity<Map<String, Object>> productionRunDeclareAndProduce(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Inventory for product produced by a Production Run.
     * <p>service: productionRunProduce  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/productionRunProduce")
    public ResponseEntity<Map<String, Object>> productionRunProduce(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: productionRunTaskReturnMaterial  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/productionRunTaskReturnMaterials")
    public ResponseEntity<Map<String, Object>> productionRunTaskReturnMaterial(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick moves a ProductionRun to the passed in status, performing all the needed tasks in the way
     * <p>service: quickChangeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickChangeProductionRunStatus")
    public ResponseEntity<Map<String, Object>> quickChangeProductionRunStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick runs all the tasks of a ProductionRun to the completed status, also issuing components if necessary.
     * <p>service: quickRunAllProductionRunTasks  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickRunAllProductionRunTasks")
    public ResponseEntity<Map<String, Object>> quickRunAllProductionRunTasks(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick runs a ProductionRun task to the completed status, also issuing components if necessary.
     * <p>service: quickRunProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickRunProductionRunTask")
    public ResponseEntity<Map<String, Object>> quickRunProductionRunTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick starts all the tasks of a ProductionRun.
     * <p>service: quickStartAllProductionRunTasks  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickStartAllProductionRunTasks")
    public ResponseEntity<Map<String, Object>> quickStartAllProductionRunTasks(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Performs Move-Then-Issue: Reallocates reservations from affected reservations to the current task, then issues.
     * <p>service: reallocateAndIssueInventory  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/reallocateAndIssueInventory")
    public ResponseEntity<Map<String, Object>> reallocateAndIssueInventory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a CostComponentCalc
     * <p>service: removeCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/removeCostComponentCalc")
    public ResponseEntity<Map<String, Object>> removeCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: removeWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/removeProductionRunAssoc")
    public ResponseEntity<Map<String, Object>> removeWorkEffortAssocRemoveProductionRunAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingProductLink")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandardRemoveRoutingProductLink(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffortCostCalc entry
     * <p>service: removeWorkEffortCostCalc  entities: WorkEffortCostCalc  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskCost")
    public ResponseEntity<Map<String, Object>> removeWorkEffortCostCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Removes a WorkEffortFixedAssetStd, thus removing the association between a routing task and a fixed asset (type)
     * <p>service: removeWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> removeWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandardRemoveRoutingTaskProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffortFixedAssign entry, which removes the association between a fixed asset and a work effort (e.g. a production run task)
     * <p>service: removeWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/removeWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> removeWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a BOMTree (an object that represents a configured bill of material tree in memory). Useful for tree traversal (breakdown, explosion, implosion).
     * <p>service: getBOMTree  entities: ProductAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/runBomSimulation")
    public ResponseEntity<Map<String, Object>> getBOMTree(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Performs a run of Mrp
     * <p>service: executeMrp  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/runMrpGo")
    public ResponseEntity<Map<String, Object>> executeMrp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick moves a ProductionRun to the passed in status, performing all the needed tasks in the way
     * <p>service: quickChangeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/scheduleProductionRun")
    public ResponseEntity<Map<String, Object>> quickChangeProductionRunStatusScheduleProductionRun(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Calendar Week
     * <p>service: updateCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/updateCalendarWeek")
    public ResponseEntity<Map<String, Object>> updateCalendarWeek(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CostComponentCalc
     * <p>service: updateCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/updateCostComponentCalc")
    public ResponseEntity<Map<String, Object>> updateCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Production Run
     * <p>service: updateProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRun")
    public ResponseEntity<Map<String, Object>> updateProductionRun(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * update a Product Component to an existing ProductionRun
     * <p>service: updateProductionRunComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRunComponent")
    public ResponseEntity<Map<String, Object>> updateProductionRunComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: editProductionRunRoutingTask  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/updateProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> editProductionRunRoutingTask(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add a TimeEntry for the production run task and updates the relevant fields.
     * <p>service: updateProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRunTask")
    public ResponseEntity<Map<String, Object>> updateProductionRunTask(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffortPartyAssignment Entity
     * <p>service: updatePartyToWorkEffortAssignment  entities: WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutinTaskPartyAssign")
    public ResponseEntity<Map<String, Object>> updatePartyToWorkEffortAssignment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates an existing WorkEffortFixedAssetStd entry
     * <p>service: updateWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> updateWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandardUpdateRoutingTaskProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update WorkEffortSkillStandard
     * <p>service: updateWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> updateWorkEffortSkillStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an existing WorkEffortFixedAssetAssign entry
     * <p>service: updateWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/updateWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> updateWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
