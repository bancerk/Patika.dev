package week2.session1.scope;

public class StaticScope {

    private static int sayac = 0; // Tüm nesneler için ortak
    private int id;

    public StaticScope() {
        sayac++;
        this.id = sayac;
    }

    public static void statikMetot() {
        System.out.println(sayac); // Static değişkene erişebilir
        // System.out.println(id); // Hata: static olmayan değişkene erişemez
    }

    public void normalMetot() {
        System.out.println(sayac); // Static değişkene erişebilir
        System.out.println(id);    // Instance değişkene erişebilir
    }

}
