package odevler;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tamsayı giriniz: ");
        int tams1 = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz: ");
        double onda1 = scanner.nextDouble();

        System.out.println("Tamsayınızın ondalık karşılığı " + (double) tams1 + " idir.");
        System.out.println("Ondalık sayınızın tamsayı karşılığı " + (int) onda1 + " idir.");


    }
}
