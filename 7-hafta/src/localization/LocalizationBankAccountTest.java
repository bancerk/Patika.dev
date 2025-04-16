package localization;

import localization.exceptions.InsufficientBalanceException;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationBankAccountTest {

    public static void main(String[] args) throws InsufficientBalanceException {

        Locale trLocale = new Locale("tr","TR");
        Locale enLocale = Locale.ENGLISH;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",enLocale);

        BankAccount bankAccount = new BankAccount(100,resourceBundle);
        bankAccount.withdraw(150);
    }
}
