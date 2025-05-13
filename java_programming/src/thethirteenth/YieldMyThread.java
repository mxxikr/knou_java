package thethirteenth;

// Runnable 인터페이스를 구현한 Thread
class YieldMyThread implements Runnable {
    // run 메소드는 스레드 실행 시 호출되는 메소드
    public void run() {
        // 0부터 99까지 반복
        for (int i = 0; i < 100; i++) {
            // 현재 실행 중인 스레드의 이름 가져오기
            String thd_name = Thread.currentThread().getName();

            // 스레드 이름을 출력
            System.out.print(thd_name + " ");

            // 만약 스레드 이름이 thd1 라면, 다른 스레드에게 CPU를 양보
            if (thd_name.equals("thd1"))
                Thread.yield();  // 현재 스레드 일시 정지 및 실행 대기 상태로 변경
        }
    }
}