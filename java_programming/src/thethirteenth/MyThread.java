package thethirteenth;

// Thread 클래스를 상속받은 MyThread 클래스 정의
class MyThread extends Thread {
    // 스레드가 실행될 때 호출되는 run() 메소드 재정의
    public void run() {
        // 0부터 9까지 10번 반복
        for (int i = 0; i < 10; i++)
            // 현재 스레드의 이름 출력
            System.out.println(getName());
    }
}