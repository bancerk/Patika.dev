package odevler.birbirineEnYakinIkiSayiyiBulma;

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

        // Küçükten büyüğe sıralamak için TreeSet kullanıyoruz
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        // Listedeki tüm elemanları TreeSet'e aktarıyoruz (otomatik sıralı şekilde tutulur)
        integerTreeSet.addAll(integers);

        // TreeSet’in sıralı halini ekrana yazdırıyoruz
        System.out.println("Tree Set: " + integerTreeSet);

        // Minimum farkı tutacak değişken (başlangıç için yüksek bir değer veriyoruz)
        int minDiff = 100;

        int current;          // Şu anki eleman
        int previous = 0;     // Bir önceki eleman (başlangıçta 0)
        int minCurrent = 0;   // En küçük fark bulunan anın current değeri
        int minPrevious = 0;  // En küçük fark bulunan anın previous değeri

        // TreeSet üzerinde gezerek ardışık elemanlar arasındaki farkları kontrol ediyoruz
        for (int i : integerTreeSet) {
            current = i; // Şu anki elemanı alıyoruz
            int diff = current - previous; // Şu anki ve önceki eleman arasındaki farkı hesaplıyoruz

            // Eğer mevcut fark daha önceki minimum farktan küçükse güncelliyoruz
            if (previous != 0 && diff < minDiff) {
                minDiff = diff;
                minCurrent = current;
                minPrevious = previous;
            }
            // current artık bir sonraki turda previous olacak
            previous = current;
        }

        // En yakın iki sayıyı ve aralarındaki farkı ekrana yazdırıyoruz
        System.out.println("Birbirine en yakın iki sayı: " + minPrevious + " ve " + minCurrent);
        System.out.println("Aralarındaki fark: " + minDiff);
    }
}


/*
Integer veri tipinde bir ArrayList oluşturunuz
ve içerisine 10 adet benzersiz ve pozitif eleman ekleyiniz.
Bu listteki elemanlardan birbirine en yakın iki elamanı veren kodu yazınız.
*/