package canliDers1;

public class Degisken {

    /* primitive data types - temel veri türleri

    byte // sayısal veri tutar 8 bit'e kadar -128 ile +127 arasında

    short // 16 bit -32768 ile +32767 arasında değer tutar

    int // 32 bit -2^31'den +2^31-1'e kadar değer tutar

    long // 64 bit tamsayı, bankacılık, veritabanı, büyük veri için

    float // ondalıklı sayılar 32 bit

    double // ondalıklı sayılar 64 bit

    char // tek bir karakter değeri tutabilir

    boolean // sadece true-false alabilir

    */

    byte x = 8;

    short y = 16;

    static int z = 1566;

    long l = 100_000_000;

    double d = 3.14;

    char a = 'a';

    boolean b = false;

    // reference data types - karmaşık veri türleri

    String s = "ben bir stringim";

    // Değişken isimleri sayı ile başlayamaz, küçük-büyük harf duyarlıdır

    String S = "asdf";

    // Değişkenler küçük harf ile başlaması doğru kabul edilir, camelCase kullanılabilir

    // Sınıflar büyük harf ile başlar

    static final double PI = 3.14;

    public static void main(String[] args) {
        z = 16;
        // PI = 3; hata verecektir çünkü final (değiştirilemez değerdir)
        // Sabitlerde isimlendirme kuralları vardır, örn: PI_SAYISI gibi
    }

}
