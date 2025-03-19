package CanliDers1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

    public static void main(String[] args) {

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

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java"); // Eklenmez (zaten var)
        System.out.println("Set of Programming languages: " + hashSet);

        // no get method

        // unordered
        Set<Integer> numbers = Set.of(1, 2, 5, 4, 12, 9, 7, 6);
        // numbers.add(99); Not allowed
        System.out.println("Hashset with unordered numbers");
        for (int number : numbers) {
            System.out.println("Number is:" + number);
        }

//        ### LinkedHashSet LinkedHashSet, HashSet'in ekleme sırasını koruyan bir versiyonudur.

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(90);

        System.out.println("LinkedHashset with insertion order");
        for (int number : linkedHashSet) {
            System.out.println("Number is:" + number);
        }

//        ### TreeSet TreeSet, elemanları doğal sırayla (veya belirtilen Comparator'a göre) düzenleyen bir Set uygulamasıdır

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println("Ordered tree set: " + treeSet);

//        ## Queue ve Deque Arayüzleri ### PriorityQueue araştırılabilir


    }
}
