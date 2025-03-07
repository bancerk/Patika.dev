package Arrays;

import java.util.Scanner;

public class CountNumberArrayExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println(size + " adet sayı giriniz!");

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Aramak istediğiniz sayıyı giriniz: ");
        int number = scanner.nextInt();

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == number) {
                counter++;

                // counter = counter + 1;
                // counter += 1;
            }

        }

        System.out.println("Aradığın sayıdan " + counter + " adet vardır.");

    }
}
