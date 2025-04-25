package concurrency.concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Elma", 10);
        map.put("Muz", 30);

        map.compute("Elma", (key, val) -> val + 5);

        map.putIfAbsent("Karpuz", 25);

        System.out.println(map);
    }
}
