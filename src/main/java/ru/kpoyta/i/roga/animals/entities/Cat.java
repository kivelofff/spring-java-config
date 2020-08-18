package ru.kpoyta.i.roga.animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Terrible terror";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
