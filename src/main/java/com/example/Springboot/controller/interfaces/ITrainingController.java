package com.example.Springboot.controller.interfaces;

import com.example.Springboot.Model.Training;

import java.util.List;

public interface ITrainingController {
    public List<Training> getAllTraining();
    Training getTrainingById(String training);
}
