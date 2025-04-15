package exception.customException;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount>balance){
            throw new InsufficientBalanceException("Yetersiz bakiye");
        } // if bloku içinde throw olacağı ve programı sonlandıracağı için else blokuna ihtiyaç yok

        balance-=amount;
        System.out.println("Başarı ile " + amount + " TL çekildi. Kalan bakiye: " + balance);
    }
}
