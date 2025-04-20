package theeighth;

public class UnboxingMain {
    public static void main(String args[]) {
        // radius는 Double형 객체라 가정
        Double radius = Double.valueOf(10.4); // radius 변수 선언 및 초기화
        double r = radius.doubleValue(); // 객체.기본형Value()
        double r2 = radius; // 자동 unboxing
        System.out.println(Integer.valueOf(3) % 2); // 자동 unboxing
    }
}