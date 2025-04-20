package theeighth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 여러 자리 숫자 입력 받기
 */
public class SystemMain2 {
    public static void main(String args[]) throws IOException {
        String szInputLine;
        int nValue;
        InputStreamReader isr = new InputStreamReader(System.in); // 바이트 스트림을 문자 스트림으로 변환
        BufferedReader is = new BufferedReader(isr); // 버퍼를 사용하여 문자 입력

        System.out.print("Input a number: ");
        szInputLine = is.readLine( ); // 한 줄 입력 받기

        nValue = Integer.parseInt(szInputLine); // 문자열을 정수로 변환
        System.out.println(nValue);

        is.close(); // 스트림 닫기
    }
}
