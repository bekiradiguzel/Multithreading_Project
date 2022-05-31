package day063.alarm;

import java.util.Timer;
import java.util.TimerTask;

public class MainApp {
    public static void main(String[] args) {
        Timer timer=new Timer("Alarm");
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                System.out.println("Merhaba");
            }
        };
        timer.scheduleAtFixedRate(tt,5000,3000);
        timer.cancel();
    }
}


/*
Yukarıdaki Anonim nesnenin gerçeği
class MyTask extends TimerTask{

    @Override
    public void run() {

    }
}*/
