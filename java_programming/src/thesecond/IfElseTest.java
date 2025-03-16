package thesecond;

public class IfElseTest {
    public static void main(String args[]) {
        int a = 2;
        int b = 2;

        if (a == 1) {
            if (b == 2) {
                System.out.println("a was 1 and b was 2.");
            }
        } else { // if (b == 2)와 짝지어진 else문
            System.out.println("a wasn't 1.");
        }
    }
}