package thetwelfth;

import java.util.Arrays;

public class MappingMain {
    public static void main(String[] args) {
        // String 배열을 IntStream으로 변환
        String[] strNums = {"10", "20", "30"};
        Arrays.stream(strNums)
                .mapToInt(item -> Integer.parseInt(item)) // String -> int
                .forEach(item -> System.out.println(item)); // int 출력

        // int 배열을 Stream<String>으로 변환
        int[] numbers = {10, 20, 30};
        Arrays.stream(numbers)
                .mapToObj(item -> String.valueOf(item)) // int -> String
                .forEach(item -> System.out.println(item + "(" + item.length() +")")); // String 출력

        // 문자열을 공백으로 나누어 단어를 출력
        Arrays.asList("Hello world, this is java", "Welcome to java world")
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(word -> System.out.println(word));
    }
}
