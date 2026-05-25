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
@Table(name = "tarpitted_login_view")
public class TarpittedLoginView {
    @Id
    @Column(name = "view_name_id")
    private String viewNameId;

    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "tarpit_release_date_time")
    private double tarpitReleaseDateTime;
}
