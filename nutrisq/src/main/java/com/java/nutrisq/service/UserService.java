package com.java.nutrisq.service;

import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.model.User;
import com.java.nutrisq.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private static final int PAGE_SIZE = 3;
    private final UserRepository userRepository;

    public List<User> getUsers(int page) {
        return userRepository.findAllUsers(
                PageRequest.of(page, PAGE_SIZE)
        );
    }
}
