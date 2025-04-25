package theninth;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberReaderMain {
    public static void main(String args[]) {
        try (FileReader fr = new FileReader(new File("D:\\01_KNOU\\test.txt")); // FileReader 객체 생성
            LineNumberReader rd = new LineNumberReader(fr)) { // LineNumberReader 객체 생성
            String line;

            while ((line = rd.readLine()) != null) { // 파일 끝까지 한줄 씩 읽음
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
