package theeleventh;
import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<String>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

        String s = queue.poll(); // 큐에서 첫 번째 요소를 꺼냄
        System.out.println(s);

        while (s != null) { // 큐가 비어있지 않은 동안 반복
            System.out.println(s); // 꺼낸 요소 출력
            s = queue.poll(); // 다음 요소를 꺼냄
        }
    }
}
