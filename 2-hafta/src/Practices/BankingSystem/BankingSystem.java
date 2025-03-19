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
            printMenu();

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    createBankAccount(scanner);
                    break;
                case 2:
                    customers[0].listAccounts();
                    break;
                case 3:
                    customers[0].listAccounts();
                    System.out.println("İşlem yapmak istediğiniz hesabı seçiniz: ");
                    int selectedIndex = scanner.nextInt();
                    BankAccount selectedBankAccount = customers[0].getBankAccounts()[selectedIndex];
                    int subChoice;
                    do {
                        System.out.println("--- " + selectedBankAccount.getAccountNumber() + " hesabı için işlem yapıyorsunuz.");
                        System.out.println("1- Bakiye görüntüle");
                        System.out.println("2- Para Yatır");
                        System.out.println("3- Para Çek");
                        System.out.println("4- Ana Menüye Dön");
                        subChoice = scanner.nextInt();

                        switch (subChoice){
                            case 1:
                                System.out.println(selectedBankAccount.getAccountNumber() + ": " + selectedBankAccount.getBalance() + " " + selectedBankAccount.getCurrencyType().getSymbol());
                                selectedBankAccount.getBalance();
                                break;
                            case 2:
                                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                                double amount = scanner.nextDouble();
                                selectedBankAccount.deposit(amount);
                                break;
                            case 3:
                                System.out.println("Çekmek istediğinizi miktarı giriniz: ");
                                double drawAmount = scanner.nextDouble();
                                selectedBankAccount.withdraw(drawAmount);
                                break;
                            case 4:
                                System.out.println("Ana menüye aktarılıyorsunuz...");
                                break;
                            default:
                                System.out.println("Yanlış seçim yaptınız!");
                        }

                    }while(subChoice != 4);
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim yaptınız!");
            }

        }while (choice != 0);
        System.out.println("Bankamızı seçtiğiniz için teşekkürler !");
    }

    private static void printMenu() {
        System.out.println("------Bankacılık işlemleri------");
        System.out.println("1-Yeni Hesap Aç");
        System.out.println("2-Hesaplarını Listele");
        System.out.println("3-Hesap Seç ve İşlem Yap");
        System.out.println("4-Çıkış Yap");
        System.out.println("Seçiminizi Yapın: ");
    }

    private static void createBankAccount(Scanner scanner) {
        System.out.print("Başlangıç bakiyesi girin: ");
        double amount = scanner.nextDouble();
        System.out.print("Para birimi seçiniz: 1 - TL |2 - Dolar | 3 - Euro | 4 - Altın :");
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

        customers[0].addAccount(bankAccount);
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
