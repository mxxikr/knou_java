package thethirteenth;

public class InterruptMyThreadMain {
    public static void main(String args[]) {
        InterruptMyThread interrupt_my_thread1 = new InterruptMyThread("thd1");
        InterruptMyThread interrupt_my_thread2 = new InterruptMyThread("thd2");
        InterruptMyThread interrupt_my_thread3 = new InterruptMyThread("thd3");

        // 스레드 간 순환 연결 설정
        interrupt_my_thread1.setNextThread(interrupt_my_thread2); // thd1 다음에 thd2
        interrupt_my_thread2.setNextThread(interrupt_my_thread3); // thd2 다음에 thd3
        interrupt_my_thread3.setNextThread(interrupt_my_thread1); // thd3 다음에 thd1 (순환)

        // 스레드 시작
        interrupt_my_thread1.start();
        interrupt_my_thread2.start();
        interrupt_my_thread3.start();

        try {
            // 첫 번째 스레드에 인터럽트를 실행
            interrupt_my_thread1.interrupt();

            // 나머지 스레드 종료 대기
            interrupt_my_thread2.join();
            interrupt_my_thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main");
    }
}