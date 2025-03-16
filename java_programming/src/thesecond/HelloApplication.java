package thesecond;

public class HelloApplication {
    static String szMsg = "Hello, Java!";
    static final int NUM_GEARS = 6;
    String szStr1 = "Hello, Java!";
    final int nConst = 3; //선언시 초기 값 지정
    double d = 5;
    static double res = Math.sqrt(2);
    float f =(float)5.5;

    public static void main(String args[]) {
        int nTest = 0;
        System.out.println(szMsg);
        System.out.println(NUM_GEARS);
        System.out.println(nTest);
        System.out.println("j=" + 10);
        System.out.println(res);
//        System.out.println(nConst);
//        System.out.println(szStr1);
    }
}