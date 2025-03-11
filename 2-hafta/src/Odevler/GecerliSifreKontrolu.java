package Odevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifrenizi belirleyiniz: ");

        String userpw = scanner.nextLine();

        if (userpw.length() < 8){
            System.out.println("Geçersiz Şifre");
        }else if (userpw.contains(" ")) {
            System.out.println("Geçersiz Şifre");
        }else if (Character.isLowerCase(userpw.charAt(0))){
            System.out.println("Geçersiz Şifre");
        } else if (userpw.endsWith("?")) {
            System.out.println("Geçersiz Şifre");
        } else System.out.println("Geçerli Şifre");

        scanner.close();

    }

}
