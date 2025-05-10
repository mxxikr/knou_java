package thetwelfth;
import java.util.*;
import java.util.stream.*;

public class LoopingMain {
    public static void main(String[] args) {
        List <Book> books = new ArrayList <Book> ();
        books.add(new Book("JAVA 프로그래밍", "홍길동", 10000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("마이크로프로세서 입문", "김유신", 14000));
        books.add(new Book("데이터베이스 입문", "신사임당", 21000));
        books.add(new Book("빅데이터 연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("알고리즘", "권율", 17000));

        // anyMatch가 true를 반환하기 전까지 peek 실행
        books.stream()
                .peek(book -> System.out.println(book)) // 각 메소드를 순회하면서 book 객체를 출력하는 중간 연산
                .anyMatch(m -> m.price > 20000); // 가격이 20000원 이상인 책이 있는지 확인하는 최종 연산
    }
}