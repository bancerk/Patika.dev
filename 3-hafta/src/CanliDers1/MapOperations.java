package CanliDers1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperations {

    public static void main(String[] args) {

        // declaration
        Map<String, Integer> programmingLanguages = new HashMap<>();

        // değer ekleme
        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("Cobol", 1991);

        // get value
        Integer yearOfJavaIntroduced = programmingLanguages.get("Java");
        System.out.println(yearOfJavaIntroduced); // 1995

        // declaration with values -> immutable
        Map<String, Integer> populations =
                Map.of("Türkiye", 90000000, "Almanya", 65000000, "Fransa", 70000000);

        // loop
        System.out.println("Loop through keyset");
        Set<String> countries = populations.keySet();
        for (String country : countries) {
            Integer population = populations.get(country);
            System.out.println("Country:" + country + " Population: " + population);
        }

        System.out.println("Loop with iterator");
        Iterator<String> iterator = countries.iterator();
        while(iterator.hasNext()) {
            String country = iterator.next();
            Integer population = populations.get(country);
            System.out.println("Country:" + country + " Population: " + population);
        }

        System.out.println("Loop with entries");
        Set<Map.Entry<String, Integer>> entries = populations.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String country = entry.getKey();
            Integer population = entry.getValue();
            System.out.println("Country:" + country + " Population: " + population);
        }

        // arama
        boolean turkiyeExists = populations.containsKey("Türkiye");

        boolean populationExists = populations.containsValue(500000);

        // silme

        System.out.println("Silmeden önce");
        System.out.println(programmingLanguages);
        programmingLanguages.remove("Java");
        System.out.println("Sonra");
        System.out.println(programmingLanguages);

        // replace

        // populations.replace("Türkiye", 1000000000); -> error
        programmingLanguages.replace("Python", 2014);

        // tamamen temizleme
        programmingLanguages.clear();

//        ### LinkedHashMap LinkedHashMap, HashMap'in ekleme sırasını (veya erişim sırasını) koruyan bir versiyonudur.

//        ### TreeMap TreeMap, anahtarları doğal sırayla (veya belirtilen Comparator'a göre) düzenleyen bir Map uygulamasıdır.

//        ### Hashtable Hashtable, HashMap'e benzer ancak senkronize edilmiştir (thread-safe). Ayrıca, null anahtarlara ve değerlere izin vermez.


    }

}


























