package exception.customException;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100);

        try {
            bankAccount.withdraw(150);
        } catch (InsufficientBalanceException e) {
            System.out.println("Hata: " + e.getMessage());
        }
        System.out.println("İşlemler devam ediyor");
    }
}