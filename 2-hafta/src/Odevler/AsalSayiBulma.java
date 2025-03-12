package Odevler;

import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girmesi isteniyor
        System.out.print("Sayı giriniz: ");
        int userNumber = scanner.nextInt();

        // isPrime() fonksiyonu kullanılarak sayının asal olup olmadığı kontrol ediliyor
        if (isPrime(userNumber, 2)) {
            System.out.println(userNumber + " sayısı ASALDIR !");
        } else {
            System.out.println(userNumber + " sayısı ASAL değildir !");
        }
    }

    // Rekürsif olarak sayının asal olup olmadığını kontrol eden metot
    // userNumber: kontrol edilecek sayı, bolen: kontrol edilen bölen
    private static boolean isPrime(int userNumber, int bolen) {

        // 2'den küçük sayılar asal değildir
        if (userNumber < 2) return false;

        // Eğer userNumber, şu anki bolene tam bölünüyorsa asal değildir
        if (userNumber % bolen == 0) return false;

        // Bolen değeri arttırılarak rekürsif çağrı yapılıyor
        return isPrime(userNumber, bolen + 1);
    }
}



/*Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo

Sayı Giriniz : 22
22 sayısı ASAL değildir !


Sayı Giriniz : 2
2 sayısı ASALDIR !


Sayı Giriniz : 39
39 sayısı ASAL değildir !


Sayı Giriniz : 17
17 sayısı ASALDIR !

 */