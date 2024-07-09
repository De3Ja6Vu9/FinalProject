package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Test {
    @Id
    private String id;
    private Date startDate;
    private Boolean isRequired;

    public Test() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Boolean getIsRequired() {
        return isRequired;
    }
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }
}
