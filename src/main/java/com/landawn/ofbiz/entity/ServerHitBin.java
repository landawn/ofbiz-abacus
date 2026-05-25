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
@Table(name = "server_hit_bin")
public class ServerHitBin {
    @Id
    @Column(name = "server_hit_bin_id")
    private String serverHitBinId;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "hit_type_id")
    private String hitTypeId;

    @Column(name = "server_ip_address")
    private String serverIpAddress;

    @Column(name = "server_host_name")
    private String serverHostName;

    @Column(name = "bin_start_date_time")
    private Timestamp binStartDateTime;

    @Column(name = "bin_end_date_time")
    private Timestamp binEndDateTime;

    @Column(name = "number_hits")
    private double numberHits;

    @Column(name = "total_time_millis")
    private double totalTimeMillis;

    @Column(name = "min_time_millis")
    private double minTimeMillis;

    @Column(name = "max_time_millis")
    private double maxTimeMillis;

    @Column(name = "internal_content_id")
    private String internalContentId;

    @JoinedBy("hitTypeId=ServerHitType.hitTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ServerHitType serverHitType;
}
