package theninth;

import java.io.RandomAccessFile;

public class RandomAccessFileMain {
    public static void main(String args[ ]) {
        try (RandomAccessFile raf = new RandomAccessFile("D:\\01_KNOU\\test.txt", "rw")) { // RandomAccessFile 객체 생성
            for(int i = 0; i < 10; i++)
                raf.write(i);

            for(int i = 9; i >= 0; i--) {
                raf.seek(i); // 파일 포인터 이동
                System.out.print(raf.read()); // 파일 포인터 위치에서 읽기
            }

            raf.close();    // 스트림 닫기
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
