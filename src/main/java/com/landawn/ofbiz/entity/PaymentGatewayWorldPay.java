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
@Table(name = "payment_gateway_world_pay")
public class PaymentGatewayWorldPay {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "redirect_url")
    private String redirectUrl;

    @Column(name = "inst_id")
    private String instId;

    @Column(name = "auth_mode")
    private String authMode;

    @Column(name = "fix_contact")
    private String fixContact;

    @Column(name = "hide_contact")
    private String hideContact;

    @Column(name = "hide_currency")
    private String hideCurrency;

    @Column(name = "lang_id")
    private String langId;

    @Column(name = "no_language_menu")
    private String noLanguageMenu;

    @Column(name = "with_delivery")
    private String withDelivery;

    @Column(name = "test_mode")
    private double testMode;
}
