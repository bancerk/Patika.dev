package temelPratikler;
import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armutkg = 2.14;
        double elmakg = 3.67;
        double domateskg = 1.11;
        double muzkg = 0.95;
        double patlicankg = 5.00;

        System.out.println("Armut Kaç Kilo ? :");
        double armut = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        double elma = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        double domates = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        double muz = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlican = scanner.nextDouble();

        double sum = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg);
        System.out.println("Toplam Tutar : " + sum + " TL");

        scanner.close();
    }
}
