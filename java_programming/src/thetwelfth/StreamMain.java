package thetwelfth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        System.out.println(IntStream.rangeClosed(1, 100).sum()); // 1부터 100까지의 합
        System.out.println(IntStream.rangeClosed(1, 100).average().getAsDouble()); // 1부터 100까지의 평균
        System.out.println(IntStream.rangeClosed(1, 100).min().getAsInt()); // 1부터 100까지의 최소값
        System.out.println(IntStream.rangeClosed(1, 100).max().getAsInt()); // 1부터 100까지의 최대값

        String[] strArray = { "홍길동", "이순신", "김유신" };
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item));

        int[] intArray = {1, 2, 3};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.println(item));

        Path path = Paths.get("D:\\00_CODE\\knou_java\\java_programming\\src\\theseventh\\file.txt");
        Stream<String> fileStream = Files.lines(path);
        fileStream.forEach(line -> System.out.println(line));
        fileStream.close();
    }
}