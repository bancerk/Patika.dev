package TemelPratikler;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        double kilo = scanner.nextDouble();

        // Kilo (kg) / Boy(m) * Boy(m)

        double KitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + KitleEndeksi);

        scanner.close();

    }
}
