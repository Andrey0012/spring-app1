package ru.alishev.sprinngcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan ("ru.alishev.sprinngcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicaMusic classicaMusic () {
        return new  ClassicaMusic();
    }
    @Bean
    public RockMusic rockMusic () {
        return new RockMusic();
    }
    @Bean
    public MussicPlayer mussicPlayer () {
        return new MussicPlayer(rockMusic(),classicaMusic());
    }
    @Bean
    public Computer computer () {
        return new Computer(mussicPlayer());
    }

}
