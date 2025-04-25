package theninth;
import java.io.*;

public class FileMain {
    public static void main(String args[]) {
        File file = new File("c:\\windows"); // 디렉토리 객체 생성
        File files[] = file.listFiles(); // 디렉토리 내 파일 목록 리턴
        int i = 0;

        while(i < files.length) { // 디렉토리 내 파일 개수만큼 반복
            System.out.print(files[i].getPath()); // 파일 경로 출력
            System.out.println("\t" + files[i].length()); // 파일 크기 출력
            i++;
        }
    }
}
