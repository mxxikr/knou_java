package thethirteenth;

public class MyThreadMain {
    public static void main(String args[]) {
        // MyThread 클래스를 기반으로 스레드 t1 생성
        Thread t1 = new MyThread();
        t1.start(); // t1의 run() 메소드를 호출하여 스레드 실행 시작

        // MyThread 스레드 t2 생성
        Thread t2 = new MyThread();
        t2.start(); // t2의 run() 메소드를 호출하여 스레드 실행 시작

        // 메인 스레드에서 main 출력
        System.out.println("main");
    }
}