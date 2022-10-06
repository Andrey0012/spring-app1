package ru.alishev.sprinngcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicaMusic implements Musik{
 //   private ClassicaMusic () {}

//    public static ClassicaMusic getClassicaMusic () {
//        return new ClassicaMusic();
//    }
    @PostConstruct
    public void doMyInit () {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy () {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
