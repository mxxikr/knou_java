package thefifth;

public class DayMain {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        for (Day d : Day.values( )) {
            System.out.println(d); // 각 원소 출력
        }
    }
}