package com.example.Springboot.Model;

import jakarta.persistence.*;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String instructor;

    @OneToOne
    private Address addresss;


    //Empty CONSTRUCTOR
    public Instructor() {
    }

    public Instructor(String instructor) {
        this.instructor = instructor;
    }

    public Instructor(Address addresss) {
        this.addresss = addresss;
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

    public Address getAddresss() {
        return addresss;
    }
    public void setAddresss(Address addresss) {
        this.addresss = addresss;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "addresss=" + addresss +
                ", id=" + id +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}


