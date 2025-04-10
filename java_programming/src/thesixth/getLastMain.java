package thesixth;

import java.util.List;

public class getLastMain {
    public static void main(String args[]) {
        List<String> list = List.of("hello", "world", "java");

        // List를 배열로 변환
        String[] array = list.toArray(new String[0]);

        // 변환된 배열을 getLast 메서드에 전달
        System.out.println(getLast.getLast(array));
    }
}