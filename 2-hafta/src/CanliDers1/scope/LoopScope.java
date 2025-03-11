package week2.session1.scope;

public class LoopScope {

    public static void main(String[] args) {

        // Java 10 ve sonrası için for-loop scope
        for (int i = 0; i < 5; i++) {
            // i değişkeni sadece bu for döngüsü içinde erişilebilir
        }
        // System.out.println(i); // Hata: i bu kapsamda tanımlı değil

        // For-each loop scope
        String[] liste = {"eleman1", "eleman2", "eleman3"};
        for (String eleman : liste) {
            // eleman değişkeni sadece bu döngü içinde erişilebilir
        }
        // System.out.println(eleman); // Hata: eleman bu kapsamda tanımlı değil

    }

}
