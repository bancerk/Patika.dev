package canliDers2;

import java.util.Scanner;

public class CarRentalSystemMethodSeperate {

    public static void main(String[] args) {

        // menü karşılasın
        // menüde seçenekler olsun
        // bu seçenekler 1. araç ekleme 2. araç kiralama 3. araç iade 4. araç listeleme 5. çıkış
        // komut satırından bilgi alınacak
        // çıkış seçeneği seçilmediği sürece uygulama çalışmaya devam edecek

        System.out.println("Araç Kiralama Sistemine Hoşgeldiniz");

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        String[] cars = new String[10];

        while (running) {

            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addCar(scanner, cars);
                    break;
                case 2:
                    rentCar(cars, scanner);
                    break;

                case 3:
                    returnCar(scanner, cars);

                case 4:
                    listCars(cars);
                    break;
                case 5:
                    running = false;
                    break;
            }

        }
    }

    private static void listCars(String[] cars) {
        for (String car : cars) {
            if (car != null) {
                System.out.println(car + " plakalı araç sistemde kayıtlı");
            }
        }
        System.out.println("Sistemdeki araçlar listelendi");
    }

    private static void returnCar(Scanner scanner, String[] cars) {
        System.out.println("İade etmek istediğiniz aracın plakasını yazınız");
        String plaka = scanner.nextLine();

        for (int i = 0; i < cars.length; i++) {

            if (cars[i] == null) {
                cars[i] = plaka;
                break;
            }
        }
    }

    private static void rentCar(String[] cars, Scanner scanner) {
        System.out.println("Müsait Araçlar");
        String kiralananArac = "";

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println((i + 1) + ": " + cars[i]);
            }
        }
        int secim = scanner.nextInt();
        scanner.nextLine();
        System.out.println(cars[secim - 1] + " aracı başarıyla kiralandı");
        cars[secim - 1] = null;
    }

    private static void addCar(Scanner scanner, String[] cars) {
        System.out.println("Araç Plakası giriniz");
        String plate = scanner.nextLine();

        for (int i = 0; i < cars.length; i++) {

            if (cars[i] == null) {
                cars[i] = plate;
                break;
            }
        }
        System.out.println("Araç başarıyla listeye eklendi.");
    }

    private static void printMenu() {
        System.out.println("\nYapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1. Araç Ekleme");
        System.out.println("2. Araç Kiralama");
        System.out.println("3. Araç İade");
        System.out.println("4. Araç Listeleme");
        System.out.println("5. Çıkış");
    }
}