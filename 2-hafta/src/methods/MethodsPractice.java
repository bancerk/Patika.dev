package methods;

import java.util.Scanner;

public class MethodsPractice {

    public static void main(String[] args) {


    /* Palindrom sayılar

    121 -> 121 palindrom
    123 -> 321 palindrom değil
    1221 -> 1221 palindrom

     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);

        if(isPalindromNumber){
            System.out.println(number + " bir palindrom sayıdır.");
        }else
            System.out.println(number + " bir palindrom değildir.");

    }

    private static boolean isPalindrom(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while (number>0){
            int digit = number % 10;
            reversedNumber = (reversedNumber*10) + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

}
