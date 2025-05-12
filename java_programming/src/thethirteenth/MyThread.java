package thethirteenth;

class MyThread extends Thread {
    public void run() { // 스레드의 run() 메서드 재정의
        for (int i = 0; i < 10; i++) // 10번 반복
            System.out.println(getName());
    }
}