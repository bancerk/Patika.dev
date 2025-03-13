package CanliDers2.stringvsbuildervsbuffer;

public class StringBufferExample {

    public static void main(String[] args) {

        // StringBuffer oluşturma
        StringBuffer buffer = new StringBuffer("Merhaba");

// Ekleme (append)
        buffer.append(" Dünya");
        System.out.println(buffer); // Çıktı: Merhaba Dünya

// Araya ekleme (insert)
        buffer.insert(7, " Güzel");
        System.out.println(buffer); // Çıktı: Merhaba Güzel Dünya

// Silme (delete)
        buffer.delete(7, 13);
        System.out.println(buffer); // Çıktı: Merhaba Dünya

// Kapasite
        System.out.println("Kapasite: " + buffer.capacity()); // Varsayılan kapasite + string uzunluğu

// Uzunluk
        System.out.println("Uzunluk: " + buffer.length()); // Çıktı: 13

// Ters çevirme
        buffer.reverse();
        System.out.println(buffer); // Çıktı: aynüD abahreM


    }

}
