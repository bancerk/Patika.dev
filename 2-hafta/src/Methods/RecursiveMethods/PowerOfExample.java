package Methods.RecursiveMethods;

import java.util.Scanner;

public class PowerOfExample {

    public static void main(String[] args) {

        // recursive üs alma

        // 2^3 -> 2*2*2=8

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değeri giriniz: ");
        int base = scanner.nextInt();

        System.out.println("Üs değerini giriniz: ");
        int power = scanner.nextInt();

        int result = power(base,power);

        System.out.println(base + " ^ " + power + " = " + result);

    }

    private static int power(int base, int power){
        if (power == 0) return 1;
        return base * power(base,power-1);
    }

}
