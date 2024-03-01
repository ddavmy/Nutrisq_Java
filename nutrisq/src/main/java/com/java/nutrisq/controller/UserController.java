package com.java.nutrisq.controller;

import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.controller.mapper.UserMapper;
import com.java.nutrisq.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping("users")
    public List<UserDto> getUsers(@RequestParam(required = false) Integer page) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        return UserMapper.mapToUserDtos(userService.getUsers(pageNumber));
    }
}
