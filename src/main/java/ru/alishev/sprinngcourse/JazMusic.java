package ru.alishev.sprinngcourse;

import org.springframework.stereotype.Component;


public class JazMusic implements Musik{

    @Override
    public String getSong() {
        return "Hello friend";
    }
}
