package thefourth;

public class CSuperTest {
    public static void main(String args[]) {
        CSub sub  = new CSub();

//        sub.f1 = 40; // 오류 발생
        sub.f2 = 50;
//        sub.f3 = 60; // 오류 발생
        sub.f4 = 70;

        sub.setPrivate(10);
        sub.setPublic(20);
//        sub.mPrivate(); // 오류 발생
    }
}
