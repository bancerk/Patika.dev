package odevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya şifre belirlemesi için mesaj göster
        System.out.println("Şifrenizi belirleyiniz: ");

        // Kullanıcının girdiği şifreyi oku
        String userpw = scanner.nextLine();

        // Şifre uzunluğu 8 karakterden az ise, şifre geçersizdir
        if (userpw.length() < 8) {
            System.out.println("Geçersiz Şifre");
        }
        // Şifre içinde boşluk karakteri varsa, şifre geçersizdir
        else if (userpw.contains(" ")) {
            System.out.println("Geçersiz Şifre");
        }
        // Şifrenin ilk karakteri küçük harf ise, şifre geçersizdir
        else if (Character.isLowerCase(userpw.charAt(0))) {
            System.out.println("Geçersiz Şifre");
        }
        // Şifre soru işareti '?' ile bitmiyorsa, şifre geçersizdir
        else if (!userpw.endsWith("?")) {
            System.out.println("Geçersiz Şifre");
        }
        // Yukarıdaki şartların hiçbiri sağlanmıyorsa, şifre geçerlidir
        else {
            System.out.println("Geçerli Şifre");
        }

        // Scanner nesnesini kapatarak kaynakları serbest bırak
        scanner.close();
    }
}