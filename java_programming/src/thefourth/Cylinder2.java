package thefourth;

public class Cylinder2 extends Circle {
    private double height;
    static final double PI = 3.14;
    private double r;

    public Cylinder2() {
        super(); // 부모 클래스의 생성자 초기화
        height = 1.0; // 자식 클래스에서 height 초기화
    }

    public Cylinder2(double radius, double h) {
        super(radius); // double값을 가지는 인자로 부모클래스의 생성자 초기화
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getRadius() {
        return r;
    }

    /**
     * 원기둥의 겉넓이 계산
     * 2 * 3.14 * 반지름 * 높이 + 2 * 원의 면적
     */
    public double getArea() { // Cylinder2의 getArea() 메소드
        return 2 * PI * getRadius() * height + 2 * super.getArea(); // 상속받은 this.getRadius() 호출
    }

    /**
     * 원기둥의 부피 계산
     * 원의 면적 * 높이
     */
    public double getVolume() {
        return super.getArea() * height; // Circle의 getArea() 메소드 호출
    }

    public String toString() {
        return "Cylinder of radius = " + getRadius() + " height = " + height;
    }

    public static void main(String args[]) {
        System.out.println(new Cylinder2(3, 10).getVolume());
    }
}