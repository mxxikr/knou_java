package theseventh;

import java.io.*;

public class TryWithResourceMain {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\00_CODE\\knou_java\\java_programming\\src\\theseventh\\file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
