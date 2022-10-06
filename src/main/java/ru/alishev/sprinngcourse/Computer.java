package ru.alishev.sprinngcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MussicPlayer mussicPlayer;
    @Autowired
    public Computer(MussicPlayer mussicPlayer) {
        this.id = 1;
        this.mussicPlayer = mussicPlayer;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + mussicPlayer.playMysik();
    }
}
