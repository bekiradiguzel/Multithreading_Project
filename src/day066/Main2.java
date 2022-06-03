package day066;

public class Main2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Yeni bir Thread çalıştı.");
    }


    public static void main(String[] args) {

        Main2 m=new Main2();
        Thread th=new Thread(m);
        th.start();
    }
}
