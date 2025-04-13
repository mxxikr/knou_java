package theseventh;

import java.io.IOException;

public class CharInputMain {
    public static void main(String[] args) {
        CharInput charInput = new CharInput();
        try {
            System.out.println(charInput.getInput()); // getInput 메소드 호출하여 예외 처리 필요
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
