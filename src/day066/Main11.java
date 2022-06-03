package day066;

public class Main11 {
    public static void main(String[] args) {
     Runnable runnable=new Runnable() {
         @Override
         public void run() {
             String name = Thread.currentThread().getName();
             long id = Thread.currentThread().getId();
             System.out.println("Thread Id: "+id);
             System.out.println("Thread name: "+name);

         }
     };





        Thread th=new Thread(runnable);
        th.start();




    }
}
