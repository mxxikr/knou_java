package thetwelfth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListMain {
    public static void main(String[] args) {
        List<People> list = new ArrayList<People>(); // People 객체를 저장할 ArrayList 생성
        list.add(new People("홍길동", 30));
        list.add(new People("이순신", 40));
        list.add(new People("김유신", 50));
        list.add(new People("유관순", 20));

        // 일반 스트림 사용
        System.out.println("일반 스트림 사용");
        Stream<People> n_stream = list.stream(); // 일반 스트림 생성
        n_stream.forEach(item -> System.out.println(item));

        // 병렬 스트림 사용
        System.out.println("병렬처리 스트림 사용");
        Stream<People> p_stream = list.parallelStream(); // 병렬 스트림 생성
        p_stream.forEach(item -> System.out.println(item + " : " + Thread.currentThread().getName()));
    }
}