package Odevler;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayısını girin: ");

        int n = scanner.nextInt();

        // örneğe göre her satırda 2n-1 adet yıldız bulunuyor
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) { // Yıldızları basan iç döngü
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
