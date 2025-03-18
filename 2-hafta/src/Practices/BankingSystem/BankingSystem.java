package Practices.BankingSystem;

import java.util.Scanner;

public class BankingSystem {

    private static Customer[] customers = new Customer[10];

    public static void main(String[] args) {

        Customer customer = new Customer("Elif","Ak","12345678","12345678911");

        customers[0] = customer;
        menu();
    }

    private static void menu (){

        Scanner scanner = new Scanner(System.in);

        validatePassword(scanner);

        int choice;

        do {
            System.out.println("------Bankacılık işlemleri------");
            System.out.println("1-Yeni Hesap Aç");
            System.out.println("2-Hesaplarını Listele");
            System.out.println("3-Hesap Seç ve İşlem Yap");
            System.out.println("4-Çıkış Yap");
            System.out.println("Seçiminizi Yapın: ");

            choice = scanner.nextInt();

            switch (choice){
                case 1:

                    System.out.print("Başlangıç bakiyesi girin: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Para birimi seçiniz: 1 - TL |2 - Dolar | 3 - Euro | 4 - Altın");
                    int currencyChoice = scanner.nextInt();

                    CurrencyType currencyType = switch (currencyChoice){
                        case 1 -> CurrencyType.TL;
                        case 2 -> CurrencyType.DOLAR;
                        case 3 -> CurrencyType.EURO;
                        case 4 -> CurrencyType.GOLD;
                        default -> {
                            System.out.println("Geçersiz Seçim !");
                            yield CurrencyType.TL;
                        }
                    };

                    String customerName = customers[0].getName();
                    String accountNumber = customerName.charAt(0) + "-" + customerName.length() + currencyChoice;

                    BankAccount bankAccount = new BankAccount(accountNumber,amount,currencyType);

                    customers[0].getBankAccounts()[0]=bankAccount;

            }

        }while (choice != 0);
        System.out.println("Bankamızı seçtiğiniz için teşekkürler !");
    }

    private static void validatePassword(Scanner scanner) {

        System.out.println("Merhaba " + customers[0].getName());

        int wrongPasswordCounter = 0;

        do {

            System.out.println("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (!customers[0].getPassword().equals(password)) {
                System.out.println("Yanlış şifre girdiniz!");
                wrongPasswordCounter++;
            }else {
                System.out.println("Doğru şifre girdiniz. Bankacılık menüsüne aktarılıyorsunuz...");
                break;
            }
        }while (wrongPasswordCounter <3);
    }
}
