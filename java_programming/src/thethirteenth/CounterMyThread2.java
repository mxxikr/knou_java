package thethirteenth;

// Counter 값을 감소시키는 스레드
public class CounterMyThread2 implements Runnable {
    // 공유 자원인 Counter 객체
    Counter c;

    // Counter 객체를 전달받아 저장하는 생성자
    public CounterMyThread2(Counter c) {
        this.c = c;
    }

    // 스레드는 이 run() 메서드를 실행
    public void run() {
        // Counter 값 1씩 감소 (100,000번 반복)
        for (int i = 0; i < 100000; i++) {
            c.decrement();
        }
    }
}