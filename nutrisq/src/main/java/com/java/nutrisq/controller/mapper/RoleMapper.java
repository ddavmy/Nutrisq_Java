package com.java.nutrisq.controller.mapper;

import com.java.nutrisq.controller.dto.RoleDto;
import com.java.nutrisq.model.Role;

import java.util.List;
import java.util.stream.Collectors;

public class RoleMapper {

    public static RoleDto mapToRoleDto(Role role) {
        return RoleDto.builder()
                .roleId(role.getRoleId())
                .role(role.getRole())
                .build();
    }

    public static List<RoleDto> mapToRoleDtos(List<Role> roles) {
        return roles.stream()
                .map(RoleMapper::mapToRoleDto)
                .collect(Collectors.toList());
    }

    public static Role mapToRole(RoleDto roleDto) {
        Role role = new Role();
        role.setRoleId(roleDto.getRoleId());
        role.setRole(roleDto.getRole());
        return role;
    }
}
