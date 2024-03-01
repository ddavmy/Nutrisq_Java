package com.java.nutrisq.controller;

import com.java.nutrisq.controller.dto.MealDto;
import com.java.nutrisq.controller.mapper.MealMapper;
import com.java.nutrisq.model.User;
import com.java.nutrisq.service.MealService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class MealController {

    private final MealService mealService;

    @GetMapping("meals/{userId}")
    public List<MealDto> getMeals(@PathVariable Long userId, @RequestParam(required = false) Integer page) {
        int pageNumber = page != null && page >= 0 ? page : 0;

        // Retrieve User object from userId
        User user = new User();
        user.setUserId(userId);

        return MealMapper.mapToMealDtos(mealService.getMeals(user, pageNumber));
    }
}
