package com.java.nutrisq.controller.dto;

import lombok.*;

@Getter
@Builder
public class UserDto {
    private long userId;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private RoleDto roleName;

}