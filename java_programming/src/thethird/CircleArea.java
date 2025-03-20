package thethird;

public class CircleArea {
    public static void main(String args[ ]) {
        Circle c = new Circle(5); // CircleArea2와 Circle 클래스가 같은 패키지 안에 있을 경우 사용 가능

//        System.out.println(c.r); // private 데이터 필드기 때문에 오류 발생
        System.out.println(c.getRadius());  // r 을 리턴값으로 가지고 있는 getRadius 메소드 호출해 사용
        System.out.println(c.getArea());
    }
}
