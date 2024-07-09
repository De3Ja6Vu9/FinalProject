package com.example.Springboot.Repository;

import com.example.Springboot.Model.Training;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TrainingRepositoryTest {
    @Autowired
    TrainingRepository trainingRepository;

    @Test
    public void findAll_training_trainingList() {
List<Training> trainingList = trainingRepository.findAll();
System.out.println(trainingList);
assertEquals(4, trainingList.size());
    }

    @Test
    public void findById_validId_correctTraining() {
        Optional<Training> trainingOptional = trainingRepository.findById("Water-type");
        assertTrue(trainingOptional.isPresent());
        System.out.println(trainingOptional.get());
        assertEquals(40, trainingOptional.get().getHours());
    }

    @Test
    public void findById_invalidId_trainingNotPresent() {
        Optional<Training> trainingOptional = trainingRepository.findById("Fire-type");
        assertTrue(trainingOptional.isEmpty());
    }
}