package com.example.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class StrategyTest extends Test {
    private Integer numberOfMoves;

    public StrategyTest() {
    }

    public Integer getNumberOfMoves() {
        return numberOfMoves;
    }

    public void setNumberOfMoves(Integer numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }
}
