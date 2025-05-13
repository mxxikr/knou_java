package thethirteenth;

public class CounterSynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        // 공유될 CounterSynchronized 객체 생성
        CounterSynchronized counter = new CounterSynchronized();
        // 공유될 CounterSynchronized2 객체 생성
        CounterSynchronized2 counter2 = new CounterSynchronized2();


        // 값을 증가시키는 스레드
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // 1 증가
                counter2.increment();
            }
        });

        // 값을 감소시키는 스레드
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement(); // 1 감소
                counter2.decrement();
            }
        });

        // 두 스레드 실행
        t1.start();
        t2.start();

        // 두 스레드가 작업을 종료할 때까지 대기
        t1.join();
        t2.join();

        // CounterSynchronized2 객체의 최종 값 출력
        System.out.println("최종 Counter 값: " + counter.value());
        System.out.println("최종 Counter2 값: " + counter2.value());
    }
}