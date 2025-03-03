package Odev3;

import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");

        int year = scanner.nextInt();

        // double leapyear = 0.0

        if (year % 400 == 0) {
            System.out.println(year + " bir artık yıldır !");
        }

        else if (year % 100 == 0) {

                 System.out.println(year + " bir artık yıl değildir!");  
        }
        else if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        }
    
        else {System.out.println(year + " bir artık yıl değildir!");};

        scanner.close();
    }
}

// Doğru sonuç için if koşullarındaki bölenler büyükten küçüğe sıralanmalı