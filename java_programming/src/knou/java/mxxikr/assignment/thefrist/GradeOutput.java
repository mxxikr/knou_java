package knou.java.mxxikr.assignment.thefrist;

public class GradeOutput {
    public static void main(String args[]) {
        Grade g1, g2; //2명의 성적을 표현하는 변수 선언
        g1 = new Grade(); //객체의 생성
        g2 = new Grade();

        //점수 입력
        g1.e = 90;
        g1.m = 85;

        g2.e = 80;
        g2.m = 80;

        g1.output_grade();
        g2.output_grade();
    }
}