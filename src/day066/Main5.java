package day066;

public class Main5 extends Thread{
    public Main5(){
        super("Main5 Thread'i çalıştı.");
    }








    @Override
    public void run() {
        System.out.println(getName()+"Thread'i çalıştı.");
    }


    public static void main(String[] args) {
        new Main5().start();
    }
}
