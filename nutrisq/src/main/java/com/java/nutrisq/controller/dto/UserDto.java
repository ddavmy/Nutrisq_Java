package com.java.nutrisq.controller.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
public class UserDto {
    private long userId;
    private String email;
    private String name;
    private String lastName;
    private String roleName;
}