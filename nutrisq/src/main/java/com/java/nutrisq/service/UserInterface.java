package com.java.nutrisq.service;

import com.java.nutrisq.controller.dto.LoginDto;
import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserInterface {

    String addUserData(UserDto userDto);

    LoginResponse loginUser(LoginDto loginDto);
}
