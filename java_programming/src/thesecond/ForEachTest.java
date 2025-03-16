package thesecond;

public class ForEachTest {
    public static void main(String[] args) {
        int[ ] array0fInts = {32, 87, 3, 589, 12, 1076, 2000, 8};
        for (int element : array0fInts) {
            System.out.print(element + " ");
        }
        System.out.println(array0fInts.length); // 32 87 3 589 12 1076 2000 8
    }
}