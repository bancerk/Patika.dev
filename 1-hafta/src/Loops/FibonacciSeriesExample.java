package Loops;

import java.util.Scanner;

public class FibonacciSeriesExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = scanner.nextInt();

        if(number <1){
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        while (num2 <= number) {
            System.out.println("," + num2);
            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
        }

    }
}
