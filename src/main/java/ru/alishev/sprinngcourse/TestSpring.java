package ru.alishev.sprinngcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        System.out.println(classicaMusic.getSong());
//           Musik musik = context.getBean("rockMusic", Musik.class);
//           MussicPlayer mussicPlayer = new MussicPlayer(musik);
//           mussicPlayer.playMysik();
//           Musik musik2 = context.getBean("classicaMusic", Musik.class);
//           MussicPlayer mussicPlayer1 = new MussicPlayer(musik2);
//           mussicPlayer1.playMysik();
              MussicPlayer mussicPlayer= context.getBean("mussicPlayer", MussicPlayer.class);
              System.out.println(mussicPlayer.getVolume());
              System.out.println(mussicPlayer.getName());
        ClassicaMusic classicaMusic = context.getBean("classicaMusic",ClassicaMusic.class);

//            Computer computer = context.getBean("computer", Computer.class);
//             System.out.println(computer);
//          MussicPlayer secondMussicPlayer= context.getBean("musicPlayer", MussicPlayer.class);
//          boolean comparasion = mussicPlayer == secondMussicPlayer;
//        System.out.println(comparasion);
//        System.out.println(mussicPlayer);
//        System.out.println(secondMussicPlayer);
//        secondMussicPlayer.setVolume(10);
//
 //           mussicPlayer.playMysik();
//
//        System.out.println(mussicPlayer.getName());
//        System.out.println(mussicPlayer.getVolume());


        context.close();
    }
}
