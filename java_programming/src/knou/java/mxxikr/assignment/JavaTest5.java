package knou.java.mxxikr.assignment;

public class JavaTest5 {
    public static void main(String[] args) {
        Parent obj = new Child(); // 부모 클래스 타입으로 자식 클래스 객체 생성
        obj.show(); // 실제 객체(Child)의 show() 호출
    }
}