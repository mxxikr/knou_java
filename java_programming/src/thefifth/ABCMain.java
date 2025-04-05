package thefifth;

public class ABCMain {
    public static void main(String args[]) {
        A a = new B( );
        a.func( ); // B 클래스의 func 메소드 호출
        a = new C( );
        a.func( ); // C 클래스의 func 메소드 호출
    }
}
