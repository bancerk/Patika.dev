package odevler.harfBulma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLetter {

    public static void main(String[] args) {

        // 4 elemanlı bir liste oluşturuluyor
        List<String> letters = new ArrayList<>(4);

        // Listeye başlangıç harfleri ekleniyor
        letters.add("h");
        letters.add("j");
        letters.add("k");
        letters.add("l");

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 4 kez harf girişi alınacak
        for (int i = 1; i <= 4; i++) {
            System.out.println("Listede aramak istediğiniz harf girişini yapınız: ");
            String userInput = scanner.nextLine();

            // Eğer girilen harf listede varsa:
            if (letters.contains(userInput)) {
                // Harf listeden kaldırılır ve yerine "found" eklenir
                letters.remove(userInput);
                letters.add("found");
            }
            // Eğer girilen harf listede yoksa:
            else if (!letters.contains(userInput)) {
                // Listeye yeni harf olarak eklenir
                letters.add(userInput);
            }
        }

        // Güncel liste yazdırılır
        System.out.println("Güncel liste: " + letters);

        scanner.close();
    }
}



/*
String veri tipinde 4 elemanlı bir ArrayList oluşturunuz ve içine rastgele harfler ekleyiniz.

Kullanıcıdan harf girişi alınız.

    Eğer harf listede varsa, ilgili elemanı "found" ile değiştiriniz.

    Eğer harf listede yoksa, listeye ekleyiniz.

Bu işlemi 4 kez tekrarlayınız (Kullanıcı 4 farklı harf girecek).

Program sonunda güncellenmiş listeyi ekrana yazdırınız.
 */