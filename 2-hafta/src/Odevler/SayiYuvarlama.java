package Odevler;

import java.util.Scanner;

public class SayiYuvarlama {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir ondalıklı sayı girmesini istiyoruz
        System.out.println("Bir ondalık sayı giriniz: ");

        // Kullanıcının girdiği ondalıklı sayı değişkene atanıyor
        double userInput = scanner.nextDouble();

        // Sayıyı aşağı yuvarlayarak ekrana yazdırıyoruz
        System.out.println("Aşağı Yuvarlama: " + (int) Math.floor(userInput));

        // Sayıyı yukarı yuvarlayarak ekrana yazdırıyoruz
        System.out.println("Yukarı yuvarlama: " + (int) Math.ceil(userInput));

        // Sayıyı en yakın tam sayıya yuvarlayarak ekrana yazdırıyoruz
        System.out.println("En Yakın Tam Sayı: " + Math.round(userInput));

    }
}


/* Input: 5.7

Output:

Aşağı Yuvarlama: 5

Yukarı Yuvarlama: 6

En Yakın Tam Sayı: 6

 */