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
@Table(name = "user_agent")
public class UserAgent {
    @Id
    @Column(name = "user_agent_id")
    private String userAgentId;

    @Column(name = "browser_type_id")
    private String browserTypeId;

    @Column(name = "platform_type_id")
    private String platformTypeId;

    @Column(name = "protocol_type_id")
    private String protocolTypeId;

    @Column(name = "user_agent_type_id")
    private String userAgentTypeId;

    @Column(name = "user_agent_method_type_id")
    private String userAgentMethodTypeId;

    @JoinedBy("browserTypeId=BrowserType.browserTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BrowserType browserType;

    @JoinedBy("platformTypeId=PlatformType.platformTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PlatformType platformType;

    @JoinedBy("protocolTypeId=ProtocolType.protocolTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProtocolType protocolType;

    @JoinedBy("userAgentTypeId=UserAgentType.userAgentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserAgentType userAgentType;

    @JoinedBy("userAgentMethodTypeId=UserAgentMethodType.userAgentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserAgentMethodType userAgentMethodType;
}
