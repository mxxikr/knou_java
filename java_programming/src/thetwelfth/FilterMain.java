package thetwelfth;

import java.util.Arrays;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        String[] strArray = {"ABC", "BCD", "AFE", "CDE", "ABZ", "ACCZ"}; // 문자열 배열 생성
        List<String> strList = Arrays.asList(strArray);

        // 스트림을 사용하여 조건에 맞는 문자열 필터링
        strList.stream()
                .filter(item -> item.startsWith("A"))  // "A"로 시작하는 문자열 필터링
                .filter(item -> item.endsWith("Z")) // "Z"로 끝나는 문자열 필터링
                .filter(item -> item.length() > 3) // 길이가 3보다 큰 문자열 필터링
                .forEach(item -> System.out.println(item));

        // 필터링을 한 줄로 작성
        strList.stream()
                .filter(item -> item.startsWith("A") && item.endsWith("Z") && item.length() > 3)
                .forEach(item -> System.out.println(item));
    }
}
