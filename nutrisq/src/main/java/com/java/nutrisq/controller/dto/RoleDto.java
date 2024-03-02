package com.java.nutrisq.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RoleDto {
    private long roleId;
    private String role;
}