package canliDers1.mathUtilities;

public class MathOperations {

    // Matematiksel sabitler
    double piSayisi = Math.PI;    // 3.141592653589793
    double eSayisi = Math.E;      // 2.718281828459045

//        ## Temel Matematiksel İşlemler


    // Mutlak değer (absolute value)
    int mutlakDeger = Math.abs(-50);    // 50
    double mutlakDeger2 = Math.abs(-25.7);  // 25.7

    // Minimum ve maksimum değerler
    int minDeger = Math.min(24, 42);    // 24
    double maxDeger = Math.max(8.6, 5.4);  // 8.6

    // Üs alma işlemi
    double us = Math.pow(2, 8);    // 2^8 = 256.0
    double us2 = Math.pow(5, 3);   // 5^3 = 125.0

    // Karekök hesaplama
    double karekok = Math.sqrt(64);    // 8.0
    double karekok2 = Math.sqrt(30);   // 5.477225575051661


//        ## Yuvarlama İşlemleri


    // Yukarı yuvarlama (ceiling)
    double yukariyuvarla = Math.ceil(7.2);    // 8.0
    double yukariyuvarla2 = Math.ceil(-3.8);  // -3.0

    // Aşağı yuvarlama (floor)
    double asagiyuvarla = Math.floor(7.8);    // 7.0
    double asagiyuvarla2 = Math.floor(-3.2);  // -4.0

    // En yakın tam sayıya yuvarlama (round)
    long yuvarla = Math.round(7.5);    // 8
    long yuvarla2 = Math.round(7.4);   // 7
    long yuvarla3 = Math.round(-3.7);  // -4

//        ## Logaritmik ve Üstel Fonksiyonlar


    // Logaritma hesaplamaları
    double logaritma = Math.log(10);      // Doğal logaritma (ln) = 2.302585...
    double log10 = Math.log10(100);       // 10 tabanında logaritma = 2.0
    double log2 = Math.log(8) / Math.log(2);  // 2 tabanında logaritma = 3.0

    // Üstel fonksiyonlar
    double exp = Math.exp(1);    // e^1 = 2.718281... (e sayısı)
    double exp2 = Math.exp(2);   // e^2 = 7.389056...


//        ## Trigonometrik Fonksiyonlar


    // Not: Açılar radyan cinsinden kullanılır
    double sin90 = Math.sin(Math.PI/2);    // Sin 90° = 1.0
    double cos60 = Math.cos(Math.PI/3);    // Cos 60° = 0.5
    double tan45 = Math.tan(Math.PI/4);    // Tan 45° = 1.0

    // Ters trigonometrik fonksiyonlar
    double arcsin = Math.asin(1);     // Arcsin 1 = π/2 radyan (90 derece)
    double arccos = Math.acos(0.5);   // Arccos 0.5 = π/3 radyan (60 derece)
    double arctan = Math.atan(1);     // Arctan 1 = π/4 radyan (45 derece)

    // Derece - Radyan dönüşümleri
    double radyan = Math.toRadians(180);  // 180 derece = π radyan
    double derece = Math.toDegrees(Math.PI);  // π radyan = 180 derece

//        ## Hiperbolik Fonksiyonlar


    // Hiperbolik fonksiyonlar
    double sinh = Math.sinh(1);    // Hiperbolik sinüs
    double cosh = Math.cosh(1);    // Hiperbolik kosinüs
    double tanh = Math.tanh(1);    // Hiperbolik tanjant

//        ## Rastgele Sayı Üretimi

    // 0.0 ile 1.0 arasında rastgele sayı
    double rastgele = Math.random();

    // 1 ile 100 arasında rastgele tam sayı
    int rastgeleTamSayi = (int)(Math.random() * 100) + 1;

    // Min ve Max arasında rastgele sayı üretme fonksiyonu
    public static int rasgeleSayi(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }


//        ## Diğer Kullanışlı Fonksiyonlar


    // Hipotenüs hesaplama (Pisagor teoremi)
    double hipotenus = Math.hypot(3, 4);    // sqrt(3² + 4²) = 5.0

    // İşaret fonksiyonu (signum)
    double isaret1 = Math.signum(-15.5);    // -1.0
    double isaret2 = Math.signum(42.0);     // 1.0
    double isaret3 = Math.signum(0);        // 0.0

    // Eksponansiyel ifadelerde kullanılan nextUp/nextDown
    double nextup = Math.nextUp(1.0);       // 1.0'dan sonraki temsil edilebilir sayı
    double nextdown = Math.nextDown(1.0);   // 1.0'dan önceki temsil edilebilir sayı
}
