package day064.bilardo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Form extends JFrame {
    private JButton btnCiz;

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
    }

    private void cizimYap(ActionEvent e) {
        Graphics gr=getGraphics();
        gr.setColor(Color.RED);
        //gr.fillOval((getWidth()-100)/2,(getHeight()-150)/2,100,150);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,60,60);
        gr.setColor(Color.white);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,120,60);
        gr.setColor(Color.RED);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,180,60);
        gr.setColor(Color.white);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,240,60);
        gr.setColor(Color.RED);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,300,60);
        gr.setColor(Color.white);
        gr.fillArc((getWidth()-200)/2,(getHeight()-200)/2,200,200,360,60);

    }


}
