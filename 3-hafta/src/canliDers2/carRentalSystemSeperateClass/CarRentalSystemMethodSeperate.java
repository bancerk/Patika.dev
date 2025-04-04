package canliDers2.carRentalSystemSeperateClass;

import java.util.List;
import java.util.Scanner;

// @Controller

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

        Gallery gallery = new Gallery();


        while (running) {

            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addCar(scanner, gallery);
                    break;
                case 2:
                    rentCar(gallery, scanner);
                    break;
                case 3:
                    returnCar(scanner, gallery);
                    break;
                case 4:
                    listCar(gallery);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız");

            }

        }

    }

    private static void listCar(Gallery gallery) {
        for (Car car : gallery.getCars()) {
            if (car != null) {
                System.out.println(car.getPlate() +  " plakalı araç sistemde kayıtlı");
            }
        }
        System.out.println("Sistemdeki araçlar listelendi");
    }

    private static void returnCar(Scanner scanner, Gallery gallery) {
        System.out.println("İade etmek istediğiniz aracın plakasını yazınız");
        String plaka = scanner.nextLine();

        List<Car> cars = gallery.getCars();

        for (Car car :  cars) {
            if (car.getPlate().equals(plaka)) {
                gallery.returnCar(car);
            }
        }

        System.out.println("Araç İade işlemi başarıyla tamamlandı");
    }

    private static void rentCar(Gallery gallery, Scanner scanner) {
        System.out.println("Müsait Araçlar");
        int index = 1;
        List<Car> cars = gallery.getCars();
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println((index)+": " + car.getPlate());
            }
            index++;
        }

        int secim = scanner.nextInt();
        scanner.nextLine();
        gallery.rentCar(cars.get(secim -1));
        System.out.println(cars.get(secim -1) + " başarıyla kiralandı");
    }

    private static void addCar(Scanner scanner, Gallery gallery) {
        System.out.println("Araç Plakası Giriniz");
        String plate = scanner.nextLine();
        Car car = new Car();
        car.setPlate(plate);
        car.setRented(false);
        gallery.addCar(car);
        System.out.println("Araç Ekleme işlemi başarıyla tamamlandı");
    }

    public static void printMenu() {
        System.out.println("\nYapmak istediğiniz işlemi Seçiniz");
        System.out.println("1. Araç Ekleme");
        System.out.println("2. Araç Kiralama");
        System.out.println("3. Araç İade");
        System.out.println("4. Araç Listeleme");
        System.out.println("5. Çıkış");
    }

}