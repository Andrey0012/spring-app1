package ru.alishev.sprinngcourse;

import org.springframework.stereotype.Component;

@Component

public class RockMusic implements Musik{
    @Override
    public String getSong() {
        return "Wind cries Mary" ;
    }
}
