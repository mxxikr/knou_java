package thefifth;

public class Main3 {
    public static void main(String args[]) {
        CSuper sub = new CSuper() { // CSuper를 상속 받는 익명 클래스 정의 후 객체 생성
            public int b = 20;

            public void method1( ) {
                System.out.println("sub1");
            }

            public void method3( ) {
                System.out.println("sub3");
            }
        };

        sub.method1(); // CSuper를 상속 받는 하위 클래스의 객체를 가리킴
        sub.method2(); // CSuper를 상속 받는 하위 클래스의 객체에 method2가 없어 부모 클래스에서 호출

        System.out.println(sub.a); // sub의 선언 유형인 CSuper에서 데이터 필드 호출

        // sub.method3(); // 컴파일 오류
        // System.out.println(sub.b); 컴파일 오류
    }
}
