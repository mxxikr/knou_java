package theeleventh;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionMain {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();


        System.out.println("Set: " + set.getClass());
        System.out.println("ArrayList: " + arrayList.getClass());
        System.out.println("LinkedList: " + linkedList.getClass());
        System.out.println("Queue: " + queue.getClass());
        System.out.println("Map: " + map.getClass());
    }
}