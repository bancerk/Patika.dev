package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {

    public static void main(String[] args) {

        Locale trLocale = new Locale("tr","TR");
        Locale enLocale = Locale.ENGLISH;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",trLocale);
        System.out.println(resourceBundle.getString("hello"));
    }
}
