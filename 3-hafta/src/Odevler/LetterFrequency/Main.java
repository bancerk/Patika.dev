package Odevler.LetterFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner tanımlıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");

        // Kullanıcının girdiği kelimeyi alıyoruz
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase(); // Büyük/küçük harf farkını ortadan kaldırmak için küçük harfe çeviriyoruz

        // Harflerin frekanslarını tutmak için bir HashMap oluşturuyoruz
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();

        // Girilen kelimenin her karakterini geziyoruz
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            // Sadece harf olan karakterleri işleme alıyoruz
            if (Character.isLetter(currentChar)) {
                // Harfin map içinde olup olmadığına bakıyoruz ve varsa değerini 1 arttırıyoruz, yoksa 0’dan başlatıyoruz
                letterFrequencyMap.put(currentChar, letterFrequencyMap.getOrDefault(currentChar, 0) + 1);
            }
        }

        // Map içindeki tüm harfleri ve frekanslarını ekrana yazdırıyoruz
        for (Map.Entry<Character, Integer> entry : letterFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Scanner’ı kapatıyoruz
        scanner.close();
    }

}
