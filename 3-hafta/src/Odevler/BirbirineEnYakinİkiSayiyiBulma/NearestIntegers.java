package Odevler.BirbirineEnYakinİkiSayiyiBulma;

import java.util.*;

public class NearestIntegers {

    public static void main(String[] args) {

        // Sayıları saklamak için bir liste oluşturuluyor
        List<Integer> integers = new ArrayList<>();

        // Listeye örnek sayılar ekleniyor
        integers.add(54);
        integers.add(48);
        integers.add(64);
        integers.add(33);
        integers.add(72);
        integers.add(96);
        integers.add(12);
        integers.add(23);
        integers.add(7);
        integers.add(88);

        // küçükten büyüğe sıralamak için TreeSet’e çeviriyoruz
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        // Listedeki tüm elemanları TreeSet'e aktarıyoruz
        integerTreeSet.addAll(integers);

        System.out.println("Tree Set: " + integerTreeSet);


    }
}

/*
Integer veri tipinde bir ArrayList oluşturunuz
ve içerisine 10 adet benzersiz ve pozitif eleman ekleyiniz.
Bu listteki elemanlardan birbirine en yakın iki elamanı veren kodu yazınız.
*/