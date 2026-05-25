package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "payment_gateway_pay_pal")
public class PaymentGatewayPayPal {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "business_email")
    private String businessEmail;

    @Column(name = "api_user_name")
    private String apiUserName;

    @Column(name = "api_password")
    private String apiPassword;

    @Column(name = "api_signature")
    private String apiSignature;

    @Column(name = "api_environment")
    private String apiEnvironment;

    @Column(name = "notify_url")
    private String notifyUrl;

    @Column(name = "return_url")
    private String returnUrl;

    @Column(name = "cancel_return_url")
    private String cancelReturnUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "confirm_template")
    private String confirmTemplate;

    @Column(name = "redirect_url")
    private String redirectUrl;

    @Column(name = "confirm_url")
    private String confirmUrl;

    @Column(name = "shipping_callback_url")
    private String shippingCallbackUrl;

    @Column(name = "require_confirmed_shipping")
    private String requireConfirmedShipping;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
