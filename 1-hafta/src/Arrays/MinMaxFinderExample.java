package Arrays;

import java.util.Scanner;

public class MinMaxFinderExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println(size + " adet sayı giriniz!");

        for (int i = 0; i < size; i++){
            System.out.println((i+1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];

        int max = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }

        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }

}
