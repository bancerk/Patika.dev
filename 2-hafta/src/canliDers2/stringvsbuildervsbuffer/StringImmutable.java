package canliDers2.stringvsbuildervsbuffer;

public class StringImmutable {

    // Immutable => Değiştirilemez

    public static void main(String[] args) {
        String str1 = "Merhaba";
        String str2 = new String("Dünya");

// Birleştirme (concatenation)
        String str3 = str1 + " " + str2;
        System.out.println(str3); // Çıktı: Merhaba Dünya

// Metotlar
        System.out.println(str3.length()); // Çıktı: 13
        System.out.println(str3.toUpperCase()); // Çıktı: MERHABA DÜNYA
        System.out.println(str3.substring(0, 7)); // Çıktı: Merhaba
        System.out.println(str3.replace("a", "e")); // Çıktı: Merhebe Dünye

// String değiştirilemez - yeni bir nesne oluşturulur
        str1 = str1 + " Dünya"; // str1 değişmez, yeni bir String nesnesi oluşturulur ve str1'e atanır
        System.out.println(str1); // Çıktı: Merhaba Dünya
    }

}
