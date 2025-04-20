package theeighth;

import java.io.IOException;

/**
 * 표준 입력을 사용하여 문자 입력 받기
 */
public class SystemMain {
    public static void main(String args[]) throws IOException {
        char cInput = 0;
        int i;
        // System.in.read()는 키보드로부터 문자 입력
        System.out.print("Input a character: ");
        cInput = (char) System.in.read();
        System.out.println(cInput);

        i = System.in.read();
        System.out.println(i);

        i = System.in.read();
        System.out.println(i);
        System.out.println(System.in.available()); // 입력된 문자 개수 리턴
    }
}
