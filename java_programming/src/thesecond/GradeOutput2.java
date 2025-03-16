package thesecond;

public class GradeOutput2 {
    int e; // 영어 성적을 위한 변수
    int m; // 수학 성적을 위한 변수

    void input_grade(int a, int b) {
        e = a; // 영어 성적을 입력
        m = b; // 수학 성적을 입력
    }

    void output_grade() { // 성적의 합을 출력
        System.out.println(e+m);
    }

    public static void main(String args[]) {
        GradeOutput2 g1, g2; // 2명의 성적을 표현
        g1 = new GradeOutput2(); // 객체 생성
        g2 = new GradeOutput2();

        g1.input_grade(90, 85); // 점수 입력
        g2.input_grade(80, 80);

        g1.output_grade(); // 점수 출력
        g2.output_grade();
    }
}