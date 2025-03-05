package CanliDers1;

public class ControlMain {

    public static void main(String[] args) {

        int a = 10;

        if (false) {

            System.out.println("a sayısı 5'ten küçüktür");
        }else if (a == 5){
            System.out.println("a sayısı 5'tir");
        }else {
            System.out.println("a sayısı 5'ten büyüktür ya da eşittir");
        }

        if(a < 5) {
            if(a < 4) {}
        }

        if (a < 4 && a < 5) {}
        // ilk koşul false ise ikinciyi kontrol etmez ve parantez içini çalıştırmaz

        switch (a) {

            case 1:
                System.out.println("a sayısı 1'dir");
                break;
            case 2:
                System.out.println("a sayısı 2'dir");
                break;
            default:
                System.out.println("a sayısını tanıyamadım");
                break;
            // switch ile yapılan herşey if-else ile yapılabilir
        }

        //Ternary operator

        // üçlü koşul - if-else'in kısayoludur

        String sonuc = a > 5 ? "a 5'ten küçüktür" : "a 5'ten büyük veya 5'e eşittir";


        // aşağıdakileri hoca kurumsal hayatta hiç kullanıldığını görmemiş (çoğunlukla low level işlemlerde kullanılır)
        // AND OR operatorleri tek sembolle kullanıldığında bit layerda çalışır

        int x = 3; // 0011
        int y = 5; // 0101
        int z = x & y; // 0001
        int w = x| y; // 0111

        // sağa-sola bit kaydırma
        int v = y << 1; // v = 10
        int b = x >> 1; // b =

    }
}
