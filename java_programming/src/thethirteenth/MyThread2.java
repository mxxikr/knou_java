package thethirteenth;

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 출력
    }
}