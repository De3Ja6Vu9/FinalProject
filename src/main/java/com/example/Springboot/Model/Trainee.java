package com.example.Springboot.Model;

import jakarta.persistence.*;

@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float grade;
    @Embedded
    private TraineeInfo traineeInfo;

    public Trainee() {
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TraineeInfo getTraineeInfo() {
        return traineeInfo;
    }

    public void setTraineeInfo(TraineeInfo traineeInfo) {
        this.traineeInfo = traineeInfo;
    }
}
