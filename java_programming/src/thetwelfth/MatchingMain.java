package thetwelfth;

import java.util.Arrays;

public class MatchingMain {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = false;

        // intArray의 요소 중에서 2의 배수가 있는지 확인
        // 스트림의 최소 하나의 요소가 조건을 만족할 때 true를 반환
        result = Arrays.stream(intArray).anyMatch(n -> n % 2 == 0);
        System.out.println("적어도 하나는 2의 배수인가? " + result);

        // intArray의 요소 모두 2의 배수인지 확인
        // 스트림의 모든 요소가 조건을 만족할 때 true를 반환
        result = Arrays.stream(intArray).allMatch(n -> n % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        // intArray의 요소 모두 2의 배수가 아닌지 확인
        // 스트림의 모든 요소가 조건을 만족하지 않으면 true를 반환
        result = Arrays.stream(intArray).filter(n -> n % 2 != 0)
                .noneMatch(n -> n % 2 == 0);
        System.out.println("모두 2의 배수가 아닌가? " + result);
    }
}