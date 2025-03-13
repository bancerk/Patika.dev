package CanliDers1.stringvsbuildervsbuffer;

public class StringBuilderExample {

    public static void main(String[] args) {
        // StringBuilder oluşturma
        StringBuilder sb = new StringBuilder("Merhaba");

// Ekleme (append)
        sb.append(" Dünya");
        System.out.println(sb); // Çıktı: Merhaba Dünya

// Araya ekleme (insert)
        sb.insert(7, " Güzel");
        System.out.println(sb); // Çıktı: Merhaba Güzel Dünya

// Silme (delete)
        sb.delete(7, 13); // "Güzel" kelimesini sil
        System.out.println(sb); // Çıktı: Merhaba Dünya

// Karakter değiştirme (setCharAt)
        sb.setCharAt(0, 'm');
        System.out.println(sb); // Çıktı: merhaba Dünya

// Ters çevirme (reverse)
        sb.reverse();
        System.out.println(sb); // Çıktı: aynüD abahrem

// String'e dönüştürme
        String result = sb.toString();
    }

}
