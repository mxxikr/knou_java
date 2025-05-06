package theeleventh;
import java.util.*;

public class HashSetMain {
    public static void main(String args[]) {
        Set<String> set = new HashSet<String>(); // HashSet 객체를 생성

        // HashSet에 문자열 값 추가
        set.add("one");
        System.out.println(set);

        set.add("two");
        System.out.println(set);

        set.add("three");
        System.out.println(set);

        set.add("four");
        System.out.println(set);

        System.out.println(set.add(new String("one"))); // HashSet은 중복을 허용하지 않으므로 이미 존재하는 "one"을 추가하지 않음
        System.out.println(set.size()); // HashSet의 현재 크기를 출력
        System.out.println(set.contains("four")); // HashSet이 "four"라는 요소를 포함하고 있는지 확인
        System.out.println(set.contains("one")); // HashSet이 "one"이라는 요소를 포함하고 있는지 확인
        System.out.println(set.contains(new String("one"))); // "one"이라는 값이 존재하는지 확인

        set.remove("four"); // "four"라는 요소 제거
        set.remove(new String("one")); // "one"이라는 문자열 제거
        System.out.println(set.size());

        set.clear(); // HashSet의 모든 요소를 제거
        System.out.println(set.size()); // HashSet의 현재 크기를 출력 (모든 요소가 삭제되었으므로 크기는 0)
    }
}