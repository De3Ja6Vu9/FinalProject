package com.example.Springboot.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class TraineeInfo {
    private String town;
    private String trainerNumber;
    private String phone;

    public TraineeInfo(String town, String trainerNumber, String phone) {
        this.town = town;
        this.trainerNumber = trainerNumber;
        this.phone = phone;
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getTrainerNumber() {
        return trainerNumber;
    }
    public void setTrainerNumber(String trainerNumber) {
        this.trainerNumber = trainerNumber;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
