package ru.alishev.sprinngcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MussicPlayer {

  //  private List <Musik> musikList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
    public int getVolume() { return volume; }
//    public void setVolume(int volume) { this.volume = volume; }
    private Musik musik1;
    private Musik musik2;
    @Autowired
    public MussicPlayer(@Qualifier ("classicaMusic") Musik musik1,
                        @Qualifier ("rockMusic") Musik musik2) {
        this.musik1 = musik1;
        this.musik2 = musik2;
    }

    public  String playMysik () { return "Playing: " + musik1.getSong()+ " ," + musik2.getSong(); }




//    public MussicPlayer(Musik musik) { this.musik = musik; }
//    public MussicPlayer () {}
//    public void setMusik(Musik musik) { this.musik = musik; }

//    public  void playMysik() {
//        System.out.println("Playing: " + classicaMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }


//    public MussicPlayer(List<Musik> musikList) {
//        this.musikList = musikList;
//    }
//
//    public void setMusikList(List<Musik> musikList) {
//        this.musikList = musikList;
//    }


//
//    private String name;
//    private int volume;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getVolume() {
//        return volume;
//    }
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }




//public  void playMysik() {
//        for (Musik musik : musikList)  System.out.println("Playing: " + musik.getSong());
//}
}
