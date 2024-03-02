package com.java.nutrisq.controller;

import com.java.nutrisq.controller.dto.LoginDto;
import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.controller.mapper.UserMapper;
import com.java.nutrisq.response.LoginResponse;
import com.java.nutrisq.service.UserService;
import com.java.nutrisq.service.UserInterface;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final UserInterface userInterface;

    @GetMapping("/users")
    public List<UserDto> getUsers(@RequestParam(required = false) Integer page) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        return UserMapper.mapToUserDtos(userService.getUsers(pageNumber));
    }

    @PostMapping("/user")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto,
                                           @RequestParam(required = false) Long roleId,
                                           @RequestParam(required = false) String roleName) {
        UserDto savedUserDto = userService.addUser(userDto, roleId, roleName);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUserDto);
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDto) {
        return userInterface.addUserData(userDto);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginDto loginDto) { // Changed ResponseEntity<?> to ResponseEntity<LoginResponse>
        LoginResponse loginResponse = userInterface.loginUser(loginDto);
        return ResponseEntity.ok(loginResponse);
    }
}
