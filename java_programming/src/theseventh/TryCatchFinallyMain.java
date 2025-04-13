package theseventh;

public class TryCatchFinallyMain {
    public static void main(String[] args) {
        try {
            // 예외가 발생할 수 있는 코드 블록
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[4]); // 배열 인덱스 범위를 초과하여 예외 발생
            int result = 10 / 0; // ArithmeticException 발생
            System.out.println("결과: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            // ArrayIndexOutOfBoundsException 처리
            System.out.println("배열 인덱스가 잘못되었습니다.");
        } catch (ArithmeticException e) {
            // ArithmeticException 처리
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 정상 종료됩니다.");
    }
}
