package thethirteenth;

// Runnable 인터페이스를 구현한 MyThread 클래스
class MyThread2 implements Runnable {
    // 스레드가 실행될 때 호출되는 메소드
    public void run() {
        // 0부터 9까지 반복
        for (int i = 0; i < 10; i++) {
            // 현재 실행 중인 스레드의 이름 출력
            System.out.println(Thread.currentThread().getName());
        }
    }
}