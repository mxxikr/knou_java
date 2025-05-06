package theeleventh;
import java.util.*;

public class ArrayListMain2 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "one"); // 인덱스 1에 "one" 추가
        list.add("five");

        System.out.println(list.size());
        System.out.println(list.indexOf("one"));
        System.out.println(list.get(2)); // 인덱스 2의 요소 출력
        System.out.println(list.lastIndexOf("one")); // "one"의 마지막 인덱스
        System.out.println(list.set(3, "four")); // 인덱스 3의 요소를 "four"로 변경
        System.out.println(list.remove(4)); // 인덱스 4의 요소 삭제
        System.out.println(list.remove("one")); // "one" 요소 삭제
    }
}