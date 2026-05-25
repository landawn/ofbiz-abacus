package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_sandbox")
public class JobSandbox {
    @Id
    @Column(name = "job_id")
    private String jobId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "run_time")
    private Timestamp runTime;

    @Column(name = "run_time_epoch")
    private double runTimeEpoch;

    @Column(name = "priority")
    private double priority;

    @Column(name = "pool_id")
    private String poolId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "parent_job_id")
    private String parentJobId;

    @Column(name = "previous_job_id")
    private String previousJobId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "loader_name")
    private String loaderName;

    @Column(name = "max_retry")
    private double maxRetry;

    @Column(name = "current_retry_count")
    private double currentRetryCount;

    @Column(name = "auth_user_login_id")
    private String authUserLoginId;

    @Column(name = "run_as_user")
    private String runAsUser;

    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @Column(name = "temp_expr_id")
    private String tempExprId;

    @Column(name = "current_recurrence_count")
    private double currentRecurrenceCount;

    @Column(name = "max_recurrence_count")
    private double maxRecurrenceCount;

    @Column(name = "run_by_instance_id")
    private String runByInstanceId;

    @Column(name = "start_date_time")
    private Timestamp startDateTime;

    @Column(name = "finish_date_time")
    private Timestamp finishDateTime;

    @Column(name = "cancel_date_time")
    private Timestamp cancelDateTime;

    @Column(name = "job_result")
    private String jobResult;

    @Column(name = "recurrence_time_zone")
    private String recurrenceTimeZone;

    @JoinedBy("recurrenceInfoId=RecurrenceInfo.recurrenceInfoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RecurrenceInfo recurrenceInfo;

    @JoinedBy("tempExprId=TemporalExpression.tempExprId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TemporalExpression temporalExpression;

    @JoinedBy("runtimeDataId=RuntimeData.runtimeDataId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RuntimeData runtimeData;

    @JoinedBy("authUserLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin authUserLogin;

    @JoinedBy("runAsUser=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin runAsUserUserLogin;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;
}
