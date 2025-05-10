package thetwelfth;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMain {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList( // 리스트 생성
                new Member("청명", "남", 25),
                new Member("당소소", "여", 30),
                new Member("진동룡", "남", 35),
                new Member("유이설", "여", 28)
        );

        // Collectors.toList()를 사용하여 List로 변환
        // 남성 회원들만 필터링하여 List로 수집
        List<Member> male_members = members.stream()
                .filter(member -> member.getGender().equals("남")) // 성별이 '남'인지 확인
                .collect(Collectors.toList()); // 필터링된 결과를 List로 수집
        // 남성 회원 정보 출력
        male_members.stream().forEach(member ->
                System.out.println(member.getGender() + "성 회원 "+ member.getName() + "님의 나이는 " + member.getAge()));

        // Collectors.toSet()을 사용하여 Set으로 변환
        // 여성 회원들만 필터링하여 Set으로 수집
        Set<Member> female_members2 = members.stream()
                .filter(member -> member.getGender().equals("여")) // 성별이 '여'인지 확인
                .collect(Collectors.toSet()); // 필터링된 결과를 Set으로 수집
        // 여성 회원 정보 출력
        female_members2.stream().forEach(member ->
                System.out.println(member.getGender() + "성 회원 "+ member.getName() + "님의 나이는 " + member.getAge()));

        // Collectors.toMap()을 사용하여 Map으로 변환
        // 여성 회원들의 이름과 나이를 Map 형식으로 수집 (이름 -> 나이)
        Map<String, Integer> ages = female_members2.stream()
                .collect(Collectors.toMap(
                        member -> member.getName(), // Key: 회원 이름
                        member -> member.getAge()   // Value: 회원 나이
                ));
        System.out.println(ages); // 수집된 Map 출력
    }
}