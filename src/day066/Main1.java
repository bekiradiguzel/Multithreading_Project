package day066;

public class Main1 extends Thread{

    @Override
    public void run() {
        System.out.println("Yeni bir Thread çalıştı.");
    }

    public static void main(String[] args) {
        // main metodu herhangi bir yerde çalıştırılabilir.
        Main1 m=new Main1(); // Bu main1 nesnesidir ve thread'den geliyor.
        m.start();
    }
}
