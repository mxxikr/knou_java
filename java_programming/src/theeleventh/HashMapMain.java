package theeleventh;

import java.util.*;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> lectures; // 학생별 과목 점수를 저장할 Map 생성 선언
        Map<String, Map<String, Integer>> scores = new HashMap<>(); // String, Map<String,Integer>로 타입 명시

        List<String> names = new ArrayList<String>(); // 학생의 이름을 담을 리스트 생성
        names.add("김철수");
        names.add("이영희");

        Iterator<String> it = names.iterator(); // 이름 리스트를 순회하기 위해 Iterator 생성

        // 이름 리스트의 각 학생에 대해 과목 점수를 설정
        while (it.hasNext()) {
            String name = it.next();  // 다음 이름 가져오기

            if (name.equals("김철수")) {
                lectures = new HashMap<String, Integer>(); // 새로운 과목 점수를 저장할 HashMap 생성
                lectures.put("국어", 100);
                lectures.put("영어", 95);
                lectures.put("수학", 80);
                scores.put(name, lectures);  // 전체 점수 Map(scores)에 추가
            } else {
                lectures = new HashMap<String, Integer>();
                lectures.put("국어", 90);
                lectures.put("영어", 95);
                lectures.put("수학", 95);
                scores.put(name, lectures);
            }
            System.out.println(scores);
            System.out.println(name);
            System.out.println(lectures);
        }

        Iterator<String> it2 = names.iterator();
        System.out.println(names);

        while (it2.hasNext()) {
            String name = it2.next();
            System.out.println(name);
            System.out.print("국어 : ");
            System.out.println(scores.get(name).get("국어")); // scores.get(name)으로 Map<String, Integer> 얻고 다시 get("과목")
            System.out.print("영어 : ");
            System.out.println(scores.get(name).get("영어"));
            System.out.print("수학 : ");
            System.out.println(scores.get(name).get("수학"));
            System.out.println();
        }
    }
}
