package theninth;

import java.io.*;

public class FileOutputStreamMain {
    public static void main(String args[ ]) {
        File inFile = new File("D:\\01_KNOU\\test.txt"); // 입력 파일 경로 지정
        File outFile = new File("D:\\01_KNOU\\test2.txt"); // 출력 파일 경로 지정
        // try-with-resources 문을 사용해 자원을 자동으로 닫음
        try (
                InputStream is = new FileInputStream(inFile);
                OutputStream os = new FileOutputStream(outFile)) {

            int nData;
            nData = is.read(); // 파일에서 1바이트 읽기

            while(nData != -1) { // 파일 끝까지 반복
                os.write(nData); // 읽은 바이트를 출력 파일에 쓰기
                nData = is.read(); // 다음 바이트 읽기
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}