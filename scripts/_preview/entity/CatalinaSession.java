package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "catalina_session")
public class CatalinaSession {
    @Id
    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "session_size")
    private double sessionSize;

    @Column(name = "session_info")
    private byte[] sessionInfo;

    @Column(name = "is_valid")
    private String isValid;

    @Column(name = "max_idle")
    private double maxIdle;

    @Column(name = "last_accessed")
    private double lastAccessed;
}
