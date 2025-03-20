package thethird;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        if (s1 != null ) {
            System.out.println("result =" + " " + s2);
            System.out.println('A' + 0); // 문자 char + 숫자 int = 65
            System.out.println("A" + 0); // 문자열 String + 숫자 int = A0
        }
    }
}
