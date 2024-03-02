package com.java.nutrisq.service;

import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.controller.mapper.UserMapper;
import com.java.nutrisq.model.Role;
import com.java.nutrisq.model.User;
import com.java.nutrisq.repository.RoleRepository;
import com.java.nutrisq.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private static final int PAGE_SIZE = 3;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public List<User> getUsers(int page) {
        return userRepository.findAllUsers(PageRequest.of(page, PAGE_SIZE)); // Changed PageRequest to Pageable
    }

    public UserDto addUser(UserDto userDto, Long roleId, String roleName) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setLastname(userDto.getLastname());

        roleId = 1L;

        if (roleId != null) {
            Role role = roleRepository.findById(roleId).orElseThrow(() -> new IllegalArgumentException("Role not found"));
            user.setRole(role);
        } else if (roleName != null) {
            Role role = roleRepository.findByRole(roleName);
            user.setRole(role);
        } else {
            throw new IllegalArgumentException("Either roleId or roleName must be provided");
        }

        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }
}
