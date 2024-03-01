package com.java.nutrisq.controller.mapper;

import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.model.User;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class UserMapper {

    public static List<UserDto> mapToUserDtos(List<User> users) {
        return users.stream()
                .map(user -> mapToUserDto(user))
                .collect(Collectors.toList());
    }

    private static UserDto mapToUserDto(User user) {
        // Correctly fetch the role name from the associated Role entity
        String roleName = user.getRole().getRole();

        return UserDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .name(user.getName())
                .lastName(user.getLastname())
                .roleName(roleName) // Use the correctly fetched role name
                .build();
    }
}
