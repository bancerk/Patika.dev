package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookSetTest {

    public static void main(String[] args) {

        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("Clean Code","Robert C. Martin");
        Book book2 = new Book("Effective Java","Joshua Bloch");
        Book book3 = new Book("Clean Code -2","Robert C. Martin");
        Book book4 = new Book("Clean Code","Robert C. Martin");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        System.out.println(book1.hashCode()); // book1 ve book4 aynı hash koda sahip
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println("Kütüphanem: " + bookSet);
        System.out.println("Kütüphanem Size: " + bookSet.size());

        // size verisini hash koduna göre sayar. aynı objeden birden fazla girişi var ise tekrar saymaz


        // Kütüphanemizi TreeSet kullanarak sıralı hale getirelim

        System.out.println("------TreeSet------");

        Set<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);

        System.out.println("Kütüphanem (Sıralı): " + bookTreeSet);

        /*
        Tree setimiz henüz bu kompleks elemanları nasıl sıralaması gerektiğini bilmiyor

        Output:
        Exception in thread "Main" java.lang.ClassCastException: class Collections.Book cannot be cast to class java.lang.Comparable (Collections.Book is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1607)
	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:812)
	at java.base/java.util.TreeMap.put(TreeMap.java:821)
	at java.base/java.util.TreeMap.put(TreeMap.java:570)
	at java.base/java.util.TreeSet.add(TreeSet.java:261)
	at Collections.BookSetTest.Main(BookSetTest.java:39)

	Comparable hale getirmek için Book classımıza implement ediyoruz:

	"public class Book implements Comparable<Book>{}"

	ve CompareTo methodunu bu class içine ekliyoruz:

	"
	@Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    "

         */




    }
}
