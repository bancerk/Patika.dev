package canliDers2.deliveryTrackingApp;

import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);
    private static Service service = new Service();

    public static void main(String[] args) {

        boolean running = true;
        int choice;
        do{

            printMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    newDelivery();
                    break;
                case 2:
                    searchDelivery();
                    break;
                case 3:
                    deliverToAddress();
                    break;
                case 4:
                    changeDeliveryAddress();
                    break;
                case 5:
                    changeReceiver();
                    break;
                case 6:
                    cancelDelivery();
                    break;
                case 7:
                    running = false;
                default:
                    break;
            }

        }while(running);

        scanner.close();
    }

    private static void cancelDelivery() {
        System.out.println("İptal etmek istediğiniz kargo numarası: ");
        int deliveryId = scanner.nextInt();
        scanner.nextLine();
        boolean success = service.cancelDelivery(deliveryId);
        String message = success ? "Başarı ile iptal edildi" : "Kargo bulunamadı";
    }

    private static void changeReceiver() {
        System.out.println("Alıcı değiştirmek için kargo numarası giriniz:");
        int deliveryId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni Alıcı:");
        String receiver = scanner.nextLine();
        boolean success = service.changeReceiver(deliveryId, receiver);
        String message = success ? "Başarı ile işlem tamamlandı" : "Kargo bulunamadı";
        System.out.println(message + "\n\n");
    }

    private static void changeDeliveryAddress() {
        System.out.println("Adres değişikliği istediğiniz kargo numarası: ");
        int deliveryId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni adres bilgisi");
        String address = scanner.nextLine();
        boolean success = service.changeAddress(deliveryId, address);
        String message = success ? "Başarı ile işlem tamamlandı" : "Kargo bulunamadı";
        System.out.println(message + "\n\n");
    }

    private static void deliverToAddress() {
        System.out.println("Teslim etmek istediğiniz kargonun numarasını giriniz: ");
        int deliveryId = scanner.nextInt();;
        scanner.nextLine();
        service.deliverToAddress(deliveryId);
    }

    private static void searchDelivery() {
        System.out.println("Detaylarını görmek istediğiniz kargonun numarasını giriniz: ");
        int deliveryId = scanner.nextInt();
        scanner.nextLine();
        Delivery delivery = service.getDelivery(deliveryId);
        if (delivery == null) {
            System.out.println("Kargo bulunamadı\n\n");
        } else {
            System.out.println(delivery);
        }
    }

    private static void newDelivery() {
        System.out.println("Alıcı ismini giriniz: ");
        String receiver = scanner.nextLine();
        System.out.println("Gönderen ismi giriniz: ");
        String sender = scanner.nextLine();
        System.out.println("Teslimat adresi giriniz");
        String destination = scanner.nextLine();

        service.newDelivery(receiver, sender, destination);
        System.out.println("Kargo başarıyla kaydedildi\n\n");
    }

    private static void printMenu() {
        System.out.println("Kargo takip sistemine hoşgeldiniz");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1. Yeni Kargo ");
        System.out.println("2. Kargo Durumu ");
        System.out.println("3. Kargo Teslim ");
        System.out.println("4. Teslimat Adresi Değiştir ");
        System.out.println("5. Alıcı Değiştir ");
        System.out.println("6. Kargo iptal ");
        System.out.println("7. Çıkış ");
    }

}
