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
@Table(name = "standard_language")
public class StandardLanguage {
    @Id
    @Column(name = "standard_language_id")
    private String standardLanguageId;

    @Column(name = "lang_code3t")
    private String langCode3t;

    @Column(name = "lang_code3b")
    private String langCode3b;

    @Column(name = "lang_code2")
    private String langCode2;

    @Column(name = "lang_name")
    private String langName;

    @Column(name = "lang_family")
    private String langFamily;

    @Column(name = "lang_charset")
    private String langCharset;
}
