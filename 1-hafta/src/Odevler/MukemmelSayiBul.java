package Odevler;

import java.util.Scanner;

public class MukemmelSayiBul {

    public static void main(String[] args) {

        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        // kendisine eşit olan sayıya "mükemmel sayı" denir.

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num1 = scanner.nextInt();

        int sum = 0; // Bölenlerin toplamını saklayan değişken

        // Sayının kendisi hariç bölenlerini bulmak için döngü
        for (int x = 1; x <= num1 / 2; x++) {
            if (num1 % x == 0) { // Eğer x, num1'in bir böleni ise
                sum += x; // Böleni toplama ekle
            }
        }

        // Mükemmel sayı kontrolü
        if (sum == num1 && num1 > 0) {
            System.out.println(num1 + " mükemmel sayıdır.");
        } else {
            System.out.println(num1 + " mükemmel sayı değildir.");
        }

        // Scanner nesnesini kapatıyoruz (Kaynak sızıntısını önlemek için)
        scanner.close();
    }
}
