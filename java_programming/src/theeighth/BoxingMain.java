package theeighth;

public class BoxingMain {
    public static void main(String args[]) {
        int n = Integer.parseInt("123"); // 문자열을 정수로 변환
        long l = Long.parseLong("1234"); // 문자열을 long으로 변환

        String s1 = Integer.toString(4); // 정수를 문자열로 변환
        String s2 = Long.toString(5l); // long을 문자열로 변환
        String s3 = String.valueOf(123); // 정수를 문자열로 변환

        Double radius = Double.valueOf(10.4); // valueOf() 사용
        Double radius2 = 2.59; // 자동 boxing
    }
}
