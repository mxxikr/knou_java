package thethirteenth;

public class JoinMyThreadMain {
    public static void main(String args[]) throws InterruptedException {
        // JoinMyThread 실행할 스레드 my_thread1 생성, 이름은 thd1
        Thread join_my_thread1 = new Thread(new JoinMyThread(), "thd1");
        // JoinMyThread 실행할 스레드 my_thread2 생성, 이름은 thd2
        Thread join_my_thread2 = new Thread(new JoinMyThread(), "thd2");

        // 각각의 스레드 시작
        join_my_thread1.start();
        join_my_thread2.start();

        // my_thread1이 종료될 때까지 main 스레드는 대기
        join_my_thread1.join();

        // my_thread1이 종료된 후 main 스레드에서 실행
        System.out.println("main thread");
    }
}