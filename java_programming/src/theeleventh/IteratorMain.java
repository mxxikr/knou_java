package theeleventh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        Iterator<String> it = list.iterator(); // Iterator 객체 얻기

        while (it.hasNext()) // 다음 요소가 있는지 확인
            System.out.println(it.next());  // 다음 요소 가져와 출력
    }
}
