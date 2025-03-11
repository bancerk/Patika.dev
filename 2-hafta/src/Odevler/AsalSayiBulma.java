package Odevler;

import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int userNumber = scanner.nextInt();

        if (isPrime(userNumber,2)){
            System.out.println(userNumber + " sayısı ASALDIR !");
        }else System.out.println(userNumber + " sayısı ASAL değildir !");

    }

    private static boolean isPrime (int userNumber, int bolen){

        if (userNumber <2) return false;

        if (userNumber % bolen == 0) return false;

        return isPrime(userNumber,bolen+1);
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