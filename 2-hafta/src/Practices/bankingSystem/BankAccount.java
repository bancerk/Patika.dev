package Practices.bankingSystem;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private CurrencyType currencyType;

    public BankAccount(String accountNumber, double balance, CurrencyType currencyType) {

        if(balance<0){
            System.out.println("Eksik bakiye ile hesap oluşturamazsınız!");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " " + currencyType.getSymbol() + " yatırıldı. Yeni bakiyeniz: " + balance + " " + currencyType.getSymbol());
        }else {
            System.out.println("Geçersiz tutar!");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " " + currencyType.getSymbol() + " çekildi. Yeni bakiyeniz: " + balance + currencyType.getSymbol());
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye!");
        }else {
            System.out.println("Geçersiz tutar!");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", currencyType=" + currencyType +
                '}';
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
