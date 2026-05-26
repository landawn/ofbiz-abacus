package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.util.ServiceInput;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.manufacturing.AddProductManufacturingRuleRequest;
import com.landawn.ofbiz.model.manufacturing.AddProductManufacturingRuleResponse;
import com.landawn.ofbiz.model.manufacturing.AddProductionRunComponentRequest;
import com.landawn.ofbiz.model.manufacturing.AddProductionRunComponentResponse;
import com.landawn.ofbiz.model.manufacturing.AddProductionRunRoutingTaskResponse;
import com.landawn.ofbiz.model.manufacturing.CancelProductionRunRequest;
import com.landawn.ofbiz.model.manufacturing.CancelProductionRunResponse;
import com.landawn.ofbiz.model.manufacturing.ChangeProductionRunStatusRequest;
import com.landawn.ofbiz.model.manufacturing.ChangeProductionRunStatusResponse;
import com.landawn.ofbiz.model.manufacturing.ChangeProductionRunTaskStatusRequest;
import com.landawn.ofbiz.model.manufacturing.ChangeProductionRunTaskStatusResponse;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarExceptionDayRequest;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarExceptionDayResponse;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarExceptionWeekRequest;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarExceptionWeekResponse;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarRequest;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarResponse;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarWeekRequest;
import com.landawn.ofbiz.model.manufacturing.CreateCalendarWeekResponse;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunAssocRequest;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunAssocResponse;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunPartyAssignRequest;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunPartyAssignResponse;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunRequest;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunResponse;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunsForProductBomRequest;
import com.landawn.ofbiz.model.manufacturing.CreateProductionRunsForProductBomResponse;
import com.landawn.ofbiz.model.manufacturing.DeleteProductManufacturingRuleRequest;
import com.landawn.ofbiz.model.manufacturing.DeleteProductManufacturingRuleResponse;
import com.landawn.ofbiz.model.manufacturing.ExecuteMrpRequest;
import com.landawn.ofbiz.model.manufacturing.ExecuteMrpResponse;
import com.landawn.ofbiz.model.manufacturing.GetBOMTreeRequest;
import com.landawn.ofbiz.model.manufacturing.GetBOMTreeResponse;
import com.landawn.ofbiz.model.manufacturing.IssueProductionRunTaskComponentRequest;
import com.landawn.ofbiz.model.manufacturing.IssueProductionRunTaskComponentResponse;
import com.landawn.ofbiz.model.manufacturing.IssueProductionRunTaskRequest;
import com.landawn.ofbiz.model.manufacturing.IssueProductionRunTaskResponse;
import com.landawn.ofbiz.model.manufacturing.ProductionRunDeclareAndProduceResponse;
import com.landawn.ofbiz.model.manufacturing.ProductionRunProduceRequest;
import com.landawn.ofbiz.model.manufacturing.ProductionRunProduceResponse;
import com.landawn.ofbiz.model.manufacturing.ProductionRunTaskProduceRequest;
import com.landawn.ofbiz.model.manufacturing.ProductionRunTaskProduceResponse;
import com.landawn.ofbiz.model.manufacturing.ProductionRunTaskReturnMaterialResponse;
import com.landawn.ofbiz.model.manufacturing.QuickChangeProductionRunStatusRequest;
import com.landawn.ofbiz.model.manufacturing.QuickChangeProductionRunStatusResponse;
import com.landawn.ofbiz.model.manufacturing.QuickRunAllProductionRunTasksRequest;
import com.landawn.ofbiz.model.manufacturing.QuickRunAllProductionRunTasksResponse;
import com.landawn.ofbiz.model.manufacturing.QuickRunProductionRunTaskRequest;
import com.landawn.ofbiz.model.manufacturing.QuickRunProductionRunTaskResponse;
import com.landawn.ofbiz.model.manufacturing.QuickStartAllProductionRunTasksRequest;
import com.landawn.ofbiz.model.manufacturing.QuickStartAllProductionRunTasksResponse;
import com.landawn.ofbiz.model.manufacturing.ReallocateAndIssueInventoryRequest;
import com.landawn.ofbiz.model.manufacturing.ReallocateAndIssueInventoryResponse;
import com.landawn.ofbiz.model.manufacturing.ReleaseProductionRunTaskComponentRequest;
import com.landawn.ofbiz.model.manufacturing.ReleaseProductionRunTaskComponentResponse;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarExceptionDayRequest;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarExceptionDayResponse;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarExceptionWeekRequest;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarExceptionWeekResponse;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarRequest;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarResponse;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarWeekRequest;
import com.landawn.ofbiz.model.manufacturing.RemoveCalendarWeekResponse;
import com.landawn.ofbiz.model.manufacturing.ReserveWorkEffortInventoryItemRequest;
import com.landawn.ofbiz.model.manufacturing.ReserveWorkEffortInventoryItemResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarExceptionDayRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarExceptionDayResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarExceptionWeekRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarExceptionWeekResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarWeekRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateCalendarWeekResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateProductManufacturingRuleRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateProductManufacturingRuleResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunComponentRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunComponentResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunResponse;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunTaskRequest;
import com.landawn.ofbiz.model.manufacturing.UpdateProductionRunTaskResponse;
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

    private final com.landawn.ofbiz.service.ManufacturingService service;

    public ManufacturingController(com.landawn.ofbiz.service.ManufacturingService service) {
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
     * Create a Product Manufacturing Rule
     * <p>service: addProductManufacturingRule  entities: ProductManufacturingRule  auth: true
     */
    @PostMapping("/manufacturing/control/AddProductManufacturingRule")
    public ResponseEntity<AddProductManufacturingRuleResponse> addProductManufacturingRule(@RequestBody AddProductManufacturingRuleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.addProductManufacturingRule(ServiceInput.toMap(request));
        return wrap(result, AddProductManufacturingRuleResponse::new);
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/AddRoutingProductLink")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortGoodStandard(body));
    }

    /**
     * No description.
     * <p>service: addRoutingTaskAssoc  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/AddRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> addRoutingTaskAssoc(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.addRoutingTaskAssoc(java.util.Map.copyOf(params)));
    }

    /**
     * Create a calendar
     * <p>service: createCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendar")
    public ResponseEntity<CreateCalendarResponse> createCalendar(@RequestBody CreateCalendarRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCalendar(ServiceInput.toMap(request));
        return wrap(result, CreateCalendarResponse::new);
    }

    /**
     * Create a calendar ExceptionDay
     * <p>service: createCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendarExceptionDay")
    public ResponseEntity<CreateCalendarExceptionDayResponse> createCalendarExceptionDay(@RequestBody CreateCalendarExceptionDayRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCalendarExceptionDay(ServiceInput.toMap(request));
        return wrap(result, CreateCalendarExceptionDayResponse::new);
    }

    /**
     * Create a Calendar Exception Week
     * <p>service: createCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/CreateCalendarExceptionWeek")
    public ResponseEntity<CreateCalendarExceptionWeekResponse> createCalendarExceptionWeek(@RequestBody CreateCalendarExceptionWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCalendarExceptionWeek(ServiceInput.toMap(request));
        return wrap(result, CreateCalendarExceptionWeekResponse::new);
    }

    /**
     * Create a WorkEffort Entity
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/CreateRouting")
    public ResponseEntity<Map<String, Object>> createWorkEffort(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffort(body));
    }

    /**
     * Create a WorkEffort Entity
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/CreateRoutingTask")
    public ResponseEntity<Map<String, Object>> createWorkEffortCreateRoutingTask(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffort(body));
    }

    /**
     * Remove a Product Manufacturing Rule
     * <p>service: deleteProductManufacturingRule  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/DeleteProductManufacturingRule")
    public ResponseEntity<DeleteProductManufacturingRuleResponse> deleteProductManufacturingRule(@RequestBody DeleteProductManufacturingRuleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.deleteProductManufacturingRule(ServiceInput.toMap(request));
        return wrap(result, DeleteProductManufacturingRuleResponse::new);
    }

    /**
     * Remove a calendar
     * <p>service: removeCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendar")
    public ResponseEntity<RemoveCalendarResponse> removeCalendar(@RequestBody RemoveCalendarRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCalendar(ServiceInput.toMap(request));
        return wrap(result, RemoveCalendarResponse::new);
    }

    /**
     * Delete a calendar ExceptionDay
     * <p>service: removeCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarExceptionDay")
    public ResponseEntity<RemoveCalendarExceptionDayResponse> removeCalendarExceptionDay(@RequestBody RemoveCalendarExceptionDayRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCalendarExceptionDay(ServiceInput.toMap(request));
        return wrap(result, RemoveCalendarExceptionDayResponse::new);
    }

    /**
     * Delete a Calendar Exception Week
     * <p>service: removeCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarExceptionWeek")
    public ResponseEntity<RemoveCalendarExceptionWeekResponse> removeCalendarExceptionWeek(@RequestBody RemoveCalendarExceptionWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCalendarExceptionWeek(ServiceInput.toMap(request));
        return wrap(result, RemoveCalendarExceptionWeekResponse::new);
    }

    /**
     * Remove a Calendar Week
     * <p>service: removeCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveCalendarWeek")
    public ResponseEntity<RemoveCalendarWeekResponse> removeCalendarWeek(@RequestBody RemoveCalendarWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.removeCalendarWeek(ServiceInput.toMap(request));
        return wrap(result, RemoveCalendarWeekResponse::new);
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveRoutingTask")
    public ResponseEntity<Map<String, Object>> deleteWorkEffort(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteWorkEffort(body));
    }

    /**
     * Remove a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: removeWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/RemoveRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> removeWorkEffortAssoc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortAssoc(body));
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/ShowProductionRun")
    public ResponseEntity<Map<String, Object>> showProductionRun(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a calendar
     * <p>service: updateCalendar  entities: TechDataCalendar  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendar")
    public ResponseEntity<UpdateCalendarResponse> updateCalendar(@RequestBody UpdateCalendarRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCalendar(ServiceInput.toMap(request));
        return wrap(result, UpdateCalendarResponse::new);
    }

    /**
     * Update a calendar ExceptionDay
     * <p>service: updateCalendarExceptionDay  entities: TechDataCalendarExcDay  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendarExceptionDay")
    public ResponseEntity<UpdateCalendarExceptionDayResponse> updateCalendarExceptionDay(@RequestBody UpdateCalendarExceptionDayRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCalendarExceptionDay(ServiceInput.toMap(request));
        return wrap(result, UpdateCalendarExceptionDayResponse::new);
    }

    /**
     * Update a Calendar Exception Week
     * <p>service: updateCalendarExceptionWeek  entities: TechDataCalendarExcWeek  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateCalendarExceptionWeek")
    public ResponseEntity<UpdateCalendarExceptionWeekResponse> updateCalendarExceptionWeek(@RequestBody UpdateCalendarExceptionWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCalendarExceptionWeek(ServiceInput.toMap(request));
        return wrap(result, UpdateCalendarExceptionWeekResponse::new);
    }

    /**
     * No description.
     * <p>service: eventEditBOM  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/UpdateProductBom")
    public ResponseEntity<Map<String, Object>> eventEditBOM(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.eventEditBOM(java.util.Map.copyOf(params)));
    }

    /**
     * Update a Product Manufacturing Rule
     * <p>service: updateProductManufacturingRule  entities: ProductManufacturingRule  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateProductManufacturingRule")
    public ResponseEntity<UpdateProductManufacturingRuleResponse> updateProductManufacturingRule(@RequestBody UpdateProductManufacturingRuleRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductManufacturingRule(ServiceInput.toMap(request));
        return wrap(result, UpdateProductManufacturingRuleResponse::new);
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRouting")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffort(body));
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingProductLink")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffortGoodStandard(body));
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingTask")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateRoutingTask(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffort(body));
    }

    /**
     * No description.
     * <p>service: updateRoutingTaskAssoc  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/UpdateRoutingTaskAssoc")
    public ResponseEntity<Map<String, Object>> updateRoutingTaskAssoc(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.updateRoutingTaskAssoc(java.util.Map.copyOf(params)));
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/UpdateRoutingTaskForRouting")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateRoutingTaskForRouting(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffort(body));
    }

    /**
     * add a Product Component to an existing ProductionRun
     * <p>service: addProductionRunComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/addProductionRunComponent")
    public ResponseEntity<AddProductionRunComponentResponse> addProductionRunComponent(@RequestBody AddProductionRunComponentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.addProductionRunComponent(ServiceInput.toMap(request));
        return wrap(result, AddProductionRunComponentResponse::new);
    }

    /**
     * No description.
     * <p>service: addProductionRunRoutingTask  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/addProductionRunRoutingTask")
    public ResponseEntity<AddProductionRunRoutingTaskResponse> addProductionRunRoutingTask(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.addProductionRunRoutingTask(java.util.Map.copyOf(params));
        return wrap(result, AddProductionRunRoutingTaskResponse::new);
    }

    /**
     * Create a WorkEffortCostCalc entry
     * <p>service: createWorkEffortCostCalc  entities: WorkEffortCostCalc  auth: true
     */
    @PostMapping("/manufacturing/control/addRoutingTaskCost")
    public ResponseEntity<Map<String, Object>> createWorkEffortCostCalc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortCostCalc(body));
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/addRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandardAddRoutingTaskProduct(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortGoodStandard(body));
    }

    /**
     * Cancels a ProductionRun.
     * <p>service: cancelProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/cancelProductionRun")
    public ResponseEntity<CancelProductionRunResponse> cancelProductionRun(@RequestBody CancelProductionRunRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.cancelProductionRun(ServiceInput.toMap(request));
        return wrap(result, CancelProductionRunResponse::new);
    }

    /**
     * Change the Production Run status
     * <p>service: changeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunStatusToClosed")
    public ResponseEntity<ChangeProductionRunStatusResponse> changeProductionRunStatus(@RequestBody ChangeProductionRunStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeProductionRunStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeProductionRunStatusResponse::new);
    }

    /**
     * Change the Production Run status
     * <p>service: changeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunStatusToPrinted")
    public ResponseEntity<ChangeProductionRunStatusResponse> changeProductionRunStatusChangeProductionRunStatusToPrinted(@RequestBody ChangeProductionRunStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeProductionRunStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeProductionRunStatusResponse::new);
    }

    /**
     * Change the Production Run Task status
     * <p>service: changeProductionRunTaskStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/changeProductionRunTaskStatus")
    public ResponseEntity<ChangeProductionRunTaskStatusResponse> changeProductionRunTaskStatus(@RequestBody ChangeProductionRunTaskStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.changeProductionRunTaskStatus(ServiceInput.toMap(request));
        return wrap(result, ChangeProductionRunTaskStatusResponse::new);
    }

    /**
     * Create a Calendar Week
     * <p>service: createCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/createCalendarWeek")
    public ResponseEntity<CreateCalendarWeekResponse> createCalendarWeek(@RequestBody CreateCalendarWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createCalendarWeek(ServiceInput.toMap(request));
        return wrap(result, CreateCalendarWeekResponse::new);
    }

    /**
     * Create a CostComponentCalc
     * <p>service: createCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/createCostComponentCalc")
    public ResponseEntity<Map<String, Object>> createCostComponentCalc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createCostComponentCalc(body));
    }

    /**
     * No description.
     * <p>service: createProductionRun  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRun")
    public ResponseEntity<CreateProductionRunResponse> createProductionRun(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.createProductionRun(java.util.Map.copyOf(params));
        return wrap(result, CreateProductionRunResponse::new);
    }

    /**
     * Associate the production run to another production run
     * <p>service: createProductionRunAssoc  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunAssoc")
    public ResponseEntity<CreateProductionRunAssocResponse> createProductionRunAssoc(@RequestBody CreateProductionRunAssocRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createProductionRunAssoc(ServiceInput.toMap(request));
        return wrap(result, CreateProductionRunAssocResponse::new);
    }

    /**
     * No description.
     * <p>service: createWorkEffortContent  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRunContents")
    public ResponseEntity<Map<String, Object>> createWorkEffortContent(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortContent(java.util.Map.copyOf(params)));
    }

    /**
     * Associate a party to the production run
     * <p>service: createProductionRunPartyAssign  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunPartyAssign")
    public ResponseEntity<CreateProductionRunPartyAssignResponse> createProductionRunPartyAssign(@RequestBody CreateProductionRunPartyAssignRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createProductionRunPartyAssign(ServiceInput.toMap(request));
        return wrap(result, CreateProductionRunPartyAssignResponse::new);
    }

    /**
     * Create a Production Run
     * <p>service: createProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunSingle")
    public ResponseEntity<CreateProductionRunResponse> createProductionRunCreateProductionRunSingle(@RequestBody CreateProductionRunRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createProductionRun(ServiceInput.toMap(request));
        return wrap(result, CreateProductionRunResponse::new);
    }

    /**
     * Create Inventory from a Production Run Task.
     * <p>service: productionRunTaskProduce  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunTaskProduct")
    public ResponseEntity<ProductionRunTaskProduceResponse> productionRunTaskProduce(@RequestBody ProductionRunTaskProduceRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.productionRunTaskProduce(ServiceInput.toMap(request));
        return wrap(result, ProductionRunTaskProduceResponse::new);
    }

    /**
     * Explodes a product id and creates all the needed production runs.
     * <p>service: createProductionRunsForProductBom  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createProductionRunsForProductBom")
    public ResponseEntity<CreateProductionRunsForProductBomResponse> createProductionRunsForProductBom(@RequestBody CreateProductionRunsForProductBomRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.createProductionRunsForProductBom(ServiceInput.toMap(request));
        return wrap(result, CreateProductionRunsForProductBomResponse::new);
    }

    /**
     * No description.
     * <p>service: createProductionRunsForShipment  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/createProductionRunsForShipment")
    public ResponseEntity<Map<String, Object>> createProductionRunsForShipment(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.createProductionRunsForShipment(java.util.Map.copyOf(params)));
    }

    /**
     * Create a WorkEffortPartyAssignment Entity
     * <p>service: assignPartyToWorkEffort  entities: WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutinTaskPartyAssign")
    public ResponseEntity<Map<String, Object>> assignPartyToWorkEffort(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.assignPartyToWorkEffort(body));
    }

    /**
     * Creates a WorkEffortFixedAssetStd entry to associate a routing task with a fixed asset (type)
     * <p>service: createWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> createWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortFixedAssetStd(body));
    }

    /**
     * Create WorkEffortSkillStandard
     * <p>service: createWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/createRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> createWorkEffortSkillStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortSkillStandard(body));
    }

    /**
     * Create a WorkEffortFixedAssetAssign entry to associate a fixed asset with a work effort (e.g. a production run task)
     * <p>service: createWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/createWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> createWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.createWorkEffortFixedAssetAssign(body));
    }

    /**
     * Manufacturing-specific wrapper for inventory reservation. Provides a flexible extension point for production business rules (e.g., lot selection, task status checks) that should not be implemented in the generic core engine.
     * <p>service: reserveWorkEffortInventoryItem  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/createWorkEffortInvRes")
    public ResponseEntity<ReserveWorkEffortInventoryItemResponse> reserveWorkEffortInventoryItem(@RequestBody ReserveWorkEffortInventoryItemRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.reserveWorkEffortInventoryItem(ServiceInput.toMap(request));
        return wrap(result, ReserveWorkEffortInventoryItemResponse::new);
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunComponent")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortGoodStandard(body));
    }

    /**
     * Delete a Work Effort Content
     * <p>service: deleteWorkEffortContent  entities: WorkEffortContent  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunContent")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortContent(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteWorkEffortContent(body));
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/manufacturing/control/deleteProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortDeleteProductionRunRoutingTask(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteWorkEffort(body));
    }

    /**
     * Delete WorkEffortSkillStandard
     * <p>service: deleteWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/deleteRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortSkillStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.deleteWorkEffortSkillStandard(body));
    }

    /**
     * Cancels reservations
     * <p>service: releaseProductionRunTaskComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/deleteWorkEffortInvRes")
    public ResponseEntity<ReleaseProductionRunTaskComponentResponse> releaseProductionRunTaskComponent(@RequestBody ReleaseProductionRunTaskComponentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.releaseProductionRunTaskComponent(ServiceInput.toMap(request));
        return wrap(result, ReleaseProductionRunTaskComponentResponse::new);
    }

    /**
     * Issues the Inventory for a Production Run Task. Note that this skips the normal inventory reservation process.
     * <p>service: issueProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/issueProductionRunRoutingTask")
    public ResponseEntity<IssueProductionRunTaskResponse> issueProductionRunTask(@RequestBody IssueProductionRunTaskRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.issueProductionRunTask(ServiceInput.toMap(request));
        return wrap(result, IssueProductionRunTaskResponse::new);
    }

    /**
     * Issues the Inventory for a Production Run Task Component. For more info see the issueProductionRunTask service. If fromDate is passed, then the WorkEffortGoodStandard record with pk composed of (workEffortId|productId|fromDate) with type PRUNT_PROD_NEEDED is retrieved and used to get the quantity; its status is also updated to COMPLETED after the issuance is done. If locationSeqIds are provided, then the items are only issued from the inventory items associated to the locations. If failIfItemsAreNotAvailable is set to "Y" (the default is "Y") then the service fails if there is not enough inventory available: no reservation will be reallocated. If failIfItemsAreNotOnHand is set to "Y" (the default is "Y") then the service fails if there is not enough inventory: no items with negative qoh will be created. If lotId is filled, failIfItemsAreNotAvailable is set to automatically set to "Y".
     * <p>service: issueProductionRunTaskComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/issueProductionRunTaskComponent")
    public ResponseEntity<IssueProductionRunTaskComponentResponse> issueProductionRunTaskComponent(@RequestBody IssueProductionRunTaskComponentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.issueProductionRunTaskComponent(ServiceInput.toMap(request));
        return wrap(result, IssueProductionRunTaskComponentResponse::new);
    }

    /**
     * No description.
     * <p>service: issueProductionRunTaskComponent  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/issueProductionRunTaskComponents")
    public ResponseEntity<IssueProductionRunTaskComponentResponse> issueProductionRunTaskComponentIssueProductionRunTaskComponents(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.issueProductionRunTaskComponent(java.util.Map.copyOf(params));
        return wrap(result, IssueProductionRunTaskComponentResponse::new);
    }

    /**
     * No description.
     * <p>service: productionRunDeclareAndProduce  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/productionRunDeclareAndProduce")
    public ResponseEntity<ProductionRunDeclareAndProduceResponse> productionRunDeclareAndProduce(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.productionRunDeclareAndProduce(java.util.Map.copyOf(params));
        return wrap(result, ProductionRunDeclareAndProduceResponse::new);
    }

    /**
     * Create Inventory for product produced by a Production Run.
     * <p>service: productionRunProduce  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/productionRunProduce")
    public ResponseEntity<ProductionRunProduceResponse> productionRunProduce(@RequestBody ProductionRunProduceRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.productionRunProduce(ServiceInput.toMap(request));
        return wrap(result, ProductionRunProduceResponse::new);
    }

    /**
     * No description.
     * <p>service: productionRunTaskReturnMaterial  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/productionRunTaskReturnMaterials")
    public ResponseEntity<ProductionRunTaskReturnMaterialResponse> productionRunTaskReturnMaterial(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        Map<String, Object> result = service.productionRunTaskReturnMaterial(java.util.Map.copyOf(params));
        return wrap(result, ProductionRunTaskReturnMaterialResponse::new);
    }

    /**
     * Quick moves a ProductionRun to the passed in status, performing all the needed tasks in the way
     * <p>service: quickChangeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickChangeProductionRunStatus")
    public ResponseEntity<QuickChangeProductionRunStatusResponse> quickChangeProductionRunStatus(@RequestBody QuickChangeProductionRunStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickChangeProductionRunStatus(ServiceInput.toMap(request));
        return wrap(result, QuickChangeProductionRunStatusResponse::new);
    }

    /**
     * Quick runs all the tasks of a ProductionRun to the completed status, also issuing components if necessary.
     * <p>service: quickRunAllProductionRunTasks  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickRunAllProductionRunTasks")
    public ResponseEntity<QuickRunAllProductionRunTasksResponse> quickRunAllProductionRunTasks(@RequestBody QuickRunAllProductionRunTasksRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickRunAllProductionRunTasks(ServiceInput.toMap(request));
        return wrap(result, QuickRunAllProductionRunTasksResponse::new);
    }

    /**
     * Quick runs a ProductionRun task to the completed status, also issuing components if necessary.
     * <p>service: quickRunProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickRunProductionRunTask")
    public ResponseEntity<QuickRunProductionRunTaskResponse> quickRunProductionRunTask(@RequestBody QuickRunProductionRunTaskRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickRunProductionRunTask(ServiceInput.toMap(request));
        return wrap(result, QuickRunProductionRunTaskResponse::new);
    }

    /**
     * Quick starts all the tasks of a ProductionRun.
     * <p>service: quickStartAllProductionRunTasks  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/quickStartAllProductionRunTasks")
    public ResponseEntity<QuickStartAllProductionRunTasksResponse> quickStartAllProductionRunTasks(@RequestBody QuickStartAllProductionRunTasksRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickStartAllProductionRunTasks(ServiceInput.toMap(request));
        return wrap(result, QuickStartAllProductionRunTasksResponse::new);
    }

    /**
     * Performs Move-Then-Issue: Reallocates reservations from affected reservations to the current task, then issues.
     * <p>service: reallocateAndIssueInventory  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/reallocateAndIssueInventory")
    public ResponseEntity<ReallocateAndIssueInventoryResponse> reallocateAndIssueInventory(@RequestBody ReallocateAndIssueInventoryRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.reallocateAndIssueInventory(ServiceInput.toMap(request));
        return wrap(result, ReallocateAndIssueInventoryResponse::new);
    }

    /**
     * Remove a CostComponentCalc
     * <p>service: removeCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/removeCostComponentCalc")
    public ResponseEntity<Map<String, Object>> removeCostComponentCalc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeCostComponentCalc(body));
    }

    /**
     * Remove a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: removeWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/removeProductionRunAssoc")
    public ResponseEntity<Map<String, Object>> removeWorkEffortAssocRemoveProductionRunAssoc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortAssoc(body));
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingProductLink")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandardRemoveRoutingProductLink(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortGoodStandard(body));
    }

    /**
     * Remove a WorkEffortCostCalc entry
     * <p>service: removeWorkEffortCostCalc  entities: WorkEffortCostCalc  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskCost")
    public ResponseEntity<Map<String, Object>> removeWorkEffortCostCalc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortCostCalc(body));
    }

    /**
     * Removes a WorkEffortFixedAssetStd, thus removing the association between a routing task and a fixed asset (type)
     * <p>service: removeWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> removeWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortFixedAssetStd(body));
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/removeRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandardRemoveRoutingTaskProduct(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortGoodStandard(body));
    }

    /**
     * Remove a WorkEffortFixedAssign entry, which removes the association between a fixed asset and a work effort (e.g. a production run task)
     * <p>service: removeWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/removeWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> removeWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.removeWorkEffortFixedAssetAssign(body));
    }

    /**
     * Returns a BOMTree (an object that represents a configured bill of material tree in memory). Useful for tree traversal (breakdown, explosion, implosion).
     * <p>service: getBOMTree  entities: ProductAssoc  auth: true
     */
    @PostMapping("/manufacturing/control/runBomSimulation")
    public ResponseEntity<GetBOMTreeResponse> getBOMTree(@RequestBody GetBOMTreeRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.getBOMTree(ServiceInput.toMap(request));
        return wrap(result, GetBOMTreeResponse::new);
    }

    /**
     * Performs a run of Mrp
     * <p>service: executeMrp  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/runMrpGo")
    public ResponseEntity<ExecuteMrpResponse> executeMrp(@RequestBody ExecuteMrpRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.executeMrp(ServiceInput.toMap(request));
        return wrap(result, ExecuteMrpResponse::new);
    }

    /**
     * Quick moves a ProductionRun to the passed in status, performing all the needed tasks in the way
     * <p>service: quickChangeProductionRunStatus  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/scheduleProductionRun")
    public ResponseEntity<QuickChangeProductionRunStatusResponse> quickChangeProductionRunStatusScheduleProductionRun(@RequestBody QuickChangeProductionRunStatusRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.quickChangeProductionRunStatus(ServiceInput.toMap(request));
        return wrap(result, QuickChangeProductionRunStatusResponse::new);
    }

    /**
     * Update a Calendar Week
     * <p>service: updateCalendarWeek  entities: TechDataCalendarWeek  auth: true
     */
    @PostMapping("/manufacturing/control/updateCalendarWeek")
    public ResponseEntity<UpdateCalendarWeekResponse> updateCalendarWeek(@RequestBody UpdateCalendarWeekRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateCalendarWeek(ServiceInput.toMap(request));
        return wrap(result, UpdateCalendarWeekResponse::new);
    }

    /**
     * Update a CostComponentCalc
     * <p>service: updateCostComponentCalc  entities: CostComponentCalc  auth: true
     */
    @PostMapping("/manufacturing/control/updateCostComponentCalc")
    public ResponseEntity<Map<String, Object>> updateCostComponentCalc(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateCostComponentCalc(body));
    }

    /**
     * Update a Production Run
     * <p>service: updateProductionRun  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRun")
    public ResponseEntity<UpdateProductionRunResponse> updateProductionRun(@RequestBody UpdateProductionRunRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductionRun(ServiceInput.toMap(request));
        return wrap(result, UpdateProductionRunResponse::new);
    }

    /**
     * update a Product Component to an existing ProductionRun
     * <p>service: updateProductionRunComponent  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRunComponent")
    public ResponseEntity<UpdateProductionRunComponentResponse> updateProductionRunComponent(@RequestBody UpdateProductionRunComponentRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductionRunComponent(ServiceInput.toMap(request));
        return wrap(result, UpdateProductionRunComponentResponse::new);
    }

    /**
     * No description.
     * <p>service: editProductionRunRoutingTask  entities: unknown  auth: true
     */
    @GetMapping("/manufacturing/control/updateProductionRunRoutingTask")
    public ResponseEntity<Map<String, Object>> editProductionRunRoutingTask(@RequestParam Map<String, String> params) throws java.sql.SQLException {
        return wrapMap(service.editProductionRunRoutingTask(java.util.Map.copyOf(params)));
    }

    /**
     * Add a TimeEntry for the production run task and updates the relevant fields.
     * <p>service: updateProductionRunTask  entities: unknown  auth: true
     */
    @PostMapping("/manufacturing/control/updateProductionRunTask")
    public ResponseEntity<UpdateProductionRunTaskResponse> updateProductionRunTask(@RequestBody UpdateProductionRunTaskRequest request) throws java.sql.SQLException {
        Map<String, Object> result = service.updateProductionRunTask(ServiceInput.toMap(request));
        return wrap(result, UpdateProductionRunTaskResponse::new);
    }

    /**
     * Update a WorkEffortPartyAssignment Entity
     * <p>service: updatePartyToWorkEffortAssignment  entities: WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutinTaskPartyAssign")
    public ResponseEntity<Map<String, Object>> updatePartyToWorkEffortAssignment(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updatePartyToWorkEffortAssignment(body));
    }

    /**
     * Updates an existing WorkEffortFixedAssetStd entry
     * <p>service: updateWorkEffortFixedAssetStd  entities: WorkEffortFixedAssetStd  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskFixedAsset")
    public ResponseEntity<Map<String, Object>> updateWorkEffortFixedAssetStd(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffortFixedAssetStd(body));
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskProduct")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandardUpdateRoutingTaskProduct(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffortGoodStandard(body));
    }

    /**
     * Update WorkEffortSkillStandard
     * <p>service: updateWorkEffortSkillStandard  entities: WorkEffortSkillStandard  auth: true
     */
    @PostMapping("/manufacturing/control/updateRoutingTaskSkill")
    public ResponseEntity<Map<String, Object>> updateWorkEffortSkillStandard(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffortSkillStandard(body));
    }

    /**
     * Update an existing WorkEffortFixedAssetAssign entry
     * <p>service: updateWorkEffortFixedAssetAssign  entities: WorkEffortFixedAssetAssign  auth: true
     */
    @PostMapping("/manufacturing/control/updateWorkEffortFixedAssetAssign")
    public ResponseEntity<Map<String, Object>> updateWorkEffortFixedAssetAssign(@RequestBody Map<String, Object> body) throws java.sql.SQLException {
        return wrapMap(service.updateWorkEffortFixedAssetAssign(body));
    }
}
