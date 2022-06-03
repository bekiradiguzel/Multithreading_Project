package day066;

public class Main13 {
    public static void main(String[] args) {
        Runnable runnable2=()->{
            String name = Thread.currentThread().getName();
            long id = Thread.currentThread().getId();
            System.out.printf("%s Thread'i %d id ile çalıştı",name,id);
        };
        new Thread(runnable2,"Gövdeli").start();


    }
}
