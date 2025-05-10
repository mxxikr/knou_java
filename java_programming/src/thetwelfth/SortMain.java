package thetwelfth;

import java.util.ArrayList;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("JAVA 프로그래밍", "홍길동", 10000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("마이크로프로세서 입문", "김유신", 14000));
        books.add(new Book("데이터베이스 입문", "신사임당", 21000));
        books.add(new Book("빅데이터 연구", "유관순", 12000));
        books.add(new Book("커뮤니케이션 이론", "강감찬", 15000));
        books.add(new Book("PHP 프로그래밍", "이순신", 20000));
        books.add(new Book("알고리즘", "권율", 17000));

        // 객체는 compareble 인터페이스를 구현해야 함
        // 크기 비교에 compareToe 메소드 사용
        books.stream().sorted().forEach(book->
                System.out.println(book));
    }
}