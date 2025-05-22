package TestModule;

import pack_a.Member;
import pack_b.Student;
import pack_c.Triangle;
import pack_d.Circle;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyProject의 main 메소드 실행 시작!");

        // my_mod_a 모듈의 클래스 사용
        Member member = new Member();
        System.out.println("Member 이름: " + member.getName());

        Student student = new Student();
        System.out.println("Student 정보: " + student.getDetails());

        System.out.println("----------------------------------");

        // my_mod_b 모듈의 클래스 사용
        Triangle triangle = new Triangle();
        System.out.println("도형 정보: " + triangle.getShapeInfo());

        Circle circle = new Circle();
        System.out.println("도형 정보: " + circle.getShapeInfo());
    }
}