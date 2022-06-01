package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Pervane extends JComponent implements Runnable {
    private int aci;
    private boolean flag;
    private int kontrol;
    private Color renk1,renk2;
    private boolean doluMu;


    public Pervane() {
        this.aci=30;
        int r= ThreadLocalRandom.current().nextInt(0,256);
        int g= ThreadLocalRandom.current().nextInt(0,256);
        int b= ThreadLocalRandom.current().nextInt(0,256);
        renk1=new Color(r,g,b);
        renk2=Color.white;

        new Thread(this).start();
    }

    public boolean isDoluMu() {
        return doluMu;
    }

    public void setDoluMu(boolean doluMu) {
        this.doluMu = doluMu;
    }

    public int getAci() {
        return aci;
    }

    public void setAci(int aci) {
        this.aci = aci;
    }

    @Override
    public void run() {
        while (true){
            flag=!flag;
            kontrol=flag?0:1;
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 360 / aci; i++) {
            Color renk=i%2==kontrol?renk1:renk2;
            g.setColor(renk);
            if (doluMu){
                g.fillArc(0,0,getWidth(),getHeight(),(i+1)*aci,aci);
            }else {
                g.drawArc(0, 0, getWidth(), getHeight(), (i + 1) * aci, aci);
            }


        }

    }
}
