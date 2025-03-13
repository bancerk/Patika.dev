package CanliDers1.scope;

public class Scope {

//    ### 1. Blok Scope (Blok Kapsamı)
//    Süslü parantezler `{}` içerisinde tanımlanan değişkenler sadece o blok içerisinde erişilebilirdir:

    public void birMetot() {
        // blok başlangıcı
        int x = 10; // x burada tanımlandı

        if (x > 5) {
            int y = 20;
            System.out.println(x + y); // Çalışır: x ve y erişilebilir
        }

        // System.out.println(y); // Hata: y değişkeni bu kapsamda tanımlı değil
        // blok sonu
    }

//    ### 2. Metot Scope (Metot Kapsamı)
//    Metot parametreleri ve metot içinde tanımlanan değişkenler sadece o metot içerisinde erişilebilirdir:

    public void metot1(int parametre) { // parametre metot kapsamındadır
        int deger = 100; // deger metot kapsamındadır

        // Bu değişkenlere sadece bu metot içinde erişilebilir
    }

    public void metot2() {
        // System.out.println(parametre); // Hata: parametre bu metotta tanımlı değil
        // System.out.println(deger);     // Hata: deger bu metotta tanımlı değil
    }

}
