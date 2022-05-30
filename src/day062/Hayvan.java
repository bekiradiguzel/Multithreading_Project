package day062;

public class Hayvan extends Thread{
    private int hiz;
    public Hayvan(String isim,int hiz) {
        super(isim);
        this.hiz=hiz;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000-(hiz*5));
            } catch (InterruptedException e) {
            }
            System.out.println(getName()+" "+(i*10)+" metre ilerledi.");
        }
    }
}
