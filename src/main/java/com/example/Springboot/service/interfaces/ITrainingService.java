package com.example.Springboot.service.interfaces;

import com.example.Springboot.Model.Training;

import java.util.List;
import java.util.Optional;

public interface ITrainingService {
    List<Training> getAllTraining();

    Training getTrainingById(String training);

    List<Training> getTrainingByHoursLessThan(Integer hours);

    List<Training> getTrainingByGymAndHours(String gym, Optional<Integer> hours);

    void saveTraining(Training training);

    void updateTraining(Training training, String id);

    void updateTrainingHours(Integer hours, String id);

    void deleteTraining(String id);
}
