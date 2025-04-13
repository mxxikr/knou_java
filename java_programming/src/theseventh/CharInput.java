package theseventh;

import java.io.IOException;

class CharInput {
    int nInput;
    public char getInput() throws IOException { // 예외 간접 처리로 예외 전파
        nInput = System.in.read(); //예외 발생 가능
        return (char) nInput;
    }
}