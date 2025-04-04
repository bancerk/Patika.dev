package loops;

import java.util.Scanner;

public class LoopAndIfExample2 {

    public static void main(String[] args) {

        // 4! = 4 x 3 x 2 x 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktoriyel için bir sayı giriniz: ");

        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial = factorial *i;
        }

        System.out.println(number + "! = " + factorial);
    }
}
