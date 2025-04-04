package canliDers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilities {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Java");
        list.add("C++");

// Sıralama
        Collections.sort(list);
        System.out.println(list); // [C++, Java, Python]

// Ters çevirme
        Collections.reverse(list);
        System.out.println(list); // [Python, Java, C++]

// Karıştırma
        Collections.shuffle(list);

// İkili arama (sıralı liste gerektirir)
        Collections.sort(list);
        int index = Collections.binarySearch(list, "Java");

// Değiştirilemez koleksiyonlar
        List<String> unmodifiableList = Collections.unmodifiableList(list);

// Senkronize koleksiyonlar
        List<String> synchronizedList = Collections.synchronizedList(list);


    }
}
