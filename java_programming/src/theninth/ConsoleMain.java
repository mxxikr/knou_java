package theninth;
import java.io.*;
import java.util.Scanner;

public class ConsoleMain {
    public static void main(String args[]) {
        String name;
        char[] pw;
//        Console con = System.console(); // IDE에서는 null 리턴하므로 Scanner 사용
        Scanner scanner = new Scanner(System.in);

        System.out.print("name : ");
//        name = con.readLine( );
        name = scanner.nextLine();

        System.out.print("password : ");
//        pw = con.readPassword( );
        pw = scanner.nextLine().toCharArray();


//        con.printf("name : %s\n", name);
//        con.printf("password : %s\n", new String(pw));
        System.out.println("name : " + name);
        System.out.println("password : " + pw);

        // 스캐너 닫기
        scanner.close();
    }
}