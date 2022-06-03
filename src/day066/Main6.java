package day066;

public class Main6 implements Runnable{
    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        System.out.println(name+"Thread'i çalıştı. ");
    }

    public static void main(String[] args) {

        Main6 m=new Main6();
        Thread th=new Thread(m,"Main6");
        th.start();
        String name = Thread.currentThread().getName();
        System.out.println(name+" Thread çalıştı. ");
    }
}
