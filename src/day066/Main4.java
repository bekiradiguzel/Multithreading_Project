package day066;

public class Main4 implements Runnable {

    @Override
    public void run() {
        System.out.println("Bu kod yeni Thread'in içindedir");
    }

    public static void main(String[] args) {
        Main4 m=new Main4();
        Thread th=new Thread(m);
        th.start();
        System.out.println("Bu kod yeni Thread'in dışındador");
    }
}
