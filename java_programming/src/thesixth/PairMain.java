package thesixth;

public class PairMain {
    public static void main(String args[]) {
        Pair<String, Integer> p1;
        p1 = new OrderedPair<> ("Even", 8); // new OrderedPair <String, Integer>

        Pair<String, String> p2;
        p2 = new OrderedPair<> ("hello", "java");

        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
    }
}
