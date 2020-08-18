package ru.kpoyta.i.roga.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpoyta.i.roga.animals.configs.MyConfig;
import ru.kpoyta.i.roga.animals.entities.Cat;
import ru.kpoyta.i.roga.animals.entities.Dog;
import ru.kpoyta.i.roga.animals.entities.Parrot;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
