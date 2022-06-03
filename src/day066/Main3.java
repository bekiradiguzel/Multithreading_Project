package day066;

public class Main3 extends Thread{
    @Override
    public void run() {
        System.out.println("Yeni Thread'in içinde çalışan kod.");
    }

    public static void main(String[] args) {
        Main3 m=new Main3();
        m.start();
        System.out.println("Bu kod yeni Thread'in dışındadır. ");
    }
}
