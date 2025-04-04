package odevler;

import java.util.Scanner;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {

        // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matrisin satır sayısını alıyoruz.
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Kullanıcıdan matrisin sütun sayısını alıyoruz.
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Girilen boyutlarda bir matris tanımlanıyor.
        int[][] matrix = new int[rows][cols];

        // Kullanıcıdan matrisin elemanlarını alıyoruz.
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Her elemanın konumunu belirterek kullanıcıdan değeri alıyoruz.
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Girilen matrisi ekrana yazdırıyoruz.
        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // Her satırın sonunda alt satıra geçiyoruz.
            System.out.println();
        }

        // Matrisin transpozesini ekrana yazdırıyoruz.
        System.out.println("Transposed matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Orijinal matrisin [i][j] elemanı, transpoze matrisin [j][i] elemanı olur.
                System.out.print(matrix[j][i] + " ");
            }
            // Her satırın sonunda alt satıra geçiyoruz.
            System.out.println();
        }

        // Scanner nesnesi kapatılarak kaynak sızıntısı önleniyor.
        scanner.close();
    }
}
