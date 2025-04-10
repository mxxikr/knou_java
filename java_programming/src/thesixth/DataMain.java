package thesixth;

public class DataMain {
    public static void main(String args[]) {
        Data data = new Data();
        Integer i = Integer.valueOf(20);
        data.set(i); // 컴파일 오류 없음
//        String s = (String) data.get(); // 실행 오류

        Data<String> data2 = new Data<>();
        Integer i2 = Integer.valueOf(20);
        // data.set(i); // 컴파일 오류

        System.out.println(data.get());
        System.out.println(data2.get());

//        Data<int> d = new Data<>( ); //오류
//        Data<Integer>[] arrayOfData; //오류
    }
}