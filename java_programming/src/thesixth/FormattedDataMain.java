package thesixth;

public class FormattedDataMain {
    public static void main(String args[]) {
        Data<Number> data1 = new Data<Number>();

        data1.set(Integer.valueOf(10));  // OK
        data1.set(Double.valueOf(10.1));  // OK

        // Data<Number> data2 = new Data<Integer>(); // 컴파일 오류(Data<Integer> -> Data<Number> 형변환 불가)

        // FormattedData 사용 예시
        Data<Integer> data3 = new FormattedData<Integer>();  // OK
    }
}