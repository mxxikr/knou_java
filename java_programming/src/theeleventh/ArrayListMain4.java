package theeleventh;
import java.util.*;
import java.util.function.Consumer;

public class ArrayListMain4 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("three");
        list.add("two");
        list.add(1, "one"); // 인덱스 1에 "one" 추가

        // Consumer 인터페이스를 활용해 accept 메서드를 직접 구현한 익명 클래스
        Consumer<String> con1 = new Consumer<>() {
            // Consumer 인터페이스의 추상 메서드 accept를 구현
            public void accept(String t) {
                System.out.println(t);  // 각 요소를 처리
            }
        };

        // 리스트의 각 요소에 대해 con1의 accept 메서드를 실행
        list.forEach(con1);

        // 람다식을 사용하여 Consumer의 동작 구현
        Consumer<String> con2 = t -> System.out.println(t);
        // 리스트의 각 요소를 처리하며 출력
        list.forEach(con2);

        // 리스트의 각 항목에 대해 직접 람다 표현식 전달
        list.forEach(t -> System.out.println(t));
    }
}
