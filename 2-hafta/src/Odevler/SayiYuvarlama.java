package Odevler;

import java.util.Scanner;

public class SayiYuvarlama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir ondalık sayı giriniz: ");

        double userInput = scanner.nextDouble();

        System.out.println("Aşağı Yuvarlama: " + (int) Math.floor(userInput));

        System.out.println("Yukarı yuvarlama: " + (int) Math.ceil(userInput));

        System.out.println("En Yakın Tam Sayı: " + Math.round(userInput));

    }
}

/* Input: 5.7

Output:

Aşağı Yuvarlama: 5

Yukarı Yuvarlama: 6

En Yakın Tam Sayı: 6

 */