package Odevler;

import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl bilgisi alınıyor
        System.out.print("Yıl Giriniz : ");
        int year = scanner.nextInt();

        // Artık yıl hesaplama algoritması
        if (year % 400 == 0) {
            // 400'e tam bölünen yıllar artık yıldır
            System.out.println(year + " bir artık yıldır !");
        } else if (year % 100 == 0) {
            // 100'e tam bölünüp 400'e bölünemeyen yıllar artık yıl değildir
            System.out.println(year + " bir artık yıl değildir!");
        } else if (year % 4 == 0) {
            // 4'e tam bölünebilen ancak 100'e tam bölünemeyen yıllar artık yıldır
            System.out.println(year + " bir artık yıldır !");
        } else {
            // Yukarıdaki koşulları sağlamayan yıllar artık yıl değildir
            System.out.println(year + " bir artık yıl değildir!");
        }

        // Scanner nesnesi kapatılıyor (kaynak sızıntısını önlemek için)
        scanner.close();
    }
}


// Doğru sonuç için if koşullarındaki bölenler büyükten küçüğe sıralanmalı