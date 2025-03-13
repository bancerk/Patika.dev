package CanliDers2.classAndObjectConcepts;

public class ArabaTest {

    public static void main(String[] args) {
        // Araba sınıfından bir nesne oluşturma
        Araba kiralikAraba = new Araba();

        // Nesnenin özelliklerini ayarlama
        kiralikAraba.plaka = "70 KFL 17";
        kiralikAraba.marka = "Toyota";
        kiralikAraba.model = "Corolla";
        kiralikAraba.yil = 2022;
        kiralikAraba.renk = "Beyaz";

        System.out.println("Instance of:" + (kiralikAraba instanceof Araba));

        // Nesnenin davranışlarını çağırma
        kiralikAraba.bilgileriGoster();
        kiralikAraba.kirala("Bir Müşteri");

        // Parametreli Yapıcı Metod ile nesne oluşturma
        Araba kiralikBaskabirAraba =
                new Araba("70 MRM 31",
                        "VolksWagen",
                        "Golf 1.6 TDI",
                        2018, "Gri",
                        1.6);

        kiralikBaskabirAraba.bilgileriGoster();
        kiralikBaskabirAraba.kirala("Başka bir müşteri");
    }

}
