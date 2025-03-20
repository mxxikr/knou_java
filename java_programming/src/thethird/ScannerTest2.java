package thethird;
import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner 객체 생성
        while(sc.hasNextInt()) { // 단어 입력 시 검사
            System.out.println(sc.nextInt());
        }
    }
}
