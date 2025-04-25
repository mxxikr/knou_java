package theninth;

import java.io.InputStreamReader;

public class InputStreamReaderMain {
    public static void main(String args[]) {
        try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8")) {
            int i; // 변수 i 선언

            // Enter 키를 입력받으면 종료하도록 설정
            System.out.println("텍스트를 입력하세요. 종료하려면 '끝'이라고 입력하고 Enter를 누르세요.");
            StringBuilder line = new StringBuilder();

            while ((i = isr.read()) != -1) { // -1은 입력 스트림의 끝을 의미
                char c = (char) i;
                System.out.print(c); // 입력된 문자를 출력

                if (c == '\n') {
                    // 줄바꿈을 만났을 때 지금까지 입력된 문자열 확인
                    if (line.toString().trim().equals("끝")) {
                        break; // "끝" 문자열이 입력되면 루프 종료
                    }
                    line.setLength(0); // 문자열 초기화
                } else {
                    line.append(c); // 문자 추가
                }
            }

            System.out.println("\n프로그램을 종료합니다.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}