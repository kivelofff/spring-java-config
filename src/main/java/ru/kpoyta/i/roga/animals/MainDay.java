package ru.kpoyta.i.roga.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpoyta.i.roga.animals.configs.DayConfig;
import ru.kpoyta.i.roga.animals.days.Day;

import java.applet.AppletContext;

public class MainDay {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DayConfig.class);
        System.out.println(context.getBean(Day.class).getDayName());
    }
}
