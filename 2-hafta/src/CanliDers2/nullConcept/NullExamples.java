package CanliDers2.nullConcept;

import java.util.Optional;

public class NullExamples {

    static String mesaj; // Otomatik olarak null ile başlatılır
    String isim = null; // Geçerli - referans tipi
//    int sayi = null;    // Geçersiz - primitive tip null değer alamaz

    public static void yazdir() {
        System.out.println("Global atanmamış değişken: " + mesaj); // null yazdırır
    }

    public static void metot() {
        String yerelDegisken; // Başlatılmadı
//        System.out.println(yerelDegisken); // Derleme hatası

        yerelDegisken = null; // Şimdi geçerli
        System.out.println(yerelDegisken); // null yazdırır
    }

    public static void main(String[] args) {
        yazdir();
        // yerel değişkeni null yazdırma
        metot();

//        ### 2. NullPointerException (NPE)
        String metin = null;
        int uzunluk1 = metin.length(); // NullPointerException oluşur

//        ### 3. null Kontrolü

        // Klasik yöntem
        if (metin != null) {
            int uzunluk = metin.length();
        } else {
            System.out.println("Metin null");
        }

//        Java 8 ve sonrasında Optional sınıfı ile:
        Optional<String> optionalMetin = Optional.ofNullable(metin);
        optionalMetin.ifPresent(m -> System.out.println(m.length()));

    }
}
