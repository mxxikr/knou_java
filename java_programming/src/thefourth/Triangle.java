package thefourth;

/**
 * getArea 메소드 재정의 -> 메소드 오버라이딩
 */
class Triangle extends Shape { // 자식 클래스
    public double getArea(double h, double w) {
        return h * w * 0.5;
    }
}