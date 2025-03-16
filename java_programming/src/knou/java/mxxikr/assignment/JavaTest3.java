package knou.java.mxxikr.assignment;

public class JavaTest3 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        System.out.println("배열 요소의 합: " + sum);
    }
}