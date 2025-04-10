package thesixth;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String args[]) {

        List list1 = new ArrayList(); // Object 유형
        list1.add("hello"); // hello 문자열이 object 유형으로 형변환 되어 추가
        String s1 = (String) list1.get(0); // object 유형으로 반환 되어 강제 형변환(다운캐스팅) 필요

        List<String> list2 = new ArrayList<>(); // 타입 명시
        list2.add("hello");
        String s2 = list2.get(0); //형변환이 필요 없음

        System.out.println(s1);
        System.out.println(s2);
    }
}
