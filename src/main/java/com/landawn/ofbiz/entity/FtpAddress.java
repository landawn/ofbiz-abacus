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
@Table(name = "ftp_address")
public class FtpAddress {
    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "port")
    private double port;

    @Column(name = "username")
    private String username;

    @Column(name = "ftp_password")
    private String ftpPassword;

    @Column(name = "binary_transfer")
    private String binaryTransfer;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "zip_file")
    private String zipFile;

    @Column(name = "passive_mode")
    private String passiveMode;

    @Column(name = "default_timeout")
    private double defaultTimeout;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
