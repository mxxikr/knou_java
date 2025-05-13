package thethirteenth;

class CounterSynchronized {
    private int c = 0; // 공유 자원

    // 값을 1 증가시키는 메서드: 한 번에 하나의 스레드만 접근 가능 (동기화 처리)
    public synchronized void increment() {
        c++;
    }

    // 값을 1 감소시키는 메서드: 한 번에 하나의 스레드만 접근 가능 (동기화 처리)
    public synchronized void decrement() {
        c--;
    }

    // 현재 값을 반환하는 메서드
    public int value() {
        return c;
    }
}