package Odev2;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı Giriniz : ");
        int byear = scanner.nextInt();

        String zodsign = switch (byear % 12) {

        case 0-> "Maymun";

        case 1-> "Horoz";

        case 2-> "Köpek";

        case 3-> "Domuz";

        case 4-> "Fare";

        case 5-> "Öküz";

        case 6-> "Kaplan";

        case 7-> "Tavşan";

        case 8-> "Ejderha";

        case 9-> "Yılan";

        case 10-> "At";

        case 11-> "Koyun";

        default -> "Geçersiz";
        };

        System.out.println("Çin Zodyağı Burcunuz : " + zodsign);


        scanner.close();

    }

}
