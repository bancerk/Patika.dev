package CanliDers2.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // getInstance() metodu ile singleton örneğini al

        BasicSingleton singleton = BasicSingleton.getInstance();

        // Metodu çağır
        singleton.showMessage();

        // İkinci bir referans oluştur ve aynı örnek olduğunu kontrol et
        BasicSingleton anotherReference = BasicSingleton.getInstance();
        System.out.println("İki referans aynı mı: " + (singleton == anotherReference));
        System.out.println("İki nesne aynı mı: " + (singleton.equals(anotherReference)));
    }
}
