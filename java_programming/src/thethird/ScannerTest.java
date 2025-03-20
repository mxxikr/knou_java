package thethird;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner 객체 생성
        if (sc.hasNextInt()) { // int 값이 있을 경우 true 반환
            System.out.println(sc.nextInt());
        } else {
            System.out.println("It's not Integer");
        }
    }
}
