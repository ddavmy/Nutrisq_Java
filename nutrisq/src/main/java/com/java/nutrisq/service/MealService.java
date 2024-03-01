package com.java.nutrisq.service;

import com.java.nutrisq.model.Meal;
import com.java.nutrisq.model.User;
import com.java.nutrisq.repository.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MealService {

    private static final int PAGE_SIZE = 3;
    private final MealRepository mealRepository;

    public List<Meal> getMeals(User user, int page) {
        return mealRepository.findAllMealsByUser(
                user, PageRequest.of(page, PAGE_SIZE));
    }
}
