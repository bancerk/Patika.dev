package Loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean isTrue = 1 < 0;

        do {

            System.out.println("Bu döngü en az bir kere çalışır");

        } while (isTrue);


        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        boolean isPasswordFalse = true;

        int count = 0;

        do {
            System.out.println("Şifre giriniz: ");
            String input = scanner.nextLine();

            if (password.equals(input)){
                System.out.println("Doğru bir şifre girdiniz");
                // isPasswordFalse = false;
            } else {
                System.out.println("Yanlış bir şifre girdiniz");
                // isPasswordFalse = true;
                count++;
            }

        }while (count < 3);

        scanner.close();

    }
}

/*
Java While ve Do-While Arasındaki Farklar?

Java'da Do-While ve While döngüleri arasındaki tek fark,
Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir.
Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir.
While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.
 */