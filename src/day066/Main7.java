package day066;

public class Main7 extends Thread{

private static int sayi=0;

    @Override
    public void run() {
sayi++;
    }

    public static void main(String[] args) throws InterruptedException {
        Main7 m=new Main7(); // bir Thread nesnesi oluşturduk burada aynı zamanda Runnabledır.

     m.start();
     Thread.sleep(50);
        System.out.println(sayi);
     sayi++;
        System.out.println(sayi);


    }
}
