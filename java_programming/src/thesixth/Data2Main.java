package thesixth;

public class Data2Main {
    public static void main(String args[]) {
        Data2<Integer> data2 = new Data2<>(20); // Integer는 Number의 자식 유형
        System.out.println(data2.get());
//        Data2<String> data3 = new Data2<>("Hello"); //오류
//        System.out.println(data3.get());
    }
}