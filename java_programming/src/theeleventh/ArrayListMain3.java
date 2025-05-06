package theeleventh;
import java.util.*;

public class ArrayListMain3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        // for 구문을 이용한 자료 탐색
        for (int i = 0; i < list.size(); i++) // list.size()는 ArrayList의 크기를 리턴
            System.out.println(list.get(i));

        // 향상된 for 구문을 이용한 자료 탐색
        for (String s : list) // list의 자료를 하나씩 꺼내서 s에 저장
            System.out.println(s);

        // Iterator 인터페이스를 이용한 자료 탐색
        Iterator<String> it = list.iterator(); // list의 Iterator 객체를 생성
        // Iterator 객체의 hasNext() 메소드를 이용하여 자료가 있는지 확인
        while (it.hasNext())
            System.out.println(it.next());
    }
}
