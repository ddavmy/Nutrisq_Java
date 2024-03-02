package com.java.nutrisq.controller.mapper;

import com.java.nutrisq.controller.dto.RoleDto;
import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.model.Role;
import com.java.nutrisq.model.User;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class UserMapper {

    public static List<UserDto> mapToUserDtos(List<User> users) {
        return users.stream()
                .map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    public static UserDto mapToUserDto(User user) {
        RoleDto roleName = user.getRole() != null ? RoleMapper.mapToRoleDto(user.getRole()) : null; // Fetch RoleDto using RoleMapper

        return UserDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .password(user.getPassword())
                .name(user.getName())
                .lastname(user.getLastname()) // Changed to getLastname
                .roleName(roleName)
                .build();
    }
}