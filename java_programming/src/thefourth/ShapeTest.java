package thefourth;

public class ShapeTest {
    public static void main(String args[]) {
        Shape t = new Triangle(); // Shape 자식 클래스 Triangle 객체 생성
        System.out.println(t.getArea(3.0, 4.0)); // 3.0 * 4.0 * 0.5 = 6.0 출력
    }
}
