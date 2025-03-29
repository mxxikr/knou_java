package thefourth;

public class CylinderTest {
    public static void main(String args[]) {
        Circle c = new Circle(3); // Circle 객체 생성
        Cylinder cy = new Cylinder(c, 10);
        System.out.println(cy.getVolume());
    }
}