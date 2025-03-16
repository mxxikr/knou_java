package thesecond;

public class CommandInputTest {
    public static void main(String args[]) { // 매개변수 빈칸으로 구분
        if (args.length < 1) {
            System.out.println("매개변수를 입력해주세요");
            return;
        }
        
        System.out.println(args[0]);
        int n = Integer.parseInt(args[1]); // 문자열을 integer 형식으로 변환
        System.out.println(n);
    }
}