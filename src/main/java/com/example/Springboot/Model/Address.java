package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private Integer id;
    private String street;
    private String houseCode;

    public Address() {
    }

    public Address(Integer id, String street, String houseCode) {
        this.id = id;
        this.street = street;
        this.houseCode = houseCode;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getHouseCode() {
        return houseCode;
    }
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseCode='" + houseCode + '\'' +
                ", id=" + id +
                ", street='" + street + '\'' +
                '}';
    }
}

