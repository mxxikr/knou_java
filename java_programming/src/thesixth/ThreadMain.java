package thesixth;

public class ThreadMain {
    public static void main(String args[]) {
        Thread thd = new Thread(() -> System.out.println("my thread"));
        thd.start();
    }
}
