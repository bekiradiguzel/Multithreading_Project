package day062;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" başladı.");

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" başladı.");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(i);
                    //System.out.println(1/0);
                }
            }
        };
        new Thread(runnable,"Counter").start();
        //System.out.println(1/0);
        System.out.println(Thread.currentThread().getName()+" bitti.");
    }
}
