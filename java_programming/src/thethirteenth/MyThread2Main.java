package thethirteenth;

public class MyThread2Main {
    public static void main(String[ ] args) {
        // MyThread를 기반으로 한 스레드 t1 생성, 이름은 thd0으로 설정
        Thread t1 = new Thread(new MyThread2(), "thd0");
        t1.start(); // t1의 run() 메소드를 실행하여 스레드 동작 시작

        // MyThread를 기반으로 한 또 다른 스레드 t2 생성, 이름은 thd1으로 설정
        Thread t2 = new Thread(new MyThread2(), "thd1");
        t2.start(); // t2의 run() 메소드를 실행하여 스레드 동작 시작

        // 메인 스레드에서 main 출력
        System.out.println("main");
    }
}