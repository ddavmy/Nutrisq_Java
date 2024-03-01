package com.java.nutrisq.controller.mapper;

import com.java.nutrisq.controller.dto.MealDto;
import com.java.nutrisq.controller.dto.UserDto;
import com.java.nutrisq.model.Meal;
import com.java.nutrisq.model.User;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class MealMapper {

    public static List<MealDto> mapToMealDtos(List<Meal> meals) {
        return meals.stream()
                .map(MealMapper::mapToMealDto)
                .collect(Collectors.toList());
    }

    private static MealDto mapToMealDto(Meal meal) {
        // Correctly fetch the role name from the associated Role entity
        String productName = meal.getProduct().getName();
        String userName = meal.getUser().getEmail();

        return MealDto.builder()
                .mealId(meal.getMealId())
                .productName(productName)
                .weight(meal.getWeight())
                .userName(userName)
                .date(meal.getDate())
                .build();
    }
}
