package thesixth;

public class UtilMain {
    public static void main(String args[]) {
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");

        boolean same = Util.<Integer, String>compare(p1, p2); // <Integer, String> 생략 가능

        System.out.println(same);
    }
}