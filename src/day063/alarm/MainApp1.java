package day063.alarm;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Timer;
import java.util.TimerTask;

public class MainApp1 {
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                try {
                    new ProcessBuilder("cmd","/c","cls")
                            .inheritIO()
                            .start()
                            .waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(
                        LocalDateTime
                                .now()
                                .format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
                );
            }
        };
        timer.scheduleAtFixedRate(tt,0,1000);
    }
}
