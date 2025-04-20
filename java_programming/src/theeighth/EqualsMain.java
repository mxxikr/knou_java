package theeighth;

public class EqualsMain {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(5);
        Integer y = Integer.valueOf(10);
        Integer a = 5;
        Short b = 5;

        System.out.println(x.equals(y)); // false
        System.out.println(x.equals(a)); // true
        System.out.println(x.equals(b)); // false

        System.out.println(x == y); // false
        System.out.println(x == a); // true
// System.out.println(a == b); // 컴파일 오류
    }
}
