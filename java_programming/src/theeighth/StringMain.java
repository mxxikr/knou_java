package theeighth;

public class StringMain {
    public static void main(String args[]) {
        String s1 = new String("Java"); // 객체를 생성        String str2 = "World";
        String s2 = "Java"; // 리터럴을 대입
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("hamburger".indexOf("urge"));
        System.out.println("hamburger".substring(3));

        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(5 > 3));
        System.out.println(String.valueOf(3.0));
        System.out.println(String.valueOf('c'));
        int[] a = new int[5];
        System.out.println(String.valueOf(a));

        char[ ] b = { 'J', 'a', 'v', 'a' };
        System.out.println(String.valueOf(b));

        final String aValue = "abcde";
        String str = new String( );

        for (int i = 0; i < 1000; i++)
            str = str + aValue;
        // 새로운 String 객체가 계속 생성되어 실행이 느려짐
        System.out.println(str);
    }
}