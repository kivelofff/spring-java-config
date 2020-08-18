package ru.kpoyta.i.roga.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.kpoyta.i.roga.animals.entities.Cat;
import ru.kpoyta.i.roga.animals.entities.Dog;
import ru.kpoyta.i.roga.animals.entities.Parrot;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
    @Bean
    public Dog dog() {
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Parrot fuckingParrots() {
        return new Parrot();
    }

}
