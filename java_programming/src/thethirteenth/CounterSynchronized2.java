package thethirteenth;

class CounterSynchronized2 {
    private int c = 0; // 공유 변수 (스레드 간에 공유되는 변수)

    // 값을 1 증가시키는 메서드
    public void increment() {
        // 특정 블록에만 동기화 적용 (this 객체를 잠금으로 사용)
        synchronized(this) {
            c++;
        }
    }

    // 값을 1 감소시키는 메서드
    public void decrement() {
        // 특정 블록에만 동기화 적용 (this 객체를 잠금으로 사용)
        synchronized(this) {
            c--;
        }
    }

    // 현재 값을 반환하는 메서드
    public int value() {
        return c; // 동기화되지 않은 상태로 값을 반환
    }
}