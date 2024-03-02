package com.java.nutrisq.service.impl;

import com.java.nutrisq.controller.dto.LoginDto;
import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.controller.mapper.RoleMapper;
import com.java.nutrisq.model.User;
import com.java.nutrisq.repository.UserRepository;
import com.java.nutrisq.response.LoginResponse;
import com.java.nutrisq.service.UserInterface;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserImpl implements UserInterface {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String addUserData(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setLastname(userDto.getLastname());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        // Ensure you're using the correct method to map RoleDto to Role
        user.setRole(RoleMapper.mapToRole(userDto.getRoleName()));

        userRepository.save(user);

        return user.getName();
    }

    @Override
    public LoginResponse loginUser(LoginDto loginDto) {
        String msg = "";
        User user1 = userRepository.findByEmail(loginDto.getEmail());
        if (user1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepository.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("Password Doesn't match", false);
            }
        } else {
            return new LoginResponse("Email Doesn't match", false);
        }
    }
}
