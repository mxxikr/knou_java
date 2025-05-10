package thetwelfth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineMain {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Avocado");

        // 스트림 파이프라인을 사용하여 단어를 대문자로 변환하고 A로 시작하는 단어의 개수를 count
        long count = words.stream() // 원본 스트림
                .map(String::toUpperCase) // 중간 연산
                .filter(word -> word.startsWith("A")) // 중간연산
                .count(); // 최종연산

        System.out.println(count); // 2가 출력됨


        List<Book> books = new ArrayList<Book>();
        books.add(new Book("JAVA 프로그래밍", "홍길동", 10000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("빅데이터 연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("알고리즘", "권율", 17000));

        books.stream()
                .distinct()
                .forEach(book -> System.out.println(book));

        Stream<Book> stream = books.stream();
        IntStream price = stream.mapToInt(book -> book.getPrice());
        double avg = price.average().orElse(0.0); // 평균값이 없을 경우 0.0 반환

        double avg2 = books.stream()
                .mapToInt(book -> book.getPrice())
                .average().orElse(0.0);

        System.out.println(avg);
        System.out.println(avg2);
    }
}