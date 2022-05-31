package day063.digitalsaat;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.concurrent.ThreadLocalRandom;

public class Saat extends JComponent implements Runnable {
    private Thread th;
    private Color renk;
    public Saat() {
        setSize(70,70);


        th=new Thread(this);
        th.start();
    }


    @Override
    public void paint(Graphics g) {
        int red= ThreadLocalRandom.current().nextInt(0,256);
        int green= ThreadLocalRandom.current().nextInt(0,256);
        int blue= ThreadLocalRandom.current().nextInt(0,256);
        renk=new Color(red,green,blue);
        g.setColor(renk);
        g.fillOval(0,0,getWidth(),getHeight());
        g.setColor(Color.white);
        String metin= LocalDateTime
                .now()
                        .format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        g.drawString(metin,10,30);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
