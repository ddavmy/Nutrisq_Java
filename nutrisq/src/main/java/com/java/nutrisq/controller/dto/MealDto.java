package com.java.nutrisq.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class MealDto {
    private long mealId;
    private String productName;
    private int weight;
    private String userName;
    private Date date;
}
