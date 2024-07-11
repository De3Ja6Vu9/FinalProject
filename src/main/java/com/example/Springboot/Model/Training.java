package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Training {
    @Id
    private String training;
    @Max(value = 300, message=" Not more than 300 hours")
    @Min(value = 5, message="Not less than 5 hours")
    private Integer hours;
    @NotEmpty(message="Gym cannot be empty")
    private String gym;
    private String duration;
//
    @ManyToOne
    private Instructor instructor;

    public Training() {
    }
    public Training(String training, Integer hours, String gym, String duration) {
        this.training = training;
        this.hours = hours;
        this.gym = gym;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTraining() {

        return training;
    }
    public void setTraining(String training) {

        this.training = training;
    }
    public Integer getHours() {

        return hours;
    }
    public void setHours(Integer hours) {

        this.hours = hours;
    }
    public String getGym() {

        return gym;
    }
    public void setGym(String gym) {

        this.gym = gym;
    }
    public String getDuration() {

        return duration;
    }
    public void setDuration(String duration) {

        this.duration = duration;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Training{" +
                "duration='" + duration + '\'' +
                ", training='" + training + '\'' +
                ", hours=" + hours +
                ", gym='" + gym + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
