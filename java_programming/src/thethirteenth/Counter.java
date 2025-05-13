package thethirteenth;

class Counter {
    // 카운터 값을 저장하는 변수, 초기값은 0
    private int c = 0;

    // c 값을 1 증가
    public void increment() {
        c++;
    }

    // c 값을 1 감소
    public void decrement() {
        c--;
    }

    // 현재 c 값을 반환
    public int value() {
        return c;
    }
}