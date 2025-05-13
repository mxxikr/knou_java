package thethirteenth;

public class CounterMyThreadMain {
    public static void main(String args[]) throws InterruptedException {
        // 공유될 Counter 객체 생성
        Counter c = new Counter();

        // 값을 증가시키는 CounterMyThread1 스레드 생성
        Thread t1 = new Thread(new CounterMyThread1(c));

        // 값을 감소시키는 CounterMyThread2 스레드 생성
        Thread t2 = new Thread(new CounterMyThread2(c));

        // 두 스레드를 시작
        t1.start();
        t2.start();

        // 두 스레드가 작업을 종료할 때까지 대기
        t1.join();
        t2.join();

        // Counter 객체의 최종 값을 출력
        System.out.println(c.value());
    }
}