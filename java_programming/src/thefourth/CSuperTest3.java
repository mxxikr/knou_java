package thefourth;

public class CSuperTest3 {
    public static void main(String args[]) {
        CSub3 sub = new CSub3(10.0);
        System.out.println(sub.x); // 10.0

        System.out.println(sub.getSuper()); // 100.0 출력

        System.out.println(sub.getSub()); // 10.0 출력
    }
}
