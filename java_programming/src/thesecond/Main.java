package thesecond;

public class Main {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("매개변수를 입력해주세요");
            return;
        }

        System.out.println(args[0] + ", " + args[1]);
    }
}