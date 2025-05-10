package thetwelfth;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // HashSet 객체를 생성
        for (int i = 0; i < 10; i++) {
            set.add(i); // HashSet에 0부터 9까지의 정수 값 추가
        }

        // 일반 스트림 사용
        System.out.println("일반 스트림 사용");
        Stream<Integer> n_stream = set.stream(); // 일반 스트림 생성
        n_stream.forEach(item -> System.out.println(item)); // 스트림의 각 요소를 출력

        // 병렬 스트림 사용
        System.out.println("병렬처리 스트림 사용");
        Stream<Integer> p_stream = set.parallelStream(); // 병렬처리 스트림 생성
        p_stream.forEach(item -> System.out.println(item + "(" +
                Thread.currentThread().getName() + ")")); // 스트림의 각 요소를 출력하면서 현재 스레드 이름도 출력
    }
}