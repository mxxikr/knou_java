package theeighth;

public class StringBufferMain {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer("start");

        System.out.println(s1.capacity( )); // 버퍼 크기 리턴
        System.out.println(s1.length( )); // 문자열 길이 리턴
        System.out.println(s1.append("le")); // 문차 추가한 문자열 리턴
    }
}