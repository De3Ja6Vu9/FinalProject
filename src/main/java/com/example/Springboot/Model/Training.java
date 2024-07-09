package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Training {
    @Id
    private String training;
    private Integer hours;
    private String gym;
    private String duration;
    private Integer instructorId;

    public Training() {

    }
    public Training(String training, Integer hours, String gym, String duration, Integer instructorId) {
        this.training = training;
        this.hours = hours;
        this.gym = gym;
        this.duration = duration;
        this.instructorId = instructorId;

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
    public Integer getInstructorId() {

        return instructorId;
    }
    public void setInstructorId(Integer instructorId) {

        this.instructorId = instructorId;
    }

    @Override
    public String toString() {
        return "Training{" +
                "duration='" + duration + '\'' +
                ", training='" + training + '\'' +
                ", hours=" + hours +
                ", gym='" + gym + '\'' +
                ", instructorId=" + instructorId +
                '}';
    }
}
