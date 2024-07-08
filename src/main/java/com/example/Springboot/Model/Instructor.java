package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String instructor;

    //Empty CONSTRUCTOR
    public Instructor() {
    }

    public Instructor(String instructor) {
        this.instructor = instructor;
    }

    //GETTERS & SETTERS
    public Integer getId() {

        return id;
    }
    public void setId(Integer id) {

        this.id = id;
    }
    public String getInstructor() {

        return instructor;
    }
    public void setInstructor(String instructor) {

        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}


