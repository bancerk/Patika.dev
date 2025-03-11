package week2.session1.scope;

public class VariableShadowing {

    private int x = 10; // Sınıf değişkeni

    public void metot() {
        int x = 20; // Metot değişkeni, sınıf değişkenini gölgeler
        System.out.println(x); // 20 yazdırır
        // System.out.println(this.x); // 10 yazdırır (sınıf değişkenine erişim)

        if (true) {
            x = 30; // Blok değişkeni, metot değişkenini gölgeler
            System.out.println(x); // 30 yazdırır
        }

        System.out.println(x); // 30 yazdırır
    }

}
