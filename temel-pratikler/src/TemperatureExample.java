import java.util.Scanner;

public class TemperatureExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius cinsinden sıcaklık girin: ");

        double celsius = scanner.nextDouble();

        // F = (C * 1.8) + 32

        double f = (celsius * 1.8) + 32;

        System.out.println("C -> F : " + f);

        scanner.close();
    }
}
