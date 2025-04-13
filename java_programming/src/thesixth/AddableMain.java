package thesixth;

public class AddableMain {
    public static void main(String[] args) {

        // 익명 구현 클래스의 객체 생성
        Addable ad1 = new Addable() {
            public int add(int a, int b) { // 추상 메소드 구현
                return (a + b);
            }
        };

        System.out.println(ad1.add(100, 200));

        // 매개변수 목록과 return문을 가진 람다식
        Addable ad2 = (int a, int b) -> { // add 메소드 정의
            return (a + b);
        };

        System.out.println(ad2.add(10, 20));

        //간단한 람다식
        Addable ad3 = (a, b) -> (a + b);
        System.out.println(ad3.add(1, 2));
    }
}
