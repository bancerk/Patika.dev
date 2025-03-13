package CanliDers2.singleton;

public class BasicSingleton {
    // Sınıfın tek örneğini tutacak statik değişken
    private static BasicSingleton instance;

    // Private constructor ile dışarıdan örnek oluşturulmasını engelleme
    private BasicSingleton() {
        System.out.println("BasicSingleton örneği oluşturuldu.");
    }

    // Singleton örneğini almak için statik metot
    public static BasicSingleton getInstance() {
        // Eğer örnek henüz oluşturulmadıysa oluştur
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    // Örnek bir metot
    public void showMessage() {
        System.out.println("Merhaba Singleton Dünyası!");
    }
}
