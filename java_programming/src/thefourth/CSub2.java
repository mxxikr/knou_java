package thefourth;

class CSub2 extends CSuper2 {
    public double x = 1;

    public void f() {
        System.out.println("CSub");
    }

    public void print() {
        System.out.println("super.x");
        super.f();
    }
}