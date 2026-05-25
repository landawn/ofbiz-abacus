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
@Table(name = "payment_gateway_payflow_pro")
public class PaymentGatewayPayflowPro {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "certs_path")
    private String certsPath;

    @Column(name = "host_address")
    private String hostAddress;

    @Column(name = "host_port")
    private double hostPort;

    @Column(name = "timeout")
    private double timeout;

    @Column(name = "proxy_address")
    private String proxyAddress;

    @Column(name = "proxy_port")
    private double proxyPort;

    @Column(name = "proxy_logon")
    private String proxyLogon;

    @Column(name = "proxy_password")
    private String proxyPassword;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "partner")
    private String partner;

    @Column(name = "check_avs")
    private String checkAvs;

    @Column(name = "check_cvv2")
    private String checkCvv2;

    @Column(name = "pre_auth")
    private String preAuth;

    @Column(name = "enable_transmit")
    private String enableTransmit;

    @Column(name = "log_file_name")
    private String logFileName;

    @Column(name = "logging_level")
    private double loggingLevel;

    @Column(name = "max_log_file_size")
    private double maxLogFileSize;

    @Column(name = "stack_trace_on")
    private String stackTraceOn;

    @Column(name = "redirect_url")
    private String redirectUrl;

    @Column(name = "return_url")
    private String returnUrl;

    @Column(name = "cancel_return_url")
    private String cancelReturnUrl;
}
