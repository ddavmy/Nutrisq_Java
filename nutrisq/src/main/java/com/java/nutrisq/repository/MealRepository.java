package com.java.nutrisq.repository;

import com.java.nutrisq.model.Meal;
import com.java.nutrisq.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {
    @Query("SELECT DISTINCT m FROM Meal m WHERE m.user = :user")
    List<Meal> findAllMealsByUser(@Param("user") User user, PageRequest pageable);
}
