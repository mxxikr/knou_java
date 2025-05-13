package thethirteenth;

// Runnable 인터페이스를 구현한 JoinMyThread 클래스
class JoinMyThread implements Runnable {
    // 스레드가 실행될 때 호출되는 메소드
    public void run() {
        // 0부터 99까지 100번 반복
        for (int i = 0; i < 100; i++) {
            // 현재 실행 중인 스레드의 이름 출력
            System.out.print(Thread.currentThread().getName() + " ");

            // 현재 실행 중인 스레드의 실행을 잠시 양보 (다른 스레드에게 CPU를 넘겨줌)
            Thread.yield();
        }
    }
}