package odevler;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılını alıyoruz
        System.out.print("Doğum yılınızı Giriniz : ");
        int byear = scanner.nextInt();

        // Çin Zodyağı burcunu hesaplamak için switch-case yapısı kullanılıyor
        String zodsign = switch (byear % 12) {

            case 0-> "Maymun";   // Mod 12 sonucu 0 ise Maymun burcu
            case 1-> "Horoz";    // Mod 12 sonucu 1 ise Horoz burcu
            case 2-> "Köpek";    // Mod 12 sonucu 2 ise Köpek burcu
            case 3-> "Domuz";    // Mod 12 sonucu 3 ise Domuz burcu
            case 4-> "Fare";     // Mod 12 sonucu 4 ise Fare burcu
            case 5-> "Öküz";     // Mod 12 sonucu 5 ise Öküz burcu
            case 6-> "Kaplan";   // Mod 12 sonucu 6 ise Kaplan burcu
            case 7-> "Tavşan";   // Mod 12 sonucu 7 ise Tavşan burcu
            case 8-> "Ejderha";  // Mod 12 sonucu 8 ise Ejderha burcu
            case 9-> "Yılan";    // Mod 12 sonucu 9 ise Yılan burcu
            case 10-> "At";      // Mod 12 sonucu 10 ise At burcu
            case 11-> "Koyun";   // Mod 12 sonucu 11 ise Koyun burcu
            default -> "Geçersiz"; // Geçersiz durum (ihtimal dışı)
        };

        // Hesaplanan Çin Zodyağı burcunu ekrana yazdırıyoruz
        System.out.println("Çin Zodyağı Burcunuz : " + zodsign);

        // Scanner nesnesini kapatıyoruz (Kaynak sızıntısını önlemek için)
        scanner.close();
    }
}
