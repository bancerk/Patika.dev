package CanliDers2.nullConcept;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class BestPractices {

//    ### 1. Savunmacı Programlama


    // Parametre kontrolü
    public void islemYap(String veri) {
        if (veri == null) {
            throw new IllegalArgumentException("Veri null olamaz");
        }
        // İşlem devam eder
    }

    public static void main(String[] args) {


        // Zincir çağrılar için güvenli yöntem
        String metin = "asdf";
        int metinUzunluğu = (metin != null) ? metin.length() : 0;

        Object nesne = null;

//      ### 2. Java 7+ için Objects Sınıfı

        // Null kontrolü
//        Objects.requireNonNull(nesne, "Nesne null olamaz");

        // Eşitlik kontrolü
        Object nesne1 = new Object();
        Object nesne2 = null;
        boolean esitMi = Objects.equals(nesne1, nesne2); // null güvenli

//        ### 3. Java 8+ için Optional API
        // Optional kullanımı
        Optional<String> optional = Optional.ofNullable(metin);

// Değer varsa işlem yap
        optional.ifPresent(m -> System.out.println(m.toUpperCase()));

// Değer yoksa varsayılan değer kullan
        String deger = optional.orElse("Varsayılan");

// Değer yoksa hesaplanan değeri kullan
        String hesaplanan = optional.orElseGet(() -> hesaplaDeger());

// Değer yoksa istisna fırlat
        String zorunlu = optional.orElseThrow(() -> new NoSuchElementException());


//        ### 4. null ile İlgili Yaygın Hatalar

        int i = 5;
        int y = 5;

        if (i == y){}


        Object metin1 = new Object();
        Object metin2 = new Object();
        if (metin1.equals(metin2))

// Hatalı: String karşılaştırma
        if (metin == "değer") {  } // == yerine equals() kullanılmalı

// Hatalı: null kontrolü sırası
        if (metin.equals("değer")) {  } // NPE riski

// Doğru: null güvenli karşılaştırma
        if ("değer".equals(metin)) {  } // null-safe


//        ### 1. null Karşılaştırmaları

//        null değeri ile karşılaştırmalar için özel kurallar vardır:


// null == null her zaman true döner
        System.out.println(null == null); // true

// null ile instanceof operatörü her zaman false döner
        System.out.println("Acaba: " + (null instanceof Object)); // false

// Explicit olarak null kontrolü yapmak her zaman daha güvenlidir
        if (nesne == null) {  }

    }

    private static String hesaplaDeger() {
        return "hesaplanmış değer";
    }

}
