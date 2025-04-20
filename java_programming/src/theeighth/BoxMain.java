package theeighth;

public class BoxMain {
    public static void main(String args[]) {
        Box b1 = new Box(20, 30);
        Box b2 = (Box) b1.clone();
        System.out.println(b2.width()); //20
        System.out.println(b2.height()); //30

        System.out.println(b1);
        System.out.println(b2);
    }
}