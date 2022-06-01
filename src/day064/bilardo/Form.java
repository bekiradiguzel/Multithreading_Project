package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Form extends JFrame {
    private JButton btnCiz,btnDolu;
    private Pervane p1,p2;

    public Form() throws HeadlessException {
        super("Bilardo");
        setLayout(null);
        setVisible(true);
        setSize(new Dimension(800,600));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==27){
                    System.exit(0);
                }
            }
        });
        setLocation(new Point((screenSize.width-getWidth())/2,(screenSize.height-getHeight())/2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnCiz=new JButton("Çiz");
        btnCiz.setSize(80,20);
        btnCiz.setLocation(20,20);
        btnCiz.addActionListener((e)->cizimYap(e));
        add(btnCiz);


        //Dolu boş butonu
        btnDolu=new JButton("Dolu");
        btnDolu.setSize(80,20);
        btnDolu.setLocation(100,20);
        btnDolu.addActionListener((e)->doluBosYap(e));
        add(btnDolu);

        //Pervane 1
        p1=new Pervane();
        p1.setSize(50,50);
        p1.setLocation(20,50);
        p1.setAci(12);
        add(p1);

        //Pervane 2
        p2=new Pervane();
        p2.setSize(150,150);
        p2.setLocation(300,200);
        p2.setAci(30);
        p2.setDoluMu(true);
        add(p2);


    }

    private boolean doluBosFlag;
    private void doluBosYap(ActionEvent e) {
        doluBosFlag=!doluBosFlag;
        btnDolu.setText(flag?"Boş":"Dolu");
        p1.setDoluMu(doluBosFlag);
    }

    private boolean flag;
    private void cizimYap(ActionEvent e) {
        Graphics gr=getGraphics();

        flag=!flag;
        int aci=30;
        int kontrol=flag?0:1;
        for (int i = 0; i <360/aci ; i++) {
            if (i%2==kontrol){
                gr.setColor(Color.RED);
            }else {
                gr.setColor(Color.white);
            }

            gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,(i+1)*aci,aci);

        }


    }


}
