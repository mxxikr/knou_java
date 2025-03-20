package thethird;

public class LengthTest {
    public static void main(String args[ ]) {
        int twoArray[ ][ ] = {{0, 1}, {10, 11, 12}}; // 선언과 동시에 초기화
        for (int i = 0; i < twoArray.length; i++)
            for (int j = 0; j < twoArray[i].length; j++)
                System.out.println(twoArray[i][j]);
    }
}