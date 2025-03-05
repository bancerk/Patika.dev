package CanliDers1;

public class Operators {

    public static void main(String[] args) {

    int sayi1 = 10;
    int sayi2 = 20;
    int bolen = 3;
    int sayi3 = 20;

    int toplam = sayi1 + sayi2;

    int fark = sayi2 - sayi1;

    int carpim = sayi1 * sayi2;

    int bolme = sayi2 / sayi1; // bölünen bölenden küçük ise değişkenler double olmalı yoksa sonucu 0 verir


        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Carpim: " + carpim);
        System.out.println("Bolme: " + bolme);

        sayi1 = sayi1 + 5;
        sayi1 += 5;

        sayi1 -= 2;
        sayi1 *= 4;

        sayi1 = sayi1 / 2;
        sayi1 /= 2;

        sayi1 = sayi1 % 4;
        sayi1 %= 4;

        int mod = sayi3 % bolen;
        System.out.println("Kalan: " + mod);

        boolean sonuc = sayi1 == sayi3;
        boolean sonuc2 = sayi1 < sayi3;
        boolean sonuc3 = sayi1 > sayi3;
        boolean sonuc4 = sayi1 >= sayi3;
        boolean sonuc5 = sayi1 <= sayi3;
        boolean sonuc6 = sayi1 != sayi3;


        //mantıksal operatorler

        //iki boolean tipi veriyi AND ve OR işlemine tabi tutarlar

        // true AND true => true
        // true AND false => false
        // true OR false => true

        boolean sonuc8 = sonuc && sonuc2; // AND op

        boolean sonuc9 = sonuc || sonuc2; // OR op

        // kısa operatorler

        int a = 5;

        int b = a++; // a'yı bir arttırır ve b'ye atama yapar, lakin b ile a artmış değere sahip olur ve eşittirler

        int c = ++a; // a'yı bir arttırır ve c'ye atama yapar, lakin c'nın değeri sabit kalır


    }
}
