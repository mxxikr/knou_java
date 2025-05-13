package thethirteenth;

// Thread 클래스를 상속받은 InterruptMyThread 클래스 정의
class InterruptMyThread extends Thread {
    Thread thdNext = null; // 다음 스레드를 저장할 변수
    String szName; // 현재 스레드의 이름을 저장할 변수

    public InterruptMyThread(String szName) {
        super(szName); // 부모 클래스 생성자 호출로 스레드 이름 설정
        this.szName = szName;
    }

    // 스레드가 실행될 때 호출되는 run() 메소드
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000000); // 매우 긴 시간 동안 스레드 대기 (Sleep)
            } catch (InterruptedException e) {
                System.out.print(getName() + " "); // 인터럽트 발생 시 스레드 이름 출력
                if (thdNext.isAlive()) { // 다음 스레드가 실행 중인지 확인
                    thdNext.interrupt(); // 다음 스레드 인터럽트
                }
            }
        }
    }

    // 다음 스레드를 설정하는 메소드
    public void setNextThread(Thread t) {
        thdNext = t;  // 다음 스레드 저장
    }
}