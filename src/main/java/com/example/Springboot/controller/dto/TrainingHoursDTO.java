package com.example.Springboot.controller.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class TrainingHoursDTO {
    @Max(value = 300, message = " Not more than 300 hours")
    @Min(value = 5, message = "Not less than 5 hours")
    private Integer hours;

    public Integer getHours() {
        return hours;
    }
}
