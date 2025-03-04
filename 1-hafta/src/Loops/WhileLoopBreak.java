package Loops;

import java.util.Scanner;

public class WhileLoopBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        while (true) {

            System.out.println("Şifreyi girin: ");

            String input = scanner.nextLine();

            if(password.equals(input)) {

                System.out.println("Doğru şifre girdiniz.");
                break; // gerekli şartı yakaladığımızda döngüyü durdurur

            }else {

                System.out.println("Yanlış şifre girdiniz.");
            }



        }
    }

}
