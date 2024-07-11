package com.example.Springboot.service.impl;

import com.example.Springboot.Model.Training;
import com.example.Springboot.Repository.TrainingRepository;
import com.example.Springboot.service.interfaces.ITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingService implements ITrainingService {
    @Autowired
    TrainingRepository trainingRepository;


    @Override
    public List<Training> getAllTraining() {
        return trainingRepository.findAll();
    }

    @Override
    public Training getTrainingById(String training) {
        Optional<Training> trainingOptional = trainingRepository.findById(training);
        if (trainingOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "training" + training +" not found");
        return trainingOptional.get();
    }

    @Override
    public List<Training> getTrainingByHoursLessThan(Integer hours) {
        return trainingRepository.findAllByHoursLessThan(hours);
    }

    @Override
    public List<Training> getTrainingByGymAndHours(String gym, Optional<Integer> hours) {
        if (hours.isPresent()) return trainingRepository.findAllWhereGymAndHoursParams(gym, hours.get());
        return trainingRepository.findAllByGym(gym);
    }

    @Override
    public void saveTraining(Training training) {
        trainingRepository.save(training);
    }

    @Override
    public void updateTraining(Training training, String id) {
        Optional<Training> trainingOptional = trainingRepository.findById(id);
        if (trainingOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "training" + id +" not found");
        trainingRepository.save(training);
    }

    @Override
    public void updateTrainingHours(Integer hours, String id) {
        Optional<Training> trainingOptional = trainingRepository.findById(id);
        if (trainingOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "training" + id +" not found");
        Training training = trainingOptional.get();
        training.setHours(hours);
        trainingRepository.save(training);
    }

    @Override
    public void deleteTraining(String id) {
        Optional<Training> trainingOptional = trainingRepository.findById(id);
        if (trainingOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "training" + id +" not found");
        trainingRepository.deleteById(id); //CRUD
    }
}


