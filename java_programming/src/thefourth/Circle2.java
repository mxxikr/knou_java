package thefourth;

class Circle2 {
    static double PI = 3.14;
    double radius = 2.0; // 반지름

    public double getArea() {
        return this.radius * this.radius * PI; // c1.radius 호출 시 this값은 c1값을 가지게 됨
    }
    public void display() {
        System.out.println("반지름:" + this.radius + " 면적:" + this.getArea());
    }

    public static void main(String args[]) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2();
        c2.radius = 5.0; // c2의 반지름을 5.0으로 변경

        c1.display();
        c2.display();
    }
}