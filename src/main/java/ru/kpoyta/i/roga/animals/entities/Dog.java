package ru.kpoyta.i.roga.animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Ball";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
