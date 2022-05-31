package day063.digitalsaat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Form extends JFrame {
    private JButton btn;
    private Saat s1,s2,s3;
    public Form() throws HeadlessException {
        super("Dijital Saat");
        setLayout(null);
        setSize(800,600);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int x=(size.width-getWidth())/2;
        int y=(size.height-getHeight())/2;
        setLocation(x,y);
        initialize();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initialize() {
        btn=new JButton("Çiz");
        btn.setSize(80,30);
        btn.setLocation(20,20);
        btn.addActionListener((e)->ciz(e));
        add(btn);

        //Saat 1
        s1=new Saat();

        s1.setLocation(20,60);
        add(s1);

        //Saat 2
        s2=new Saat();

        s2.setLocation(20,160);
        add(s2);

        //Saat 2
        s3=new Saat();

        s3.setLocation(20,260);
        add(s3);
    }

    private void ciz(ActionEvent e) {
        Graphics g=this.getGraphics();
        g.drawOval(50,50,200,200);
    }
}
