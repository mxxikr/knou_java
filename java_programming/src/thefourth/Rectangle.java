package thefourth;
import java.awt.Point;

public class Rectangle {
    public int width = 0; // non-static 변수 초기화
    public int height = 0;
    public Point origin; // Point 클래스 : 좌표상의 어떤 위치를 나타내는데 사용하는 클래스

    public Rectangle() {
        origin = new Point(0,0);
    }

    public Rectangle(Point p, int w, int h) { // 생성자를 사용해 데이터 필드 초기화
        origin = p;
        width = w;
        height = h;
    }
}
