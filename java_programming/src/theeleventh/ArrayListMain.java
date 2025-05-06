package theeleventh;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");

        System.out.println(list.indexOf("apple")); // 첫 번째 "apple"의 인덱스 출력
        System.out.println(list.indexOf("grape")); // 존재하지 않기 때문에 -1 출력

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("apple");

        System.out.println(list2.lastIndexOf("apple")); // 마지막 "apple"의 인덱스 출력
        System.out.println(list2.lastIndexOf("grape"));

        List<String> list3 = new ArrayList<>();
        list3.add("apple");
        list3.add("banana");
        list3.add("cherry");

        List<String> subList = list3.subList(0, 2); // 0부터 2까지의 인덱스 요소를 포함하는 서브리스트 생성
        System.out.println(subList);

        list3.set(1, "blueberry"); // 원본 리스트 변경 시 서브리스트도 반영됨
        System.out.println(subList);

        List<String> list4 = new ArrayList<>();
        list4.add("apple");
        list4.add("banana");

        // 리스트 반복자를 생성
        ListIterator<String> it = list4.listIterator();

        // 다음 요소 탐색
        while (it.hasNext()) {
            System.out.println(it.next()); // 다음 요소 출력
        }

        List<String> list5 = new ArrayList<>();
        list5.add("apple");
        list5.add("banana");
        list5.add("cherry");

        // 1번 인덱스부터 시작하는 Iterator 생성
        ListIterator<String> it2 = list5.listIterator(1);

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
