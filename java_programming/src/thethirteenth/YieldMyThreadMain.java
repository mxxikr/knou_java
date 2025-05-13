package thethirteenth;

public class YieldMyThreadMain {
    public static void main(String args[]) {
        Thread my_thread1 = new Thread(new YieldMyThread(), "thd1");
        Thread my_thread2 = new Thread(new YieldMyThread(), "thd2");

        my_thread1.start();
        my_thread2.start();
    }
}
