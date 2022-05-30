package day062;

public class Main {
    public static void main(String[] args) {
        //currentThread, setName, main Thread
        Thread thread=Thread.currentThread();
        //thread.setName("MyThread");
        System.out.println(thread.getName()+"("+thread.getId()+")");
        //System.out.println(1/0);
    }
}
