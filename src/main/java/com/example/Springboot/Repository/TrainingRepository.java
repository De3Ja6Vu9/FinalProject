package com.example.Springboot.Repository;


import com.example.Springboot.Model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainingRepository extends JpaRepository<Training, String> {
    Optional<Training> findByHours(Integer hours);

    List<Training> findAllByGym(String gym);

    List<Training> findAllByTrainingContaining(String str);

    List<Training> findAllByHoursLessThan(Integer hours);

    @Query("SELECT t FROM Training t WHERE t.hours = 40")
    List<Training> findAllByHours40();



}
