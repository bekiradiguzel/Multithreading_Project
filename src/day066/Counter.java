package day066;

public class Counter  implements Runnable{
    private int sayac;
    private int sure;

    public Counter(int sayac,int sure){
        this.sayac=sayac;
        this.sure=sure;
        new Thread(this).start();


    }

    public static void main(String[] args) {
        Counter newC=new Counter(10,1000);


    }

    @Override
    public void run() {
        for (int i = sayac; i >=0 ; i--) {
            System.out.print(i+" ");
            try {
                Thread.sleep(sure);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
