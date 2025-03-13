package CanliDers2.accessModifiers.publicAccessModifier.package1;

// Sınıf tanimlamalarinda sadece public ve dafault erişim belirleyicileri kullanılabilir.
// public sınıflar import edilerek her yerden erişilebilir iken default erişim belirticisine sahip sınıflar sadece aynı paketten erişilebilir
public class Matematik {
    public static final double PI = 3.14159; // public sabit

    public static int topla(int a, int b) { // public metot
        return a + b;
    }
}
