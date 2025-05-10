package thetwelfth;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class EndMain {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1부터 10까지의 정수 중에서 짝수만 필터링하여 출력
        long count = Arrays.stream(intArray).filter(n -> n % 2 == 0).count();
        System.out.println("2의 배수의 개수 : " + count);

        // 1부터 10까지의 정수 중에서 짝수만 필터링하여 합계 계산
        long sum = Arrays.stream(intArray).filter(n -> n % 2 == 0).sum();
        System.out.println("2의 배수의 합 : " + sum);

        // 1부터 10까지의 정수 중에서 짝수만 필터링하여 최소 값 계산
        OptionalInt min = Arrays.stream(intArray).min();
        System.out.println("최소값 : " + min.getAsInt());

        // 1부터 10까지의 정수 중에서 짝수만 필터링하여 평균 계산
        OptionalDouble avg = Arrays.stream(intArray).average();
        System.out.println("평균 : " + avg.getAsDouble());
    }
}