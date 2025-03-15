package Methods.RecursiveMethods;

import java.util.Scanner;

public class PowerOfExample {

    public static void main(String[] args) {

        // Recursive üs alma işlemi

        // Örnek: 2^3 -> 2 * 2 * 2 = 8

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban değerini girmesi isteniyor
        System.out.println("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        // Kullanıcıdan üs değerini girmesi isteniyor
        System.out.println("Üs değerini giriniz: ");
        int power = scanner.nextInt();

        // power() fonksiyonu çağrılarak üs alma işlemi gerçekleştiriliyor
        int result = power(base, power);

        // Sonuç ekrana yazdırılıyor
        System.out.println(base + " ^ " + power + " = " + result);

        // Scanner nesnesi kapatılıyor (kaynak sızıntısını önlemek için)
        scanner.close();
    }

    // Recursive üs alma metodu
    private static int power(int base, int power) {
        // Herhangi bir sayının 0. kuvveti 1'dir
        if (power == 0) return 1;

        // Recursive olarak üs alma işlemi yapılır
        return base * power(base, power - 1);
    }
}
