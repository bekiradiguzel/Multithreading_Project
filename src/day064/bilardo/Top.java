package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Top extends JComponent implements Runnable {
    private Pervane yuzey;
    private int yonX,yonY;
    private final int HAREKET_MIKTARI=5;



    public Top() {
        setSize(100,100);
        yuzey=new Pervane();
        yuzey.setSize(getWidth(),getHeight());
        yuzey.setDoluMu(true);
        add(yuzey);
        yonX=-HAREKET_MIKTARI;
        yonY=HAREKET_MIKTARI;
        new Thread(this).start();
    }



    @Override
    public void run() {
        while (true){
            if (getX()<=0){
                yonX=HAREKET_MIKTARI;
            }
            if (getX()>=getParent().getWidth()-getWidth()){
                yonX=-HAREKET_MIKTARI;
            }

            if(getY()<=0){
                yonY=HAREKET_MIKTARI;
            }

            if (getY()>=getParent().getHeight()-getHeight()){
                yonY=-HAREKET_MIKTARI;
            }

            setLocation(getX()+yonX,getY()+yonY);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
