package localization;

import localization.exceptions.ExceptionMessages;
import localization.exceptions.InsufficientBalanceException;

import java.util.Locale;
import java.util.ResourceBundle;

public class BankAccount {

    private double balance;
    private ResourceBundle resourceBundle;

    public BankAccount(double balance, ResourceBundle resourceBundle) {
        this.balance = balance;
        this.resourceBundle = resourceBundle;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(resourceBundle.getString(ExceptionMessages.INVALID_BALANCE));
        }

        balance -= amount;
        System.out.println("Başarı ile " + amount + " TL çekildi. Kalan bakiye: " + balance);
    }
}
