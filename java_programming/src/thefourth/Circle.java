package thefourth;

class Circle {
    double radius;

    public Circle() {   // 기본 생성자
        radius = 0; // 반지름 0으로 초기화
    }

    public Circle(double a) {
        radius = a;
    }

    /**
     * 원 면적 계산해 반환
     * 반지름 * 반지름 * 3.14
     */
    public double getArea() {
        return radius * radius * 3.14;
    }
}