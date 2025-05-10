package thetwelfth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class forEachMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park");

        for (String name : names) { // for-each 문법
            System.out.println(name);
        }

        Iterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) { // Iterator 사용
            System.out.println(iterator.next());
        }

        // 내부 반복
        names.forEach(item -> System.out.println("내부 반복: " + item));
    }
}