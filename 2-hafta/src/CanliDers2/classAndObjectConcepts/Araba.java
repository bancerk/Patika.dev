package CanliDers2.classAndObjectConcepts;

public class Araba {
    // Alanlar (özellikler)
    String plaka;
    public String marka;
    String model;
    int yil;
    String renk;
    double motorHacmi;
    public static final String KIRALAYAN_SIRKET = "Bir Oto Kiralama Şirketi";

    // Yapıcı metot (constructor) default constructor
    public Araba() {
        System.out.println("Yeni bir araba nesnesi oluşturuldu");
    }

    // Yapıcı metot (constructor)
    public Araba(String plaka, String marka, String model, int yil, String renk, double motorHacmi) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
        this.motorHacmi = motorHacmi;
    }

    // Metotlar (davranışlar)
    public void kirala(String kiralayan) {
        System.out.println(marka + " " + model + " araç "+ kiralayan + " kişisine kiralandı.");
    }

    public void bilgileriGoster() {
        System.out.println("Plaka:" + plaka);
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Renk: " + renk);
        System.out.println("Motor Hacmi: " + motorHacmi);
    }

}
