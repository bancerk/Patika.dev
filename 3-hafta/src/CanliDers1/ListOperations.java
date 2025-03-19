package CanliDers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {

        // ### ArrayList

        // without generic
        List list = new ArrayList();

        // with generics
        List<String> names = new ArrayList<>();

        // Ekleme işlemi
        names.add("Ayşe"); // 0
        names.add("Mehmet"); // 1
        names.add("Ahmet"); // 2
        names.add("Mustafa");
        names.add("Hatice");
        names.add("Zeki");
        // aynı değer birden fazla eklenebilir
        names.add("Ayşe"); // 6
        names.add("Hatice");
        boolean successfulAddition = names.add("Fatma");

        System.out.println("Ekleme işlemlerinden sonra: " + names);

        // listeden eleman alma
        String first = names.get(0); // Ayşe
        String second = names.get(1); // Mehmet
        System.out.println("Listedeki ilk eleman:" + first);

        // silme işlemi
        names.remove("Mehmet");
        boolean successfulRemoval = names.remove("Ahmet");

        System.out.println("Silme işleminden sonra:" + names);

        // kontrol işlemi

        System.out.println("Listede Zeki var mı? " + names.contains("Zeki"));

        // eleman sayısı

        int size = names.size();
        System.out.println("listedeki eleman sayısı: " + size);

        // listeyi tamamen boşaltma
        // names.clear();

        // Değerleri baştan atayarak list tanımlama
        List<String> programmingLanguages = List.of("java", "python", "C");

        // programmingLanguages.add("asdfdsa"); // -> UnSupportedOperationException -> Immutable

        // indexOf
        int index = programmingLanguages.indexOf("java");
        System.out.println("Index of Java is: " + index);

        int indexOfZeki = names.indexOf("Zeki");
        System.out.println("Index of Zeki is: " +indexOfZeki);

        int indexOfAyse = names.indexOf("Ayşe");
        System.out.println("Index of Ayşe is: " +indexOfAyse);

        // loop lists

        // classic for loop
        for (int i=0; i < programmingLanguages.size(); i++) {
            String programmingLanguage = programmingLanguages.get(i);
            System.out.println(programmingLanguage);
        }

        // for each loop
        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }

        // sort işlemi
        Collections.sort(names);
        System.out.println("Alfabetik Sıralı isim Listesi: " + names);

        names.addAll(programmingLanguages);
        System.out.println("Combined lists: " + names);

        // ### LinkedList
        List<String> anotherList = new LinkedList<>();

        // ### Vector

        // ### Stack


/*

        // Temel işlemler
        boolean add(E e);
        boolean remove(Object o);
        boolean contains(Object o);
        int size();
        boolean isEmpty();
        void clear();

        // Toplu işlemler
        boolean addAll(Collection<? extends E> c);
        boolean removeAll(Collection<?> c);
        boolean retainAll(Collection<?> c); list1.retainAll(list2) only retain elements in list1 that are present in list2
        boolean containsAll(Collection<?> c);

        */


    }

}
