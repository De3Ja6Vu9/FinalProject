package com.example.Springboot.Repository;

import com.example.Springboot.Model.Instructor;
import com.example.Springboot.Model.Training;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
//
    @Autowired
    InstructorRepository instructorRepository;

  @BeforeEach
  void setUp() {
      //
      Optional<Instructor> instructorOptional = instructorRepository.findById(2);

      if (instructorOptional.isPresent()) {
          Training fire = new Training("Fire", 22, "H67", "67 days");
          trainingRepository.save(fire);
      }

      Training dragon = new Training("dragon-type", 15, "D8", "36 days");
      trainingRepository.save(dragon);
  }

  @AfterEach
  void tearDown() {
      trainingRepository.deleteById("dragon-type");
  }


    @Test
    public void findAll_training_trainingList() {
List<Training> trainingList = trainingRepository.findAll();
System.out.println(trainingList);
assertEquals(6, trainingList.size());
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

    @Test
    public void findByHours_validHours_correctTraining() {
      Optional<Training> trainingOptional = trainingRepository.findByHours(40);
      assertTrue(trainingOptional.isPresent());
      System.out.println(trainingOptional.get());
      assertEquals("Water-type", trainingOptional.get().getTraining());
    }

    @Test
    public void findByGym_validGym_GymList() {
      List<Training> trainingList = trainingRepository.findAllByGym("W3");
      System.out.println(trainingList);
      assertEquals(1, trainingList.size());
    }

    @Test
    public void findByGymContaining_str_trainingList(){
      List<Training> trainingList = trainingRepository.findAllByGym("W3");
      System.out.println(trainingList);
      assertEquals(1, trainingList.size());
    }

    @Test
    public void findByHoursLessThan_validHours_trainingList(){
      List<Training> trainingList = trainingRepository.findAllByHoursLessThan(25);
      System.out.println(trainingList);
      assertEquals(4, trainingList.size());
    }
}