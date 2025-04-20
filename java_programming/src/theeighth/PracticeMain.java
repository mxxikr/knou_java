package theeighth;

public class PracticeMain {
    public static void main(String args[]) {
        String s = new String("Jovo");
        s.replace('o','a');
        s.concat("Exam");
        System.out.println(s);

        s = s.replace('o', 'a');  // 반환 값을 다시 s에 저장
        s = s.concat("Exam");    // 반환 값을 다시 s에 저장
        System.out.println(s);   // "JavaExam"
    }
}