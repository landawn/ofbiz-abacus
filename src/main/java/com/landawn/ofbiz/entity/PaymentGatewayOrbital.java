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
@Table(name = "payment_gateway_orbital")
public class PaymentGatewayOrbital {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "username")
    private String username;

    @Column(name = "connection_password")
    private String connectionPassword;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "engine_class")
    private String engineClass;

    @Column(name = "host_name")
    private String hostName;

    @Column(name = "port")
    private double port;

    @Column(name = "host_name_failover")
    private String hostNameFailover;

    @Column(name = "port_failover")
    private double portFailover;

    @Column(name = "connection_timeout_seconds")
    private double connectionTimeoutSeconds;

    @Column(name = "read_timeout_seconds")
    private double readTimeoutSeconds;

    @Column(name = "authorization_uri")
    private String authorizationUri;

    @Column(name = "sdk_version")
    private String sdkVersion;

    @Column(name = "ssl_socket_factory")
    private String sslSocketFactory;

    @Column(name = "response_type")
    private String responseType;
}
