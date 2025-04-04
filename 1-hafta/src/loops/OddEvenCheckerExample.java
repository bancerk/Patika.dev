package loops;

import java.util.Scanner;

public class OddEvenCheckerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " bir çift sayıdır");
        }else {
            System.out.println(number + "bir tek sayıdır");
        }

    }

}
