package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "service_semaphore")
public class ServiceSemaphore {
    @Id
    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "locked_by_instance_id")
    private String lockedByInstanceId;

    @Column(name = "lock_thread")
    private String lockThread;

    @Column(name = "lock_time")
    private Timestamp lockTime;
}
