package theseventh;
import java.io.*;

public class readMain {
    public static void main(String args[]) {
        int b = 0;
        try {
            b = System.in.read(); // IOException을 발생 시킬 수 있는 메소드기 때문에 예외 처리 필요
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println((char) b);
    }
}
