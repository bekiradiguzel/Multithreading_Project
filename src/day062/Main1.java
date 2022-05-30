package day062;



public class Main1 {
    public static void main(String[] args) {
        //Yeni bir Thread oluşturup, Constructor'a bir Runnable nesne verildi.
        System.out.println(Thread.currentThread().getName()+" başladı.");
        Counter ctr=new Counter();
        Thread th1=new Thread(ctr);
        th1.start();

        System.out.println(Thread.currentThread().getName()+" bitti.");
    }
}

record Counter() implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
