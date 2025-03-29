package thefourth;

class Cylinder {
    private Circle c; // 원 (Circle 클래스 변수 정의)
    private int h; // 높이

    public Cylinder(Circle a, int b) {
        c = a;
        h = b;
    }

    public double getVolume() {
        return c.getArea() * h;
    }
}