package thethirteenth;

public class MyThread2Main {
    public static void main(String[ ] args) {
        Thread t1 = new Thread(new MyThread(), "thd0"); //
        t1.start();
        Thread t2 = new Thread(new MyThread(), "thd1");
        t2.start();
        System.out.println("main");
    }
}
