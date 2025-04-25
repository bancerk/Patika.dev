package concurrency.concurrentCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class syncedCollectionsExample {

    public static void main(String[] args) {

        Collections.synchronizedMap(new HashMap<>());

        Collections.synchronizedList(List.of(123, 1234));

        Collections.synchronizedSet(Set.of("Cem", "Patika"));

    }
}
