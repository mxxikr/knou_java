package thethirteenth;

class CounterMyThread1 implements Runnable {
    // 공유 자원인 Counter 객체
    Counter c;

    // Counter 객체를 받아와 저장
    public CounterMyThread1(Counter c) {
        this.c = c;
    }

    // 스레드 실행 시 호출됨
    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.increment();
        }
    }
}