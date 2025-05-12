package thethirteenth;

public class MyThreadMain {
    public static void main(String args[]) {
        Thread t1 = new MyThread();
        t1.start(); // run() 메소드 호출

        Thread t2 = new MyThread();
        t2.start();

        System.out.println("main");
    }
}
