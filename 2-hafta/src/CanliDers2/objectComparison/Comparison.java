package CanliDers2.objectComparison;

import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {

    public static void main(String[] args) {

//        Primitive tipler (`int`, `float`, `boolean`, `char`, vb.) için `==` operatörü **değer karşılaştırması** yapar.

        int x = 5;
        int y = 5;
        System.out.println(x == y); // true (değer karşılaştırması)

//        ### Referans Tipler İçin ==

//        Referans tipleri (nesneler) için `==` operatörü,
//        iki değişkenin bellekte aynı nesneyi işaret edip etmediğini kontrol eder:

        String str1 = new String("Merhaba");
        String str2 = new String("Merhaba");
        System.out.println(str1 == str2); // false (farklı nesneler)


        String str3 = "Dünya";
        String str4 = "Dünya";
        System.out.println(str3 == str4); // true (String havuzunda aynı nesneyi işaret ederler)

//      Yukarıdaki ikinci örnekte `true` dönmesinin nedeni, Java'nın String havuzu (String pool) özelliğidir.
//      String literal olarak tanımlanan değişkenler, aynı değere sahipse havuzda aynı nesneyi işaret eder.


//        ## .equals() Metodu

//`.equals()` metodu, **içerik eşitliğini** kontrol etmek için tasarlanmıştır.
// Yani, nesnelerin içeriğinin eşit olup olmadığını kontrol eder.

        String str5 = new String("Merhaba");
        String str6 = new String("Merhaba");
        System.out.println("Equals kullanımı: " + str5.equals(str6)); // true (içerikleri aynı)

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(list1.equals(list2)); // true (içerikleri aynı)


        String a = "Merhaba";
        String b = "Mer" + "haba";
        String c = new String("Merhaba");

        System.out.println(a == b);       // true (String havuzunda aynı nesne)
        System.out.println(a == c);       // false (farklı nesneler)
        System.out.println(a.equals(b));  // true (aynı içerik)
        System.out.println(a.equals(c));  // true (aynı içerik)

    }

}
