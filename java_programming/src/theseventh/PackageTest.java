package theseventh;

public class PackageTest {
    class MyCar extends Car { // 같은 패키지에 있는 MyCar 클래스

    }

    class MyBus extends Bus { // 같은 패키지에 있는 public MyBus 클래스

    }

    public static void main(String args[]) {
        Bus bus = new Bus();
        Car car = new Car();
    }
}
