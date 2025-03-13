package Methods.RecursiveMethods;

import java.util.Scanner;

public class DigitSumExample {
    public static void main(String[] args) {

        // Digit Sum example

        // 123 -> 1 + 2 + 3 = 6

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        int sum = sumOfDigits(number);

        System.out.println(number + " basamak toplamı = " + sum);

    }

    private static int sumOfDigits(int number){

        if(number == 0) return 0;

        return (number % 10) + sumOfDigits(number/10);
    }

}
