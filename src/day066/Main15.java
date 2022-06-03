package day066;

public class Main15 implements Runnable {

    private boolean flag=false;


    private synchronized boolean keepRunning(){
        return flag==false;
    }
    private synchronized boolean doStop(){
        return flag=true;
    }


    public static void main(String[] args) {
        Thread th = new Thread();
        // stop() metodu kullanılamadığı için kendi durdurma metodumuzu geliştireceğiz

        // Runnable a ait bir stop metodu da yok

        Main15 m = new Main15();
        new Thread(m).start();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(m.doStop()){
            System.out.println("Thread durduruldu. ");
        }



    }


    @Override
    public void run() {
        while (true) {


            System.out.println("Thread çalışıyor.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}