package day066;

import java.util.ArrayList;
import java.util.List;

public class Main12 {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Zeyno");
        isimler.add("Ahmo");
        isimler.forEach((item)->System.out.println(item));






        Runnable runnable1=()-> System.out.println("Thread çalıştı. Aktif Thread: "+Thread.currentThread().getName());
        new Thread(runnable1,"Gövdesiz").start();
        System.out.println("Aktif Thread: "+Thread.currentThread().getName());

    }
}
