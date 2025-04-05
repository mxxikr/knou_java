package thefifth;

public class MyInterfaceMain {
    public static void main(String args[]) {
        MyInterface sub = new MyInterface() {
            public void method( ) {
                System.out.println("sub1");
            }
        };

        sub.method( );
    }
}