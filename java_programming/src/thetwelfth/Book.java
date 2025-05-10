package thetwelfth;

import java.util.Objects;

class Book implements Comparable<Book> {
    String title;
    String author;
    int price;

    // getter, setter 메소드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 생성자
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title:" + title + ", author:" + author + ", price:" + price;
    }

    // equals() 메소드 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 같은 객체인지 확인
        if (o == null || getClass() != o.getClass()) return false; // null 체크 및 클래스 타입 체크
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author); // 필드 값 비교
    }

    // hashCode() 메소드 재정의
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price); // 필드 값으로 해시코드 생성
    }

    // compareTo() 메소드 재정의
    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.price, book.price);
    }
}